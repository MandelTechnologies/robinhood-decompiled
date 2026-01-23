package account_aggregation.service.p005v1;

import account_aggregation.service.models.p004v1.AccountSwitcherLocation;
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

/* compiled from: GetAccountSwitcherRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherRequest;", "Lcom/squareup/wire/Message;", "", "asset_id", "", "location", "Laccount_aggregation/service/models/v1/AccountSwitcherLocation;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocation;Lokio/ByteString;)V", "getAsset_id", "()Ljava/lang/String;", "getLocation", "()Laccount_aggregation/service/models/v1/AccountSwitcherLocation;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetAccountSwitcherRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountSwitcherRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", schemaIndex = 0, tag = 1)
    private final String asset_id;

    @WireField(adapter = "account_aggregation.service.models.v1.AccountSwitcherLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountSwitcherLocation location;

    public GetAccountSwitcherRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4339newBuilder();
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    public /* synthetic */ GetAccountSwitcherRequest(String str, AccountSwitcherLocation accountSwitcherLocation, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AccountSwitcherLocation.ASL_UNSPECIFIED : accountSwitcherLocation, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSwitcherRequest(String str, AccountSwitcherLocation location, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_id = str;
        this.location = location;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4339newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountSwitcherRequest)) {
            return false;
        }
        GetAccountSwitcherRequest getAccountSwitcherRequest = (GetAccountSwitcherRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAccountSwitcherRequest.unknownFields()) && Intrinsics.areEqual(this.asset_id, getAccountSwitcherRequest.asset_id) && this.location == getAccountSwitcherRequest.location;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.asset_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.location.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_id;
        if (str != null) {
            arrayList.add("asset_id=" + Internal.sanitize(str));
        }
        arrayList.add("location=" + this.location);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountSwitcherRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountSwitcherRequest copy$default(GetAccountSwitcherRequest getAccountSwitcherRequest, String str, AccountSwitcherLocation accountSwitcherLocation, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountSwitcherRequest.asset_id;
        }
        if ((i & 2) != 0) {
            accountSwitcherLocation = getAccountSwitcherRequest.location;
        }
        if ((i & 4) != 0) {
            byteString = getAccountSwitcherRequest.unknownFields();
        }
        return getAccountSwitcherRequest.copy(str, accountSwitcherLocation, byteString);
    }

    public final GetAccountSwitcherRequest copy(String asset_id, AccountSwitcherLocation location, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountSwitcherRequest(asset_id, location, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountSwitcherRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountSwitcherRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: account_aggregation.service.v1.GetAccountSwitcherRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountSwitcherRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_id());
                return value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED ? size + AccountSwitcherLocation.ADAPTER.encodedSizeWithTag(2, value.getLocation()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountSwitcherRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_id());
                if (value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED) {
                    AccountSwitcherLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountSwitcherRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLocation() != AccountSwitcherLocation.ASL_UNSPECIFIED) {
                    AccountSwitcherLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountSwitcherLocation accountSwitcherLocationDecode = AccountSwitcherLocation.ASL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountSwitcherRequest(strDecode, accountSwitcherLocationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            accountSwitcherLocationDecode = AccountSwitcherLocation.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountSwitcherRequest redact(GetAccountSwitcherRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountSwitcherRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
