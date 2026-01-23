package options_product.service;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import options_product.service.SuccessResponseMetadata;

/* compiled from: SuccessResponseMetadata.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Loptions_product/service/SuccessResponseMetadata;", "Lcom/squareup/wire/Message;", "", "upgrade_flow", "Loptions_product/service/SuccessResponseMetadata$UpgradeFlow;", "account_type_in_copy", "Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy;", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/SuccessResponseMetadata$UpgradeFlow;Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy;Ljava/lang/String;Lokio/ByteString;)V", "getUpgrade_flow", "()Loptions_product/service/SuccessResponseMetadata$UpgradeFlow;", "getAccount_type_in_copy", "()Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy;", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "UpgradeFlow", "AccountTypeInCopy", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SuccessResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<SuccessResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "options_product.service.SuccessResponseMetadata$AccountTypeInCopy#ADAPTER", jsonName = "accountTypeInCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountTypeInCopy account_type_in_copy;

    @WireField(adapter = "options_product.service.SuccessResponseMetadata$UpgradeFlow#ADAPTER", jsonName = "upgradeFlow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UpgradeFlow upgrade_flow;

    public SuccessResponseMetadata() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29580newBuilder();
    }

    public final UpgradeFlow getUpgrade_flow() {
        return this.upgrade_flow;
    }

    public /* synthetic */ SuccessResponseMetadata(UpgradeFlow upgradeFlow, AccountTypeInCopy accountTypeInCopy, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED : upgradeFlow, (i & 2) != 0 ? AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED : accountTypeInCopy, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AccountTypeInCopy getAccount_type_in_copy() {
        return this.account_type_in_copy;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessResponseMetadata(UpgradeFlow upgrade_flow, AccountTypeInCopy account_type_in_copy, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(upgrade_flow, "upgrade_flow");
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.upgrade_flow = upgrade_flow;
        this.account_type_in_copy = account_type_in_copy;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29580newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SuccessResponseMetadata)) {
            return false;
        }
        SuccessResponseMetadata successResponseMetadata = (SuccessResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), successResponseMetadata.unknownFields()) && this.upgrade_flow == successResponseMetadata.upgrade_flow && this.account_type_in_copy == successResponseMetadata.account_type_in_copy && Intrinsics.areEqual(this.account_number, successResponseMetadata.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.upgrade_flow.hashCode()) * 37) + this.account_type_in_copy.hashCode()) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("upgrade_flow=" + this.upgrade_flow);
        arrayList.add("account_type_in_copy=" + this.account_type_in_copy);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuccessResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SuccessResponseMetadata copy$default(SuccessResponseMetadata successResponseMetadata, UpgradeFlow upgradeFlow, AccountTypeInCopy accountTypeInCopy, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            upgradeFlow = successResponseMetadata.upgrade_flow;
        }
        if ((i & 2) != 0) {
            accountTypeInCopy = successResponseMetadata.account_type_in_copy;
        }
        if ((i & 4) != 0) {
            str = successResponseMetadata.account_number;
        }
        if ((i & 8) != 0) {
            byteString = successResponseMetadata.unknownFields();
        }
        return successResponseMetadata.copy(upgradeFlow, accountTypeInCopy, str, byteString);
    }

    public final SuccessResponseMetadata copy(UpgradeFlow upgrade_flow, AccountTypeInCopy account_type_in_copy, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(upgrade_flow, "upgrade_flow");
        Intrinsics.checkNotNullParameter(account_type_in_copy, "account_type_in_copy");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SuccessResponseMetadata(upgrade_flow, account_type_in_copy, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SuccessResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SuccessResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.SuccessResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SuccessResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUpgrade_flow() != SuccessResponseMetadata.UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED) {
                    size += SuccessResponseMetadata.UpgradeFlow.ADAPTER.encodedSizeWithTag(1, value.getUpgrade_flow());
                }
                if (value.getAccount_type_in_copy() != SuccessResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += SuccessResponseMetadata.AccountTypeInCopy.ADAPTER.encodedSizeWithTag(2, value.getAccount_type_in_copy());
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SuccessResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUpgrade_flow() != SuccessResponseMetadata.UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED) {
                    SuccessResponseMetadata.UpgradeFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpgrade_flow());
                }
                if (value.getAccount_type_in_copy() != SuccessResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    SuccessResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type_in_copy());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SuccessResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getAccount_type_in_copy() != SuccessResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED) {
                    SuccessResponseMetadata.AccountTypeInCopy.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type_in_copy());
                }
                if (value.getUpgrade_flow() != SuccessResponseMetadata.UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED) {
                    SuccessResponseMetadata.UpgradeFlow.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpgrade_flow());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SuccessResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SuccessResponseMetadata.UpgradeFlow upgradeFlowDecode = SuccessResponseMetadata.UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED;
                SuccessResponseMetadata.AccountTypeInCopy accountTypeInCopyDecode = SuccessResponseMetadata.AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SuccessResponseMetadata(upgradeFlowDecode, accountTypeInCopyDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            upgradeFlowDecode = SuccessResponseMetadata.UpgradeFlow.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            accountTypeInCopyDecode = SuccessResponseMetadata.AccountTypeInCopy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SuccessResponseMetadata redact(SuccessResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SuccessResponseMetadata.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuccessResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/SuccessResponseMetadata$UpgradeFlow;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UPGRADE_FLOW_UNSPECIFIED", "L0_TO_L2", "L0_TO_L3", "L2_TO_L3", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class UpgradeFlow implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpgradeFlow[] $VALUES;

        @JvmField
        public static final ProtoAdapter<UpgradeFlow> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final UpgradeFlow L0_TO_L2;
        public static final UpgradeFlow L0_TO_L3;
        public static final UpgradeFlow L2_TO_L3;
        public static final UpgradeFlow UPGRADE_FLOW_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ UpgradeFlow[] $values() {
            return new UpgradeFlow[]{UPGRADE_FLOW_UNSPECIFIED, L0_TO_L2, L0_TO_L3, L2_TO_L3};
        }

        @JvmStatic
        public static final UpgradeFlow fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<UpgradeFlow> getEntries() {
            return $ENTRIES;
        }

        private UpgradeFlow(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final UpgradeFlow upgradeFlow = new UpgradeFlow("UPGRADE_FLOW_UNSPECIFIED", 0, 0);
            UPGRADE_FLOW_UNSPECIFIED = upgradeFlow;
            L0_TO_L2 = new UpgradeFlow("L0_TO_L2", 1, 1);
            L0_TO_L3 = new UpgradeFlow("L0_TO_L3", 2, 2);
            L2_TO_L3 = new UpgradeFlow("L2_TO_L3", 3, 3);
            UpgradeFlow[] upgradeFlowArr$values = $values();
            $VALUES = upgradeFlowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upgradeFlowArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpgradeFlow.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<UpgradeFlow>(orCreateKotlinClass, syntax, upgradeFlow) { // from class: options_product.service.SuccessResponseMetadata$UpgradeFlow$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SuccessResponseMetadata.UpgradeFlow fromValue(int value) {
                    return SuccessResponseMetadata.UpgradeFlow.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SuccessResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/SuccessResponseMetadata$UpgradeFlow$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/SuccessResponseMetadata$UpgradeFlow;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final UpgradeFlow fromValue(int value) {
                if (value == 0) {
                    return UpgradeFlow.UPGRADE_FLOW_UNSPECIFIED;
                }
                if (value == 1) {
                    return UpgradeFlow.L0_TO_L2;
                }
                if (value == 2) {
                    return UpgradeFlow.L0_TO_L3;
                }
                if (value != 3) {
                    return null;
                }
                return UpgradeFlow.L2_TO_L3;
            }
        }

        public static UpgradeFlow valueOf(String str) {
            return (UpgradeFlow) Enum.valueOf(UpgradeFlow.class, str);
        }

        public static UpgradeFlow[] values() {
            return (UpgradeFlow[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuccessResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "NONE", "JOINT_TENANCY_WITH_ROS", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class AccountTypeInCopy implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountTypeInCopy[] $VALUES;
        public static final AccountTypeInCopy ACCOUNT_TYPE_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<AccountTypeInCopy> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountTypeInCopy JOINT_TENANCY_WITH_ROS;
        public static final AccountTypeInCopy NONE;
        private final int value;

        private static final /* synthetic */ AccountTypeInCopy[] $values() {
            return new AccountTypeInCopy[]{ACCOUNT_TYPE_UNSPECIFIED, NONE, JOINT_TENANCY_WITH_ROS};
        }

        @JvmStatic
        public static final AccountTypeInCopy fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountTypeInCopy> getEntries() {
            return $ENTRIES;
        }

        private AccountTypeInCopy(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountTypeInCopy accountTypeInCopy = new AccountTypeInCopy("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
            ACCOUNT_TYPE_UNSPECIFIED = accountTypeInCopy;
            NONE = new AccountTypeInCopy("NONE", 1, 1);
            JOINT_TENANCY_WITH_ROS = new AccountTypeInCopy("JOINT_TENANCY_WITH_ROS", 2, 2);
            AccountTypeInCopy[] accountTypeInCopyArr$values = $values();
            $VALUES = accountTypeInCopyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeInCopyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountTypeInCopy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountTypeInCopy>(orCreateKotlinClass, syntax, accountTypeInCopy) { // from class: options_product.service.SuccessResponseMetadata$AccountTypeInCopy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SuccessResponseMetadata.AccountTypeInCopy fromValue(int value) {
                    return SuccessResponseMetadata.AccountTypeInCopy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SuccessResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/SuccessResponseMetadata$AccountTypeInCopy;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountTypeInCopy fromValue(int value) {
                if (value == 0) {
                    return AccountTypeInCopy.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AccountTypeInCopy.NONE;
                }
                if (value != 2) {
                    return null;
                }
                return AccountTypeInCopy.JOINT_TENANCY_WITH_ROS;
            }
        }

        public static AccountTypeInCopy valueOf(String str) {
            return (AccountTypeInCopy) Enum.valueOf(AccountTypeInCopy.class, str);
        }

        public static AccountTypeInCopy[] values() {
            return (AccountTypeInCopy[]) $VALUES.clone();
        }
    }
}
