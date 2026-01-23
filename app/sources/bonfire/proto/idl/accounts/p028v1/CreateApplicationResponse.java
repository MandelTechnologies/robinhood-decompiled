package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: CreateApplicationResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationResponse;", "Lcom/squareup/wire/Message;", "", "application_id", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/BrokerageAccountType;", "management_type", "Lrosetta/account/ManagementType;", "nickname", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Ljava/lang/String;Lokio/ByteString;)V", "getApplication_id", "()Ljava/lang/String;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "getNickname", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateApplicationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateApplicationResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String application_id;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String nickname;

    public CreateApplicationResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8722newBuilder();
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    public /* synthetic */ CreateApplicationResponse(String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 4) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final String getNickname() {
        return this.nickname;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateApplicationResponse(String application_id, BrokerageAccountType brokerage_account_type, ManagementType management_type, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.application_id = application_id;
        this.brokerage_account_type = brokerage_account_type;
        this.management_type = management_type;
        this.nickname = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8722newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateApplicationResponse)) {
            return false;
        }
        CreateApplicationResponse createApplicationResponse = (CreateApplicationResponse) other;
        return Intrinsics.areEqual(unknownFields(), createApplicationResponse.unknownFields()) && Intrinsics.areEqual(this.application_id, createApplicationResponse.application_id) && this.brokerage_account_type == createApplicationResponse.brokerage_account_type && this.management_type == createApplicationResponse.management_type && Intrinsics.areEqual(this.nickname, createApplicationResponse.nickname);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.application_id.hashCode()) * 37) + this.brokerage_account_type.hashCode()) * 37) + this.management_type.hashCode()) * 37;
        String str = this.nickname;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("application_id=" + Internal.sanitize(this.application_id));
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        arrayList.add("management_type=" + this.management_type);
        String str = this.nickname;
        if (str != null) {
            arrayList.add("nickname=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateApplicationResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateApplicationResponse copy$default(CreateApplicationResponse createApplicationResponse, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createApplicationResponse.application_id;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = createApplicationResponse.brokerage_account_type;
        }
        if ((i & 4) != 0) {
            managementType = createApplicationResponse.management_type;
        }
        if ((i & 8) != 0) {
            str2 = createApplicationResponse.nickname;
        }
        if ((i & 16) != 0) {
            byteString = createApplicationResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        ManagementType managementType2 = managementType;
        return createApplicationResponse.copy(str, brokerageAccountType, managementType2, str2, byteString2);
    }

    public final CreateApplicationResponse copy(String application_id, BrokerageAccountType brokerage_account_type, ManagementType management_type, String nickname, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateApplicationResponse(application_id, brokerage_account_type, management_type, nickname, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateApplicationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateApplicationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.CreateApplicationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateApplicationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getApplication_id());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(2, value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(3, value.getManagement_type());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNickname());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateApplicationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getApplication_id());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNickname());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateApplicationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getNickname());
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (Intrinsics.areEqual(value.getApplication_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getApplication_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateApplicationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountTypeDecode = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                ManagementType managementTypeDecode = managementType;
                while (true) {
                    BrokerageAccountType brokerageAccountType = brokerageAccountTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CreateApplicationResponse(strDecode2, brokerageAccountType, managementTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateApplicationResponse redact(CreateApplicationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateApplicationResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
