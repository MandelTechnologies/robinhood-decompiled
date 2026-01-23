package bff_money_movement.service.p019v1;

import bff_money_movement.service.p019v1.GetTransferEligibilityResponse;
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

/* compiled from: GetTransferEligibilityResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponse;", "Lcom/squareup/wire/Message;", "", "is_eligible", "", "failure_reason", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "localized_message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getFailure_reason", "()Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "getLocalized_message", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "FailureReason", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetTransferEligibilityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransferEligibilityResponse> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.GetTransferEligibilityResponse$FailureReason#ADAPTER", jsonName = "failureReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FailureReason failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_eligible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "localizedMessage", schemaIndex = 2, tag = 3)
    private final String localized_message;

    public GetTransferEligibilityResponse() {
        this(false, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8436newBuilder();
    }

    /* renamed from: is_eligible, reason: from getter */
    public final boolean getIs_eligible() {
        return this.is_eligible;
    }

    public final FailureReason getFailure_reason() {
        return this.failure_reason;
    }

    public /* synthetic */ GetTransferEligibilityResponse(boolean z, FailureReason failureReason, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? FailureReason.FAILURE_REASON_UNSPECIFIED : failureReason, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getLocalized_message() {
        return this.localized_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransferEligibilityResponse(boolean z, FailureReason failure_reason, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_eligible = z;
        this.failure_reason = failure_reason;
        this.localized_message = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8436newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransferEligibilityResponse)) {
            return false;
        }
        GetTransferEligibilityResponse getTransferEligibilityResponse = (GetTransferEligibilityResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTransferEligibilityResponse.unknownFields()) && this.is_eligible == getTransferEligibilityResponse.is_eligible && this.failure_reason == getTransferEligibilityResponse.failure_reason && Intrinsics.areEqual(this.localized_message, getTransferEligibilityResponse.localized_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_eligible)) * 37) + this.failure_reason.hashCode()) * 37;
        String str = this.localized_message;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_eligible=" + this.is_eligible);
        arrayList.add("failure_reason=" + this.failure_reason);
        String str = this.localized_message;
        if (str != null) {
            arrayList.add("localized_message=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransferEligibilityResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTransferEligibilityResponse copy$default(GetTransferEligibilityResponse getTransferEligibilityResponse, boolean z, FailureReason failureReason, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getTransferEligibilityResponse.is_eligible;
        }
        if ((i & 2) != 0) {
            failureReason = getTransferEligibilityResponse.failure_reason;
        }
        if ((i & 4) != 0) {
            str = getTransferEligibilityResponse.localized_message;
        }
        if ((i & 8) != 0) {
            byteString = getTransferEligibilityResponse.unknownFields();
        }
        return getTransferEligibilityResponse.copy(z, failureReason, str, byteString);
    }

    public final GetTransferEligibilityResponse copy(boolean is_eligible, FailureReason failure_reason, String localized_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransferEligibilityResponse(is_eligible, failure_reason, localized_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransferEligibilityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransferEligibilityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetTransferEligibilityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransferEligibilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_eligible()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getFailure_reason() != GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED) {
                    size += GetTransferEligibilityResponse.FailureReason.ADAPTER.encodedSizeWithTag(2, value.getFailure_reason());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLocalized_message());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransferEligibilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getFailure_reason() != GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED) {
                    GetTransferEligibilityResponse.FailureReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLocalized_message());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransferEligibilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLocalized_message());
                if (value.getFailure_reason() != GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED) {
                    GetTransferEligibilityResponse.FailureReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                }
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_eligible()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferEligibilityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GetTransferEligibilityResponse.FailureReason failureReasonDecode = GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTransferEligibilityResponse(zBooleanValue, failureReasonDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        try {
                            failureReasonDecode = GetTransferEligibilityResponse.FailureReason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferEligibilityResponse redact(GetTransferEligibilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetTransferEligibilityResponse.copy$default(value, false, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetTransferEligibilityResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FAILURE_REASON_UNSPECIFIED", "OTHER", "EXCEEDS_DAILY_AMOUNT_LIMIT", "EXCEEDS_DAILY_COUNT_LIMIT", "BANK_SPECIFIC", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class FailureReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FailureReason> ADAPTER;
        public static final FailureReason BANK_SPECIFIC;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FailureReason EXCEEDS_DAILY_AMOUNT_LIMIT;
        public static final FailureReason EXCEEDS_DAILY_COUNT_LIMIT;
        public static final FailureReason FAILURE_REASON_UNSPECIFIED;
        public static final FailureReason OTHER;
        private final int value;

        private static final /* synthetic */ FailureReason[] $values() {
            return new FailureReason[]{FAILURE_REASON_UNSPECIFIED, OTHER, EXCEEDS_DAILY_AMOUNT_LIMIT, EXCEEDS_DAILY_COUNT_LIMIT, BANK_SPECIFIC};
        }

        @JvmStatic
        public static final FailureReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FailureReason> getEntries() {
            return $ENTRIES;
        }

        private FailureReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FailureReason failureReason = new FailureReason("FAILURE_REASON_UNSPECIFIED", 0, 0);
            FAILURE_REASON_UNSPECIFIED = failureReason;
            OTHER = new FailureReason("OTHER", 1, 1);
            EXCEEDS_DAILY_AMOUNT_LIMIT = new FailureReason("EXCEEDS_DAILY_AMOUNT_LIMIT", 2, 2);
            EXCEEDS_DAILY_COUNT_LIMIT = new FailureReason("EXCEEDS_DAILY_COUNT_LIMIT", 3, 3);
            BANK_SPECIFIC = new FailureReason("BANK_SPECIFIC", 4, 4);
            FailureReason[] failureReasonArr$values = $values();
            $VALUES = failureReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FailureReason>(orCreateKotlinClass, syntax, failureReason) { // from class: bff_money_movement.service.v1.GetTransferEligibilityResponse$FailureReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GetTransferEligibilityResponse.FailureReason fromValue(int value) {
                    return GetTransferEligibilityResponse.FailureReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GetTransferEligibilityResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FailureReason fromValue(int value) {
                if (value == 0) {
                    return FailureReason.FAILURE_REASON_UNSPECIFIED;
                }
                if (value == 1) {
                    return FailureReason.OTHER;
                }
                if (value == 2) {
                    return FailureReason.EXCEEDS_DAILY_AMOUNT_LIMIT;
                }
                if (value == 3) {
                    return FailureReason.EXCEEDS_DAILY_COUNT_LIMIT;
                }
                if (value != 4) {
                    return null;
                }
                return FailureReason.BANK_SPECIFIC;
            }
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }
}
