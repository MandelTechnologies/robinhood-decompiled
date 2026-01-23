package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: SelfServeFlowDetails.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0006H\u0016J¤\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00064"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetails;", "Lcom/squareup/wire/Message;", "", "id", "", "flow_id", "", "deploy", "internal_label", "created_at", "image_url", "Lcom/robinhood/chatbot/proto/v1/ImageConfig;", "content", "cta_label", "deeplink", "tags", "", "chatbot_content", "chatbot_cta_label", "interstitial_content", "interstitial_cta_label", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ImageConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()I", "getFlow_id", "()Ljava/lang/String;", "getDeploy", "getInternal_label", "getCreated_at", "getImage_url", "()Lcom/robinhood/chatbot/proto/v1/ImageConfig;", "getContent", "getCta_label", "getDeeplink", "getChatbot_content", "getChatbot_cta_label", "getInterstitial_content", "getInterstitial_cta_label", "getTags", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SelfServeFlowDetails extends Message {

    @JvmField
    public static final ProtoAdapter<SelfServeFlowDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String chatbot_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String chatbot_cta_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String cta_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deploy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String flow_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ImageConfig#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ImageConfig image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String internal_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String interstitial_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String interstitial_cta_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<String> tags;

    public SelfServeFlowDetails() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ SelfServeFlowDetails(int i, String str, String str2, String str3, String str4, ImageConfig imageConfig, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : imageConfig, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) == 0 ? str11 : "", (i2 & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20545newBuilder();
    }

    public final int getId() {
        return this.id;
    }

    public final String getFlow_id() {
        return this.flow_id;
    }

    public final String getDeploy() {
        return this.deploy;
    }

    public final String getInternal_label() {
        return this.internal_label;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final ImageConfig getImage_url() {
        return this.image_url;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCta_label() {
        return this.cta_label;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getChatbot_content() {
        return this.chatbot_content;
    }

    public final String getChatbot_cta_label() {
        return this.chatbot_cta_label;
    }

    public final String getInterstitial_content() {
        return this.interstitial_content;
    }

    public final String getInterstitial_cta_label() {
        return this.interstitial_cta_label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServeFlowDetails(int i, String flow_id, String deploy, String internal_label, String created_at, ImageConfig imageConfig, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(deploy, "deploy");
        Intrinsics.checkNotNullParameter(internal_label, "internal_label");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(cta_label, "cta_label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(chatbot_content, "chatbot_content");
        Intrinsics.checkNotNullParameter(chatbot_cta_label, "chatbot_cta_label");
        Intrinsics.checkNotNullParameter(interstitial_content, "interstitial_content");
        Intrinsics.checkNotNullParameter(interstitial_cta_label, "interstitial_cta_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = i;
        this.flow_id = flow_id;
        this.deploy = deploy;
        this.internal_label = internal_label;
        this.created_at = created_at;
        this.image_url = imageConfig;
        this.content = content;
        this.cta_label = cta_label;
        this.deeplink = deeplink;
        this.chatbot_content = chatbot_content;
        this.chatbot_cta_label = chatbot_cta_label;
        this.interstitial_content = interstitial_content;
        this.interstitial_cta_label = interstitial_cta_label;
        this.tags = Internal.immutableCopyOf("tags", tags);
    }

    public final List<String> getTags() {
        return this.tags;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20545newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SelfServeFlowDetails)) {
            return false;
        }
        SelfServeFlowDetails selfServeFlowDetails = (SelfServeFlowDetails) other;
        return Intrinsics.areEqual(unknownFields(), selfServeFlowDetails.unknownFields()) && this.id == selfServeFlowDetails.id && Intrinsics.areEqual(this.flow_id, selfServeFlowDetails.flow_id) && Intrinsics.areEqual(this.deploy, selfServeFlowDetails.deploy) && Intrinsics.areEqual(this.internal_label, selfServeFlowDetails.internal_label) && Intrinsics.areEqual(this.created_at, selfServeFlowDetails.created_at) && Intrinsics.areEqual(this.image_url, selfServeFlowDetails.image_url) && Intrinsics.areEqual(this.content, selfServeFlowDetails.content) && Intrinsics.areEqual(this.cta_label, selfServeFlowDetails.cta_label) && Intrinsics.areEqual(this.deeplink, selfServeFlowDetails.deeplink) && Intrinsics.areEqual(this.tags, selfServeFlowDetails.tags) && Intrinsics.areEqual(this.chatbot_content, selfServeFlowDetails.chatbot_content) && Intrinsics.areEqual(this.chatbot_cta_label, selfServeFlowDetails.chatbot_cta_label) && Intrinsics.areEqual(this.interstitial_content, selfServeFlowDetails.interstitial_content) && Intrinsics.areEqual(this.interstitial_cta_label, selfServeFlowDetails.interstitial_cta_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.id)) * 37) + this.flow_id.hashCode()) * 37) + this.deploy.hashCode()) * 37) + this.internal_label.hashCode()) * 37) + this.created_at.hashCode()) * 37;
        ImageConfig imageConfig = this.image_url;
        int iHashCode2 = ((((((((((((((((iHashCode + (imageConfig != null ? imageConfig.hashCode() : 0)) * 37) + this.content.hashCode()) * 37) + this.cta_label.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.tags.hashCode()) * 37) + this.chatbot_content.hashCode()) * 37) + this.chatbot_cta_label.hashCode()) * 37) + this.interstitial_content.hashCode()) * 37) + this.interstitial_cta_label.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("flow_id=" + Internal.sanitize(this.flow_id));
        arrayList.add("deploy=" + Internal.sanitize(this.deploy));
        arrayList.add("internal_label=" + Internal.sanitize(this.internal_label));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        ImageConfig imageConfig = this.image_url;
        if (imageConfig != null) {
            arrayList.add("image_url=" + imageConfig);
        }
        arrayList.add("content=" + Internal.sanitize(this.content));
        arrayList.add("cta_label=" + Internal.sanitize(this.cta_label));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        if (!this.tags.isEmpty()) {
            arrayList.add("tags=" + Internal.sanitize(this.tags));
        }
        arrayList.add("chatbot_content=" + Internal.sanitize(this.chatbot_content));
        arrayList.add("chatbot_cta_label=" + Internal.sanitize(this.chatbot_cta_label));
        arrayList.add("interstitial_content=" + Internal.sanitize(this.interstitial_content));
        arrayList.add("interstitial_cta_label=" + Internal.sanitize(this.interstitial_cta_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelfServeFlowDetails{", "}", 0, null, null, 56, null);
    }

    public final SelfServeFlowDetails copy(int id, String flow_id, String deploy, String internal_label, String created_at, ImageConfig image_url, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(deploy, "deploy");
        Intrinsics.checkNotNullParameter(internal_label, "internal_label");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(cta_label, "cta_label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(chatbot_content, "chatbot_content");
        Intrinsics.checkNotNullParameter(chatbot_cta_label, "chatbot_cta_label");
        Intrinsics.checkNotNullParameter(interstitial_content, "interstitial_content");
        Intrinsics.checkNotNullParameter(interstitial_cta_label, "interstitial_cta_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SelfServeFlowDetails(id, flow_id, deploy, internal_label, created_at, image_url, content, cta_label, deeplink, tags, chatbot_content, chatbot_cta_label, interstitial_content, interstitial_cta_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelfServeFlowDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SelfServeFlowDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.SelfServeFlowDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelfServeFlowDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFlow_id());
                }
                if (!Intrinsics.areEqual(value.getDeploy(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeploy());
                }
                if (!Intrinsics.areEqual(value.getInternal_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInternal_label());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCreated_at());
                }
                if (value.getImage_url() != null) {
                    size += ImageConfig.ADAPTER.encodedSizeWithTag(6, value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getContent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getContent());
                }
                if (!Intrinsics.areEqual(value.getCta_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCta_label());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getDeeplink());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(10, value.getTags());
                if (!Intrinsics.areEqual(value.getChatbot_content(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(11, value.getChatbot_content());
                }
                if (!Intrinsics.areEqual(value.getChatbot_cta_label(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(12, value.getChatbot_cta_label());
                }
                if (!Intrinsics.areEqual(value.getInterstitial_content(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(13, value.getInterstitial_content());
                }
                return !Intrinsics.areEqual(value.getInterstitial_cta_label(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(14, value.getInterstitial_cta_label()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelfServeFlowDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFlow_id());
                }
                if (!Intrinsics.areEqual(value.getDeploy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeploy());
                }
                if (!Intrinsics.areEqual(value.getInternal_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInternal_label());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                if (value.getImage_url() != null) {
                    ImageConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getContent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getContent());
                }
                if (!Intrinsics.areEqual(value.getCta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCta_label());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getDeeplink());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getTags());
                if (!Intrinsics.areEqual(value.getChatbot_content(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getChatbot_content());
                }
                if (!Intrinsics.areEqual(value.getChatbot_cta_label(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getChatbot_cta_label());
                }
                if (!Intrinsics.areEqual(value.getInterstitial_content(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getInterstitial_content());
                }
                if (!Intrinsics.areEqual(value.getInterstitial_cta_label(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getInterstitial_cta_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelfServeFlowDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInterstitial_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getInterstitial_cta_label());
                }
                if (!Intrinsics.areEqual(value.getInterstitial_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getInterstitial_content());
                }
                if (!Intrinsics.areEqual(value.getChatbot_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getChatbot_cta_label());
                }
                if (!Intrinsics.areEqual(value.getChatbot_content(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getChatbot_content());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getTags());
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getCta_label(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getCta_label());
                }
                if (!Intrinsics.areEqual(value.getContent(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getContent());
                }
                if (value.getImage_url() != null) {
                    ImageConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getInternal_label(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getInternal_label());
                }
                if (!Intrinsics.areEqual(value.getDeploy(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDeploy());
                }
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getFlow_id());
                }
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SelfServeFlowDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                ImageConfig imageConfigDecode = null;
                String strDecode11 = strDecode10;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                imageConfigDecode = ImageConfig.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new SelfServeFlowDetails(iIntValue, str, strDecode11, strDecode2, strDecode3, imageConfigDecode, strDecode4, strDecode5, strDecode6, arrayList, strDecode7, strDecode8, strDecode9, strDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelfServeFlowDetails redact(SelfServeFlowDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ImageConfig image_url = value.getImage_url();
                return value.copy((16351 & 1) != 0 ? value.id : 0, (16351 & 2) != 0 ? value.flow_id : null, (16351 & 4) != 0 ? value.deploy : null, (16351 & 8) != 0 ? value.internal_label : null, (16351 & 16) != 0 ? value.created_at : null, (16351 & 32) != 0 ? value.image_url : image_url != null ? ImageConfig.ADAPTER.redact(image_url) : null, (16351 & 64) != 0 ? value.content : null, (16351 & 128) != 0 ? value.cta_label : null, (16351 & 256) != 0 ? value.deeplink : null, (16351 & 512) != 0 ? value.tags : null, (16351 & 1024) != 0 ? value.chatbot_content : null, (16351 & 2048) != 0 ? value.chatbot_cta_label : null, (16351 & 4096) != 0 ? value.interstitial_content : null, (16351 & 8192) != 0 ? value.interstitial_cta_label : null, (16351 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
