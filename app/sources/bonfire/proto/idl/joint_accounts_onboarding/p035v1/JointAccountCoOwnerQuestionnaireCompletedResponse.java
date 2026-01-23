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

/* compiled from: JointAccountCoOwnerQuestionnaireCompletedResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountCoOwnerQuestionnaireCompletedResponse;", "Lcom/squareup/wire/Message;", "", "product_context", "", "account_number", "questionnaire_completed", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getProduct_context", "()Ljava/lang/String;", "getAccount_number", "getQuestionnaire_completed", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class JointAccountCoOwnerQuestionnaireCompletedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<JointAccountCoOwnerQuestionnaireCompletedResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String product_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "questionnaireCompleted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean questionnaire_completed;

    public JointAccountCoOwnerQuestionnaireCompletedResponse() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ JointAccountCoOwnerQuestionnaireCompletedResponse(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8995newBuilder();
    }

    public final String getProduct_context() {
        return this.product_context;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final boolean getQuestionnaire_completed() {
        return this.questionnaire_completed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountCoOwnerQuestionnaireCompletedResponse(String product_context, String account_number, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.product_context = product_context;
        this.account_number = account_number;
        this.questionnaire_completed = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8995newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JointAccountCoOwnerQuestionnaireCompletedResponse)) {
            return false;
        }
        JointAccountCoOwnerQuestionnaireCompletedResponse jointAccountCoOwnerQuestionnaireCompletedResponse = (JointAccountCoOwnerQuestionnaireCompletedResponse) other;
        return Intrinsics.areEqual(unknownFields(), jointAccountCoOwnerQuestionnaireCompletedResponse.unknownFields()) && Intrinsics.areEqual(this.product_context, jointAccountCoOwnerQuestionnaireCompletedResponse.product_context) && Intrinsics.areEqual(this.account_number, jointAccountCoOwnerQuestionnaireCompletedResponse.account_number) && this.questionnaire_completed == jointAccountCoOwnerQuestionnaireCompletedResponse.questionnaire_completed;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.product_context.hashCode()) * 37) + this.account_number.hashCode()) * 37) + Boolean.hashCode(this.questionnaire_completed);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product_context=" + Internal.sanitize(this.product_context));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("questionnaire_completed=" + this.questionnaire_completed);
        return CollectionsKt.joinToString$default(arrayList, ", ", "JointAccountCoOwnerQuestionnaireCompletedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ JointAccountCoOwnerQuestionnaireCompletedResponse copy$default(JointAccountCoOwnerQuestionnaireCompletedResponse jointAccountCoOwnerQuestionnaireCompletedResponse, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountCoOwnerQuestionnaireCompletedResponse.product_context;
        }
        if ((i & 2) != 0) {
            str2 = jointAccountCoOwnerQuestionnaireCompletedResponse.account_number;
        }
        if ((i & 4) != 0) {
            z = jointAccountCoOwnerQuestionnaireCompletedResponse.questionnaire_completed;
        }
        if ((i & 8) != 0) {
            byteString = jointAccountCoOwnerQuestionnaireCompletedResponse.unknownFields();
        }
        return jointAccountCoOwnerQuestionnaireCompletedResponse.copy(str, str2, z, byteString);
    }

    public final JointAccountCoOwnerQuestionnaireCompletedResponse copy(String product_context, String account_number, boolean questionnaire_completed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new JointAccountCoOwnerQuestionnaireCompletedResponse(product_context, account_number, questionnaire_completed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JointAccountCoOwnerQuestionnaireCompletedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<JointAccountCoOwnerQuestionnaireCompletedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.JointAccountCoOwnerQuestionnaireCompletedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(JointAccountCoOwnerQuestionnaireCompletedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getProduct_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getProduct_context());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                return value.getQuestionnaire_completed() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getQuestionnaire_completed())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, JointAccountCoOwnerQuestionnaireCompletedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getProduct_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_context());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getQuestionnaire_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getQuestionnaire_completed()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, JointAccountCoOwnerQuestionnaireCompletedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getQuestionnaire_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getQuestionnaire_completed()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getProduct_context(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_context());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public JointAccountCoOwnerQuestionnaireCompletedResponse redact(JointAccountCoOwnerQuestionnaireCompletedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return JointAccountCoOwnerQuestionnaireCompletedResponse.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public JointAccountCoOwnerQuestionnaireCompletedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new JointAccountCoOwnerQuestionnaireCompletedResponse(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
