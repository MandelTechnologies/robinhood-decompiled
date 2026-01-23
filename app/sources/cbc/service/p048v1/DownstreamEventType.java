package cbc.service.p048v1;

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
/* compiled from: DownstreamEventType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcbc/service/v1/DownstreamEventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DOWNSTREAM_EVENT_TYPE_UNSPECIFIED", "DOWNSTREAM_EVENT_TYPE_EQUITY", "DOWNSTREAM_EVENT_TYPE_OPTION", "DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION", "DOWNSTREAM_EVENT_TYPE_CRYPTO", "DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER", "DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DownstreamEventType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DownstreamEventType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DownstreamEventType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_CRYPTO;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_EQUITY;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_OPTION;
    public static final DownstreamEventType DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ DownstreamEventType[] $values() {
        return new DownstreamEventType[]{DOWNSTREAM_EVENT_TYPE_UNSPECIFIED, DOWNSTREAM_EVENT_TYPE_EQUITY, DOWNSTREAM_EVENT_TYPE_OPTION, DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION, DOWNSTREAM_EVENT_TYPE_CRYPTO, DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER, DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER};
    }

    @JvmStatic
    public static final DownstreamEventType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DownstreamEventType> getEntries() {
        return $ENTRIES;
    }

    private DownstreamEventType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DownstreamEventType downstreamEventType = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_UNSPECIFIED", 0, 0);
        DOWNSTREAM_EVENT_TYPE_UNSPECIFIED = downstreamEventType;
        DOWNSTREAM_EVENT_TYPE_EQUITY = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_EQUITY", 1, 1);
        DOWNSTREAM_EVENT_TYPE_OPTION = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_OPTION", 2, 2);
        DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION", 3, 3);
        DOWNSTREAM_EVENT_TYPE_CRYPTO = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_CRYPTO", 4, 4);
        DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER", 5, 5);
        DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER = new DownstreamEventType("DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER", 6, 6);
        DownstreamEventType[] downstreamEventTypeArr$values = $values();
        $VALUES = downstreamEventTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(downstreamEventTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DownstreamEventType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DownstreamEventType>(orCreateKotlinClass, syntax, downstreamEventType) { // from class: cbc.service.v1.DownstreamEventType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DownstreamEventType fromValue(int value) {
                return DownstreamEventType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DownstreamEventType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcbc/service/v1/DownstreamEventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcbc/service/v1/DownstreamEventType;", "fromValue", "value", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DownstreamEventType fromValue(int value) {
            switch (value) {
                case 0:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
                case 1:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY;
                case 2:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_OPTION;
                case 3:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION;
                case 4:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO;
                case 5:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER;
                case 6:
                    return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER;
                default:
                    return null;
            }
        }
    }

    public static DownstreamEventType valueOf(String str) {
        return (DownstreamEventType) Enum.valueOf(DownstreamEventType.class, str);
    }

    public static DownstreamEventType[] values() {
        return (DownstreamEventType[]) $VALUES.clone();
    }
}
