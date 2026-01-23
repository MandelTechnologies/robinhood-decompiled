package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: SduiPollableScreenerItemsViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"percentChangeFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPercentChangeFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "percentChangeFormatter$delegate", "Lkotlin/Lazy;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModelKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPollableScreenerItemsViewModel3 {
    private static final Lazy percentChangeFormatter$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SduiPollableScreenerItemsViewModel3.percentChangeFormatter_delegate$lambda$1();
        }
    });

    public static final NumberFormatter getPercentChangeFormatter() {
        return (NumberFormatter) percentChangeFormatter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberFormatter percentChangeFormatter_delegate$lambda$1() {
        NumberFormatter noSignPercentFormat = Formats.getNoSignPercentFormat();
        noSignPercentFormat.setMinimumFractionDigits(2);
        noSignPercentFormat.setMaximumFractionalDigits(2);
        return noSignPercentFormat;
    }
}
