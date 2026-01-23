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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AdvisorMatchCard.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchCard;", "Lcom/squareup/wire/Message;", "", "id", "", "video_url", "name", "subtitle", ErrorBundle.SUMMARY_ENTRY, "next_meeting", "advisor_details", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getVideo_url", "getName", "getSubtitle", "getSummary", "getNext_meeting", "getAdvisor_details", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMatchCard extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorMatchCard> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetails#ADAPTER", jsonName = "advisorDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final AdvisorDetails advisor_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextMeeting", schemaIndex = 5, tag = 6)
    private final String next_meeting;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String video_url;

    public AdvisorMatchCard() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ AdvisorMatchCard(String str, String str2, String str3, String str4, String str5, String str6, AdvisorDetails advisorDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : advisorDetails, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8759newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getNext_meeting() {
        return this.next_meeting;
    }

    public final AdvisorDetails getAdvisor_details() {
        return this.advisor_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMatchCard(String id, String video_url, String name, String subtitle, String summary, String str, AdvisorDetails advisorDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.video_url = video_url;
        this.name = name;
        this.subtitle = subtitle;
        this.summary = summary;
        this.next_meeting = str;
        this.advisor_details = advisorDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8759newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorMatchCard)) {
            return false;
        }
        AdvisorMatchCard advisorMatchCard = (AdvisorMatchCard) other;
        return Intrinsics.areEqual(unknownFields(), advisorMatchCard.unknownFields()) && Intrinsics.areEqual(this.id, advisorMatchCard.id) && Intrinsics.areEqual(this.video_url, advisorMatchCard.video_url) && Intrinsics.areEqual(this.name, advisorMatchCard.name) && Intrinsics.areEqual(this.subtitle, advisorMatchCard.subtitle) && Intrinsics.areEqual(this.summary, advisorMatchCard.summary) && Intrinsics.areEqual(this.next_meeting, advisorMatchCard.next_meeting) && Intrinsics.areEqual(this.advisor_details, advisorMatchCard.advisor_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.video_url.hashCode()) * 37) + this.name.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.summary.hashCode()) * 37;
        String str = this.next_meeting;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        AdvisorDetails advisorDetails = this.advisor_details;
        int iHashCode3 = iHashCode2 + (advisorDetails != null ? advisorDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("video_url=" + Internal.sanitize(this.video_url));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("summary=" + Internal.sanitize(this.summary));
        String str = this.next_meeting;
        if (str != null) {
            arrayList.add("next_meeting=" + Internal.sanitize(str));
        }
        AdvisorDetails advisorDetails = this.advisor_details;
        if (advisorDetails != null) {
            arrayList.add("advisor_details=" + advisorDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorMatchCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorMatchCard copy$default(AdvisorMatchCard advisorMatchCard, String str, String str2, String str3, String str4, String str5, String str6, AdvisorDetails advisorDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorMatchCard.id;
        }
        if ((i & 2) != 0) {
            str2 = advisorMatchCard.video_url;
        }
        if ((i & 4) != 0) {
            str3 = advisorMatchCard.name;
        }
        if ((i & 8) != 0) {
            str4 = advisorMatchCard.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = advisorMatchCard.summary;
        }
        if ((i & 32) != 0) {
            str6 = advisorMatchCard.next_meeting;
        }
        if ((i & 64) != 0) {
            advisorDetails = advisorMatchCard.advisor_details;
        }
        if ((i & 128) != 0) {
            byteString = advisorMatchCard.unknownFields();
        }
        AdvisorDetails advisorDetails2 = advisorDetails;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        return advisorMatchCard.copy(str, str2, str3, str4, str7, str8, advisorDetails2, byteString2);
    }

    public final AdvisorMatchCard copy(String id, String video_url, String name, String subtitle, String summary, String next_meeting, AdvisorDetails advisor_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorMatchCard(id, video_url, name, subtitle, summary, next_meeting, advisor_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorMatchCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorMatchCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorMatchCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVideo_url());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSummary());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getNext_meeting());
                return value.getAdvisor_details() != null ? iEncodedSizeWithTag + AdvisorDetails.ADAPTER.encodedSizeWithTag(7, value.getAdvisor_details()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorMatchCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVideo_url());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSummary());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getNext_meeting());
                if (value.getAdvisor_details() != null) {
                    AdvisorDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdvisor_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorMatchCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAdvisor_details() != null) {
                    AdvisorDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getAdvisor_details());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getNext_meeting());
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getSummary());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getVideo_url());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchCard redact(AdvisorMatchCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDetails advisor_details = value.getAdvisor_details();
                return AdvisorMatchCard.copy$default(value, null, null, null, null, null, null, advisor_details != null ? AdvisorDetails.ADAPTER.redact(advisor_details) : null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMatchCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = null;
                AdvisorDetails advisorDetailsDecode = null;
                String strDecode6 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                advisorDetailsDecode = AdvisorDetails.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisorMatchCard(strDecode, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, advisorDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
