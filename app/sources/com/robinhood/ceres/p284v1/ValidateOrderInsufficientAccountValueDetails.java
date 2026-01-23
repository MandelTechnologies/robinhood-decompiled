package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: ValidateOrderInsufficientAccountValueDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;", "Lcom/squareup/wire/Message;", "", "total_account_value", "", "total_account_value_threshold", "total_account_value_deficiency", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTotal_account_value", "()Ljava/lang/String;", "getTotal_account_value_threshold", "getTotal_account_value_deficiency", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderInsufficientAccountValueDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderInsufficientAccountValueDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalAccountValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String total_account_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalAccountValueDeficiency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String total_account_value_deficiency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalAccountValueThreshold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String total_account_value_threshold;

    public ValidateOrderInsufficientAccountValueDetails() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ValidateOrderInsufficientAccountValueDetails(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20437newBuilder();
    }

    public final String getTotal_account_value() {
        return this.total_account_value;
    }

    public final String getTotal_account_value_threshold() {
        return this.total_account_value_threshold;
    }

    public final String getTotal_account_value_deficiency() {
        return this.total_account_value_deficiency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderInsufficientAccountValueDetails(String total_account_value, String total_account_value_threshold, String total_account_value_deficiency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
        Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
        Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_account_value = total_account_value;
        this.total_account_value_threshold = total_account_value_threshold;
        this.total_account_value_deficiency = total_account_value_deficiency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20437newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderInsufficientAccountValueDetails)) {
            return false;
        }
        ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails = (ValidateOrderInsufficientAccountValueDetails) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderInsufficientAccountValueDetails.unknownFields()) && Intrinsics.areEqual(this.total_account_value, validateOrderInsufficientAccountValueDetails.total_account_value) && Intrinsics.areEqual(this.total_account_value_threshold, validateOrderInsufficientAccountValueDetails.total_account_value_threshold) && Intrinsics.areEqual(this.total_account_value_deficiency, validateOrderInsufficientAccountValueDetails.total_account_value_deficiency);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.total_account_value.hashCode()) * 37) + this.total_account_value_threshold.hashCode()) * 37) + this.total_account_value_deficiency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_account_value=" + Internal.sanitize(this.total_account_value));
        arrayList.add("total_account_value_threshold=" + Internal.sanitize(this.total_account_value_threshold));
        arrayList.add("total_account_value_deficiency=" + Internal.sanitize(this.total_account_value_deficiency));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderInsufficientAccountValueDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateOrderInsufficientAccountValueDetails copy$default(ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderInsufficientAccountValueDetails.total_account_value;
        }
        if ((i & 2) != 0) {
            str2 = validateOrderInsufficientAccountValueDetails.total_account_value_threshold;
        }
        if ((i & 4) != 0) {
            str3 = validateOrderInsufficientAccountValueDetails.total_account_value_deficiency;
        }
        if ((i & 8) != 0) {
            byteString = validateOrderInsufficientAccountValueDetails.unknownFields();
        }
        return validateOrderInsufficientAccountValueDetails.copy(str, str2, str3, byteString);
    }

    public final ValidateOrderInsufficientAccountValueDetails copy(String total_account_value, String total_account_value_threshold, String total_account_value_deficiency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
        Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
        Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderInsufficientAccountValueDetails(total_account_value, total_account_value_threshold, total_account_value_deficiency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderInsufficientAccountValueDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderInsufficientAccountValueDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ValidateOrderInsufficientAccountValueDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderInsufficientAccountValueDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTotal_account_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTotal_account_value());
                }
                if (!Intrinsics.areEqual(value.getTotal_account_value_threshold(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_account_value_threshold());
                }
                return !Intrinsics.areEqual(value.getTotal_account_value_deficiency(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTotal_account_value_deficiency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderInsufficientAccountValueDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTotal_account_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTotal_account_value());
                }
                if (!Intrinsics.areEqual(value.getTotal_account_value_threshold(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_account_value_threshold());
                }
                if (!Intrinsics.areEqual(value.getTotal_account_value_deficiency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTotal_account_value_deficiency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderInsufficientAccountValueDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTotal_account_value_deficiency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTotal_account_value_deficiency());
                }
                if (!Intrinsics.areEqual(value.getTotal_account_value_threshold(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_account_value_threshold());
                }
                if (Intrinsics.areEqual(value.getTotal_account_value(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTotal_account_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderInsufficientAccountValueDetails redact(ValidateOrderInsufficientAccountValueDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ValidateOrderInsufficientAccountValueDetails.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderInsufficientAccountValueDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateOrderInsufficientAccountValueDetails(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
