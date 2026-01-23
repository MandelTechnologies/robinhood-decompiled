package gold_flow.proto.p466v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
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

/* compiled from: StreamRouterMessageRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u001fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\b\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageRequest;", "Lcom/squareup/wire/Message;", "", "feature_id", "", "app_version", "exit_deeplink", "logging_source", "is_shown_in_tab", "", "sage_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getFeature_id", "()Ljava/lang/String;", "getApp_version", "getExit_deeplink", "getLogging_source", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSage_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)Lgold_flow/proto/v1/StreamRouterMessageRequest;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamRouterMessageRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamRouterMessageRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appVersion", schemaIndex = 1, tag = 2)
    private final String app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exitDeeplink", schemaIndex = 2, tag = 3)
    private final String exit_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "featureId", schemaIndex = 0, tag = 1)
    private final String feature_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isShownInTab", schemaIndex = 4, tag = 5)
    private final Boolean is_shown_in_tab;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, schemaIndex = 3, tag = 4)
    private final String logging_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sageId", schemaIndex = 5, tag = 6)
    private final String sage_id;

    public StreamRouterMessageRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28197newBuilder();
    }

    public final String getFeature_id() {
        return this.feature_id;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getExit_deeplink() {
        return this.exit_deeplink;
    }

    public final String getLogging_source() {
        return this.logging_source;
    }

    /* renamed from: is_shown_in_tab, reason: from getter */
    public final Boolean getIs_shown_in_tab() {
        return this.is_shown_in_tab;
    }

    public final String getSage_id() {
        return this.sage_id;
    }

    public /* synthetic */ StreamRouterMessageRequest(String str, String str2, String str3, String str4, Boolean bool, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamRouterMessageRequest(String str, String str2, String str3, String str4, Boolean bool, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.feature_id = str;
        this.app_version = str2;
        this.exit_deeplink = str3;
        this.logging_source = str4;
        this.is_shown_in_tab = bool;
        this.sage_id = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28197newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamRouterMessageRequest)) {
            return false;
        }
        StreamRouterMessageRequest streamRouterMessageRequest = (StreamRouterMessageRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamRouterMessageRequest.unknownFields()) && Intrinsics.areEqual(this.feature_id, streamRouterMessageRequest.feature_id) && Intrinsics.areEqual(this.app_version, streamRouterMessageRequest.app_version) && Intrinsics.areEqual(this.exit_deeplink, streamRouterMessageRequest.exit_deeplink) && Intrinsics.areEqual(this.logging_source, streamRouterMessageRequest.logging_source) && Intrinsics.areEqual(this.is_shown_in_tab, streamRouterMessageRequest.is_shown_in_tab) && Intrinsics.areEqual(this.sage_id, streamRouterMessageRequest.sage_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.feature_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.app_version;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.exit_deeplink;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.logging_source;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_shown_in_tab;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str5 = this.sage_id;
        int iHashCode7 = iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.feature_id;
        if (str != null) {
            arrayList.add("feature_id=" + Internal.sanitize(str));
        }
        String str2 = this.app_version;
        if (str2 != null) {
            arrayList.add("app_version=" + Internal.sanitize(str2));
        }
        String str3 = this.exit_deeplink;
        if (str3 != null) {
            arrayList.add("exit_deeplink=" + Internal.sanitize(str3));
        }
        String str4 = this.logging_source;
        if (str4 != null) {
            arrayList.add("logging_source=" + Internal.sanitize(str4));
        }
        Boolean bool = this.is_shown_in_tab;
        if (bool != null) {
            arrayList.add("is_shown_in_tab=" + bool);
        }
        String str5 = this.sage_id;
        if (str5 != null) {
            arrayList.add("sage_id=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamRouterMessageRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamRouterMessageRequest copy$default(StreamRouterMessageRequest streamRouterMessageRequest, String str, String str2, String str3, String str4, Boolean bool, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamRouterMessageRequest.feature_id;
        }
        if ((i & 2) != 0) {
            str2 = streamRouterMessageRequest.app_version;
        }
        if ((i & 4) != 0) {
            str3 = streamRouterMessageRequest.exit_deeplink;
        }
        if ((i & 8) != 0) {
            str4 = streamRouterMessageRequest.logging_source;
        }
        if ((i & 16) != 0) {
            bool = streamRouterMessageRequest.is_shown_in_tab;
        }
        if ((i & 32) != 0) {
            str5 = streamRouterMessageRequest.sage_id;
        }
        if ((i & 64) != 0) {
            byteString = streamRouterMessageRequest.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        Boolean bool2 = bool;
        String str7 = str3;
        return streamRouterMessageRequest.copy(str, str2, str7, str4, bool2, str6, byteString2);
    }

    public final StreamRouterMessageRequest copy(String feature_id, String app_version, String exit_deeplink, String logging_source, Boolean is_shown_in_tab, String sage_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamRouterMessageRequest(feature_id, app_version, exit_deeplink, logging_source, is_shown_in_tab, sage_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamRouterMessageRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamRouterMessageRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamRouterMessageRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamRouterMessageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getFeature_id()) + protoAdapter.encodedSizeWithTag(2, value.getApp_version()) + protoAdapter.encodedSizeWithTag(3, value.getExit_deeplink()) + protoAdapter.encodedSizeWithTag(4, value.getLogging_source()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getIs_shown_in_tab()) + protoAdapter.encodedSizeWithTag(6, value.getSage_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamRouterMessageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFeature_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getApp_version());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getExit_deeplink());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLogging_source());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_shown_in_tab());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSage_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamRouterMessageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSage_id());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getIs_shown_in_tab());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLogging_source());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getExit_deeplink());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getApp_version());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFeature_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamRouterMessageRequest redact(StreamRouterMessageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamRouterMessageRequest.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamRouterMessageRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                Boolean boolDecode = null;
                String strDecode5 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamRouterMessageRequest(strDecode, strDecode2, strDecode3, strDecode4, boolDecode, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
