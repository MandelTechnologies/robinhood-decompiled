package bonfire.proto.idl.beneficiaries.p031v1;

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
/* compiled from: BeneficiaryInfoLoggingIdentifier.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED", "BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE", "BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD", "BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryInfoLoggingIdentifier implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryInfoLoggingIdentifier[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BeneficiaryInfoLoggingIdentifier> ADAPTER;
    public static final BeneficiaryInfoLoggingIdentifier BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD;
    public static final BeneficiaryInfoLoggingIdentifier BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT;
    public static final BeneficiaryInfoLoggingIdentifier BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE;
    public static final BeneficiaryInfoLoggingIdentifier BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BeneficiaryInfoLoggingIdentifier[] $values() {
        return new BeneficiaryInfoLoggingIdentifier[]{BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED, BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE, BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD, BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT};
    }

    @JvmStatic
    public static final BeneficiaryInfoLoggingIdentifier fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BeneficiaryInfoLoggingIdentifier> getEntries() {
        return $ENTRIES;
    }

    private BeneficiaryInfoLoggingIdentifier(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifier = new BeneficiaryInfoLoggingIdentifier("BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED", 0, 0);
        BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED = beneficiaryInfoLoggingIdentifier;
        BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE = new BeneficiaryInfoLoggingIdentifier("BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE", 1, 1);
        BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD = new BeneficiaryInfoLoggingIdentifier("BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD", 2, 2);
        BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT = new BeneficiaryInfoLoggingIdentifier("BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT", 3, 3);
        BeneficiaryInfoLoggingIdentifier[] beneficiaryInfoLoggingIdentifierArr$values = $values();
        $VALUES = beneficiaryInfoLoggingIdentifierArr$values;
        $ENTRIES = EnumEntries2.enumEntries(beneficiaryInfoLoggingIdentifierArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryInfoLoggingIdentifier.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BeneficiaryInfoLoggingIdentifier>(orCreateKotlinClass, syntax, beneficiaryInfoLoggingIdentifier) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifier$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BeneficiaryInfoLoggingIdentifier fromValue(int value) {
                return BeneficiaryInfoLoggingIdentifier.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BeneficiaryInfoLoggingIdentifier.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier;", "fromValue", "value", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryInfoLoggingIdentifier fromValue(int value) {
            if (value == 0) {
                return BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED;
            }
            if (value == 1) {
                return BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_STANDALONE;
            }
            if (value == 2) {
                return BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_ADD;
            }
            if (value != 3) {
                return null;
            }
            return BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_BENEFICIARY_FLOW_EDIT;
        }
    }

    public static BeneficiaryInfoLoggingIdentifier valueOf(String str) {
        return (BeneficiaryInfoLoggingIdentifier) Enum.valueOf(BeneficiaryInfoLoggingIdentifier.class, str);
    }

    public static BeneficiaryInfoLoggingIdentifier[] values() {
        return (BeneficiaryInfoLoggingIdentifier[]) $VALUES.clone();
    }
}
