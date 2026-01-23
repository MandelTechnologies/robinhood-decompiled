package com.robinhood.android.crypto.lib;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.common.strings.OrderTimeInForces;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.CryptoOrderExecution;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.android.C41827R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: UiCryptoOrdersFormatter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/lib/UiCryptoOrdersFormatter;", "", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;)V", "getSubmittedTextWithTime", "", "getTimeInForceText", "resources", "Landroid/content/res/Resources;", "getFilledDateText", "getCanceledDateText", "feature-lib-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UiCryptoOrdersFormatter {
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final UiCryptoOrder uiCryptoOrder;

    /* compiled from: UiCryptoOrdersFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderTimeInForce.IOC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderTimeInForce.OPG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderType.values().length];
            try {
                iArr2[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public UiCryptoOrdersFormatter(UiCryptoOrder uiCryptoOrder, LocalizedDateTimeFormatter localizedDateTimeFormatter) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.uiCryptoOrder = uiCryptoOrder;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    public final CharSequence getSubmittedTextWithTime() {
        return this.localizedDateTimeFormatter.format(this.uiCryptoOrder.getCryptoOrder().getCreatedAt(), new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }

    public final CharSequence getTimeInForceText(Resources resources) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$0[this.uiCryptoOrder.getCryptoOrder().getTimeInForce().ordinal()]) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 7;
                break;
            case 3:
                i = 30;
                break;
            case 4:
                i = 90;
                break;
            case 5:
                throw new IllegalStateException("FOK time in force not supported");
            case 6:
                throw new IllegalStateException("IOC time in force not supported");
            case 7:
                throw new IllegalStateException("OPG time in force not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.uiCryptoOrder.getCryptoOrder().getType().ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            if (this.uiCryptoOrder.getCryptoOrder().getTimeInForce() == OrderTimeInForce.GTC) {
                LocalizedDateTimeFormatter localizedDateTimeFormatter = this.localizedDateTimeFormatter;
                Instant instantPlus = this.uiCryptoOrder.getCryptoOrder().getCreatedAt().plus((TemporalAmount) Days.m3991of(this.uiCryptoOrder.getCurrencyPair().isTokenizedStock() ? 30 : 90));
                Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                return localizedDateTimeFormatter.format(instantPlus, new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
            }
            return OrderTimeInForces.getTimeInForceString(this.uiCryptoOrder.getCryptoOrder().getTimeInForce(), resources);
        }
        if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        LocalizedDateTimeFormatter localizedDateTimeFormatter2 = this.localizedDateTimeFormatter;
        Instant instantPlus2 = this.uiCryptoOrder.getCryptoOrder().getCreatedAt().plus((TemporalAmount) Days.m3991of(i));
        Intrinsics.checkNotNullExpressionValue(instantPlus2, "plus(...)");
        return localizedDateTimeFormatter2.format(instantPlus2, new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }

    public final CharSequence getFilledDateText(Resources resources) throws Resources.NotFoundException {
        Object next;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Iterator<T> it = this.uiCryptoOrder.getExecutions().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Instant timestamp = ((CryptoOrderExecution) next).getTimestamp();
                do {
                    Object next2 = it.next();
                    Instant timestamp2 = ((CryptoOrderExecution) next2).getTimestamp();
                    if (timestamp.compareTo(timestamp2) < 0) {
                        next = next2;
                        timestamp = timestamp2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Instant timestamp3 = next != null ? ((CryptoOrderExecution) next).getTimestamp() : null;
        if (timestamp3 != null) {
            return this.localizedDateTimeFormatter.format(timestamp3, new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
        }
        String string2 = resources.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getCanceledDateText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Instant canceledAt = this.uiCryptoOrder.getCryptoOrder().getCanceledAt();
        if (canceledAt == null) {
            String string2 = resources.getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        return this.localizedDateTimeFormatter.format(canceledAt, new LocalizedDateTimeFormatter.Format.Medium.Default(LocalizedDateTimeFormatter.Separator.f4263AT));
    }
}
