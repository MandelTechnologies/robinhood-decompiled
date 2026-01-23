package com.robinhood.android.history.p153ui;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.api.pluto.ApiRoundupTimeline;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.p320db.RoundupReward;
import com.robinhood.models.p320db.mcduckling.RoundupTimeline;
import com.robinhood.models.p355ui.UiRoundupReward;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: RoundupDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002HIB;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÂ\u0003J=\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u0013\u00102\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b3\u0010\u0015R\u0013\u00104\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b5\u0010/R\u0011\u00106\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u0010\rR\u0013\u00108\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b9\u0010/R\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010\rR\u0013\u0010<\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b=\u0010/¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RoundupDetailViewState;", "", "isLoading", "", "uiRoundupReward", "Lcom/robinhood/models/ui/UiRoundupReward;", "timelineActionErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "roundupTimeline", "Lcom/robinhood/models/db/mcduckling/RoundupTimeline;", "<init>", "(ZLcom/robinhood/models/ui/UiRoundupReward;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/RoundupTimeline;)V", "()Z", "getUiRoundupReward", "()Lcom/robinhood/models/ui/UiRoundupReward;", "getTimelineActionErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "underlyingSymbol", "", "getUnderlyingSymbol", "()Ljava/lang/String;", "underlyingCurrencyPair", "Ljava/util/UUID;", "getUnderlyingCurrencyPair", "()Ljava/util/UUID;", "subtitle", "getSubtitle", "isTopBannerVisible", "topBannerMessage", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getTopBannerMessage", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "topBannerAction", "Lcom/robinhood/models/db/mcduckling/RoundupTimeline$Action;", "getTopBannerAction", "()Lcom/robinhood/models/db/mcduckling/RoundupTimeline$Action;", "roundupId", "getRoundupId", "roundupTimelineAdapterItems", "", "Lcom/robinhood/android/history/ui/RoundupDetailViewState$RoundupDetailTimelineAdapterItem;", "getRoundupTimelineAdapterItems", "()Ljava/util/List;", "roundupPeriod", "Lcom/robinhood/utils/resource/StringResource;", "getRoundupPeriod", "()Lcom/robinhood/utils/resource/StringResource;", "roundupAmount", "getRoundupAmount", "totalAmount", "getTotalAmount", "bonusPercent", "getBonusPercent", "shouldShowBonus", "getShouldShowBonus", "bonusAmount", "getBonusAmount", "showBonusCappedInfo", "getShowBonusCappedInfo", "bonusCappedDialogMessage", "getBonusCappedDialogMessage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "RoundupDetailTimelineAdapterItem", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class RoundupDetailViewState {
    private static final long PERCENTAGE = 100;
    private final boolean isLoading;
    private final RoundupTimeline roundupTimeline;
    private final UiEvent<Throwable> timelineActionErrorEvent;
    private final UiRoundupReward uiRoundupReward;
    public static final int $stable = 8;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy").withLocale(Locale.US).withZone(ZoneId.systemDefault());

    /* compiled from: RoundupDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRoundupTimeline.State.values().length];
            try {
                iArr[ApiRoundupTimeline.State.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRoundupTimeline.State.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRoundupTimeline.State.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RoundupDetailViewState() {
        this(false, null, null, null, 15, null);
    }

    /* renamed from: component4, reason: from getter */
    private final RoundupTimeline getRoundupTimeline() {
        return this.roundupTimeline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundupDetailViewState copy$default(RoundupDetailViewState roundupDetailViewState, boolean z, UiRoundupReward uiRoundupReward, UiEvent uiEvent, RoundupTimeline roundupTimeline, int i, Object obj) {
        if ((i & 1) != 0) {
            z = roundupDetailViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiRoundupReward = roundupDetailViewState.uiRoundupReward;
        }
        if ((i & 4) != 0) {
            uiEvent = roundupDetailViewState.timelineActionErrorEvent;
        }
        if ((i & 8) != 0) {
            roundupTimeline = roundupDetailViewState.roundupTimeline;
        }
        return roundupDetailViewState.copy(z, uiRoundupReward, uiEvent, roundupTimeline);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final UiRoundupReward getUiRoundupReward() {
        return this.uiRoundupReward;
    }

    public final UiEvent<Throwable> component3() {
        return this.timelineActionErrorEvent;
    }

    public final RoundupDetailViewState copy(boolean isLoading, UiRoundupReward uiRoundupReward, UiEvent<Throwable> timelineActionErrorEvent, RoundupTimeline roundupTimeline) {
        return new RoundupDetailViewState(isLoading, uiRoundupReward, timelineActionErrorEvent, roundupTimeline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundupDetailViewState)) {
            return false;
        }
        RoundupDetailViewState roundupDetailViewState = (RoundupDetailViewState) other;
        return this.isLoading == roundupDetailViewState.isLoading && Intrinsics.areEqual(this.uiRoundupReward, roundupDetailViewState.uiRoundupReward) && Intrinsics.areEqual(this.timelineActionErrorEvent, roundupDetailViewState.timelineActionErrorEvent) && Intrinsics.areEqual(this.roundupTimeline, roundupDetailViewState.roundupTimeline);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        int iHashCode2 = (iHashCode + (uiRoundupReward == null ? 0 : uiRoundupReward.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.timelineActionErrorEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        RoundupTimeline roundupTimeline = this.roundupTimeline;
        return iHashCode3 + (roundupTimeline != null ? roundupTimeline.hashCode() : 0);
    }

    public String toString() {
        return "RoundupDetailViewState(isLoading=" + this.isLoading + ", uiRoundupReward=" + this.uiRoundupReward + ", timelineActionErrorEvent=" + this.timelineActionErrorEvent + ", roundupTimeline=" + this.roundupTimeline + ")";
    }

    public RoundupDetailViewState(boolean z, UiRoundupReward uiRoundupReward, UiEvent<Throwable> uiEvent, RoundupTimeline roundupTimeline) {
        this.isLoading = z;
        this.uiRoundupReward = uiRoundupReward;
        this.timelineActionErrorEvent = uiEvent;
        this.roundupTimeline = roundupTimeline;
    }

    public /* synthetic */ RoundupDetailViewState(boolean z, UiRoundupReward uiRoundupReward, UiEvent uiEvent, RoundupTimeline roundupTimeline, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : uiRoundupReward, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : roundupTimeline);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiRoundupReward getUiRoundupReward() {
        return this.uiRoundupReward;
    }

    public final UiEvent<Throwable> getTimelineActionErrorEvent() {
        return this.timelineActionErrorEvent;
    }

    public final String getUnderlyingSymbol() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward != null) {
            return uiRoundupReward.getAssetSymbol();
        }
        return null;
    }

    public final UUID getUnderlyingCurrencyPair() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (((uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) ? null : roundupReward.getInvestmentType()) == RoundupInvestmentType.CRYPTO) {
            return this.uiRoundupReward.getRoundupReward().getInvestmentAssetId();
        }
        return null;
    }

    public final String getSubtitle() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward != null) {
            return uiRoundupReward.getAssetName();
        }
        return null;
    }

    public final boolean isTopBannerVisible() {
        return getTopBannerMessage() != null;
    }

    public final MarkdownContent getTopBannerMessage() {
        List<RoundupTimeline.TimelineEntry> timeline;
        RoundupTimeline.TimelineEntry timelineEntryPrevious;
        RoundupTimeline roundupTimeline = this.roundupTimeline;
        if (roundupTimeline != null && (timeline = roundupTimeline.getTimeline()) != null) {
            ListIterator<RoundupTimeline.TimelineEntry> listIterator = timeline.listIterator(timeline.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    timelineEntryPrevious = null;
                    break;
                }
                timelineEntryPrevious = listIterator.previous();
                if (timelineEntryPrevious.getMessage() != null) {
                    break;
                }
            }
            RoundupTimeline.TimelineEntry timelineEntry = timelineEntryPrevious;
            if (timelineEntry != null) {
                return timelineEntry.getMessage();
            }
        }
        return null;
    }

    public final RoundupTimeline.Action getTopBannerAction() {
        List<RoundupTimeline.TimelineEntry> timeline;
        RoundupTimeline.TimelineEntry timelineEntryPrevious;
        RoundupTimeline roundupTimeline = this.roundupTimeline;
        if (roundupTimeline != null && (timeline = roundupTimeline.getTimeline()) != null) {
            ListIterator<RoundupTimeline.TimelineEntry> listIterator = timeline.listIterator(timeline.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    timelineEntryPrevious = null;
                    break;
                }
                timelineEntryPrevious = listIterator.previous();
                if (timelineEntryPrevious.getAction() != null) {
                    break;
                }
            }
            RoundupTimeline.TimelineEntry timelineEntry = timelineEntryPrevious;
            if (timelineEntry != null) {
                return timelineEntry.getAction();
            }
        }
        return null;
    }

    public final UUID getRoundupId() {
        RoundupTimeline roundupTimeline = this.roundupTimeline;
        if (roundupTimeline != null) {
            return roundupTimeline.getId();
        }
        return null;
    }

    public final List<RoundupDetailTimelineAdapterItem> getRoundupTimelineAdapterItems() {
        List<RoundupTimeline.TimelineEntry> timeline;
        RdsTimelineRowView.Position position;
        RdsTimelineRowView.State state;
        RoundupTimeline roundupTimeline = this.roundupTimeline;
        if (roundupTimeline == null || (timeline = roundupTimeline.getTimeline()) == null) {
            return null;
        }
        List<RoundupTimeline.TimelineEntry> list = timeline;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoundupTimeline.TimelineEntry timelineEntry = (RoundupTimeline.TimelineEntry) obj;
            String title = timelineEntry.getTitle();
            Instant timestamp = timelineEntry.getTimestamp();
            String str = timestamp != null ? InstantFormatter.DATE_NO_YEAR_IN_UTC.format(timestamp) : null;
            Money dollarAmount = timelineEntry.getDollarAmount();
            String str2 = dollarAmount != null ? Money.format$default(dollarAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
            if (i == 0) {
                position = RdsTimelineRowView.Position.TOP;
            } else {
                position = i == this.roundupTimeline.getTimeline().size() - 1 ? RdsTimelineRowView.Position.BOTTOM : RdsTimelineRowView.Position.BETWEEN;
            }
            RdsTimelineRowView.Position position2 = position;
            int i3 = WhenMappings.$EnumSwitchMapping$0[timelineEntry.getState().ordinal()];
            if (i3 == 1 || i3 == 2) {
                state = RdsTimelineRowView.State.INCOMPLETE;
            } else if (i3 == 3) {
                state = RdsTimelineRowView.State.COMPLETE;
            } else {
                state = RdsTimelineRowView.State.ERROR;
            }
            arrayList.add(new RoundupDetailTimelineAdapterItem(title, str, str2, position2, state));
            i = i2;
        }
        return arrayList;
    }

    public final StringResource getRoundupPeriod() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C18359R.string.roundup_detail_roundup_period_value;
        DateTimeFormatter dateTimeFormatter = DATE_FORMATTER;
        return companion.invoke(i, dateTimeFormatter.format(uiRoundupReward.getRoundupReward().getRoundupStart()), dateTimeFormatter.format(uiRoundupReward.getRoundupReward().getRoundupEnd()));
    }

    public final String getRoundupAmount() {
        RoundupReward roundupReward;
        Money roundupAmount;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null || (roundupAmount = roundupReward.getRoundupAmount()) == null) {
            return null;
        }
        return Money.format$default(roundupAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getTotalAmount() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null) {
            return null;
        }
        RoundupReward roundupReward = uiRoundupReward.getRoundupReward();
        return Money.format$default(roundupReward.getRoundupAmount().plus(roundupReward.getBonusAmount()), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final StringResource getBonusPercent() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward != null) {
            return StringResource.INSTANCE.invoke(C18359R.string.roundup_detail_bonus_percent_value, Integer.valueOf(uiRoundupReward.getRoundupReward().getBonusRate().multiply(BigDecimal.valueOf(100L)).intValueExact()));
        }
        return null;
    }

    public final boolean getShouldShowBonus() {
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward != null) {
            return uiRoundupReward.getHasBonus();
        }
        return false;
    }

    public final StringResource getBonusAmount() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) {
            return null;
        }
        Money bonusAmount = roundupReward.getBonusAmount();
        if (roundupReward.getBonusCapped()) {
            return StringResource.INSTANCE.invoke(C18359R.string.roundup_detail_bonus_max, Money.format$default(bonusAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return StringResource.INSTANCE.invoke(Money.format$default(bonusAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final boolean getShowBonusCappedInfo() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        return (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null || !roundupReward.getBonusCapped()) ? false : true;
    }

    public final StringResource getBonusCappedDialogMessage() {
        RoundupReward roundupReward;
        UiRoundupReward uiRoundupReward = this.uiRoundupReward;
        if (uiRoundupReward == null || (roundupReward = uiRoundupReward.getRoundupReward()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C18359R.string.roundup_detail_bonus_amount_info_dialog_message, Money.format$default(roundupReward.getBonusAmount(), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
    }

    /* compiled from: RoundupDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/RoundupDetailViewState$RoundupDetailTimelineAdapterItem;", "", "primaryText", "", "timestampText", "metadataText", "position", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "state", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;)V", "getPrimaryText", "()Ljava/lang/String;", "getTimestampText", "getMetadataText", "getPosition", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "getState", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RoundupDetailTimelineAdapterItem {
        public static final int $stable = 0;
        private final String metadataText;
        private final RdsTimelineRowView.Position position;
        private final String primaryText;
        private final RdsTimelineRowView.State state;
        private final String timestampText;

        public static /* synthetic */ RoundupDetailTimelineAdapterItem copy$default(RoundupDetailTimelineAdapterItem roundupDetailTimelineAdapterItem, String str, String str2, String str3, RdsTimelineRowView.Position position, RdsTimelineRowView.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = roundupDetailTimelineAdapterItem.primaryText;
            }
            if ((i & 2) != 0) {
                str2 = roundupDetailTimelineAdapterItem.timestampText;
            }
            if ((i & 4) != 0) {
                str3 = roundupDetailTimelineAdapterItem.metadataText;
            }
            if ((i & 8) != 0) {
                position = roundupDetailTimelineAdapterItem.position;
            }
            if ((i & 16) != 0) {
                state = roundupDetailTimelineAdapterItem.state;
            }
            RdsTimelineRowView.State state2 = state;
            String str4 = str3;
            return roundupDetailTimelineAdapterItem.copy(str, str2, str4, position, state2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTimestampText() {
            return this.timestampText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMetadataText() {
            return this.metadataText;
        }

        /* renamed from: component4, reason: from getter */
        public final RdsTimelineRowView.Position getPosition() {
            return this.position;
        }

        /* renamed from: component5, reason: from getter */
        public final RdsTimelineRowView.State getState() {
            return this.state;
        }

        public final RoundupDetailTimelineAdapterItem copy(String primaryText, String timestampText, String metadataText, RdsTimelineRowView.Position position, RdsTimelineRowView.State state) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(state, "state");
            return new RoundupDetailTimelineAdapterItem(primaryText, timestampText, metadataText, position, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundupDetailTimelineAdapterItem)) {
                return false;
            }
            RoundupDetailTimelineAdapterItem roundupDetailTimelineAdapterItem = (RoundupDetailTimelineAdapterItem) other;
            return Intrinsics.areEqual(this.primaryText, roundupDetailTimelineAdapterItem.primaryText) && Intrinsics.areEqual(this.timestampText, roundupDetailTimelineAdapterItem.timestampText) && Intrinsics.areEqual(this.metadataText, roundupDetailTimelineAdapterItem.metadataText) && this.position == roundupDetailTimelineAdapterItem.position && this.state == roundupDetailTimelineAdapterItem.state;
        }

        public int hashCode() {
            int iHashCode = this.primaryText.hashCode() * 31;
            String str = this.timestampText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.metadataText;
            return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.position.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "RoundupDetailTimelineAdapterItem(primaryText=" + this.primaryText + ", timestampText=" + this.timestampText + ", metadataText=" + this.metadataText + ", position=" + this.position + ", state=" + this.state + ")";
        }

        public RoundupDetailTimelineAdapterItem(String primaryText, String str, String str2, RdsTimelineRowView.Position position, RdsTimelineRowView.State state) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(state, "state");
            this.primaryText = primaryText;
            this.timestampText = str;
            this.metadataText = str2;
            this.position = position;
            this.state = state;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getTimestampText() {
            return this.timestampText;
        }

        public final String getMetadataText() {
            return this.metadataText;
        }

        public final RdsTimelineRowView.Position getPosition() {
            return this.position;
        }

        public final RdsTimelineRowView.State getState() {
            return this.state;
        }
    }
}
