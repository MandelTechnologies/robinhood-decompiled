package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
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

/* compiled from: PrepareLinkResponse.kt */
@Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"bff_money_movement/service/v1/PrepareLinkResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/PrepareLinkResponse;", "metadataAdapter", "", "", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: bff_money_movement.service.v1.PrepareLinkResponse$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes16.dex */
public final class PrepareLinkResponse2 extends ProtoAdapter<PrepareLinkResponse> {

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    PrepareLinkResponse2(FieldEncoding fieldEncoding, KClass<PrepareLinkResponse> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/bff_money_movement.service.v1.PrepareLinkResponse", syntax, (Object) null, "bff-money-movement/bff_money_movement/proto/v1/service.proto");
        this.metadataAdapter = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.PrepareLinkResponse$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrepareLinkResponse2.metadataAdapter_delegate$lambda$0();
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
    public int encodedSize(PrepareLinkResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getLink_token(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLink_token());
        }
        if (value.getExpires_at() != null) {
            size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getExpires_at());
        }
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            size += Provider.ADAPTER.encodedSizeWithTag(3, value.getProvider());
        }
        int iEncodedSizeWithTag = size + getMetadataAdapter().encodedSizeWithTag(4, value.getMetadata());
        return !Intrinsics.areEqual(value.getUpdated_account_link_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getUpdated_account_link_id()) : iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, PrepareLinkResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getLink_token(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink_token());
        }
        if (value.getExpires_at() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExpires_at());
        }
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            Provider.ADAPTER.encodeWithTag(writer, 3, (int) value.getProvider());
        }
        getMetadataAdapter().encodeWithTag(writer, 4, (int) value.getMetadata());
        if (!Intrinsics.areEqual(value.getUpdated_account_link_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUpdated_account_link_id());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, PrepareLinkResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!Intrinsics.areEqual(value.getUpdated_account_link_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUpdated_account_link_id());
        }
        getMetadataAdapter().encodeWithTag(writer, 4, (int) value.getMetadata());
        if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
            Provider.ADAPTER.encodeWithTag(writer, 3, (int) value.getProvider());
        }
        if (value.getExpires_at() != null) {
            ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExpires_at());
        }
        if (Intrinsics.areEqual(value.getLink_token(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink_token());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public PrepareLinkResponse decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Provider provider = Provider.PROVIDER_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        Instant instantDecode = null;
        Provider providerDecode = provider;
        String strDecode2 = strDecode;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new PrepareLinkResponse(strDecode2, instantDecode, providerDecode, linkedHashMap, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                instantDecode = ProtoAdapter.INSTANT.decode(reader);
            } else if (iNextTag == 3) {
                try {
                    providerDecode = Provider.ADAPTER.decode(reader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (iNextTag == 4) {
                linkedHashMap.putAll(getMetadataAdapter().decode(reader));
            } else if (iNextTag == 5) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public PrepareLinkResponse redact(PrepareLinkResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Instant expires_at = value.getExpires_at();
        return PrepareLinkResponse.copy$default(value, null, expires_at != null ? ProtoAdapter.INSTANT.redact(expires_at) : null, null, null, null, ByteString.EMPTY, 29, null);
    }
}
