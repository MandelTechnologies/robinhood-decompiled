package bonfire.proto.idl.accounts.p028v1;

import bonfire.proto.idl.accounts.p028v1.FundingOptionsRequest;
import com.robinhood.utils.http.Headers;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FundingOptionsRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "entry_point", "location", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location;", "requested_layout", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getEntry_point", "getLocation", "()Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location;", "getRequested_layout", "()Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", Headers.LOCATION, "Layout", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class FundingOptionsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<FundingOptionsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPoint", schemaIndex = 1, tag = 2)
    private final String entry_point;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.FundingOptionsRequest$Location#ADAPTER", schemaIndex = 2, tag = 3)
    private final Location location;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.FundingOptionsRequest$Layout#ADAPTER", jsonName = "requestedLayout", schemaIndex = 3, tag = 4)
    private final Layout requested_layout;

    public FundingOptionsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8723newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ FundingOptionsRequest(String str, String str2, Location location, Layout layout, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : location, (i & 8) != 0 ? null : layout, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getEntry_point() {
        return this.entry_point;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final Layout getRequested_layout() {
        return this.requested_layout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingOptionsRequest(String account_number, String str, Location location, Layout layout, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.entry_point = str;
        this.location = location;
        this.requested_layout = layout;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8723newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FundingOptionsRequest)) {
            return false;
        }
        FundingOptionsRequest fundingOptionsRequest = (FundingOptionsRequest) other;
        return Intrinsics.areEqual(unknownFields(), fundingOptionsRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, fundingOptionsRequest.account_number) && Intrinsics.areEqual(this.entry_point, fundingOptionsRequest.entry_point) && this.location == fundingOptionsRequest.location && this.requested_layout == fundingOptionsRequest.requested_layout;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        String str = this.entry_point;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Location location = this.location;
        int iHashCode3 = (iHashCode2 + (location != null ? location.hashCode() : 0)) * 37;
        Layout layout = this.requested_layout;
        int iHashCode4 = iHashCode3 + (layout != null ? layout.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str = this.entry_point;
        if (str != null) {
            arrayList.add("entry_point=" + Internal.sanitize(str));
        }
        Location location = this.location;
        if (location != null) {
            arrayList.add("location=" + location);
        }
        Layout layout = this.requested_layout;
        if (layout != null) {
            arrayList.add("requested_layout=" + layout);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FundingOptionsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FundingOptionsRequest copy$default(FundingOptionsRequest fundingOptionsRequest, String str, String str2, Location location, Layout layout, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingOptionsRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = fundingOptionsRequest.entry_point;
        }
        if ((i & 4) != 0) {
            location = fundingOptionsRequest.location;
        }
        if ((i & 8) != 0) {
            layout = fundingOptionsRequest.requested_layout;
        }
        if ((i & 16) != 0) {
            byteString = fundingOptionsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Location location2 = location;
        return fundingOptionsRequest.copy(str, str2, location2, layout, byteString2);
    }

    public final FundingOptionsRequest copy(String account_number, String entry_point, Location location, Layout requested_layout, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FundingOptionsRequest(account_number, entry_point, location, requested_layout, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundingOptionsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FundingOptionsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.FundingOptionsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FundingOptionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEntry_point()) + FundingOptionsRequest.Location.ADAPTER.encodedSizeWithTag(3, value.getLocation()) + FundingOptionsRequest.Layout.ADAPTER.encodedSizeWithTag(4, value.getRequested_layout());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FundingOptionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEntry_point());
                FundingOptionsRequest.Location.ADAPTER.encodeWithTag(writer, 3, (int) value.getLocation());
                FundingOptionsRequest.Layout.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequested_layout());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FundingOptionsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FundingOptionsRequest.Layout.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequested_layout());
                FundingOptionsRequest.Location.ADAPTER.encodeWithTag(writer, 3, (int) value.getLocation());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getEntry_point());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundingOptionsRequest redact(FundingOptionsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FundingOptionsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FundingOptionsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                FundingOptionsRequest.Location locationDecode = null;
                FundingOptionsRequest.Layout layoutDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FundingOptionsRequest(str, strDecode2, locationDecode, layoutDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                try {
                                    locationDecode = FundingOptionsRequest.Location.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 4) {
                                try {
                                    layoutDecode = FundingOptionsRequest.Layout.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingOptionsRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCATION_UNSPECIFIED", "LOCATION_ONBOARDING", "LOCATION_DASHBOARD_FOOTER", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Location implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Location[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Location> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Location LOCATION_DASHBOARD_FOOTER;
        public static final Location LOCATION_ONBOARDING;
        public static final Location LOCATION_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Location[] $values() {
            return new Location[]{LOCATION_UNSPECIFIED, LOCATION_ONBOARDING, LOCATION_DASHBOARD_FOOTER};
        }

        @JvmStatic
        public static final Location fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Location> getEntries() {
            return $ENTRIES;
        }

        private Location(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Location location = new Location("LOCATION_UNSPECIFIED", 0, 0);
            LOCATION_UNSPECIFIED = location;
            LOCATION_ONBOARDING = new Location("LOCATION_ONBOARDING", 1, 1);
            LOCATION_DASHBOARD_FOOTER = new Location("LOCATION_DASHBOARD_FOOTER", 2, 2);
            Location[] locationArr$values = $values();
            $VALUES = locationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(locationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Location.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Location>(orCreateKotlinClass, syntax, location) { // from class: bonfire.proto.idl.accounts.v1.FundingOptionsRequest$Location$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FundingOptionsRequest.Location fromValue(int value) {
                    return FundingOptionsRequest.Location.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FundingOptionsRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Location;", "fromValue", "value", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Location fromValue(int value) {
                if (value == 0) {
                    return Location.LOCATION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Location.LOCATION_ONBOARDING;
                }
                if (value != 2) {
                    return null;
                }
                return Location.LOCATION_DASHBOARD_FOOTER;
            }
        }

        public static Location valueOf(String str) {
            return (Location) Enum.valueOf(Location.class, str);
        }

        public static Location[] values() {
            return (Location[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingOptionsRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LAYOUT_UNSPECIFIED", "LAYOUT_FULL_SCREEN", "LAYOUT_SHEET", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Layout implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Layout[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Layout> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Layout LAYOUT_FULL_SCREEN;
        public static final Layout LAYOUT_SHEET;
        public static final Layout LAYOUT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Layout[] $values() {
            return new Layout[]{LAYOUT_UNSPECIFIED, LAYOUT_FULL_SCREEN, LAYOUT_SHEET};
        }

        @JvmStatic
        public static final Layout fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Layout> getEntries() {
            return $ENTRIES;
        }

        private Layout(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Layout layout = new Layout("LAYOUT_UNSPECIFIED", 0, 0);
            LAYOUT_UNSPECIFIED = layout;
            LAYOUT_FULL_SCREEN = new Layout("LAYOUT_FULL_SCREEN", 1, 1);
            LAYOUT_SHEET = new Layout("LAYOUT_SHEET", 2, 2);
            Layout[] layoutArr$values = $values();
            $VALUES = layoutArr$values;
            $ENTRIES = EnumEntries2.enumEntries(layoutArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Layout.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Layout>(orCreateKotlinClass, syntax, layout) { // from class: bonfire.proto.idl.accounts.v1.FundingOptionsRequest$Layout$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FundingOptionsRequest.Layout fromValue(int value) {
                    return FundingOptionsRequest.Layout.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FundingOptionsRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequest$Layout;", "fromValue", "value", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Layout fromValue(int value) {
                if (value == 0) {
                    return Layout.LAYOUT_UNSPECIFIED;
                }
                if (value == 1) {
                    return Layout.LAYOUT_FULL_SCREEN;
                }
                if (value != 2) {
                    return null;
                }
                return Layout.LAYOUT_SHEET;
            }
        }

        public static Layout valueOf(String str) {
            return (Layout) Enum.valueOf(Layout.class, str);
        }

        public static Layout[] values() {
            return (Layout[]) $VALUES.clone();
        }
    }
}
