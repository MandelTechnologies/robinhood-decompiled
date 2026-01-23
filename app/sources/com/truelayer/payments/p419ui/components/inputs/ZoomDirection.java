package com.truelayer.payments.p419ui.components.inputs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextInputWithImage.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/inputs/ZoomDirection;", "", "(Ljava/lang/String;I)V", "In", "Out", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class ZoomDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ZoomDirection[] $VALUES;

    /* renamed from: In */
    public static final ZoomDirection f6472In = new ZoomDirection("In", 0);
    public static final ZoomDirection Out = new ZoomDirection("Out", 1);

    private static final /* synthetic */ ZoomDirection[] $values() {
        return new ZoomDirection[]{f6472In, Out};
    }

    public static EnumEntries<ZoomDirection> getEntries() {
        return $ENTRIES;
    }

    public static ZoomDirection valueOf(String str) {
        return (ZoomDirection) Enum.valueOf(ZoomDirection.class, str);
    }

    public static ZoomDirection[] values() {
        return (ZoomDirection[]) $VALUES.clone();
    }

    private ZoomDirection(String str, int i) {
    }

    static {
        ZoomDirection[] zoomDirectionArr$values = $values();
        $VALUES = zoomDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(zoomDirectionArr$values);
    }
}
