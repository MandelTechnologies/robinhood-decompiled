package accio.service.p003v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: LinkedAccount.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"accio/service/v1/LinkedAccount$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Laccio/service/v1/LinkedAccount;", "metadataAdapter", "", "", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: accio.service.v1.LinkedAccount$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes23.dex */
public final class LinkedAccount2 extends ProtoAdapter<LinkedAccount> {

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    LinkedAccount2(FieldEncoding fieldEncoding, KClass<LinkedAccount> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/accio.service.v1.LinkedAccount", syntax, (Object) null, "accio/accio/proto/v1/service.proto");
        this.metadataAdapter = LazyKt.lazy(new Function0() { // from class: accio.service.v1.LinkedAccount$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkedAccount2.metadataAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getMetadataAdapter() {
        return (ProtoAdapter) this.metadataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(LinkedAccount value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
        }
        int iEncodedSizeWithTag = size + getMetadataAdapter().encodedSizeWithTag(2, value.getMetadata());
        if (!Intrinsics.areEqual(value.getName(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
        }
        if (!Intrinsics.areEqual(value.getOfficial_name(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOfficial_name());
        }
        if (value.getType() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
            iEncodedSizeWithTag += AccountType.ADAPTER.encodedSizeWithTag(5, value.getType());
        }
        if (value.getSubtype() != AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED) {
            iEncodedSizeWithTag += AccountSubtype.ADAPTER.encodedSizeWithTag(6, value.getSubtype());
        }
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + PlaidAccountDetails.ADAPTER.encodedSizeWithTag(7, value.getPlaid_account_details()) + Purpose.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getPurposes());
        if (value.getState() != AccountState.ACCOUNT_STATE_UNSPECIFIED) {
            iEncodedSizeWithTag2 += AccountState.ADAPTER.encodedSizeWithTag(9, value.getState());
        }
        if (!Intrinsics.areEqual(value.getId(), "")) {
            iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getId());
        }
        if (value.getSource_entity() != Entity.ENTITY_UNSPECIFIED) {
            iEncodedSizeWithTag2 += Entity.ADAPTER.encodedSizeWithTag(11, value.getSource_entity());
        }
        if (value.getLookback_start_time() != null) {
            iEncodedSizeWithTag2 += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getLookback_start_time());
        }
        if (value.getLast_updated_at_time() != null) {
            iEncodedSizeWithTag2 += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getLast_updated_at_time());
        }
        return !Intrinsics.areEqual(value.getEarliest_balance(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getEarliest_balance()) : iEncodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, LinkedAccount value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
        }
        getMetadataAdapter().encodeWithTag(writer, 2, (int) value.getMetadata());
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
        }
        if (!Intrinsics.areEqual(value.getOfficial_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOfficial_name());
        }
        if (value.getType() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
            AccountType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
        }
        if (value.getSubtype() != AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED) {
            AccountSubtype.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubtype());
        }
        Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getPurposes());
        if (value.getState() != AccountState.ACCOUNT_STATE_UNSPECIFIED) {
            AccountState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        if (!Intrinsics.areEqual(value.getId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getId());
        }
        if (value.getSource_entity() != Entity.ENTITY_UNSPECIFIED) {
            Entity.ADAPTER.encodeWithTag(writer, 11, (int) value.getSource_entity());
        }
        if (value.getLookback_start_time() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getLookback_start_time());
        }
        if (value.getLast_updated_at_time() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getLast_updated_at_time());
        }
        if (!Intrinsics.areEqual(value.getEarliest_balance(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getEarliest_balance());
        }
        PlaidAccountDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getPlaid_account_details());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, LinkedAccount value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        PlaidAccountDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getPlaid_account_details());
        if (!Intrinsics.areEqual(value.getEarliest_balance(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getEarliest_balance());
        }
        if (value.getLast_updated_at_time() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getLast_updated_at_time());
        }
        if (value.getLookback_start_time() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getLookback_start_time());
        }
        if (value.getSource_entity() != Entity.ENTITY_UNSPECIFIED) {
            Entity.ADAPTER.encodeWithTag(writer, 11, (int) value.getSource_entity());
        }
        if (!Intrinsics.areEqual(value.getId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getId());
        }
        if (value.getState() != AccountState.ACCOUNT_STATE_UNSPECIFIED) {
            AccountState.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
        }
        Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getPurposes());
        if (value.getSubtype() != AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED) {
            AccountSubtype.ADAPTER.encodeWithTag(writer, 6, (int) value.getSubtype());
        }
        if (value.getType() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
            AccountType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
        }
        if (!Intrinsics.areEqual(value.getOfficial_name(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOfficial_name());
        }
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
        }
        getMetadataAdapter().encodeWithTag(writer, 2, (int) value.getMetadata());
        if (Intrinsics.areEqual(value.getAccount_id(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public LinkedAccount decode(ProtoReader reader) throws IOException {
        AccountSubtype accountSubtype;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
        AccountSubtype accountSubtype2 = AccountSubtype.ACCOUNT_SUBTYPE_UNSPECIFIED;
        ArrayList arrayList = new ArrayList();
        AccountState accountState = AccountState.ACCOUNT_STATE_UNSPECIFIED;
        Entity entity = Entity.ENTITY_UNSPECIFIED;
        long jBeginMessage = reader.beginMessage();
        AccountType accountTypeDecode = accountType;
        String strDecode = "";
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        PlaidAccountDetails plaidAccountDetailsDecode = null;
        Instant instantDecode = null;
        Instant instantDecode2 = null;
        Entity entityDecode = entity;
        String strDecode5 = strDecode4;
        AccountState accountStateDecode = accountState;
        AccountSubtype accountSubtypeDecode = accountSubtype2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag != -1) {
                switch (iNextTag) {
                    case 1:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        linkedHashMap.putAll(getMetadataAdapter().decode(reader));
                        accountSubtypeDecode = accountSubtype;
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                    case 3:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        try {
                            accountTypeDecode = AccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                        accountSubtypeDecode = accountSubtype;
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                    case 6:
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        try {
                            accountSubtypeDecode = AccountSubtype.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                    case 7:
                        plaidAccountDetailsDecode = PlaidAccountDetails.ADAPTER.decode(reader);
                        break;
                    case 8:
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        try {
                            Purpose.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                        accountSubtypeDecode = accountSubtype;
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                    case 9:
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        try {
                            accountStateDecode = AccountState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        }
                        accountSubtypeDecode = accountSubtype;
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                    case 10:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 11:
                        try {
                            entityDecode = Entity.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                            accountSubtype = accountSubtypeDecode;
                            str = strDecode5;
                            str2 = strDecode;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            break;
                        }
                    case 12:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 13:
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 14:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.readUnknownField(iNextTag);
                        accountSubtype = accountSubtypeDecode;
                        str = strDecode5;
                        str2 = strDecode;
                        accountSubtypeDecode = accountSubtype;
                        strDecode5 = str;
                        strDecode = str2;
                        break;
                }
            } else {
                return new LinkedAccount(strDecode5, linkedHashMap, strDecode, strDecode2, accountTypeDecode, accountSubtypeDecode, plaidAccountDetailsDecode, arrayList, accountStateDecode, strDecode3, entityDecode, instantDecode, instantDecode2, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public LinkedAccount redact(LinkedAccount value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PlaidAccountDetails plaid_account_details = value.getPlaid_account_details();
        PlaidAccountDetails plaidAccountDetailsRedact = plaid_account_details != null ? PlaidAccountDetails.ADAPTER.redact(plaid_account_details) : null;
        Instant lookback_start_time = value.getLookback_start_time();
        Instant instantRedact = lookback_start_time != null ? ProtoAdapter.INSTANT.redact(lookback_start_time) : null;
        Instant last_updated_at_time = value.getLast_updated_at_time();
        return value.copy((10175 & 1) != 0 ? value.account_id : null, (10175 & 2) != 0 ? value.metadata : null, (10175 & 4) != 0 ? value.name : null, (10175 & 8) != 0 ? value.official_name : null, (10175 & 16) != 0 ? value.type : null, (10175 & 32) != 0 ? value.subtype : null, (10175 & 64) != 0 ? value.plaid_account_details : plaidAccountDetailsRedact, (10175 & 128) != 0 ? value.purposes : null, (10175 & 256) != 0 ? value.state : null, (10175 & 512) != 0 ? value.id : null, (10175 & 1024) != 0 ? value.source_entity : null, (10175 & 2048) != 0 ? value.lookback_start_time : instantRedact, (10175 & 4096) != 0 ? value.last_updated_at_time : last_updated_at_time != null ? ProtoAdapter.INSTANT.redact(last_updated_at_time) : null, (10175 & 8192) != 0 ? value.earliest_balance : null, (10175 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
