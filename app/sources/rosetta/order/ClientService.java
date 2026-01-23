package rosetta.order;

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
/* compiled from: ClientService.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/ClientService;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_SERVICE_UNSPECIFIED", "CLIENT_SERVICE_MAINST", "CLIENT_SERVICE_CARAVAN", "CLIENT_SERVICE_NUMMUS", "CLIENT_SERVICE_SICKLE", "CLIENT_SERVICE_FRAC_MAINST", "CLIENT_SERVICE_BROKEBACK", "CLIENT_SERVICE_BONFIRE", "CLIENT_SERVICE_LOAD_TEST", "CLIENT_SERVICE_STONKSGIVING", "CLIENT_SERVICE_ORDER_BATCHER", "CLIENT_SERVICE_OEMS", "CLIENT_SERVICE_CERES", "CLIENT_SERVICE_CRYPTO_TOKENIZATION", "CLIENT_SERVICE_CRYPTO_PERPETUALS", "CLIENT_SERVICE_CASHIER", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ClientService implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientService[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientService> ADAPTER;
    public static final ClientService CLIENT_SERVICE_BONFIRE;
    public static final ClientService CLIENT_SERVICE_BROKEBACK;
    public static final ClientService CLIENT_SERVICE_CARAVAN;
    public static final ClientService CLIENT_SERVICE_CASHIER;
    public static final ClientService CLIENT_SERVICE_CERES;
    public static final ClientService CLIENT_SERVICE_CRYPTO_PERPETUALS;
    public static final ClientService CLIENT_SERVICE_CRYPTO_TOKENIZATION;
    public static final ClientService CLIENT_SERVICE_FRAC_MAINST;
    public static final ClientService CLIENT_SERVICE_LOAD_TEST;
    public static final ClientService CLIENT_SERVICE_MAINST;
    public static final ClientService CLIENT_SERVICE_NUMMUS;
    public static final ClientService CLIENT_SERVICE_OEMS;
    public static final ClientService CLIENT_SERVICE_ORDER_BATCHER;
    public static final ClientService CLIENT_SERVICE_SICKLE;
    public static final ClientService CLIENT_SERVICE_STONKSGIVING;
    public static final ClientService CLIENT_SERVICE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ClientService[] $values() {
        return new ClientService[]{CLIENT_SERVICE_UNSPECIFIED, CLIENT_SERVICE_MAINST, CLIENT_SERVICE_CARAVAN, CLIENT_SERVICE_NUMMUS, CLIENT_SERVICE_SICKLE, CLIENT_SERVICE_FRAC_MAINST, CLIENT_SERVICE_BROKEBACK, CLIENT_SERVICE_BONFIRE, CLIENT_SERVICE_LOAD_TEST, CLIENT_SERVICE_STONKSGIVING, CLIENT_SERVICE_ORDER_BATCHER, CLIENT_SERVICE_OEMS, CLIENT_SERVICE_CERES, CLIENT_SERVICE_CRYPTO_TOKENIZATION, CLIENT_SERVICE_CRYPTO_PERPETUALS, CLIENT_SERVICE_CASHIER};
    }

    @JvmStatic
    public static final ClientService fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientService> getEntries() {
        return $ENTRIES;
    }

    private ClientService(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientService clientService = new ClientService("CLIENT_SERVICE_UNSPECIFIED", 0, 0);
        CLIENT_SERVICE_UNSPECIFIED = clientService;
        CLIENT_SERVICE_MAINST = new ClientService("CLIENT_SERVICE_MAINST", 1, 1);
        CLIENT_SERVICE_CARAVAN = new ClientService("CLIENT_SERVICE_CARAVAN", 2, 2);
        CLIENT_SERVICE_NUMMUS = new ClientService("CLIENT_SERVICE_NUMMUS", 3, 3);
        CLIENT_SERVICE_SICKLE = new ClientService("CLIENT_SERVICE_SICKLE", 4, 4);
        CLIENT_SERVICE_FRAC_MAINST = new ClientService("CLIENT_SERVICE_FRAC_MAINST", 5, 5);
        CLIENT_SERVICE_BROKEBACK = new ClientService("CLIENT_SERVICE_BROKEBACK", 6, 6);
        CLIENT_SERVICE_BONFIRE = new ClientService("CLIENT_SERVICE_BONFIRE", 7, 7);
        CLIENT_SERVICE_LOAD_TEST = new ClientService("CLIENT_SERVICE_LOAD_TEST", 8, 8);
        CLIENT_SERVICE_STONKSGIVING = new ClientService("CLIENT_SERVICE_STONKSGIVING", 9, 9);
        CLIENT_SERVICE_ORDER_BATCHER = new ClientService("CLIENT_SERVICE_ORDER_BATCHER", 10, 10);
        CLIENT_SERVICE_OEMS = new ClientService("CLIENT_SERVICE_OEMS", 11, 11);
        CLIENT_SERVICE_CERES = new ClientService("CLIENT_SERVICE_CERES", 12, 12);
        CLIENT_SERVICE_CRYPTO_TOKENIZATION = new ClientService("CLIENT_SERVICE_CRYPTO_TOKENIZATION", 13, 13);
        CLIENT_SERVICE_CRYPTO_PERPETUALS = new ClientService("CLIENT_SERVICE_CRYPTO_PERPETUALS", 14, 14);
        CLIENT_SERVICE_CASHIER = new ClientService("CLIENT_SERVICE_CASHIER", 15, 15);
        ClientService[] clientServiceArr$values = $values();
        $VALUES = clientServiceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientServiceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientService.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientService>(orCreateKotlinClass, syntax, clientService) { // from class: rosetta.order.ClientService$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientService fromValue(int value) {
                return ClientService.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientService.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/ClientService$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/ClientService;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientService fromValue(int value) {
            switch (value) {
                case 0:
                    return ClientService.CLIENT_SERVICE_UNSPECIFIED;
                case 1:
                    return ClientService.CLIENT_SERVICE_MAINST;
                case 2:
                    return ClientService.CLIENT_SERVICE_CARAVAN;
                case 3:
                    return ClientService.CLIENT_SERVICE_NUMMUS;
                case 4:
                    return ClientService.CLIENT_SERVICE_SICKLE;
                case 5:
                    return ClientService.CLIENT_SERVICE_FRAC_MAINST;
                case 6:
                    return ClientService.CLIENT_SERVICE_BROKEBACK;
                case 7:
                    return ClientService.CLIENT_SERVICE_BONFIRE;
                case 8:
                    return ClientService.CLIENT_SERVICE_LOAD_TEST;
                case 9:
                    return ClientService.CLIENT_SERVICE_STONKSGIVING;
                case 10:
                    return ClientService.CLIENT_SERVICE_ORDER_BATCHER;
                case 11:
                    return ClientService.CLIENT_SERVICE_OEMS;
                case 12:
                    return ClientService.CLIENT_SERVICE_CERES;
                case 13:
                    return ClientService.CLIENT_SERVICE_CRYPTO_TOKENIZATION;
                case 14:
                    return ClientService.CLIENT_SERVICE_CRYPTO_PERPETUALS;
                case 15:
                    return ClientService.CLIENT_SERVICE_CASHIER;
                default:
                    return null;
            }
        }
    }

    public static ClientService valueOf(String str) {
        return (ClientService) Enum.valueOf(ClientService.class, str);
    }

    public static ClientService[] values() {
        return (ClientService[]) $VALUES.clone();
    }
}
