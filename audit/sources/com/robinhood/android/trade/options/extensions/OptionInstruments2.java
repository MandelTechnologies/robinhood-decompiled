package com.robinhood.android.trade.options.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: OptionInstruments.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/models/db/OptionInstrument;", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/models/db/OrderSide;", "side", "j$/time/LocalDate", "expirationDate", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "", "getSingLegQuantityRowTitleString", "(Lcom/robinhood/models/db/OptionInstrument;Landroid/content/res/Resources;Lcom/robinhood/models/db/OrderSide;Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)Ljava/lang/String;", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.extensions.OptionInstrumentsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionInstruments2 {

    /* compiled from: OptionInstruments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.extensions.OptionInstrumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getSingLegQuantityRowTitleString(OptionInstrument optionInstrument, Resources resources, OrderSide side, LocalDate localDate, UiOptionChain uiOptionChain) throws Resources.NotFoundException {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        int i2 = WhenMappings.$EnumSwitchMapping$0[uiOptionChain.getUnderlyingType().ordinal()];
        if (i2 == 1) {
            str = Formats.getStrikePriceFormat().format(optionInstrument.getStrikePrice());
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = Formats.getStrikeValueFormat().format(optionInstrument.getStrikePrice());
        }
        if (uiOptionChain.getOptionChain().getSettleOnOpen()) {
            i = C29757R.string.order_option_instrument_detail_title_settle_on_open;
        } else {
            i = C29757R.string.order_option_instrument_detail_title;
        }
        String string2 = resources.getString(i, UiOptionOrders3.getSideString(resources, side), optionInstrument.getChainSymbol(), str, OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null), localDate != null ? OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(localDate) : null);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
