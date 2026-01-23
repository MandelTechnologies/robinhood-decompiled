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

/* compiled from: ReviewScheduledMeetingViewModel.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/ReviewScheduledMeetingViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "email", "disclaimer", "cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getEmail", "getDisclaimer", "getCta_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ReviewScheduledMeetingViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<ReviewScheduledMeetingViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String disclaimer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ReviewScheduledMeetingViewModel() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ReviewScheduledMeetingViewModel(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8790newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScheduledMeetingViewModel(String title, String email, String str, String cta_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.email = email;
        this.disclaimer = str;
        this.cta_text = cta_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8790newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReviewScheduledMeetingViewModel)) {
            return false;
        }
        ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel = (ReviewScheduledMeetingViewModel) other;
        return Intrinsics.areEqual(unknownFields(), reviewScheduledMeetingViewModel.unknownFields()) && Intrinsics.areEqual(this.title, reviewScheduledMeetingViewModel.title) && Intrinsics.areEqual(this.email, reviewScheduledMeetingViewModel.email) && Intrinsics.areEqual(this.disclaimer, reviewScheduledMeetingViewModel.disclaimer) && Intrinsics.areEqual(this.cta_text, reviewScheduledMeetingViewModel.cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.email.hashCode()) * 37;
        String str = this.disclaimer;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.cta_text.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("email=" + Internal.sanitize(this.email));
        String str = this.disclaimer;
        if (str != null) {
            arrayList.add("disclaimer=" + Internal.sanitize(str));
        }
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReviewScheduledMeetingViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReviewScheduledMeetingViewModel copy$default(ReviewScheduledMeetingViewModel reviewScheduledMeetingViewModel, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewScheduledMeetingViewModel.title;
        }
        if ((i & 2) != 0) {
            str2 = reviewScheduledMeetingViewModel.email;
        }
        if ((i & 4) != 0) {
            str3 = reviewScheduledMeetingViewModel.disclaimer;
        }
        if ((i & 8) != 0) {
            str4 = reviewScheduledMeetingViewModel.cta_text;
        }
        if ((i & 16) != 0) {
            byteString = reviewScheduledMeetingViewModel.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return reviewScheduledMeetingViewModel.copy(str, str2, str5, str4, byteString2);
    }

    public final ReviewScheduledMeetingViewModel copy(String title, String email, String disclaimer, String cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReviewScheduledMeetingViewModel(title, email, disclaimer, cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReviewScheduledMeetingViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReviewScheduledMeetingViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.ReviewScheduledMeetingViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReviewScheduledMeetingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getEmail(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEmail());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getDisclaimer());
                return !Intrinsics.areEqual(value.getCta_text(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getCta_text()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReviewScheduledMeetingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getEmail(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEmail());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclaimer());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReviewScheduledMeetingViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_text());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDisclaimer());
                if (!Intrinsics.areEqual(value.getEmail(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getEmail());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReviewScheduledMeetingViewModel redact(ReviewScheduledMeetingViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ReviewScheduledMeetingViewModel.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReviewScheduledMeetingViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReviewScheduledMeetingViewModel(strDecode, strDecode4, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
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
