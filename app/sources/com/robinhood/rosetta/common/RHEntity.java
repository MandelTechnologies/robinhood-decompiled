package com.robinhood.rosetta.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RHEntity.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RHEntity;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTITY_TYPE_UNSPECIFIED", "RHY", "RHS", "RHCE", "RCT", "RHD", "RHY_BANKING", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RHEntity implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RHEntity[] $VALUES;

    @JvmField
    public static final ProtoAdapter<RHEntity> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RHEntity ENTITY_TYPE_UNSPECIFIED;
    public static final RHEntity RCT;
    public static final RHEntity RHCE;
    public static final RHEntity RHD;
    public static final RHEntity RHS;
    public static final RHEntity RHY;
    public static final RHEntity RHY_BANKING;
    private final int value;

    private static final /* synthetic */ RHEntity[] $values() {
        return new RHEntity[]{ENTITY_TYPE_UNSPECIFIED, RHY, RHS, RHCE, RCT, RHD, RHY_BANKING};
    }

    @JvmStatic
    public static final RHEntity fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<RHEntity> getEntries() {
        return $ENTRIES;
    }

    private RHEntity(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final RHEntity rHEntity = new RHEntity("ENTITY_TYPE_UNSPECIFIED", 0, 0);
        ENTITY_TYPE_UNSPECIFIED = rHEntity;
        RHY = new RHEntity("RHY", 1, 1);
        RHS = new RHEntity("RHS", 2, 2);
        RHCE = new RHEntity("RHCE", 3, 3);
        RCT = new RHEntity("RCT", 4, 4);
        RHD = new RHEntity("RHD", 5, 5);
        RHY_BANKING = new RHEntity("RHY_BANKING", 6, 6);
        RHEntity[] rHEntityArr$values = $values();
        $VALUES = rHEntityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rHEntityArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RHEntity.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<RHEntity>(orCreateKotlinClass, syntax, rHEntity) { // from class: com.robinhood.rosetta.common.RHEntity$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public RHEntity fromValue(int value) {
                return RHEntity.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: RHEntity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RHEntity$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/common/RHEntity;", "fromValue", "value", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RHEntity fromValue(int value) {
            switch (value) {
                case 0:
                    return RHEntity.ENTITY_TYPE_UNSPECIFIED;
                case 1:
                    return RHEntity.RHY;
                case 2:
                    return RHEntity.RHS;
                case 3:
                    return RHEntity.RHCE;
                case 4:
                    return RHEntity.RCT;
                case 5:
                    return RHEntity.RHD;
                case 6:
                    return RHEntity.RHY_BANKING;
                default:
                    return null;
            }
        }
    }

    public static RHEntity valueOf(String str) {
        return (RHEntity) Enum.valueOf(RHEntity.class, str);
    }

    public static RHEntity[] values() {
        return (RHEntity[]) $VALUES.clone();
    }
}
