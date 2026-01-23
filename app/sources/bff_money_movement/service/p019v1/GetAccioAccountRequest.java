package bff_money_movement.service.p019v1;

import accio.service.p003v1.ListAccountsSetting;
import accio.service.p003v1.Provider;
import accio.service.p003v1.Purpose;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetAccioAccountRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lbff_money_movement/service/v1/GetAccioAccountRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "provider", "Laccio/service/v1/Provider;", "purpose", "Laccio/service/v1/Purpose;", "settings", "", "Laccio/service/v1/ListAccountsSetting;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Laccio/service/v1/Provider;Laccio/service/v1/Purpose;Ljava/util/List;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getProvider", "()Laccio/service/v1/Provider;", "getPurpose", "()Laccio/service/v1/Purpose;", "getSettings", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccioAccountRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccioAccountRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Provider provider;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Purpose purpose;

    @WireField(adapter = "accio.service.v1.ListAccountsSetting#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<ListAccountsSetting> settings;

    public GetAccioAccountRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8414newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetAccioAccountRequest(String str, Provider provider, Purpose purpose, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 4) != 0 ? Purpose.PURPOSE_UNSPECIFIED : purpose, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final Purpose getPurpose() {
        return this.purpose;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccioAccountRequest(String account_id, Provider provider, Purpose purpose, List<? extends ListAccountsSetting> settings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.provider = provider;
        this.purpose = purpose;
        this.settings = Internal.immutableCopyOf("settings", settings);
    }

    public final List<ListAccountsSetting> getSettings() {
        return this.settings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8414newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccioAccountRequest)) {
            return false;
        }
        GetAccioAccountRequest getAccioAccountRequest = (GetAccioAccountRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAccioAccountRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getAccioAccountRequest.account_id) && this.provider == getAccioAccountRequest.provider && this.purpose == getAccioAccountRequest.purpose && Intrinsics.areEqual(this.settings, getAccioAccountRequest.settings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.provider.hashCode()) * 37) + this.purpose.hashCode()) * 37) + this.settings.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("provider=" + this.provider);
        arrayList.add("purpose=" + this.purpose);
        if (!this.settings.isEmpty()) {
            arrayList.add("settings=" + this.settings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccioAccountRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccioAccountRequest copy$default(GetAccioAccountRequest getAccioAccountRequest, String str, Provider provider, Purpose purpose, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccioAccountRequest.account_id;
        }
        if ((i & 2) != 0) {
            provider = getAccioAccountRequest.provider;
        }
        if ((i & 4) != 0) {
            purpose = getAccioAccountRequest.purpose;
        }
        if ((i & 8) != 0) {
            list = getAccioAccountRequest.settings;
        }
        if ((i & 16) != 0) {
            byteString = getAccioAccountRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Purpose purpose2 = purpose;
        return getAccioAccountRequest.copy(str, provider, purpose2, list, byteString2);
    }

    public final GetAccioAccountRequest copy(String account_id, Provider provider, Purpose purpose, List<? extends ListAccountsSetting> settings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccioAccountRequest(account_id, provider, purpose, settings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccioAccountRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccioAccountRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetAccioAccountRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccioAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    size += Provider.ADAPTER.encodedSizeWithTag(2, value.getProvider());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    size += Purpose.ADAPTER.encodedSizeWithTag(3, value.getPurpose());
                }
                return size + ListAccountsSetting.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSettings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccioAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 3, (int) value.getPurpose());
                }
                ListAccountsSetting.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSettings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccioAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ListAccountsSetting.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSettings());
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 3, (int) value.getPurpose());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccioAccountRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Provider providerDecode = Provider.PROVIDER_UNSPECIFIED;
                Purpose purpose = Purpose.PURPOSE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Purpose purposeDecode = purpose;
                while (true) {
                    Provider provider = providerDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetAccioAccountRequest(strDecode, provider, purposeDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                providerDecode = Provider.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                purposeDecode = Purpose.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                ListAccountsSetting.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccioAccountRequest redact(GetAccioAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccioAccountRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
