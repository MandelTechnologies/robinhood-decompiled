package com.robinhood.rosetta.eventlogging;

import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: LocalAuthInfo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\bH\u0016JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "Lcom/squareup/wire/Message;", "", "succeeded", "", ErrorResponse.ERROR_CODE, "", "error_domain", "", "error_description", "succeeded_result", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getSucceeded$annotations", "()V", "getSucceeded", "()Z", "getError_code", "()I", "getError_domain", "()Ljava/lang/String;", "getError_description", "getSucceeded_result", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LocalAuthInfo extends Message {

    @JvmField
    public static final ProtoAdapter<LocalAuthInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String error_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorDomain", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String error_domain;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean succeeded;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "succeededResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Boolean succeeded_result;

    public LocalAuthInfo() {
        this(false, 0, null, null, null, null, 63, null);
    }

    @Deprecated
    public static /* synthetic */ void getSucceeded$annotations() {
    }

    public /* synthetic */ LocalAuthInfo(boolean z, int i, String str, String str2, Boolean r6, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r6, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24352newBuilder();
    }

    public final boolean getSucceeded() {
        return this.succeeded;
    }

    public final int getError_code() {
        return this.error_code;
    }

    public final String getError_domain() {
        return this.error_domain;
    }

    public final String getError_description() {
        return this.error_description;
    }

    public final Boolean getSucceeded_result() {
        return this.succeeded_result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAuthInfo(boolean z, int i, String error_domain, String error_description, Boolean succeeded_result, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_domain, "error_domain");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.succeeded = z;
        this.error_code = i;
        this.error_domain = error_domain;
        this.error_description = error_description;
        this.succeeded_result = succeeded_result;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24352newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LocalAuthInfo)) {
            return false;
        }
        LocalAuthInfo localAuthInfo = (LocalAuthInfo) other;
        return Intrinsics.areEqual(unknownFields(), localAuthInfo.unknownFields()) && this.succeeded == localAuthInfo.succeeded && this.error_code == localAuthInfo.error_code && Intrinsics.areEqual(this.error_domain, localAuthInfo.error_domain) && Intrinsics.areEqual(this.error_description, localAuthInfo.error_description) && this.succeeded_result == localAuthInfo.succeeded_result;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.succeeded)) * 37) + Integer.hashCode(this.error_code)) * 37) + this.error_domain.hashCode()) * 37) + this.error_description.hashCode()) * 37) + this.succeeded_result.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("succeeded=" + this.succeeded);
        arrayList.add("error_code=" + this.error_code);
        arrayList.add("error_domain=" + Internal.sanitize(this.error_domain));
        arrayList.add("error_description=" + Internal.sanitize(this.error_description));
        arrayList.add("succeeded_result=" + this.succeeded_result);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalAuthInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LocalAuthInfo copy$default(LocalAuthInfo localAuthInfo, boolean z, int i, String str, String str2, Boolean r5, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = localAuthInfo.succeeded;
        }
        if ((i2 & 2) != 0) {
            i = localAuthInfo.error_code;
        }
        if ((i2 & 4) != 0) {
            str = localAuthInfo.error_domain;
        }
        if ((i2 & 8) != 0) {
            str2 = localAuthInfo.error_description;
        }
        if ((i2 & 16) != 0) {
            r5 = localAuthInfo.succeeded_result;
        }
        if ((i2 & 32) != 0) {
            byteString = localAuthInfo.unknownFields();
        }
        Boolean r7 = r5;
        ByteString byteString2 = byteString;
        return localAuthInfo.copy(z, i, str, str2, r7, byteString2);
    }

    public final LocalAuthInfo copy(boolean succeeded, int error_code, String error_domain, String error_description, Boolean succeeded_result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_domain, "error_domain");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LocalAuthInfo(succeeded, error_code, error_domain, error_description, succeeded_result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LocalAuthInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LocalAuthInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LocalAuthInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalAuthInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSucceeded()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getSucceeded()));
                }
                if (value.getError_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getError_code()));
                }
                if (!Intrinsics.areEqual(value.getError_domain(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError_domain());
                }
                if (!Intrinsics.areEqual(value.getError_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError_description());
                }
                return value.getSucceeded_result() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(5, value.getSucceeded_result()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalAuthInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSucceeded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSucceeded()));
                }
                if (value.getError_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getError_code()));
                }
                if (!Intrinsics.areEqual(value.getError_domain(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_domain());
                }
                if (!Intrinsics.areEqual(value.getError_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_description());
                }
                if (value.getSucceeded_result() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getSucceeded_result());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalAuthInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSucceeded_result() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getSucceeded_result());
                }
                if (!Intrinsics.areEqual(value.getError_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_description());
                }
                if (!Intrinsics.areEqual(value.getError_domain(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_domain());
                }
                if (value.getError_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getError_code()));
                }
                if (value.getSucceeded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSucceeded()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LocalAuthInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    Boolean r3 = booleanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LocalAuthInfo(zBooleanValue, iIntValue, strDecode, strDecode2, r3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalAuthInfo redact(LocalAuthInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LocalAuthInfo.copy$default(value, false, 0, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
