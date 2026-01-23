package com.robinhood.libtradingtrends.contracts;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final class TableColumnAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TableColumnAlignment[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TableColumnAlignment LEFT = new TableColumnAlignment("LEFT", 0);
    public static final TableColumnAlignment CENTER = new TableColumnAlignment("CENTER", 1);
    public static final TableColumnAlignment RIGHT = new TableColumnAlignment("RIGHT", 2);

    private static final /* synthetic */ TableColumnAlignment[] $values() {
        return new TableColumnAlignment[]{LEFT, CENTER, RIGHT};
    }

    public static EnumEntries<TableColumnAlignment> getEntries() {
        return $ENTRIES;
    }

    public static TableColumnAlignment valueOf(String str) {
        return (TableColumnAlignment) Enum.valueOf(TableColumnAlignment.class, str);
    }

    public static TableColumnAlignment[] values() {
        return (TableColumnAlignment[]) $VALUES.clone();
    }

    /* compiled from: TradingTrendsTable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TableColumnAlignment.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TableColumnAlignment> serializer() {
            return get$cachedSerializer();
        }
    }

    private TableColumnAlignment(String str, int i) {
    }

    static {
        TableColumnAlignment[] tableColumnAlignmentArr$values = $values();
        $VALUES = tableColumnAlignmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tableColumnAlignmentArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.libtradingtrends.contracts.TableColumnAlignment.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createSimpleEnumSerializer("com.robinhood.libtradingtrends.contracts.TableColumnAlignment", TableColumnAlignment.values());
            }
        });
    }
}
