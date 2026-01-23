package com.robinhood.android.common.search;

import android.graphics.drawable.Drawable;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsRowViewExtensions.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a0\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u001a"}, m3636d2 = {"bindInstrumentPositionResult", "", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "instrumentPositionResult", "Lcom/robinhood/android/common/search/SearchItem$InstrumentPositionResult;", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "bindCryptoResult", "cryptoResult", "Lcom/robinhood/android/common/search/SearchItem$CryptoResult;", "bindCryptoHoldingResult", "cryptoHoldingResult", "Lcom/robinhood/android/common/search/SearchItem$CryptoHoldingResult;", "bindRurSavingsRow", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/common/search/SearchItem$RurSavingsChoice;", "bindInstrumentResult", "instrumentResult", "Lcom/robinhood/android/common/search/SearchItem$InstrumentResult;", "bindInstrumentAndPosition", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "isEnabled", "", "lib-investment-search_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.search.RdsRowViewExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RdsRowViewExtensions {
    public static /* synthetic */ void bindInstrumentPositionResult$default(RdsRowView rdsRowView, SearchItem.InstrumentPositionResult instrumentPositionResult, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        bindInstrumentPositionResult(rdsRowView, instrumentPositionResult, drawable);
    }

    public static final void bindInstrumentPositionResult(RdsRowView rdsRowView, SearchItem.InstrumentPositionResult instrumentPositionResult, Drawable drawable) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(instrumentPositionResult, "instrumentPositionResult");
        bindInstrumentAndPosition(rdsRowView, instrumentPositionResult.getInstrument(), instrumentPositionResult.getPosition(), instrumentPositionResult.isEnabled(), drawable);
    }

    public static final void bindCryptoResult(RdsRowView rdsRowView, SearchItem.CryptoResult cryptoResult) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(cryptoResult, "cryptoResult");
        RdsRowView.bind$default(rdsRowView, cryptoResult.getCurrency().getName(), cryptoResult.getCurrency().getCode(), null, null, null, 28, null);
        rdsRowView.setMainTextEnabled(rdsRowView.isEnabled());
    }

    public static final void bindCryptoHoldingResult(RdsRowView rdsRowView, SearchItem.CryptoHoldingResult cryptoHoldingResult) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(cryptoHoldingResult, "cryptoHoldingResult");
        String name = cryptoHoldingResult.getCurrency().getName();
        String string2 = rdsRowView.getContext().getString(C11798R.string.search_instrument_position_secondary_text, cryptoHoldingResult.getCurrency().getCode(), Formats.getLowPrecisionUnitFormat().format(cryptoHoldingResult.getQuantity()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsRowView.bind$default(rdsRowView, name, string2, null, null, null, 28, null);
        rdsRowView.setMainTextEnabled(rdsRowView.isEnabled());
    }

    public static final void bindRurSavingsRow(RdsRowView rdsRowView, SearchItem.RurSavingsChoice item) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        rdsRowView.setPogText(((Object) item.getInterestRate()) + "%");
        RdsRowView.bind$default(rdsRowView, item.getPrimaryText(), item.getSecondaryText(), null, null, null, 28, null);
    }

    public static /* synthetic */ void bindInstrumentResult$default(RdsRowView rdsRowView, SearchItem.InstrumentResult instrumentResult, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        bindInstrumentResult(rdsRowView, instrumentResult, drawable);
    }

    public static final void bindInstrumentResult(RdsRowView rdsRowView, SearchItem.InstrumentResult instrumentResult, Drawable drawable) {
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(instrumentResult, "instrumentResult");
        bindInstrumentAndPosition(rdsRowView, instrumentResult.getInstrument(), null, instrumentResult.isEnabled(), drawable);
    }

    private static final void bindInstrumentAndPosition(RdsRowView rdsRowView, Instrument instrument, Position position, boolean z, Drawable drawable) {
        String symbol;
        String simpleName = instrument.getSimpleName();
        if (simpleName == null) {
            simpleName = instrument.getName();
        }
        String str = simpleName;
        if (position != null && Position5.getHasPosition(position)) {
            symbol = rdsRowView.getContext().getString(C11798R.string.search_instrument_position_secondary_text, instrument.getSymbol(), Formats.getLowPrecisionUnitFormat().format(Position5.getPositionDisplayQuantity(position)));
        } else {
            symbol = instrument.getSymbol();
        }
        String str2 = symbol;
        Intrinsics.checkNotNull(str2);
        RdsRowView.bind$default(rdsRowView, str, str2, null, null, null, 28, null);
        if (drawable != null) {
            rdsRowView.setTrailingIconDrawable(drawable);
        }
        rdsRowView.setMainTextEnabled(z);
    }
}
