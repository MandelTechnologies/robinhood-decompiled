package internal_asset_transfers.proto.p475v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
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

/* compiled from: GetEligibleAccountsResponse.kt */
@Metadata(m3635d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR-\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u001a"}, m3636d2 = {"internal_asset_transfers/proto/v1/GetEligibleAccountsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponse;", "valid_source_to_sinkAdapter", "", "", "Linternal_asset_transfers/proto/v1/IATAccountList;", "getValid_source_to_sinkAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "valid_source_to_sinkAdapter$delegate", "Lkotlin/Lazy;", "valid_sink_to_sourceAdapter", "getValid_sink_to_sourceAdapter", "valid_sink_to_sourceAdapter$delegate", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: internal_asset_transfers.proto.v1.GetEligibleAccountsResponse$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class GetEligibleAccountsResponse2 extends ProtoAdapter<GetEligibleAccountsResponse> {

    /* renamed from: valid_sink_to_sourceAdapter$delegate, reason: from kotlin metadata */
    private final Lazy valid_sink_to_sourceAdapter;

    /* renamed from: valid_source_to_sinkAdapter$delegate, reason: from kotlin metadata */
    private final Lazy valid_source_to_sinkAdapter;

    GetEligibleAccountsResponse2(FieldEncoding fieldEncoding, KClass<GetEligibleAccountsResponse> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/internal_asset_transfers.proto.v1.GetEligibleAccountsResponse", syntax, (Object) null, "microgram/contracts/internal_asset_transfers/proto/v1/eligible_accounts.proto");
        this.valid_source_to_sinkAdapter = LazyKt.lazy(new Function0() { // from class: internal_asset_transfers.proto.v1.GetEligibleAccountsResponse$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetEligibleAccountsResponse2.valid_source_to_sinkAdapter_delegate$lambda$0();
            }
        });
        this.valid_sink_to_sourceAdapter = LazyKt.lazy(new Function0() { // from class: internal_asset_transfers.proto.v1.GetEligibleAccountsResponse$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetEligibleAccountsResponse2.valid_sink_to_sourceAdapter_delegate$lambda$1();
            }
        });
    }

    private final ProtoAdapter<Map<String, IATAccountList>> getValid_source_to_sinkAdapter() {
        return (ProtoAdapter) this.valid_source_to_sinkAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter valid_source_to_sinkAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, IATAccountList.ADAPTER);
    }

    private final ProtoAdapter<Map<String, IATAccountList>> getValid_sink_to_sourceAdapter() {
        return (ProtoAdapter) this.valid_sink_to_sourceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter valid_sink_to_sourceAdapter_delegate$lambda$1() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, IATAccountList.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(GetEligibleAccountsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getAccounts() != null) {
            size += IATAccountList.ADAPTER.encodedSizeWithTag(1, value.getAccounts());
        }
        return size + getValid_source_to_sinkAdapter().encodedSizeWithTag(2, value.getValid_source_to_sink()) + getValid_sink_to_sourceAdapter().encodedSizeWithTag(3, value.getValid_sink_to_source());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, GetEligibleAccountsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getAccounts() != null) {
            IATAccountList.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccounts());
        }
        getValid_source_to_sinkAdapter().encodeWithTag(writer, 2, (int) value.getValid_source_to_sink());
        getValid_sink_to_sourceAdapter().encodeWithTag(writer, 3, (int) value.getValid_sink_to_source());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, GetEligibleAccountsResponse value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getValid_sink_to_sourceAdapter().encodeWithTag(writer, 3, (int) value.getValid_sink_to_source());
        getValid_source_to_sinkAdapter().encodeWithTag(writer, 2, (int) value.getValid_source_to_sink());
        if (value.getAccounts() != null) {
            IATAccountList.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccounts());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public GetEligibleAccountsResponse decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        IATAccountList iATAccountListDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new GetEligibleAccountsResponse(iATAccountListDecode, linkedHashMap, linkedHashMap2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                iATAccountListDecode = IATAccountList.ADAPTER.decode(reader);
            } else if (iNextTag == 2) {
                linkedHashMap.putAll(getValid_source_to_sinkAdapter().decode(reader));
            } else if (iNextTag == 3) {
                linkedHashMap2.putAll(getValid_sink_to_sourceAdapter().decode(reader));
            } else {
                reader.readUnknownField(iNextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public GetEligibleAccountsResponse redact(GetEligibleAccountsResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        IATAccountList accounts2 = value.getAccounts();
        IATAccountList iATAccountListRedact = accounts2 != null ? IATAccountList.ADAPTER.redact(accounts2) : null;
        Map<String, IATAccountList> valid_source_to_sink = value.getValid_source_to_sink();
        ProtoAdapter<IATAccountList> protoAdapter = IATAccountList.ADAPTER;
        return value.copy(iATAccountListRedact, Internal.m26824redactElements(valid_source_to_sink, protoAdapter), Internal.m26824redactElements(value.getValid_sink_to_source(), protoAdapter), ByteString.EMPTY);
    }
}
