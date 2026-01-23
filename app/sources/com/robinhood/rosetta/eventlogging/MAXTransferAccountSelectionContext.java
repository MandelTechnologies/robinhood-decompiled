package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
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

/* compiled from: MAXTransferAccountSelectionContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext;", "Lcom/squareup/wire/Message;", "", "max_transfer_account_selection_state", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "transfer_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;Lokio/ByteString;)V", "getMax_transfer_account_selection_state", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "getTransfer_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "MAXTransferAccountSelectionState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MAXTransferAccountSelectionContext extends Message {

    @JvmField
    public static final ProtoAdapter<MAXTransferAccountSelectionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState#ADAPTER", jsonName = "maxTransferAccountSelectionState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MAXTransferAccountSelectionState max_transfer_account_selection_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount#ADAPTER", jsonName = "transferAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MAXTransferContext.TransferAccount transfer_account;

    public MAXTransferAccountSelectionContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24358newBuilder();
    }

    public final MAXTransferAccountSelectionState getMax_transfer_account_selection_state() {
        return this.max_transfer_account_selection_state;
    }

    public /* synthetic */ MAXTransferAccountSelectionContext(MAXTransferAccountSelectionState mAXTransferAccountSelectionState, MAXTransferContext.TransferAccount transferAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED : mAXTransferAccountSelectionState, (i & 2) != 0 ? null : transferAccount, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MAXTransferContext.TransferAccount getTransfer_account() {
        return this.transfer_account;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAXTransferAccountSelectionContext(MAXTransferAccountSelectionState max_transfer_account_selection_state, MAXTransferContext.TransferAccount transferAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.max_transfer_account_selection_state = max_transfer_account_selection_state;
        this.transfer_account = transferAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24358newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MAXTransferAccountSelectionContext)) {
            return false;
        }
        MAXTransferAccountSelectionContext mAXTransferAccountSelectionContext = (MAXTransferAccountSelectionContext) other;
        return Intrinsics.areEqual(unknownFields(), mAXTransferAccountSelectionContext.unknownFields()) && this.max_transfer_account_selection_state == mAXTransferAccountSelectionContext.max_transfer_account_selection_state && Intrinsics.areEqual(this.transfer_account, mAXTransferAccountSelectionContext.transfer_account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.max_transfer_account_selection_state.hashCode()) * 37;
        MAXTransferContext.TransferAccount transferAccount = this.transfer_account;
        int iHashCode2 = iHashCode + (transferAccount != null ? transferAccount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("max_transfer_account_selection_state=" + this.max_transfer_account_selection_state);
        MAXTransferContext.TransferAccount transferAccount = this.transfer_account;
        if (transferAccount != null) {
            arrayList.add("transfer_account=" + transferAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MAXTransferAccountSelectionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MAXTransferAccountSelectionContext copy$default(MAXTransferAccountSelectionContext mAXTransferAccountSelectionContext, MAXTransferAccountSelectionState mAXTransferAccountSelectionState, MAXTransferContext.TransferAccount transferAccount, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            mAXTransferAccountSelectionState = mAXTransferAccountSelectionContext.max_transfer_account_selection_state;
        }
        if ((i & 2) != 0) {
            transferAccount = mAXTransferAccountSelectionContext.transfer_account;
        }
        if ((i & 4) != 0) {
            byteString = mAXTransferAccountSelectionContext.unknownFields();
        }
        return mAXTransferAccountSelectionContext.copy(mAXTransferAccountSelectionState, transferAccount, byteString);
    }

    public final MAXTransferAccountSelectionContext copy(MAXTransferAccountSelectionState max_transfer_account_selection_state, MAXTransferContext.TransferAccount transfer_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(max_transfer_account_selection_state, "max_transfer_account_selection_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MAXTransferAccountSelectionContext(max_transfer_account_selection_state, transfer_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MAXTransferAccountSelectionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MAXTransferAccountSelectionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MAXTransferAccountSelectionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMax_transfer_account_selection_state() != MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED) {
                    size += MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.ADAPTER.encodedSizeWithTag(1, value.getMax_transfer_account_selection_state());
                }
                return value.getTransfer_account() != null ? size + MAXTransferContext.TransferAccount.ADAPTER.encodedSizeWithTag(2, value.getTransfer_account()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MAXTransferAccountSelectionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMax_transfer_account_selection_state() != MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED) {
                    MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMax_transfer_account_selection_state());
                }
                if (value.getTransfer_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_account());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MAXTransferAccountSelectionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTransfer_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_account());
                }
                if (value.getMax_transfer_account_selection_state() != MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED) {
                    MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMax_transfer_account_selection_state());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MAXTransferAccountSelectionContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState mAXTransferAccountSelectionStateDecode = MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                MAXTransferContext.TransferAccount transferAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MAXTransferAccountSelectionContext(mAXTransferAccountSelectionStateDecode, transferAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            mAXTransferAccountSelectionStateDecode = MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        transferAccountDecode = MAXTransferContext.TransferAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MAXTransferAccountSelectionContext redact(MAXTransferAccountSelectionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MAXTransferContext.TransferAccount transfer_account = value.getTransfer_account();
                return MAXTransferAccountSelectionContext.copy$default(value, null, transfer_account != null ? MAXTransferContext.TransferAccount.ADAPTER.redact(transfer_account) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferAccountSelectionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED", "SOURCE", "SINK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MAXTransferAccountSelectionState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MAXTransferAccountSelectionState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MAXTransferAccountSelectionState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MAXTransferAccountSelectionState MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
        public static final MAXTransferAccountSelectionState SINK;
        public static final MAXTransferAccountSelectionState SOURCE;
        private final int value;

        private static final /* synthetic */ MAXTransferAccountSelectionState[] $values() {
            return new MAXTransferAccountSelectionState[]{MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED, SOURCE, SINK};
        }

        @JvmStatic
        public static final MAXTransferAccountSelectionState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MAXTransferAccountSelectionState> getEntries() {
            return $ENTRIES;
        }

        private MAXTransferAccountSelectionState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MAXTransferAccountSelectionState mAXTransferAccountSelectionState = new MAXTransferAccountSelectionState("MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED", 0, 0);
            MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED = mAXTransferAccountSelectionState;
            SOURCE = new MAXTransferAccountSelectionState("SOURCE", 1, 1);
            SINK = new MAXTransferAccountSelectionState("SINK", 2, 2);
            MAXTransferAccountSelectionState[] mAXTransferAccountSelectionStateArr$values = $values();
            $VALUES = mAXTransferAccountSelectionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mAXTransferAccountSelectionStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MAXTransferAccountSelectionState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MAXTransferAccountSelectionState>(orCreateKotlinClass, syntax, mAXTransferAccountSelectionState) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState fromValue(int value) {
                    return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MAXTransferAccountSelectionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MAXTransferAccountSelectionState fromValue(int value) {
                if (value == 0) {
                    return MAXTransferAccountSelectionState.MAX_TRANSFER_ACCOUNT_SELECTION_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return MAXTransferAccountSelectionState.SOURCE;
                }
                if (value != 2) {
                    return null;
                }
                return MAXTransferAccountSelectionState.SINK;
            }
        }

        public static MAXTransferAccountSelectionState valueOf(String str) {
            return (MAXTransferAccountSelectionState) Enum.valueOf(MAXTransferAccountSelectionState.class, str);
        }

        public static MAXTransferAccountSelectionState[] values() {
            return (MAXTransferAccountSelectionState[]) $VALUES.clone();
        }
    }
}
