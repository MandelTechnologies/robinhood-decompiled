package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.rosetta.eventlogging.FundingContext;
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

/* compiled from: FundingContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContext;", "Lcom/squareup/wire/Message;", "", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "transfer_state", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "transfer_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;Ljava/lang/String;DLokio/ByteString;)V", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "getTransfer_state", "()Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "getTransfer_id", "()Ljava/lang/String;", "getTransfer_amount", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TransferType", "TransferState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FundingContext extends Message {

    @JvmField
    public static final ProtoAdapter<FundingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "transferAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double transfer_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String transfer_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FundingContext$TransferState#ADAPTER", jsonName = "transferState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferState transfer_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FundingContext$TransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferType transfer_type;

    public FundingContext() {
        this(null, null, null, 0.0d, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24270newBuilder();
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public /* synthetic */ FundingContext(TransferType transferType, TransferState transferState, String str, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferType.TRANSFER_TYPE_UNSPECIFIED : transferType, (i & 2) != 0 ? TransferState.TRANSFER_STATE_UNSPECIFIED : transferState, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TransferState getTransfer_state() {
        return this.transfer_state;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final double getTransfer_amount() {
        return this.transfer_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingContext(TransferType transfer_type, TransferState transfer_state, String transfer_id, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_type = transfer_type;
        this.transfer_state = transfer_state;
        this.transfer_id = transfer_id;
        this.transfer_amount = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24270newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FundingContext)) {
            return false;
        }
        FundingContext fundingContext = (FundingContext) other;
        return Intrinsics.areEqual(unknownFields(), fundingContext.unknownFields()) && this.transfer_type == fundingContext.transfer_type && this.transfer_state == fundingContext.transfer_state && Intrinsics.areEqual(this.transfer_id, fundingContext.transfer_id) && this.transfer_amount == fundingContext.transfer_amount;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.transfer_type.hashCode()) * 37) + this.transfer_state.hashCode()) * 37) + this.transfer_id.hashCode()) * 37) + Double.hashCode(this.transfer_amount);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("transfer_state=" + this.transfer_state);
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("transfer_amount=" + this.transfer_amount);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FundingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FundingContext copy$default(FundingContext fundingContext, TransferType transferType, TransferState transferState, String str, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferType = fundingContext.transfer_type;
        }
        if ((i & 2) != 0) {
            transferState = fundingContext.transfer_state;
        }
        if ((i & 4) != 0) {
            str = fundingContext.transfer_id;
        }
        if ((i & 8) != 0) {
            d = fundingContext.transfer_amount;
        }
        if ((i & 16) != 0) {
            byteString = fundingContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return fundingContext.copy(transferType, transferState, str2, d, byteString2);
    }

    public final FundingContext copy(TransferType transfer_type, TransferState transfer_state, String transfer_id, double transfer_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FundingContext(transfer_type, transfer_state, transfer_id, transfer_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FundingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FundingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FundingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer_type() != FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    size += FundingContext.TransferType.ADAPTER.encodedSizeWithTag(1, value.getTransfer_type());
                }
                if (value.getTransfer_state() != FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    size += FundingContext.TransferState.ADAPTER.encodedSizeWithTag(2, value.getTransfer_state());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTransfer_id());
                }
                return !Double.valueOf(value.getTransfer_amount()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getTransfer_amount())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FundingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer_type() != FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    FundingContext.TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
                if (value.getTransfer_state() != FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    FundingContext.TransferState.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_state());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTransfer_id());
                }
                if (!Double.valueOf(value.getTransfer_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getTransfer_amount()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FundingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getTransfer_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getTransfer_amount()));
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTransfer_id());
                }
                if (value.getTransfer_state() != FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED) {
                    FundingContext.TransferState.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_state());
                }
                if (value.getTransfer_type() != FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    FundingContext.TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FundingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FundingContext.TransferType transferTypeDecode = FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED;
                FundingContext.TransferState transferState = FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                String strDecode = "";
                FundingContext.TransferState transferStateDecode = transferState;
                while (true) {
                    FundingContext.TransferType transferType = transferTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FundingContext(transferType, transferStateDecode, strDecode, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                transferTypeDecode = FundingContext.TransferType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                transferStateDecode = FundingContext.TransferState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundingContext redact(FundingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FundingContext.copy$default(value, null, null, null, 0.0d, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_TYPE_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransferType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferType DEPOSIT;
        public static final TransferType TRANSFER_TYPE_UNSPECIFIED;
        public static final TransferType WITHDRAWAL;
        private final int value;

        private static final /* synthetic */ TransferType[] $values() {
            return new TransferType[]{TRANSFER_TYPE_UNSPECIFIED, DEPOSIT, WITHDRAWAL};
        }

        @JvmStatic
        public static final TransferType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferType> getEntries() {
            return $ENTRIES;
        }

        private TransferType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferType transferType = new TransferType("TRANSFER_TYPE_UNSPECIFIED", 0, 0);
            TRANSFER_TYPE_UNSPECIFIED = transferType;
            DEPOSIT = new TransferType("DEPOSIT", 1, 1);
            WITHDRAWAL = new TransferType("WITHDRAWAL", 2, 2);
            TransferType[] transferTypeArr$values = $values();
            $VALUES = transferTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferType>(orCreateKotlinClass, syntax, transferType) { // from class: com.robinhood.rosetta.eventlogging.FundingContext$TransferType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FundingContext.TransferType fromValue(int value) {
                    return FundingContext.TransferType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FundingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferType fromValue(int value) {
                if (value == 0) {
                    return TransferType.TRANSFER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferType.DEPOSIT;
                }
                if (value != 2) {
                    return null;
                }
                return TransferType.WITHDRAWAL;
            }
        }

        public static TransferType valueOf(String str) {
            return (TransferType) Enum.valueOf(TransferType.class, str);
        }

        public static TransferType[] values() {
            return (TransferType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_STATE_UNSPECIFIED", "PENDING", "IN_TRANSIT", "COMPLETED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransferState> ADAPTER;
        public static final TransferState COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferState IN_TRANSIT;
        public static final TransferState PENDING;
        public static final TransferState TRANSFER_STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TransferState[] $values() {
            return new TransferState[]{TRANSFER_STATE_UNSPECIFIED, PENDING, IN_TRANSIT, COMPLETED};
        }

        @JvmStatic
        public static final TransferState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferState> getEntries() {
            return $ENTRIES;
        }

        private TransferState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferState transferState = new TransferState("TRANSFER_STATE_UNSPECIFIED", 0, 0);
            TRANSFER_STATE_UNSPECIFIED = transferState;
            PENDING = new TransferState("PENDING", 1, 1);
            IN_TRANSIT = new TransferState("IN_TRANSIT", 2, 2);
            COMPLETED = new TransferState("COMPLETED", 3, 3);
            TransferState[] transferStateArr$values = $values();
            $VALUES = transferStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferState>(orCreateKotlinClass, syntax, transferState) { // from class: com.robinhood.rosetta.eventlogging.FundingContext$TransferState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FundingContext.TransferState fromValue(int value) {
                    return FundingContext.TransferState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FundingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferState fromValue(int value) {
                if (value == 0) {
                    return TransferState.TRANSFER_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferState.PENDING;
                }
                if (value == 2) {
                    return TransferState.IN_TRANSIT;
                }
                if (value != 3) {
                    return null;
                }
                return TransferState.COMPLETED;
            }
        }

        public static TransferState valueOf(String str) {
            return (TransferState) Enum.valueOf(TransferState.class, str);
        }

        public static TransferState[] values() {
            return (TransferState[]) $VALUES.clone();
        }
    }
}
