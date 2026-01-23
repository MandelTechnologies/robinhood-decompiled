package com.robinhood.rosetta.common;

import com.google.android.libraries.places.api.model.PlaceTypes;
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

/* compiled from: Address.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/common/Address;", "Lcom/squareup/wire/Message;", "", "street", "", "city", PlaceTypes.COUNTRY, "state", "zipcode", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStreet", "()Ljava/lang/String;", "getCity", "getCountry", "getState", "getZipcode", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Address extends Message {

    @JvmField
    public static final ProtoAdapter<Address> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String city;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String street;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String zipcode;

    public Address() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23980newBuilder();
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZipcode() {
        return this.zipcode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Address(String street, String city, String country, String state, String zipcode, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zipcode, "zipcode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.street = street;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23980newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(unknownFields(), address.unknownFields()) && Intrinsics.areEqual(this.street, address.street) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.zipcode, address.zipcode);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.street.hashCode()) * 37) + this.city.hashCode()) * 37) + this.country.hashCode()) * 37) + this.state.hashCode()) * 37) + this.zipcode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("street=" + Internal.sanitize(this.street));
        arrayList.add("city=" + Internal.sanitize(this.city));
        arrayList.add("country=" + Internal.sanitize(this.country));
        arrayList.add("state=" + Internal.sanitize(this.state));
        arrayList.add("zipcode=" + Internal.sanitize(this.zipcode));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Address{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.street;
        }
        if ((i & 2) != 0) {
            str2 = address.city;
        }
        if ((i & 4) != 0) {
            str3 = address.country;
        }
        if ((i & 8) != 0) {
            str4 = address.state;
        }
        if ((i & 16) != 0) {
            str5 = address.zipcode;
        }
        if ((i & 32) != 0) {
            byteString = address.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return address.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final Address copy(String street, String city, String country, String state, String zipcode, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zipcode, "zipcode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Address(street, city, country, state, zipcode, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Address.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Address>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.Address$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Address value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStreet(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStreet());
                }
                if (!Intrinsics.areEqual(value.getCity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCity());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getState());
                }
                return !Intrinsics.areEqual(value.getZipcode(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getZipcode()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Address value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStreet(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStreet());
                }
                if (!Intrinsics.areEqual(value.getCity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCity());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getZipcode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getZipcode());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Address value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getZipcode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getZipcode());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getCity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCity());
                }
                if (Intrinsics.areEqual(value.getStreet(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStreet());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Address redact(Address value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Address.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Address decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Address(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
