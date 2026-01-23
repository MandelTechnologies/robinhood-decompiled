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

/* compiled from: LinkAccountsForUpdateModeRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequest;", "Lcom/squareup/wire/Message;", "", "account_link_id", "", "provider", "Laccio/service/v1/Provider;", "purposes", "", "Laccio/service/v1/Purpose;", "plaid_details", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Laccio/service/v1/Provider;Ljava/util/List;Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;Lokio/ByteString;)V", "getAccount_link_id", "()Ljava/lang/String;", "getProvider", "()Laccio/service/v1/Provider;", "getPlaid_details", "()Lbff_money_movement/service/v1/PlaidLinkAccountsDetails;", "getPurposes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LinkAccountsForUpdateModeRequest extends Message {

    @JvmField
    public static final ProtoAdapter<LinkAccountsForUpdateModeRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountLinkId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_link_id;

    @WireField(adapter = "bff_money_movement.service.v1.PlaidLinkAccountsDetails#ADAPTER", jsonName = "plaidDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 3, tag = 50)
    private final PlaidLinkAccountsDetails plaid_details;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Provider provider;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Purpose> purposes;

    public LinkAccountsForUpdateModeRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8492newBuilder();
    }

    public final String getAccount_link_id() {
        return this.account_link_id;
    }

    public /* synthetic */ LinkAccountsForUpdateModeRequest(String str, Provider provider, List list, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : plaidLinkAccountsDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final PlaidLinkAccountsDetails getPlaid_details() {
        return this.plaid_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsForUpdateModeRequest(String account_link_id, Provider provider, List<? extends Purpose> purposes, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_link_id = account_link_id;
        this.provider = provider;
        this.plaid_details = plaidLinkAccountsDetails;
        this.purposes = Internal.immutableCopyOf("purposes", purposes);
    }

    public final List<Purpose> getPurposes() {
        return this.purposes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8492newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LinkAccountsForUpdateModeRequest)) {
            return false;
        }
        LinkAccountsForUpdateModeRequest linkAccountsForUpdateModeRequest = (LinkAccountsForUpdateModeRequest) other;
        return Intrinsics.areEqual(unknownFields(), linkAccountsForUpdateModeRequest.unknownFields()) && Intrinsics.areEqual(this.account_link_id, linkAccountsForUpdateModeRequest.account_link_id) && this.provider == linkAccountsForUpdateModeRequest.provider && Intrinsics.areEqual(this.purposes, linkAccountsForUpdateModeRequest.purposes) && Intrinsics.areEqual(this.plaid_details, linkAccountsForUpdateModeRequest.plaid_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_link_id.hashCode()) * 37) + this.provider.hashCode()) * 37) + this.purposes.hashCode()) * 37;
        PlaidLinkAccountsDetails plaidLinkAccountsDetails = this.plaid_details;
        int iHashCode2 = iHashCode + (plaidLinkAccountsDetails != null ? plaidLinkAccountsDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_link_id=" + Internal.sanitize(this.account_link_id));
        arrayList.add("provider=" + this.provider);
        if (!this.purposes.isEmpty()) {
            arrayList.add("purposes=" + this.purposes);
        }
        PlaidLinkAccountsDetails plaidLinkAccountsDetails = this.plaid_details;
        if (plaidLinkAccountsDetails != null) {
            arrayList.add("plaid_details=" + plaidLinkAccountsDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkAccountsForUpdateModeRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LinkAccountsForUpdateModeRequest copy$default(LinkAccountsForUpdateModeRequest linkAccountsForUpdateModeRequest, String str, Provider provider, List list, PlaidLinkAccountsDetails plaidLinkAccountsDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkAccountsForUpdateModeRequest.account_link_id;
        }
        if ((i & 2) != 0) {
            provider = linkAccountsForUpdateModeRequest.provider;
        }
        if ((i & 4) != 0) {
            list = linkAccountsForUpdateModeRequest.purposes;
        }
        if ((i & 8) != 0) {
            plaidLinkAccountsDetails = linkAccountsForUpdateModeRequest.plaid_details;
        }
        if ((i & 16) != 0) {
            byteString = linkAccountsForUpdateModeRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return linkAccountsForUpdateModeRequest.copy(str, provider, list2, plaidLinkAccountsDetails, byteString2);
    }

    public final LinkAccountsForUpdateModeRequest copy(String account_link_id, Provider provider, List<? extends Purpose> purposes, PlaidLinkAccountsDetails plaid_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LinkAccountsForUpdateModeRequest(account_link_id, provider, purposes, plaid_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LinkAccountsForUpdateModeRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LinkAccountsForUpdateModeRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.LinkAccountsForUpdateModeRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LinkAccountsForUpdateModeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_link_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    size += Provider.ADAPTER.encodedSizeWithTag(2, value.getProvider());
                }
                return size + Purpose.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPurposes()) + PlaidLinkAccountsDetails.ADAPTER.encodedSizeWithTag(50, value.getPlaid_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LinkAccountsForUpdateModeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_link_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPurposes());
                PlaidLinkAccountsDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LinkAccountsForUpdateModeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaidLinkAccountsDetails.ADAPTER.encodeWithTag(writer, 50, (int) value.getPlaid_details());
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPurposes());
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                if (Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_link_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LinkAccountsForUpdateModeRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Provider providerDecode = Provider.PROVIDER_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                PlaidLinkAccountsDetails plaidLinkAccountsDetailsDecode = null;
                String strDecode = "";
                while (true) {
                    Provider provider = providerDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LinkAccountsForUpdateModeRequest(strDecode, provider, arrayList, plaidLinkAccountsDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinkAccountsForUpdateModeRequest redact(LinkAccountsForUpdateModeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidLinkAccountsDetails plaid_details = value.getPlaid_details();
                return LinkAccountsForUpdateModeRequest.copy$default(value, null, null, null, plaid_details != null ? PlaidLinkAccountsDetails.ADAPTER.redact(plaid_details) : null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
