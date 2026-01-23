package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.SUVInfo;
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

/* compiled from: SUVInfo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "Lcom/squareup/wire/Message;", "", "verification_workflow_id", "", "original_status", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "handling_result", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;Lokio/ByteString;)V", "getVerification_workflow_id", "()Ljava/lang/String;", "getOriginal_status", "()Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "getHandling_result", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SUVStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SUVInfo extends Message {

    @JvmField
    public static final ProtoAdapter<SUVInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SUVInfo$SUVStatus#ADAPTER", jsonName = "handlingResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final SUVStatus handling_result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SUVInfo$SUVStatus#ADAPTER", jsonName = "originalStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SUVStatus original_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "verificationWorkflowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String verification_workflow_id;

    public SUVInfo() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24552newBuilder();
    }

    public final String getVerification_workflow_id() {
        return this.verification_workflow_id;
    }

    public /* synthetic */ SUVInfo(String str, SUVStatus sUVStatus, SUVStatus sUVStatus2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SUVStatus.SUV_STATUS_UNSPECIFIED : sUVStatus, (i & 4) != 0 ? SUVStatus.SUV_STATUS_UNSPECIFIED : sUVStatus2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SUVStatus getOriginal_status() {
        return this.original_status;
    }

    public final SUVStatus getHandling_result() {
        return this.handling_result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SUVInfo(String verification_workflow_id, SUVStatus original_status, SUVStatus handling_result, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
        Intrinsics.checkNotNullParameter(original_status, "original_status");
        Intrinsics.checkNotNullParameter(handling_result, "handling_result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.verification_workflow_id = verification_workflow_id;
        this.original_status = original_status;
        this.handling_result = handling_result;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24552newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SUVInfo)) {
            return false;
        }
        SUVInfo sUVInfo = (SUVInfo) other;
        return Intrinsics.areEqual(unknownFields(), sUVInfo.unknownFields()) && Intrinsics.areEqual(this.verification_workflow_id, sUVInfo.verification_workflow_id) && this.original_status == sUVInfo.original_status && this.handling_result == sUVInfo.handling_result;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.verification_workflow_id.hashCode()) * 37) + this.original_status.hashCode()) * 37) + this.handling_result.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("verification_workflow_id=" + Internal.sanitize(this.verification_workflow_id));
        arrayList.add("original_status=" + this.original_status);
        arrayList.add("handling_result=" + this.handling_result);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SUVInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SUVInfo copy$default(SUVInfo sUVInfo, String str, SUVStatus sUVStatus, SUVStatus sUVStatus2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sUVInfo.verification_workflow_id;
        }
        if ((i & 2) != 0) {
            sUVStatus = sUVInfo.original_status;
        }
        if ((i & 4) != 0) {
            sUVStatus2 = sUVInfo.handling_result;
        }
        if ((i & 8) != 0) {
            byteString = sUVInfo.unknownFields();
        }
        return sUVInfo.copy(str, sUVStatus, sUVStatus2, byteString);
    }

    public final SUVInfo copy(String verification_workflow_id, SUVStatus original_status, SUVStatus handling_result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
        Intrinsics.checkNotNullParameter(original_status, "original_status");
        Intrinsics.checkNotNullParameter(handling_result, "handling_result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SUVInfo(verification_workflow_id, original_status, handling_result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SUVInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SUVInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SUVInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SUVInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getVerification_workflow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVerification_workflow_id());
                }
                SUVInfo.SUVStatus original_status = value.getOriginal_status();
                SUVInfo.SUVStatus sUVStatus = SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
                if (original_status != sUVStatus) {
                    size += SUVInfo.SUVStatus.ADAPTER.encodedSizeWithTag(2, value.getOriginal_status());
                }
                return value.getHandling_result() != sUVStatus ? size + SUVInfo.SUVStatus.ADAPTER.encodedSizeWithTag(3, value.getHandling_result()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SUVInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getVerification_workflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVerification_workflow_id());
                }
                SUVInfo.SUVStatus original_status = value.getOriginal_status();
                SUVInfo.SUVStatus sUVStatus = SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
                if (original_status != sUVStatus) {
                    SUVInfo.SUVStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getOriginal_status());
                }
                if (value.getHandling_result() != sUVStatus) {
                    SUVInfo.SUVStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getHandling_result());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SUVInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SUVInfo.SUVStatus handling_result = value.getHandling_result();
                SUVInfo.SUVStatus sUVStatus = SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
                if (handling_result != sUVStatus) {
                    SUVInfo.SUVStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getHandling_result());
                }
                if (value.getOriginal_status() != sUVStatus) {
                    SUVInfo.SUVStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getOriginal_status());
                }
                if (Intrinsics.areEqual(value.getVerification_workflow_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVerification_workflow_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SUVInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SUVInfo.SUVStatus sUVStatusDecode = SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                SUVInfo.SUVStatus sUVStatusDecode2 = sUVStatusDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SUVInfo(strDecode, sUVStatusDecode, sUVStatusDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            sUVStatusDecode = SUVInfo.SUVStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            sUVStatusDecode2 = SUVInfo.SUVStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SUVInfo redact(SUVInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SUVInfo.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SUVInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUV_STATUS_UNSPECIFIED", "APPROVED", "CANCELED", "DENIED", "INTERNAL_PENDING", "USER_PENDING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SUVStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SUVStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SUVStatus> ADAPTER;
        public static final SUVStatus APPROVED;
        public static final SUVStatus CANCELED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SUVStatus DENIED;
        public static final SUVStatus INTERNAL_PENDING;
        public static final SUVStatus SUV_STATUS_UNSPECIFIED;
        public static final SUVStatus USER_PENDING;
        private final int value;

        private static final /* synthetic */ SUVStatus[] $values() {
            return new SUVStatus[]{SUV_STATUS_UNSPECIFIED, APPROVED, CANCELED, DENIED, INTERNAL_PENDING, USER_PENDING};
        }

        @JvmStatic
        public static final SUVStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SUVStatus> getEntries() {
            return $ENTRIES;
        }

        private SUVStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SUVStatus sUVStatus = new SUVStatus("SUV_STATUS_UNSPECIFIED", 0, 0);
            SUV_STATUS_UNSPECIFIED = sUVStatus;
            APPROVED = new SUVStatus("APPROVED", 1, 1);
            CANCELED = new SUVStatus("CANCELED", 2, 2);
            DENIED = new SUVStatus("DENIED", 3, 3);
            INTERNAL_PENDING = new SUVStatus("INTERNAL_PENDING", 4, 4);
            USER_PENDING = new SUVStatus("USER_PENDING", 5, 5);
            SUVStatus[] sUVStatusArr$values = $values();
            $VALUES = sUVStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sUVStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SUVStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SUVStatus>(orCreateKotlinClass, syntax, sUVStatus) { // from class: com.robinhood.rosetta.eventlogging.SUVInfo$SUVStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SUVInfo.SUVStatus fromValue(int value) {
                    return SUVInfo.SUVStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SUVInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SUVStatus fromValue(int value) {
                if (value == 0) {
                    return SUVStatus.SUV_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return SUVStatus.APPROVED;
                }
                if (value == 2) {
                    return SUVStatus.CANCELED;
                }
                if (value == 3) {
                    return SUVStatus.DENIED;
                }
                if (value == 4) {
                    return SUVStatus.INTERNAL_PENDING;
                }
                if (value != 5) {
                    return null;
                }
                return SUVStatus.USER_PENDING;
            }
        }

        public static SUVStatus valueOf(String str) {
            return (SUVStatus) Enum.valueOf(SUVStatus.class, str);
        }

        public static SUVStatus[] values() {
            return (SUVStatus[]) $VALUES.clone();
        }
    }
}
