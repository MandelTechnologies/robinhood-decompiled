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
/* compiled from: MigrationEligibilityStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED", "MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE", "MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION", "MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING", "MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED", "MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED", "MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE", "MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED", "MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationEligibilityStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MigrationEligibilityStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MigrationEligibilityStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
    public static final MigrationEligibilityStatus MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED;
    private final int value;

    private static final /* synthetic */ MigrationEligibilityStatus[] $values() {
        return new MigrationEligibilityStatus[]{MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED, MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE, MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION, MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING, MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED, MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED, MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE, MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED, MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR};
    }

    @JvmStatic
    public static final MigrationEligibilityStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MigrationEligibilityStatus> getEntries() {
        return $ENTRIES;
    }

    private MigrationEligibilityStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MigrationEligibilityStatus migrationEligibilityStatus = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED", 0, 0);
        MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED = migrationEligibilityStatus;
        MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE", 1, 1);
        MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION", 2, 2);
        MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING", 3, 3);
        MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED", 4, 4);
        MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED", 5, 5);
        MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE", 6, 6);
        MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED", 7, 7);
        MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR = new MigrationEligibilityStatus("MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR", 8, 8);
        MigrationEligibilityStatus[] migrationEligibilityStatusArr$values = $values();
        $VALUES = migrationEligibilityStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(migrationEligibilityStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationEligibilityStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MigrationEligibilityStatus>(orCreateKotlinClass, syntax, migrationEligibilityStatus) { // from class: crypto_portkey.service.v1.MigrationEligibilityStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MigrationEligibilityStatus fromValue(int value) {
                return MigrationEligibilityStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MigrationEligibilityStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationEligibilityStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "fromValue", "value", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MigrationEligibilityStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
                case 1:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE;
                case 2:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PENDING_VERIFICATION;
                case 3:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_ALREADY_MIGRATING;
                case 4:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_MIGRATION_COMPLETED;
                case 5:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_VERIFICATION_FAILED;
                case 6:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_NOT_ELIGIBLE;
                case 7:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_PARTNER_NOT_SUPPORTED;
                case 8:
                    return MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_INTERNAL_ERROR;
                default:
                    return null;
            }
        }
    }

    public static MigrationEligibilityStatus valueOf(String str) {
        return (MigrationEligibilityStatus) Enum.valueOf(MigrationEligibilityStatus.class, str);
    }

    public static MigrationEligibilityStatus[] values() {
        return (MigrationEligibilityStatus[]) $VALUES.clone();
    }
}
