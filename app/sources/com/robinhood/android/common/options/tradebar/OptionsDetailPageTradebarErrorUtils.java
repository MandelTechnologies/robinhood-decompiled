package com.robinhood.android.common.options.tradebar;

import android.content.res.Resources;
import android.text.TextUtils;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState;
import com.robinhood.android.common.options.tradebar.PcoErrorState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalTime;
import p479j$.time.ZonedDateTime;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionsDetailPageTradebarErrorUtils.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/models/db/OptionPositionType;", "positionType", "", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "getSingleLegPcoDisabledActions", "(Lcom/robinhood/models/db/OptionPositionType;)Ljava/util/List;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/models/db/OptionInstrument;", "instrument", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "", "showSelloutTime", "Lcom/robinhood/android/common/options/tradebar/PcoErrorState;", "getPcoErrorStateForSingleLeg", "(Lj$/time/Clock;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionPositionType;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Z)Lcom/robinhood/android/common/options/tradebar/PcoErrorState;", "getIndexOptionServerPcoErrorStateForSingleLeg", "(Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionPositionType;)Lcom/robinhood/android/common/options/tradebar/PcoErrorState;", "Lcom/robinhood/models/db/Tradability;", "adjustedTradability", "legPositionType", "Landroid/content/res/Resources;", "res", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$NoCtaError;", "getEquityOptionSingleLegTradebarError", "(Lcom/robinhood/models/db/Tradability;Lj$/time/Clock;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionPositionType;Landroid/content/res/Resources;Z)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError$NoCtaError;", "settleOnOpen", "getIndexOptionSingleLegTradebarError", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarErrorUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarErrorUtils {

    /* compiled from: OptionsDetailPageTradebarErrorUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarErrorUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionPositionType.values().length];
            try {
                iArr[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Tradability.values().length];
            try {
                iArr2[Tradability.TRADABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Tradability.UNTRADABLE_REGSHO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Tradability.UNTRADABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Tradability.POSITION_OPENING_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Tradability.POSITION_CLOSING_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final List<OptionsDetailPageTradebarViewState.ActionType> getSingleLegPcoDisabledActions(OptionPositionType positionType) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        int i = WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
        if (i == 1) {
            return CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.BUY);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.SELL);
    }

    static /* synthetic */ PcoErrorState getPcoErrorStateForSingleLeg$default(Clock clock, OptionInstrument optionInstrument, OptionPositionType optionPositionType, OptionChain.UnderlyingType underlyingType, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return getPcoErrorStateForSingleLeg(clock, optionInstrument, optionPositionType, underlyingType, z);
    }

    private static final PcoErrorState getPcoErrorStateForSingleLeg(Clock clock, OptionInstrument optionInstrument, OptionPositionType optionPositionType, OptionChain.UnderlyingType underlyingType, boolean z) {
        return PcoErrorState.INSTANCE.from(LocalDates.currentDateInEst(clock).compareTo((ChronoLocalDate) optionInstrument.getExpirationDate()) >= 0, optionPositionType, optionInstrument.getContractType(), underlyingType, z);
    }

    private static final PcoErrorState getIndexOptionServerPcoErrorStateForSingleLeg(OptionInstrument optionInstrument, OptionPositionType optionPositionType) {
        return PcoErrorState.Companion.from$default(PcoErrorState.INSTANCE, false, optionPositionType, optionInstrument.getContractType(), OptionChain.UnderlyingType.INDEX, false, 16, null);
    }

    public static /* synthetic */ OptionsDetailPageTradebarViewState.TradebarError.NoCtaError getEquityOptionSingleLegTradebarError$default(Tradability tradability, Clock clock, OptionInstrument optionInstrument, OptionPositionType optionPositionType, Resources resources, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return getEquityOptionSingleLegTradebarError(tradability, clock, optionInstrument, optionPositionType, resources, z);
    }

    public static final OptionsDetailPageTradebarViewState.TradebarError.NoCtaError getEquityOptionSingleLegTradebarError(Tradability tradability, Clock clock, OptionInstrument instrument, OptionPositionType legPositionType, Resources res, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(legPositionType, "legPositionType");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = tradability == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tradability.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            String string2 = res.getString(C11453R.string.option_detail_trade_bar_error_untradable);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string2, Component.ComponentType.OPTION_UNTRADABLE_DIALOG);
        }
        if (i == 4) {
            throw new IllegalStateException("Not supported for options");
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT;
        LocalTime localTime = ZonedDateTime.ofInstant(instrument.getSelloutDatetime(), ZoneIds.INSTANCE.getNEW_YORK()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        String str = localTimeFormatter.format(localTime);
        OptionChain.UnderlyingType underlyingType = OptionChain.UnderlyingType.EQUITY;
        int errorRes = getPcoErrorStateForSingleLeg(clock, instrument, legPositionType, underlyingType, z).getErrorRes();
        if (z) {
            String string3 = res.getString(errorRes, str);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            CharSequence text = res.getText(C11453R.string.option_detail_trade_bar_error_learn_more);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            CharSequence charSequenceConcat = TextUtils.concat(string3, text);
            Intrinsics.checkNotNull(charSequenceConcat);
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(charSequenceConcat, Component.ComponentType.OPTION_PCO_DIALOG);
        }
        CharSequence text2 = res.getText(getPcoErrorStateForSingleLeg$default(clock, instrument, legPositionType, underlyingType, false, 16, null).getErrorRes());
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(text2, Component.ComponentType.OPTION_PCO_DIALOG);
    }

    public static final OptionsDetailPageTradebarViewState.TradebarError.NoCtaError getIndexOptionSingleLegTradebarError(Tradability tradability, Clock clock, OptionInstrument instrument, OptionPositionType legPositionType, Resources res, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(legPositionType, "legPositionType");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$1[instrument.getTradability().ordinal()];
        if (i == 1) {
            if (z || z || tradability != Tradability.POSITION_CLOSING_ONLY) {
                return null;
            }
            String string2 = res.getString(getPcoErrorStateForSingleLeg$default(clock, instrument, legPositionType, OptionChain.UnderlyingType.INDEX, false, 16, null).getErrorRes());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string2, Component.ComponentType.OPTION_PCO_DIALOG);
        }
        if (i == 2 || i == 3) {
            String string3 = res.getString(C11453R.string.option_detail_trade_bar_error_untradable);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string3, Component.ComponentType.OPTION_UNTRADABLE_DIALOG);
        }
        if (i == 4) {
            throw new IllegalStateException("Not supported for options");
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (Instant.now(clock).compareTo(instrument.getSelloutDatetime()) >= 0) {
            return null;
        }
        String string4 = res.getString(getIndexOptionServerPcoErrorStateForSingleLeg(instrument, legPositionType).getErrorRes());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string4, Component.ComponentType.OPTION_PCO_DIALOG);
    }
}
