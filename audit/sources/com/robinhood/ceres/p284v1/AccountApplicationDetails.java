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

/* compiled from: AccountApplicationDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountApplicationDetails;", "Lcom/squareup/wire/Message;", "", "user_uuid", "", "status", "Lcom/robinhood/ceres/v1/ApplicationStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ApplicationStatus;Lokio/ByteString;)V", "getUser_uuid", "()Ljava/lang/String;", "getStatus", "()Lcom/robinhood/ceres/v1/ApplicationStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AccountApplicationDetails extends Message {

    @JvmField
    public static final ProtoAdapter<AccountApplicationDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.ApplicationStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ApplicationStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_uuid;

    public AccountApplicationDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20242newBuilder();
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public /* synthetic */ AccountApplicationDetails(String str, ApplicationStatus applicationStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED : applicationStatus, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ApplicationStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountApplicationDetails(String user_uuid, ApplicationStatus status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_uuid = user_uuid;
        this.status = status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20242newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountApplicationDetails)) {
            return false;
        }
        AccountApplicationDetails accountApplicationDetails = (AccountApplicationDetails) other;
        return Intrinsics.areEqual(unknownFields(), accountApplicationDetails.unknownFields()) && Intrinsics.areEqual(this.user_uuid, accountApplicationDetails.user_uuid) && this.status == accountApplicationDetails.status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.user_uuid.hashCode()) * 37) + this.status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("status=" + this.status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountApplicationDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountApplicationDetails copy$default(AccountApplicationDetails accountApplicationDetails, String str, ApplicationStatus applicationStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountApplicationDetails.user_uuid;
        }
        if ((i & 2) != 0) {
            applicationStatus = accountApplicationDetails.status;
        }
        if ((i & 4) != 0) {
            byteString = accountApplicationDetails.unknownFields();
        }
        return accountApplicationDetails.copy(str, applicationStatus, byteString);
    }

    public final AccountApplicationDetails copy(String user_uuid, ApplicationStatus status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountApplicationDetails(user_uuid, status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountApplicationDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountApplicationDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.AccountApplicationDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountApplicationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_uuid());
                }
                return value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED ? size + ApplicationStatus.ADAPTER.encodedSizeWithTag(2, value.getStatus()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountApplicationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
                }
                if (value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED) {
                    ApplicationStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountApplicationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED) {
                    ApplicationStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountApplicationDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ApplicationStatus applicationStatusDecode = ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountApplicationDetails(strDecode, applicationStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            applicationStatusDecode = ApplicationStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountApplicationDetails redact(AccountApplicationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AccountApplicationDetails.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
