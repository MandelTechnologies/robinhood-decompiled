package bff_vitals.service.p021v1;

import bff_vitals.service.p021v1.FetchVitalsResponse;
import com.robinhood.android.car.result.CarResultComposable2;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FetchVitalsResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse;", "Lcom/squareup/wire/Message;", "", "clear_cache_created_before_timestamp", "", "unsupported_version_content", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;Lokio/ByteString;)V", "getClear_cache_created_before_timestamp", "()I", "getUnsupported_version_content", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "UnsupportedVersionContent", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FetchVitalsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FetchVitalsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "clearCacheCreatedBeforeTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int clear_cache_created_before_timestamp;

    @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent#ADAPTER", jsonName = "unsupportedVersionContent", schemaIndex = 1, tag = 2)
    private final UnsupportedVersionContent unsupported_version_content;

    public FetchVitalsResponse() {
        this(0, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8534newBuilder();
    }

    public final int getClear_cache_created_before_timestamp() {
        return this.clear_cache_created_before_timestamp;
    }

    public final UnsupportedVersionContent getUnsupported_version_content() {
        return this.unsupported_version_content;
    }

    public /* synthetic */ FetchVitalsResponse(int i, UnsupportedVersionContent unsupportedVersionContent, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : unsupportedVersionContent, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchVitalsResponse(int i, UnsupportedVersionContent unsupportedVersionContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.clear_cache_created_before_timestamp = i;
        this.unsupported_version_content = unsupportedVersionContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8534newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FetchVitalsResponse)) {
            return false;
        }
        FetchVitalsResponse fetchVitalsResponse = (FetchVitalsResponse) other;
        return Intrinsics.areEqual(unknownFields(), fetchVitalsResponse.unknownFields()) && this.clear_cache_created_before_timestamp == fetchVitalsResponse.clear_cache_created_before_timestamp && Intrinsics.areEqual(this.unsupported_version_content, fetchVitalsResponse.unsupported_version_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.clear_cache_created_before_timestamp)) * 37;
        UnsupportedVersionContent unsupportedVersionContent = this.unsupported_version_content;
        int iHashCode2 = iHashCode + (unsupportedVersionContent != null ? unsupportedVersionContent.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("clear_cache_created_before_timestamp=" + this.clear_cache_created_before_timestamp);
        UnsupportedVersionContent unsupportedVersionContent = this.unsupported_version_content;
        if (unsupportedVersionContent != null) {
            arrayList.add("unsupported_version_content=" + unsupportedVersionContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FetchVitalsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FetchVitalsResponse copy$default(FetchVitalsResponse fetchVitalsResponse, int i, UnsupportedVersionContent unsupportedVersionContent, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fetchVitalsResponse.clear_cache_created_before_timestamp;
        }
        if ((i2 & 2) != 0) {
            unsupportedVersionContent = fetchVitalsResponse.unsupported_version_content;
        }
        if ((i2 & 4) != 0) {
            byteString = fetchVitalsResponse.unknownFields();
        }
        return fetchVitalsResponse.copy(i, unsupportedVersionContent, byteString);
    }

    public final FetchVitalsResponse copy(int clear_cache_created_before_timestamp, UnsupportedVersionContent unsupported_version_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FetchVitalsResponse(clear_cache_created_before_timestamp, unsupported_version_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FetchVitalsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FetchVitalsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FetchVitalsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getClear_cache_created_before_timestamp() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getClear_cache_created_before_timestamp()));
                }
                return size + FetchVitalsResponse.UnsupportedVersionContent.ADAPTER.encodedSizeWithTag(2, value.getUnsupported_version_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FetchVitalsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getClear_cache_created_before_timestamp() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getClear_cache_created_before_timestamp()));
                }
                FetchVitalsResponse.UnsupportedVersionContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getUnsupported_version_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FetchVitalsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FetchVitalsResponse.UnsupportedVersionContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getUnsupported_version_content());
                if (value.getClear_cache_created_before_timestamp() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getClear_cache_created_before_timestamp()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FetchVitalsResponse redact(FetchVitalsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FetchVitalsResponse.UnsupportedVersionContent unsupported_version_content = value.getUnsupported_version_content();
                return FetchVitalsResponse.copy$default(value, 0, unsupported_version_content != null ? FetchVitalsResponse.UnsupportedVersionContent.ADAPTER.redact(unsupported_version_content) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FetchVitalsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                FetchVitalsResponse.UnsupportedVersionContent unsupportedVersionContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FetchVitalsResponse(iIntValue, unsupportedVersionContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        unsupportedVersionContentDecode = FetchVitalsResponse.UnsupportedVersionContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: FetchVitalsResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "Lcom/squareup/wire/Message;", "", "message_title", "", "message_body_markdown", CarResultComposable2.BUTTONS, "", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getMessage_title", "()Ljava/lang/String;", "getMessage_body_markdown", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Button", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnsupportedVersionContent extends Message {

        @JvmField
        public static final ProtoAdapter<UnsupportedVersionContent> ADAPTER;

        @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        private final List<Button> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageBodyMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String message_body_markdown;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String message_title;

        public UnsupportedVersionContent() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ UnsupportedVersionContent(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8535newBuilder();
        }

        public final String getMessage_title() {
            return this.message_title;
        }

        public final String getMessage_body_markdown() {
            return this.message_body_markdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedVersionContent(String message_title, String message_body_markdown, List<Button> buttons, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body_markdown, "message_body_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.message_title = message_title;
            this.message_body_markdown = message_body_markdown;
            this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8535newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof UnsupportedVersionContent)) {
                return false;
            }
            UnsupportedVersionContent unsupportedVersionContent = (UnsupportedVersionContent) other;
            return Intrinsics.areEqual(unknownFields(), unsupportedVersionContent.unknownFields()) && Intrinsics.areEqual(this.message_title, unsupportedVersionContent.message_title) && Intrinsics.areEqual(this.message_body_markdown, unsupportedVersionContent.message_body_markdown) && Intrinsics.areEqual(this.buttons, unsupportedVersionContent.buttons);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.message_title.hashCode()) * 37) + this.message_body_markdown.hashCode()) * 37) + this.buttons.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("message_title=" + Internal.sanitize(this.message_title));
            arrayList.add("message_body_markdown=" + Internal.sanitize(this.message_body_markdown));
            if (!this.buttons.isEmpty()) {
                arrayList.add("buttons=" + this.buttons);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UnsupportedVersionContent{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UnsupportedVersionContent copy$default(UnsupportedVersionContent unsupportedVersionContent, String str, String str2, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unsupportedVersionContent.message_title;
            }
            if ((i & 2) != 0) {
                str2 = unsupportedVersionContent.message_body_markdown;
            }
            if ((i & 4) != 0) {
                list = unsupportedVersionContent.buttons;
            }
            if ((i & 8) != 0) {
                byteString = unsupportedVersionContent.unknownFields();
            }
            return unsupportedVersionContent.copy(str, str2, list, byteString);
        }

        public final UnsupportedVersionContent copy(String message_title, String message_body_markdown, List<Button> buttons, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body_markdown, "message_body_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new UnsupportedVersionContent(message_title, message_body_markdown, buttons, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnsupportedVersionContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<UnsupportedVersionContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage_title());
                    }
                    if (!Intrinsics.areEqual(value.getMessage_body_markdown(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage_body_markdown());
                    }
                    return size + FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getButtons());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage_title());
                    }
                    if (!Intrinsics.areEqual(value.getMessage_body_markdown(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_body_markdown());
                    }
                    FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                    if (!Intrinsics.areEqual(value.getMessage_body_markdown(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_body_markdown());
                    }
                    if (Intrinsics.areEqual(value.getMessage_title(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage_title());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public FetchVitalsResponse.UnsupportedVersionContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FetchVitalsResponse.UnsupportedVersionContent(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FetchVitalsResponse.UnsupportedVersionContent redact(FetchVitalsResponse.UnsupportedVersionContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return FetchVitalsResponse.UnsupportedVersionContent.copy$default(value, null, null, Internal.m26823redactElements(value.getButtons(), FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER), ByteString.EMPTY, 3, null);
                }
            };
        }

        /* compiled from: FetchVitalsResponse.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u001eB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "is_primary", "", "action", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "()Z", "getAction", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Action", "CancelAction", "OpenAppStoreAction", "DismissAction", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Button extends Message {

            @JvmField
            public static final ProtoAdapter<Button> ADAPTER;

            @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final Action action;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final boolean is_primary;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String label;

            public Button() {
                this(null, false, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8536newBuilder();
            }

            public final String getLabel() {
                return this.label;
            }

            public /* synthetic */ Button(String str, boolean z, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : action, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* renamed from: is_primary, reason: from getter */
            public final boolean getIs_primary() {
                return this.is_primary;
            }

            public final Action getAction() {
                return this.action;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String label, boolean z, Action action, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.label = label;
                this.is_primary = z;
                this.action = action;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8536newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.label, button.label) && this.is_primary == button.is_primary && Intrinsics.areEqual(this.action, button.action);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37) + Boolean.hashCode(this.is_primary)) * 37;
                Action action = this.action;
                int iHashCode2 = iHashCode + (action != null ? action.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("label=" + Internal.sanitize(this.label));
                arrayList.add("is_primary=" + this.is_primary);
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, boolean z, Action action, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.label;
                }
                if ((i & 2) != 0) {
                    z = button.is_primary;
                }
                if ((i & 4) != 0) {
                    action = button.action;
                }
                if ((i & 8) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(str, z, action, byteString);
            }

            public final Button copy(String label, boolean is_primary, Action action, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Button(label, is_primary, action, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Button>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent.Button value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getLabel(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                        }
                        if (value.getIs_primary()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_primary()));
                        }
                        return value.getAction() != null ? size + FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER.encodedSizeWithTag(3, value.getAction()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getLabel(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                        }
                        if (value.getIs_primary()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_primary()));
                        }
                        if (value.getAction() != null) {
                            FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getAction() != null) {
                            FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                        }
                        if (value.getIs_primary()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_primary()));
                        }
                        if (Intrinsics.areEqual(value.getLabel(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public FetchVitalsResponse.UnsupportedVersionContent.Button redact(FetchVitalsResponse.UnsupportedVersionContent.Button value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FetchVitalsResponse.UnsupportedVersionContent.Button.Action action = value.getAction();
                        return FetchVitalsResponse.UnsupportedVersionContent.Button.copy$default(value, null, false, action != null ? FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 3, null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public FetchVitalsResponse.UnsupportedVersionContent.Button decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        boolean zBooleanValue = false;
                        FetchVitalsResponse.UnsupportedVersionContent.Button.Action actionDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new FetchVitalsResponse.UnsupportedVersionContent.Button(strDecode, zBooleanValue, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else if (iNextTag == 3) {
                                actionDecode = FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }

            /* compiled from: FetchVitalsResponse.kt */
            @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "Lcom/squareup/wire/Message;", "", "url", "", "cancel_action", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "open_app_store_action", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "dismiss_action", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getCancel_action", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "getOpen_app_store_action", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "getDismiss_action", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Action extends Message {

                @JvmField
                public static final ProtoAdapter<Action> ADAPTER;

                @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction#ADAPTER", jsonName = "cancelAction", oneofName = "concrete", schemaIndex = 1, tag = 2)
                private final CancelAction cancel_action;

                @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction#ADAPTER", jsonName = "dismissAction", oneofName = "concrete", schemaIndex = 3, tag = 4)
                private final DismissAction dismiss_action;

                @WireField(adapter = "bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction#ADAPTER", jsonName = "openAppStoreAction", oneofName = "concrete", schemaIndex = 2, tag = 3)
                private final OpenAppStoreAction open_app_store_action;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", oneofName = "concrete", schemaIndex = 0, tag = 1)
                private final String url;

                public Action() {
                    this(null, null, null, null, null, 31, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8537newBuilder();
                }

                public final String getUrl() {
                    return this.url;
                }

                public final CancelAction getCancel_action() {
                    return this.cancel_action;
                }

                public final OpenAppStoreAction getOpen_app_store_action() {
                    return this.open_app_store_action;
                }

                public final DismissAction getDismiss_action() {
                    return this.dismiss_action;
                }

                public /* synthetic */ Action(String str, CancelAction cancelAction, OpenAppStoreAction openAppStoreAction, DismissAction dismissAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cancelAction, (i & 4) != 0 ? null : openAppStoreAction, (i & 8) != 0 ? null : dismissAction, (i & 16) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Action(String str, CancelAction cancelAction, OpenAppStoreAction openAppStoreAction, DismissAction dismissAction, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.url = str;
                    this.cancel_action = cancelAction;
                    this.open_app_store_action = openAppStoreAction;
                    this.dismiss_action = dismissAction;
                    if (Internal.countNonNull(str, cancelAction, openAppStoreAction, dismissAction, new Object[0]) > 1) {
                        throw new IllegalArgumentException("At most one of url, cancel_action, open_app_store_action, dismiss_action may be non-null");
                    }
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8537newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) other;
                    return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.url, action.url) && Intrinsics.areEqual(this.cancel_action, action.cancel_action) && Intrinsics.areEqual(this.open_app_store_action, action.open_app_store_action) && Intrinsics.areEqual(this.dismiss_action, action.dismiss_action);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    String str = this.url;
                    int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
                    CancelAction cancelAction = this.cancel_action;
                    int iHashCode3 = (iHashCode2 + (cancelAction != null ? cancelAction.hashCode() : 0)) * 37;
                    OpenAppStoreAction openAppStoreAction = this.open_app_store_action;
                    int iHashCode4 = (iHashCode3 + (openAppStoreAction != null ? openAppStoreAction.hashCode() : 0)) * 37;
                    DismissAction dismissAction = this.dismiss_action;
                    int iHashCode5 = iHashCode4 + (dismissAction != null ? dismissAction.hashCode() : 0);
                    this.hashCode = iHashCode5;
                    return iHashCode5;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.url;
                    if (str != null) {
                        arrayList.add("url=" + Internal.sanitize(str));
                    }
                    CancelAction cancelAction = this.cancel_action;
                    if (cancelAction != null) {
                        arrayList.add("cancel_action=" + cancelAction);
                    }
                    OpenAppStoreAction openAppStoreAction = this.open_app_store_action;
                    if (openAppStoreAction != null) {
                        arrayList.add("open_app_store_action=" + openAppStoreAction);
                    }
                    DismissAction dismissAction = this.dismiss_action;
                    if (dismissAction != null) {
                        arrayList.add("dismiss_action=" + dismissAction);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Action copy$default(Action action, String str, CancelAction cancelAction, OpenAppStoreAction openAppStoreAction, DismissAction dismissAction, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = action.url;
                    }
                    if ((i & 2) != 0) {
                        cancelAction = action.cancel_action;
                    }
                    if ((i & 4) != 0) {
                        openAppStoreAction = action.open_app_store_action;
                    }
                    if ((i & 8) != 0) {
                        dismissAction = action.dismiss_action;
                    }
                    if ((i & 16) != 0) {
                        byteString = action.unknownFields();
                    }
                    ByteString byteString2 = byteString;
                    OpenAppStoreAction openAppStoreAction2 = openAppStoreAction;
                    return action.copy(str, cancelAction, openAppStoreAction2, dismissAction, byteString2);
                }

                public final Action copy(String url, CancelAction cancel_action, OpenAppStoreAction open_app_store_action, DismissAction dismiss_action, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Action(url, cancel_action, open_app_store_action, dismiss_action, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Action.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$Action$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.Action decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = null;
                            FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction cancelActionDecode = null;
                            FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction openAppStoreActionDecode = null;
                            FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction dismissActionDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.Action(strDecode, cancelActionDecode, openAppStoreActionDecode, dismissActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    cancelActionDecode = FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER.decode(reader);
                                } else if (iNextTag == 3) {
                                    openAppStoreActionDecode = FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER.decode(reader);
                                } else if (iNextTag == 4) {
                                    dismissActionDecode = FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent.Button.Action value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl()) + FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER.encodedSizeWithTag(2, value.getCancel_action()) + FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER.encodedSizeWithTag(3, value.getOpen_app_store_action()) + FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER.encodedSizeWithTag(4, value.getDismiss_action());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.Action value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getCancel_action());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_app_store_action());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_action());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.Action value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_action());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_app_store_action());
                            FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getCancel_action());
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.Action redact(FetchVitalsResponse.UnsupportedVersionContent.Button.Action value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction cancel_action = value.getCancel_action();
                            FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction cancelActionRedact = cancel_action != null ? FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER.redact(cancel_action) : null;
                            FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction open_app_store_action = value.getOpen_app_store_action();
                            FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction openAppStoreActionRedact = open_app_store_action != null ? FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER.redact(open_app_store_action) : null;
                            FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction dismiss_action = value.getDismiss_action();
                            return FetchVitalsResponse.UnsupportedVersionContent.Button.Action.copy$default(value, null, cancelActionRedact, openAppStoreActionRedact, dismiss_action != null ? FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER.redact(dismiss_action) : null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }

            /* compiled from: FetchVitalsResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class CancelAction extends Message {

                @JvmField
                public static final ProtoAdapter<CancelAction> ADAPTER;

                /* JADX WARN: Multi-variable type inference failed */
                public CancelAction() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8538newBuilder();
                }

                public /* synthetic */ CancelAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CancelAction(ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8538newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof CancelAction) && Intrinsics.areEqual(unknownFields(), ((CancelAction) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    return "CancelAction{}";
                }

                public final CancelAction copy(ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new CancelAction(unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CancelAction.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<CancelAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    reader.readUnknownField(iNextTag);
                                } else {
                                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction value) {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction redact(FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(ByteString.EMPTY);
                        }
                    };
                }
            }

            /* compiled from: FetchVitalsResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class OpenAppStoreAction extends Message {

                @JvmField
                public static final ProtoAdapter<OpenAppStoreAction> ADAPTER;

                /* JADX WARN: Multi-variable type inference failed */
                public OpenAppStoreAction() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8540newBuilder();
                }

                public /* synthetic */ OpenAppStoreAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OpenAppStoreAction(ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8540newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof OpenAppStoreAction) && Intrinsics.areEqual(unknownFields(), ((OpenAppStoreAction) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    return "OpenAppStoreAction{}";
                }

                public final OpenAppStoreAction copy(ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new OpenAppStoreAction(unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OpenAppStoreAction.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<OpenAppStoreAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    reader.readUnknownField(iNextTag);
                                } else {
                                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction value) {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction redact(FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(ByteString.EMPTY);
                        }
                    };
                }
            }

            /* compiled from: FetchVitalsResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class DismissAction extends Message {

                @JvmField
                public static final ProtoAdapter<DismissAction> ADAPTER;

                /* JADX WARN: Multi-variable type inference failed */
                public DismissAction() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8539newBuilder();
                }

                public /* synthetic */ DismissAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DismissAction(ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8539newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof DismissAction) && Intrinsics.areEqual(unknownFields(), ((DismissAction) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    return "DismissAction{}";
                }

                public final DismissAction copy(ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new DismissAction(unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DismissAction.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<DismissAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_vitals.service.v1.FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    reader.readUnknownField(iNextTag);
                                } else {
                                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction value) {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction redact(FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(ByteString.EMPTY);
                        }
                    };
                }
            }
        }
    }
}
