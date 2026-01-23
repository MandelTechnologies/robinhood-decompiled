package com.robinhood.android.sdui.chartgroup;

import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStack;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStackComponent;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStackHorizontalEdge;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStackPosition;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStackVerticalEdge;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiChartLayeredStack.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0007H\u0002\u001a/\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\"\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"toChartOverlays", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "ActionT", "Landroid/os/Parcelable;", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLayeredStack;", "overlayPosition", "Lcom/robinhood/android/charts/overlay/OverlayPosition;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLayeredStackPosition;", "getOverlayPosition", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartLayeredStackPosition;)Lcom/robinhood/android/charts/overlay/OverlayPosition;", "SduiChartLayeredStack", "", "component", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartLayeredStack;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui-charts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartLayeredStackKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiChartLayeredStack2 {

    /* compiled from: SduiChartLayeredStack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartLayeredStackKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ChartLayeredStackHorizontalEdge.values().length];
            try {
                iArr[ChartLayeredStackHorizontalEdge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartLayeredStackHorizontalEdge.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartLayeredStackHorizontalEdge.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChartLayeredStackVerticalEdge.values().length];
            try {
                iArr2[ChartLayeredStackVerticalEdge.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChartLayeredStackVerticalEdge.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChartLayeredStackVerticalEdge.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiChartLayeredStack$lambda$2(ChartLayeredStack chartLayeredStack, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiChartLayeredStack(chartLayeredStack, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> ImmutableList<Overlays> toChartOverlays(List<? extends UIComponent<? extends ActionT>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ChartLayeredStack) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, toChartOverlays((ChartLayeredStack) it.next()));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    private static final <ActionT extends Parcelable> List<Overlays> toChartOverlays(ChartLayeredStack<? extends ActionT> chartLayeredStack) {
        List<ChartLayeredStackComponent<ActionT>> content = chartLayeredStack.getContent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content, 10));
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            final ChartLayeredStackComponent chartLayeredStackComponent = (ChartLayeredStackComponent) it.next();
            arrayList.add(new Overlays(getOverlayPosition(chartLayeredStackComponent.getPosition()), false, false, ComposableLambda3.composableLambdaInstance(-731006921, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartLayeredStackKt$toChartOverlays$2$1
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
                        ComposerKt.traceEventStart(-731006921, i, -1, "com.robinhood.android.sdui.chartgroup.toChartOverlays.<anonymous>.<anonymous> (SduiChartLayeredStack.kt:35)");
                    }
                    SduiComponent3.SduiComponent(chartLayeredStackComponent.getContent(), null, HorizontalPadding.Default, composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 6, null));
        }
        return arrayList;
    }

    private static final OverlayPosition getOverlayPosition(ChartLayeredStackPosition chartLayeredStackPosition) {
        OverlayPosition.HorizontalAlignment horizontalAlignment;
        OverlayPosition.VerticalAlignment verticalAlignment;
        Point point = new Point(chartLayeredStackPosition.getX(), chartLayeredStackPosition.getY());
        int i = WhenMappings.$EnumSwitchMapping$0[chartLayeredStackPosition.getHorizontal_edge().ordinal()];
        if (i == 1) {
            horizontalAlignment = OverlayPosition.HorizontalAlignment.LEFT;
        } else if (i == 2) {
            horizontalAlignment = OverlayPosition.HorizontalAlignment.RIGHT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalAlignment = OverlayPosition.HorizontalAlignment.CENTER;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[chartLayeredStackPosition.getVertical_edge().ordinal()];
        if (i2 == 1) {
            verticalAlignment = OverlayPosition.VerticalAlignment.TOP;
        } else if (i2 == 2) {
            verticalAlignment = OverlayPosition.VerticalAlignment.BOTTOM;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            verticalAlignment = OverlayPosition.VerticalAlignment.CENTER;
        }
        return new OverlayPosition(point, horizontalAlignment, verticalAlignment);
    }

    @SduiComposable
    public static final <ActionT extends Parcelable> void SduiChartLayeredStack(final ChartLayeredStack<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-156849815);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-156849815, i3, -1, "com.robinhood.android.sdui.chartgroup.SduiChartLayeredStack (SduiChartLayeredStack.kt:59)");
            }
            Overlays2.Overlays(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), toChartOverlays(component), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartLayeredStackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiChartLayeredStack2.SduiChartLayeredStack$lambda$2(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
