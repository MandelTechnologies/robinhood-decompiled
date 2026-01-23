package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.Edge;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import com.robinhood.models.serverdriven.experimental.api.LayerConstraint;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.Spacer;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.ZStack;
import com.robinhood.models.serverdriven.experimental.api.ZStackLayer;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiZStack.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiZStack2 {
    public static final SduiZStack2 INSTANCE = new SduiZStack2();
    private static Function2<Composer, Integer, Unit> lambda$80619126 = ComposableLambda3.composableLambdaInstance(80619126, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt$lambda$80619126$1
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
                ComposerKt.traceEventStart(80619126, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt.lambda$80619126.<anonymous> (SduiZStack.kt:149)");
            }
            Text text = new Text(new PlainText("Top left"), null, null, null, null, 30, null);
            Edge edge = Edge.START;
            LayoutAxis layoutAxis = LayoutAxis.HORIZONTAL;
            LayerConstraint layerConstraint = new LayerConstraint(edge, edge, layoutAxis, 4.0f);
            Edge edge2 = Edge.CENTER;
            Edge edge3 = Edge.END;
            LayerConstraint layerConstraint2 = new LayerConstraint(edge2, edge3, layoutAxis, 0.0f);
            LayoutAxis layoutAxis2 = LayoutAxis.VERTICAL;
            SduiZStack7.SduiZStack(new ZStack(extensions2.persistentListOf(new ZStackLayer(text, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint, layerConstraint2, new LayerConstraint(edge, edge, layoutAxis2, 8.0f), new LayerConstraint(edge2, edge3, layoutAxis2, 0.0f)})), new ZStackLayer(new Text(new PlainText("Top right"), null, null, null, null, 30, null), CollectionsKt.listOf((Object[]) new LayerConstraint[]{new LayerConstraint(edge2, edge, layoutAxis, 4.0f), new LayerConstraint(edge3, edge3, layoutAxis, 0.0f), new LayerConstraint(edge, edge, layoutAxis2, 8.0f), new LayerConstraint(edge2, edge3, layoutAxis2, 0.0f)})), new ZStackLayer(new Text(new PlainText("Bottom right"), null, null, null, null, 30, null), CollectionsKt.listOf((Object[]) new LayerConstraint[]{new LayerConstraint(edge2, edge, layoutAxis, 0.0f), new LayerConstraint(edge3, edge3, layoutAxis, -4.0f), new LayerConstraint(edge2, edge, layoutAxis2, 0.0f), new LayerConstraint(edge3, edge3, layoutAxis2, -8.0f)})), new ZStackLayer(new Text(new PlainText("Bottom left"), null, null, null, null, 30, null), CollectionsKt.listOf((Object[]) new LayerConstraint[]{new LayerConstraint(edge, edge, layoutAxis, 4.0f), new LayerConstraint(edge2, edge3, layoutAxis, 0.0f), new LayerConstraint(edge2, edge, layoutAxis2, 0.0f), new LayerConstraint(edge3, edge3, layoutAxis2, -8.0f)})), new ZStackLayer(new Text(new PlainText("Center"), null, null, null, null, 30, null), CollectionsKt.listOf((Object[]) new LayerConstraint[]{new LayerConstraint(edge2, edge2, layoutAxis, 0.0f), new LayerConstraint(edge2, edge2, layoutAxis2, 0.0f)})))), Modifier.INSTANCE, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1347069225 = ComposableLambda3.composableLambdaInstance(1347069225, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt$lambda$1347069225$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            int i2 = 2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1347069225, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt.lambda$1347069225.<anonymous> (SduiZStack.kt:306)");
            }
            LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
            Container container = new Container(extensions2.persistentListOf(new Text(new PlainText("Title"), null, TextAlignment.LEFT, null, null, 26, null), new Spacer(16, new PlatformLayoutAxis(layoutAxis, layoutAxis)), new Text(new PlainText("Message"), null, null, null, null, 30, null), new Spacer(16, new PlatformLayoutAxis(layoutAxis, layoutAxis)), new IconImage(Icon.ARROW_RIGHT_24, null, i2, 0 == true ? 1 : 0)), null, new PlatformLayoutAxis(layoutAxis, layoutAxis), null, SecondaryAxisAlignment.START, 10, null);
            Edge edge = Edge.START;
            LayoutAxis layoutAxis2 = LayoutAxis.HORIZONTAL;
            LayerConstraint layerConstraint = new LayerConstraint(edge, edge, layoutAxis2, 8.0f);
            Edge edge2 = Edge.END;
            SduiZStack7.SduiZStack(new ZStack(extensions2.persistentListOf(new ZStackLayer(container, CollectionsKt.listOf((Object[]) new LayerConstraint[]{layerConstraint, new LayerConstraint(edge2, edge2, layoutAxis2, -120.0f)})))), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2116682007 = ComposableLambda3.composableLambdaInstance(2116682007, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt$lambda$2116682007$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2116682007, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt.lambda$2116682007.<anonymous> (SduiZStack.kt:842)");
            }
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(SduiZStack7.timelineElement1ZStack(), SduiZStack7.timelineElement2ZStack());
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf, Parcelable.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 0, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-525058601, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9101lambda$525058601 = ComposableLambda3.composableLambdaInstance(-525058601, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt$lambda$-525058601$1
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
                ComposerKt.traceEventStart(-525058601, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiZStackKt.lambda$-525058601.<anonymous> (SduiZStack.kt:841)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), SduiZStack2.INSTANCE.getLambda$2116682007$lib_sdui_externalRelease(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-525058601$lib_sdui_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15955getLambda$525058601$lib_sdui_externalRelease() {
        return f9101lambda$525058601;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1347069225$lib_sdui_externalRelease() {
        return lambda$1347069225;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2116682007$lib_sdui_externalRelease() {
        return lambda$2116682007;
    }

    public final Function2<Composer, Integer, Unit> getLambda$80619126$lib_sdui_externalRelease() {
        return lambda$80619126;
    }
}
