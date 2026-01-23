package com.robinhood.android.common.options.toolbar;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsToolbarUtils.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0014"}, m3636d2 = {"getToolbarTitle", "", "resources", "Landroid/content/res/Resources;", "uiAggregatePositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiOptionInstrumentPositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "displayMode", "Lcom/robinhood/android/common/options/toolbar/OptionsToolbarDisplayMode;", "useWatchList", "", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getWatchListQuantity", "Ljava/math/BigDecimal;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.toolbar.OptionsToolbarUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionsToolbarUtils {

    /* compiled from: OptionsToolbarUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.toolbar.OptionsToolbarUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsToolbarDisplayMode.values().length];
            try {
                iArr[OptionsToolbarDisplayMode.OPTIONS_DETAIL_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsToolbarDisplayMode.OPTIONS_PROJECTED_RETURN_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CharSequence getToolbarTitle$default(Resources resources, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionStrategyInfo uiOptionStrategyInfo, CuratedListItem curatedListItem, OptionsToolbarDisplayMode optionsToolbarDisplayMode, boolean z, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
        if ((i & 64) != 0) {
            z = false;
        }
        return getToolbarTitle(resources, uiAggregateOptionPositionFull, uiOptionInstrumentPosition, uiOptionStrategyInfo, curatedListItem, optionsToolbarDisplayMode, z, underlyingType);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CharSequence getToolbarTitle(Resources resources, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionStrategyInfo uiOptionStrategyInfo, CuratedListItem curatedListItem, OptionsToolbarDisplayMode displayMode, boolean z, OptionChain.UnderlyingType underlyingType) {
        Resources resources2;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull2;
        OptionChain.UnderlyingType underlyingType2;
        CharSequence strategyTitle;
        OptionInstrument optionInstrument;
        int i;
        OptionInstrumentPosition optionInstrumentPosition;
        AggregateOptionPosition aggregateOptionPosition;
        BigDecimal deltaQuantity;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        BigDecimal quantity = null;
        if (uiAggregateOptionPositionFull != null) {
            resources2 = resources;
            uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull;
            underlyingType2 = underlyingType;
            strategyTitle = OptionExtensions2.getStrategyTitle$default(uiAggregateOptionPositionFull2, resources2, false, underlyingType2, 2, null);
            if (strategyTitle == null) {
            }
            i = WhenMappings.$EnumSwitchMapping$0[displayMode.ordinal()];
            if (i != 1) {
                return strategyTitle == null ? "" : strategyTitle;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (strategyTitle == null) {
                return "";
            }
            if (z) {
                quantity = getWatchListQuantity(curatedListItem);
            } else if (uiAggregateOptionPositionFull2 != null && (aggregateOptionPosition = uiAggregateOptionPositionFull2.getAggregateOptionPosition()) != null && (deltaQuantity = aggregateOptionPosition.getDeltaQuantity()) != null) {
                quantity = deltaQuantity;
            } else if (uiOptionInstrumentPosition != null && (optionInstrumentPosition = uiOptionInstrumentPosition.getOptionInstrumentPosition()) != null) {
                quantity = optionInstrumentPosition.getDeltaQuantity();
            } else if (uiOptionStrategyInfo != null) {
                quantity = uiOptionStrategyInfo.getQuantity();
            }
            if (quantity == null) {
                return "";
            }
            return ((Object) strategyTitle) + " (" + Formats.getIntegerFormat().format(quantity) + "x)";
        }
        resources2 = resources;
        uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull;
        underlyingType2 = underlyingType;
        if (uiOptionInstrumentPosition == null || (optionInstrument = uiOptionInstrumentPosition.getOptionInstrument()) == null) {
            strategyTitle = uiOptionStrategyInfo != null ? OptionExtensions2.getStrategyTitle(uiOptionStrategyInfo, resources2, uiOptionStrategyInfo.getOptionChain().getSymbol(), underlyingType2) : null;
        } else {
            strategyTitle = OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, resources2, underlyingType2);
        }
        i = WhenMappings.$EnumSwitchMapping$0[displayMode.ordinal()];
        if (i != 1) {
        }
    }

    private static final BigDecimal getWatchListQuantity(CuratedListItem curatedListItem) {
        OrderDirection optionOpenPriceDirection;
        if (curatedListItem == null || (optionOpenPriceDirection = curatedListItem.getOptionOpenPriceDirection()) == null) {
            return null;
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalMultiply = ONE.multiply(optionOpenPriceDirection.getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }
}
