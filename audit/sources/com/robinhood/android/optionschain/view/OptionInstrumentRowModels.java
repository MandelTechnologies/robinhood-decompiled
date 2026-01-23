package com.robinhood.android.optionschain.view;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionInstrumentRowModel;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionInstrumentRowModels.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getStrikeValueString", "", "Lcom/robinhood/android/optionschain/OptionInstrumentRowModel;", "resources", "Landroid/content/res/Resources;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.view.OptionInstrumentRowModelsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionInstrumentRowModels {

    /* compiled from: OptionInstrumentRowModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.view.OptionInstrumentRowModelsKt$WhenMappings */
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
            int[] iArr2 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr2[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getStrikeValueString(OptionInstrumentRowModel optionInstrumentRowModel, Resources resources) throws Resources.NotFoundException {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(optionInstrumentRowModel, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$0[optionInstrumentRowModel.getOptionInstrument().getContractType().ordinal()];
        if (i2 == 1) {
            i = C24135R.string.option_order_contract_price_call;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C24135R.string.option_order_contract_price_put;
        }
        UiOptionChain uiOptionChain = optionInstrumentRowModel.getUiOptionChain();
        OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
        int i3 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
        if (i3 == -1) {
            str = Formats.getStrikePriceFormat().format(optionInstrumentRowModel.getOptionInstrument().getStrikePrice());
        } else if (i3 == 1) {
            str = Formats.getStrikeValueFormat().format(optionInstrumentRowModel.getOptionInstrument().getStrikePrice());
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = Formats.getStrikePriceFormat().format(optionInstrumentRowModel.getOptionInstrument().getStrikePrice());
        }
        String string2 = resources.getString(i, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
