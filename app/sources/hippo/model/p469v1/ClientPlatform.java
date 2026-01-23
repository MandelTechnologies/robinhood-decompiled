package hippo.model.p469v1;

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
/* compiled from: ClientPlatform.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lhippo/model/v1/ClientPlatform;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_PLATFORM_UNSPECIFIED", "IOS", "ANDROID", "WEB", "BLACK_WIDOW", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientPlatform implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientPlatform[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientPlatform> ADAPTER;
    public static final ClientPlatform ANDROID;
    public static final ClientPlatform BLACK_WIDOW;
    public static final ClientPlatform CLIENT_PLATFORM_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ClientPlatform IOS;
    public static final ClientPlatform WEB;
    private final int value;

    private static final /* synthetic */ ClientPlatform[] $values() {
        return new ClientPlatform[]{CLIENT_PLATFORM_UNSPECIFIED, IOS, ANDROID, WEB, BLACK_WIDOW};
    }

    @JvmStatic
    public static final ClientPlatform fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientPlatform> getEntries() {
        return $ENTRIES;
    }

    private ClientPlatform(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientPlatform clientPlatform = new ClientPlatform("CLIENT_PLATFORM_UNSPECIFIED", 0, 0);
        CLIENT_PLATFORM_UNSPECIFIED = clientPlatform;
        IOS = new ClientPlatform("IOS", 1, 1);
        ANDROID = new ClientPlatform("ANDROID", 2, 2);
        WEB = new ClientPlatform("WEB", 3, 3);
        BLACK_WIDOW = new ClientPlatform("BLACK_WIDOW", 4, 4);
        ClientPlatform[] clientPlatformArr$values = $values();
        $VALUES = clientPlatformArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientPlatformArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientPlatform.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientPlatform>(orCreateKotlinClass, syntax, clientPlatform) { // from class: hippo.model.v1.ClientPlatform$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientPlatform fromValue(int value) {
                return ClientPlatform.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientPlatform.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/ClientPlatform$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/ClientPlatform;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientPlatform fromValue(int value) {
            if (value == 0) {
                return ClientPlatform.CLIENT_PLATFORM_UNSPECIFIED;
            }
            if (value == 1) {
                return ClientPlatform.IOS;
            }
            if (value == 2) {
                return ClientPlatform.ANDROID;
            }
            if (value == 3) {
                return ClientPlatform.WEB;
            }
            if (value != 4) {
                return null;
            }
            return ClientPlatform.BLACK_WIDOW;
        }
    }

    public static ClientPlatform valueOf(String str) {
        return (ClientPlatform) Enum.valueOf(ClientPlatform.class, str);
    }

    public static ClientPlatform[] values() {
        return (ClientPlatform[]) $VALUES.clone();
    }
}
