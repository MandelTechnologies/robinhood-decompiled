package bff_money_movement.service.p019v1;

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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: LinkAccountsRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsRequest;", "Lcom/squareup/wire/Message;", "", "provider", "Laccio/service/v1/Provider;", "purposes", "", "Laccio/service/v1/Purpose;", "plaid_details", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Laccio/service/v1/Provider;Ljava/util/List;Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;Lokio/ByteString;)V", "getProvider", "()Laccio/service/v1/Provider;", "getPlaid_details", "()Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;", "getPurposes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LinkAccountsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<LinkAccountsRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.PlaidLinkAccountsDetails#ADAPTER", jsonName = "plaidDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 2, tag = 50)
    private final PlaidLinkAccountsDetails plaid_details;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Provider provider;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Purpose> purposes;

    public LinkAccountsRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8493newBuilder();
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public /* synthetic */ LinkAccountsRequest(Provider provider, List list, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : plaidLinkAccountsDetails, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PlaidLinkAccountsDetails getPlaid_details() {
        return this.plaid_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsRequest(Provider provider, List<? extends Purpose> purposes, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.provider = provider;
        this.plaid_details = plaidLinkAccountsDetails;
        this.purposes = Internal.immutableCopyOf("purposes", purposes);
    }

    public final List<Purpose> getPurposes() {
        return this.purposes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8493newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LinkAccountsRequest)) {
            return false;
        }
        LinkAccountsRequest linkAccountsRequest = (LinkAccountsRequest) other;
        return Intrinsics.areEqual(unknownFields(), linkAccountsRequest.unknownFields()) && this.provider == linkAccountsRequest.provider && Intrinsics.areEqual(this.purposes, linkAccountsRequest.purposes) && Intrinsics.areEqual(this.plaid_details, linkAccountsRequest.plaid_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.provider.hashCode()) * 37) + this.purposes.hashCode()) * 37;
        PlaidLinkAccountsDetails plaidLinkAccountsDetails = this.plaid_details;
        int iHashCode2 = iHashCode + (plaidLinkAccountsDetails != null ? plaidLinkAccountsDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("provider=" + this.provider);
        if (!this.purposes.isEmpty()) {
            arrayList.add("purposes=" + this.purposes);
        }
        PlaidLinkAccountsDetails plaidLinkAccountsDetails = this.plaid_details;
        if (plaidLinkAccountsDetails != null) {
            arrayList.add("plaid_details=" + plaidLinkAccountsDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkAccountsRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkAccountsRequest copy$default(LinkAccountsRequest linkAccountsRequest, Provider provider, List list, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            provider = linkAccountsRequest.provider;
        }
        if ((i & 2) != 0) {
            list = linkAccountsRequest.purposes;
        }
        if ((i & 4) != 0) {
            plaidLinkAccountsDetails = linkAccountsRequest.plaid_details;
        }
        if ((i & 8) != 0) {
            byteString = linkAccountsRequest.unknownFields();
        }
        return linkAccountsRequest.copy(provider, list, plaidLinkAccountsDetails, byteString);
    }

    public final LinkAccountsRequest copy(Provider provider, List<? extends Purpose> purposes, PlaidLinkAccountsDetails plaid_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LinkAccountsRequest(provider, purposes, plaid_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LinkAccountsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LinkAccountsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.LinkAccountsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LinkAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    size += Provider.ADAPTER.encodedSizeWithTag(1, value.getProvider());
                }
                return size + Purpose.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getPurposes()) + PlaidLinkAccountsDetails.ADAPTER.encodedSizeWithTag(50, value.getPlaid_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LinkAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 1, (int) value.getProvider());
                }
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPurposes());
                PlaidLinkAccountsDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LinkAccountsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaidLinkAccountsDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPurposes());
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 1, (int) value.getProvider());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LinkAccountsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Provider providerDecode = Provider.PROVIDER_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                PlaidLinkAccountsDetails plaidLinkAccountsDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LinkAccountsRequest(providerDecode, arrayList, plaidLinkAccountsDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            providerDecode = Provider.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            Purpose.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 50) {
                        plaidLinkAccountsDetailsDecode = PlaidLinkAccountsDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinkAccountsRequest redact(LinkAccountsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidLinkAccountsDetails plaid_details = value.getPlaid_details();
                return LinkAccountsRequest.copy$default(value, null, null, plaid_details != null ? PlaidLinkAccountsDetails.ADAPTER.redact(plaid_details) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
