package com.robinhood.android.sdui.chartgroup;

import android.annotation.SuppressLint;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.model.Axis;
import com.robinhood.android.charts.model.AxisLabel;
import com.robinhood.android.charts.model.AxisRange;
import com.robinhood.android.charts.model.AxisScrubLabel;
import com.robinhood.android.charts.model.AxisType;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.model.ProtoAxis;
import com.robinhood.android.charts.model.ProtoAxisLabel;
import com.robinhood.android.charts.model.ProtoAxisRange;
import com.robinhood.android.charts.model.ProtoAxisScrubLabel;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ChartAxis.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\r\u001a7\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a7\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"ChartAxis", "", "modifier", "Landroidx/compose/ui/Modifier;", "axis", "Lcom/robinhood/android/charts/model/Axis;", "yAxisLocation", "Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "ChartAxis-5S0dG-Q", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/model/Axis;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/model/ProtoAxis;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/model/ProtoAxis;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "ChartAxisScrubLabel", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "verticalScrubLineDistanceToRightOfChart", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/model/Axis;Lcom/robinhood/android/charts/model/Point;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/model/ProtoAxis;Lcom/robinhood/android/charts/model/Point;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V", "lib-sdui-charts_externalRelease", "parentWidth", "", "labelWidth"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ChartAxisKt {

    /* compiled from: ChartAxis.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AxisType.values().length];
            try {
                iArr[AxisType.f3953X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AxisType.f3954Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxisScrubLabel$lambda$15(Modifier modifier, Axis axis, Point point, Float f, int i, int i2, Composer composer, int i3) {
        ChartAxisScrubLabel(modifier, axis, point, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxisScrubLabel$lambda$27(Modifier modifier, ProtoAxis protoAxis, Point point, Float f, int i, int i2, Composer composer, int i3) {
        ChartAxisScrubLabel(modifier, protoAxis, point, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxis_5S0dG_Q$lambda$1(Modifier modifier, Axis axis, YAxisLocation yAxisLocation, TextAlign textAlign, int i, int i2, Composer composer, int i3) {
        m18517ChartAxis5S0dGQ(modifier, axis, yAxisLocation, textAlign, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxis_5S0dG_Q$lambda$3(Modifier modifier, ProtoAxis protoAxis, YAxisLocation yAxisLocation, TextAlign textAlign, int i, int i2, Composer composer, int i3) {
        m18518ChartAxis5S0dGQ(modifier, protoAxis, yAxisLocation, textAlign, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /* renamed from: ChartAxis-5S0dG-Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18517ChartAxis5S0dGQ(Modifier modifier, final Axis axis, final YAxisLocation yAxisLocation, TextAlign textAlign, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final TextAlign textAlign2;
        Modifier modifier3;
        Iterator it;
        OverlayPosition overlayPosition;
        OverlayPosition.HorizontalAlignment horizontalAlignment;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(yAxisLocation, "yAxisLocation");
        Composer composerStartRestartGroup = composer.startRestartGroup(-217217697);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                textAlign2 = textAlign;
                i3 |= composerStartRestartGroup.changed(textAlign2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    textAlign2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-217217697, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartAxis (ChartAxis.kt:43)");
                }
                composerStartRestartGroup.startReplaceGroup(1707197829);
                List<AxisLabel> labels = axis.getLabels();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
                it = labels.iterator();
                while (it.hasNext()) {
                    final AxisLabel axisLabel = (AxisLabel) it.next();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[axis.getType().ordinal()];
                    if (i7 == 1) {
                        overlayPosition = new OverlayPosition(new Point(axisLabel.getValue(), 1.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.TOP);
                    } else {
                        if (i7 != i5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        YAxisLocation yAxisLocation2 = YAxisLocation.START;
                        Point point = new Point(yAxisLocation != yAxisLocation2 ? 0.0f : 1.0f, axisLabel.getValue());
                        if (yAxisLocation == yAxisLocation2) {
                            horizontalAlignment = OverlayPosition.HorizontalAlignment.RIGHT;
                        } else {
                            horizontalAlignment = OverlayPosition.HorizontalAlignment.LEFT;
                        }
                        overlayPosition = new OverlayPosition(point, horizontalAlignment, OverlayPosition.VerticalAlignment.CENTER);
                    }
                    arrayList.add(new Overlays(overlayPosition, axis.getType() == AxisType.f3954Y && yAxisLocation == YAxisLocation.START, axis.getType() == AxisType.f3953X, ComposableLambda3.rememberComposableLambda(-1654499233, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$ChartAxis$overlays$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1654499233, i8, -1, "com.robinhood.android.sdui.chartgroup.ChartAxis.<anonymous>.<anonymous> (ChartAxis.kt:69)");
                            }
                            String text = axisLabel.getText();
                            long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(axisLabel.getColor(), 0L, composer2, 0, 1);
                            BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(jM18896toComposeColorDefaultediJQMabo), null, UtilKt.getFontWeight(axisLabel.getTextStyle()), null, textAlign2, 0, false, 0, 0, null, 0, UtilKt.getComposeTextStyle(axisLabel.getTextStyle(), composer2, 0), composer2, 0, 0, 8106);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54)));
                    it = it;
                    i5 = 2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Overlays2.Overlays(modifier3, arrayList, composerStartRestartGroup, i3 & 14, 0);
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
                final TextAlign textAlign3 = textAlign2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartAxisKt.ChartAxis_5S0dG_Q$lambda$1(modifier4, axis, yAxisLocation, textAlign3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        textAlign2 = textAlign;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1707197829);
            List<AxisLabel> labels2 = axis.getLabels();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels2, 10));
            it = labels2.iterator();
            while (it.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Overlays2.Overlays(modifier3, arrayList2, composerStartRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /* renamed from: ChartAxis-5S0dG-Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18518ChartAxis5S0dGQ(Modifier modifier, final ProtoAxis axis, final YAxisLocation yAxisLocation, TextAlign textAlign, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final TextAlign textAlign2;
        Modifier modifier3;
        Iterator it;
        OverlayPosition overlayPosition;
        OverlayPosition.HorizontalAlignment horizontalAlignment;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(yAxisLocation, "yAxisLocation");
        Composer composerStartRestartGroup = composer.startRestartGroup(838721299);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(yAxisLocation.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                textAlign2 = textAlign;
                i3 |= composerStartRestartGroup.changed(textAlign2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    textAlign2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(838721299, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartAxis (ChartAxis.kt:91)");
                }
                composerStartRestartGroup.startReplaceGroup(-1442675987);
                List<ProtoAxisLabel> labels = axis.getLabels();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
                it = labels.iterator();
                while (it.hasNext()) {
                    final ProtoAxisLabel protoAxisLabel = (ProtoAxisLabel) it.next();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[axis.getType().ordinal()];
                    if (i7 == 1) {
                        overlayPosition = new OverlayPosition(new Point(protoAxisLabel.getValue(), 1.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.TOP);
                    } else {
                        if (i7 != i5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        YAxisLocation yAxisLocation2 = YAxisLocation.START;
                        Point point = new Point(yAxisLocation != yAxisLocation2 ? 0.0f : 1.0f, protoAxisLabel.getValue());
                        if (yAxisLocation == yAxisLocation2) {
                            horizontalAlignment = OverlayPosition.HorizontalAlignment.RIGHT;
                        } else {
                            horizontalAlignment = OverlayPosition.HorizontalAlignment.LEFT;
                        }
                        overlayPosition = new OverlayPosition(point, horizontalAlignment, OverlayPosition.VerticalAlignment.CENTER);
                    }
                    arrayList.add(new Overlays(overlayPosition, axis.getType() == AxisType.f3954Y && yAxisLocation == YAxisLocation.START, axis.getType() == AxisType.f3953X, ComposableLambda3.rememberComposableLambda(1581781317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$ChartAxis$overlays$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1581781317, i8, -1, "com.robinhood.android.sdui.chartgroup.ChartAxis.<anonymous>.<anonymous> (ChartAxis.kt:117)");
                            }
                            String text = protoAxisLabel.getText();
                            long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(protoAxisLabel.getColor(), 0L, composer2, 0, 1);
                            BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, UtilKt.getFontWeight(protoAxisLabel.getTextStyle()), null, textAlign2, 0, false, 0, 0, null, 0, UtilKt.getComposeTextStyle(protoAxisLabel.getTextStyle(), composer2, 0), composer2, 0, 0, 8106);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54)));
                    it = it;
                    i5 = 2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Overlays2.Overlays(modifier3, arrayList, composerStartRestartGroup, i3 & 14, 0);
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
                final TextAlign textAlign3 = textAlign2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartAxisKt.ChartAxis_5S0dG_Q$lambda$3(modifier4, axis, yAxisLocation, textAlign3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        textAlign2 = textAlign;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1442675987);
            List<ProtoAxisLabel> labels2 = axis.getLabels();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels2, 10));
            it = labels2.iterator();
            while (it.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Overlays2.Overlays(modifier3, arrayList2, composerStartRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartAxisScrubLabel(Modifier modifier, final Axis axis, Point point, Float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Float f2;
        Modifier modifier3;
        Point point2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean z;
        String text;
        Tuples3 tuples3;
        boolean z2;
        Overlays overlays;
        String labelByNormalizedValue;
        AxisRange<?> effectiveRange;
        boolean zIsWithinRange;
        final Point point3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(axis, "axis");
        Composer composerStartRestartGroup = composer.startRestartGroup(238882869);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(point) : composerStartRestartGroup.changedInstance(point) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                point2 = i5 == 0 ? null : point;
                if (i6 != 0) {
                    f2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(238882869, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartAxisScrubLabel (ChartAxis.kt:139)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = f2 != null && ((float) (snapshotIntState22.getIntValue() - snapshotIntState2.getIntValue())) > f2.floatValue();
                composerStartRestartGroup.startReplaceGroup(1933190917);
                if (point2 != null) {
                    z2 = true;
                    overlays = null;
                } else {
                    int i7 = WhenMappings.$EnumSwitchMapping$0[axis.getType().ordinal()];
                    if (i7 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1987031237);
                        List<AxisScrubLabel> scrubLabels = axis.getScrubLabels();
                        float x = point2.getX();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Float.valueOf(ChartAxisKt.ChartAxisScrubLabel$lambda$12$lambda$11$lambda$10((AxisScrubLabel) obj));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AxisScrubLabel axisScrubLabel = (AxisScrubLabel) com.robinhood.android.charts.segmented.UtilKt.getClosestItemByValue(scrubLabels, x, (Function1) objRememberedValue3);
                        z = z3;
                        OverlayPosition overlayPosition = new OverlayPosition(new Point(axisScrubLabel != null ? axisScrubLabel.getValue() : point2.getX(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM);
                        if (axisScrubLabel == null || (text = axisScrubLabel.getText()) == null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            text = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(point2.getX())}, 1));
                            Intrinsics.checkNotNullExpressionValue(text, "format(...)");
                        }
                        ThemedColor color = axisScrubLabel != null ? axisScrubLabel.getColor() : null;
                        Tuples3 tuples32 = new Tuples3(overlayPosition, text, color == null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0));
                        composerStartRestartGroup.endReplaceGroup();
                        tuples3 = tuples32;
                    } else {
                        if (i7 != 2) {
                            composerStartRestartGroup.startReplaceGroup(905732681);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1986343285);
                        AxisRange<?> range = axis.getRange();
                        if (range == null || (labelByNormalizedValue = range.getLabelByNormalizedValue(point2.getY())) == null) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            labelByNormalizedValue = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(point2.getY())}, 1));
                            Intrinsics.checkNotNullExpressionValue(labelByNormalizedValue, "format(...)");
                        }
                        tuples3 = new Tuples3(new OverlayPosition(Point.copy$default(point2, 0.0f, 0.0f, 2, null), OverlayPosition.HorizontalAlignment.LEFT, OverlayPosition.VerticalAlignment.CENTER), labelByNormalizedValue, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()));
                        composerStartRestartGroup.endReplaceGroup();
                        z = z3;
                    }
                    z2 = true;
                    overlays = new Overlays((OverlayPosition) tuples3.component1(), true, true, ComposableLambda3.rememberComposableLambda(392110344, true, new ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$1$1(z, (Color) tuples3.component3(), (String) tuples3.component2(), axis, snapshotIntState22, snapshotIntState2), composerStartRestartGroup, 54));
                }
                composerStartRestartGroup.endReplaceGroup();
                AxisRange<?> range2 = axis.getRange();
                effectiveRange = axis.getEffectiveRange();
                if (effectiveRange != null || range2 == null || point2 == null) {
                    zIsWithinRange = z2;
                    if (zIsWithinRange) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChartAxisKt.ChartAxisScrubLabel$lambda$14$lambda$13(snapshotIntState2, (IntSize) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Overlays2.Overlays(OnRemeasuredModifier2.onSizeChanged(modifier3, (Function1) objRememberedValue4), CollectionsKt.listOfNotNull(overlays), composerStartRestartGroup, Overlays.$stable << 3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                } else {
                    if ((effectiveRange instanceof AxisRange.MoneyAxisRange) && (range2 instanceof AxisRange.MoneyAxisRange)) {
                        zIsWithinRange = ((AxisRange.MoneyAxisRange) effectiveRange).isWithinRange(((AxisRange.MoneyAxisRange) range2).getValueByNormalizedValue(point2.getY()));
                    } else if ((effectiveRange instanceof AxisRange.UnitlessAxisRange) && (range2 instanceof AxisRange.UnitlessAxisRange)) {
                        zIsWithinRange = ((AxisRange.UnitlessAxisRange) effectiveRange).isWithinRange(((AxisRange.UnitlessAxisRange) range2).getValueByNormalizedValue(point2.getY()).floatValue());
                    }
                    if (zIsWithinRange) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                point3 = point;
                modifier4 = modifier2;
            }
            final Float f3 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartAxisKt.ChartAxisScrubLabel$lambda$15(modifier4, axis, point3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f2 = f;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (f2 != null) {
                composerStartRestartGroup.startReplaceGroup(1933190917);
                if (point2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AxisRange<?> range22 = axis.getRange();
                effectiveRange = axis.getEffectiveRange();
                if (effectiveRange != null) {
                    zIsWithinRange = z2;
                    if (zIsWithinRange) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                }
            }
        }
        final Float f32 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChartAxisScrubLabel$lambda$12$lambda$11$lambda$10(AxisScrubLabel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxisScrubLabel$lambda$14$lambda$13(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    @SuppressLint({"DefaultLocale"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartAxisScrubLabel(Modifier modifier, final ProtoAxis axis, Point point, Float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Float f2;
        Modifier modifier3;
        Point point2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean z;
        String text;
        Tuples3 tuples3;
        boolean z2;
        Overlays overlays;
        String labelByNormalizedValue;
        ProtoAxisRange<?> effectiveRange;
        boolean zIsWithinRange;
        final Point point3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(axis, "axis");
        Composer composerStartRestartGroup = composer.startRestartGroup(829887699);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(axis) : composerStartRestartGroup.changedInstance(axis) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(point) : composerStartRestartGroup.changedInstance(point) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                point2 = i5 == 0 ? null : point;
                if (i6 != 0) {
                    f2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(829887699, i3, -1, "com.robinhood.android.sdui.chartgroup.ChartAxisScrubLabel (ChartAxis.kt:252)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = f2 != null && ((float) (snapshotIntState22.getIntValue() - snapshotIntState2.getIntValue())) > f2.floatValue();
                composerStartRestartGroup.startReplaceGroup(-1341816649);
                if (point2 != null) {
                    z2 = true;
                    overlays = null;
                } else {
                    int i7 = WhenMappings.$EnumSwitchMapping$0[axis.getType().ordinal()];
                    if (i7 == 1) {
                        composerStartRestartGroup.startReplaceGroup(1093423139);
                        List<ProtoAxisScrubLabel> scrubLabels = axis.getScrubLabels();
                        float x = point2.getX();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Float.valueOf(ChartAxisKt.ChartAxisScrubLabel$lambda$24$lambda$23$lambda$22((ProtoAxisScrubLabel) obj));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ProtoAxisScrubLabel protoAxisScrubLabel = (ProtoAxisScrubLabel) com.robinhood.android.charts.segmented.UtilKt.getClosestItemByValue(scrubLabels, x, (Function1) objRememberedValue3);
                        z = z3;
                        OverlayPosition overlayPosition = new OverlayPosition(new Point(protoAxisScrubLabel != null ? protoAxisScrubLabel.getValue() : point2.getX(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM);
                        if (protoAxisScrubLabel == null || (text = protoAxisScrubLabel.getText()) == null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            text = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(point2.getX())}, 1));
                            Intrinsics.checkNotNullExpressionValue(text, "format(...)");
                        }
                        ThemedColorDto color = protoAxisScrubLabel != null ? protoAxisScrubLabel.getColor() : null;
                        Tuples3 tuples32 = new Tuples3(overlayPosition, text, color == null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0));
                        composerStartRestartGroup.endReplaceGroup();
                        tuples3 = tuples32;
                    } else {
                        if (i7 != 2) {
                            composerStartRestartGroup.startReplaceGroup(1005102197);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1094111711);
                        ProtoAxisRange<?> range = axis.getRange();
                        if (range == null || (labelByNormalizedValue = range.getLabelByNormalizedValue(point2.getY())) == null) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            labelByNormalizedValue = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(point2.getY())}, 1));
                            Intrinsics.checkNotNullExpressionValue(labelByNormalizedValue, "format(...)");
                        }
                        tuples3 = new Tuples3(new OverlayPosition(Point.copy$default(point2, 0.0f, 0.0f, 2, null), OverlayPosition.HorizontalAlignment.LEFT, OverlayPosition.VerticalAlignment.CENTER), labelByNormalizedValue, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()));
                        composerStartRestartGroup.endReplaceGroup();
                        z = z3;
                    }
                    z2 = true;
                    overlays = new Overlays((OverlayPosition) tuples3.component1(), true, true, ComposableLambda3.rememberComposableLambda(1127059424, true, new ChartAxisKt$ChartAxisScrubLabel$scrubLabelOverlay$2$1(z, (Color) tuples3.component3(), (String) tuples3.component2(), axis, snapshotIntState22, snapshotIntState2), composerStartRestartGroup, 54));
                }
                composerStartRestartGroup.endReplaceGroup();
                ProtoAxisRange<?> range2 = axis.getRange();
                effectiveRange = axis.getEffectiveRange();
                if (effectiveRange != null || range2 == null || point2 == null) {
                    zIsWithinRange = z2;
                    if (zIsWithinRange) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChartAxisKt.ChartAxisScrubLabel$lambda$26$lambda$25(snapshotIntState2, (IntSize) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Overlays2.Overlays(OnRemeasuredModifier2.onSizeChanged(modifier3, (Function1) objRememberedValue4), CollectionsKt.listOfNotNull(overlays), composerStartRestartGroup, Overlays.$stable << 3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                } else {
                    if ((effectiveRange instanceof ProtoAxisRange.MoneyAxisRange) && (range2 instanceof ProtoAxisRange.MoneyAxisRange)) {
                        zIsWithinRange = ((ProtoAxisRange.MoneyAxisRange) effectiveRange).isWithinRange(((ProtoAxisRange.MoneyAxisRange) range2).getValueByNormalizedValue(point2.getY()));
                    } else if ((effectiveRange instanceof ProtoAxisRange.UnitlessAxisRange) && (range2 instanceof ProtoAxisRange.UnitlessAxisRange)) {
                        zIsWithinRange = ((ProtoAxisRange.UnitlessAxisRange) effectiveRange).isWithinRange(((ProtoAxisRange.UnitlessAxisRange) range2).getValueByNormalizedValue(point2.getY()).floatValue());
                    }
                    if (zIsWithinRange) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                point3 = point;
                modifier4 = modifier2;
            }
            final Float f3 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.ChartAxisKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartAxisKt.ChartAxisScrubLabel$lambda$27(modifier4, axis, point3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f2 = f;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (f2 != null) {
                composerStartRestartGroup.startReplaceGroup(-1341816649);
                if (point2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ProtoAxisRange<?> range22 = axis.getRange();
                effectiveRange = axis.getEffectiveRange();
                if (effectiveRange != null) {
                    zIsWithinRange = z2;
                    if (zIsWithinRange) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    point3 = point2;
                    modifier4 = modifier3;
                }
            }
        }
        final Float f32 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChartAxisScrubLabel$lambda$24$lambda$23$lambda$22(ProtoAxisScrubLabel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartAxisScrubLabel$lambda$26$lambda$25(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }
}
