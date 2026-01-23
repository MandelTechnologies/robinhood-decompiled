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

/* compiled from: AdvisorDashboardNotEnrolledBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardNotEnrolledBottomSheet;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "value_props", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardNotEnrolledBottomSheetValueProp;", "disclaimer", "dismiss_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDisclaimer", "getDismiss_title", "getValue_props", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardNotEnrolledBottomSheet extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardNotEnrolledBottomSheet> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclaimer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dismissTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String dismiss_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardNotEnrolledBottomSheetValueProp#ADAPTER", jsonName = "valueProps", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AdvisorDashboardNotEnrolledBottomSheetValueProp> value_props;

    public AdvisorDashboardNotEnrolledBottomSheet() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ AdvisorDashboardNotEnrolledBottomSheet(String str, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8744newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getDismiss_title() {
        return this.dismiss_title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardNotEnrolledBottomSheet(String title, String subtitle, List<AdvisorDashboardNotEnrolledBottomSheetValueProp> value_props, String disclaimer, String dismiss_title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(dismiss_title, "dismiss_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.disclaimer = disclaimer;
        this.dismiss_title = dismiss_title;
        this.value_props = Internal.immutableCopyOf("value_props", value_props);
    }

    public final List<AdvisorDashboardNotEnrolledBottomSheetValueProp> getValue_props() {
        return this.value_props;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8744newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardNotEnrolledBottomSheet)) {
            return false;
        }
        AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet = (AdvisorDashboardNotEnrolledBottomSheet) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardNotEnrolledBottomSheet.unknownFields()) && Intrinsics.areEqual(this.title, advisorDashboardNotEnrolledBottomSheet.title) && Intrinsics.areEqual(this.subtitle, advisorDashboardNotEnrolledBottomSheet.subtitle) && Intrinsics.areEqual(this.value_props, advisorDashboardNotEnrolledBottomSheet.value_props) && Intrinsics.areEqual(this.disclaimer, advisorDashboardNotEnrolledBottomSheet.disclaimer) && Intrinsics.areEqual(this.dismiss_title, advisorDashboardNotEnrolledBottomSheet.dismiss_title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.value_props.hashCode()) * 37) + this.disclaimer.hashCode()) * 37) + this.dismiss_title.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.value_props.isEmpty()) {
            arrayList.add("value_props=" + this.value_props);
        }
        arrayList.add("disclaimer=" + Internal.sanitize(this.disclaimer));
        arrayList.add("dismiss_title=" + Internal.sanitize(this.dismiss_title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardNotEnrolledBottomSheet{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDashboardNotEnrolledBottomSheet copy$default(AdvisorDashboardNotEnrolledBottomSheet advisorDashboardNotEnrolledBottomSheet, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorDashboardNotEnrolledBottomSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = advisorDashboardNotEnrolledBottomSheet.subtitle;
        }
        if ((i & 4) != 0) {
            list = advisorDashboardNotEnrolledBottomSheet.value_props;
        }
        if ((i & 8) != 0) {
            str3 = advisorDashboardNotEnrolledBottomSheet.disclaimer;
        }
        if ((i & 16) != 0) {
            str4 = advisorDashboardNotEnrolledBottomSheet.dismiss_title;
        }
        if ((i & 32) != 0) {
            byteString = advisorDashboardNotEnrolledBottomSheet.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return advisorDashboardNotEnrolledBottomSheet.copy(str, str2, list, str3, str5, byteString2);
    }

    public final AdvisorDashboardNotEnrolledBottomSheet copy(String title, String subtitle, List<AdvisorDashboardNotEnrolledBottomSheetValueProp> value_props, String disclaimer, String dismiss_title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value_props, "value_props");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(dismiss_title, "dismiss_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardNotEnrolledBottomSheet(title, subtitle, value_props, disclaimer, dismiss_title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardNotEnrolledBottomSheet.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardNotEnrolledBottomSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardNotEnrolledBottomSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardNotEnrolledBottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                int iEncodedSizeWithTag = size + AdvisorDashboardNotEnrolledBottomSheetValueProp.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getValue_props());
                if (!Intrinsics.areEqual(value.getDisclaimer(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclaimer());
                }
                return !Intrinsics.areEqual(value.getDismiss_title(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDismiss_title()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardNotEnrolledBottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                AdvisorDashboardNotEnrolledBottomSheetValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValue_props());
                if (!Intrinsics.areEqual(value.getDisclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclaimer());
                }
                if (!Intrinsics.areEqual(value.getDismiss_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDismiss_title());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardNotEnrolledBottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDismiss_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDismiss_title());
                }
                if (!Intrinsics.areEqual(value.getDisclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclaimer());
                }
                AdvisorDashboardNotEnrolledBottomSheetValueProp.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValue_props());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardNotEnrolledBottomSheet decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorDashboardNotEnrolledBottomSheet(strDecode, strDecode2, arrayList, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(AdvisorDashboardNotEnrolledBottomSheetValueProp.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardNotEnrolledBottomSheet redact(AdvisorDashboardNotEnrolledBottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisorDashboardNotEnrolledBottomSheet.copy$default(value, null, null, Internal.m26823redactElements(value.getValue_props(), AdvisorDashboardNotEnrolledBottomSheetValueProp.ADAPTER), null, null, ByteString.EMPTY, 27, null);
            }
        };
    }
}
