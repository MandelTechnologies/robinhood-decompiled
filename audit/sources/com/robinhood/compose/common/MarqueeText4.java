package com.robinhood.compose.common;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarqueeText.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"DurationMillis", "", "Gradient", "", "(Landroidx/compose/runtime/Composer;I)V", "MarqueeText", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "useGradient", "", "textModifier", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "durationMillis", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/runtime/Composer;II)V", "lib-compose-common_externalDebug", "timeOffset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.MarqueeTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class MarqueeText4 {
    private static final int DurationMillis = 15000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Gradient$lambda$1(int i, Composer composer, int i2) {
        Gradient(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarqueeText$lambda$11(String str, Modifier modifier, boolean z, Modifier modifier2, FontWeight fontWeight, int i, int i2, int i3, Composer composer, int i4) {
        MarqueeText(str, modifier, z, modifier2, fontWeight, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2085929203);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085929203, i, -1, "com.robinhood.compose.common.Gradient (MarqueeText.kt:40)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BoxKt.Box(Background3.background$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(10)), 0.0f, 1, null), Brush.Companion.m6677horizontalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.MarqueeTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarqueeText4.Gradient$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarqueeText(final String text, Modifier modifier, boolean z, Modifier modifier2, FontWeight fontWeight, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier3;
        int i5;
        boolean z2;
        int i6;
        Modifier modifier4;
        int i7;
        final FontWeight normal;
        int i8;
        int i9;
        Modifier modifier5;
        final boolean z3;
        final Modifier modifier6;
        final ComposableLambda composableLambdaRememberComposableLambda;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        boolean z4;
        Object objRememberedValue3;
        boolean z5;
        Object objRememberedValue4;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2019463869);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier3 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier3) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        modifier4 = modifier2;
                        i4 |= composerStartRestartGroup.changed(modifier4) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        if ((i2 & 24576) == 0) {
                            normal = fontWeight;
                            i4 |= composerStartRestartGroup.changed(normal) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            i9 = i;
                        } else {
                            i9 = i;
                            if ((i2 & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(i9) ? 131072 : 65536;
                            }
                        }
                        if ((i4 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier5 = modifier3;
                            z6 = z2;
                            modifier6 = modifier4;
                        } else {
                            modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier3;
                            z3 = i5 == 0 ? true : z2;
                            modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier4;
                            if (i7 != 0) {
                                normal = FontWeight.INSTANCE.getNormal();
                            }
                            if (i8 != 0) {
                                i9 = DurationMillis;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2019463869, i4, -1, "com.robinhood.compose.common.MarqueeText (MarqueeText.kt:66)");
                            }
                            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-823255619, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$createText$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier7, Composer composer2, Integer num) {
                                    invoke(modifier7, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Modifier localModifier, Composer composer2, int i11) {
                                    int i12;
                                    Intrinsics.checkNotNullParameter(localModifier, "localModifier");
                                    if ((i11 & 6) == 0) {
                                        i12 = i11 | (composer2.changed(localModifier) ? 4 : 2);
                                    } else {
                                        i12 = i11;
                                    }
                                    if ((i12 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-823255619, i12, -1, "com.robinhood.compose.common.MarqueeText.<anonymous> (MarqueeText.kt:68)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(text, localModifier, null, null, normal, null, null, 0, false, 1, 0, null, 0, null, composer2, ((i12 << 3) & 112) | 805306368, 0, 15852);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Object value = snapshotState.getValue();
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            z4 = (458752 & i4) != 131072;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new MarqueeText5(snapshotState, i9, snapshotIntState2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            Modifier modifierClipToBounds = Clip.clipToBounds(modifier5);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z5 = ((i4 & 7168) != 2048) | ((i4 & 896) == 256);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z5 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.compose.common.MarqueeTextKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return MarqueeText4.MarqueeText$lambda$10$lambda$9(snapshotState, z3, composableLambdaRememberComposableLambda, modifier6, snapshotIntState2, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue4, composerStartRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z3;
                        }
                        final int i11 = i9;
                        final FontWeight fontWeight2 = normal;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier7 = modifier5;
                            final Modifier modifier8 = modifier6;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.MarqueeTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MarqueeText4.MarqueeText$lambda$11(text, modifier7, z6, modifier8, fontWeight2, i11, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    normal = fontWeight;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i4 & 74899) == 74898) {
                        if (i10 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-823255619, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$createText$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier72, Composer composer2, Integer num) {
                                invoke(modifier72, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Modifier localModifier, Composer composer2, int i112) {
                                int i12;
                                Intrinsics.checkNotNullParameter(localModifier, "localModifier");
                                if ((i112 & 6) == 0) {
                                    i12 = i112 | (composer2.changed(localModifier) ? 4 : 2);
                                } else {
                                    i12 = i112;
                                }
                                if ((i12 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-823255619, i12, -1, "com.robinhood.compose.common.MarqueeText.<anonymous> (MarqueeText.kt:68)");
                                }
                                BentoText2.m20747BentoText38GnDrw(text, localModifier, null, null, normal, null, null, 0, false, 1, 0, null, 0, null, composer2, ((i12 << 3) & 112) | 805306368, 0, 15852);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Object value2 = snapshotState.getValue();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        if ((458752 & i4) != 131072) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue3 = new MarqueeText5(snapshotState, i9, snapshotIntState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(value2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            Modifier modifierClipToBounds2 = Clip.clipToBounds(modifier5);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z5 = ((i4 & 7168) != 2048) | ((i4 & 896) == 256);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z5) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.compose.common.MarqueeTextKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return MarqueeText4.MarqueeText$lambda$10$lambda$9(snapshotState, z3, composableLambdaRememberComposableLambda, modifier6, snapshotIntState2, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds2, (Function2) objRememberedValue4, composerStartRestartGroup, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z6 = z3;
                            }
                        }
                    }
                    final int i112 = i9;
                    final FontWeight fontWeight22 = normal;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier4 = modifier2;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                normal = fontWeight;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i4 & 74899) == 74898) {
                }
                final int i1122 = i9;
                final FontWeight fontWeight222 = normal;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            modifier4 = modifier2;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            normal = fontWeight;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i4 & 74899) == 74898) {
            }
            final int i11222 = i9;
            final FontWeight fontWeight2222 = normal;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        modifier4 = modifier2;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        normal = fontWeight;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i4 & 74899) == 74898) {
        }
        final int i112222 = i9;
        final FontWeight fontWeight22222 = normal;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, kotlin.Pair] */
    public static final MeasureResult MarqueeText$lambda$10$lambda$9(SnapshotState snapshotState, boolean z, final Function3 function3, final Modifier modifier, final SnapshotIntState2 snapshotIntState2, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        final Placeable placeableMo7239measureBRTryo0 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(MarqueeText3.MainText, ComposableLambda3.composableLambdaInstance(57271205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$2$1$mainText$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(57271205, i, -1, "com.robinhood.compose.common.MarqueeText.<anonymous>.<anonymous>.<anonymous> (MarqueeText.kt:109)");
                }
                function3.invoke(modifier, composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })))).mo7239measureBRTryo0(Constraints2.Constraints$default(0, 0, 0, 0, 15, null));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        snapshotState.setValue(new TextLayoutInfo(placeableMo7239measureBRTryo0.getWidth(), Constraints.m7975getMaxWidthimpl(constraints.getValue())));
        int width = placeableMo7239measureBRTryo0.getWidth() + snapshotIntState2.getIntValue();
        if (Constraints.m7975getMaxWidthimpl(constraints.getValue()) - width > 0) {
            objectRef.element = Tuples4.m3642to(((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(MarqueeText3.SecondaryText, ComposableLambda3.composableLambdaInstance(-1363589833, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.MarqueeTextKt$MarqueeText$2$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1363589833, i, -1, "com.robinhood.compose.common.MarqueeText.<anonymous>.<anonymous>.<anonymous> (MarqueeText.kt:123)");
                    }
                    function3.invoke(modifier, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            })))).mo7239measureBRTryo0(Constraints2.Constraints$default(0, 0, 0, 0, 15, null)), Integer.valueOf(width));
        }
        final Placeable placeableMo7239measureBRTryo02 = z ? ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(MarqueeText3.Gradient, MarqueeText.INSTANCE.m21642getLambda$1023894442$lib_compose_common_externalDebug()))).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, placeableMo7239measureBRTryo0.getHeight(), 7, null)) : null;
        return MeasureScope.layout$default(SubcomposeLayout, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1() { // from class: com.robinhood.compose.common.MarqueeTextKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarqueeText4.MarqueeText$lambda$10$lambda$9$lambda$8(placeableMo7239measureBRTryo0, objectRef, placeableMo7239measureBRTryo02, snapshotIntState2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit MarqueeText$lambda$10$lambda$9$lambda$8(Placeable placeable, Ref.ObjectRef objectRef, Placeable placeable2, SnapshotIntState2 snapshotIntState2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, snapshotIntState2.getIntValue(), 0, 0.0f, 4, null);
        Tuples2 tuples2 = (Tuples2) objectRef.element;
        if (tuples2 != null) {
            Placeable.PlacementScope.place$default(layout, (Placeable) tuples2.getFirst(), ((Number) tuples2.getSecond()).intValue(), 0, 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(layout, placeable2, 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
