package com.robinhood.android.mcduckling.card.help.p179ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardReplacementType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "", "<init>", "(Ljava/lang/String;I)V", "LOST", "STOLEN", "STOLEN_VIRTUAL", "DAMAGED", "VIRTUAL_TO_PHYSICAL", "UNAUTHORIZED_TRANSACTION", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardReplacementType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardReplacementType[] $VALUES;
    public static final CardReplacementType LOST = new CardReplacementType("LOST", 0);
    public static final CardReplacementType STOLEN = new CardReplacementType("STOLEN", 1);
    public static final CardReplacementType STOLEN_VIRTUAL = new CardReplacementType("STOLEN_VIRTUAL", 2);
    public static final CardReplacementType DAMAGED = new CardReplacementType("DAMAGED", 3);
    public static final CardReplacementType VIRTUAL_TO_PHYSICAL = new CardReplacementType("VIRTUAL_TO_PHYSICAL", 4);
    public static final CardReplacementType UNAUTHORIZED_TRANSACTION = new CardReplacementType("UNAUTHORIZED_TRANSACTION", 5);

    private static final /* synthetic */ CardReplacementType[] $values() {
        return new CardReplacementType[]{LOST, STOLEN, STOLEN_VIRTUAL, DAMAGED, VIRTUAL_TO_PHYSICAL, UNAUTHORIZED_TRANSACTION};
    }

    public static EnumEntries<CardReplacementType> getEntries() {
        return $ENTRIES;
    }

    private CardReplacementType(String str, int i) {
    }

    static {
        CardReplacementType[] cardReplacementTypeArr$values = $values();
        $VALUES = cardReplacementTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cardReplacementTypeArr$values);
    }

    public static CardReplacementType valueOf(String str) {
        return (CardReplacementType) Enum.valueOf(CardReplacementType.class, str);
    }

    public static CardReplacementType[] values() {
        return (CardReplacementType[]) $VALUES.clone();
    }
}
