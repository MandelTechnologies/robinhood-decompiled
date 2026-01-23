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
/* compiled from: ClientDeployType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDeployType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_DEPLOY_TYPE", "STANDARD", "HOTFIX", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientDeployType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientDeployType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientDeployType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ClientDeployType DEFAULT_DEPLOY_TYPE;
    public static final ClientDeployType HOTFIX;
    public static final ClientDeployType STANDARD;
    private final int value;

    private static final /* synthetic */ ClientDeployType[] $values() {
        return new ClientDeployType[]{DEFAULT_DEPLOY_TYPE, STANDARD, HOTFIX};
    }

    @JvmStatic
    public static final ClientDeployType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientDeployType> getEntries() {
        return $ENTRIES;
    }

    private ClientDeployType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientDeployType clientDeployType = new ClientDeployType("DEFAULT_DEPLOY_TYPE", 0, 0);
        DEFAULT_DEPLOY_TYPE = clientDeployType;
        STANDARD = new ClientDeployType("STANDARD", 1, 1);
        HOTFIX = new ClientDeployType("HOTFIX", 2, 2);
        ClientDeployType[] clientDeployTypeArr$values = $values();
        $VALUES = clientDeployTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientDeployTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientDeployType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientDeployType>(orCreateKotlinClass, syntax, clientDeployType) { // from class: com.robinhood.rosetta.eventlogging.ClientDeployType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientDeployType fromValue(int value) {
                return ClientDeployType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientDeployType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDeployType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientDeployType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientDeployType fromValue(int value) {
            if (value == 0) {
                return ClientDeployType.DEFAULT_DEPLOY_TYPE;
            }
            if (value == 1) {
                return ClientDeployType.STANDARD;
            }
            if (value != 2) {
                return null;
            }
            return ClientDeployType.HOTFIX;
        }
    }

    public static ClientDeployType valueOf(String str) {
        return (ClientDeployType) Enum.valueOf(ClientDeployType.class, str);
    }

    public static ClientDeployType[] values() {
        return (ClientDeployType[]) $VALUES.clone();
    }
}
