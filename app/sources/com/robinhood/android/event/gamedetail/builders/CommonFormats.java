package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonFormats.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"formatPositionQuantityWithPrice", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.CommonFormatsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CommonFormats {
    public static final StringResource formatPositionQuantityWithPrice(UiEventContractPosition uiEventContractPosition) {
        Intrinsics.checkNotNullParameter(uiEventContractPosition, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C16283R.string.position_detail_bottom_sheet_quantity_with_price;
        NumberFormatter integerFormat = Formats.getIntegerFormat();
        BigDecimal bigDecimalAbs = uiEventContractPosition.getQuantity().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return companion.invoke(i, integerFormat.format(bigDecimalAbs), Formats.getCurrencyFormat().format(EventMathsUtils.getAvgPriceWithRounding(uiEventContractPosition)));
    }
}
