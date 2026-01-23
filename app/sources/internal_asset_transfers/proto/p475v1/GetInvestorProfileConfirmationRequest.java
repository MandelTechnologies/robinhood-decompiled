package internal_asset_transfers.proto.p475v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetInvestorProfileConfirmationRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequest;", "Lcom/squareup/wire/Message;", "", "source", "Linternal_asset_transfers/proto/v1/IATAccount;", "sink", "unknownFields", "Lokio/ByteString;", "<init>", "(Linternal_asset_transfers/proto/v1/IATAccount;Linternal_asset_transfers/proto/v1/IATAccount;Lokio/ByteString;)V", "getSource", "()Linternal_asset_transfers/proto/v1/IATAccount;", "getSink", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetInvestorProfileConfirmationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetInvestorProfileConfirmationRequest> ADAPTER;

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IATAccount sink;

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final IATAccount source;

    public GetInvestorProfileConfirmationRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28451newBuilder();
    }

    public final IATAccount getSource() {
        return this.source;
    }

    public final IATAccount getSink() {
        return this.sink;
    }

    public /* synthetic */ GetInvestorProfileConfirmationRequest(IATAccount iATAccount, IATAccount iATAccount2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iATAccount, (i & 2) != 0 ? null : iATAccount2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvestorProfileConfirmationRequest(IATAccount iATAccount, IATAccount iATAccount2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source = iATAccount;
        this.sink = iATAccount2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28451newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetInvestorProfileConfirmationRequest)) {
            return false;
        }
        GetInvestorProfileConfirmationRequest getInvestorProfileConfirmationRequest = (GetInvestorProfileConfirmationRequest) other;
        return Intrinsics.areEqual(unknownFields(), getInvestorProfileConfirmationRequest.unknownFields()) && Intrinsics.areEqual(this.source, getInvestorProfileConfirmationRequest.source) && Intrinsics.areEqual(this.sink, getInvestorProfileConfirmationRequest.sink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IATAccount iATAccount = this.source;
        int iHashCode2 = (iHashCode + (iATAccount != null ? iATAccount.hashCode() : 0)) * 37;
        IATAccount iATAccount2 = this.sink;
        int iHashCode3 = iHashCode2 + (iATAccount2 != null ? iATAccount2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IATAccount iATAccount = this.source;
        if (iATAccount != null) {
            arrayList.add("source=" + iATAccount);
        }
        IATAccount iATAccount2 = this.sink;
        if (iATAccount2 != null) {
            arrayList.add("sink=" + iATAccount2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInvestorProfileConfirmationRequest{", "}", 0, null, null, 56, null);
    }

    public final GetInvestorProfileConfirmationRequest copy(IATAccount source, IATAccount sink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetInvestorProfileConfirmationRequest(source, sink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetInvestorProfileConfirmationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetInvestorProfileConfirmationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.GetInvestorProfileConfirmationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetInvestorProfileConfirmationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSource() != null) {
                    size += IATAccount.ADAPTER.encodedSizeWithTag(1, value.getSource());
                }
                return value.getSink() != null ? size + IATAccount.ADAPTER.encodedSizeWithTag(2, value.getSink()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetInvestorProfileConfirmationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource() != null) {
                    IATAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                }
                if (value.getSink() != null) {
                    IATAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getSink());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetInvestorProfileConfirmationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSink() != null) {
                    IATAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getSink());
                }
                if (value.getSource() != null) {
                    IATAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetInvestorProfileConfirmationRequest redact(GetInvestorProfileConfirmationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IATAccount source = value.getSource();
                IATAccount iATAccountRedact = source != null ? IATAccount.ADAPTER.redact(source) : null;
                IATAccount sink = value.getSink();
                return value.copy(iATAccountRedact, sink != null ? IATAccount.ADAPTER.redact(sink) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetInvestorProfileConfirmationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IATAccount iATAccountDecode = null;
                IATAccount iATAccountDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetInvestorProfileConfirmationRequest(iATAccountDecode, iATAccountDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iATAccountDecode = IATAccount.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        iATAccountDecode2 = IATAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
