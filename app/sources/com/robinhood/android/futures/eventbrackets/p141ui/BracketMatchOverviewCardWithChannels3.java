package com.robinhood.android.futures.eventbrackets.p141ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BracketMatchOverviewCardWithChannels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;", "", "<init>", "(Ljava/lang/String;I)V", "DOWN", "UP", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.ChannelDirection, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketMatchOverviewCardWithChannels3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BracketMatchOverviewCardWithChannels3[] $VALUES;
    public static final BracketMatchOverviewCardWithChannels3 DOWN = new BracketMatchOverviewCardWithChannels3("DOWN", 0);

    /* renamed from: UP */
    public static final BracketMatchOverviewCardWithChannels3 f4154UP = new BracketMatchOverviewCardWithChannels3("UP", 1);

    private static final /* synthetic */ BracketMatchOverviewCardWithChannels3[] $values() {
        return new BracketMatchOverviewCardWithChannels3[]{DOWN, f4154UP};
    }

    public static EnumEntries<BracketMatchOverviewCardWithChannels3> getEntries() {
        return $ENTRIES;
    }

    private BracketMatchOverviewCardWithChannels3(String str, int i) {
    }

    static {
        BracketMatchOverviewCardWithChannels3[] bracketMatchOverviewCardWithChannels3Arr$values = $values();
        $VALUES = bracketMatchOverviewCardWithChannels3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bracketMatchOverviewCardWithChannels3Arr$values);
    }

    public static BracketMatchOverviewCardWithChannels3 valueOf(String str) {
        return (BracketMatchOverviewCardWithChannels3) Enum.valueOf(BracketMatchOverviewCardWithChannels3.class, str);
    }

    public static BracketMatchOverviewCardWithChannels3[] values() {
        return (BracketMatchOverviewCardWithChannels3[]) $VALUES.clone();
    }
}
