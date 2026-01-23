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
/* compiled from: ClientApp.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApp;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_APP_UNDEFINED", "CLIENT_APP_TRADER", "CLIENT_APP_GATEWAY", "CLIENT_APP_RHC", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientApp implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientApp[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientApp> ADAPTER;
    public static final ClientApp CLIENT_APP_GATEWAY;
    public static final ClientApp CLIENT_APP_RHC;
    public static final ClientApp CLIENT_APP_TRADER;
    public static final ClientApp CLIENT_APP_UNDEFINED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ClientApp[] $values() {
        return new ClientApp[]{CLIENT_APP_UNDEFINED, CLIENT_APP_TRADER, CLIENT_APP_GATEWAY, CLIENT_APP_RHC};
    }

    @JvmStatic
    public static final ClientApp fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientApp> getEntries() {
        return $ENTRIES;
    }

    private ClientApp(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientApp clientApp = new ClientApp("CLIENT_APP_UNDEFINED", 0, 0);
        CLIENT_APP_UNDEFINED = clientApp;
        CLIENT_APP_TRADER = new ClientApp("CLIENT_APP_TRADER", 1, 1);
        CLIENT_APP_GATEWAY = new ClientApp("CLIENT_APP_GATEWAY", 2, 2);
        CLIENT_APP_RHC = new ClientApp("CLIENT_APP_RHC", 3, 3);
        ClientApp[] clientAppArr$values = $values();
        $VALUES = clientAppArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientAppArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientApp.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientApp>(orCreateKotlinClass, syntax, clientApp) { // from class: com.robinhood.rosetta.eventlogging.ClientApp$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientApp fromValue(int value) {
                return ClientApp.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientApp.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApp$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientApp;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientApp fromValue(int value) {
            if (value == 0) {
                return ClientApp.CLIENT_APP_UNDEFINED;
            }
            if (value == 1) {
                return ClientApp.CLIENT_APP_TRADER;
            }
            if (value == 2) {
                return ClientApp.CLIENT_APP_GATEWAY;
            }
            if (value != 3) {
                return null;
            }
            return ClientApp.CLIENT_APP_RHC;
        }
    }

    public static ClientApp valueOf(String str) {
        return (ClientApp) Enum.valueOf(ClientApp.class, str);
    }

    public static ClientApp[] values() {
        return (ClientApp[]) $VALUES.clone();
    }
}
