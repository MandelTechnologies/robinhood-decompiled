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
import p479j$.time.Instant;
import yoda.service.insight.InsightPageType;
import yoda.service.insight.InsightType;

/* compiled from: AdvisoryInsight.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016Bk\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 Jq\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b2\u0010 R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00067"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsight;", "Lcom/squareup/wire/Message;", "", "Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "content_view_model", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "id", "", "is_seen", "", "priority", "Lyoda/service/insight/InsightType;", "insight_type", "account_number", "Lyoda/service/insight/InsightPageType;", "page_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModel;Lj$/time/Instant;Ljava/lang/String;ZILyoda/service/insight/InsightType;Ljava/lang/String;Lyoda/service/insight/InsightPageType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModel;Lj$/time/Instant;Ljava/lang/String;ZILyoda/service/insight/InsightType;Ljava/lang/String;Lyoda/service/insight/InsightPageType;Lokio/ByteString;)Ladvisory/proto/v1/AdvisoryInsight;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "getContent_view_model", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModel;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Ljava/lang/String;", "getId", "Z", "()Z", "I", "getPriority", "Lyoda/service/insight/InsightType;", "getInsight_type", "()Lyoda/service/insight/InsightType;", "getAccount_number", "Lyoda/service/insight/InsightPageType;", "getPage_type", "()Lyoda/service/insight/InsightPageType;", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryInsight extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsight> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsightContentViewModel#ADAPTER", jsonName = "contentViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AdvisoryInsightContentViewModel content_view_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String id;

    @WireField(adapter = "yoda.service.insight.InsightType#ADAPTER", jsonName = "insightType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InsightType insight_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSeen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_seen;

    @WireField(adapter = "yoda.service.insight.InsightPageType#ADAPTER", jsonName = "pageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final InsightPageType page_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int priority;

    public AdvisoryInsight() {
        this(null, null, null, false, 0, null, null, null, null, 511, null);
    }

    public /* synthetic */ AdvisoryInsight(AdvisoryInsightContentViewModel advisoryInsightContentViewModel, Instant instant, String str, boolean z, int i, InsightType insightType, String str2, InsightPageType insightPageType, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : advisoryInsightContentViewModel, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? InsightType.INSIGHT_TYPE_UNSPECIFIED : insightType, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? InsightPageType.INSIGHT_PAGE_TYPE_UNSPECIFIED : insightPageType, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4380newBuilder();
    }

    public final AdvisoryInsightContentViewModel getContent_view_model() {
        return this.content_view_model;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: is_seen, reason: from getter */
    public final boolean getIs_seen() {
        return this.is_seen;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final InsightType getInsight_type() {
        return this.insight_type;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final InsightPageType getPage_type() {
        return this.page_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsight(AdvisoryInsightContentViewModel advisoryInsightContentViewModel, Instant instant, String id, boolean z, int i, InsightType insight_type, String account_number, InsightPageType page_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(insight_type, "insight_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content_view_model = advisoryInsightContentViewModel;
        this.created_at = instant;
        this.id = id;
        this.is_seen = z;
        this.priority = i;
        this.insight_type = insight_type;
        this.account_number = account_number;
        this.page_type = page_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4380newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsight)) {
            return false;
        }
        AdvisoryInsight advisoryInsight = (AdvisoryInsight) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsight.unknownFields()) && Intrinsics.areEqual(this.content_view_model, advisoryInsight.content_view_model) && Intrinsics.areEqual(this.created_at, advisoryInsight.created_at) && Intrinsics.areEqual(this.id, advisoryInsight.id) && this.is_seen == advisoryInsight.is_seen && this.priority == advisoryInsight.priority && this.insight_type == advisoryInsight.insight_type && Intrinsics.areEqual(this.account_number, advisoryInsight.account_number) && this.page_type == advisoryInsight.page_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisoryInsightContentViewModel advisoryInsightContentViewModel = this.content_view_model;
        int iHashCode2 = (iHashCode + (advisoryInsightContentViewModel != null ? advisoryInsightContentViewModel.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode3 = ((((((((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.id.hashCode()) * 37) + Boolean.hashCode(this.is_seen)) * 37) + Integer.hashCode(this.priority)) * 37) + this.insight_type.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.page_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisoryInsightContentViewModel advisoryInsightContentViewModel = this.content_view_model;
        if (advisoryInsightContentViewModel != null) {
            arrayList.add("content_view_model=" + advisoryInsightContentViewModel);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("is_seen=" + this.is_seen);
        arrayList.add("priority=" + this.priority);
        arrayList.add("insight_type=" + this.insight_type);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("page_type=" + this.page_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsight{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsight copy$default(AdvisoryInsight advisoryInsight, AdvisoryInsightContentViewModel advisoryInsightContentViewModel, Instant instant, String str, boolean z, int i, InsightType insightType, String str2, InsightPageType insightPageType, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            advisoryInsightContentViewModel = advisoryInsight.content_view_model;
        }
        if ((i2 & 2) != 0) {
            instant = advisoryInsight.created_at;
        }
        if ((i2 & 4) != 0) {
            str = advisoryInsight.id;
        }
        if ((i2 & 8) != 0) {
            z = advisoryInsight.is_seen;
        }
        if ((i2 & 16) != 0) {
            i = advisoryInsight.priority;
        }
        if ((i2 & 32) != 0) {
            insightType = advisoryInsight.insight_type;
        }
        if ((i2 & 64) != 0) {
            str2 = advisoryInsight.account_number;
        }
        if ((i2 & 128) != 0) {
            insightPageType = advisoryInsight.page_type;
        }
        if ((i2 & 256) != 0) {
            byteString = advisoryInsight.unknownFields();
        }
        InsightPageType insightPageType2 = insightPageType;
        ByteString byteString2 = byteString;
        InsightType insightType2 = insightType;
        String str3 = str2;
        int i3 = i;
        String str4 = str;
        return advisoryInsight.copy(advisoryInsightContentViewModel, instant, str4, z, i3, insightType2, str3, insightPageType2, byteString2);
    }

    public final AdvisoryInsight copy(AdvisoryInsightContentViewModel content_view_model, Instant created_at, String id, boolean is_seen, int priority, InsightType insight_type, String account_number, InsightPageType page_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(insight_type, "insight_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsight(content_view_model, created_at, id, is_seen, priority, insight_type, account_number, page_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsight.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsight>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsight$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent_view_model() != null) {
                    size += AdvisoryInsightContentViewModel.ADAPTER.encodedSizeWithTag(1, value.getContent_view_model());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getId());
                }
                if (value.getIs_seen()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_seen()));
                }
                if (value.getPriority() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getPriority()));
                }
                if (value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED) {
                    size += InsightType.ADAPTER.encodedSizeWithTag(6, value.getInsight_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAccount_number());
                }
                return value.getPage_type() != InsightPageType.INSIGHT_PAGE_TYPE_UNSPECIFIED ? size + InsightPageType.ADAPTER.encodedSizeWithTag(8, value.getPage_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent_view_model() != null) {
                    AdvisoryInsightContentViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent_view_model());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (value.getIs_seen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_seen()));
                }
                if (value.getPriority() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPriority()));
                }
                if (value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED) {
                    InsightType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInsight_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAccount_number());
                }
                if (value.getPage_type() != InsightPageType.INSIGHT_PAGE_TYPE_UNSPECIFIED) {
                    InsightPageType.ADAPTER.encodeWithTag(writer, 8, (int) value.getPage_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPage_type() != InsightPageType.INSIGHT_PAGE_TYPE_UNSPECIFIED) {
                    InsightPageType.ADAPTER.encodeWithTag(writer, 8, (int) value.getPage_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAccount_number());
                }
                if (value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED) {
                    InsightType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInsight_type());
                }
                if (value.getPriority() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPriority()));
                }
                if (value.getIs_seen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_seen()));
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (value.getContent_view_model() != null) {
                    AdvisoryInsightContentViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent_view_model());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsight decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InsightType insightTypeDecode = InsightType.INSIGHT_TYPE_UNSPECIFIED;
                InsightPageType insightPageType = InsightPageType.INSIGHT_PAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                AdvisoryInsightContentViewModel advisoryInsightContentViewModelDecode = null;
                Instant instantDecode = null;
                InsightPageType insightPageTypeDecode = insightPageType;
                while (true) {
                    InsightType insightType = insightTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    advisoryInsightContentViewModelDecode = AdvisoryInsightContentViewModel.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 5:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    try {
                                        insightTypeDecode = InsightType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 7:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    try {
                                        insightPageTypeDecode = InsightPageType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new AdvisoryInsight(advisoryInsightContentViewModelDecode, instantDecode, strDecode, zBooleanValue, iIntValue, insightType, strDecode2, insightPageTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsight redact(AdvisoryInsight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryInsightContentViewModel content_view_model = value.getContent_view_model();
                AdvisoryInsightContentViewModel advisoryInsightContentViewModelRedact = content_view_model != null ? AdvisoryInsightContentViewModel.ADAPTER.redact(content_view_model) : null;
                Instant created_at = value.getCreated_at();
                return AdvisoryInsight.copy$default(value, advisoryInsightContentViewModelRedact, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, null, false, 0, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            }
        };
    }
}
