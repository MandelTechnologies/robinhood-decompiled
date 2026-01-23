package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
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

/* compiled from: Access.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/Access;", "Lcom/squareup/wire/Message;", "", MatchaQrCodeDuxo6.USER_ID_KEY, "", "gold_status", "", "assignment_signed", "digest_agreement_version", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZZILokio/ByteString;)V", "getUser_id", "()Ljava/lang/String;", "getGold_status", "()Z", "getAssignment_signed", "getDigest_agreement_version", "()I", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Access extends Message {

    @JvmField
    public static final ProtoAdapter<Access> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "assignmentSigned", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean assignment_signed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "digestAgreementVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int digest_agreement_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "goldStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean gold_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_id;

    public Access() {
        this(null, false, false, 0, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22064newBuilder();
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public /* synthetic */ Access(String str, boolean z, boolean z2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getGold_status() {
        return this.gold_status;
    }

    public final boolean getAssignment_signed() {
        return this.assignment_signed;
    }

    public final int getDigest_agreement_version() {
        return this.digest_agreement_version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Access(String user_id, boolean z, boolean z2, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.gold_status = z;
        this.assignment_signed = z2;
        this.digest_agreement_version = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22064newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Access)) {
            return false;
        }
        Access access = (Access) other;
        return Intrinsics.areEqual(unknownFields(), access.unknownFields()) && Intrinsics.areEqual(this.user_id, access.user_id) && this.gold_status == access.gold_status && this.assignment_signed == access.assignment_signed && this.digest_agreement_version == access.digest_agreement_version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.user_id.hashCode()) * 37) + Boolean.hashCode(this.gold_status)) * 37) + Boolean.hashCode(this.assignment_signed)) * 37) + Integer.hashCode(this.digest_agreement_version);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("gold_status=" + this.gold_status);
        arrayList.add("assignment_signed=" + this.assignment_signed);
        arrayList.add("digest_agreement_version=" + this.digest_agreement_version);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Access{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Access copy$default(Access access, String str, boolean z, boolean z2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = access.user_id;
        }
        if ((i2 & 2) != 0) {
            z = access.gold_status;
        }
        if ((i2 & 4) != 0) {
            z2 = access.assignment_signed;
        }
        if ((i2 & 8) != 0) {
            i = access.digest_agreement_version;
        }
        if ((i2 & 16) != 0) {
            byteString = access.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z3 = z2;
        return access.copy(str, z, z3, i, byteString2);
    }

    public final Access copy(String user_id, boolean gold_status, boolean assignment_signed, int digest_agreement_version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Access(user_id, gold_status, assignment_signed, digest_agreement_version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Access.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Access>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.Access$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Access value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (value.getGold_status()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getGold_status()));
                }
                if (value.getAssignment_signed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getAssignment_signed()));
                }
                return value.getDigest_agreement_version() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getDigest_agreement_version())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Access value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
                }
                if (value.getGold_status()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getGold_status()));
                }
                if (value.getAssignment_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAssignment_signed()));
                }
                if (value.getDigest_agreement_version() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDigest_agreement_version()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Access value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDigest_agreement_version() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getDigest_agreement_version()));
                }
                if (value.getAssignment_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAssignment_signed()));
                }
                if (value.getGold_status()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getGold_status()));
                }
                if (Intrinsics.areEqual(value.getUser_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Access redact(Access value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Access.copy$default(value, null, false, false, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Access decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Access(strDecode, zBooleanValue, zBooleanValue2, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
