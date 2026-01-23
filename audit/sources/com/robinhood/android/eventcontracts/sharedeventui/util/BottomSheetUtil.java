package com.robinhood.android.eventcontracts.sharedeventui.util;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BottomSheetUtil.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u000626\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "showExpandedState", "Lkotlin/Function0;", "", "collapsedComposable", "expandedComposable", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "collapsedStateHeight", "expandedStateHeight", "onMeasuredHeights", "BottomSheetContentMeasurer", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BottomSheetUtil {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetContentMeasurer$lambda$3(boolean z, Function2 function2, Function2 function22, Modifier modifier, Function2 function23, int i, int i2, Composer composer, int i3) {
        BottomSheetContentMeasurer(z, function2, function22, modifier, function23, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetContentMeasurer(final boolean z, final Function2<? super Composer, ? super Integer, Unit> collapsedComposable, final Function2<? super Composer, ? super Integer, Unit> expandedComposable, Modifier modifier, final Function2<? super Integer, ? super Integer, Unit> onMeasuredHeights, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean z2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(collapsedComposable, "collapsedComposable");
        Intrinsics.checkNotNullParameter(expandedComposable, "expandedComposable");
        Intrinsics.checkNotNullParameter(onMeasuredHeights, "onMeasuredHeights");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1545253138);
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
            i3 |= composerStartRestartGroup.changedInstance(collapsedComposable) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(expandedComposable) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onMeasuredHeights) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1545253138, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetContentMeasurer (BottomSheetUtil.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((57344 & i3) != 16384) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BottomSheetUtil.BottomSheetContentMeasurer$lambda$2$lambda$1(collapsedComposable, expandedComposable, onMeasuredHeights, z, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SubcomposeLayoutKt.SubcomposeLayout(modifier3, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 9) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomSheetUtil.BottomSheetContentMeasurer$lambda$3(z, collapsedComposable, expandedComposable, modifier4, onMeasuredHeights, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((57344 & i3) != 16384) | ((i3 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomSheetUtil.BottomSheetContentMeasurer$lambda$2$lambda$1(collapsedComposable, expandedComposable, onMeasuredHeights, z, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                SubcomposeLayoutKt.SubcomposeLayout(modifier3, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 9) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BottomSheetContentMeasurer$lambda$2$lambda$1(Function2 function2, Function2 function22, Function2 function23, boolean z, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(constraints.getValue());
        Placeable placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot = BottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot(SubcomposeLayout, iM7975getMaxWidthimpl, "collapsed", function2);
        Placeable placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot2 = BottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot(SubcomposeLayout, iM7975getMaxWidthimpl, "expanded", function22);
        function23.invoke(Integer.valueOf(placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot.getHeight()), Integer.valueOf(placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot2.getHeight()));
        final Placeable placeable = z ? placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot2 : placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot;
        return MeasureScope.layout$default(SubcomposeLayout, RangesKt.coerceIn(placeable.getWidth(), Constraints.m7977getMinWidthimpl(constraints.getValue()), Constraints.m7975getMaxWidthimpl(constraints.getValue())), RangesKt.coerceIn(Math.max(placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot.getHeight(), placeableBottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot2.getHeight()), Constraints.m7976getMinHeightimpl(constraints.getValue()), Constraints.m7974getMaxHeightimpl(constraints.getValue())), null, new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetUtil.BottomSheetContentMeasurer$lambda$2$lambda$1$lambda$0(placeable, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    private static final Placeable BottomSheetContentMeasurer$lambda$2$lambda$1$measureSlot(SubcomposeMeasureScope subcomposeMeasureScope, int i, String str, final Function2<? super Composer, ? super Integer, Unit> function2) {
        return ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(str, ComposableLambda3.composableLambdaInstance(745136623, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetUtilKt$BottomSheetContentMeasurer$1$1$measureSlot$measurables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(745136623, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.util.BottomSheetContentMeasurer.<anonymous>.<anonymous>.measureSlot.<anonymous> (BottomSheetUtil.kt:41)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })))).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(Constraints.INSTANCE.m7986fixedWidthOenEA2s(i), 0, 0, 0, 0, 11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetContentMeasurer$lambda$2$lambda$1$lambda$0(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
