package com.robinhood.android.eventcontracts.sharedeventui.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
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
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventLabelTrack.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"EventLabelTrack", "", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Point;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrackKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventLabelTrack {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventLabelTrack$lambda$0(Point point, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventLabelTrack(point, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EventLabelTrack(final Point point, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1166353815);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(point) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1166353815, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack (EventLabelTrack.kt:18)");
            }
            final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrackKt$EventLabelTrack$newStyles$1
                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public AppBarStyle getAppBar(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1883624525);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1883624525, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-appBar> (EventLabelTrack.kt:0)");
                    }
                    AppBarStyle appBar = styles.getAppBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return appBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonStyle getButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1558587571);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1558587571, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-button> (EventLabelTrack.kt:0)");
                    }
                    ButtonStyle button = styles.getButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return button;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonBarStyle getButtonBar(Composer composer2, int i5) {
                    composer2.startReplaceGroup(419577812);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(419577812, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-buttonBar> (EventLabelTrack.kt:0)");
                    }
                    ButtonBarStyle buttonBar = styles.getButtonBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CardStackStyle getCardStackStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(935548699);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(935548699, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-cardStackStyle> (EventLabelTrack.kt:0)");
                    }
                    CardStackStyle cardStackStyle = styles.getCardStackStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return cardStackStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ChartStyle getChart(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-2061949385);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2061949385, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-chart> (EventLabelTrack.kt:0)");
                    }
                    ChartStyle chart = styles.getChart(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return chart;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CheckboxStyle getCheckBox(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1622467804);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1622467804, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-checkBox> (EventLabelTrack.kt:0)");
                    }
                    CheckboxStyle checkBox = styles.getCheckBox(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return checkBox;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i5) {
                    composer2.startReplaceGroup(244738898);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(244738898, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-circularProgressIndicator> (EventLabelTrack.kt:0)");
                    }
                    CircularProgressIndicatorStyle circularProgressIndicator = styles.getCircularProgressIndicator(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return circularProgressIndicator;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CommunicationCardStyle getCommunicationCard(Composer composer2, int i5) {
                    composer2.startReplaceGroup(609208847);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(609208847, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-communicationCard> (EventLabelTrack.kt:0)");
                    }
                    CommunicationCardStyle communicationCard = styles.getCommunicationCard(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return communicationCard;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-2136684067);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2136684067, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-expandableButtonTray> (EventLabelTrack.kt:0)");
                    }
                    ExpandableButtonTrayStyle expandableButtonTray = styles.getExpandableButtonTray(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return expandableButtonTray;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public IconButtonStyle getIconButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-99268436);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-99268436, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-iconButton> (EventLabelTrack.kt:0)");
                    }
                    IconButtonStyle iconButton = styles.getIconButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return iconButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public InfoBannerStyle getInfoBanner(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-38867461);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-38867461, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-infoBanner> (EventLabelTrack.kt:0)");
                    }
                    InfoBannerStyle infoBanner = styles.getInfoBanner(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return infoBanner;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1608955758);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1608955758, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-loadingPlaceholderStyle> (EventLabelTrack.kt:0)");
                    }
                    LoadingPlaceholderStyle loadingPlaceholderStyle = styles.getLoadingPlaceholderStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return loadingPlaceholderStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-627822540);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-627822540, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-markdownSpannedText> (EventLabelTrack.kt:0)");
                    }
                    MarkdownSpannedTextStyle markdownSpannedText = styles.getMarkdownSpannedText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return markdownSpannedText;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1501732780);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1501732780, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-navigationBarStyle> (EventLabelTrack.kt:0)");
                    }
                    NavigationBarStyle navigationBarStyle = styles.getNavigationBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return navigationBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NumpadStyle getNumpad(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-224985682);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-224985682, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-numpad> (EventLabelTrack.kt:0)");
                    }
                    NumpadStyle numpad = styles.getNumpad(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return numpad;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PlaceholderStyle getPlaceholder(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1716693982);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1716693982, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-placeholder> (EventLabelTrack.kt:0)");
                    }
                    PlaceholderStyle placeholder = styles.getPlaceholder(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return placeholder;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PogStyle getPog(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-807057459);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-807057459, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-pog> (EventLabelTrack.kt:0)");
                    }
                    PogStyle pog = styles.getPog(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return pog;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ProgressBarStyle getProgressBarStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(787404877);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(787404877, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-progressBarStyle> (EventLabelTrack.kt:0)");
                    }
                    ProgressBarStyle progressBarStyle = styles.getProgressBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return progressBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RadioButtonStyle getRadioButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1224648584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1224648584, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-radioButton> (EventLabelTrack.kt:0)");
                    }
                    RadioButtonStyle radioButton = styles.getRadioButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return radioButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RowStyle getRow(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-979520709);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-979520709, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-row> (EventLabelTrack.kt:0)");
                    }
                    RowStyle row = styles.getRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return row;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-126290911);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-126290911, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-selectionRowStyle> (EventLabelTrack.kt:0)");
                    }
                    BentoSelectionRowStyle selectionRowStyle = styles.getSelectionRowStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return selectionRowStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public SpanButtonStyle getSpanButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(370364893);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(370364893, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-spanButton> (EventLabelTrack.kt:0)");
                    }
                    SpanButtonStyle spanButton = styles.getSpanButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spanButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextButtonStyle getTextButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(834049248);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(834049248, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-textButton> (EventLabelTrack.kt:0)");
                    }
                    TextButtonStyle textButton = styles.getTextButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextInputStyle getTextInput(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1063892552);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1063892552, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-textInput> (EventLabelTrack.kt:0)");
                    }
                    TextInputStyle textInput = styles.getTextInput(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textInput;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ToggleRowStyle getToggleRow(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1426488367);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1426488367, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-toggleRow> (EventLabelTrack.kt:0)");
                    }
                    ToggleRowStyle toggleRow = styles.getToggleRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return toggleRow;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextStyle getText(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1645016626);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1645016626, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<no name provided>.<get-text> (EventLabelTrack.kt:22)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textStyle = new TextStyle(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i6).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textStyle;
                }
            }), ComposableLambda3.rememberComposableLambda(-1098076759, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrackKt.EventLabelTrack.1
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
                        ComposerKt.traceEventStart(-1098076759, i5, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrack.<anonymous> (EventLabelTrack.kt:30)");
                    }
                    SduiCursorData2.SduiLabelTrack(PaddingKt.m5144paddingVpY3zN4$default(modifier, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null), point, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventLabelTrackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventLabelTrack.EventLabelTrack$lambda$0(point, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
