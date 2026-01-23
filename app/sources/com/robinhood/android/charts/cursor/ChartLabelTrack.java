package com.robinhood.android.charts.cursor;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChartLabelTrack.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", AnnotatedPrivateKey.LABEL, "", "xPosition", "", "ChartLabelTrack", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V", "startOffsetPx", "Lkotlin/Function0;", "content", "ChartCursorTrack", "(Ljava/lang/Float;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "getEMPTY_TEXT", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "EMPTY_TEXT", "", "isHidden", "", "contentWidthPx", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.cursor.ChartLabelTrackKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartLabelTrack {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartCursorTrack$lambda$2$lambda$1(Float f) {
        return f == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorTrack$lambda$4(Float f, Modifier modifier, float f2, Function2 function2, int i, int i2, Composer composer, int i3) {
        ChartCursorTrack(f, modifier, f2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartLabelTrack$lambda$0(Modifier modifier, CursorData.DisplayText displayText, Float f, int i, int i2, Composer composer, int i3) {
        ChartLabelTrack(modifier, displayText, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ChartLabelTrack(Modifier modifier, final CursorData.DisplayText displayText, Float f, Composer composer, final int i, final int i2) {
        int i3;
        final Float f2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-835772719);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(displayText) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                f = null;
            }
            final Float f3 = f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835772719, i3, -1, "com.robinhood.android.charts.cursor.ChartLabelTrack (ChartLabelTrack.kt:32)");
            }
            ChartCursorTrack(f3, modifier3, 0.0f, ComposableLambda3.rememberComposableLambda(115558776, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt.ChartLabelTrack.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(115558776, i6, -1, "com.robinhood.android.charts.cursor.ChartLabelTrack.<anonymous> (ChartLabelTrack.kt:37)");
                    }
                    CursorData.DisplayText empty_text = displayText;
                    if (empty_text == null || f3 == null) {
                        empty_text = null;
                    }
                    composer2.startReplaceGroup(-617164343);
                    if (empty_text == null) {
                        empty_text = ChartLabelTrack.getEMPTY_TEXT(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    SubDisplayText2.TintedRegularText(null, empty_text, true, composer2, 384, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 3072 | ((i3 << 3) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f3;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            f2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartLabelTrack.ChartLabelTrack$lambda$0(modifier2, displayText, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartCursorTrack(final Float f, Modifier modifier, float f2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier2;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1236931043);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                float f5 = i5 == 0 ? 0.0f : f3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1236931043, i3, -1, "com.robinhood.android.charts.cursor.ChartCursorTrack (ChartLabelTrack.kt:62)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(ChartLabelTrack.ChartCursorTrack$lambda$2$lambda$1(f));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxWithConstraints.BoxWithConstraints(ModifiersKt.isInvisible(modifier3, ChartCursorTrack$lambda$3((SnapshotState4) objRememberedValue)), null, false, ComposableLambda3.rememberComposableLambda(-519799987, true, new C109841(f, density, f5, content), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f4 = f5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartLabelTrack.ChartCursorTrack$lambda$4(f, modifier2, f4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        f3 = f2;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ChartLabelTrack.ChartCursorTrack$lambda$2$lambda$1(f));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BoxWithConstraints.BoxWithConstraints(ModifiersKt.isInvisible(modifier3, ChartCursorTrack$lambda$3((SnapshotState4) objRememberedValue)), null, false, ComposableLambda3.rememberComposableLambda(-519799987, true, new C109841(f, density2, f5, content), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                f4 = f5;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ChartLabelTrack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.cursor.ChartLabelTrackKt$ChartCursorTrack$1 */
    static final class C109841 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Density $currentLocalDensity;
        final /* synthetic */ float $startOffsetPx;
        final /* synthetic */ Float $xPosition;

        /* JADX WARN: Multi-variable type inference failed */
        C109841(Float f, Density density, float f2, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.$xPosition = f;
            this.$currentLocalDensity = density;
            this.$startOffsetPx = f2;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i |= composer.changed(BoxWithConstraints) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519799987, i, -1, "com.robinhood.android.charts.cursor.ChartCursorTrack.<anonymous> (ChartLabelTrack.kt:69)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composer.endReplaceGroup();
            Float f = this.$xPosition;
            float fCoerceIn = RangesKt.coerceIn(f != null ? f.floatValue() : 0.0f, 0.0f, 1.0f);
            float fMo5016toPx0680j_4 = this.$currentLocalDensity.mo5016toPx0680j_4(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM());
            float intValue = (((fMo5016toPx0680j_4 - this.$startOffsetPx) * fCoerceIn) - (snapshotIntState2.getIntValue() / 2)) + this.$startOffsetPx;
            float fMo5016toPx0680j_42 = this.$currentLocalDensity.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
            float fMo5012toDpu2uoSUM = this.$currentLocalDensity.mo5012toDpu2uoSUM(((Number) RangesKt.coerceIn(Float.valueOf(intValue), RangesKt.rangeTo(fMo5016toPx0680j_42, Math.max((fMo5016toPx0680j_4 - snapshotIntState2.getIntValue()) - fMo5016toPx0680j_42, fMo5016toPx0680j_42)))).floatValue());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartLabelTrackKt$ChartCursorTrack$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartLabelTrack.C109841.invoke$lambda$7$lambda$6(snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5123absoluteOffsetVpY3zN4$default = OffsetKt.m5123absoluteOffsetVpY3zN4$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue2), fMo5012toDpu2uoSUM, 0.0f, 2, null);
            Function2<Composer, Integer, Unit> function2 = this.$content;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5123absoluteOffsetVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotIntState2.setIntValue((int) (it.mo7241getSizeYbymL2g() >> 32));
            return Unit.INSTANCE;
        }
    }

    private static final boolean ChartCursorTrack$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final CursorData.DisplayText getEMPTY_TEXT(Composer composer, int i) {
        composer.startReplaceGroup(-1350606388);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350606388, i, -1, "com.robinhood.android.charts.cursor.<get-EMPTY_TEXT> (ChartLabelTrack.kt:100)");
        }
        CursorData.DisplayText displayText = new CursorData.DisplayText(PlaceholderUtils.XXShortPlaceholderText, ((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21726getScrubLabelTrackEmptyText0d7_KjU(), null, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return displayText;
    }
}
