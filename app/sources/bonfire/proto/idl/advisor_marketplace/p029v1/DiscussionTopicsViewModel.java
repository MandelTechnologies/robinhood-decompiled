package bonfire.proto.idl.advisor_marketplace.p029v1;

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

/* compiled from: DiscussionTopicsViewModel.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/DiscussionTopicsViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "character_limit", "", "custom_text_placeholder", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCharacter_limit", "()I", "getCustom_text_placeholder", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DiscussionTopicsViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<DiscussionTopicsViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "characterLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int character_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customTextPlaceholder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String custom_text_placeholder;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public DiscussionTopicsViewModel() {
        this(null, null, 0, null, null, 31, null);
    }

    public /* synthetic */ DiscussionTopicsViewModel(String str, String str2, int i, String str3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8771newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getCharacter_limit() {
        return this.character_limit;
    }

    public final String getCustom_text_placeholder() {
        return this.custom_text_placeholder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscussionTopicsViewModel(String title, String subtitle, int i, String custom_text_placeholder, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(custom_text_placeholder, "custom_text_placeholder");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.character_limit = i;
        this.custom_text_placeholder = custom_text_placeholder;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8771newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DiscussionTopicsViewModel)) {
            return false;
        }
        DiscussionTopicsViewModel discussionTopicsViewModel = (DiscussionTopicsViewModel) other;
        return Intrinsics.areEqual(unknownFields(), discussionTopicsViewModel.unknownFields()) && Intrinsics.areEqual(this.title, discussionTopicsViewModel.title) && Intrinsics.areEqual(this.subtitle, discussionTopicsViewModel.subtitle) && this.character_limit == discussionTopicsViewModel.character_limit && Intrinsics.areEqual(this.custom_text_placeholder, discussionTopicsViewModel.custom_text_placeholder);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + Integer.hashCode(this.character_limit)) * 37) + this.custom_text_placeholder.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("character_limit=" + this.character_limit);
        arrayList.add("custom_text_placeholder=" + Internal.sanitize(this.custom_text_placeholder));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DiscussionTopicsViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DiscussionTopicsViewModel copy$default(DiscussionTopicsViewModel discussionTopicsViewModel, String str, String str2, int i, String str3, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = discussionTopicsViewModel.title;
        }
        if ((i2 & 2) != 0) {
            str2 = discussionTopicsViewModel.subtitle;
        }
        if ((i2 & 4) != 0) {
            i = discussionTopicsViewModel.character_limit;
        }
        if ((i2 & 8) != 0) {
            str3 = discussionTopicsViewModel.custom_text_placeholder;
        }
        if ((i2 & 16) != 0) {
            byteString = discussionTopicsViewModel.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return discussionTopicsViewModel.copy(str, str2, i3, str3, byteString2);
    }

    public final DiscussionTopicsViewModel copy(String title, String subtitle, int character_limit, String custom_text_placeholder, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(custom_text_placeholder, "custom_text_placeholder");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DiscussionTopicsViewModel(title, subtitle, character_limit, custom_text_placeholder, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DiscussionTopicsViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DiscussionTopicsViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.DiscussionTopicsViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DiscussionTopicsViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (value.getCharacter_limit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCharacter_limit()));
                }
                return !Intrinsics.areEqual(value.getCustom_text_placeholder(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCustom_text_placeholder()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DiscussionTopicsViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (value.getCharacter_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCharacter_limit()));
                }
                if (!Intrinsics.areEqual(value.getCustom_text_placeholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCustom_text_placeholder());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DiscussionTopicsViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCustom_text_placeholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCustom_text_placeholder());
                }
                if (value.getCharacter_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCharacter_limit()));
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DiscussionTopicsViewModel redact(DiscussionTopicsViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DiscussionTopicsViewModel.copy$default(value, null, null, 0, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DiscussionTopicsViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                int iIntValue = 0;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DiscussionTopicsViewModel(strDecode, strDecode3, iIntValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
