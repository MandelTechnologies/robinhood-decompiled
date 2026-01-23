package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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
import rosetta.nummus.MonetizationModel;

/* compiled from: AccountPreferenceRetrieveResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006$"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponse;", "Lcom/squareup/wire/Message;", "", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "id", "", "account_id", "created_at", "updated_at", "ineligible_for_monetization", "", "has_ever_enabled_fee_monetization", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/MonetizationModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLokio/ByteString;)V", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getId", "()Ljava/lang/String;", "getAccount_id", "getCreated_at", "getUpdated_at", "getIneligible_for_monetization", "()Z", "getHas_ever_enabled_fee_monetization", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AccountPreferenceRetrieveResponse extends Message {

    @JvmField
    public static final ProtoAdapter<AccountPreferenceRetrieveResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasEverEnabledFeeMonetization", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean has_ever_enabled_fee_monetization;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ineligibleForMonetization", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean ineligible_for_monetization;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MonetizationModel monetization_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String updated_at;

    public AccountPreferenceRetrieveResponse() {
        this(null, null, null, null, null, false, false, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29394newBuilder();
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public /* synthetic */ AccountPreferenceRetrieveResponse(MonetizationModel monetizationModel, String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final boolean getIneligible_for_monetization() {
        return this.ineligible_for_monetization;
    }

    public final boolean getHas_ever_enabled_fee_monetization() {
        return this.has_ever_enabled_fee_monetization;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceRetrieveResponse(MonetizationModel monetization_model, String id, String account_id, String created_at, String updated_at, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.monetization_model = monetization_model;
        this.id = id;
        this.account_id = account_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.ineligible_for_monetization = z;
        this.has_ever_enabled_fee_monetization = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29394newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountPreferenceRetrieveResponse)) {
            return false;
        }
        AccountPreferenceRetrieveResponse accountPreferenceRetrieveResponse = (AccountPreferenceRetrieveResponse) other;
        return Intrinsics.areEqual(unknownFields(), accountPreferenceRetrieveResponse.unknownFields()) && this.monetization_model == accountPreferenceRetrieveResponse.monetization_model && Intrinsics.areEqual(this.id, accountPreferenceRetrieveResponse.id) && Intrinsics.areEqual(this.account_id, accountPreferenceRetrieveResponse.account_id) && Intrinsics.areEqual(this.created_at, accountPreferenceRetrieveResponse.created_at) && Intrinsics.areEqual(this.updated_at, accountPreferenceRetrieveResponse.updated_at) && this.ineligible_for_monetization == accountPreferenceRetrieveResponse.ineligible_for_monetization && this.has_ever_enabled_fee_monetization == accountPreferenceRetrieveResponse.has_ever_enabled_fee_monetization;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.monetization_model.hashCode()) * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + Boolean.hashCode(this.ineligible_for_monetization)) * 37) + Boolean.hashCode(this.has_ever_enabled_fee_monetization);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("monetization_model=" + this.monetization_model);
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("ineligible_for_monetization=" + this.ineligible_for_monetization);
        arrayList.add("has_ever_enabled_fee_monetization=" + this.has_ever_enabled_fee_monetization);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountPreferenceRetrieveResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountPreferenceRetrieveResponse copy$default(AccountPreferenceRetrieveResponse accountPreferenceRetrieveResponse, MonetizationModel monetizationModel, String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            monetizationModel = accountPreferenceRetrieveResponse.monetization_model;
        }
        if ((i & 2) != 0) {
            str = accountPreferenceRetrieveResponse.id;
        }
        if ((i & 4) != 0) {
            str2 = accountPreferenceRetrieveResponse.account_id;
        }
        if ((i & 8) != 0) {
            str3 = accountPreferenceRetrieveResponse.created_at;
        }
        if ((i & 16) != 0) {
            str4 = accountPreferenceRetrieveResponse.updated_at;
        }
        if ((i & 32) != 0) {
            z = accountPreferenceRetrieveResponse.ineligible_for_monetization;
        }
        if ((i & 64) != 0) {
            z2 = accountPreferenceRetrieveResponse.has_ever_enabled_fee_monetization;
        }
        if ((i & 128) != 0) {
            byteString = accountPreferenceRetrieveResponse.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        String str5 = str4;
        boolean z4 = z;
        return accountPreferenceRetrieveResponse.copy(monetizationModel, str, str2, str3, str5, z4, z3, byteString2);
    }

    public final AccountPreferenceRetrieveResponse copy(MonetizationModel monetization_model, String id, String account_id, String created_at, String updated_at, boolean ineligible_for_monetization, boolean has_ever_enabled_fee_monetization, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountPreferenceRetrieveResponse(monetization_model, id, account_id, created_at, updated_at, ineligible_for_monetization, has_ever_enabled_fee_monetization, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountPreferenceRetrieveResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountPreferenceRetrieveResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.AccountPreferenceRetrieveResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountPreferenceRetrieveResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(1, value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getUpdated_at());
                }
                if (value.getIneligible_for_monetization()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                return value.getHas_ever_enabled_fee_monetization() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getHas_ever_enabled_fee_monetization())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountPreferenceRetrieveResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getIneligible_for_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                if (value.getHas_ever_enabled_fee_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHas_ever_enabled_fee_monetization()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountPreferenceRetrieveResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_ever_enabled_fee_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHas_ever_enabled_fee_monetization()));
                }
                if (value.getIneligible_for_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountPreferenceRetrieveResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MonetizationModel monetizationModel = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                MonetizationModel monetizationModelDecode = monetizationModel;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AccountPreferenceRetrieveResponse(monetizationModelDecode, strDecode4, strDecode, strDecode2, strDecode3, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountPreferenceRetrieveResponse redact(AccountPreferenceRetrieveResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AccountPreferenceRetrieveResponse.copy$default(value, null, null, null, null, null, false, false, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
