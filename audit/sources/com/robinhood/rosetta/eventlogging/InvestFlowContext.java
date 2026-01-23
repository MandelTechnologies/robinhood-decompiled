package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
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

/* compiled from: InvestFlowContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\nH\u0016JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext;", "Lcom/squareup/wire/Message;", "", "allocation", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "status", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", InstantCashConstants.ACCOUNT_TYPE_KEY, "", "source", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAllocation", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "getEntry_point$annotations", "()V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "getAccount_type", "()Ljava/lang/String;", "getSource", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Allocation", "OrderStatus", "EntryPoint", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InvestFlowContext extends Message {

    @JvmField
    public static final ProtoAdapter<InvestFlowContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.InvestFlowContext$Allocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Allocation allocation;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.InvestFlowContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.InvestFlowContext$OrderStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderStatus status;

    public InvestFlowContext() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Deprecated
    public static /* synthetic */ void getEntry_point$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24315newBuilder();
    }

    public final Allocation getAllocation() {
        return this.allocation;
    }

    public /* synthetic */ InvestFlowContext(Allocation allocation, OrderStatus orderStatus, EntryPoint entryPoint, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Allocation.DEFAULT : allocation, (i & 2) != 0 ? OrderStatus.SUCCESS : orderStatus, (i & 4) != 0 ? EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowContext(Allocation allocation, OrderStatus status, EntryPoint entry_point, String account_type, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.allocation = allocation;
        this.status = status;
        this.entry_point = entry_point;
        this.account_type = account_type;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24315newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestFlowContext)) {
            return false;
        }
        InvestFlowContext investFlowContext = (InvestFlowContext) other;
        return Intrinsics.areEqual(unknownFields(), investFlowContext.unknownFields()) && this.allocation == investFlowContext.allocation && this.status == investFlowContext.status && this.entry_point == investFlowContext.entry_point && Intrinsics.areEqual(this.account_type, investFlowContext.account_type) && Intrinsics.areEqual(this.source, investFlowContext.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.allocation.hashCode()) * 37) + this.status.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.account_type.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("allocation=" + this.allocation);
        arrayList.add("status=" + this.status);
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestFlowContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestFlowContext copy$default(InvestFlowContext investFlowContext, Allocation allocation, OrderStatus orderStatus, EntryPoint entryPoint, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            allocation = investFlowContext.allocation;
        }
        if ((i & 2) != 0) {
            orderStatus = investFlowContext.status;
        }
        if ((i & 4) != 0) {
            entryPoint = investFlowContext.entry_point;
        }
        if ((i & 8) != 0) {
            str = investFlowContext.account_type;
        }
        if ((i & 16) != 0) {
            str2 = investFlowContext.source;
        }
        if ((i & 32) != 0) {
            byteString = investFlowContext.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return investFlowContext.copy(allocation, orderStatus, entryPoint, str, str3, byteString2);
    }

    public final InvestFlowContext copy(Allocation allocation, OrderStatus status, EntryPoint entry_point, String account_type, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestFlowContext(allocation, status, entry_point, account_type, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestFlowContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestFlowContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestFlowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAllocation() != InvestFlowContext.Allocation.DEFAULT) {
                    size += InvestFlowContext.Allocation.ADAPTER.encodedSizeWithTag(1, value.getAllocation());
                }
                if (value.getStatus() != InvestFlowContext.OrderStatus.SUCCESS) {
                    size += InvestFlowContext.OrderStatus.ADAPTER.encodedSizeWithTag(2, value.getStatus());
                }
                if (value.getEntry_point() != InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED) {
                    size += InvestFlowContext.EntryPoint.ADAPTER.encodedSizeWithTag(3, value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_type());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestFlowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAllocation() != InvestFlowContext.Allocation.DEFAULT) {
                    InvestFlowContext.Allocation.ADAPTER.encodeWithTag(writer, 1, (int) value.getAllocation());
                }
                if (value.getStatus() != InvestFlowContext.OrderStatus.SUCCESS) {
                    InvestFlowContext.OrderStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (value.getEntry_point() != InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED) {
                    InvestFlowContext.EntryPoint.ADAPTER.encodeWithTag(writer, 3, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestFlowContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_type());
                }
                if (value.getEntry_point() != InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED) {
                    InvestFlowContext.EntryPoint.ADAPTER.encodeWithTag(writer, 3, (int) value.getEntry_point());
                }
                if (value.getStatus() != InvestFlowContext.OrderStatus.SUCCESS) {
                    InvestFlowContext.OrderStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (value.getAllocation() != InvestFlowContext.Allocation.DEFAULT) {
                    InvestFlowContext.Allocation.ADAPTER.encodeWithTag(writer, 1, (int) value.getAllocation());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestFlowContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestFlowContext.Allocation allocationDecode = InvestFlowContext.Allocation.DEFAULT;
                InvestFlowContext.OrderStatus orderStatus = InvestFlowContext.OrderStatus.SUCCESS;
                InvestFlowContext.EntryPoint entryPoint = InvestFlowContext.EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                InvestFlowContext.EntryPoint entryPointDecode = entryPoint;
                InvestFlowContext.OrderStatus orderStatusDecode = orderStatus;
                while (true) {
                    InvestFlowContext.Allocation allocation = allocationDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InvestFlowContext(allocation, orderStatusDecode, entryPointDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                allocationDecode = InvestFlowContext.Allocation.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                orderStatusDecode = InvestFlowContext.OrderStatus.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                entryPointDecode = InvestFlowContext.EntryPoint.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestFlowContext redact(InvestFlowContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestFlowContext.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "CUSTOM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Allocation implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Allocation[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Allocation> ADAPTER;
        public static final Allocation CUSTOM;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Allocation DEFAULT;
        private final int value;

        private static final /* synthetic */ Allocation[] $values() {
            return new Allocation[]{DEFAULT, CUSTOM};
        }

        @JvmStatic
        public static final Allocation fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Allocation> getEntries() {
            return $ENTRIES;
        }

        private Allocation(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Allocation allocation = new Allocation("DEFAULT", 0, 0);
            DEFAULT = allocation;
            CUSTOM = new Allocation("CUSTOM", 1, 1);
            Allocation[] allocationArr$values = $values();
            $VALUES = allocationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(allocationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Allocation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Allocation>(orCreateKotlinClass, syntax, allocation) { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContext$Allocation$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InvestFlowContext.Allocation fromValue(int value) {
                    return InvestFlowContext.Allocation.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InvestFlowContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Allocation fromValue(int value) {
                if (value == 0) {
                    return Allocation.DEFAULT;
                }
                if (value != 1) {
                    return null;
                }
                return Allocation.CUSTOM;
            }
        }

        public static Allocation valueOf(String str) {
            return (Allocation) Enum.valueOf(Allocation.class, str);
        }

        public static Allocation[] values() {
            return (Allocation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "PARTIALLY_FAILED", "FAILED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderStatus FAILED;
        public static final OrderStatus PARTIALLY_FAILED;
        public static final OrderStatus SUCCESS;
        private final int value;

        private static final /* synthetic */ OrderStatus[] $values() {
            return new OrderStatus[]{SUCCESS, PARTIALLY_FAILED, FAILED};
        }

        @JvmStatic
        public static final OrderStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderStatus> getEntries() {
            return $ENTRIES;
        }

        private OrderStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderStatus orderStatus = new OrderStatus("SUCCESS", 0, 0);
            SUCCESS = orderStatus;
            PARTIALLY_FAILED = new OrderStatus("PARTIALLY_FAILED", 1, 1);
            FAILED = new OrderStatus("FAILED", 2, 2);
            OrderStatus[] orderStatusArr$values = $values();
            $VALUES = orderStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderStatus>(orCreateKotlinClass, syntax, orderStatus) { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContext$OrderStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InvestFlowContext.OrderStatus fromValue(int value) {
                    return InvestFlowContext.OrderStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InvestFlowContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderStatus fromValue(int value) {
                if (value == 0) {
                    return OrderStatus.SUCCESS;
                }
                if (value == 1) {
                    return OrderStatus.PARTIALLY_FAILED;
                }
                if (value != 2) {
                    return null;
                }
                return OrderStatus.FAILED;
            }
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INVEST_FLOW_ENTRY_POINT_UNSPECIFIED", "RET_ONBOARDING_CONGRATS_SCREEN", "RET_POST_ONBOARDING_PANEL", "RET_POST_RECS_NEW_RECURRING", "RET_POST_RECS_UPSELL_RECURRING", "BB_DISCOVERY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint BB_DISCOVERY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint RET_ONBOARDING_CONGRATS_SCREEN;
        public static final EntryPoint RET_POST_ONBOARDING_PANEL;
        public static final EntryPoint RET_POST_RECS_NEW_RECURRING;
        public static final EntryPoint RET_POST_RECS_UPSELL_RECURRING;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{INVEST_FLOW_ENTRY_POINT_UNSPECIFIED, RET_ONBOARDING_CONGRATS_SCREEN, RET_POST_ONBOARDING_PANEL, RET_POST_RECS_NEW_RECURRING, RET_POST_RECS_UPSELL_RECURRING, BB_DISCOVERY};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("INVEST_FLOW_ENTRY_POINT_UNSPECIFIED", 0, 0);
            INVEST_FLOW_ENTRY_POINT_UNSPECIFIED = entryPoint;
            RET_ONBOARDING_CONGRATS_SCREEN = new EntryPoint("RET_ONBOARDING_CONGRATS_SCREEN", 1, 1);
            RET_POST_ONBOARDING_PANEL = new EntryPoint("RET_POST_ONBOARDING_PANEL", 2, 2);
            RET_POST_RECS_NEW_RECURRING = new EntryPoint("RET_POST_RECS_NEW_RECURRING", 3, 3);
            RET_POST_RECS_UPSELL_RECURRING = new EntryPoint("RET_POST_RECS_UPSELL_RECURRING", 4, 4);
            BB_DISCOVERY = new EntryPoint("BB_DISCOVERY", 5, 5);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.InvestFlowContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InvestFlowContext.EntryPoint fromValue(int value) {
                    return InvestFlowContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InvestFlowContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.INVEST_FLOW_ENTRY_POINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryPoint.RET_ONBOARDING_CONGRATS_SCREEN;
                }
                if (value == 2) {
                    return EntryPoint.RET_POST_ONBOARDING_PANEL;
                }
                if (value == 3) {
                    return EntryPoint.RET_POST_RECS_NEW_RECURRING;
                }
                if (value == 4) {
                    return EntryPoint.RET_POST_RECS_UPSELL_RECURRING;
                }
                if (value != 5) {
                    return null;
                }
                return EntryPoint.BB_DISCOVERY;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
