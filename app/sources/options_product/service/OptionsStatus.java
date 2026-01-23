package options_product.service;

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
/* compiled from: OptionsStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, m3636d2 = {"Loptions_product/service/OptionsStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OPTIONS_STATUS_UNSPECIFIED", "LEVEL_0", "LEVEL_2", "LEVEL_3", "ACTION_NEEDED", "PENDING", "L2_ACTION_NEEDED", "L2_PENDING", "JA_L0_INCOMPLETE", "JA_L0_PENDING_COOWNER", "JA_L0_PENDING_COOWNER_MR", "JA_L0_PENDING", "JA_L0_MR_REQUIRED", "JA_L0_MR_SCHEDULED", "JA_L2_PENDING_COOWNER", "JA_L2_PENDING_COOWNER_MR", "JA_L2_PENDING", "JA_L2_MR_REQUIRED", "JA_L2_MR_SCHEDULED", "NOT_AVAILABLE", "JA_L0", "CUSTODIAL_UNAVAILABLE", "PENDING_APPOINTMENT_SCHEDULED", "L2_PENDING_APPOINTMENT_SCHEDULED", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OptionsStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsStatus[] $VALUES;
    public static final OptionsStatus ACTION_NEEDED;

    @JvmField
    public static final ProtoAdapter<OptionsStatus> ADAPTER;
    public static final OptionsStatus CUSTODIAL_UNAVAILABLE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionsStatus JA_L0;
    public static final OptionsStatus JA_L0_INCOMPLETE;
    public static final OptionsStatus JA_L0_MR_REQUIRED;
    public static final OptionsStatus JA_L0_MR_SCHEDULED;
    public static final OptionsStatus JA_L0_PENDING;
    public static final OptionsStatus JA_L0_PENDING_COOWNER;
    public static final OptionsStatus JA_L0_PENDING_COOWNER_MR;
    public static final OptionsStatus JA_L2_MR_REQUIRED;
    public static final OptionsStatus JA_L2_MR_SCHEDULED;
    public static final OptionsStatus JA_L2_PENDING;
    public static final OptionsStatus JA_L2_PENDING_COOWNER;
    public static final OptionsStatus JA_L2_PENDING_COOWNER_MR;
    public static final OptionsStatus L2_ACTION_NEEDED;
    public static final OptionsStatus L2_PENDING;
    public static final OptionsStatus L2_PENDING_APPOINTMENT_SCHEDULED;
    public static final OptionsStatus LEVEL_0;
    public static final OptionsStatus LEVEL_2;
    public static final OptionsStatus LEVEL_3;
    public static final OptionsStatus NOT_AVAILABLE;
    public static final OptionsStatus OPTIONS_STATUS_UNSPECIFIED;
    public static final OptionsStatus PENDING;
    public static final OptionsStatus PENDING_APPOINTMENT_SCHEDULED;
    private final int value;

    private static final /* synthetic */ OptionsStatus[] $values() {
        return new OptionsStatus[]{OPTIONS_STATUS_UNSPECIFIED, LEVEL_0, LEVEL_2, LEVEL_3, ACTION_NEEDED, PENDING, L2_ACTION_NEEDED, L2_PENDING, JA_L0_INCOMPLETE, JA_L0_PENDING_COOWNER, JA_L0_PENDING_COOWNER_MR, JA_L0_PENDING, JA_L0_MR_REQUIRED, JA_L0_MR_SCHEDULED, JA_L2_PENDING_COOWNER, JA_L2_PENDING_COOWNER_MR, JA_L2_PENDING, JA_L2_MR_REQUIRED, JA_L2_MR_SCHEDULED, NOT_AVAILABLE, JA_L0, CUSTODIAL_UNAVAILABLE, PENDING_APPOINTMENT_SCHEDULED, L2_PENDING_APPOINTMENT_SCHEDULED};
    }

    @JvmStatic
    public static final OptionsStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OptionsStatus> getEntries() {
        return $ENTRIES;
    }

    private OptionsStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OptionsStatus optionsStatus = new OptionsStatus("OPTIONS_STATUS_UNSPECIFIED", 0, 0);
        OPTIONS_STATUS_UNSPECIFIED = optionsStatus;
        LEVEL_0 = new OptionsStatus("LEVEL_0", 1, 1);
        LEVEL_2 = new OptionsStatus("LEVEL_2", 2, 2);
        LEVEL_3 = new OptionsStatus("LEVEL_3", 3, 3);
        ACTION_NEEDED = new OptionsStatus("ACTION_NEEDED", 4, 4);
        PENDING = new OptionsStatus("PENDING", 5, 5);
        L2_ACTION_NEEDED = new OptionsStatus("L2_ACTION_NEEDED", 6, 6);
        L2_PENDING = new OptionsStatus("L2_PENDING", 7, 7);
        JA_L0_INCOMPLETE = new OptionsStatus("JA_L0_INCOMPLETE", 8, 8);
        JA_L0_PENDING_COOWNER = new OptionsStatus("JA_L0_PENDING_COOWNER", 9, 9);
        JA_L0_PENDING_COOWNER_MR = new OptionsStatus("JA_L0_PENDING_COOWNER_MR", 10, 10);
        JA_L0_PENDING = new OptionsStatus("JA_L0_PENDING", 11, 11);
        JA_L0_MR_REQUIRED = new OptionsStatus("JA_L0_MR_REQUIRED", 12, 12);
        JA_L0_MR_SCHEDULED = new OptionsStatus("JA_L0_MR_SCHEDULED", 13, 13);
        JA_L2_PENDING_COOWNER = new OptionsStatus("JA_L2_PENDING_COOWNER", 14, 14);
        JA_L2_PENDING_COOWNER_MR = new OptionsStatus("JA_L2_PENDING_COOWNER_MR", 15, 15);
        JA_L2_PENDING = new OptionsStatus("JA_L2_PENDING", 16, 16);
        JA_L2_MR_REQUIRED = new OptionsStatus("JA_L2_MR_REQUIRED", 17, 17);
        JA_L2_MR_SCHEDULED = new OptionsStatus("JA_L2_MR_SCHEDULED", 18, 18);
        NOT_AVAILABLE = new OptionsStatus("NOT_AVAILABLE", 19, 19);
        JA_L0 = new OptionsStatus("JA_L0", 20, 20);
        CUSTODIAL_UNAVAILABLE = new OptionsStatus("CUSTODIAL_UNAVAILABLE", 21, 21);
        PENDING_APPOINTMENT_SCHEDULED = new OptionsStatus("PENDING_APPOINTMENT_SCHEDULED", 22, 22);
        L2_PENDING_APPOINTMENT_SCHEDULED = new OptionsStatus("L2_PENDING_APPOINTMENT_SCHEDULED", 23, 23);
        OptionsStatus[] optionsStatusArr$values = $values();
        $VALUES = optionsStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionsStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OptionsStatus>(orCreateKotlinClass, syntax, optionsStatus) { // from class: options_product.service.OptionsStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OptionsStatus fromValue(int value) {
                return OptionsStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OptionsStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/OptionsStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/OptionsStatus;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
                case 1:
                    return OptionsStatus.LEVEL_0;
                case 2:
                    return OptionsStatus.LEVEL_2;
                case 3:
                    return OptionsStatus.LEVEL_3;
                case 4:
                    return OptionsStatus.ACTION_NEEDED;
                case 5:
                    return OptionsStatus.PENDING;
                case 6:
                    return OptionsStatus.L2_ACTION_NEEDED;
                case 7:
                    return OptionsStatus.L2_PENDING;
                case 8:
                    return OptionsStatus.JA_L0_INCOMPLETE;
                case 9:
                    return OptionsStatus.JA_L0_PENDING_COOWNER;
                case 10:
                    return OptionsStatus.JA_L0_PENDING_COOWNER_MR;
                case 11:
                    return OptionsStatus.JA_L0_PENDING;
                case 12:
                    return OptionsStatus.JA_L0_MR_REQUIRED;
                case 13:
                    return OptionsStatus.JA_L0_MR_SCHEDULED;
                case 14:
                    return OptionsStatus.JA_L2_PENDING_COOWNER;
                case 15:
                    return OptionsStatus.JA_L2_PENDING_COOWNER_MR;
                case 16:
                    return OptionsStatus.JA_L2_PENDING;
                case 17:
                    return OptionsStatus.JA_L2_MR_REQUIRED;
                case 18:
                    return OptionsStatus.JA_L2_MR_SCHEDULED;
                case 19:
                    return OptionsStatus.NOT_AVAILABLE;
                case 20:
                    return OptionsStatus.JA_L0;
                case 21:
                    return OptionsStatus.CUSTODIAL_UNAVAILABLE;
                case 22:
                    return OptionsStatus.PENDING_APPOINTMENT_SCHEDULED;
                case 23:
                    return OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED;
                default:
                    return null;
            }
        }
    }

    public static OptionsStatus valueOf(String str) {
        return (OptionsStatus) Enum.valueOf(OptionsStatus.class, str);
    }

    public static OptionsStatus[] values() {
        return (OptionsStatus[]) $VALUES.clone();
    }
}
