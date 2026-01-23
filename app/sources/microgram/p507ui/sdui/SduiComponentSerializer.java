package microgram.p507ui.sdui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiComponentSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lmicrogram/ui/sdui/SduiComponent;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SduiComponentSerializer extends JsonContentPolymorphicSerializer<SduiComponent> {
    public static final SduiComponentSerializer INSTANCE = new SduiComponentSerializer();

    private SduiComponentSerializer() {
        super(Reflection.getOrCreateKotlinClass(SduiComponent.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    protected KSerializer2<SduiComponent> selectDeserializer(JsonElement element) throws Exception {
        JsonElement7 jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElement3.getJsonObject(element).get((Object) "sdui_component_type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -2125713063:
                    if (content.equals("THEMED_COMPONENT")) {
                        return SduiThemedComponent.INSTANCE.serializer();
                    }
                    break;
                case -2114423797:
                    if (content.equals("STOCK_LIST_ITEM")) {
                        return SduiStockListItem.INSTANCE.serializer();
                    }
                    break;
                case -2044160593:
                    if (content.equals("NAVIGATION_ROW_WITH_PHOTO_AND_END_TEXT")) {
                        return SduiNavigationRowWithPhotoAndEndText.INSTANCE.serializer();
                    }
                    break;
                case -2013929040:
                    if (content.equals("HISTORY_DETAIL_HEADER")) {
                        return SduiHistoryDetailHeader.INSTANCE.serializer();
                    }
                    break;
                case -2008336113:
                    if (content.equals("NAVIGATION_ROW")) {
                        return SduiNavigationRow.INSTANCE.serializer();
                    }
                    break;
                case -1994004005:
                    if (content.equals("MARGIN_REQUIREMENT_POLLABLE_CELL")) {
                        return SduiMarginRequirementPollableCell.INSTANCE.serializer();
                    }
                    break;
                case -1975448637:
                    if (content.equals("CHECKBOX")) {
                        return SduiCheckbox.INSTANCE.serializer();
                    }
                    break;
                case -1946769699:
                    if (content.equals("SCATTER_CHART")) {
                        return SduiScatterChart.INSTANCE.serializer();
                    }
                    break;
                case -1919329183:
                    if (content.equals("CONTAINER")) {
                        return SduiContainer.INSTANCE.serializer();
                    }
                    break;
                case -1899578649:
                    if (content.equals("TABLE_1D_CHANGE_ITEM")) {
                        return SduiTableDailyPriceChangeItem.INSTANCE.serializer();
                    }
                    break;
                case -1849030254:
                    if (content.equals("CHIPGRID")) {
                        return SduiChipGrid.INSTANCE.serializer();
                    }
                    break;
                case -1842863060:
                    if (content.equals("SPACER")) {
                        return SduiSpacer.INSTANCE.serializer();
                    }
                    break;
                case -1835854883:
                    if (content.equals("INFO_BANNER")) {
                        return SduiInfoBanner.INSTANCE.serializer();
                    }
                    break;
                case -1715864930:
                    if (content.equals("CHART_GROUP")) {
                        return SduiChartGroup.INSTANCE.serializer();
                    }
                    break;
                case -1699459727:
                    if (content.equals("VALUE_PROP_WITH_PICTOGRAM")) {
                        return SduiValuePropWithPictogram.INSTANCE.serializer();
                    }
                    break;
                case -1694995871:
                    if (content.equals("REMOTE_IMAGE_ASPECT_RATIO")) {
                        return SduiAspectRatioRemoteImage.INSTANCE.serializer();
                    }
                    break;
                case -1636996625:
                    if (content.equals("RECURRING_INSIGHTS_HEADER")) {
                        return SduiRecurringInsightsHeader.INSTANCE.serializer();
                    }
                    break;
                case -1591164176:
                    if (content.equals("PAGINATED_LIST")) {
                        return SduiPaginatedList.INSTANCE.serializer();
                    }
                    break;
                case -1544524253:
                    if (content.equals("ACCORDION_ROW")) {
                        return SduiAccordionRow.INSTANCE.serializer();
                    }
                    break;
                case -1522561228:
                    if (content.equals("FOREIGN_CURRENCY_CONVERSION_INFO")) {
                        return SduiForeignCurrencyConversionInfo.INSTANCE.serializer();
                    }
                    break;
                case -1520323784:
                    if (content.equals("REACTIVE_BUTTON")) {
                        return SduiReactiveButton.INSTANCE.serializer();
                    }
                    break;
                case -1440500659:
                    if (content.equals("REMOTE_IMAGE_ASPECT_FILL")) {
                        return SduiAspectFillRemoteImage.INSTANCE.serializer();
                    }
                    break;
                case -1387639611:
                    if (content.equals("TABLE_COLUMN_HEADER")) {
                        return SduiTableColumnHeader.INSTANCE.serializer();
                    }
                    break;
                case -1318541163:
                    if (content.equals("PATHFINDER_RECENT_ORDERS")) {
                        return SduiPathfinderRecentOrders.INSTANCE.serializer();
                    }
                    break;
                case -1294023615:
                    if (content.equals("TIMELINE")) {
                        return SduiTimeline.INSTANCE.serializer();
                    }
                    break;
                case -1256355666:
                    if (content.equals("TABLE_3M_CHANGE_ITEM")) {
                        return SduiTableThreeMonthPriceChangeItem.INSTANCE.serializer();
                    }
                    break;
                case -1246860232:
                    if (content.equals("CHART_LAYERED_STACK")) {
                        return SduiChartLayeredStack.INSTANCE.serializer();
                    }
                    break;
                case -1243260536:
                    if (content.equals("POG_GROUP")) {
                        return SduiPogGroup.INSTANCE.serializer();
                    }
                    break;
                case -1210669569:
                    if (content.equals("TRADE_SHARING_TIMELINE")) {
                        return SduiTradeSharingTimeline.INSTANCE.serializer();
                    }
                    break;
                case -1188909276:
                    if (content.equals("VALUE_PROP_WITH_ICON")) {
                        return SduiValuePropWithIcon.INSTANCE.serializer();
                    }
                    break;
                case -1169573897:
                    if (content.equals("SELECT_ROW")) {
                        return SduiSelectRow.INSTANCE.serializer();
                    }
                    break;
                case -1138874558:
                    if (content.equals("HISTORY_DETAIL_ROWS_SECTION")) {
                        return SduiHistoryDetailRowsSection.INSTANCE.serializer();
                    }
                    break;
                case -1125363606:
                    if (content.equals("MARGIN_ICON")) {
                        return SduiMarginIcon.INSTANCE.serializer();
                    }
                    break;
                case -993439386:
                    if (content.equals("SETTINGS_ROW_STACKED")) {
                        return SduiSettingsRowStacked.INSTANCE.serializer();
                    }
                    break;
                case -980334565:
                    if (content.equals("DECORATOR")) {
                        return SduiDecorator.INSTANCE.serializer();
                    }
                    break;
                case -903274401:
                    if (content.equals("CHART_PULSING_DOT")) {
                        return SduiChartPulsingDot.INSTANCE.serializer();
                    }
                    break;
                case -790118612:
                    if (content.equals("ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT")) {
                        return SduiWelcomeTakeoverHeroLayout.INSTANCE.serializer();
                    }
                    break;
                case -787715859:
                    if (content.equals("DATA_ROW_CONDENSED")) {
                        return SduiDataRowCondensed.INSTANCE.serializer();
                    }
                    break;
                case -739444007:
                    if (content.equals("FEATURE_CARD")) {
                        return SduiFeatureCard.INSTANCE.serializer();
                    }
                    break;
                case -708597224:
                    if (content.equals("TEXT_INPUT")) {
                        return SduiTextInput.INSTANCE.serializer();
                    }
                    break;
                case -685498748:
                    if (content.equals("TEXT_BUTTON")) {
                        return SduiTextButton.INSTANCE.serializer();
                    }
                    break;
                case -664042649:
                    if (content.equals("FEATURE_DISCOVERY")) {
                        return SduiFeatureDiscovery.INSTANCE.serializer();
                    }
                    break;
                case -655124405:
                    if (content.equals("MARGIN_TIERED_INTEREST_RATES")) {
                        return SduiMarginTieredInterestRates.INSTANCE.serializer();
                    }
                    break;
                case -623344678:
                    if (content.equals("VALUE_PROP_WITH_PICTOGRAM_AND_RICH_TEXT")) {
                        return SduiValuePropWithPictogramAndRichText.INSTANCE.serializer();
                    }
                    break;
                case -539622202:
                    if (content.equals("MARGIN_REQUIREMENT_POLLABLE_HEADER")) {
                        return SduiMarginRequirementPollableHeader.INSTANCE.serializer();
                    }
                    break;
                case -518592670:
                    if (content.equals("RECURRING_INSIGHTS_VISUALIZATION")) {
                        return SduiRecurringInsightsVisualization.INSTANCE.serializer();
                    }
                    break;
                case -485582408:
                    if (content.equals("ICON_BUTTON")) {
                        return SduiIconButton.INSTANCE.serializer();
                    }
                    break;
                case -461952768:
                    if (content.equals("RECOMMENDATIONS_ALLOCATION_ROW")) {
                        return SduiRecommendationsAllocationRow.INSTANCE.serializer();
                    }
                    break;
                case -426374409:
                    if (content.equals("INVEST_FLOW_SINGLE_INSTRUMENT")) {
                        return SduiInvestFlowSingleInstrument.INSTANCE.serializer();
                    }
                    break;
                case -374487427:
                    if (content.equals("MARKDOWN_TEXT")) {
                        return SduiMarkdownText.INSTANCE.serializer();
                    }
                    break;
                case -245238416:
                    if (content.equals("TABLE_1M_CHANGE_ITEM")) {
                        return SduiTableMonthlyPriceChangeItem.INSTANCE.serializer();
                    }
                    break;
                case -233469093:
                    if (content.equals("DAY_TRADE_BUBBLES_VIEW")) {
                        return SduiDayTradeBubblesContainer.INSTANCE.serializer();
                    }
                    break;
                case -219724778:
                    if (content.equals("TEXT_POG")) {
                        return SduiTextPog.INSTANCE.serializer();
                    }
                    break;
                case -184824056:
                    if (content.equals("SHAREHOLDER_EVENT_NAVIGATION_ROW")) {
                        return SduiShareholderEventNavigationRow.INSTANCE.serializer();
                    }
                    break;
                case -160874174:
                    if (content.equals("CRYPTO_DEMETER_DATA_ROW_CONDENSED")) {
                        return SduiCryptoDemeterDataRowCondensed.INSTANCE.serializer();
                    }
                    break;
                case -140305794:
                    if (content.equals("POSITION_LIST_ITEM")) {
                        return SduiPositionListItem.INSTANCE.serializer();
                    }
                    break;
                case -54850887:
                    if (content.equals("INVEST_FLOW_CHIPGRID")) {
                        return SduiInvestFlowChipGrid.INSTANCE.serializer();
                    }
                    break;
                case -44667978:
                    if (content.equals("NAVIGATION_ROW_WITH_ICON_AND_END_TEXT")) {
                        return SduiNavigationRowWithIconAndEndText.INSTANCE.serializer();
                    }
                    break;
                case -2590099:
                    if (content.equals("DATA_ROW_STACKED")) {
                        return SduiDataRowStacked.INSTANCE.serializer();
                    }
                    break;
                case 1172368:
                    if (content.equals("MARKDOWN_WITH_TRAILING_ACTION")) {
                        return SduiMarkdownWithTrailingAction.INSTANCE.serializer();
                    }
                    break;
                case 2067532:
                    if (content.equals("CHIP")) {
                        return SduiChip.INSTANCE.serializer();
                    }
                    break;
                case 2196294:
                    if (content.equals("GRID")) {
                        return SduiGrid.INSTANCE.serializer();
                    }
                    break;
                case 2571565:
                    if (content.equals("TEXT")) {
                        return SduiText.INSTANCE.serializer();
                    }
                    break;
                case 76403144:
                    if (content.equals("PROTO")) {
                        return SduiProtoComponent.INSTANCE.serializer();
                    }
                    break;
                case 79186740:
                    if (content.equals("VALUE_PROP_WITH_NUMBER")) {
                        return SduiValuePropWithNumber.INSTANCE.serializer();
                    }
                    break;
                case 90253734:
                    if (content.equals("NAVIGATION_ROW_WITH_END_ICON")) {
                        return SduiNavigationRowWithEndIcon.INSTANCE.serializer();
                    }
                    break;
                case 90583642:
                    if (content.equals("NAVIGATION_ROW_WITH_END_TEXT")) {
                        return SduiNavigationRowWithEndText.INSTANCE.serializer();
                    }
                    break;
                case 94201906:
                    if (content.equals("NUMBER_POG")) {
                        return SduiNumberPog.INSTANCE.serializer();
                    }
                    break;
                case 181685167:
                    if (content.equals("SCATTER_CHART_LEGEND")) {
                        return SduiScatterChartLegend.INSTANCE.serializer();
                    }
                    break;
                case 182171001:
                    if (content.equals("NAVIGATION_ROW_WITH_POG_GROUP_AND_END_TEXT")) {
                        return SduiNavigationRowWithPogGroupAndEndText.INSTANCE.serializer();
                    }
                    break;
                case 289160482:
                    if (content.equals("NAVIGATION_ROW_WITH_ICON")) {
                        return SduiNavigationRowWithIcon.INSTANCE.serializer();
                    }
                    break;
                case 337317470:
                    if (content.equals("DAY_TRADE_COUNTER")) {
                        return SduiDayTradeCounter.INSTANCE.serializer();
                    }
                    break;
                case 354140252:
                    if (content.equals("RELATIVE_HEIGHT_CONTAINER")) {
                        return SduiRelativeHeightContainer.INSTANCE.serializer();
                    }
                    break;
                case 488859046:
                    if (content.equals("SETTINGS_ROW_CONDENSED")) {
                        return SduiSettingsRowCondensed.INSTANCE.serializer();
                    }
                    break;
                case 497130502:
                    if (content.equals("INVEST_FLOW_CAPSULE")) {
                        return SduiInvestFlowCapsule.INSTANCE.serializer();
                    }
                    break;
                case 498146889:
                    if (content.equals("MARGIN_HUB_BUFFER_VIEW")) {
                        return SduiMarginHubBufferView.INSTANCE.serializer();
                    }
                    break;
                case 528892796:
                    if (content.equals("TABLE_1Y_CHANGE_ITEM")) {
                        return SduiTableYearlyPriceChangeItem.INSTANCE.serializer();
                    }
                    break;
                case 541104273:
                    if (content.equals("RETIREMENT_CONTRIBUTION_ROW")) {
                        return SduiRetirementContributionRow.INSTANCE.serializer();
                    }
                    break;
                case 595233834:
                    if (content.equals("HORIZONTAL_SCROLL_CONTAINER")) {
                        return SduiHorizontalScrollContainer.INSTANCE.serializer();
                    }
                    break;
                case 643082020:
                    if (content.equals("UPSELL_NAVIGATION_ROW_WITH_INFO_TAG")) {
                        return SduiUpsellNavigationRowWithInfoTag.INSTANCE.serializer();
                    }
                    break;
                case 646268903:
                    if (content.equals("REMOTE_IMAGE_ASPECT_FIT")) {
                        return SduiAspectFitRemoteImage.INSTANCE.serializer();
                    }
                    break;
                case 650869023:
                    if (content.equals("NAVIGATION_ROW_WITH_END_BUTTON")) {
                        return SduiNavigationRowWithEndButton.INSTANCE.serializer();
                    }
                    break;
                case 723464530:
                    if (content.equals("TABLE_INSTRUMENT_NAME")) {
                        return SduiTableInstrumentName.INSTANCE.serializer();
                    }
                    break;
                case 747970487:
                    if (content.equals("INVEST_FLOW_CARD")) {
                        return SduiInvestFlowCard.INSTANCE.serializer();
                    }
                    break;
                case 747976947:
                    if (content.equals("INVEST_FLOW_CHIP")) {
                        return SduiInvestFlowChip.INSTANCE.serializer();
                    }
                    break;
                case 900185874:
                    if (content.equals("TABLE_SPARKLINE_ITEM")) {
                        return SduiTableSparklineItem.INSTANCE.serializer();
                    }
                    break;
                case 914378054:
                    if (content.equals("MARGIN_STATUS_CARD_CONTENT")) {
                        return SduiMarginStatusCardContent.INSTANCE.serializer();
                    }
                    break;
                case 961857641:
                    if (content.equals("INFO_TAG")) {
                        return SduiInfoTag.INSTANCE.serializer();
                    }
                    break;
                case 991075973:
                    if (content.equals("ELEVATED_CARD")) {
                        return SduiElevatedCard.INSTANCE.serializer();
                    }
                    break;
                case 1012323055:
                    if (content.equals("FUNDAMENTALS_DATA_ROW_GRID")) {
                        return SduiFundamentalsDataRowGrid.INSTANCE.serializer();
                    }
                    break;
                case 1015289519:
                    if (content.equals("INLINE_EXPANDABLE_LABEL")) {
                        return SduiInlineExpandableLabel.INSTANCE.serializer();
                    }
                    break;
                case 1031632342:
                    if (content.equals("LOADING_SPINNER")) {
                        return SduiLoadingSpinner.INSTANCE.serializer();
                    }
                    break;
                case 1069941315:
                    if (content.equals("Z_STACK")) {
                        return SduiZStack.INSTANCE.serializer();
                    }
                    break;
                case 1115698810:
                    if (content.equals("TABLE_1W_CHANGE_ITEM")) {
                        return SduiTableWeeklyPriceChangeItem.INSTANCE.serializer();
                    }
                    break;
                case 1136670074:
                    if (content.equals("DIVIDER_LINE")) {
                        return SduiDividerLine.INSTANCE.serializer();
                    }
                    break;
                case 1222970588:
                    if (content.equals("GRADIENT_TEXT")) {
                        return SduiGradientText.INSTANCE.serializer();
                    }
                    break;
                case 1237469685:
                    if (content.equals("ICON_IMAGE")) {
                        return SduiIconImage.INSTANCE.serializer();
                    }
                    break;
                case 1239151962:
                    if (content.equals("TABLE_SHARE_PRICE_ITEM")) {
                        return SduiTableSharePriceItem.INSTANCE.serializer();
                    }
                    break;
                case 1262207923:
                    if (content.equals("INVEST_FLOW_LAYOUT_CONTAINER")) {
                        return SduiInvestFlowLayoutContainer.INSTANCE.serializer();
                    }
                    break;
                case 1310532458:
                    if (content.equals("FLOATING_VALUE_PROP")) {
                        return SduiFloatingValueProp.INSTANCE.serializer();
                    }
                    break;
                case 1347833623:
                    if (content.equals("REACTIVE_COMPONENT")) {
                        return SduiReactiveComponent.INSTANCE.serializer();
                    }
                    break;
                case 1629320177:
                    if (content.equals("GOLD_BUTTON")) {
                        return SduiGoldButton.INSTANCE.serializer();
                    }
                    break;
                case 1672783851:
                    if (content.equals("BOOK_COVER_TEXT")) {
                        return SduiBookCoverText.INSTANCE.serializer();
                    }
                    break;
                case 1686435188:
                    if (content.equals("INVEST_FLOW_HEADER")) {
                        return SduiInvestFlowHeader.INSTANCE.serializer();
                    }
                    break;
                case 1739171641:
                    if (content.equals("WEIGHTED_CONTAINER")) {
                        return SduiWeightedContainer.INSTANCE.serializer();
                    }
                    break;
                case 1761397664:
                    if (content.equals("DATA_ROW_GRID")) {
                        return SduiDataRowGrid.INSTANCE.serializer();
                    }
                    break;
                case 1778022495:
                    if (content.equals("TEXT_AREA")) {
                        return SduiTextArea.INSTANCE.serializer();
                    }
                    break;
                case 1821592073:
                    if (content.equals("CHART_OVERLAY_ICON")) {
                        return SduiChartOverlayIcon.INSTANCE.serializer();
                    }
                    break;
                case 1845828206:
                    if (content.equals("RECURRING_INSIGHTS_LAYOUT_CONTAINER")) {
                        return SduiRecurringInsightsLayoutContainer.INSTANCE.serializer();
                    }
                    break;
                case 1848171514:
                    if (content.equals("POG_WITH_PICTOGRAM")) {
                        return SduiPogWithPictogram.INSTANCE.serializer();
                    }
                    break;
                case 1913903544:
                    if (content.equals("REMOTE_LOTTIE")) {
                        return SduiRemoteLottie.INSTANCE.serializer();
                    }
                    break;
                case 1929317308:
                    if (content.equals("INSTRUMENT_LIST_ITEM")) {
                        return SduiInstrumentListItem.INSTANCE.serializer();
                    }
                    break;
                case 1970608946:
                    if (content.equals("BUTTON")) {
                        return SduiButton.INSTANCE.serializer();
                    }
                    break;
                case 2112675954:
                    if (content.equals("EXPANDABLE_MARKDOWN_TEXT")) {
                        return SduiExpandableMarkdownText.INSTANCE.serializer();
                    }
                    break;
            }
        }
        throw new Exception("ERROR: No Serializer found. Serialization failed");
    }
}
