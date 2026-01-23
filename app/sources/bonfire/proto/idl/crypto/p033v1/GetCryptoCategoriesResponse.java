package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.crypto.p033v1.GetCryptoCategoriesResponse;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.notification.RhGcmListenerService;
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
import rh_server_driven_ui.p531v1.Alert;

/* compiled from: GetCryptoCategoriesResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "categories", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesResponse$CryptoCategory;", "preview_items_count", "", "mobile", "Lrh_server_driven_ui/v1/Alert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;ILrh_server_driven_ui/v1/Alert;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getPreview_items_count", "()I", "getMobile", "()Lrh_server_driven_ui/v1/Alert;", "getCategories", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "CryptoCategory", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoCategoriesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoCategoriesResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoCategoriesResponse$CryptoCategory#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<CryptoCategory> categories;

    @WireField(adapter = "rh_server_driven_ui.v1.Alert#ADAPTER", oneofName = "explore_crypto_description", schemaIndex = 3, tag = 4)
    private final Alert mobile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "previewItemsCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int preview_items_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GetCryptoCategoriesResponse() {
        this(null, null, 0, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8904newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ GetCryptoCategoriesResponse(String str, List list, int i, Alert alert, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : alert, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getPreview_items_count() {
        return this.preview_items_count;
    }

    public final Alert getMobile() {
        return this.mobile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoCategoriesResponse(String title, List<CryptoCategory> categories, int i, Alert alert, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.preview_items_count = i;
        this.mobile = alert;
        this.categories = Internal.immutableCopyOf("categories", categories);
    }

    public final List<CryptoCategory> getCategories() {
        return this.categories;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8904newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoCategoriesResponse)) {
            return false;
        }
        GetCryptoCategoriesResponse getCryptoCategoriesResponse = (GetCryptoCategoriesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoCategoriesResponse.unknownFields()) && Intrinsics.areEqual(this.title, getCryptoCategoriesResponse.title) && Intrinsics.areEqual(this.categories, getCryptoCategoriesResponse.categories) && this.preview_items_count == getCryptoCategoriesResponse.preview_items_count && Intrinsics.areEqual(this.mobile, getCryptoCategoriesResponse.mobile);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.categories.hashCode()) * 37) + Integer.hashCode(this.preview_items_count)) * 37;
        Alert alert = this.mobile;
        int iHashCode2 = iHashCode + (alert != null ? alert.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.categories.isEmpty()) {
            arrayList.add("categories=" + this.categories);
        }
        arrayList.add("preview_items_count=" + this.preview_items_count);
        Alert alert = this.mobile;
        if (alert != null) {
            arrayList.add("mobile=" + alert);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoCategoriesResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoCategoriesResponse copy$default(GetCryptoCategoriesResponse getCryptoCategoriesResponse, String str, List list, int i, Alert alert, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getCryptoCategoriesResponse.title;
        }
        if ((i2 & 2) != 0) {
            list = getCryptoCategoriesResponse.categories;
        }
        if ((i2 & 4) != 0) {
            i = getCryptoCategoriesResponse.preview_items_count;
        }
        if ((i2 & 8) != 0) {
            alert = getCryptoCategoriesResponse.mobile;
        }
        if ((i2 & 16) != 0) {
            byteString = getCryptoCategoriesResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return getCryptoCategoriesResponse.copy(str, list, i3, alert, byteString2);
    }

    public final GetCryptoCategoriesResponse copy(String title, List<CryptoCategory> categories, int preview_items_count, Alert mobile, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoCategoriesResponse(title, categories, preview_items_count, mobile, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoCategoriesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoCategoriesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoCategoriesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoCategoriesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + GetCryptoCategoriesResponse.CryptoCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getCategories());
                if (value.getPreview_items_count() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getPreview_items_count()));
                }
                return iEncodedSizeWithTag + Alert.ADAPTER.encodedSizeWithTag(4, value.getMobile());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoCategoriesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                GetCryptoCategoriesResponse.CryptoCategory.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCategories());
                if (value.getPreview_items_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPreview_items_count()));
                }
                Alert.ADAPTER.encodeWithTag(writer, 4, (int) value.getMobile());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoCategoriesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Alert.ADAPTER.encodeWithTag(writer, 4, (int) value.getMobile());
                if (value.getPreview_items_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPreview_items_count()));
                }
                GetCryptoCategoriesResponse.CryptoCategory.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCategories());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoCategoriesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                Alert alertDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoCategoriesResponse(strDecode, arrayList, iIntValue, alertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(GetCryptoCategoriesResponse.CryptoCategory.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        alertDecode = Alert.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoCategoriesResponse redact(GetCryptoCategoriesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getCategories(), GetCryptoCategoriesResponse.CryptoCategory.ADAPTER);
                Alert mobile = value.getMobile();
                return GetCryptoCategoriesResponse.copy$default(value, null, listM26823redactElements, 0, mobile != null ? Alert.ADAPTER.redact(mobile) : null, ByteString.EMPTY, 5, null);
            }
        };
    }

    /* compiled from: GetCryptoCategoriesResponse.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesResponse$CryptoCategory;", "Lcom/squareup/wire/Message;", "", RhGcmListenerService.EXTRA_CATEGORY, "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCategory", "()Ljava/lang/String;", "getDisplay_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoCategory extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoCategory> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String category;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String display_name;

        public CryptoCategory() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ CryptoCategory(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8905newBuilder();
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoCategory(String category, String display_name, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.category = category;
            this.display_name = display_name;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8905newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoCategory)) {
                return false;
            }
            CryptoCategory cryptoCategory = (CryptoCategory) other;
            return Intrinsics.areEqual(unknownFields(), cryptoCategory.unknownFields()) && Intrinsics.areEqual(this.category, cryptoCategory.category) && Intrinsics.areEqual(this.display_name, cryptoCategory.display_name);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.category.hashCode()) * 37) + this.display_name.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("category=" + Internal.sanitize(this.category));
            arrayList.add("display_name=" + Internal.sanitize(this.display_name));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoCategory{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CryptoCategory copy$default(CryptoCategory cryptoCategory, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cryptoCategory.category;
            }
            if ((i & 2) != 0) {
                str2 = cryptoCategory.display_name;
            }
            if ((i & 4) != 0) {
                byteString = cryptoCategory.unknownFields();
            }
            return cryptoCategory.copy(str, str2, byteString);
        }

        public final CryptoCategory copy(String category, String display_name, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoCategory(category, display_name, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoCategory.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoCategory>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoCategoriesResponse$CryptoCategory$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCryptoCategoriesResponse.CryptoCategory value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getCategory(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCategory());
                    }
                    return !Intrinsics.areEqual(value.getDisplay_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisplay_name()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCryptoCategoriesResponse.CryptoCategory value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getCategory(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
                    }
                    if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCryptoCategoriesResponse.CryptoCategory value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                    }
                    if (Intrinsics.areEqual(value.getCategory(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoCategoriesResponse.CryptoCategory redact(GetCryptoCategoriesResponse.CryptoCategory value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetCryptoCategoriesResponse.CryptoCategory.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoCategoriesResponse.CryptoCategory decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetCryptoCategoriesResponse.CryptoCategory(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
