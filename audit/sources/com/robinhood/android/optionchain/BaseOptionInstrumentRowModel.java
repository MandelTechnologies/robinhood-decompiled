package com.robinhood.android.optionchain;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.p320db.OptionQuote;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseOptionInstrumentRowModel.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 #2\u00020\u0001:\u0001#J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "isDisabled", "", "()Z", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "getOptionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "priceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPriceFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "tradableFromBottomSheet", "getTradableFromBottomSheet", "displayPrice", "Ljava/math/BigDecimal;", "getDisplayPrice", "()Ljava/math/BigDecimal;", "getErrorMessageTxt", "", "resources", "Landroid/content/res/Resources;", "isStale", "()Ljava/lang/Boolean;", "contractPriceDisplayString", "getContractPriceDisplayString", "contractPriceDeltaPercentageString", "getContractPriceDeltaPercentageString", "contentsSame", "other", "Companion", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface BaseOptionInstrumentRowModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean contentsSame(BaseOptionInstrumentRowModel other);

    String getContractPriceDeltaPercentageString();

    String getContractPriceDisplayString();

    BigDecimal getDisplayPrice();

    CharSequence getErrorMessageTxt(Resources resources);

    String getIdentifier();

    OptionQuote getOptionQuote();

    NumberFormatter getPriceFormatter();

    boolean getTradableFromBottomSheet();

    /* renamed from: isDisabled */
    boolean getIsDisabled();

    Boolean isStale();

    /* compiled from: BaseOptionInstrumentRowModel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Boolean isStale(BaseOptionInstrumentRowModel baseOptionInstrumentRowModel) {
            OptionQuote optionQuote = baseOptionInstrumentRowModel.getOptionQuote();
            if (optionQuote != null) {
                return Boolean.valueOf(optionQuote.isStaleForUi());
            }
            return null;
        }

        public static String getContractPriceDisplayString(BaseOptionInstrumentRowModel baseOptionInstrumentRowModel) {
            BigDecimal displayPrice = baseOptionInstrumentRowModel.getDisplayPrice();
            if (displayPrice != null) {
                return baseOptionInstrumentRowModel.getPriceFormatter().format(displayPrice);
            }
            return null;
        }

        public static String getContractPriceDeltaPercentageString(BaseOptionInstrumentRowModel baseOptionInstrumentRowModel) {
            BigDecimal todaysPercentChange;
            OptionQuote optionQuote = baseOptionInstrumentRowModel.getOptionQuote();
            if (optionQuote == null || (todaysPercentChange = optionQuote.getTodaysPercentChange()) == null) {
                return null;
            }
            return Formats.getPercentDeltaFormat().format(todaysPercentChange);
        }

        public static boolean contentsSame(BaseOptionInstrumentRowModel baseOptionInstrumentRowModel, BaseOptionInstrumentRowModel baseOptionInstrumentRowModel2) {
            return baseOptionInstrumentRowModel2 != null && Intrinsics.areEqual(baseOptionInstrumentRowModel.getIdentifier(), baseOptionInstrumentRowModel2.getIdentifier()) && baseOptionInstrumentRowModel.getIsDisabled() == baseOptionInstrumentRowModel2.getIsDisabled() && BaseOptionInstrumentRowModel.INSTANCE.equals(baseOptionInstrumentRowModel.getDisplayPrice(), baseOptionInstrumentRowModel2.getDisplayPrice()) && baseOptionInstrumentRowModel.getTradableFromBottomSheet() == baseOptionInstrumentRowModel2.getTradableFromBottomSheet() && Intrinsics.areEqual(baseOptionInstrumentRowModel.isStale(), baseOptionInstrumentRowModel2.isStale());
        }
    }

    /* compiled from: BaseOptionInstrumentRowModel.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel$Companion;", "", "<init>", "()V", "equals", "", "first", "Ljava/math/BigDecimal;", "second", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean equals(BigDecimal first, BigDecimal second) {
            return first == null ? second == null : second != null && first.compareTo(second) == 0;
        }
    }
}
