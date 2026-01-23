package com.robinhood.crypto.perpetuals.formatter;

import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPerpetualOrderDetailsFormatter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/formatter/UiPerpetualOrderDetailsFormatter;", "", "uiOrderDetails", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "<init>", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;)V", "getDateTimeSubmittedText", "", "getDateSubmittedText", "getDateTimeUpdatedText", "lib-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class UiPerpetualOrderDetailsFormatter {
    public static final int $stable = 8;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final UiPerpetualOrderDetails uiOrderDetails;

    public UiPerpetualOrderDetailsFormatter(UiPerpetualOrderDetails uiOrderDetails, LocalizedDateTimeFormatter localizedDateTimeFormatter) {
        Intrinsics.checkNotNullParameter(uiOrderDetails, "uiOrderDetails");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.uiOrderDetails = uiOrderDetails;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    public final CharSequence getDateTimeSubmittedText() {
        return this.localizedDateTimeFormatter.format(this.uiOrderDetails.getOrderDetails().getCreatedAt(), new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }

    public final CharSequence getDateSubmittedText() {
        return this.localizedDateTimeFormatter.format(this.uiOrderDetails.getOrderDetails().getCreatedAt(), LocalizedDateTimeFormatter.Format.MediumDate.INSTANCE);
    }

    public final CharSequence getDateTimeUpdatedText() {
        return this.localizedDateTimeFormatter.format(this.uiOrderDetails.getOrderDetails().getLastTransactionAt(), new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }
}
