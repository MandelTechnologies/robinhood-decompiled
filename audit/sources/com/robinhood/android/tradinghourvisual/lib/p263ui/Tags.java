package com.robinhood.android.tradinghourvisual.lib.p263ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SetTradingHoursComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/tradinghourvisual/lib/ui/Tags;", "", "string", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "PEG", "LEFT_EDGE_BAR", "RIGHT_EDGE_BAR", "lib-trade-hour-visualizer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class Tags {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Tags[] $VALUES;
    private final String string;
    public static final Tags PEG = new Tags("PEG", 0, "PEG");
    public static final Tags LEFT_EDGE_BAR = new Tags("LEFT_EDGE_BAR", 1, "LEFT_EDGE_BAR");
    public static final Tags RIGHT_EDGE_BAR = new Tags("RIGHT_EDGE_BAR", 2, "RIGHT_EDGE_BAR");

    private static final /* synthetic */ Tags[] $values() {
        return new Tags[]{PEG, LEFT_EDGE_BAR, RIGHT_EDGE_BAR};
    }

    public static EnumEntries<Tags> getEntries() {
        return $ENTRIES;
    }

    private Tags(String str, int i, String str2) {
        this.string = str2;
    }

    public final String getString() {
        return this.string;
    }

    static {
        Tags[] tagsArr$values = $values();
        $VALUES = tagsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tagsArr$values);
    }

    public static Tags valueOf(String str) {
        return (Tags) Enum.valueOf(Tags.class, str);
    }

    public static Tags[] values() {
        return (Tags[]) $VALUES.clone();
    }
}
