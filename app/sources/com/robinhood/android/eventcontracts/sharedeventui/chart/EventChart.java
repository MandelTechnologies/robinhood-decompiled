package com.robinhood.android.eventcontracts.sharedeventui.chart;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventChart.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"EventChart", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "colorOverlay", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventChart$lambda$1(Chart chart, EventChartColorOverlay eventChartColorOverlay, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventChart(chart, eventChartColorOverlay, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EventChart(final Chart<? extends Parcelable> chart, final EventChartColorOverlay eventChartColorOverlay, final Function1<? super Point, Unit> onScrub, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Composer composerStartRestartGroup = composer.startRestartGroup(-117583737);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(eventChartColorOverlay) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-117583737, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart (EventChart.kt:24)");
            }
            if (chart == null) {
                composerStartRestartGroup.startReplaceGroup(1756399654);
                Placeholders2.ChartPlaceholder(modifier, false, composerStartRestartGroup, (i3 >> 9) & 14, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1756493057);
                final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(styles);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Styles() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$EventChart$newChartStyles$1$1
                        private final /* synthetic */ Styles $$delegate_0;

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public AppBarStyle getAppBar(Composer composer2, int i5) {
                            composer2.startReplaceGroup(891237433);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(891237433, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-appBar> (EventChart.kt:0)");
                            }
                            AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return appBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonStyle getButton(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1714794809);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714794809, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-button> (EventChart.kt:0)");
                            }
                            ButtonStyle button = this.$$delegate_0.getButton(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return button;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonBarStyle getButtonBar(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1085813978);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1085813978, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-buttonBar> (EventChart.kt:0)");
                            }
                            ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return buttonBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CardStackStyle getCardStackStyle(Composer composer2, int i5) {
                            composer2.startReplaceGroup(869233569);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(869233569, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-cardStackStyle> (EventChart.kt:0)");
                            }
                            CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return cardStackStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CheckboxStyle getCheckBox(Composer composer2, int i5) {
                            composer2.startReplaceGroup(682588202);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(682588202, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-checkBox> (EventChart.kt:0)");
                            }
                            CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return checkBox;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i5) {
                            composer2.startReplaceGroup(53307224);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(53307224, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-circularProgressIndicator> (EventChart.kt:0)");
                            }
                            CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return circularProgressIndicator;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CommunicationCardStyle getCommunicationCard(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-320794475);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-320794475, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-communicationCard> (EventChart.kt:0)");
                            }
                            CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return communicationCard;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i5) {
                            composer2.startReplaceGroup(608042851);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(608042851, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-expandableButtonTray> (EventChart.kt:0)");
                            }
                            ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return expandableButtonTray;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public IconButtonStyle getIconButton(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-1564128846);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1564128846, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-iconButton> (EventChart.kt:0)");
                            }
                            IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return iconButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public InfoBannerStyle getInfoBanner(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-1050740095);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1050740095, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-infoBanner> (EventChart.kt:0)");
                            }
                            InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return infoBanner;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-1162751628);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1162751628, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (EventChart.kt:0)");
                            }
                            LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return loadingPlaceholderStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-1379609286);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1379609286, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-markdownSpannedText> (EventChart.kt:0)");
                            }
                            MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return markdownSpannedText;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i5) {
                            composer2.startReplaceGroup(15832410);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(15832410, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-navigationBarStyle> (EventChart.kt:0)");
                            }
                            NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return navigationBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NumpadStyle getNumpad(Composer composer2, int i5) {
                            composer2.startReplaceGroup(730085300);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(730085300, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-numpad> (EventChart.kt:0)");
                            }
                            NumpadStyle numpad = this.$$delegate_0.getNumpad(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return numpad;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PlaceholderStyle getPlaceholder(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-397182936);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-397182936, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-placeholder> (EventChart.kt:0)");
                            }
                            PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return placeholder;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PogStyle getPog(Composer composer2, int i5) {
                            composer2.startReplaceGroup(273659219);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(273659219, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-pog> (EventChart.kt:0)");
                            }
                            PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return pog;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ProgressBarStyle getProgressBarStyle(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1771013587);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1771013587, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-progressBarStyle> (EventChart.kt:0)");
                            }
                            ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return progressBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RadioButtonStyle getRadioButton(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1835607694);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1835607694, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-radioButton> (EventChart.kt:0)");
                            }
                            RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return radioButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RowStyle getRow(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1364418497);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1364418497, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-row> (EventChart.kt:0)");
                            }
                            RowStyle row = this.$$delegate_0.getRow(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return row;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-725369945);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-725369945, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-selectionRowStyle> (EventChart.kt:0)");
                            }
                            BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return selectionRowStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public SpanButtonStyle getSpanButton(Composer composer2, int i5) {
                            composer2.startReplaceGroup(30443363);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(30443363, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-spanButton> (EventChart.kt:0)");
                            }
                            SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return spanButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextStyle getText(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1386337236);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1386337236, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-text> (EventChart.kt:0)");
                            }
                            TextStyle text = this.$$delegate_0.getText(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return text;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextButtonStyle getTextButton(Composer composer2, int i5) {
                            composer2.startReplaceGroup(220946406);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(220946406, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-textButton> (EventChart.kt:0)");
                            }
                            TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return textButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextInputStyle getTextInput(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1965760702);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1965760702, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-textInput> (EventChart.kt:0)");
                            }
                            TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return textInput;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ToggleRowStyle getToggleRow(Composer composer2, int i5) {
                            composer2.startReplaceGroup(-1135324491);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1135324491, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-toggleRow> (EventChart.kt:0)");
                            }
                            ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return toggleRow;
                        }

                        {
                            this.$$delegate_0 = this.$currentStyles;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ChartStyle getChart(Composer composer2, int i5) {
                            composer2.startReplaceGroup(1714348221);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1714348221, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<no name provided>.<get-chart> (EventChart.kt:32)");
                            }
                            ChartStyle chartStyleM21718copyhLbrIc0$default = ChartStyle.m21718copyhLbrIc0$default(this.$currentStyles.getChart(composer2, 0), 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0L, C2002Dp.m7995constructorimpl(1), 11, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return chartStyleM21718copyhLbrIc0$default;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final EventChart2 eventChart2 = (EventChart2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                EventChartColorOverlay2.ProvideEventChartColors(eventChartColorOverlay, ComposableLambda3.rememberComposableLambda(1507531732, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt.EventChart.1

                    /* compiled from: EventChart.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$EventChart$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Chart<Parcelable> $chart;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function1<Point, Unit> $onScrub;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Chart<? extends Parcelable> chart, Modifier modifier, Function1<? super Point, Unit> function1) {
                            this.$chart = chart;
                            this.$modifier = modifier;
                            this.$onScrub = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, List points) {
                            Intrinsics.checkNotNullParameter(points, "points");
                            function1.invoke(CollectionsKt.lastOrNull(points));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(Function1 function1) {
                            function1.invoke(null);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(473771796, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous>.<anonymous> (EventChart.kt:40)");
                            }
                            List<Line> lines = this.$chart.getLines();
                            List<ChartFill> fills = this.$chart.getFills();
                            List overlays = this.$chart.getOverlays();
                            if (overlays == null) {
                                overlays = CollectionsKt.emptyList();
                            }
                            List list = overlays;
                            SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                            Modifier modifier = this.$modifier;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onScrub);
                            final Function1<Point, Unit> function1 = this.$onScrub;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$EventChart$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventChart.C165991.AnonymousClass1.invoke$lambda$1$lambda$0(function1, (List) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function12 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChanged2 = composer.changed(this.$onScrub);
                            final Function1<Point, Unit> function13 = this.$onScrub;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$EventChart$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventChart.C165991.AnonymousClass1.invoke$lambda$3$lambda$2(function13);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            int i2 = (SduiActionHandler.NotImplemented.$stable << 12) | 1572864;
                            composer.startReplaceGroup(977840936);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<com.robinhood.android.charts.model.Point, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$EventChart$1$1$invoke$$inlined$SduiSegmentedLineChart$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(com.robinhood.android.charts.model.Point it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(com.robinhood.android.charts.model.Point point) {
                                        invoke2(point);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            int i3 = i2 >> 6;
                            SduiChartMappersKt.SduiSegmentedLineChart(modifier, fills, lines, list, notImplemented, (Function1) objRememberedValue3, function12, function0, false, true, null, 0.0f, Parcelable.class, composer, (65534 & i2) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | ((i2 << 9) & 1879048192), (i2 >> 15) & 14, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1507531732, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventChart.<anonymous> (EventChart.kt:39)");
                        }
                        CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(eventChart2), ComposableLambda3.rememberComposableLambda(473771796, true, new AnonymousClass1(chart, modifier, onScrub), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChart.EventChart$lambda$1(chart, eventChartColorOverlay, onScrub, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
