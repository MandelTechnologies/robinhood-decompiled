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
import options_product.service.JAPendingApplicationResponseMetadata;

/* compiled from: JAPendingApplicationResponseMetadata.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadata;", "Lcom/squareup/wire/Message;", "", "upgrade_type_in_copy", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;Lokio/ByteString;)V", "getUpgrade_type_in_copy", "()Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "UpgradeTypeInCopy", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class JAPendingApplicationResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<JAPendingApplicationResponseMetadata> ADAPTER;

    @WireField(adapter = "options_product.service.JAPendingApplicationResponseMetadata$UpgradeTypeInCopy#ADAPTER", jsonName = "upgradeTypeInCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UpgradeTypeInCopy upgrade_type_in_copy;

    /* JADX WARN: Multi-variable type inference failed */
    public JAPendingApplicationResponseMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29507newBuilder();
    }

    public final UpgradeTypeInCopy getUpgrade_type_in_copy() {
        return this.upgrade_type_in_copy;
    }

    public /* synthetic */ JAPendingApplicationResponseMetadata(UpgradeTypeInCopy upgradeTypeInCopy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED : upgradeTypeInCopy, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JAPendingApplicationResponseMetadata(UpgradeTypeInCopy upgrade_type_in_copy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(upgrade_type_in_copy, "upgrade_type_in_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.upgrade_type_in_copy = upgrade_type_in_copy;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29507newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JAPendingApplicationResponseMetadata)) {
            return false;
        }
        JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata = (JAPendingApplicationResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), jAPendingApplicationResponseMetadata.unknownFields()) && this.upgrade_type_in_copy == jAPendingApplicationResponseMetadata.upgrade_type_in_copy;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.upgrade_type_in_copy.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("upgrade_type_in_copy=" + this.upgrade_type_in_copy);
        return CollectionsKt.joinToString$default(arrayList, ", ", "JAPendingApplicationResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ JAPendingApplicationResponseMetadata copy$default(JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata, UpgradeTypeInCopy upgradeTypeInCopy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            upgradeTypeInCopy = jAPendingApplicationResponseMetadata.upgrade_type_in_copy;
        }
        if ((i & 2) != 0) {
            byteString = jAPendingApplicationResponseMetadata.unknownFields();
        }
        return jAPendingApplicationResponseMetadata.copy(upgradeTypeInCopy, byteString);
    }

    public final JAPendingApplicationResponseMetadata copy(UpgradeTypeInCopy upgrade_type_in_copy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(upgrade_type_in_copy, "upgrade_type_in_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new JAPendingApplicationResponseMetadata(upgrade_type_in_copy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JAPendingApplicationResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<JAPendingApplicationResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.JAPendingApplicationResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(JAPendingApplicationResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getUpgrade_type_in_copy() != JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED ? size + JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.ADAPTER.encodedSizeWithTag(1, value.getUpgrade_type_in_copy()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, JAPendingApplicationResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUpgrade_type_in_copy() != JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED) {
                    JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpgrade_type_in_copy());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, JAPendingApplicationResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpgrade_type_in_copy() != JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED) {
                    JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpgrade_type_in_copy());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public JAPendingApplicationResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                JAPendingApplicationResponseMetadata.UpgradeTypeInCopy upgradeTypeInCopyDecode = JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new JAPendingApplicationResponseMetadata(upgradeTypeInCopyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            upgradeTypeInCopyDecode = JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public JAPendingApplicationResponseMetadata redact(JAPendingApplicationResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return JAPendingApplicationResponseMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JAPendingApplicationResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UPGRADE_TYPE_UNSPECIFIED", "L0_TO_L2", "L2_TO_L3", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpgradeTypeInCopy implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpgradeTypeInCopy[] $VALUES;

        @JvmField
        public static final ProtoAdapter<UpgradeTypeInCopy> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final UpgradeTypeInCopy L0_TO_L2;
        public static final UpgradeTypeInCopy L2_TO_L3;
        public static final UpgradeTypeInCopy UPGRADE_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ UpgradeTypeInCopy[] $values() {
            return new UpgradeTypeInCopy[]{UPGRADE_TYPE_UNSPECIFIED, L0_TO_L2, L2_TO_L3};
        }

        @JvmStatic
        public static final UpgradeTypeInCopy fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<UpgradeTypeInCopy> getEntries() {
            return $ENTRIES;
        }

        private UpgradeTypeInCopy(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final UpgradeTypeInCopy upgradeTypeInCopy = new UpgradeTypeInCopy("UPGRADE_TYPE_UNSPECIFIED", 0, 0);
            UPGRADE_TYPE_UNSPECIFIED = upgradeTypeInCopy;
            L0_TO_L2 = new UpgradeTypeInCopy("L0_TO_L2", 1, 1);
            L2_TO_L3 = new UpgradeTypeInCopy("L2_TO_L3", 2, 2);
            UpgradeTypeInCopy[] upgradeTypeInCopyArr$values = $values();
            $VALUES = upgradeTypeInCopyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upgradeTypeInCopyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpgradeTypeInCopy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<UpgradeTypeInCopy>(orCreateKotlinClass, syntax, upgradeTypeInCopy) { // from class: options_product.service.JAPendingApplicationResponseMetadata$UpgradeTypeInCopy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public JAPendingApplicationResponseMetadata.UpgradeTypeInCopy fromValue(int value) {
                    return JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: JAPendingApplicationResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final UpgradeTypeInCopy fromValue(int value) {
                if (value == 0) {
                    return UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return UpgradeTypeInCopy.L0_TO_L2;
                }
                if (value != 2) {
                    return null;
                }
                return UpgradeTypeInCopy.L2_TO_L3;
            }
        }

        public static UpgradeTypeInCopy valueOf(String str) {
            return (UpgradeTypeInCopy) Enum.valueOf(UpgradeTypeInCopy.class, str);
        }

        public static UpgradeTypeInCopy[] values() {
            return (UpgradeTypeInCopy[]) $VALUES.clone();
        }
    }
}
