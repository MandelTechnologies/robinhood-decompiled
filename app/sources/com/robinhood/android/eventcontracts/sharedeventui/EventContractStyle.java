package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData2;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcImageStyle;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractStyles.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/EventContractStyle;", "", "dayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "imageStyle", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "<init>", "(Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;)V", "orderForm", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/EventContractBackgroundData;", "getOrderForm", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/EventContractBackgroundData;", Constants.REVENUE_RECEIPT_KEY, "getReceipt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventContractStyle {
    public static final int $stable = 0;
    private final DayNightColor dayNightColor;
    private final EcImageStyle imageStyle;

    /* renamed from: component1, reason: from getter */
    private final DayNightColor getDayNightColor() {
        return this.dayNightColor;
    }

    /* renamed from: component2, reason: from getter */
    private final EcImageStyle getImageStyle() {
        return this.imageStyle;
    }

    public static /* synthetic */ EventContractStyle copy$default(EventContractStyle eventContractStyle, DayNightColor dayNightColor, EcImageStyle ecImageStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            dayNightColor = eventContractStyle.dayNightColor;
        }
        if ((i & 2) != 0) {
            ecImageStyle = eventContractStyle.imageStyle;
        }
        return eventContractStyle.copy(dayNightColor, ecImageStyle);
    }

    public final EventContractStyle copy(DayNightColor dayNightColor, EcImageStyle imageStyle) {
        Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        return new EventContractStyle(dayNightColor, imageStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContractStyle)) {
            return false;
        }
        EventContractStyle eventContractStyle = (EventContractStyle) other;
        return Intrinsics.areEqual(this.dayNightColor, eventContractStyle.dayNightColor) && this.imageStyle == eventContractStyle.imageStyle;
    }

    public int hashCode() {
        return (this.dayNightColor.hashCode() * 31) + this.imageStyle.hashCode();
    }

    public String toString() {
        return "EventContractStyle(dayNightColor=" + this.dayNightColor + ", imageStyle=" + this.imageStyle + ")";
    }

    public EventContractStyle(DayNightColor dayNightColor, EcImageStyle imageStyle) {
        Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        this.dayNightColor = dayNightColor;
        this.imageStyle = imageStyle;
    }

    @JvmName
    public final WaveBackgroundData2 getOrderForm(Composer composer, int i) {
        composer.startReplaceGroup(-1403333142);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1403333142, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle.<get-orderForm> (EventContractStyles.kt:25)");
        }
        WaveBackgroundData2 waveBackgroundData2ForOrderForm = EventContractStyles2.forOrderForm(this.imageStyle, this.dayNightColor, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return waveBackgroundData2ForOrderForm;
    }

    @JvmName
    public final WaveBackgroundData2 getReceipt(Composer composer, int i) {
        composer.startReplaceGroup(-1843263434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1843263434, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle.<get-receipt> (EventContractStyles.kt:30)");
        }
        WaveBackgroundData2 waveBackgroundData2ForReceiptPreview = EventContractStyles2.forReceiptPreview(this.imageStyle, this.dayNightColor, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return waveBackgroundData2ForReceiptPreview;
    }
}
