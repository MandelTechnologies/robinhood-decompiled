package com.robinhood.crypto.perpetuals.formatter;

import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualMarginEdit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPerpetualMarginEditFormatter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/formatter/UiPerpetualMarginEditFormatter;", "", "uiPerpetualMarginEdit", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "<init>", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;)V", "getDateSubmittedText", "", "getDateTimeSubmittedText", "getDateTimeUpdatedText", "lib-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class UiPerpetualMarginEditFormatter {
    public static final int $stable = 8;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final UiPerpetualMarginEdit uiPerpetualMarginEdit;

    public UiPerpetualMarginEditFormatter(UiPerpetualMarginEdit uiPerpetualMarginEdit, LocalizedDateTimeFormatter localizedDateTimeFormatter) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "uiPerpetualMarginEdit");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.uiPerpetualMarginEdit = uiPerpetualMarginEdit;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    public final CharSequence getDateSubmittedText() {
        return this.localizedDateTimeFormatter.format(this.uiPerpetualMarginEdit.getMarginEdit().getCreatedAt(), LocalizedDateTimeFormatter.Format.MediumDate.INSTANCE);
    }

    public final CharSequence getDateTimeSubmittedText() {
        return this.localizedDateTimeFormatter.format(this.uiPerpetualMarginEdit.getMarginEdit().getCreatedAt(), new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }

    public final CharSequence getDateTimeUpdatedText() {
        return this.localizedDateTimeFormatter.format(this.uiPerpetualMarginEdit.getMarginEdit().getUpdatedAt(), new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }
}
