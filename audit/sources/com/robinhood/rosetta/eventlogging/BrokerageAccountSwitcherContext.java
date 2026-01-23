package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: BrokerageAccountSwitcherContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BrokerageAccountSwitcherContext;", "Lcom/squareup/wire/Message;", "", "from_account_type", "Lrosetta/account/BrokerageAccountType;", "to_account_type", "from_management_type", "Lrosetta/account/ManagementType;", "to_management_type", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lrosetta/account/ManagementType;Lokio/ByteString;)V", "getFrom_account_type", "()Lrosetta/account/BrokerageAccountType;", "getTo_account_type", "getFrom_management_type", "()Lrosetta/account/ManagementType;", "getTo_management_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BrokerageAccountSwitcherContext extends Message {

    @JvmField
    public static final ProtoAdapter<BrokerageAccountSwitcherContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "fromAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BrokerageAccountType from_account_type;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "fromManagementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ManagementType from_management_type;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "toAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BrokerageAccountType to_account_type;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "toManagementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ManagementType to_management_type;

    public BrokerageAccountSwitcherContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24034newBuilder();
    }

    public final BrokerageAccountType getFrom_account_type() {
        return this.from_account_type;
    }

    public /* synthetic */ BrokerageAccountSwitcherContext(BrokerageAccountType brokerageAccountType, BrokerageAccountType brokerageAccountType2, ManagementType managementType, ManagementType managementType2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 2) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType2, (i & 4) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 8) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BrokerageAccountType getTo_account_type() {
        return this.to_account_type;
    }

    public final ManagementType getFrom_management_type() {
        return this.from_management_type;
    }

    public final ManagementType getTo_management_type() {
        return this.to_management_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrokerageAccountSwitcherContext(BrokerageAccountType from_account_type, BrokerageAccountType to_account_type, ManagementType from_management_type, ManagementType to_management_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(from_account_type, "from_account_type");
        Intrinsics.checkNotNullParameter(to_account_type, "to_account_type");
        Intrinsics.checkNotNullParameter(from_management_type, "from_management_type");
        Intrinsics.checkNotNullParameter(to_management_type, "to_management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.from_account_type = from_account_type;
        this.to_account_type = to_account_type;
        this.from_management_type = from_management_type;
        this.to_management_type = to_management_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24034newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrokerageAccountSwitcherContext)) {
            return false;
        }
        BrokerageAccountSwitcherContext brokerageAccountSwitcherContext = (BrokerageAccountSwitcherContext) other;
        return Intrinsics.areEqual(unknownFields(), brokerageAccountSwitcherContext.unknownFields()) && this.from_account_type == brokerageAccountSwitcherContext.from_account_type && this.to_account_type == brokerageAccountSwitcherContext.to_account_type && this.from_management_type == brokerageAccountSwitcherContext.from_management_type && this.to_management_type == brokerageAccountSwitcherContext.to_management_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.from_account_type.hashCode()) * 37) + this.to_account_type.hashCode()) * 37) + this.from_management_type.hashCode()) * 37) + this.to_management_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("from_account_type=" + this.from_account_type);
        arrayList.add("to_account_type=" + this.to_account_type);
        arrayList.add("from_management_type=" + this.from_management_type);
        arrayList.add("to_management_type=" + this.to_management_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrokerageAccountSwitcherContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BrokerageAccountSwitcherContext copy$default(BrokerageAccountSwitcherContext brokerageAccountSwitcherContext, BrokerageAccountType brokerageAccountType, BrokerageAccountType brokerageAccountType2, ManagementType managementType, ManagementType managementType2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = brokerageAccountSwitcherContext.from_account_type;
        }
        if ((i & 2) != 0) {
            brokerageAccountType2 = brokerageAccountSwitcherContext.to_account_type;
        }
        if ((i & 4) != 0) {
            managementType = brokerageAccountSwitcherContext.from_management_type;
        }
        if ((i & 8) != 0) {
            managementType2 = brokerageAccountSwitcherContext.to_management_type;
        }
        if ((i & 16) != 0) {
            byteString = brokerageAccountSwitcherContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        ManagementType managementType3 = managementType;
        return brokerageAccountSwitcherContext.copy(brokerageAccountType, brokerageAccountType2, managementType3, managementType2, byteString2);
    }

    public final BrokerageAccountSwitcherContext copy(BrokerageAccountType from_account_type, BrokerageAccountType to_account_type, ManagementType from_management_type, ManagementType to_management_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(from_account_type, "from_account_type");
        Intrinsics.checkNotNullParameter(to_account_type, "to_account_type");
        Intrinsics.checkNotNullParameter(from_management_type, "from_management_type");
        Intrinsics.checkNotNullParameter(to_management_type, "to_management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BrokerageAccountSwitcherContext(from_account_type, to_account_type, from_management_type, to_management_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokerageAccountSwitcherContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrokerageAccountSwitcherContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrokerageAccountSwitcherContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                BrokerageAccountType from_account_type = value.getFrom_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (from_account_type != brokerageAccountType) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getFrom_account_type());
                }
                if (value.getTo_account_type() != brokerageAccountType) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(2, value.getTo_account_type());
                }
                ManagementType from_management_type = value.getFrom_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (from_management_type != managementType) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(3, value.getFrom_management_type());
                }
                return value.getTo_management_type() != managementType ? size + ManagementType.ADAPTER.encodedSizeWithTag(4, value.getTo_management_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrokerageAccountSwitcherContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BrokerageAccountType from_account_type = value.getFrom_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (from_account_type != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFrom_account_type());
                }
                if (value.getTo_account_type() != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTo_account_type());
                }
                ManagementType from_management_type = value.getFrom_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (from_management_type != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFrom_management_type());
                }
                if (value.getTo_management_type() != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getTo_management_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrokerageAccountSwitcherContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementType to_management_type = value.getTo_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (to_management_type != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getTo_management_type());
                }
                if (value.getFrom_management_type() != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getFrom_management_type());
                }
                BrokerageAccountType to_account_type = value.getTo_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (to_account_type != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTo_account_type());
                }
                if (value.getFrom_account_type() != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFrom_account_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountSwitcherContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                ManagementType managementTypeDecode = managementType;
                ManagementType managementTypeDecode2 = managementTypeDecode;
                BrokerageAccountType brokerageAccountTypeDecode2 = brokerageAccountTypeDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BrokerageAccountSwitcherContext(brokerageAccountTypeDecode2, brokerageAccountTypeDecode, managementTypeDecode, managementTypeDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            brokerageAccountTypeDecode2 = BrokerageAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else if (iNextTag == 4) {
                        try {
                            managementTypeDecode2 = ManagementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrokerageAccountSwitcherContext redact(BrokerageAccountSwitcherContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BrokerageAccountSwitcherContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
