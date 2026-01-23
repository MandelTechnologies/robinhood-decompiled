package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntList3;
import androidx.collection.IntObjectMap2;
import androidx.collection.IntObjectMap3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FlowLayout.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001an\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ad\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001a?\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a]\u0010%\u001a\u00020$2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&\u001a\\\u00105\u001a\u000202*\u00020'2\u0006\u0010)\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a%\u00108\u001a\u0004\u0018\u00010+*\b\u0012\u0004\u0012\u00020+0*2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010=\u001a\u00020\b*\u00020\u001c2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b=\u0010>\u001a#\u0010@\u001a\u00020\b*\u00020\u001c2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010>\u001a<\u0010F\u001a\u00020$*\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u00020A2\u0014\u0010C\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020\u000f0\rH\u0000ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aT\u0010O\u001a\u000202*\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001e2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002020I2\u0006\u0010K\u001a\u00020(2\u0006\u0010L\u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\bM\u0010N\"\u001a\u0010Q\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u001a\u0010U\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "itemVerticalAlignment", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "Landroidx/collection/IntIntPair;", "intrinsicCrossAxisSize", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesIterator", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowLineInfo;", SduiFeatureDiscovery3.INFO_TAG, "safeNext", "(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "", "isHorizontal", "crossAxisSize", "mainAxisMin", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I", "mainAxisSize", "crossAxisMin", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "measureAndCache", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "items", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "getCROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowLayoutOverflow5 flowLayoutOverflow5, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        int i7;
        Alignment.Vertical top;
        int i8;
        int i9;
        int i10;
        int i11;
        final Modifier modifier2;
        final Arrangement.Vertical vertical3;
        final Arrangement.Horizontal horizontal3;
        Composer composer2;
        final int i12;
        final int i13;
        final FlowLayoutOverflow5 flowLayoutOverflow52;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Arrangement.Vertical top2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-218661582);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                horizontal2 = horizontal;
                i5 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(vertical) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        top = vertical2;
                        i5 |= composerStartRestartGroup.changed(top) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 24576) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(flowLayoutOverflow5) ? 1048576 : 524288;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        }
                        if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            Modifier modifier3 = i15 != 0 ? Modifier.INSTANCE : modifier;
                            Arrangement.Horizontal start = i16 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            if (i6 != 0) {
                                top2 = Arrangement.INSTANCE.getTop();
                                i14 = i7;
                            } else {
                                i14 = i7;
                                top2 = vertical;
                            }
                            if (i14 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            int i17 = i8 != 0 ? Integer.MAX_VALUE : i9;
                            int i18 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            FlowLayoutOverflow5 clip = i11 != 0 ? FlowLayoutOverflow5.INSTANCE.getClip() : flowLayoutOverflow5;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-218661582, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)");
                            }
                            int i19 = 3670016 & i5;
                            boolean z = i19 == 1048576;
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = clip.createOverflowState$foundation_layout_release();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) objRememberedValue;
                            MultiContentMeasurePolicy multiContentMeasurePolicyRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(start, top2, top, i17, i18, flowLayoutOverflowState, composerStartRestartGroup, (i5 >> 3) & 65534);
                            boolean z2 = (i19 == 1048576) | ((29360128 & i5) == 8388608) | ((i5 & 458752) == 131072);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                Object obj = objRememberedValue2;
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ComposableLambda3.composableLambdaInstance(702094978, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i20) {
                                            if (!composer3.shouldExecute((i20 & 3) != 2, i20 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(702094978, i20, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:112)");
                                            }
                                            function3.invoke(FlowRowScopeInstance.INSTANCE, composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                                    composerStartRestartGroup.updateRememberedValue(arrayList);
                                    obj = arrayList;
                                }
                                Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
                                boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicyRowMeasurementMultiContentHelper);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = MultiContentMeasurePolicy3.createMeasurePolicy(multiContentMeasurePolicyRowMeasurementMultiContentHelper);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Modifier modifier4 = modifier3;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                FlowLayoutOverflow5 flowLayoutOverflow53 = clip;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = composerStartRestartGroup;
                                horizontal3 = start;
                                vertical3 = top2;
                                i12 = i17;
                                i13 = i18;
                                modifier2 = modifier4;
                                flowLayoutOverflow52 = flowLayoutOverflow53;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            vertical3 = vertical;
                            horizontal3 = horizontal2;
                            composer2 = composerStartRestartGroup;
                            i12 = i9;
                            i13 = i2;
                            flowLayoutOverflow52 = flowLayoutOverflow5;
                        }
                        final Alignment.Vertical vertical4 = top;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i20) {
                                    FlowLayoutKt.FlowRow(modifier2, horizontal3, vertical3, vertical4, i12, i13, flowLayoutOverflow52, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    final Alignment.Vertical vertical42 = top;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                top = vertical2;
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                final Alignment.Vertical vertical422 = top;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            top = vertical2;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            final Alignment.Vertical vertical4222 = top;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        top = vertical2;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        final Alignment.Vertical vertical42222 = top;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Alignment.Vertical vertical3;
        final Modifier modifier3;
        final Arrangement.Horizontal horizontal3;
        final int i12;
        final Arrangement.Vertical vertical4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Arrangement.Horizontal start;
        int i14;
        Alignment.Vertical top;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2070229740);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                horizontal2 = horizontal;
                i5 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(vertical) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(vertical2) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 == 0) {
                            if ((196608 & i3) == 0) {
                                i11 = i2;
                                i5 |= composerStartRestartGroup.changed(i11) ? 131072 : 65536;
                            }
                            if ((i4 & 64) == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            }
                            if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                Modifier modifier4 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i16 != 0) {
                                    start = Arrangement.INSTANCE.getStart();
                                    i13 = i7;
                                } else {
                                    i13 = i7;
                                    start = horizontal2;
                                }
                                Arrangement.Vertical top2 = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical;
                                if (i13 != 0) {
                                    top = Alignment.INSTANCE.getTop();
                                    i14 = i8;
                                } else {
                                    i14 = i8;
                                    top = vertical2;
                                }
                                if (i14 != 0) {
                                    i9 = Integer.MAX_VALUE;
                                }
                                int i17 = i10 != 0 ? Integer.MAX_VALUE : i11;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2070229740, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)");
                                }
                                composer2 = composerStartRestartGroup;
                                FlowRow(modifier4, start, top2, top, i9, i17, FlowLayoutOverflow5.INSTANCE.getClip(), function3, composer2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                horizontal3 = start;
                                vertical4 = top2;
                                vertical3 = top;
                                i12 = i17;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                vertical3 = vertical2;
                                modifier3 = modifier2;
                                horizontal3 = horizontal2;
                                i12 = i11;
                                vertical4 = vertical;
                            }
                            final int i18 = i9;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i19) {
                                        FlowLayoutKt.FlowRow(modifier3, horizontal3, vertical4, vertical3, i18, i12, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 196608;
                        i11 = i2;
                        if ((i4 & 64) == 0) {
                        }
                        if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        final int i182 = i9;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 == 0) {
                    }
                    i11 = i2;
                    if ((i4 & 64) == 0) {
                    }
                    if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    final int i1822 = i9;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i2;
                if ((i4 & 64) == 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                final int i18222 = i9;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i2;
            if ((i4 & 64) == 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            final int i182222 = i9;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i2;
        if ((i4 & 64) == 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        final int i1822222 = i9;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zChanged = ((((i3 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && composer.changed(i2)) || (i3 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical2), vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m5109breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i3;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        IntObjectMap3 intObjectMap3;
        int i4;
        int i5;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j2;
        int i6;
        int i7;
        int i8;
        IntObjectMap3 intObjectMap32;
        IntIntPair intIntPairM4735boximpl;
        IntList3 intList3;
        IntList3 intList32;
        int i9;
        int i10;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i11;
        int i12;
        int i13;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
        IntObjectMap3 intObjectMap3MutableIntObjectMapOf = IntObjectMap2.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo5016toPx0680j_4(f));
        int iCeil2 = (int) Math.ceil(measureScope3.mo5016toPx0680j_4(f2));
        long jM5129constructorimpl = OrientationIndependentConstraints.m5129constructorimpl(0, iM7975getMaxWidthimpl, 0, iM7974getMaxHeightimpl);
        long jM5134toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m5134toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m5133copyyUG9Ft0$default(jM5129constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.getIsHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ContextualFlowLayout2 contextualFlowLayout2 = it2 instanceof ContextualFlowLayout ? new ContextualFlowLayout2(0, 0, measureScope3.mo5013toDpu2uoSUM(iM7975getMaxWidthimpl), measureScope3.mo5013toDpu2uoSUM(iM7974getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, contextualFlowLayout2);
        IntIntPair intIntPairM4735boximpl2 = measurableSafeNext != null ? IntIntPair.m4735boximpl(m5110measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM5134toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                invoke2(placeable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                objectRef.element = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairM4735boximpl2 != null ? Integer.valueOf(IntIntPair.m4739getFirstimpl(intIntPairM4735boximpl2.getPackedValue())) : null;
        Integer numValueOf2 = intIntPairM4735boximpl2 != null ? Integer.valueOf(IntIntPair.m4740getSecondimpl(intIntPairM4735boximpl2.getPackedValue())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableSafeNext;
        IntList3 intList33 = new IntList3(0, 1, null);
        IntList3 intList34 = new IntList3(0, 1, null);
        ContextualFlowLayout2 contextualFlowLayout22 = contextualFlowLayout2;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, iCeil, iCeil2, null);
        int i14 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM5107getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m4736constructorimpl(iM7975getMaxWidthimpl, iM7974getMaxHeightimpl), intIntPairM4735boximpl2, 0, 0, 0, false, false);
        if (wrapInfoM5107getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM5107getWrapInfoOpUlnko, intIntPairM4735boximpl2 != null, -1, 0, iM7975getMaxWidthimpl, 0);
            i3 = iM7975getMaxWidthimpl;
        } else {
            i3 = iM7975getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM5107getWrapInfoOpUlnko;
        int i19 = 0;
        int i20 = iM7977getMinWidthimpl;
        IntList3 intList35 = intList33;
        int i21 = iM7974getMaxHeightimpl;
        int i22 = 0;
        int i23 = i3;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.getIsLastItemInContainer() && measurableSafeNext2 != null) {
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            IntList3 intList36 = intList34;
            int i24 = i3;
            int i25 = i16 + iIntValue;
            int iMax = Math.max(i15, numValueOf2.intValue());
            int i26 = i23 - iIntValue;
            int i27 = i22 + 1;
            int i28 = i20;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i27);
            arrayList.add(measurableSafeNext2);
            intObjectMap3MutableIntObjectMapOf.set(i22, objectRef.element);
            int i29 = i27 - i17;
            boolean z = i29 < i;
            if (contextualFlowLayout22 != null) {
                if (z) {
                    i8 = i29;
                    i11 = i19;
                } else {
                    i8 = i29;
                    i11 = i19 + 1;
                }
                int i30 = z ? i8 : 0;
                if (z) {
                    int i31 = i26 - i14;
                    i12 = i31 < 0 ? 0 : i31;
                } else {
                    i12 = i24;
                }
                float fMo5013toDpu2uoSUM = measureScope3.mo5013toDpu2uoSUM(i12);
                if (z) {
                    intObjectMap32 = intObjectMap3MutableIntObjectMapOf;
                    i13 = i21;
                } else {
                    int i32 = (i21 - iMax) - iCeil2;
                    intObjectMap32 = intObjectMap3MutableIntObjectMapOf;
                    i13 = i32 < 0 ? 0 : i32;
                }
                contextualFlowLayout22.m5115update4j6BHR0$foundation_layout_release(i11, i30, fMo5013toDpu2uoSUM, measureScope3.mo5013toDpu2uoSUM(i13));
            } else {
                i8 = i29;
                intObjectMap32 = intObjectMap3MutableIntObjectMapOf;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, contextualFlowLayout22);
            objectRef.element = null;
            IntIntPair intIntPairM4735boximpl3 = measurableSafeNext2 != null ? IntIntPair.m4735boximpl(m5110measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM5134toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairM4735boximpl3 != null ? Integer.valueOf(IntIntPair.m4739getFirstimpl(intIntPairM4735boximpl3.getPackedValue()) + i14) : null;
            numValueOf2 = intIntPairM4735boximpl3 != null ? Integer.valueOf(IntIntPair.m4740getSecondimpl(intIntPairM4735boximpl3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i33 = i19;
            long jM4736constructorimpl = IntIntPair.m4736constructorimpl(i26, i21);
            if (intIntPairM4735boximpl3 == null) {
                intIntPairM4735boximpl = null;
            } else {
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                intIntPairM4735boximpl = IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM5107getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(zHasNext, i8, jM4736constructorimpl, intIntPairM4735boximpl, i33, i18, iMax, false, false);
            if (wrapInfoM5107getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i28, i25), i24);
                int i34 = i18 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM5107getWrapInfoOpUlnko2, intIntPairM4735boximpl3 != null, i33, i34, i26, i8);
                intList3 = intList36;
                intList3.add(iMax);
                int i35 = (iM7974getMaxHeightimpl - i34) - iCeil2;
                IntList3 intList37 = intList35;
                intList37.add(i27);
                i19 = i33 + 1;
                i18 = i34 + iCeil2;
                i23 = i24;
                i24 = i23;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i14) : null;
                i17 = i27;
                i9 = i35;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                i20 = iMin;
                intList32 = intList37;
                i10 = 0;
                i25 = 0;
            } else {
                intList3 = intList36;
                intList32 = intList35;
                numValueOf3 = numValueOf4;
                i23 = i26;
                i19 = i33;
                i20 = i28;
                i9 = i21;
                i10 = iMax;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            intList35 = intList32;
            i15 = i10;
            i21 = i9;
            i22 = i27;
            wrapInfo = wrapInfoM5107getWrapInfoOpUlnko2;
            it2 = it;
            intList34 = intList3;
            intObjectMap3MutableIntObjectMapOf = intObjectMap32;
            i16 = i25;
            i3 = i24;
        }
        IntObjectMap3 intObjectMap33 = intObjectMap3MutableIntObjectMapOf;
        int i36 = i20;
        IntList3 intList38 = intList34;
        IntList3 intList39 = intList35;
        if (wrapEllipsisInfo3 != null) {
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            intObjectMap3 = intObjectMap33;
            intObjectMap3.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i37 = intList39._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i38 = intList39._size - 1;
                intList38.set(i37, Math.max(intList38.get(i37), IntIntPair.m4740getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                intList39.set(i38, intList39.last() + 1);
            } else {
                intList38.add(IntIntPair.m4740getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                intList39.add(intList39.last() + 1);
            }
        } else {
            intObjectMap3 = intObjectMap33;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i39 = 0; i39 < size; i39++) {
            placeableArr[i39] = intObjectMap3.get(i39);
        }
        int i40 = intList39._size;
        int[] iArr3 = new int[i40];
        int[] iArr4 = new int[i40];
        int[] iArr5 = intList39.content;
        int iMax2 = i36;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i42 < i40) {
            int i44 = iArr5[i42];
            IntList3 intList310 = intList38;
            int i45 = intList310.get(i42);
            int[] iArr6 = iArr3;
            Placeable[] placeableArr3 = placeableArr2;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i46 = i14;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicy2.measure(flowLineMeasurePolicy4, iMax2, Constraints.m7976getMinHeightimpl(jM5129constructorimpl), Constraints.m7975getMaxWidthimpl(jM5129constructorimpl), i45, i46, measureScope3, arrayList2, placeableArr3, i41, i44, iArr6, i42);
            if (flowLineMeasurePolicy.getIsHorizontal()) {
                i6 = measureResultMeasure.getWidth();
                i7 = measureResultMeasure.getHeight();
            } else {
                i6 = measureResultMeasure.getHeight();
                i7 = measureResultMeasure.getWidth();
            }
            iArr4[i42] = i7;
            i43 += i7;
            iMax2 = Math.max(iMax2, i6);
            mutableVector.add(measureResultMeasure);
            i42++;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            i41 = i44;
            iArr3 = iArr6;
            intList38 = intList310;
            i14 = i46;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i4 = 0;
            i5 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j2 = j;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i4 = iMax2;
            i5 = i43;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j2 = j;
        }
        return m5111placeHelperBmaY500(measureScope2, j2, i4, i5, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m4736constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m5129constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int i6 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i7 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i8 = 0;
        if (flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m4736constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(i7, i6)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m5112ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m4736constructorimpl(intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m4740getSecondimpl(intIntPairM5112ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            int i15 = i9 - i7;
            int i16 = i10 + 1;
            int iMax = Math.max(i14, i6);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i16);
            int i17 = intrinsicMeasurable2 != null ? iArr2[i16] : 0;
            int i18 = intrinsicMeasurable2 != null ? iArr[i16] + i2 : 0;
            int i19 = i16 - i12;
            int i20 = i13;
            int i21 = i17;
            int i22 = i18;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM5107getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m5107getWrapInfoOpUlnko(i10 + 2 < list.size(), i19, IntIntPair.m4736constructorimpl(i15, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m4735boximpl(IntIntPair.m4736constructorimpl(i18, i17)), i20, i8, iMax, false, false);
            if (wrapInfoM5107getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int iM4740getSecondimpl = i8 + iMax + i3;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM5107getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i20, iM4740getSecondimpl, i15, i19);
                int i23 = i22 - i2;
                i13 = i20 + 1;
                if (wrapInfoM5107getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM4740getSecondimpl += IntIntPair.m4740getSecondimpl(ellipsisSize) + i3;
                        }
                    }
                    i8 = iM4740getSecondimpl;
                    i11 = i16;
                } else {
                    i14 = 0;
                    i8 = iM4740getSecondimpl;
                    i7 = i23;
                    i12 = i16;
                    i9 = i;
                }
            } else {
                i9 = i15;
                i13 = i20;
                i14 = iMax;
                i7 = i22;
            }
            i10 = i16;
            i11 = i10;
            i6 = i21;
        }
        return IntIntPair.m4736constructorimpl(i8 - i3, i11);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, ContextualFlowLayout2 contextualFlowLayout2) {
        try {
            if (it instanceof ContextualFlowLayout) {
                Intrinsics.checkNotNull(contextualFlowLayout2);
                return ((ContextualFlowLayout) it).getNext$foundation_layout_release(contextualFlowLayout2);
            }
            return it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m5110measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, Function1<? super Placeable, Unit> function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (rowColumnParentData != null) {
                rowColumnParentData.getFlowLayoutData();
            }
            Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(j);
            function1.invoke(placeableMo7239measureBRTryo0);
            return IntIntPair.m4736constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo7239measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo7239measureBRTryo0));
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.getIsHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m4736constructorimpl(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.getIsHorizontal(), iMainAxisMin));
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m5111placeHelperBmaY500(MeasureScope measureScope, long j, int i, int i2, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iM7974getMaxHeightimpl;
        int i3;
        int i4;
        boolean zIsHorizontal = flowLineMeasurePolicy.getIsHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            int iMo5010roundToPx0680j_4 = i2 + (measureScope.mo5010roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1));
            int iM7976getMinHeightimpl = Constraints.m7976getMinHeightimpl(j);
            iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
            if (iMo5010roundToPx0680j_4 < iM7976getMinHeightimpl) {
                iMo5010roundToPx0680j_4 = iM7976getMinHeightimpl;
            }
            if (iMo5010roundToPx0680j_4 <= iM7974getMaxHeightimpl) {
                iM7974getMaxHeightimpl = iMo5010roundToPx0680j_4;
            }
            verticalArrangement.arrange(measureScope, iM7974getMaxHeightimpl, iArr, iArr2);
        } else {
            int iMo5010roundToPx0680j_42 = i2 + (measureScope.mo5010roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1));
            int iM7976getMinHeightimpl2 = Constraints.m7976getMinHeightimpl(j);
            int iM7974getMaxHeightimpl2 = Constraints.m7974getMaxHeightimpl(j);
            if (iMo5010roundToPx0680j_42 < iM7976getMinHeightimpl2) {
                iMo5010roundToPx0680j_42 = iM7976getMinHeightimpl2;
            }
            int i5 = iMo5010roundToPx0680j_42 > iM7974getMaxHeightimpl2 ? iM7974getMaxHeightimpl2 : iMo5010roundToPx0680j_42;
            horizontalArrangement.arrange(measureScope, i5, iArr, measureScope.getLayoutDirection(), iArr2);
            iM7974getMaxHeightimpl = i5;
        }
        int iM7977getMinWidthimpl = Constraints.m7977getMinWidthimpl(j);
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
        if (i < iM7977getMinWidthimpl) {
            i = iM7977getMinWidthimpl;
        }
        if (i <= iM7975getMaxWidthimpl) {
            iM7975getMaxWidthimpl = i;
        }
        if (zIsHorizontal) {
            i4 = iM7975getMaxWidthimpl;
            i3 = iM7974getMaxHeightimpl;
        } else {
            i3 = iM7975getMaxWidthimpl;
            i4 = iM7974getMaxHeightimpl;
        }
        return MeasureScope.layout$default(measureScope, i4, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                MeasureResult[] measureResultArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i6 = 0; i6 < size; i6++) {
                    measureResultArr[i6].placeChildren();
                }
            }
        }, 4, null);
    }
}
