package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RHEntity.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/transfers/api/RHEntity;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "RCT", "RHCE", "RHS", "RHY", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RHEntity implements RhEnum<RHEntity> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RHEntity[] $VALUES;
    private final String serverValue;
    public static final RHEntity UNKNOWN = new RHEntity("UNKNOWN", 0, "unknown");
    public static final RHEntity RCT = new RHEntity("RCT", 1, "rct");
    public static final RHEntity RHCE = new RHEntity("RHCE", 2, "rhce");
    public static final RHEntity RHS = new RHEntity("RHS", 3, "rhs");
    public static final RHEntity RHY = new RHEntity("RHY", 4, "rhy");

    private static final /* synthetic */ RHEntity[] $values() {
        return new RHEntity[]{UNKNOWN, RCT, RHCE, RHS, RHY};
    }

    public static EnumEntries<RHEntity> getEntries() {
        return $ENTRIES;
    }

    private RHEntity(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RHEntity[] rHEntityArr$values = $values();
        $VALUES = rHEntityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rHEntityArr$values);
        INSTANCE = new Companion(null);
    }

    public static RHEntity valueOf(String str) {
        return (RHEntity) Enum.valueOf(RHEntity.class, str);
    }

    public static RHEntity[] values() {
        return (RHEntity[]) $VALUES.clone();
    }
}
