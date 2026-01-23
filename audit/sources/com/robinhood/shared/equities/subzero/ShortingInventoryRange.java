package com.robinhood.shared.equities.subzero;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortingInventoryRange.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "NONE", "LESS_THAN_50", "FIFTY_TO_250", "TWO_FIFTY_TO_500", "FIVE_HUNDRED_TO_1_MILLION", "GREATER_THAN_1_MILLION", "Companion", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ShortingInventoryRange implements RhEnum<ShortingInventoryRange> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShortingInventoryRange[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final ShortingInventoryRange NONE = new ShortingInventoryRange("NONE", 0, ApiRenderablePlatforms.VERSIONS_NONE);
    public static final ShortingInventoryRange LESS_THAN_50 = new ShortingInventoryRange("LESS_THAN_50", 1, "<50k");
    public static final ShortingInventoryRange FIFTY_TO_250 = new ShortingInventoryRange("FIFTY_TO_250", 2, "50k to 250k");
    public static final ShortingInventoryRange TWO_FIFTY_TO_500 = new ShortingInventoryRange("TWO_FIFTY_TO_500", 3, "250k to 500k");
    public static final ShortingInventoryRange FIVE_HUNDRED_TO_1_MILLION = new ShortingInventoryRange("FIVE_HUNDRED_TO_1_MILLION", 4, "500k to 1M");
    public static final ShortingInventoryRange GREATER_THAN_1_MILLION = new ShortingInventoryRange("GREATER_THAN_1_MILLION", 5, ">1M");

    private static final /* synthetic */ ShortingInventoryRange[] $values() {
        return new ShortingInventoryRange[]{NONE, LESS_THAN_50, FIFTY_TO_250, TWO_FIFTY_TO_500, FIVE_HUNDRED_TO_1_MILLION, GREATER_THAN_1_MILLION};
    }

    @JvmStatic
    public static ShortingInventoryRange fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ShortingInventoryRange> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ShortingInventoryRange shortingInventoryRange) {
        return INSTANCE.toServerValue(shortingInventoryRange);
    }

    private ShortingInventoryRange(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ShortingInventoryRange[] shortingInventoryRangeArr$values = $values();
        $VALUES = shortingInventoryRangeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(shortingInventoryRangeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ShortingInventoryRange.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Optional<ShortingInventoryRange> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ShortingInventoryRange.values(), false, 2, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ShortingInventoryRange enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Optional, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ShortingInventoryRange fromServerValue(String serverValue) {
            return (ShortingInventoryRange) super.fromServerValue(serverValue);
        }
    }

    public static ShortingInventoryRange valueOf(String str) {
        return (ShortingInventoryRange) Enum.valueOf(ShortingInventoryRange.class, str);
    }

    public static ShortingInventoryRange[] values() {
        return (ShortingInventoryRange[]) $VALUES.clone();
    }
}
