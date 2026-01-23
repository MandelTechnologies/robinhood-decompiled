package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import accio.service.p003v1.Purpose;
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

/* compiled from: PrepareLinkRequest.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"bff_money_movement/service/v1/PrepareLinkRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/PrepareLinkRequest;", "metadataAdapter", "", "", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: bff_money_movement.service.v1.PrepareLinkRequest$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes16.dex */
public final class PrepareLinkRequest2 extends ProtoAdapter<PrepareLinkRequest> {

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    PrepareLinkRequest2(FieldEncoding fieldEncoding, KClass<PrepareLinkRequest> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/bff_money_movement.service.v1.PrepareLinkRequest", syntax, (Object) null, "bff-money-movement/bff_money_movement/proto/v1/service.proto");
        this.metadataAdapter = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.PrepareLinkRequest$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrepareLinkRequest2.metadataAdapter_delegate$lambda$0();
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
    public int encodedSize(PrepareLinkRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            size += Provider.ADAPTER.encodedSizeWithTag(1, value.getProvider());
        }
        int iEncodedSizeWithTag = size + Purpose.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getPurposes()) + getMetadataAdapter().encodedSizeWithTag(3, value.getMetadata());
        if (value.getIs_update_mode()) {
            iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_update_mode()));
        }
        if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getInstitution_id());
        }
        return iEncodedSizeWithTag + PlaidPrepareLinkDetails.ADAPTER.encodedSizeWithTag(50, value.getPlaid_details());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PrepareLinkRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            Provider.ADAPTER.encodeWithTag(writer, 1, (int) value.getProvider());
        }
        Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPurposes());
        getMetadataAdapter().encodeWithTag(writer, 3, (int) value.getMetadata());
        if (value.getIs_update_mode()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_update_mode()));
        }
        if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInstitution_id());
        }
        PlaidPrepareLinkDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PrepareLinkRequest value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        PlaidPrepareLinkDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
        if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInstitution_id());
        }
        if (value.getIs_update_mode()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_update_mode()));
        }
        getMetadataAdapter().encodeWithTag(writer, 3, (int) value.getMetadata());
        Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPurposes());
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            Provider.ADAPTER.encodeWithTag(writer, 1, (int) value.getProvider());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public PrepareLinkRequest decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Provider providerDecode = Provider.PROVIDER_UNSPECIFIED;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        PlaidPrepareLinkDetails plaidPrepareLinkDetailsDecode = null;
        String strDecode = "";
        boolean zBooleanValue = false;
        while (true) {
            Provider provider = providerDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag == -1) {
                    return new PrepareLinkRequest(provider, arrayList, linkedHashMap, zBooleanValue, strDecode, plaidPrepareLinkDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
                if (iNextTag == 1) {
                    try {
                        providerDecode = Provider.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else if (iNextTag == 2) {
                    try {
                        Purpose.ADAPTER.tryDecode(reader, arrayList);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                } else if (iNextTag == 3) {
                    linkedHashMap.putAll(getMetadataAdapter().decode(reader));
                } else if (iNextTag == 5) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iNextTag == 6) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iNextTag == 50) {
                    plaidPrepareLinkDetailsDecode = PlaidPrepareLinkDetails.ADAPTER.decode(reader);
                } else {
                    reader.readUnknownField(iNextTag);
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PrepareLinkRequest redact(PrepareLinkRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PlaidPrepareLinkDetails plaid_details = value.getPlaid_details();
        return PrepareLinkRequest.copy$default(value, null, null, null, false, null, plaid_details != null ? PlaidPrepareLinkDetails.ADAPTER.redact(plaid_details) : null, ByteString.EMPTY, 31, null);
    }
}
