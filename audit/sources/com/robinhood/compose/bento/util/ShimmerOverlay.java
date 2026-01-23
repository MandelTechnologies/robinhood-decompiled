package com.robinhood.compose.bento.util;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ShimmerOverlay.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/ui/graphics/Color;", "shimmerColors", "", "shimmerDurationMillis", "Lkotlin/Function0;", "", "content", "ShimmerOverlay", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "shimmerProgress", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.util.ShimmerOverlayKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ShimmerOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShimmerOverlay$lambda$7(Modifier modifier, ImmutableList immutableList, int i, Function2 function2, int i2, int i3, Composer composer, int i4) {
        ShimmerOverlay(modifier, immutableList, i, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShimmerOverlay(Modifier modifier, ImmutableList<Color> immutableList, int i, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        ImmutableList<Color> immutableList2;
        int i5;
        final Modifier modifier3;
        final ImmutableList<Color> immutableListPersistentListOf;
        int i6;
        int i7;
        boolean z;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final ImmutableList<Color> immutableList3;
        final int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(545729328);
        int i9 = i3 & 1;
        if (i9 != 0) {
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
                immutableList2 = immutableList;
                int i10 = composerStartRestartGroup.changed(immutableList2) ? 32 : 16;
                i4 |= i10;
            } else {
                immutableList2 = immutableList;
            }
            i4 |= i10;
        } else {
            immutableList2 = immutableList;
        }
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) == 0) {
                        Color.Companion companion2 = Color.INSTANCE;
                        immutableListPersistentListOf = extensions2.persistentListOf(Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU()), Color.m6701boximpl(Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU()));
                        i4 &= -113;
                    } else {
                        immutableListPersistentListOf = immutableList2;
                    }
                    if (i11 == 0) {
                        i6 = 2000;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(545729328, i4, -1, "com.robinhood.compose.bento.util.ShimmerOverlay (ShimmerOverlay.kt:36)");
                    }
                    i7 = i4;
                    z = true;
                    snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), -1.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i6, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.util.ShimmerOverlayKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShimmerOverlay.ShimmerOverlay$lambda$2$lambda$1((GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifier3, (Function1) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                    if ((((i7 & 112) ^ 48) <= 32 || !composerStartRestartGroup.changed(immutableListPersistentListOf)) && (i7 & 48) != 32) {
                        z = false;
                    }
                    z2 = zChanged | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.util.ShimmerOverlayKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShimmerOverlay.ShimmerOverlay$lambda$5$lambda$4(immutableListPersistentListOf, snapshotState4AnimateFloat, (CacheDrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierGraphicsLayer, (Function1) objRememberedValue2);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawWithCache);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    immutableList3 = immutableListPersistentListOf;
                    i8 = i6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    modifier3 = modifier2;
                    immutableListPersistentListOf = immutableList2;
                }
                i6 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i7 = i4;
                z = true;
                snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), -1.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i6, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifier3, (Function1) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                if (((i7 & 112) ^ 48) <= 32) {
                    z = false;
                    z2 = zChanged2 | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.util.ShimmerOverlayKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShimmerOverlay.ShimmerOverlay$lambda$5$lambda$4(immutableListPersistentListOf, snapshotState4AnimateFloat, (CacheDrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierDrawWithCache2 = DrawModifierKt.drawWithCache(modifierGraphicsLayer2, (Function1) objRememberedValue2);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawWithCache2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            immutableList3 = immutableListPersistentListOf;
                            i8 = i6;
                        }
                    }
                } else {
                    z = false;
                    z2 = zChanged2 | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                immutableList3 = immutableList2;
                i8 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.util.ShimmerOverlayKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShimmerOverlay.ShimmerOverlay$lambda$7(modifier3, immutableList3, i8, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        i5 = i;
        if ((i3 & 8) == 0) {
        }
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if (i11 == 0) {
                    i6 = i5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i7 = i4;
                z = true;
                snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), -1.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i6, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer22 = GraphicsLayerModifier6.graphicsLayer(modifier3, (Function1) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged22 = composerStartRestartGroup.changed(snapshotState4AnimateFloat);
                if (((i7 & 112) ^ 48) <= 32) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShimmerOverlay$lambda$2$lambda$1(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo6762setCompositingStrategyaDBOjCE(GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult ShimmerOverlay$lambda$5$lambda$4(ImmutableList immutableList, SnapshotState4 snapshotState4, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)) * ShimmerOverlay$lambda$0(snapshotState4);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)) * ShimmerOverlay$lambda$0(snapshotState4);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        Brush.Companion companion = Brush.INSTANCE;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM6535constructorimpl >> 32)) + (Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)) / 2.0f);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L)) + (Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)) / 2.0f);
        final Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(companion, immutableList, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), 0, 8, (Object) null);
        return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.compose.bento.util.ShimmerOverlayKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShimmerOverlay.ShimmerOverlay$lambda$5$lambda$4$lambda$3(brushM6678linearGradientmHitzGk$default, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShimmerOverlay$lambda$5$lambda$4$lambda$3(Brush brush, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(onDrawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    private static final float ShimmerOverlay$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
