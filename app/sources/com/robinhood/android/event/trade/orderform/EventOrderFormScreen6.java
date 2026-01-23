package com.robinhood.android.event.trade.orderform;

import com.robinhood.android.event.trade.C16465R;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventOrderFormScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;", "", "text", "", "type", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "<init>", "(Ljava/lang/String;IILcom/robinhood/compose/bento/component/BentoButtons$Type;)V", "getText", "()I", "getType", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "REVIEW", "CLOSE_ALL", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.orderform.OrderFormContinueButtonStyle, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormScreen6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventOrderFormScreen6[] $VALUES;
    private final int text;
    private final BentoButtons.Type type;
    public static final EventOrderFormScreen6 REVIEW = new EventOrderFormScreen6("REVIEW", 0, C16465R.string.events_order_form_review_button_label, BentoButtons.Type.Primary);
    public static final EventOrderFormScreen6 CLOSE_ALL = new EventOrderFormScreen6("CLOSE_ALL", 1, C16465R.string.events_order_form_close_all_button_label, BentoButtons.Type.Secondary);

    private static final /* synthetic */ EventOrderFormScreen6[] $values() {
        return new EventOrderFormScreen6[]{REVIEW, CLOSE_ALL};
    }

    public static EnumEntries<EventOrderFormScreen6> getEntries() {
        return $ENTRIES;
    }

    private EventOrderFormScreen6(String str, int i, int i2, BentoButtons.Type type2) {
        this.text = i2;
        this.type = type2;
    }

    public final int getText() {
        return this.text;
    }

    public final BentoButtons.Type getType() {
        return this.type;
    }

    static {
        EventOrderFormScreen6[] eventOrderFormScreen6Arr$values = $values();
        $VALUES = eventOrderFormScreen6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventOrderFormScreen6Arr$values);
    }

    public static EventOrderFormScreen6 valueOf(String str) {
        return (EventOrderFormScreen6) Enum.valueOf(EventOrderFormScreen6.class, str);
    }

    public static EventOrderFormScreen6[] values() {
        return (EventOrderFormScreen6[]) $VALUES.clone();
    }
}
