package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

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

/* compiled from: SignMarginAgreementsRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignMarginAgreementsRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "agreement", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/Agreement;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/Agreement;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getAgreement", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/Agreement;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class SignMarginAgreementsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SignMarginAgreementsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.Agreement#ADAPTER", schemaIndex = 1, tag = 2)
    private final Agreement agreement;

    public SignMarginAgreementsRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8998newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ SignMarginAgreementsRequest(String str, Agreement agreement, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : agreement, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Agreement getAgreement() {
        return this.agreement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignMarginAgreementsRequest(String account_number, Agreement agreement, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.agreement = agreement;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8998newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SignMarginAgreementsRequest)) {
            return false;
        }
        SignMarginAgreementsRequest signMarginAgreementsRequest = (SignMarginAgreementsRequest) other;
        return Intrinsics.areEqual(unknownFields(), signMarginAgreementsRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, signMarginAgreementsRequest.account_number) && Intrinsics.areEqual(this.agreement, signMarginAgreementsRequest.agreement);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        Agreement agreement = this.agreement;
        int iHashCode2 = iHashCode + (agreement != null ? agreement.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Agreement agreement = this.agreement;
        if (agreement != null) {
            arrayList.add("agreement=" + agreement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignMarginAgreementsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SignMarginAgreementsRequest copy$default(SignMarginAgreementsRequest signMarginAgreementsRequest, String str, Agreement agreement, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signMarginAgreementsRequest.account_number;
        }
        if ((i & 2) != 0) {
            agreement = signMarginAgreementsRequest.agreement;
        }
        if ((i & 4) != 0) {
            byteString = signMarginAgreementsRequest.unknownFields();
        }
        return signMarginAgreementsRequest.copy(str, agreement, byteString);
    }

    public final SignMarginAgreementsRequest copy(String account_number, Agreement agreement, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SignMarginAgreementsRequest(account_number, agreement, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SignMarginAgreementsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SignMarginAgreementsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.SignMarginAgreementsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SignMarginAgreementsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return size + Agreement.ADAPTER.encodedSizeWithTag(2, value.getAgreement());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SignMarginAgreementsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                Agreement.ADAPTER.encodeWithTag(writer, 2, (int) value.getAgreement());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SignMarginAgreementsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Agreement.ADAPTER.encodeWithTag(writer, 2, (int) value.getAgreement());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SignMarginAgreementsRequest redact(SignMarginAgreementsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Agreement agreement = value.getAgreement();
                return SignMarginAgreementsRequest.copy$default(value, null, agreement != null ? Agreement.ADAPTER.redact(agreement) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SignMarginAgreementsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Agreement agreementDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SignMarginAgreementsRequest(strDecode, agreementDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        agreementDecode = Agreement.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
