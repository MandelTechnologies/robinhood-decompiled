package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.util.StaleState;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.MarkdownWithTrailingAction2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponent;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCells;
import com.robinhood.android.libdesignsystem.serverui.experimental.cryptohistory.SduiCryptoComposables;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.models.serverdriven.experimental.api.AccordionRow;
import com.robinhood.models.serverdriven.experimental.api.ActivityFeedRow;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.AspectFitRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.AspectRatioRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.BookCoverText;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.ChartKeyPoint;
import com.robinhood.models.serverdriven.experimental.api.ChartLayeredStack;
import com.robinhood.models.serverdriven.experimental.api.ChartOverlayIcon;
import com.robinhood.models.serverdriven.experimental.api.ChartPulsingDot;
import com.robinhood.models.serverdriven.experimental.api.Checkbox;
import com.robinhood.models.serverdriven.experimental.api.Chip;
import com.robinhood.models.serverdriven.experimental.api.ChipGrid;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.CryptoTokenPill;
import com.robinhood.models.serverdriven.experimental.api.DataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.DataRowGrid;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.DayTradeBubblesContainer;
import com.robinhood.models.serverdriven.experimental.api.DayTradeCounter;
import com.robinhood.models.serverdriven.experimental.api.Decorator;
import com.robinhood.models.serverdriven.experimental.api.DividerLine;
import com.robinhood.models.serverdriven.experimental.api.ElevatedCard;
import com.robinhood.models.serverdriven.experimental.api.ExpandableMarkdownText;
import com.robinhood.models.serverdriven.experimental.api.FeatureCard;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery;
import com.robinhood.models.serverdriven.experimental.api.FloatingValueProp;
import com.robinhood.models.serverdriven.experimental.api.ForeignCurrencyConversionInfo;
import com.robinhood.models.serverdriven.experimental.api.FundamentalsDataRowGrid;
import com.robinhood.models.serverdriven.experimental.api.GoldButton;
import com.robinhood.models.serverdriven.experimental.api.GradientText;
import com.robinhood.models.serverdriven.experimental.api.Grid;
import com.robinhood.models.serverdriven.experimental.api.GutterBehavior;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailHeader;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailRowsSection;
import com.robinhood.models.serverdriven.experimental.api.HorizontalScrollContainer;
import com.robinhood.models.serverdriven.experimental.api.IconButton;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.InlineDefinitionView;
import com.robinhood.models.serverdriven.experimental.api.InlineExpandableLabel;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowCapsule;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowCard;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowChip;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowChipGrid;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowHeader;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowLayoutContainer;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowSingleInstrument;
import com.robinhood.models.serverdriven.experimental.api.LoadingSpinner;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferAnimatedText;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferBarLarge;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferBarSmall;
import com.robinhood.models.serverdriven.experimental.api.MarginHubBufferView;
import com.robinhood.models.serverdriven.experimental.api.MarginIcon;
import com.robinhood.models.serverdriven.experimental.api.MarginRequirementPollableCell;
import com.robinhood.models.serverdriven.experimental.api.MarginRequirementPollableHeader;
import com.robinhood.models.serverdriven.experimental.api.MarginStatusCardContent;
import com.robinhood.models.serverdriven.experimental.api.MarginTieredInterestRates;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.models.serverdriven.experimental.api.NavigationRow;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithEndButton;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithEndIcon;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithEndText;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithIcon;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithIconAndEndText;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithPhotoAndEndText;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithPogGroupAndEndText;
import com.robinhood.models.serverdriven.experimental.api.NumberPog;
import com.robinhood.models.serverdriven.experimental.api.PaginatedList;
import com.robinhood.models.serverdriven.experimental.api.PathfinderRecentOrders;
import com.robinhood.models.serverdriven.experimental.api.PogGroup;
import com.robinhood.models.serverdriven.experimental.api.PogWithPictogram;
import com.robinhood.models.serverdriven.experimental.api.PositionListItem;
import com.robinhood.models.serverdriven.experimental.api.ProtoComponent;
import com.robinhood.models.serverdriven.experimental.api.ReactiveButton;
import com.robinhood.models.serverdriven.experimental.api.ReactiveComponent;
import com.robinhood.models.serverdriven.experimental.api.RecommendationsAllocationRow;
import com.robinhood.models.serverdriven.experimental.api.RecurringInsightsHeader;
import com.robinhood.models.serverdriven.experimental.api.RecurringInsightsLayoutContainer;
import com.robinhood.models.serverdriven.experimental.api.RecurringInsightsVisualization;
import com.robinhood.models.serverdriven.experimental.api.RelativeHeightContainer;
import com.robinhood.models.serverdriven.experimental.api.RemoteLottie;
import com.robinhood.models.serverdriven.experimental.api.RetirementContributionRow;
import com.robinhood.models.serverdriven.experimental.api.ScatterChart;
import com.robinhood.models.serverdriven.experimental.api.ScatterChartLegend;
import com.robinhood.models.serverdriven.experimental.api.SelectRow;
import com.robinhood.models.serverdriven.experimental.api.SettingsRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.SettingsRowStacked;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow;
import com.robinhood.models.serverdriven.experimental.api.Spacer;
import com.robinhood.models.serverdriven.experimental.api.StockListItem;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import com.robinhood.models.serverdriven.experimental.api.TableDailyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableInstrumentName;
import com.robinhood.models.serverdriven.experimental.api.TableMonthlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableSharePriceItem;
import com.robinhood.models.serverdriven.experimental.api.TableSparklineItem;
import com.robinhood.models.serverdriven.experimental.api.TableThreeMonthPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableWeeklyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableYearlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextArea;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.api.TextInput;
import com.robinhood.models.serverdriven.experimental.api.TextPog;
import com.robinhood.models.serverdriven.experimental.api.ThemedComponent;
import com.robinhood.models.serverdriven.experimental.api.Timeline;
import com.robinhood.models.serverdriven.experimental.api.TradeSharingTimeline;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.api.UpsellNavigationRowWithInfoTag;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithNumber;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithPictogram;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithPictogramAndRichText;
import com.robinhood.models.serverdriven.experimental.api.WeightedContainer;
import com.robinhood.models.serverdriven.experimental.api.WelcomeTakeoverHeroLayout;
import com.robinhood.models.serverdriven.experimental.api.ZStack;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a<\u0010\u000b\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"SduiComponent", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "InlineSduiComponent", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiComponent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiComponent$lambda$0(UIComponent uIComponent, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiComponent(uIComponent, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiComponent(final UIComponent<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        HorizontalPadding horizontalPadding2;
        Modifier modifier3;
        HorizontalPadding horizontalPadding3;
        Modifier modifier4;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ4;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ5;
        Composer composer2;
        final Modifier modifier5;
        final HorizontalPadding horizontalPadding4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(783239960);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding5 = i4 == 0 ? HorizontalPadding.None : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(783239960, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent (SduiComponent.kt:155)");
                }
                composerStartRestartGroup.startReplaceGroup(1074335805);
                HorizontalPadding horizontalPadding6 = HorizontalPadding.Default;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ6 = horizontalPadding5 != horizontalPadding6 ? PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier6, 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 1) : modifier6;
                composerStartRestartGroup.endReplaceGroup();
                if (component instanceof AccordionRow) {
                    horizontalPadding2 = horizontalPadding5;
                    if (component instanceof AspectFillRemoteImage) {
                        composerStartRestartGroup.startReplaceGroup(1074344614);
                        modifier4 = modifier6;
                        RemoteImageRenderer.SduiAspectFillRemoteImage((AspectFillRemoteImage) component, modifier4, false, null, composerStartRestartGroup, i3 & 112, 12);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component instanceof AspectFitRemoteImage) {
                        composerStartRestartGroup.startReplaceGroup(1074347237);
                        modifier4 = modifier6;
                        RemoteImageRenderer.SduiAspectFitRemoteImage((AspectFitRemoteImage) component, modifier4, false, composerStartRestartGroup, i3 & 112, 4);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component instanceof AspectRatioRemoteImage) {
                        composerStartRestartGroup.startReplaceGroup(1074349895);
                        modifier4 = modifier6;
                        RemoteImageRenderer.SduiAspectRatioRemoteImage((AspectRatioRemoteImage) component, modifier4, false, composerStartRestartGroup, i3 & 112, 4);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        Modifier modifier7 = modifier6;
                        if (component instanceof BookCoverText) {
                            composerStartRestartGroup.startReplaceGroup(1074352335);
                            SduiBookCoverText2.SduiBookCoverText((BookCoverText) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof Button) {
                            composerStartRestartGroup.startReplaceGroup(1074354792);
                            SduiButton2.SduiButton((Button) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof ChartGroup) {
                            composerStartRestartGroup.startReplaceGroup(1074357142);
                            SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof ChartLayeredStack) {
                            composerStartRestartGroup.startReplaceGroup(1074360598);
                            SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof ChartPulsingDot) {
                            composerStartRestartGroup.startReplaceGroup(-1054452382);
                            if (!((StaleState) composerStartRestartGroup.consume(StaleState2.getLocalStaleState())).getEnabled()) {
                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof Checkbox) {
                            composerStartRestartGroup.startReplaceGroup(1074369141);
                            SduiCheckbox2.SduiCheckbox((Checkbox) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof CryptoDemeterDataRowCondensed) {
                            composerStartRestartGroup.startReplaceGroup(1074372529);
                            SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof Chip) {
                            composerStartRestartGroup.startReplaceGroup(1074374982);
                            SduiChip2.SduiChip((Chip) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof ChipGrid) {
                            composerStartRestartGroup.startReplaceGroup(1074377226);
                            SduiChip2.SduiChipGrid((ChipGrid) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof Container) {
                            composerStartRestartGroup.startReplaceGroup(1074379627);
                            SduiContainers5.SduiContainer((Container) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof DataRowCondensed) {
                            composerStartRestartGroup.startReplaceGroup(1074382292);
                            modifier4 = modifier7;
                            SduiDataRow.SduiCondensedDataRow((DataRowCondensed) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (component instanceof DataRowGrid) {
                            composerStartRestartGroup.startReplaceGroup(1074385069);
                            SduiDataRow.SduiDataRowGrid((DataRowGrid) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            modifier4 = modifier7;
                            horizontalPadding2 = horizontalPadding2;
                        } else if (component instanceof DataRowStacked) {
                            composerStartRestartGroup.startReplaceGroup(1074387730);
                            modifier4 = modifier7;
                            SduiDataRow.SduiStackedDataRow((DataRowStacked) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                            horizontalPadding2 = horizontalPadding2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            Modifier modifier8 = modifier7;
                            horizontalPadding2 = horizontalPadding2;
                            if (component instanceof DayTradeBubblesContainer) {
                                composerStartRestartGroup.startReplaceGroup(1074390847);
                                SduiDayTradeBubblesContainer2.SduiDayTradeBubblesContainer((DayTradeBubblesContainer) component, null, composerStartRestartGroup, 0, 2);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof Decorator) {
                                composerStartRestartGroup.startReplaceGroup(1074393017);
                                Decorator decorator = (Decorator) component;
                                GutterBehavior gutter_behavior = decorator.getGutter_behavior();
                                if (gutter_behavior != null && gutter_behavior.getNo_gutter_horizontal()) {
                                    modifierM21623defaultHorizontalPaddingrAjV9yQ6 = modifier8;
                                }
                                SduiDecoratorKt.SduiDecorator(decorator, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof DividerLine) {
                                composerStartRestartGroup.startReplaceGroup(1074398936);
                                SduiDivider.SduiDivider((DividerLine) component, modifier8, composerStartRestartGroup, i3 & 112, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof ExpandableMarkdownText) {
                                composerStartRestartGroup.startReplaceGroup(1074401208);
                                SduiExpandableMarkdownText2.SduiExpandableMarkdownText((ExpandableMarkdownText) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof FeatureCard) {
                                composerStartRestartGroup.startReplaceGroup(1074404086);
                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof FeatureDiscovery) {
                                composerStartRestartGroup.startReplaceGroup(1074406070);
                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof ForeignCurrencyConversionInfo) {
                                composerStartRestartGroup.startReplaceGroup(1074408497);
                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof FundamentalsDataRowGrid) {
                                composerStartRestartGroup.startReplaceGroup(1074411550);
                                SduiFundamentalsDataRowGrid2.SduiFundamentalsDataRowGrid((FundamentalsDataRowGrid) component, null, composerStartRestartGroup, 0, 2);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof GoldButton) {
                                composerStartRestartGroup.startReplaceGroup(1074413617);
                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof Grid) {
                                composerStartRestartGroup.startReplaceGroup(1074416070);
                                SduiContainers5.SduiGrid((Grid) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof HistoryDetailHeader) {
                                composerStartRestartGroup.startReplaceGroup(1074418683);
                                SduiCryptoComposables.SduiCryptoHistoryDetailHeader((HistoryDetailHeader) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof HistoryDetailRowsSection) {
                                composerStartRestartGroup.startReplaceGroup(1074422105);
                                SduiCryptoComposables.SduiCryptoHistoryDetailRows((HistoryDetailRowsSection) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof HorizontalScrollContainer) {
                                composerStartRestartGroup.startReplaceGroup(1074425468);
                                SduiHorizontalScrollContainer2.HorizontalScrollContainer((HorizontalScrollContainer) component, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof IconButton) {
                                composerStartRestartGroup.startReplaceGroup(1074427666);
                                IconButton iconButton = (IconButton) component;
                                composerStartRestartGroup.startReplaceGroup(1074429949);
                                if (horizontalPadding2 == horizontalPadding6) {
                                    modifierM21623defaultHorizontalPaddingrAjV9yQ5 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                                } else {
                                    modifierM21623defaultHorizontalPaddingrAjV9yQ5 = Modifier.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                SduiIconButton2.SduiIconButton(iconButton, modifierM21623defaultHorizontalPaddingrAjV9yQ5, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof IconImage) {
                                composerStartRestartGroup.startReplaceGroup(1074436492);
                                IconImage iconImage = (IconImage) component;
                                composerStartRestartGroup.startReplaceGroup(1074438589);
                                if (horizontalPadding2 == horizontalPadding6) {
                                    modifierM21623defaultHorizontalPaddingrAjV9yQ4 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                                } else {
                                    modifierM21623defaultHorizontalPaddingrAjV9yQ4 = Modifier.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                SduiIcon2.SduiIcon(iconImage, modifierM21623defaultHorizontalPaddingrAjV9yQ4, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InfoBanner) {
                                composerStartRestartGroup.startReplaceGroup(1074444972);
                                SduiInfoBanner2.SduiInfoBanner((InfoBanner) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InfoTag) {
                                composerStartRestartGroup.startReplaceGroup(1074447369);
                                SduiInfoTag2.SduiInfoTag((InfoTag) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InvestFlowCapsule) {
                                composerStartRestartGroup.startReplaceGroup(1074450001);
                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InvestFlowCard) {
                                composerStartRestartGroup.startReplaceGroup(1074452758);
                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InvestFlowChip) {
                                composerStartRestartGroup.startReplaceGroup(1074454678);
                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof InvestFlowHeader) {
                                composerStartRestartGroup.startReplaceGroup(1074456689);
                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (component instanceof LoadingSpinner) {
                                composerStartRestartGroup.startReplaceGroup(1074459445);
                                SduiLoadingSpinner2.SduiLoadingSpinner((LoadingSpinner) component, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (component instanceof MarkdownText) {
                                    composerStartRestartGroup.startReplaceGroup(1074461294);
                                    horizontalPadding3 = horizontalPadding2;
                                    modifier3 = modifier8;
                                    SduiMarkdownText2.SduiMarkdownText((MarkdownText) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, 0, 0, composerStartRestartGroup, 0, 28);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    modifier3 = modifier8;
                                    horizontalPadding3 = horizontalPadding2;
                                    if (component instanceof MarkdownWithTrailingAction) {
                                        composerStartRestartGroup.startReplaceGroup(1074464380);
                                        MarkdownWithTrailingAction2.SduiMarkdownWithTrailingAction((MarkdownWithTrailingAction) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else if (component instanceof MarginTieredInterestRates) {
                                        composerStartRestartGroup.startReplaceGroup(1074467857);
                                        SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else if (component instanceof NavigationRow) {
                                        composerStartRestartGroup.startReplaceGroup(1074470609);
                                        modifier4 = modifier3;
                                        SduiNavigationRow2.SduiNavigationRow((NavigationRow) component, modifier4, horizontalPadding3, composerStartRestartGroup, i3 & 1008, 0);
                                        horizontalPadding2 = horizontalPadding3;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        horizontalPadding2 = horizontalPadding3;
                                        if (component instanceof NavigationRowWithEndText) {
                                            composerStartRestartGroup.startReplaceGroup(1074473724);
                                            modifier4 = modifier3;
                                            SduiNavigationRow2.SduiNavigationRowWithEndText((NavigationRowWithEndText) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else if (component instanceof NavigationRowWithIcon) {
                                            composerStartRestartGroup.startReplaceGroup(1074477081);
                                            modifier4 = modifier3;
                                            SduiNavigationRow2.SduiNavigationRowWithIcon((NavigationRowWithIcon) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else if (component instanceof NavigationRowWithIconAndEndText) {
                                            composerStartRestartGroup.startReplaceGroup(1074480722);
                                            modifier4 = modifier3;
                                            SduiNavigationRow2.SduiNavigationRowWithIconAndEndText((NavigationRowWithIconAndEndText) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else if (component instanceof NavigationRowWithPhotoAndEndText) {
                                            composerStartRestartGroup.startReplaceGroup(1074486195);
                                            modifier4 = modifier3;
                                            SduiNavigationRow2.SduiNavigationRowWithPhotoAndEndText((NavigationRowWithPhotoAndEndText) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            modifier8 = modifier3;
                                            if (component instanceof NumberPog) {
                                                composerStartRestartGroup.startReplaceGroup(1074491089);
                                                NumberPog numberPog = (NumberPog) component;
                                                composerStartRestartGroup.startReplaceGroup(1074493341);
                                                if (horizontalPadding2 == horizontalPadding6) {
                                                    modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                                                } else {
                                                    modifierM21623defaultHorizontalPaddingrAjV9yQ3 = Modifier.INSTANCE;
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                SduiPog.SduiNumberPog(numberPog, modifierM21623defaultHorizontalPaddingrAjV9yQ3, composerStartRestartGroup, 0, 0);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof PaginatedList) {
                                                composerStartRestartGroup.startReplaceGroup(1074499796);
                                                SduiPaginatedList5.SduiPaginatedList((PaginatedList) component, composerStartRestartGroup, 0);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof PathfinderRecentOrders) {
                                                composerStartRestartGroup.startReplaceGroup(1074501937);
                                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof PogWithPictogram) {
                                                composerStartRestartGroup.startReplaceGroup(1074504980);
                                                PogWithPictogram pogWithPictogram = (PogWithPictogram) component;
                                                composerStartRestartGroup.startReplaceGroup(1074507325);
                                                if (horizontalPadding2 == horizontalPadding6) {
                                                    modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                                                } else {
                                                    modifierM21623defaultHorizontalPaddingrAjV9yQ2 = Modifier.INSTANCE;
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                SduiPog.SduiPictogramPog(pogWithPictogram, modifierM21623defaultHorizontalPaddingrAjV9yQ2, composerStartRestartGroup, 0, 0);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof RecurringInsightsHeader) {
                                                composerStartRestartGroup.startReplaceGroup(1074514129);
                                                SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof RecurringInsightsVisualization) {
                                                composerStartRestartGroup.startReplaceGroup(1074517398);
                                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof SettingsRowCondensed) {
                                                composerStartRestartGroup.startReplaceGroup(1074519544);
                                                modifier4 = modifier8;
                                                SduiSettingsRow.SduiSettingsRowCondensed((SettingsRowCondensed) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof SettingsRowStacked) {
                                                composerStartRestartGroup.startReplaceGroup(1074522678);
                                                modifier4 = modifier8;
                                                SduiSettingsRow.SduiSettingsRowStacked((SettingsRowStacked) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else if (component instanceof ShareholderEventNavigationRow) {
                                                composerStartRestartGroup.startReplaceGroup(1074526099);
                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier8, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                modifier8 = modifier8;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                modifier8 = modifier8;
                                                if (component instanceof Spacer) {
                                                    composerStartRestartGroup.startReplaceGroup(1074528680);
                                                    SduiSpacer2.SduiSpacer((Spacer) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof StockListItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074531126);
                                                    SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableColumnHeader) {
                                                    composerStartRestartGroup.startReplaceGroup(1074534434);
                                                    modifier4 = modifier8;
                                                    SduiTableColumnHeader2.SduiTableColumnHeader((TableColumnHeader) component, modifier4, null, composerStartRestartGroup, i3 & 112, 4);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableInstrumentName) {
                                                    composerStartRestartGroup.startReplaceGroup(1074536890);
                                                    SduiTableInstrumentName2.SduiTableInstrumentName((TableInstrumentName) component, null, composerStartRestartGroup, 0, 2);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableDailyPriceChangeItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074539383);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableDailyPriceChangeItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableMonthlyPriceChangeItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074544855);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableMonthlyPriceChangeItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableSharePriceItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074550071);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableSharePriceItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableThreeMonthPriceChangeItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074555639);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableThreeMonthPriceChangeItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableWeeklyPriceChangeItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074561079);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableWeeklyPriceChangeItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TableYearlyPriceChangeItem) {
                                                    composerStartRestartGroup.startReplaceGroup(1074566519);
                                                    SduiPollableCells.SduiPollableScreenerTableItem(null, component, ((TableYearlyPriceChangeItem) component).getInstrument_id(), null, composerStartRestartGroup, 0, 9);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof Text) {
                                                    composerStartRestartGroup.startReplaceGroup(1074571174);
                                                    SduiText2.SduiText((Text) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TextButton) {
                                                    composerStartRestartGroup.startReplaceGroup(1074573484);
                                                    SduiTextButton2.SduiTextButton((TextButton) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TextInput) {
                                                    composerStartRestartGroup.startReplaceGroup(1074575947);
                                                    SduiTextInput2.SduiTextInput((TextInput) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof TextPog) {
                                                    composerStartRestartGroup.startReplaceGroup(1074578511);
                                                    TextPog textPog = (TextPog) component;
                                                    composerStartRestartGroup.startReplaceGroup(1074580701);
                                                    if (horizontalPadding2 == horizontalPadding6) {
                                                        modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                                                    } else {
                                                        modifierM21623defaultHorizontalPaddingrAjV9yQ = Modifier.INSTANCE;
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    SduiPog.SduiTextPog(textPog, modifierM21623defaultHorizontalPaddingrAjV9yQ, composerStartRestartGroup, 0, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof ThemedComponent) {
                                                    composerStartRestartGroup.startReplaceGroup(1074587222);
                                                    SduiThemedComponent2.SduiThemedComponent((ThemedComponent) component, composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof Timeline) {
                                                    composerStartRestartGroup.startReplaceGroup(1074588972);
                                                    modifier4 = modifier8;
                                                    SduiTimeline2.SduiTimeline((Timeline) component, modifier4, horizontalPadding2, 0, false, composerStartRestartGroup, i3 & 1008, 24);
                                                    horizontalPadding2 = horizontalPadding2;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof ValuePropWithIcon) {
                                                    composerStartRestartGroup.startReplaceGroup(1074591693);
                                                    modifier4 = modifier8;
                                                    SduiValuePropRow.SduiValueProp((ValuePropWithIcon) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof ValuePropWithNumber) {
                                                    composerStartRestartGroup.startReplaceGroup(1074594509);
                                                    modifier4 = modifier8;
                                                    SduiValuePropRow.SduiValueProp((ValuePropWithNumber) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof ValuePropWithPictogram) {
                                                    composerStartRestartGroup.startReplaceGroup(1074597421);
                                                    modifier4 = modifier8;
                                                    SduiValuePropRow.SduiValueProp((ValuePropWithPictogram) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else if (component instanceof ValuePropWithPictogramAndRichText) {
                                                    composerStartRestartGroup.startReplaceGroup(1074600685);
                                                    modifier4 = modifier8;
                                                    SduiValuePropRow.SduiValueProp((ValuePropWithPictogramAndRichText) component, modifier4, horizontalPadding2, composerStartRestartGroup, i3 & 1008, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else {
                                                    modifier8 = modifier8;
                                                    if (component instanceof ReactiveButton) {
                                                        composerStartRestartGroup.startReplaceGroup(1074603344);
                                                        SduiButton2.SduiReactiveButton((ReactiveButton) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    } else if (component instanceof ReactiveComponent) {
                                                        composerStartRestartGroup.startReplaceGroup(1074606195);
                                                        SduiReactiveComponent2.SduiReactiveComponent((ReactiveComponent) component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, composerStartRestartGroup, 0, 0);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    } else if (component instanceof RecommendationsAllocationRow) {
                                                        composerStartRestartGroup.startReplaceGroup(1074609489);
                                                        SduiDaggerComponent.SduiDaggerComponent(component, modifierM21623defaultHorizontalPaddingrAjV9yQ6, null, composerStartRestartGroup, 0, 4);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    } else {
                                                        Modifier modifier9 = modifierM21623defaultHorizontalPaddingrAjV9yQ6;
                                                        if (component instanceof RelativeHeightContainer) {
                                                            composerStartRestartGroup.startReplaceGroup(1074612571);
                                                            modifier4 = modifier8;
                                                            SduiRelativeHeightContainer2.SduiRelativeHeightContainer((RelativeHeightContainer) component, modifier4, horizontalPadding2, false, composerStartRestartGroup, i3 & 1008, 8);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                        } else {
                                                            modifier4 = modifier8;
                                                            if (component instanceof RetirementContributionRow) {
                                                                composerStartRestartGroup.startReplaceGroup(1074616017);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof TextArea) {
                                                                composerStartRestartGroup.startReplaceGroup(1074618602);
                                                                SduiTextArea2.SduiTextArea((TextArea) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof WeightedContainer) {
                                                                composerStartRestartGroup.startReplaceGroup(1074621267);
                                                                SduiContainers5.SduiWeightedContainer((WeightedContainer) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginStatusCardContent) {
                                                                composerStartRestartGroup.startReplaceGroup(1074624401);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginHubBufferView) {
                                                                composerStartRestartGroup.startReplaceGroup(1074627345);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginBufferBarLarge) {
                                                                composerStartRestartGroup.startReplaceGroup(1074630321);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginBufferBarSmall) {
                                                                composerStartRestartGroup.startReplaceGroup(1074633297);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginBufferAnimatedText) {
                                                                composerStartRestartGroup.startReplaceGroup(1074636401);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof ElevatedCard) {
                                                                composerStartRestartGroup.startReplaceGroup(1074639118);
                                                                SduiElevatedCard2.SduiElevatedCard((ElevatedCard) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof RemoteLottie) {
                                                                composerStartRestartGroup.startReplaceGroup(1074641742);
                                                                SduiRemoteLottie2.SduiRemoteLottie((RemoteLottie) component, modifier9, composerStartRestartGroup, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginRequirementPollableCell) {
                                                                composerStartRestartGroup.startReplaceGroup(1074644886);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof MarginRequirementPollableHeader) {
                                                                composerStartRestartGroup.startReplaceGroup(1074647350);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, null, null, composerStartRestartGroup, 0, 6);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof FloatingValueProp) {
                                                                composerStartRestartGroup.startReplaceGroup(1074649395);
                                                                SduiFloatingValueProp2.SduiFloatingValueProp((FloatingValueProp) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof DayTradeCounter) {
                                                                composerStartRestartGroup.startReplaceGroup(1074652273);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof ZStack) {
                                                                composerStartRestartGroup.startReplaceGroup(1074654792);
                                                                SduiZStack7.SduiZStack((ZStack) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof GradientText) {
                                                                composerStartRestartGroup.startReplaceGroup(1074657230);
                                                                SduiGradientText2.SduiGradientText((GradientText) component, modifier9, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof CryptoTokenPill) {
                                                                composerStartRestartGroup.startReplaceGroup(1074659953);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else if (component instanceof InlineDefinitionView) {
                                                                composerStartRestartGroup.startReplaceGroup(1074662929);
                                                                SduiDaggerComponent.SduiDaggerComponent(component, modifier9, null, composerStartRestartGroup, 0, 4);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            } else {
                                                                if (!(component instanceof ChartOverlayIcon) && !(component instanceof InstrumentListItem) && !(component instanceof InvestFlowChipGrid) && !(component instanceof InvestFlowLayoutContainer) && !(component instanceof InvestFlowSingleInstrument) && !(component instanceof MarginIcon) && !(component instanceof NavigationRowWithEndButton) && !(component instanceof NavigationRowWithEndIcon) && !(component instanceof NavigationRowWithPogGroupAndEndText) && !(component instanceof PogGroup) && !(component instanceof PositionListItem) && !(component instanceof ProtoComponent) && !(component instanceof RecurringInsightsLayoutContainer) && !(component instanceof ScatterChart) && !(component instanceof ScatterChartLegend) && !(component instanceof SelectRow) && !(component instanceof TradeSharingTimeline) && !(component instanceof TableSparklineItem) && !(component instanceof WelcomeTakeoverHeroLayout) && !(component instanceof InlineExpandableLabel) && !(component instanceof UpsellNavigationRowWithInfoTag) && !(component instanceof ChartKeyPoint) && !(component instanceof ActivityFeedRow)) {
                                                                    composerStartRestartGroup.startReplaceGroup(1074351088);
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                composerStartRestartGroup.startReplaceGroup(1074690036);
                                                                UtilKt.ComponentNotFound(component, (Modifier) null, composerStartRestartGroup, i3 & 14, 2);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                modifier4 = modifier3;
                                horizontalPadding2 = horizontalPadding3;
                            }
                            modifier4 = modifier8;
                        }
                        modifier4 = modifier7;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(1074341648);
                    modifier4 = modifier6;
                    SduiAccordionRow2.SduiAccordionRow((AccordionRow) component, modifier4, horizontalPadding5, composerStartRestartGroup, i3 & 1008, 0);
                    horizontalPadding2 = horizontalPadding5;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = composerStartRestartGroup;
                modifier5 = modifier4;
                horizontalPadding4 = horizontalPadding2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
                horizontalPadding4 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiComponent3.SduiComponent$lambda$0(component, modifier5, horizontalPadding4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1074335805);
            HorizontalPadding horizontalPadding62 = HorizontalPadding.Default;
            if (horizontalPadding5 != horizontalPadding62) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (component instanceof AccordionRow) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            modifier5 = modifier4;
            horizontalPadding4 = horizontalPadding2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void InlineSduiComponent(UIComponent<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, int i, int i2) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(component, "component");
        composer.startReplaceGroup(655834815);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            horizontalPadding = HorizontalPadding.None;
        }
        CompositionLocal6<Class<?>> localActionClass = UtilKt.getLocalActionClass();
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        ProvidedValue<Class<?>> providedValueProvides = localActionClass.provides(Parcelable.class);
        AutoLoggingCompositionLocals4 localEventLogger = AutoLoggingCompositionLocals.getLocalEventLogger();
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, localEventLogger.provides(((AutoLoggingCompositionLocals2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).eventLogger())}, ComposableLambda3.rememberComposableLambda(1969517439, true, new C207381(component, modifier, horizontalPadding), composer, 54), composer, ProvidedValue.$stable | 48);
        composer.endReplaceGroup();
    }

    /* compiled from: SduiComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentKt$InlineSduiComponent$1 */
    /* loaded from: classes8.dex */
    public static final class C207381 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UIComponent<ActionT> $component;
        final /* synthetic */ HorizontalPadding $horizontalPadding;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: Multi-variable type inference failed */
        public C207381(UIComponent<? extends ActionT> uIComponent, Modifier modifier, HorizontalPadding horizontalPadding) {
            this.$component = uIComponent;
            this.$modifier = modifier;
            this.$horizontalPadding = horizontalPadding;
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
                ComposerKt.traceEventStart(1969517439, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.InlineSduiComponent.<anonymous> (SduiComponent.kt:385)");
            }
            SduiComponent3.SduiComponent(this.$component, this.$modifier, this.$horizontalPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
