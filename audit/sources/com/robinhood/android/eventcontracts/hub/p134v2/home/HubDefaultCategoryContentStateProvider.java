package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.robinhood.android.eventcontracts.hub.p134v2.C16533R;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.FinalEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.LiveEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.UpcomingEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtil;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: HubDefaultCategoryContentStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016Jr\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u000b0\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017Jd\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J#\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010$JF\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J`\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\t2\u0006\u0010+\u001a\u00020\u00172\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\"2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\"H\u0002¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentViewState;", "<init>", "()V", "reduce", "dataState", "generateCardViewState", "", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout$EcHubLayoutComponent$EcHubEventCardComponent;", "ecHubEventStates", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "contractIdsToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdsToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "sectionIdentifier", "", "formatPriceAsPercent", "", "isInAcqStreamlinedTradeFlowExperiment", "createLiveEventCardViewState", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "eventCard", "eventState", "hubCardContext", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "getProgressValue", "", "leftContractTradePrice", "Ljava/math/BigDecimal;", "rightContractTradePrice", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/Float;", "createFinalCardViewState", "generateUpcomingCardContractViewState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "contracts", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout$EcHubLayoutComponent$EcHubEventCardComponent$ContractInfo;", "showQuotePill", "generateContractPillState", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "position", "lastTradePrice", "dayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getPositionText", "Lcom/robinhood/utils/resource/StringResource;", "quantity", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentStateProvider implements StateProvider<HubDefaultCategoryContentDataState, HubDefaultCategoryContentViewState> {
    public static final int $stable = 0;
    public static final HubDefaultCategoryContentStateProvider INSTANCE = new HubDefaultCategoryContentStateProvider();

    /* compiled from: HubDefaultCategoryContentStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PredictionMarketEventState3.values().length];
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_FINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HubDefaultCategoryContentStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public HubDefaultCategoryContentViewState reduce(HubDefaultCategoryContentDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new HubDefaultCategoryContentViewState(dataState.getHubUiComponents());
    }

    public final List<HubDefaultCategoryContentViewState3> generateCardViewState(List<EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent> list, Map<UUID, PredictionMarketEventState> map, Map<UUID, EventQuote> map2, Map<UUID, UiEventContractPosition> map3, String str, boolean z, boolean z2) {
        StringResource stringResourceInvoke;
        PredictionMarketEventState3 predictionMarketEventState3;
        boolean z3;
        StringResource stringResourceInvoke2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        String sectionIdentifier = str;
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        if (map == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent ecHubEventCardComponent : list) {
            PredictionMarketEventState predictionMarketEventState = map.get(ecHubEventCardComponent.getEventId());
            HubDefaultCategoryContentViewState2 upcomingEventCard3 = null;
            if (predictionMarketEventState != null) {
                EventContractHubCardContext eventContractHubCardContext = new EventContractHubCardContext(Uuids.safeToString(predictionMarketEventState.getEventId()), HubDefaultCategoryContentStateProvider2.toProtoLoggingModel(predictionMarketEventState.getEventStatus()), HubDefaultCategoryContentStateProvider2.generatePositionContext(map3), null, 8, null);
                switch (WhenMappings.$EnumSwitchMapping$0[predictionMarketEventState.getEventStatus().ordinal()]) {
                    case 1:
                    case 2:
                        UUID eventId = predictionMarketEventState.getEventId();
                        Instant gameStartTimestamp = predictionMarketEventState.getGameStartTimestamp();
                        if (gameStartTimestamp == null || (stringResourceInvoke = EventStartTimeStringUtil.getEventStartTimeText(gameStartTimestamp, predictionMarketEventState.getGameStartFormat())) == null) {
                            stringResourceInvoke = StringResource.INSTANCE.invoke(predictionMarketEventState.getEventProgress());
                        }
                        StringResource stringResource = stringResourceInvoke;
                        String subtitle = predictionMarketEventState.getSubtitle();
                        HubDefaultCategoryContentStateProvider hubDefaultCategoryContentStateProvider = INSTANCE;
                        List<EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo> contractInfo = ecHubEventCardComponent.getContractInfo();
                        PredictionMarketEventState3 eventStatus = predictionMarketEventState.getEventStatus();
                        PredictionMarketEventState3 predictionMarketEventState32 = PredictionMarketEventState3.EVENT_STATUS_CANCELED;
                        if (eventStatus != predictionMarketEventState32) {
                            predictionMarketEventState3 = predictionMarketEventState32;
                            z3 = true;
                        } else {
                            predictionMarketEventState3 = predictionMarketEventState32;
                            z3 = false;
                        }
                        upcomingEventCard3 = new UpcomingEventCardViewState(eventContractHubCardContext, str, eventId, stringResource, subtitle, hubDefaultCategoryContentStateProvider.generateUpcomingCardContractViewState(contractInfo, z3, map2, map3, predictionMarketEventState, z), predictionMarketEventState.getEventStatus() != predictionMarketEventState3, false, z2);
                        break;
                    case 3:
                    case 4:
                        if (predictionMarketEventState.getSupportLiveData()) {
                            upcomingEventCard3 = INSTANCE.createLiveEventCardViewState(ecHubEventCardComponent, predictionMarketEventState, eventContractHubCardContext, map2, map3, str, z, z2);
                            break;
                        } else {
                            UUID eventId2 = predictionMarketEventState.getEventId();
                            if (predictionMarketEventState.getEventStatus() == PredictionMarketEventState3.EVENT_STATUS_PAUSED) {
                                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C16533R.string.status_row_halftime_label, new Object[0]);
                            } else {
                                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C16533R.string.status_row_live_game_label, new Object[0]);
                            }
                            upcomingEventCard3 = new UpcomingEventCardViewState(eventContractHubCardContext, str, eventId2, stringResourceInvoke2, predictionMarketEventState.getSubtitle(), INSTANCE.generateUpcomingCardContractViewState(ecHubEventCardComponent.getContractInfo(), true, map2, map3, predictionMarketEventState, z), true, true, z2);
                            break;
                        }
                    case 5:
                        upcomingEventCard3 = INSTANCE.createFinalCardViewState(ecHubEventCardComponent, eventContractHubCardContext, predictionMarketEventState, map2, sectionIdentifier, z);
                        break;
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (upcomingEventCard3 != null) {
                arrayList.add(upcomingEventCard3);
            }
            sectionIdentifier = str;
        }
        return arrayList;
    }

    private final HubDefaultCategoryContentViewState2 createLiveEventCardViewState(EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent eventCard, PredictionMarketEventState eventState, EventContractHubCardContext hubCardContext, Map<UUID, EventQuote> contractIdsToQuotes, Map<UUID, UiEventContractPosition> contractIdsToPositions, String sectionIdentifier, boolean formatPriceAsPercent, boolean isInAcqStreamlinedTradeFlowExperiment) {
        StringResource stringResourceInvoke;
        EventQuote eventQuote;
        EventQuote eventQuote2;
        EventQuote eventQuote3;
        EventQuote eventQuote4;
        if (eventCard.getContractInfo().size() != 2) {
            throw new IllegalArgumentException("1v1 live card must have exactly two contracts");
        }
        EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo contractInfo = eventCard.getContractInfo().get(0);
        EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo contractInfo2 = eventCard.getContractInfo().get(1);
        Boolean bool = eventState.getContractIdToVisualIndicator().get(contractInfo.getContractId());
        Boolean bool2 = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(bool, bool2);
        boolean zAreEqual2 = Intrinsics.areEqual(eventState.getContractIdToVisualIndicator().get(contractInfo2.getContractId()), bool2);
        if (eventState.getEventStateDetailed() != null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16533R.string.live_card_status_label, eventState.getEventProgress(), eventState.getEventStateDetailed());
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(eventState.getEventProgress());
        }
        String headerImageUrl = contractInfo.getHeaderImageUrl();
        String str = headerImageUrl == null ? "" : headerImageUrl;
        DayNightColor dayNightColor = DayNightColor2.getDayNightColor(contractInfo);
        String shortName = contractInfo.getShortName();
        String tertiaryText = contractInfo.getTertiaryText();
        String str2 = eventState.getContractIdToEventScore().get(contractInfo.getContractId());
        BigDecimal lastTradePrice = null;
        CardPills7 cardPills7GenerateContractPillState = generateContractPillState(contractIdsToPositions != null ? contractIdsToPositions.get(contractInfo.getContractId()) : null, (contractIdsToQuotes == null || (eventQuote4 = contractIdsToQuotes.get(contractInfo.getContractId())) == null) ? null : eventQuote4.getLastTradePrice(), DayNightColor2.getDayNightColor(contractInfo), formatPriceAsPercent);
        PredictionMarketEventState3 eventStatus = eventState.getEventStatus();
        PredictionMarketEventState3 predictionMarketEventState3 = PredictionMarketEventState3.EVENT_STATUS_PAUSED;
        LiveEventCardViewState.ContractViewState contractViewState = new LiveEventCardViewState.ContractViewState(contractInfo.getContractId(), str, dayNightColor, shortName, tertiaryText, str2, cardPills7GenerateContractPillState, zAreEqual, eventStatus == predictionMarketEventState3 || zAreEqual);
        String headerImageUrl2 = contractInfo2.getHeaderImageUrl();
        LiveEventCardViewState.ContractViewState contractViewState2 = new LiveEventCardViewState.ContractViewState(contractInfo2.getContractId(), headerImageUrl2 != null ? headerImageUrl2 : "", DayNightColor2.getDayNightColor(contractInfo2), contractInfo2.getShortName(), contractInfo2.getTertiaryText(), eventState.getContractIdToEventScore().get(contractInfo2.getContractId()), generateContractPillState(contractIdsToPositions != null ? contractIdsToPositions.get(contractInfo2.getContractId()) : null, (contractIdsToQuotes == null || (eventQuote3 = contractIdsToQuotes.get(contractInfo2.getContractId())) == null) ? null : eventQuote3.getLastTradePrice(), DayNightColor2.getDayNightColor(contractInfo2), formatPriceAsPercent), zAreEqual2, eventState.getEventStatus() == predictionMarketEventState3 || zAreEqual2);
        BigDecimal lastTradePrice2 = (contractIdsToQuotes == null || (eventQuote2 = contractIdsToQuotes.get(contractInfo.getContractId())) == null) ? null : eventQuote2.getLastTradePrice();
        if (contractIdsToQuotes != null && (eventQuote = contractIdsToQuotes.get(contractInfo2.getContractId())) != null) {
            lastTradePrice = eventQuote.getLastTradePrice();
        }
        return new LiveEventCardViewState(hubCardContext, sectionIdentifier, eventCard.getEventId(), stringResourceInvoke, contractViewState, contractViewState2, getProgressValue(lastTradePrice2, lastTradePrice), isInAcqStreamlinedTradeFlowExperiment);
    }

    private final Float getProgressValue(BigDecimal leftContractTradePrice, BigDecimal rightContractTradePrice) {
        if (leftContractTradePrice == null || rightContractTradePrice == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = leftContractTradePrice.add(rightContractTradePrice);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        if (Intrinsics.areEqual(bigDecimalAdd, BigDecimal.ZERO)) {
            return null;
        }
        return Float.valueOf(RangesKt.coerceIn(leftContractTradePrice.divide(bigDecimalAdd, MathContext.DECIMAL128).floatValue(), 0.0f, 1.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HubDefaultCategoryContentViewState2 createFinalCardViewState(EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent eventCard, EventContractHubCardContext hubCardContext, PredictionMarketEventState eventState, Map<UUID, EventQuote> contractIdsToQuotes, String sectionIdentifier, boolean formatPriceAsPercent) {
        String strPriceInCents;
        EventQuote eventQuote;
        BigDecimal lastTradePrice;
        UUID eventId = eventCard.getEventId();
        String eventProgress = eventState.getEventProgress();
        List<EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo> contractInfo = eventCard.getContractInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractInfo, 10));
        for (EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo contractInfo2 : contractInfo) {
            UUID contractId = contractInfo2.getContractId();
            Boolean bool = eventState.getContractIdToVisualIndicator().get(contractId);
            Boolean bool2 = Boolean.TRUE;
            boolean zAreEqual = Intrinsics.areEqual(bool, bool2);
            DayNightColor dayNightColor = DayNightColor2.getDayNightColor(contractInfo2);
            String headerImageUrl = contractInfo2.getHeaderImageUrl();
            if (headerImageUrl == null) {
                headerImageUrl = "";
            }
            String str = headerImageUrl;
            String shortName = contractInfo2.getShortName();
            String tertiaryText = contractInfo2.getTertiaryText();
            String str2 = eventState.getContractIdToEventScore().get(contractId);
            if (contractIdsToQuotes == null || (eventQuote = contractIdsToQuotes.get(contractId)) == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null) {
                strPriceInCents = "-";
            } else {
                if (formatPriceAsPercent) {
                    strPriceInCents = Formats.getPercentFormat().format(lastTradePrice);
                } else {
                    strPriceInCents = BigDecimals2.priceInCents(lastTradePrice);
                }
                if (strPriceInCents == null) {
                }
            }
            arrayList.add(new FinalEventCardViewState.ContractViewState(zAreEqual, dayNightColor, str, shortName, tertiaryText, str2, strPriceInCents, Intrinsics.areEqual(eventState.getContractIdToVisualEmphasis().get(contractId), bool2)));
        }
        return new FinalEventCardViewState(sectionIdentifier, hubCardContext, eventId, eventProgress, extensions2.toPersistentList(arrayList));
    }

    private final ImmutableList<UpcomingEventCardViewState.ContractViewState> generateUpcomingCardContractViewState(List<EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo> contracts2, boolean showQuotePill, Map<UUID, EventQuote> contractIdsToQuotes, Map<UUID, UiEventContractPosition> contractIdsToPositions, PredictionMarketEventState eventState, boolean formatPriceAsPercent) {
        EventQuote eventQuote;
        List<EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo> list = contracts2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo contractInfo : list) {
            UUID contractId = contractInfo.getContractId();
            DayNightColor dayNightColor = DayNightColor2.getDayNightColor(contractInfo);
            String headerImageUrl = contractInfo.getHeaderImageUrl();
            String shortName = contractInfo.getShortName();
            String description = contractInfo.getDescription();
            String tertiaryText = contractInfo.getTertiaryText();
            CardPills7 cardPills7GenerateContractPillState = null;
            lastTradePrice = null;
            BigDecimal lastTradePrice = null;
            if (showQuotePill) {
                HubDefaultCategoryContentStateProvider hubDefaultCategoryContentStateProvider = INSTANCE;
                UiEventContractPosition uiEventContractPosition = contractIdsToPositions != null ? contractIdsToPositions.get(contractId) : null;
                if (contractIdsToQuotes != null && (eventQuote = contractIdsToQuotes.get(contractId)) != null) {
                    lastTradePrice = eventQuote.getLastTradePrice();
                }
                cardPills7GenerateContractPillState = hubDefaultCategoryContentStateProvider.generateContractPillState(uiEventContractPosition, lastTradePrice, DayNightColor2.getDayNightColor(contractInfo), formatPriceAsPercent);
            }
            arrayList.add(new UpcomingEventCardViewState.ContractViewState(contractId, dayNightColor, headerImageUrl, shortName, description, tertiaryText, cardPills7GenerateContractPillState, Intrinsics.areEqual(eventState.getContractIdToVisualEmphasis().get(contractId), Boolean.TRUE)));
        }
        return extensions2.toPersistentList(arrayList);
    }

    private final CardPills7 generateContractPillState(UiEventContractPosition position, BigDecimal lastTradePrice, DayNightColor dayNightColor, boolean formatPriceAsPercent) {
        String strPriceInCents;
        String str = "-";
        if (!formatPriceAsPercent ? !(lastTradePrice == null || (strPriceInCents = BigDecimals2.priceInCents(lastTradePrice)) == null) : !(lastTradePrice == null || (strPriceInCents = Formats.getPercentFormat().format(lastTradePrice)) == null)) {
            str = strPriceInCents;
        }
        if (position != null && !BigDecimals7.isZero(position.getQuantity())) {
            return new CardPills7.QuoteWithPositionPillState(str, getPositionText(position.getQuantity()), dayNightColor);
        }
        return new CardPills7.QuoteWithNoPositionPillState(str);
    }

    private final StringResource getPositionText(BigDecimal quantity) {
        NumberFormatter integerFormat = Formats.getIntegerFormat();
        BigDecimal bigDecimalAbs = quantity.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        String str = integerFormat.format(bigDecimalAbs);
        if (BigDecimals7.isNegative(quantity)) {
            return StringResource.INSTANCE.invoke(C16533R.string.no_position_quantity_label, str);
        }
        return StringResource.INSTANCE.invoke(str);
    }
}
