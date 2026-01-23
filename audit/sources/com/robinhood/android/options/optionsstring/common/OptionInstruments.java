package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrument2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionInstruments.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n\u001a\"\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\u001a\u0010\b\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\u0011\u001a\u00020\u000e*\u00020\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0019"}, m3636d2 = {"getInstrumentDetailRowTitleString", "", "Lcom/robinhood/models/db/OptionInstrument;", "resources", "Landroid/content/res/Resources;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getInstrumentTitleString", "getTitleStringWithExpiration", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "settleOnOpen", "", "getTitleStringWithSide", "Lcom/robinhood/utils/resource/StringResource;", "side", "Lcom/robinhood/models/db/OrderSide;", "getTypeString", "Lcom/robinhood/models/db/OptionInstrumentDetails;", "getContractTypeString", "type", "Lcom/robinhood/models/db/OptionContractType;", "quantity", "", "getSideString", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionInstrumentsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionInstruments {

    /* compiled from: OptionInstruments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionInstrumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getInstrumentDetailRowTitleString(OptionInstrument optionInstrument, Resources resources, OptionChain.UnderlyingType underlyingType) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        String string2 = resources.getString(C23386R.string.option_position_instrument_detail_row_title, OptionExtensions2.strikeNumberFormatter(underlyingType).format(optionInstrument.getStrikePrice()), OptionExtensions.getTypeString(optionInstrument, resources));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getInstrumentTitleString(OptionInstrument optionInstrument, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String str = OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate());
        String string2 = resources.getString(C23386R.string.option_instrument_detail_title, optionInstrument.getChainSymbol(), Formats.getStrikePriceFormat().format(optionInstrument.getStrikePrice()), OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null), str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTitleStringWithExpiration(OptionInstrument optionInstrument, Resources resources, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        return getTitleStringWithExpiration(optionInstrument, resources, uiOptionChain.getUnderlyingType(), uiOptionChain.getOptionChain().getSettleOnOpen());
    }

    public static final String getTitleStringWithExpiration(OptionInstrument optionInstrument, Resources resources, OptionChain.UnderlyingType underlyingType, boolean z) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        if (z) {
            i = C23386R.string.option_position_row_title_full_settle_on_open;
        } else {
            i = C23386R.string.option_position_row_title_full;
        }
        String string2 = resources.getString(i, optionInstrument.getChainSymbol(), OptionUnderlyings.getStrikeFormatter(underlyingType).format(optionInstrument.getStrikePrice()), OptionExtensions.getTypeString(optionInstrument, resources), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final StringResource getTitleStringWithSide(OptionInstrument optionInstrument, OrderSide side, OptionChain.UnderlyingType underlyingType, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        if (z) {
            i = C23386R.string.option_position_row_title_with_side_full_settle_on_open;
        } else {
            i = C23386R.string.option_position_row_title_with_side_full;
        }
        return StringResource.INSTANCE.invoke(i, getSideString(side), OptionUnderlyings.getStrikeFormatter(underlyingType).format(optionInstrument.getStrikePrice()), getTypeString(optionInstrument), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
    }

    public static final StringResource getTitleStringWithExpiration(OptionInstrument optionInstrument, OptionChain.UnderlyingType underlyingType, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        if (z) {
            i = C23386R.string.option_position_row_title_full_settle_on_open;
        } else {
            i = C23386R.string.option_position_row_title_full;
        }
        return StringResource.INSTANCE.invoke(i, optionInstrument.getChainSymbol(), OptionUnderlyings.getStrikeFormatter(underlyingType).format(optionInstrument.getStrikePrice()), getTypeString(optionInstrument), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
    }

    public static final StringResource getTypeString(OptionInstrument2 optionInstrument2) {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        return getContractTypeString$default(optionInstrument2.getContractType(), 0, 2, null);
    }

    public static /* synthetic */ StringResource getContractTypeString$default(OptionContractType optionContractType, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return getContractTypeString(optionContractType, i);
    }

    public static final StringResource getContractTypeString(OptionContractType type2, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(type2, "type");
        int i3 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i3 == 1) {
            i2 = C11048R.plurals.option_contract_type_call;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C11048R.plurals.option_contract_type_put;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(i2, i), new Object[0]);
    }

    public static final StringResource getSideString(OrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C32428R.string.general_label_buy, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C32428R.string.general_label_sell, new Object[0]);
    }
}
