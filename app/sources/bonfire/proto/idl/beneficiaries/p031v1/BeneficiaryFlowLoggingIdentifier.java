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
/* compiled from: BeneficiaryFlowLoggingIdentifier.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED", "BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD", "BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowLoggingIdentifier implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryFlowLoggingIdentifier[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowLoggingIdentifier> ADAPTER;
    public static final BeneficiaryFlowLoggingIdentifier BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD;
    public static final BeneficiaryFlowLoggingIdentifier BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT;
    public static final BeneficiaryFlowLoggingIdentifier BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BeneficiaryFlowLoggingIdentifier[] $values() {
        return new BeneficiaryFlowLoggingIdentifier[]{BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED, BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD, BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT};
    }

    @JvmStatic
    public static final BeneficiaryFlowLoggingIdentifier fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BeneficiaryFlowLoggingIdentifier> getEntries() {
        return $ENTRIES;
    }

    private BeneficiaryFlowLoggingIdentifier(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BeneficiaryFlowLoggingIdentifier beneficiaryFlowLoggingIdentifier = new BeneficiaryFlowLoggingIdentifier("BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED", 0, 0);
        BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED = beneficiaryFlowLoggingIdentifier;
        BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD = new BeneficiaryFlowLoggingIdentifier("BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD", 1, 1);
        BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT = new BeneficiaryFlowLoggingIdentifier("BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT", 2, 2);
        BeneficiaryFlowLoggingIdentifier[] beneficiaryFlowLoggingIdentifierArr$values = $values();
        $VALUES = beneficiaryFlowLoggingIdentifierArr$values;
        $ENTRIES = EnumEntries2.enumEntries(beneficiaryFlowLoggingIdentifierArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowLoggingIdentifier.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BeneficiaryFlowLoggingIdentifier>(orCreateKotlinClass, syntax, beneficiaryFlowLoggingIdentifier) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLoggingIdentifier$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BeneficiaryFlowLoggingIdentifier fromValue(int value) {
                return BeneficiaryFlowLoggingIdentifier.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BeneficiaryFlowLoggingIdentifier.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifier;", "fromValue", "value", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryFlowLoggingIdentifier fromValue(int value) {
            if (value == 0) {
                return BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_UNSPECIFIED;
            }
            if (value == 1) {
                return BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_ADD;
            }
            if (value != 2) {
                return null;
            }
            return BeneficiaryFlowLoggingIdentifier.BENEFICIARY_FLOW_LOGGING_IDENTIFIER_EDIT;
        }
    }

    public static BeneficiaryFlowLoggingIdentifier valueOf(String str) {
        return (BeneficiaryFlowLoggingIdentifier) Enum.valueOf(BeneficiaryFlowLoggingIdentifier.class, str);
    }

    public static BeneficiaryFlowLoggingIdentifier[] values() {
        return (BeneficiaryFlowLoggingIdentifier[]) $VALUES.clone();
    }
}
