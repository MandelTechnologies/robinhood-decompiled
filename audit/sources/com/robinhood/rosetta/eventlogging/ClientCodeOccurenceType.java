package com.robinhood.rosetta.eventlogging;

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
/* compiled from: ClientCodeOccurenceType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_TYPE", "DEPRECATED", "PREFERRED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientCodeOccurenceType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientCodeOccurenceType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientCodeOccurenceType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ClientCodeOccurenceType DEFAULT_TYPE;
    public static final ClientCodeOccurenceType DEPRECATED;
    public static final ClientCodeOccurenceType PREFERRED;
    private final int value;

    private static final /* synthetic */ ClientCodeOccurenceType[] $values() {
        return new ClientCodeOccurenceType[]{DEFAULT_TYPE, DEPRECATED, PREFERRED};
    }

    @JvmStatic
    public static final ClientCodeOccurenceType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientCodeOccurenceType> getEntries() {
        return $ENTRIES;
    }

    private ClientCodeOccurenceType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientCodeOccurenceType clientCodeOccurenceType = new ClientCodeOccurenceType("DEFAULT_TYPE", 0, 0);
        DEFAULT_TYPE = clientCodeOccurenceType;
        DEPRECATED = new ClientCodeOccurenceType("DEPRECATED", 1, 1);
        PREFERRED = new ClientCodeOccurenceType("PREFERRED", 2, 2);
        ClientCodeOccurenceType[] clientCodeOccurenceTypeArr$values = $values();
        $VALUES = clientCodeOccurenceTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientCodeOccurenceTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientCodeOccurenceType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientCodeOccurenceType>(orCreateKotlinClass, syntax, clientCodeOccurenceType) { // from class: com.robinhood.rosetta.eventlogging.ClientCodeOccurenceType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientCodeOccurenceType fromValue(int value) {
                return ClientCodeOccurenceType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientCodeOccurenceType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientCodeOccurenceType fromValue(int value) {
            if (value == 0) {
                return ClientCodeOccurenceType.DEFAULT_TYPE;
            }
            if (value == 1) {
                return ClientCodeOccurenceType.DEPRECATED;
            }
            if (value != 2) {
                return null;
            }
            return ClientCodeOccurenceType.PREFERRED;
        }
    }

    public static ClientCodeOccurenceType valueOf(String str) {
        return (ClientCodeOccurenceType) Enum.valueOf(ClientCodeOccurenceType.class, str);
    }

    public static ClientCodeOccurenceType[] values() {
        return (ClientCodeOccurenceType[]) $VALUES.clone();
    }
}
