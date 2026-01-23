package bonfire.proto.idl.accounts.p028v1;

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
/* compiled from: IneligibilityReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INELIGIBILITY_REASON_UNSPECIFIED", "NO_INDIVIDUAL_BROKERAGE_ACCOUNT", "DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT", "BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW", "REJECTED_BROKERAGE_ACCOUNT_APPLICATION", "ACCOUNT_RESTRICTED", "APP_UPGRADE_REQUIRED", "UNKNOWN_ERROR", "Companion", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IneligibilityReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IneligibilityReason[] $VALUES;
    public static final IneligibilityReason ACCOUNT_RESTRICTED;

    @JvmField
    public static final ProtoAdapter<IneligibilityReason> ADAPTER;
    public static final IneligibilityReason APP_UPGRADE_REQUIRED;
    public static final IneligibilityReason BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IneligibilityReason DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT;
    public static final IneligibilityReason INELIGIBILITY_REASON_UNSPECIFIED;
    public static final IneligibilityReason NO_INDIVIDUAL_BROKERAGE_ACCOUNT;
    public static final IneligibilityReason REJECTED_BROKERAGE_ACCOUNT_APPLICATION;
    public static final IneligibilityReason UNKNOWN_ERROR;
    private final int value;

    private static final /* synthetic */ IneligibilityReason[] $values() {
        return new IneligibilityReason[]{INELIGIBILITY_REASON_UNSPECIFIED, NO_INDIVIDUAL_BROKERAGE_ACCOUNT, DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT, BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW, REJECTED_BROKERAGE_ACCOUNT_APPLICATION, ACCOUNT_RESTRICTED, APP_UPGRADE_REQUIRED, UNKNOWN_ERROR};
    }

    @JvmStatic
    public static final IneligibilityReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IneligibilityReason> getEntries() {
        return $ENTRIES;
    }

    private IneligibilityReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IneligibilityReason ineligibilityReason = new IneligibilityReason("INELIGIBILITY_REASON_UNSPECIFIED", 0, 0);
        INELIGIBILITY_REASON_UNSPECIFIED = ineligibilityReason;
        NO_INDIVIDUAL_BROKERAGE_ACCOUNT = new IneligibilityReason("NO_INDIVIDUAL_BROKERAGE_ACCOUNT", 1, 1);
        DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT = new IneligibilityReason("DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT", 2, 2);
        BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW = new IneligibilityReason("BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW", 3, 3);
        REJECTED_BROKERAGE_ACCOUNT_APPLICATION = new IneligibilityReason("REJECTED_BROKERAGE_ACCOUNT_APPLICATION", 4, 4);
        ACCOUNT_RESTRICTED = new IneligibilityReason("ACCOUNT_RESTRICTED", 5, 5);
        APP_UPGRADE_REQUIRED = new IneligibilityReason("APP_UPGRADE_REQUIRED", 6, 6);
        UNKNOWN_ERROR = new IneligibilityReason("UNKNOWN_ERROR", 7, 7);
        IneligibilityReason[] ineligibilityReasonArr$values = $values();
        $VALUES = ineligibilityReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ineligibilityReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IneligibilityReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IneligibilityReason>(orCreateKotlinClass, syntax, ineligibilityReason) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IneligibilityReason fromValue(int value) {
                return IneligibilityReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IneligibilityReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IneligibilityReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "fromValue", "value", "", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IneligibilityReason fromValue(int value) {
            switch (value) {
                case 0:
                    return IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
                case 1:
                    return IneligibilityReason.NO_INDIVIDUAL_BROKERAGE_ACCOUNT;
                case 2:
                    return IneligibilityReason.DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT;
                case 3:
                    return IneligibilityReason.BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW;
                case 4:
                    return IneligibilityReason.REJECTED_BROKERAGE_ACCOUNT_APPLICATION;
                case 5:
                    return IneligibilityReason.ACCOUNT_RESTRICTED;
                case 6:
                    return IneligibilityReason.APP_UPGRADE_REQUIRED;
                case 7:
                    return IneligibilityReason.UNKNOWN_ERROR;
                default:
                    return null;
            }
        }
    }

    public static IneligibilityReason valueOf(String str) {
        return (IneligibilityReason) Enum.valueOf(IneligibilityReason.class, str);
    }

    public static IneligibilityReason[] values() {
        return (IneligibilityReason[]) $VALUES.clone();
    }
}
