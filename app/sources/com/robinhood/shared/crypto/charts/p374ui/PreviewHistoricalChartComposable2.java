package com.robinhood.shared.crypto.charts.p374ui;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.SolidLineType;
import com.robinhood.models.serverdriven.experimental.api.Spacer;
import com.robinhood.models.serverdriven.experimental.api.Style;
import com.robinhood.models.serverdriven.experimental.api.StylesWithStates;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.WindowWidthDependentNumber;
import com.robinhood.shared.crypto.charts.p374ui.PreviewHistoricalChartComposable2;
import com.robinhood.utils.extensions.ResourceTypes;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PreviewHistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m3636d2 = {"PreviewChartWithPlaceholder", "", "(Landroidx/compose/runtime/Composer;I)V", "createThemedColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "lib-charts-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PreviewHistoricalChartComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartWithPlaceholder$lambda$0(int i, Composer composer, int i2) {
        PreviewChartWithPlaceholder(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void PreviewChartWithPlaceholder(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1307663018);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307663018, i, -1, "com.robinhood.shared.crypto.charts.ui.PreviewChartWithPlaceholder (PreviewHistoricalChartComposable.kt:48)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Point[]{new Point(0.1f, 0.1f, null, 4, null), new Point(0.9f, 0.9f, null, 4, null)});
            Color color = Color.f5853FG;
            List listListOf2 = CollectionsKt.listOf(new Segment(listListOf, new StylesWithStates(new Style(createThemedColor(color), 1.0f, new SolidLineType(0.0f, null, 3, null), null, 8, null), new Style(createThemedColor(color), 1.0f, new SolidLineType(0.0f, null, 3, null), null, 8, null), new Style(createThemedColor(color), 1.0f, new SolidLineType(0.0f, null, 3, null), null, 8, null))));
            Direction direction = Direction.f5855UP;
            Line line = new Line(null, listListOf2, direction, false, 9, null);
            LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
            Spacer spacer = new Spacer(16, new PlatformLayoutAxis(layoutAxis, layoutAxis));
            WindowWidthDependentNumber windowWidthDependentNumber = new WindowWidthDependentNumber(4, 4, 4);
            PlatformLayoutAxis platformLayoutAxis = new PlatformLayoutAxis(layoutAxis, layoutAxis);
            TextStyle textStyle = TextStyle.TEXT_SMALL_BOLD;
            TextAlignment textAlignment = TextAlignment.START;
            final HistoricalChartState historicalChartState = new HistoricalChartState(HistoricalChartComposable.LINE, new CursorData(new DisplayText("Aug 8, 2023", createThemedColor(Color.FG2), null, 4, null), null, null, null, null, new SubDisplayText(new IconDisplayText("$0.00000055 (6.19%)", createThemedColor(Color.X_RAY), Icon.STOCK_UP_12, null, 8, null), null, null, null, 14, null), null, null, null, null, 990, null), extensions2.persistentListOf(), extensions2.persistentListOf(spacer, new Container(CollectionsKt.listOf((Object[]) new MarkdownText[]{new MarkdownText(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, textStyle, textAlignment, createThemedColor(color), null, 16, null), new MarkdownText("Bitcoin", TextStyle.DISPLAY_LARGE, textAlignment, createThemedColor(color), null, 16, null)}), windowWidthDependentNumber, platformLayoutAxis, null, null, 24, null)), false, false, false, extensions2.persistentSetOf(), extensions2.persistentListOf(line), extensions2.persistentListOf(), direction, "$12,345.67", null, BentoTheme4.POSITIVE, null, DisplaySpan.DAY, extensions2.persistentListOf(), null, extensions2.persistentListOf());
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-648857614, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt.PreviewChartWithPlaceholder.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-648857614, i2, -1, "com.robinhood.shared.crypto.charts.ui.PreviewChartWithPlaceholder.<anonymous> (PreviewHistoricalChartComposable.kt:136)");
                    }
                    Markwon markwonCreate = Markwon.create((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    Intrinsics.checkNotNullExpressionValue(markwonCreate, "create(...)");
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{Markdown3.getLocalMarkwon().provides(markwonCreate), BentoSpannedText.getLocalSpannedTextProvider().provides(PreviewHistoricalChartComposable.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-471807182, true, new AnonymousClass1(historicalChartState), composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: PreviewHistoricalChartComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt$PreviewChartWithPlaceholder$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ HistoricalChartState $state;

                    AnonymousClass1(HistoricalChartState historicalChartState) {
                        this.$state = historicalChartState;
                    }

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
                            ComposerKt.traceEventStart(-471807182, i, -1, "com.robinhood.shared.crypto.charts.ui.PreviewChartWithPlaceholder.<anonymous>.<anonymous> (PreviewHistoricalChartComposable.kt:142)");
                        }
                        HistoricalChartState historicalChartState = this.$state;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt$PreviewChartWithPlaceholder$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PreviewHistoricalChartComposable2.C376311.AnonymousClass1.invoke$lambda$1$lambda$0((DisplaySpan) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt$PreviewChartWithPlaceholder$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PreviewHistoricalChartComposable2.C376311.AnonymousClass1.invoke$lambda$3$lambda$2((Point) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function12 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt$PreviewChartWithPlaceholder$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        HistoricalChartComposable2.HistoricalChartComposable(historicalChartState, function1, function12, (Function0) objRememberedValue3, null, composer, 3504, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(DisplaySpan it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(Point point) {
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.charts.ui.PreviewHistoricalChartComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewHistoricalChartComposable2.PreviewChartWithPlaceholder$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ThemedColor createThemedColor(Color color) {
        return new ThemedColor(color, color);
    }
}
