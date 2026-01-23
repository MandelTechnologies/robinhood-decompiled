package androidx.compose.material.pullrefresh;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.Colors2;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlay3;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Shadow3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContent2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a>\u0010 \u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010*\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#\"\u0014\u0010+\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\f\u0010/\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, m3636d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "scale", "", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "PullRefreshIndicator", ResourceTypes.COLOR, "CircularArrowIndicator-iJQMabo", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "CircularArrowIndicator", "", "progress", "Landroidx/compose/material/pullrefresh/ArrowValues;", "ArrowValues", "(F)Landroidx/compose/material/pullrefresh/ArrowValues;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Path;", SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, "Landroidx/compose/ui/geometry/Rect;", "bounds", "alpha", "values", "drawArrow-Bx497Mc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "drawArrow", "Landroidx/compose/ui/unit/Dp;", "IndicatorSize", "F", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SpinnerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ArcRadius", "StrokeWidth", "ArrowWidth", "ArrowHeight", "Elevation", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "showElevation", "targetAlpha", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PullRefreshIndicator2 {
    private static final float IndicatorSize = C2002Dp.m7995constructorimpl(40);
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShape2.getCircleShape();
    private static final float ArcRadius = C2002Dp.m7995constructorimpl((float) 7.5d);
    private static final float StrokeWidth = C2002Dp.m7995constructorimpl((float) 2.5d);
    private static final float ArrowWidth = C2002Dp.m7995constructorimpl(10);
    private static final float ArrowHeight = C2002Dp.m7995constructorimpl(5);
    private static final float Elevation = C2002Dp.m7995constructorimpl(6);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5671PullRefreshIndicatorjB83MbM(final boolean z, final PullRefreshState pullRefreshState, Modifier modifier, long j, long j2, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM5563getSurface0d7_KjU;
        long j3;
        int i4;
        boolean z3;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        final long j6;
        boolean z5;
        boolean zChanged;
        Object objRememberedValue;
        ElevationOverlay elevationOverlay;
        long j7;
        Color colorM6701boximpl;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composerStartRestartGroup = composer.startRestartGroup(308716636);
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
            i3 |= composerStartRestartGroup.changedInstance(pullRefreshState) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    jM5563getSurface0d7_KjU = j;
                    int i7 = composerStartRestartGroup.changed(jM5563getSurface0d7_KjU) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    jM5563getSurface0d7_KjU = j;
                }
                i3 |= i7;
            } else {
                jM5563getSurface0d7_KjU = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i8 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    j3 = j2;
                }
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
                if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            jM5563getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m5563getSurface0d7_KjU();
                        }
                        if ((i2 & 16) != 0) {
                            long jM5565contentColorForek8zF_U = Colors2.m5565contentColorForek8zF_U(jM5563getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                            j3 = jM5565contentColorForek8zF_U;
                        }
                        if (i4 != 0) {
                            long j8 = j3;
                            i5 = i3;
                            j6 = j8;
                            z5 = false;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(308716636, i5, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                        }
                        int i9 = i5 & 14;
                        zChanged = (i9 != 4) | composerStartRestartGroup.changed(pullRefreshState);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(z || pullRefreshState.getPosition$material_release() > 0.5f);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                        elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlay3.getLocalElevationOverlay());
                        if (elevationOverlay != null) {
                            composerStartRestartGroup.startReplaceGroup(-1347611339);
                            composerStartRestartGroup.endReplaceGroup();
                            j7 = jM5563getSurface0d7_KjU;
                            colorM6701boximpl = null;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1619096652);
                            long j9 = jM5563getSurface0d7_KjU;
                            long jMo5579apply7g2Lkgo = elevationOverlay.mo5579apply7g2Lkgo(j9, Elevation, composerStartRestartGroup, ((i5 >> 9) & 14) | 48);
                            j7 = j9;
                            composerStartRestartGroup.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jMo5579apply7g2Lkgo);
                        }
                        long value = colorM6701boximpl == null ? colorM6701boximpl.getValue() : j7;
                        Modifier modifierPullRefreshIndicatorTransform = PullRefreshIndicatorTransform.pullRefreshIndicatorTransform(SizeKt.m5169size3ABfNKs(modifier2, IndicatorSize), pullRefreshState, z5);
                        float fM7995constructorimpl = !PullRefreshIndicator_jB83MbM$lambda$1(snapshotState4) ? Elevation : C2002Dp.m7995constructorimpl(0);
                        RoundedCornerShape roundedCornerShape = SpinnerShape;
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Shadow3.m6468shadows4CzXII$default(modifierPullRefreshIndicatorTransform, fM7995constructorimpl, roundedCornerShape, true, 0L, 0L, 24, null), value, roundedCornerShape);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Crossfade.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambda3.rememberComposableLambda(1853731063, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                invoke(bool.booleanValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z6, Composer composer2, int i10) {
                                int i11;
                                if ((i10 & 6) == 0) {
                                    i11 = i10 | (composer2.changed(z6) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if (composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    long j10 = j6;
                                    PullRefreshState pullRefreshState2 = pullRefreshState;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(PullRefreshIndicator2.ArcRadius + PullRefreshIndicator2.StrokeWidth) * 2);
                                    if (z6) {
                                        composer2.startReplaceGroup(-1566007818);
                                        ProgressIndicatorKt.m5613CircularProgressIndicatorLxG7B9w(SizeKt.m5169size3ABfNKs(companion2, fM7995constructorimpl2), j10, PullRefreshIndicator2.StrokeWidth, 0L, 0, composer2, 390, 24);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1565760097);
                                        PullRefreshIndicator2.m5670CircularArrowIndicatoriJQMabo(pullRefreshState2, j10, SizeKt.m5169size3ABfNKs(companion2, fM7995constructorimpl2), composer2, 384);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, i9 | 24960, 10);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j10 = j6;
                        modifier3 = modifier2;
                        j5 = j10;
                        z4 = z5;
                        j4 = j7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    long j11 = j3;
                    i5 = i3;
                    j6 = j11;
                    z5 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i5 & 14;
                    zChanged = (i92 != 4) | composerStartRestartGroup.changed(pullRefreshState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(z || pullRefreshState.getPosition$material_release() > 0.5f);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                        elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlay3.getLocalElevationOverlay());
                        if (elevationOverlay != null) {
                        }
                        if (colorM6701boximpl == null) {
                        }
                        Modifier modifierPullRefreshIndicatorTransform2 = PullRefreshIndicatorTransform.pullRefreshIndicatorTransform(SizeKt.m5169size3ABfNKs(modifier2, IndicatorSize), pullRefreshState, z5);
                        float fM7995constructorimpl2 = !PullRefreshIndicator_jB83MbM$lambda$1(snapshotState42) ? Elevation : C2002Dp.m7995constructorimpl(0);
                        RoundedCornerShape roundedCornerShape2 = SpinnerShape;
                        Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(Shadow3.m6468shadows4CzXII$default(modifierPullRefreshIndicatorTransform2, fM7995constructorimpl2, roundedCornerShape2, true, 0L, 0L, 24, null), value, roundedCornerShape2);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Crossfade.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambda3.rememberComposableLambda(1853731063, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                    invoke(bool.booleanValue(), composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z6, Composer composer2, int i10) {
                                    int i11;
                                    if ((i10 & 6) == 0) {
                                        i11 = i10 | (composer2.changed(z6) ? 4 : 2);
                                    } else {
                                        i11 = i10;
                                    }
                                    if (composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                                        }
                                        Modifier.Companion companion22 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        long j102 = j6;
                                        PullRefreshState pullRefreshState2 = pullRefreshState;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                                        if (composer2.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor22);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                        float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(PullRefreshIndicator2.ArcRadius + PullRefreshIndicator2.StrokeWidth) * 2);
                                        if (z6) {
                                            composer2.startReplaceGroup(-1566007818);
                                            ProgressIndicatorKt.m5613CircularProgressIndicatorLxG7B9w(SizeKt.m5169size3ABfNKs(companion22, fM7995constructorimpl22), j102, PullRefreshIndicator2.StrokeWidth, 0L, 0, composer2, 390, 24);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-1565760097);
                                            PullRefreshIndicator2.m5670CircularArrowIndicatoriJQMabo(pullRefreshState2, j102, SizeKt.m5169size3ABfNKs(companion22, fM7995constructorimpl22), composer2, 384);
                                            composer2.endReplaceGroup();
                                        }
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, i92 | 24960, 10);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            long j102 = j6;
                            modifier3 = modifier2;
                            j5 = j102;
                            z4 = z5;
                            j4 = j7;
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j4 = jM5563getSurface0d7_KjU;
                    j5 = j3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            PullRefreshIndicator2.m5671PullRefreshIndicatorjB83MbM(z, pullRefreshState, modifier3, j4, j5, z4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z3 = z2;
            if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z3 = z2;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m5670CircularArrowIndicatoriJQMabo(final PullRefreshState pullRefreshState, final long j, final Modifier modifier, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-486016981);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pullRefreshState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486016981, i2, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo6631setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m6809getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            boolean zChanged = composerStartRestartGroup.changed(pullRefreshState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(pullRefreshState.getProgress() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean z = true;
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$6((SnapshotState4) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pullRefreshState) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean zChangedInstance2 = zChangedInstance | z | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                i3 = 0;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) throws Throwable {
                        DrawContext drawContext;
                        long j2;
                        PullRefreshIndicator pullRefreshIndicatorArrowValues = PullRefreshIndicator2.ArrowValues(pullRefreshState.getProgress());
                        float fFloatValue = snapshotState4AnimateFloatAsState.getValue().floatValue();
                        float rotation = pullRefreshIndicatorArrowValues.getRotation();
                        long j3 = j;
                        Path path2 = path;
                        long jMo6962getCenterF1C5BW0 = drawScope.mo6962getCenterF1C5BW0();
                        DrawContext drawContext2 = drawScope.getDrawContext();
                        long jMo6936getSizeNHjbRc = drawContext2.mo6936getSizeNHjbRc();
                        drawContext2.getCanvas().save();
                        try {
                            drawContext2.getTransform().mo6941rotateUv8p0NA(rotation, jMo6962getCenterF1C5BW0);
                            float fMo5016toPx0680j_4 = drawScope.mo5016toPx0680j_4(PullRefreshIndicator2.ArcRadius) + (drawScope.mo5016toPx0680j_4(PullRefreshIndicator2.StrokeWidth) / 2.0f);
                            Rect rect = new Rect(Offset.m6543getXimpl(androidx.compose.p011ui.geometry.SizeKt.m6590getCenteruvyYCjk(drawScope.mo6963getSizeNHjbRc())) - fMo5016toPx0680j_4, Offset.m6544getYimpl(androidx.compose.p011ui.geometry.SizeKt.m6590getCenteruvyYCjk(drawScope.mo6963getSizeNHjbRc())) - fMo5016toPx0680j_4, Offset.m6543getXimpl(androidx.compose.p011ui.geometry.SizeKt.m6590getCenteruvyYCjk(drawScope.mo6963getSizeNHjbRc())) + fMo5016toPx0680j_4, Offset.m6544getYimpl(androidx.compose.p011ui.geometry.SizeKt.m6590getCenteruvyYCjk(drawScope.mo6963getSizeNHjbRc())) + fMo5016toPx0680j_4);
                            try {
                                try {
                                    DrawScope.m6945drawArcyD3GUKo$default(drawScope, j3, pullRefreshIndicatorArrowValues.getStartAngle(), pullRefreshIndicatorArrowValues.getEndAngle() - pullRefreshIndicatorArrowValues.getStartAngle(), false, rect.m6560getTopLeftF1C5BW0(), rect.m6559getSizeNHjbRc(), fFloatValue, new Stroke(drawScope.mo5016toPx0680j_4(PullRefreshIndicator2.StrokeWidth), 0.0f, StrokeCap.INSTANCE.m6850getSquareKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
                                    PullRefreshIndicator2.m5674drawArrowBx497Mc(drawScope, path2, rect, j3, fFloatValue, pullRefreshIndicatorArrowValues);
                                    drawContext2.getCanvas().restore();
                                    drawContext2.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                                } catch (Throwable th) {
                                    th = th;
                                    drawContext = drawContext2;
                                    j2 = jMo6936getSizeNHjbRc;
                                    drawContext.getCanvas().restore();
                                    drawContext.mo6937setSizeuvyYCjk(j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = jMo6936getSizeNHjbRc;
                                drawContext = drawContext2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            drawContext = drawContext2;
                            j2 = jMo6936getSizeNHjbRc;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue3 = function1;
            } else {
                i3 = 0;
            }
            Canvas2.Canvas(modifierSemantics$default, (Function1) objRememberedValue3, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    PullRefreshIndicator2.m5670CircularArrowIndicatoriJQMabo(pullRefreshState, j, modifier, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PullRefreshIndicator ArrowValues(float f) {
        float fMax = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(f) - 1.0f;
        float f2 = fAbs >= 0.0f ? fAbs : 0.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f2 - (((float) Math.pow(f2, 2)) / 4))) * 0.5f;
        float f3 = 360;
        return new PullRefreshIndicator(fPow, fPow * f3, ((0.8f * fMax) + fPow) * f3, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m5674drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j, float f, PullRefreshIndicator pullRefreshIndicator) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f2 = ArrowWidth;
        path.lineTo(drawScope.mo5016toPx0680j_4(f2) * pullRefreshIndicator.getScale(), 0.0f);
        path.lineTo((drawScope.mo5016toPx0680j_4(f2) * pullRefreshIndicator.getScale()) / 2, drawScope.mo5016toPx0680j_4(ArrowHeight) * pullRefreshIndicator.getScale());
        path.mo6632translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m6543getXimpl(rect.m6558getCenterF1C5BW0())) - ((drawScope.mo5016toPx0680j_4(f2) * pullRefreshIndicator.getScale()) / 2.0f), Offset.m6544getYimpl(rect.m6558getCenterF1C5BW0()) + (drawScope.mo5016toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = pullRefreshIndicator.getEndAngle();
        long jMo6962getCenterF1C5BW0 = drawScope.mo6962getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6941rotateUv8p0NA(endAngle, jMo6962getCenterF1C5BW0);
            DrawScope.m6955drawPathLG529CI$default(drawScope, path, j, f, null, null, 0, 56, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
        }
    }
}
