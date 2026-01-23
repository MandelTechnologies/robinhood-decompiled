package common.user_locale.proto.p426v1;

import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: GetUserLocaleResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcommon/user_locale/proto/v1/GetUserLocaleResponse;", "Lcom/squareup/wire/Message;", "", "user_locale", "Lcom/robinhood/rosetta/i18n/Locality;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/i18n/Locality;Lokio/ByteString;)V", "getUser_locale", "()Lcom/robinhood/rosetta/i18n/Locality;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "common.user_locale.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetUserLocaleResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetUserLocaleResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", jsonName = "userLocale", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Locality user_locale;

    /* JADX WARN: Multi-variable type inference failed */
    public GetUserLocaleResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27593newBuilder();
    }

    public final Locality getUser_locale() {
        return this.user_locale;
    }

    public /* synthetic */ GetUserLocaleResponse(Locality locality, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserLocaleResponse(Locality user_locale, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_locale, "user_locale");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_locale = user_locale;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27593newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetUserLocaleResponse)) {
            return false;
        }
        GetUserLocaleResponse getUserLocaleResponse = (GetUserLocaleResponse) other;
        return Intrinsics.areEqual(unknownFields(), getUserLocaleResponse.unknownFields()) && this.user_locale == getUserLocaleResponse.user_locale;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.user_locale.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_locale=" + this.user_locale);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUserLocaleResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetUserLocaleResponse copy$default(GetUserLocaleResponse getUserLocaleResponse, Locality locality, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            locality = getUserLocaleResponse.user_locale;
        }
        if ((i & 2) != 0) {
            byteString = getUserLocaleResponse.unknownFields();
        }
        return getUserLocaleResponse.copy(locality, byteString);
    }

    public final GetUserLocaleResponse copy(Locality user_locale, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_locale, "user_locale");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetUserLocaleResponse(user_locale, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetUserLocaleResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetUserLocaleResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: common.user_locale.proto.v1.GetUserLocaleResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetUserLocaleResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getUser_locale() != Locality.LOCALITY_UNSPECIFIED ? size + Locality.ADAPTER.encodedSizeWithTag(1, value.getUser_locale()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetUserLocaleResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUser_locale() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_locale());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetUserLocaleResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUser_locale() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_locale());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetUserLocaleResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Locality localityDecode = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetUserLocaleResponse(localityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            localityDecode = Locality.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetUserLocaleResponse redact(GetUserLocaleResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetUserLocaleResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
