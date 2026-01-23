package com.robinhood.android.investmentstracker;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import kotlin.Metadata;

/* compiled from: Configurations.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"InvestmentTrackerPercentFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getInvestmentTrackerPercentFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.ConfigurationsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Configurations {
    private static final NumberFormatter InvestmentTrackerPercentFormat = Formats.getHundredthPercentFormat();

    public static final NumberFormatter getInvestmentTrackerPercentFormat() {
        return InvestmentTrackerPercentFormat;
    }
}
