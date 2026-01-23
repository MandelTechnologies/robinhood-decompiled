package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.SecondaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.WeightedContainer;
import com.robinhood.models.serverdriven.experimental.api.WeightedItem;
import com.robinhood.models.serverdriven.experimental.api.WindowWidthDependentNumber;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: SduiContainers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiContainers {
    public static final SduiContainers INSTANCE = new SduiContainers();

    /* renamed from: lambda$-881714374, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9099lambda$881714374 = ComposableLambda3.composableLambdaInstance(-881714374, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt$lambda$-881714374$1
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
                ComposerKt.traceEventStart(-881714374, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt.lambda$-881714374.<anonymous> (SduiContainers.kt:240)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new WeightedItem[]{new WeightedItem(new Text(new PlainText("Hello"), null, null, null, null, 30, null), null), new WeightedItem(new Text(new PlainText("World"), null, null, null, null, 30, null), null)});
            LayoutAxis layoutAxis = LayoutAxis.HORIZONTAL;
            WindowWidthDependentNumber windowWidthDependentNumber = null;
            SduiContainers5.SduiWeightedHorizontalContainer(new WeightedContainer(listListOf, windowWidthDependentNumber, new PlatformLayoutAxis(layoutAxis, layoutAxis), null, 10, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1455254540 = ComposableLambda3.composableLambdaInstance(1455254540, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt$lambda$1455254540$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Float fValueOf = Float.valueOf(1.0f);
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1455254540, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt.lambda$1455254540.<anonymous> (SduiContainers.kt:259)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new WeightedItem[]{new WeightedItem(new Text(new PlainText("Start"), null, null, null, null, 30, null), fValueOf), new WeightedItem(new Text(new PlainText("End"), null, TextAlignment.END, null, null, 26, null), fValueOf)});
            LayoutAxis layoutAxis = LayoutAxis.HORIZONTAL;
            WindowWidthDependentNumber windowWidthDependentNumber = null;
            SecondaryAxisAlignment secondaryAxisAlignment = null;
            SduiContainers5.SduiWeightedHorizontalContainer(new WeightedContainer(listListOf, windowWidthDependentNumber, new PlatformLayoutAxis(layoutAxis, layoutAxis), secondaryAxisAlignment, 10, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1532923320, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9098lambda$1532923320 = ComposableLambda3.composableLambdaInstance(-1532923320, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt$lambda$-1532923320$1
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
                ComposerKt.traceEventStart(-1532923320, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiContainersKt.lambda$-1532923320.<anonymous> (SduiContainers.kt:284)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new WeightedItem[]{new WeightedItem(new Text(new PlainText("Hello"), null, null, null, null, 30, null), null), new WeightedItem(new Text(new PlainText("World"), null, null, null, null, 30, null), null)});
            LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
            WindowWidthDependentNumber windowWidthDependentNumber = null;
            SduiContainers5.SduiWeightedVerticalContainer(new WeightedContainer(listListOf, windowWidthDependentNumber, new PlatformLayoutAxis(layoutAxis, layoutAxis), null, 10, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1532923320$lib_sdui_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15952getLambda$1532923320$lib_sdui_externalRelease() {
        return f9098lambda$1532923320;
    }

    /* renamed from: getLambda$-881714374$lib_sdui_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15953getLambda$881714374$lib_sdui_externalRelease() {
        return f9099lambda$881714374;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1455254540$lib_sdui_externalRelease() {
        return lambda$1455254540;
    }
}
