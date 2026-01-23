package com.robinhood.arsenal.proto.p281v1.idl;

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
/* compiled from: RHDProductGroup.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RHD_PRODUCT_GROUP_UNSPECIFIED", "RHD_PRODUCT_GROUP_STOCK_INDEX", "RHD_PRODUCT_GROUP_ENERGY", "RHD_PRODUCT_GROUP_CURRENCY", "RHD_PRODUCT_GROUP_METALS", "RHD_PRODUCT_GROUP_CRYPTO", "RHD_PRODUCT_GROUP_AGRICULTURE", "RHD_PRODUCT_GROUP_INTEREST_RATES", "RHD_PRODUCT_GROUP_EVENT_CONTRACTS", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RHDProductGroup implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RHDProductGroup[] $VALUES;

    @JvmField
    public static final ProtoAdapter<RHDProductGroup> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_AGRICULTURE;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_CRYPTO;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_CURRENCY;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_ENERGY;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_EVENT_CONTRACTS;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_INTEREST_RATES;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_METALS;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_STOCK_INDEX;
    public static final RHDProductGroup RHD_PRODUCT_GROUP_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ RHDProductGroup[] $values() {
        return new RHDProductGroup[]{RHD_PRODUCT_GROUP_UNSPECIFIED, RHD_PRODUCT_GROUP_STOCK_INDEX, RHD_PRODUCT_GROUP_ENERGY, RHD_PRODUCT_GROUP_CURRENCY, RHD_PRODUCT_GROUP_METALS, RHD_PRODUCT_GROUP_CRYPTO, RHD_PRODUCT_GROUP_AGRICULTURE, RHD_PRODUCT_GROUP_INTEREST_RATES, RHD_PRODUCT_GROUP_EVENT_CONTRACTS};
    }

    @JvmStatic
    public static final RHDProductGroup fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<RHDProductGroup> getEntries() {
        return $ENTRIES;
    }

    private RHDProductGroup(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final RHDProductGroup rHDProductGroup = new RHDProductGroup("RHD_PRODUCT_GROUP_UNSPECIFIED", 0, 0);
        RHD_PRODUCT_GROUP_UNSPECIFIED = rHDProductGroup;
        RHD_PRODUCT_GROUP_STOCK_INDEX = new RHDProductGroup("RHD_PRODUCT_GROUP_STOCK_INDEX", 1, 1);
        RHD_PRODUCT_GROUP_ENERGY = new RHDProductGroup("RHD_PRODUCT_GROUP_ENERGY", 2, 2);
        RHD_PRODUCT_GROUP_CURRENCY = new RHDProductGroup("RHD_PRODUCT_GROUP_CURRENCY", 3, 3);
        RHD_PRODUCT_GROUP_METALS = new RHDProductGroup("RHD_PRODUCT_GROUP_METALS", 4, 4);
        RHD_PRODUCT_GROUP_CRYPTO = new RHDProductGroup("RHD_PRODUCT_GROUP_CRYPTO", 5, 5);
        RHD_PRODUCT_GROUP_AGRICULTURE = new RHDProductGroup("RHD_PRODUCT_GROUP_AGRICULTURE", 6, 6);
        RHD_PRODUCT_GROUP_INTEREST_RATES = new RHDProductGroup("RHD_PRODUCT_GROUP_INTEREST_RATES", 7, 7);
        RHD_PRODUCT_GROUP_EVENT_CONTRACTS = new RHDProductGroup("RHD_PRODUCT_GROUP_EVENT_CONTRACTS", 8, 8);
        RHDProductGroup[] rHDProductGroupArr$values = $values();
        $VALUES = rHDProductGroupArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rHDProductGroupArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RHDProductGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<RHDProductGroup>(orCreateKotlinClass, syntax, rHDProductGroup) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroup$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public RHDProductGroup fromValue(int value) {
                return RHDProductGroup.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: RHDProductGroup.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "fromValue", "value", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RHDProductGroup fromValue(int value) {
            switch (value) {
                case 0:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED;
                case 1:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_STOCK_INDEX;
                case 2:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_ENERGY;
                case 3:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_CURRENCY;
                case 4:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_METALS;
                case 5:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_CRYPTO;
                case 6:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_AGRICULTURE;
                case 7:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_INTEREST_RATES;
                case 8:
                    return RHDProductGroup.RHD_PRODUCT_GROUP_EVENT_CONTRACTS;
                default:
                    return null;
            }
        }
    }

    public static RHDProductGroup valueOf(String str) {
        return (RHDProductGroup) Enum.valueOf(RHDProductGroup.class, str);
    }

    public static RHDProductGroup[] values() {
        return (RHDProductGroup[]) $VALUES.clone();
    }
}
