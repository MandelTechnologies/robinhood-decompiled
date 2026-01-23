package crypto_portkey.service.p443v1;

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
/* compiled from: MigrationAuthedErrorCode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED", "MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND", "MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE", "MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR", "MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR", "MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR", "MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA", "MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST", "MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR", "MIGRATION_AUTHED_ERROR_CODE_RETRYABLE", "MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE", "MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationAuthedErrorCode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MigrationAuthedErrorCode[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MigrationAuthedErrorCode> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_RETRYABLE;
    public static final MigrationAuthedErrorCode MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ MigrationAuthedErrorCode[] $values() {
        return new MigrationAuthedErrorCode[]{MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED, MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND, MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE, MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR, MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR, MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR, MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA, MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST, MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR, MIGRATION_AUTHED_ERROR_CODE_RETRYABLE, MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE, MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT};
    }

    @JvmStatic
    public static final MigrationAuthedErrorCode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MigrationAuthedErrorCode> getEntries() {
        return $ENTRIES;
    }

    private MigrationAuthedErrorCode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MigrationAuthedErrorCode migrationAuthedErrorCode = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED", 0, 0);
        MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED = migrationAuthedErrorCode;
        MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND", 1, 1);
        MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE", 2, 2);
        MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR", 3, 3);
        MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR", 4, 4);
        MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR", 5, 5);
        MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA", 6, 6);
        MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST", 7, 7);
        MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR", 8, 8);
        MIGRATION_AUTHED_ERROR_CODE_RETRYABLE = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_RETRYABLE", 9, 9);
        MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE", 10, 10);
        MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT = new MigrationAuthedErrorCode("MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT", 11, 11);
        MigrationAuthedErrorCode[] migrationAuthedErrorCodeArr$values = $values();
        $VALUES = migrationAuthedErrorCodeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(migrationAuthedErrorCodeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationAuthedErrorCode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MigrationAuthedErrorCode>(orCreateKotlinClass, syntax, migrationAuthedErrorCode) { // from class: crypto_portkey.service.v1.MigrationAuthedErrorCode$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MigrationAuthedErrorCode fromValue(int value) {
                return MigrationAuthedErrorCode.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MigrationAuthedErrorCode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationAuthedErrorCode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "fromValue", "value", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MigrationAuthedErrorCode fromValue(int value) {
            switch (value) {
                case 0:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_UNSPECIFIED;
                case 1:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MIGRATION_NOT_FOUND;
                case 2:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_MIGRATION_STATE;
                case 3:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_PARTNER_API_ERROR;
                case 4:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NUMMUS_ERROR;
                case 5:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_FSM_ERROR;
                case 6:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_MISSING_DATA;
                case 7:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INVALID_REQUEST;
                case 8:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_INTERNAL_ERROR;
                case 9:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE;
                case 10:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE;
                case 11:
                    return MigrationAuthedErrorCode.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT;
                default:
                    return null;
            }
        }
    }

    public static MigrationAuthedErrorCode valueOf(String str) {
        return (MigrationAuthedErrorCode) Enum.valueOf(MigrationAuthedErrorCode.class, str);
    }

    public static MigrationAuthedErrorCode[] values() {
        return (MigrationAuthedErrorCode[]) $VALUES.clone();
    }
}
