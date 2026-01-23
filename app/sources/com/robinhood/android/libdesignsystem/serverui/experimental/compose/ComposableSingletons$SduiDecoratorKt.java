package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.serverdriven.experimental.api.AccessibilityModifier;
import com.robinhood.models.serverdriven.experimental.api.AnalyticsEventDescriptor;
import com.robinhood.models.serverdriven.experimental.api.Border;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.Decorator;
import com.robinhood.models.serverdriven.experimental.api.EducationTourElement;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldShimmer;
import com.robinhood.models.serverdriven.experimental.api.GradientDirection;
import com.robinhood.models.serverdriven.experimental.api.GradientStop;
import com.robinhood.models.serverdriven.experimental.api.GradientWithStops;
import com.robinhood.models.serverdriven.experimental.api.GutterBehavior;
import com.robinhood.models.serverdriven.experimental.api.Insets;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.Sizing;
import com.robinhood.models.serverdriven.experimental.api.SizingPreference;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.Tooltip;
import com.robinhood.models.serverdriven.experimental.api.WindowWidthDependentNumber;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiDecorator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$SduiDecoratorKt {
    public static final ComposableSingletons$SduiDecoratorKt INSTANCE = new ComposableSingletons$SduiDecoratorKt();
    private static Function2<Composer, Integer, Unit> lambda$1983831165 = ComposableLambda3.composableLambdaInstance(1983831165, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt$lambda$1983831165$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983831165, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt.lambda$1983831165.<anonymous> (SduiDecorator.kt:297)");
            }
            Text text = new Text(new PlainText("Hello world!"), null, TextAlignment.LEFT, null, null, 26, null);
            SizingPreference sizingPreference = SizingPreference.MIN;
            String str = null;
            Float f = null;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Decorator(str, text, null, f, null, null, 0, null, null, null, null, null, null, null, null, null, new Sizing(sizingPreference, sizingPreference), null, null, null, null, null, 4128765, null));
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, 100663296, 0);
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

    /* renamed from: lambda$-2144577521, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9100lambda$2144577521 = ComposableLambda3.composableLambdaInstance(-2144577521, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt$lambda$-2144577521$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2144577521, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt.lambda$-2144577521.<anonymous> (SduiDecorator.kt:313)");
            }
            Text text = new Text(new PlainText("Hello world!"), null, TextAlignment.LEFT, null, null, 26, null);
            String str = null;
            Float f = null;
            int i2 = 0;
            Integer num = null;
            Insets insets = null;
            EducationTourElement educationTourElement = null;
            GutterBehavior gutterBehavior = null;
            Parcelable parcelable = null;
            AccessibilityModifier accessibilityModifier = null;
            GoldShimmer goldShimmer = null;
            AnalyticsEventDescriptor analyticsEventDescriptor = null;
            Parcelable parcelable2 = null;
            Integer num2 = null;
            Float f2 = null;
            Tooltip tooltip = null;
            String str2 = null;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Decorator(str, text, null, f, null, null, i2, null, num, insets, educationTourElement, gutterBehavior, parcelable, accessibilityModifier, goldShimmer, analyticsEventDescriptor, new Sizing(SizingPreference.MIN, SizingPreference.MAX), parcelable2, num2, f2, tooltip, str2, 4128765, null));
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, 100663296, 0);
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
    private static Function2<Composer, Integer, Unit> lambda$1573026351 = ComposableLambda3.composableLambdaInstance(1573026351, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt$lambda$1573026351$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            int i2 = 100;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573026351, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt.lambda$1573026351.<anonymous> (SduiDecorator.kt:329)");
            }
            Text text = new Text(new PlainText("Hello world!"), null, TextAlignment.CENTER, null, null, 26, null);
            Color color = Color.f5843BG;
            Border border = new Border(new ThemedColor(color, color), new WindowWidthDependentNumber(1, 1, 1));
            SizingPreference sizingPreference = SizingPreference.UNKNOWN;
            String str = null;
            ThemedColor themedColor = null;
            Float f = null;
            GradientWithStops gradientWithStops = null;
            int i3 = 0;
            Insets insets = null;
            GutterBehavior gutterBehavior = null;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Decorator(str, text, themedColor, f, gradientWithStops, border, i3, i2, i2, insets, null, gutterBehavior, null, null, null, null, new Sizing(sizingPreference, sizingPreference), null, null, null, null, null, 4128349, null));
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, 100859904, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1682348682 = ComposableLambda3.composableLambdaInstance(1682348682, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt$lambda$1682348682$1
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1682348682, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiDecoratorKt.lambda$1682348682.<anonymous> (SduiDecorator.kt:355)");
            }
            PlainText plainText = new PlainText("Hello world!");
            TextAlignment textAlignment = TextAlignment.CENTER;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new Text(plainText, null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null));
            LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
            WindowWidthDependentNumber windowWidthDependentNumber = null;
            PrimaryAxisAlignment primaryAxisAlignment = null;
            Container container = new Container(immutableList3PersistentListOf, windowWidthDependentNumber, new PlatformLayoutAxis(layoutAxis, layoutAxis), primaryAxisAlignment, null, 26, null);
            GradientDirection gradientDirection = GradientDirection.VERTICAL;
            Color color = Color.SOL_LIGHT;
            GradientStop gradientStop = new GradientStop(new ThemedColor(color, color), 0.5f, 0.0f);
            Color color2 = Color.f5843BG;
            String str = null;
            ThemedColor themedColor = null;
            Float f = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Decorator decorator = new Decorator(str, container, themedColor, f, new GradientWithStops(CollectionsKt.listOf((Object[]) new GradientStop[]{gradientStop, new GradientStop(new ThemedColor(color2, color2), 1.0f, 0.2f), new GradientStop(new ThemedColor(color2, color2), 1.0f, 1.0f)}), gradientDirection), null, 0, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194285, null);
            WindowWidthDependentNumber windowWidthDependentNumber2 = null;
            String str2 = null;
            ThemedColor themedColor2 = null;
            Float f2 = null;
            Border border = null;
            int i2 = 0;
            Integer num = null;
            Integer num2 = null;
            Insets insets = null;
            EducationTourElement educationTourElement = null;
            GutterBehavior gutterBehavior = null;
            Parcelable parcelable = null;
            AccessibilityModifier accessibilityModifier = null;
            GoldShimmer goldShimmer = null;
            AnalyticsEventDescriptor analyticsEventDescriptor = null;
            Sizing sizing = null;
            Parcelable parcelable2 = null;
            Integer num3 = null;
            Float f3 = null;
            Tooltip tooltip = null;
            String str3 = null;
            ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(decorator, new Decorator(str2, new Container(extensions2.persistentListOf(new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null), new Text(new PlainText("Hello world!"), null, textAlignment, null, null, 26, null)), windowWidthDependentNumber2, new PlatformLayoutAxis(layoutAxis, layoutAxis), null, null, 26, 0 == true ? 1 : 0), themedColor2, f2, new GradientWithStops(CollectionsKt.listOf((Object[]) new GradientStop[]{new GradientStop(new ThemedColor(color, color), 0.5f, 0.0f), new GradientStop(new ThemedColor(color2, color2), 1.0f, 0.2f), new GradientStop(new ThemedColor(color2, color2), 1.0f, 1.0f)}), GradientDirection.HORIZONTAL), border, i2, num, num2, insets, educationTourElement, gutterBehavior, parcelable, accessibilityModifier, goldShimmer, analyticsEventDescriptor, sizing, parcelable2, num3, f3, tooltip, str3, 4194285, null));
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf2, GenericAction.class, Modifier.INSTANCE, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer, 100859904, 0);
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

    /* renamed from: getLambda$-2144577521$lib_sdui_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15954getLambda$2144577521$lib_sdui_externalRelease() {
        return f9100lambda$2144577521;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1573026351$lib_sdui_externalRelease() {
        return lambda$1573026351;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1682348682$lib_sdui_externalRelease() {
        return lambda$1682348682;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1983831165$lib_sdui_externalRelease() {
        return lambda$1983831165;
    }
}
