package com.robinhood.android.common.p088ui;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhButtonType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhButtonType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "PRIMARY", "SECONDARY", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhButtonType implements RhEnum<RhButtonType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhButtonType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final RhButtonType UNKNOWN = new RhButtonType("UNKNOWN", 0, "UNKNOWN");
    public static final RhButtonType PRIMARY = new RhButtonType("PRIMARY", 1, "PRIMARY");
    public static final RhButtonType SECONDARY = new RhButtonType("SECONDARY", 2, "SECONDARY");

    private static final /* synthetic */ RhButtonType[] $values() {
        return new RhButtonType[]{UNKNOWN, PRIMARY, SECONDARY};
    }

    @JvmStatic
    public static RhButtonType fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<RhButtonType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(RhButtonType rhButtonType) {
        return INSTANCE.toServerValue(rhButtonType);
    }

    private RhButtonType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RhButtonType[] rhButtonTypeArr$values = $values();
        $VALUES = rhButtonTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhButtonTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: RhButtonType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhButtonType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/common/ui/RhButtonType;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<RhButtonType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(RhButtonType.values(), RhButtonType.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(RhButtonType enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public RhButtonType fromServerValue(String serverValue) {
            return (RhButtonType) super.fromServerValue(serverValue);
        }
    }

    public static RhButtonType valueOf(String str) {
        return (RhButtonType) Enum.valueOf(RhButtonType.class, str);
    }

    public static RhButtonType[] values() {
        return (RhButtonType[]) $VALUES.clone();
    }
}
