package moneytree.p510v1;

import com.robinhood.rosetta.common.Currency;
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

/* compiled from: UpdateMembershipRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lmoneytree/v1/UpdateMembershipRequest;", "Lcom/squareup/wire/Message;", "", "intention", "Lmoneytree/v1/MembershipIntention;", "vendor", "Lmoneytree/v1/Vendor;", "currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmoneytree/v1/MembershipIntention;Lmoneytree/v1/Vendor;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getIntention", "()Lmoneytree/v1/MembershipIntention;", "getVendor", "()Lmoneytree/v1/Vendor;", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class UpdateMembershipRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateMembershipRequest> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency currency;

    @WireField(adapter = "moneytree.v1.MembershipIntention#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MembershipIntention intention;

    @WireField(adapter = "moneytree.v1.Vendor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Vendor vendor;

    public UpdateMembershipRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29338newBuilder();
    }

    public final MembershipIntention getIntention() {
        return this.intention;
    }

    public /* synthetic */ UpdateMembershipRequest(MembershipIntention membershipIntention, Vendor vendor, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MembershipIntention.MEMBERSHIP_INTENTION_UNSPECIFIED : membershipIntention, (i & 2) != 0 ? Vendor.VENDOR_UNSPECIFIED : vendor, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Vendor getVendor() {
        return this.vendor;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateMembershipRequest(MembershipIntention intention, Vendor vendor, Currency currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(intention, "intention");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.intention = intention;
        this.vendor = vendor;
        this.currency = currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29338newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateMembershipRequest)) {
            return false;
        }
        UpdateMembershipRequest updateMembershipRequest = (UpdateMembershipRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateMembershipRequest.unknownFields()) && this.intention == updateMembershipRequest.intention && this.vendor == updateMembershipRequest.vendor && this.currency == updateMembershipRequest.currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.intention.hashCode()) * 37) + this.vendor.hashCode()) * 37) + this.currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("intention=" + this.intention);
        arrayList.add("vendor=" + this.vendor);
        arrayList.add("currency=" + this.currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateMembershipRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateMembershipRequest copy$default(UpdateMembershipRequest updateMembershipRequest, MembershipIntention membershipIntention, Vendor vendor, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            membershipIntention = updateMembershipRequest.intention;
        }
        if ((i & 2) != 0) {
            vendor = updateMembershipRequest.vendor;
        }
        if ((i & 4) != 0) {
            currency = updateMembershipRequest.currency;
        }
        if ((i & 8) != 0) {
            byteString = updateMembershipRequest.unknownFields();
        }
        return updateMembershipRequest.copy(membershipIntention, vendor, currency, byteString);
    }

    public final UpdateMembershipRequest copy(MembershipIntention intention, Vendor vendor, Currency currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(intention, "intention");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateMembershipRequest(intention, vendor, currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateMembershipRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateMembershipRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.UpdateMembershipRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateMembershipRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIntention() != MembershipIntention.MEMBERSHIP_INTENTION_UNSPECIFIED) {
                    size += MembershipIntention.ADAPTER.encodedSizeWithTag(1, value.getIntention());
                }
                if (value.getVendor() != Vendor.VENDOR_UNSPECIFIED) {
                    size += Vendor.ADAPTER.encodedSizeWithTag(2, value.getVendor());
                }
                return value.getCurrency() != Currency.CURRENCY_UNSPECIFIED ? size + Currency.ADAPTER.encodedSizeWithTag(3, value.getCurrency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateMembershipRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIntention() != MembershipIntention.MEMBERSHIP_INTENTION_UNSPECIFIED) {
                    MembershipIntention.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntention());
                }
                if (value.getVendor() != Vendor.VENDOR_UNSPECIFIED) {
                    Vendor.ADAPTER.encodeWithTag(writer, 2, (int) value.getVendor());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateMembershipRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                if (value.getVendor() != Vendor.VENDOR_UNSPECIFIED) {
                    Vendor.ADAPTER.encodeWithTag(writer, 2, (int) value.getVendor());
                }
                if (value.getIntention() != MembershipIntention.MEMBERSHIP_INTENTION_UNSPECIFIED) {
                    MembershipIntention.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntention());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateMembershipRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MembershipIntention membershipIntentionDecode = MembershipIntention.MEMBERSHIP_INTENTION_UNSPECIFIED;
                Vendor vendorDecode = Vendor.VENDOR_UNSPECIFIED;
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateMembershipRequest(membershipIntentionDecode, vendorDecode, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            membershipIntentionDecode = MembershipIntention.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            vendorDecode = Vendor.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            currencyDecode = Currency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateMembershipRequest redact(UpdateMembershipRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateMembershipRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
