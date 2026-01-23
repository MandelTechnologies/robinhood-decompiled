package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.directdeposit.DirectDepositConstants;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
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

/* compiled from: DirectDepositContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContext;", "Lcom/squareup/wire/Message;", "", "direct_deposit_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "deposit_amount_type", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "deposit_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;Ljava/lang/String;Lokio/ByteString;)V", "getDirect_deposit_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "getDeposit_amount_type", "()Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "getDeposit_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "DirectDepositType", "DepositAmountType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DirectDepositContext extends Message {

    @JvmField
    public static final ProtoAdapter<DirectDepositContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deposit_amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DirectDepositContext$DepositAmountType#ADAPTER", jsonName = "depositAmountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DepositAmountType deposit_amount_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DirectDepositContext$DirectDepositType#ADAPTER", jsonName = DirectDepositConstants.directDepositTypeResultKey, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DirectDepositType direct_deposit_type;

    public DirectDepositContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24223newBuilder();
    }

    public final DirectDepositType getDirect_deposit_type() {
        return this.direct_deposit_type;
    }

    public /* synthetic */ DirectDepositContext(DirectDepositType directDepositType, DepositAmountType depositAmountType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED : directDepositType, (i & 2) != 0 ? DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED : depositAmountType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DepositAmountType getDeposit_amount_type() {
        return this.deposit_amount_type;
    }

    public final String getDeposit_amount() {
        return this.deposit_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositContext(DirectDepositType direct_deposit_type, DepositAmountType deposit_amount_type, String deposit_amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
        Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.direct_deposit_type = direct_deposit_type;
        this.deposit_amount_type = deposit_amount_type;
        this.deposit_amount = deposit_amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24223newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DirectDepositContext)) {
            return false;
        }
        DirectDepositContext directDepositContext = (DirectDepositContext) other;
        return Intrinsics.areEqual(unknownFields(), directDepositContext.unknownFields()) && this.direct_deposit_type == directDepositContext.direct_deposit_type && this.deposit_amount_type == directDepositContext.deposit_amount_type && Intrinsics.areEqual(this.deposit_amount, directDepositContext.deposit_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.direct_deposit_type.hashCode()) * 37) + this.deposit_amount_type.hashCode()) * 37) + this.deposit_amount.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("direct_deposit_type=" + this.direct_deposit_type);
        arrayList.add("deposit_amount_type=" + this.deposit_amount_type);
        arrayList.add("deposit_amount=" + Internal.sanitize(this.deposit_amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DirectDepositContext copy$default(DirectDepositContext directDepositContext, DirectDepositType directDepositType, DepositAmountType depositAmountType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            directDepositType = directDepositContext.direct_deposit_type;
        }
        if ((i & 2) != 0) {
            depositAmountType = directDepositContext.deposit_amount_type;
        }
        if ((i & 4) != 0) {
            str = directDepositContext.deposit_amount;
        }
        if ((i & 8) != 0) {
            byteString = directDepositContext.unknownFields();
        }
        return directDepositContext.copy(directDepositType, depositAmountType, str, byteString);
    }

    public final DirectDepositContext copy(DirectDepositType direct_deposit_type, DepositAmountType deposit_amount_type, String deposit_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direct_deposit_type, "direct_deposit_type");
        Intrinsics.checkNotNullParameter(deposit_amount_type, "deposit_amount_type");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DirectDepositContext(direct_deposit_type, deposit_amount_type, deposit_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DirectDepositContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DirectDepositContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DirectDepositContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDirect_deposit_type() != DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED) {
                    size += DirectDepositContext.DirectDepositType.ADAPTER.encodedSizeWithTag(1, value.getDirect_deposit_type());
                }
                if (value.getDeposit_amount_type() != DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED) {
                    size += DirectDepositContext.DepositAmountType.ADAPTER.encodedSizeWithTag(2, value.getDeposit_amount_type());
                }
                return !Intrinsics.areEqual(value.getDeposit_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeposit_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DirectDepositContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDirect_deposit_type() != DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED) {
                    DirectDepositContext.DirectDepositType.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirect_deposit_type());
                }
                if (value.getDeposit_amount_type() != DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED) {
                    DirectDepositContext.DepositAmountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeposit_amount_type());
                }
                if (!Intrinsics.areEqual(value.getDeposit_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeposit_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DirectDepositContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDeposit_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeposit_amount());
                }
                if (value.getDeposit_amount_type() != DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED) {
                    DirectDepositContext.DepositAmountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getDeposit_amount_type());
                }
                if (value.getDirect_deposit_type() != DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED) {
                    DirectDepositContext.DirectDepositType.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirect_deposit_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DirectDepositContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DirectDepositContext.DirectDepositType directDepositTypeDecode = DirectDepositContext.DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
                DirectDepositContext.DepositAmountType depositAmountTypeDecode = DirectDepositContext.DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DirectDepositContext(directDepositTypeDecode, depositAmountTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            directDepositTypeDecode = DirectDepositContext.DirectDepositType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            depositAmountTypeDecode = DirectDepositContext.DepositAmountType.ADAPTER.decode(reader);
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
            public DirectDepositContext redact(DirectDepositContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DirectDepositContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECT_DEPOSIT_TYPE_UNSPECIFIED", "ONLINE", "PREFILLED_FORM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectDepositType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectDepositType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DirectDepositType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DirectDepositType DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
        public static final DirectDepositType ONLINE;
        public static final DirectDepositType PREFILLED_FORM;
        private final int value;

        private static final /* synthetic */ DirectDepositType[] $values() {
            return new DirectDepositType[]{DIRECT_DEPOSIT_TYPE_UNSPECIFIED, ONLINE, PREFILLED_FORM};
        }

        @JvmStatic
        public static final DirectDepositType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DirectDepositType> getEntries() {
            return $ENTRIES;
        }

        private DirectDepositType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DirectDepositType directDepositType = new DirectDepositType("DIRECT_DEPOSIT_TYPE_UNSPECIFIED", 0, 0);
            DIRECT_DEPOSIT_TYPE_UNSPECIFIED = directDepositType;
            ONLINE = new DirectDepositType("ONLINE", 1, 1);
            PREFILLED_FORM = new DirectDepositType("PREFILLED_FORM", 2, 2);
            DirectDepositType[] directDepositTypeArr$values = $values();
            $VALUES = directDepositTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directDepositTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DirectDepositType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DirectDepositType>(orCreateKotlinClass, syntax, directDepositType) { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContext$DirectDepositType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DirectDepositContext.DirectDepositType fromValue(int value) {
                    return DirectDepositContext.DirectDepositType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DirectDepositContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DirectDepositType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DirectDepositType fromValue(int value) {
                if (value == 0) {
                    return DirectDepositType.DIRECT_DEPOSIT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DirectDepositType.ONLINE;
                }
                if (value != 2) {
                    return null;
                }
                return DirectDepositType.PREFILLED_FORM;
            }
        }

        public static DirectDepositType valueOf(String str) {
            return (DirectDepositType) Enum.valueOf(DirectDepositType.class, str);
        }

        public static DirectDepositType[] values() {
            return (DirectDepositType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEPOSIT_AMOUNT_TYPE_UNSPECIFIED", "ENTIRE", "DOLLAR", "PERCENTAGE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DepositAmountType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DepositAmountType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DepositAmountType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DepositAmountType DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
        public static final DepositAmountType DOLLAR;
        public static final DepositAmountType ENTIRE;
        public static final DepositAmountType PERCENTAGE;
        private final int value;

        private static final /* synthetic */ DepositAmountType[] $values() {
            return new DepositAmountType[]{DEPOSIT_AMOUNT_TYPE_UNSPECIFIED, ENTIRE, DOLLAR, PERCENTAGE};
        }

        @JvmStatic
        public static final DepositAmountType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DepositAmountType> getEntries() {
            return $ENTRIES;
        }

        private DepositAmountType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DepositAmountType depositAmountType = new DepositAmountType("DEPOSIT_AMOUNT_TYPE_UNSPECIFIED", 0, 0);
            DEPOSIT_AMOUNT_TYPE_UNSPECIFIED = depositAmountType;
            ENTIRE = new DepositAmountType("ENTIRE", 1, 1);
            DOLLAR = new DepositAmountType("DOLLAR", 2, 2);
            PERCENTAGE = new DepositAmountType("PERCENTAGE", 3, 3);
            DepositAmountType[] depositAmountTypeArr$values = $values();
            $VALUES = depositAmountTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(depositAmountTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositAmountType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DepositAmountType>(orCreateKotlinClass, syntax, depositAmountType) { // from class: com.robinhood.rosetta.eventlogging.DirectDepositContext$DepositAmountType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DirectDepositContext.DepositAmountType fromValue(int value) {
                    return DirectDepositContext.DepositAmountType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DirectDepositContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DirectDepositContext$DepositAmountType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DepositAmountType fromValue(int value) {
                if (value == 0) {
                    return DepositAmountType.DEPOSIT_AMOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DepositAmountType.ENTIRE;
                }
                if (value == 2) {
                    return DepositAmountType.DOLLAR;
                }
                if (value != 3) {
                    return null;
                }
                return DepositAmountType.PERCENTAGE;
            }
        }

        public static DepositAmountType valueOf(String str) {
            return (DepositAmountType) Enum.valueOf(DepositAmountType.class, str);
        }

        public static DepositAmountType[] values() {
            return (DepositAmountType[]) $VALUES.clone();
        }
    }
}
