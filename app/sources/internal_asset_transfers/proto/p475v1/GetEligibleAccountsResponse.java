package internal_asset_transfers.proto.p475v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: GetEligibleAccountsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponse;", "Lcom/squareup/wire/Message;", "", "accounts", "Linternal_asset_transfers/proto/v1/IATAccountList;", "valid_source_to_sink", "", "", "valid_sink_to_source", "unknownFields", "Lokio/ByteString;", "<init>", "(Linternal_asset_transfers/proto/v1/IATAccountList;Ljava/util/Map;Ljava/util/Map;Lokio/ByteString;)V", "getAccounts", "()Linternal_asset_transfers/proto/v1/IATAccountList;", "getValid_source_to_sink", "()Ljava/util/Map;", "getValid_sink_to_source", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetEligibleAccountsResponse extends Message {

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATAccountList#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final IATAccountList accounts;

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATAccountList#ADAPTER", jsonName = "validSinkToSource", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, IATAccountList> valid_sink_to_source;

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATAccountList#ADAPTER", jsonName = "validSourceToSink", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final Map<String, IATAccountList> valid_source_to_sink;

    @JvmField
    public static final ProtoAdapter<GetEligibleAccountsResponse> ADAPTER = new GetEligibleAccountsResponse2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(GetEligibleAccountsResponse.class), Syntax.PROTO_3);

    public GetEligibleAccountsResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28448newBuilder();
    }

    public final IATAccountList getAccounts() {
        return this.accounts;
    }

    public /* synthetic */ GetEligibleAccountsResponse(IATAccountList iATAccountList, Map map, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iATAccountList, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? MapsKt.emptyMap() : map2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEligibleAccountsResponse(IATAccountList iATAccountList, Map<String, IATAccountList> valid_source_to_sink, Map<String, IATAccountList> valid_sink_to_source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(valid_source_to_sink, "valid_source_to_sink");
        Intrinsics.checkNotNullParameter(valid_sink_to_source, "valid_sink_to_source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.accounts = iATAccountList;
        this.valid_source_to_sink = Internal.immutableCopyOf("valid_source_to_sink", valid_source_to_sink);
        this.valid_sink_to_source = Internal.immutableCopyOf("valid_sink_to_source", valid_sink_to_source);
    }

    public final Map<String, IATAccountList> getValid_source_to_sink() {
        return this.valid_source_to_sink;
    }

    public final Map<String, IATAccountList> getValid_sink_to_source() {
        return this.valid_sink_to_source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28448newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetEligibleAccountsResponse)) {
            return false;
        }
        GetEligibleAccountsResponse getEligibleAccountsResponse = (GetEligibleAccountsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getEligibleAccountsResponse.unknownFields()) && Intrinsics.areEqual(this.accounts, getEligibleAccountsResponse.accounts) && Intrinsics.areEqual(this.valid_source_to_sink, getEligibleAccountsResponse.valid_source_to_sink) && Intrinsics.areEqual(this.valid_sink_to_source, getEligibleAccountsResponse.valid_sink_to_source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IATAccountList iATAccountList = this.accounts;
        int iHashCode2 = ((((iHashCode + (iATAccountList != null ? iATAccountList.hashCode() : 0)) * 37) + this.valid_source_to_sink.hashCode()) * 37) + this.valid_sink_to_source.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IATAccountList iATAccountList = this.accounts;
        if (iATAccountList != null) {
            arrayList.add("accounts=" + iATAccountList);
        }
        if (!this.valid_source_to_sink.isEmpty()) {
            arrayList.add("valid_source_to_sink=" + this.valid_source_to_sink);
        }
        if (!this.valid_sink_to_source.isEmpty()) {
            arrayList.add("valid_sink_to_source=" + this.valid_sink_to_source);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEligibleAccountsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetEligibleAccountsResponse copy(IATAccountList accounts2, Map<String, IATAccountList> valid_source_to_sink, Map<String, IATAccountList> valid_sink_to_source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(valid_source_to_sink, "valid_source_to_sink");
        Intrinsics.checkNotNullParameter(valid_sink_to_source, "valid_sink_to_source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetEligibleAccountsResponse(accounts2, valid_source_to_sink, valid_sink_to_source, unknownFields);
    }
}
