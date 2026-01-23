package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: AdvisoryInsightContentViewModelDashboardHighlight.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelDashboardHighlight;", "Lcom/squareup/wire/Message;", "", "icon", "", "title_markdown", "deeplink", "logging_identifier", "top_line_text", "remote_icon", "Ladvisory/proto/v1/RemoteIcon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/RemoteIcon;Lokio/ByteString;)V", "getIcon", "()Ljava/lang/String;", "getTitle_markdown", "getDeeplink", "getLogging_identifier", "getTop_line_text", "getRemote_icon", "()Ladvisory/proto/v1/RemoteIcon;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelDashboardHighlight extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModelDashboardHighlight> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String logging_identifier;

    @WireField(adapter = "advisory.proto.v1.RemoteIcon#ADAPTER", jsonName = "remoteIcon", schemaIndex = 5, tag = 6)
    private final RemoteIcon remote_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "topLineText", schemaIndex = 4, tag = 5)
    private final String top_line_text;

    public AdvisoryInsightContentViewModelDashboardHighlight() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ AdvisoryInsightContentViewModelDashboardHighlight(String str, String str2, String str3, String str4, String str5, RemoteIcon remoteIcon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : remoteIcon, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4394newBuilder();
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle_markdown() {
        return this.title_markdown;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getTop_line_text() {
        return this.top_line_text;
    }

    public final RemoteIcon getRemote_icon() {
        return this.remote_icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelDashboardHighlight(String icon, String title_markdown, String deeplink, String logging_identifier, String str, RemoteIcon remoteIcon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.title_markdown = title_markdown;
        this.deeplink = deeplink;
        this.logging_identifier = logging_identifier;
        this.top_line_text = str;
        this.remote_icon = remoteIcon;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4394newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModelDashboardHighlight)) {
            return false;
        }
        AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight = (AdvisoryInsightContentViewModelDashboardHighlight) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModelDashboardHighlight.unknownFields()) && Intrinsics.areEqual(this.icon, advisoryInsightContentViewModelDashboardHighlight.icon) && Intrinsics.areEqual(this.title_markdown, advisoryInsightContentViewModelDashboardHighlight.title_markdown) && Intrinsics.areEqual(this.deeplink, advisoryInsightContentViewModelDashboardHighlight.deeplink) && Intrinsics.areEqual(this.logging_identifier, advisoryInsightContentViewModelDashboardHighlight.logging_identifier) && Intrinsics.areEqual(this.top_line_text, advisoryInsightContentViewModelDashboardHighlight.top_line_text) && Intrinsics.areEqual(this.remote_icon, advisoryInsightContentViewModelDashboardHighlight.remote_icon);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37) + this.title_markdown.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37;
        String str = this.top_line_text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        RemoteIcon remoteIcon = this.remote_icon;
        int iHashCode3 = iHashCode2 + (remoteIcon != null ? remoteIcon.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        arrayList.add("title_markdown=" + Internal.sanitize(this.title_markdown));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        String str = this.top_line_text;
        if (str != null) {
            arrayList.add("top_line_text=" + Internal.sanitize(str));
        }
        RemoteIcon remoteIcon = this.remote_icon;
        if (remoteIcon != null) {
            arrayList.add("remote_icon=" + remoteIcon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModelDashboardHighlight{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightContentViewModelDashboardHighlight copy$default(AdvisoryInsightContentViewModelDashboardHighlight advisoryInsightContentViewModelDashboardHighlight, String str, String str2, String str3, String str4, String str5, RemoteIcon remoteIcon, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightContentViewModelDashboardHighlight.icon;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightContentViewModelDashboardHighlight.title_markdown;
        }
        if ((i & 4) != 0) {
            str3 = advisoryInsightContentViewModelDashboardHighlight.deeplink;
        }
        if ((i & 8) != 0) {
            str4 = advisoryInsightContentViewModelDashboardHighlight.logging_identifier;
        }
        if ((i & 16) != 0) {
            str5 = advisoryInsightContentViewModelDashboardHighlight.top_line_text;
        }
        if ((i & 32) != 0) {
            remoteIcon = advisoryInsightContentViewModelDashboardHighlight.remote_icon;
        }
        if ((i & 64) != 0) {
            byteString = advisoryInsightContentViewModelDashboardHighlight.unknownFields();
        }
        RemoteIcon remoteIcon2 = remoteIcon;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return advisoryInsightContentViewModelDashboardHighlight.copy(str, str2, str7, str4, str6, remoteIcon2, byteString2);
    }

    public final AdvisoryInsightContentViewModelDashboardHighlight copy(String icon, String title_markdown, String deeplink, String logging_identifier, String top_line_text, RemoteIcon remote_icon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModelDashboardHighlight(icon, title_markdown, deeplink, logging_identifier, top_line_text, remote_icon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModelDashboardHighlight.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModelDashboardHighlight>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelDashboardHighlight$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModelDashboardHighlight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle_markdown());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLogging_identifier());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTop_line_text()) + RemoteIcon.ADAPTER.encodedSizeWithTag(6, value.getRemote_icon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModelDashboardHighlight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle_markdown());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTop_line_text());
                RemoteIcon.ADAPTER.encodeWithTag(writer, 6, (int) value.getRemote_icon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModelDashboardHighlight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RemoteIcon.ADAPTER.encodeWithTag(writer, 6, (int) value.getRemote_icon());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getTop_line_text());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getTitle_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle_markdown());
                }
                if (Intrinsics.areEqual(value.getIcon(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getIcon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelDashboardHighlight redact(AdvisoryInsightContentViewModelDashboardHighlight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RemoteIcon remote_icon = value.getRemote_icon();
                return AdvisoryInsightContentViewModelDashboardHighlight.copy$default(value, null, null, null, null, null, remote_icon != null ? RemoteIcon.ADAPTER.redact(remote_icon) : null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelDashboardHighlight decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                RemoteIcon remoteIconDecode = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
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
                                remoteIconDecode = RemoteIcon.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisoryInsightContentViewModelDashboardHighlight(strDecode, strDecode5, strDecode2, strDecode3, strDecode4, remoteIconDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
