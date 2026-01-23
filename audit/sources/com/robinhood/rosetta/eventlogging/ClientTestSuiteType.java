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
/* compiled from: ClientTestSuiteType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_TEST_TYPE", "UNIT", "INTEGRATION", "INTEGRATION_REPLAY", "INTEGRATION_RECORD", "INTEGRATION_RECORD_TESTRAIL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientTestSuiteType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientTestSuiteType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientTestSuiteType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ClientTestSuiteType DEFAULT_TEST_TYPE;
    public static final ClientTestSuiteType INTEGRATION;
    public static final ClientTestSuiteType INTEGRATION_RECORD;
    public static final ClientTestSuiteType INTEGRATION_RECORD_TESTRAIL;
    public static final ClientTestSuiteType INTEGRATION_REPLAY;
    public static final ClientTestSuiteType UNIT;
    private final int value;

    private static final /* synthetic */ ClientTestSuiteType[] $values() {
        return new ClientTestSuiteType[]{DEFAULT_TEST_TYPE, UNIT, INTEGRATION, INTEGRATION_REPLAY, INTEGRATION_RECORD, INTEGRATION_RECORD_TESTRAIL};
    }

    @JvmStatic
    public static final ClientTestSuiteType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientTestSuiteType> getEntries() {
        return $ENTRIES;
    }

    private ClientTestSuiteType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientTestSuiteType clientTestSuiteType = new ClientTestSuiteType("DEFAULT_TEST_TYPE", 0, 0);
        DEFAULT_TEST_TYPE = clientTestSuiteType;
        UNIT = new ClientTestSuiteType("UNIT", 1, 1);
        INTEGRATION = new ClientTestSuiteType("INTEGRATION", 2, 2);
        INTEGRATION_REPLAY = new ClientTestSuiteType("INTEGRATION_REPLAY", 3, 3);
        INTEGRATION_RECORD = new ClientTestSuiteType("INTEGRATION_RECORD", 4, 4);
        INTEGRATION_RECORD_TESTRAIL = new ClientTestSuiteType("INTEGRATION_RECORD_TESTRAIL", 5, 5);
        ClientTestSuiteType[] clientTestSuiteTypeArr$values = $values();
        $VALUES = clientTestSuiteTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientTestSuiteTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientTestSuiteType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientTestSuiteType>(orCreateKotlinClass, syntax, clientTestSuiteType) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientTestSuiteType fromValue(int value) {
                return ClientTestSuiteType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientTestSuiteType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientTestSuiteType fromValue(int value) {
            if (value == 0) {
                return ClientTestSuiteType.DEFAULT_TEST_TYPE;
            }
            if (value == 1) {
                return ClientTestSuiteType.UNIT;
            }
            if (value == 2) {
                return ClientTestSuiteType.INTEGRATION;
            }
            if (value == 3) {
                return ClientTestSuiteType.INTEGRATION_REPLAY;
            }
            if (value == 4) {
                return ClientTestSuiteType.INTEGRATION_RECORD;
            }
            if (value != 5) {
                return null;
            }
            return ClientTestSuiteType.INTEGRATION_RECORD_TESTRAIL;
        }
    }

    public static ClientTestSuiteType valueOf(String str) {
        return (ClientTestSuiteType) Enum.valueOf(ClientTestSuiteType.class, str);
    }

    public static ClientTestSuiteType[] values() {
        return (ClientTestSuiteType[]) $VALUES.clone();
    }
}
