package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ImageConfigDto;
import com.robinhood.chatbot.proto.p285v1.SelfServeFlowDetailsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: SelfServeFlowDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;<=>B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u009d\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u001aJ\u009a\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000bJ\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u000bH\u0016J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u00020\tH\u0016J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001e¨\u0006?"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate;)V", "id", "", "flow_id", "", "deploy", "internal_label", "created_at", "image_url", "Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;", "content", "cta_label", "deeplink", "tags", "", "chatbot_content", "chatbot_cta_label", "interstitial_content", "interstitial_cta_label", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getFlow_id", "()Ljava/lang/String;", "getDeploy", "getInternal_label", "getCreated_at", "getImage_url", "()Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;", "getContent", "getCta_label", "getDeeplink", "getTags", "()Ljava/util/List;", "getChatbot_content", "getChatbot_cta_label", "getInterstitial_content", "getInterstitial_cta_label", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class SelfServeFlowDetailsDto implements Dto3<SelfServeFlowDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SelfServeFlowDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SelfServeFlowDetailsDto, SelfServeFlowDetails>> binaryBase64Serializer$delegate;
    private static final SelfServeFlowDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SelfServeFlowDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SelfServeFlowDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getId() {
        return this.surrogate.getId();
    }

    public final String getFlow_id() {
        return this.surrogate.getFlow_id();
    }

    public final String getDeploy() {
        return this.surrogate.getDeploy();
    }

    public final String getInternal_label() {
        return this.surrogate.getInternal_label();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final ImageConfigDto getImage_url() {
        return this.surrogate.getImage_url();
    }

    public final String getContent() {
        return this.surrogate.getContent();
    }

    public final String getCta_label() {
        return this.surrogate.getCta_label();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final List<String> getTags() {
        return this.surrogate.getTags();
    }

    public final String getChatbot_content() {
        return this.surrogate.getChatbot_content();
    }

    public final String getChatbot_cta_label() {
        return this.surrogate.getChatbot_cta_label();
    }

    public final String getInterstitial_content() {
        return this.surrogate.getInterstitial_content();
    }

    public final String getInterstitial_cta_label() {
        return this.surrogate.getInterstitial_cta_label();
    }

    public /* synthetic */ SelfServeFlowDetailsDto(int i, String str, String str2, String str3, String str4, ImageConfigDto imageConfigDto, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : imageConfigDto, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfServeFlowDetailsDto(int i, String flow_id, String deploy, String internal_label, String created_at, ImageConfigDto imageConfigDto, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label) {
        this(new Surrogate(i, flow_id, deploy, internal_label, created_at, imageConfigDto, content, cta_label, deeplink, tags, chatbot_content, chatbot_cta_label, interstitial_content, interstitial_cta_label));
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
    }

    public final SelfServeFlowDetailsDto copy(int id, String flow_id, String deploy, String internal_label, String created_at, ImageConfigDto image_url, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label) {
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
        return new SelfServeFlowDetailsDto(new Surrogate(id, flow_id, deploy, internal_label, created_at, image_url, content, cta_label, deeplink, tags, chatbot_content, chatbot_cta_label, interstitial_content, interstitial_cta_label));
    }

    @Override // com.robinhood.idl.Dto
    public SelfServeFlowDetails toProto() {
        int id = this.surrogate.getId();
        String flow_id = this.surrogate.getFlow_id();
        String deploy = this.surrogate.getDeploy();
        String internal_label = this.surrogate.getInternal_label();
        String created_at = this.surrogate.getCreated_at();
        ImageConfigDto image_url = this.surrogate.getImage_url();
        ImageConfig proto = image_url != null ? image_url.toProto() : null;
        String content = this.surrogate.getContent();
        String cta_label = this.surrogate.getCta_label();
        String deeplink = this.surrogate.getDeeplink();
        List<String> tags = this.surrogate.getTags();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tags, 10));
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new SelfServeFlowDetails(id, flow_id, deploy, internal_label, created_at, proto, content, cta_label, deeplink, arrayList, this.surrogate.getChatbot_content(), this.surrogate.getChatbot_cta_label(), this.surrogate.getInterstitial_content(), this.surrogate.getInterstitial_cta_label(), null, 16384, null);
    }

    public String toString() {
        return "[SelfServeFlowDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SelfServeFlowDetailsDto) && Intrinsics.areEqual(((SelfServeFlowDetailsDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelfServeFlowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002Z[Bª\u0001\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018B«\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001cJ\u0018\u0010>\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u0012HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J¬\u0001\u0010L\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\bHÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\t\u0010Q\u001a\u00020\bHÖ\u0001J%\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\bYR+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010#R\u001c\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010#R\u001c\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010#R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010#R\u001c\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010#R\u001c\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010#R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105R\u001c\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010#R\u001c\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010#R\u001c\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010#R\u001c\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010#¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate;", "", "id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "flow_id", "", "deploy", "internal_label", "created_at", "image_url", "Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;", "content", "cta_label", "deeplink", "tags", "", "chatbot_content", "chatbot_cta_label", "interstitial_content", "interstitial_cta_label", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()I", "getFlow_id$annotations", "getFlow_id", "()Ljava/lang/String;", "getDeploy$annotations", "getDeploy", "getInternal_label$annotations", "getInternal_label", "getCreated_at$annotations", "getCreated_at", "getImage_url$annotations", "getImage_url", "()Lcom/robinhood/chatbot/proto/v1/ImageConfigDto;", "getContent$annotations", "getContent", "getCta_label$annotations", "getCta_label", "getDeeplink$annotations", "getDeeplink", "getTags$annotations", "getTags", "()Ljava/util/List;", "getChatbot_content$annotations", "getChatbot_content", "getChatbot_cta_label$annotations", "getChatbot_cta_label", "getInterstitial_content$annotations", "getInterstitial_content", "getInterstitial_cta_label$annotations", "getInterstitial_cta_label", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String chatbot_content;
        private final String chatbot_cta_label;
        private final String content;
        private final String created_at;
        private final String cta_label;
        private final String deeplink;
        private final String deploy;
        private final String flow_id;
        private final int id;
        private final ImageConfigDto image_url;
        private final String internal_label;
        private final String interstitial_content;
        private final String interstitial_cta_label;
        private final List<String> tags;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.SelfServeFlowDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfServeFlowDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this(0, (String) null, (String) null, (String) null, (String) null, (ImageConfigDto) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        @SerialName("chatbot_content")
        @JsonAnnotations2(names = {"chatbot_content"})
        public static /* synthetic */ void getChatbot_content$annotations() {
        }

        @SerialName("chatbot_cta_label")
        @JsonAnnotations2(names = {"chatbot_cta_label"})
        public static /* synthetic */ void getChatbot_cta_label$annotations() {
        }

        @SerialName("content")
        @JsonAnnotations2(names = {"content"})
        public static /* synthetic */ void getContent$annotations() {
        }

        @SerialName("created_at")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("cta_label")
        @JsonAnnotations2(names = {"cta_label"})
        public static /* synthetic */ void getCta_label$annotations() {
        }

        @SerialName("deeplink")
        @JsonAnnotations2(names = {"deeplink"})
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @SerialName("deploy")
        @JsonAnnotations2(names = {"deploy"})
        public static /* synthetic */ void getDeploy$annotations() {
        }

        @SerialName("flow_id")
        @JsonAnnotations2(names = {"flow_id"})
        public static /* synthetic */ void getFlow_id$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("image_url")
        @JsonAnnotations2(names = {"image_url"})
        public static /* synthetic */ void getImage_url$annotations() {
        }

        @SerialName("internal_label")
        @JsonAnnotations2(names = {"internal_label"})
        public static /* synthetic */ void getInternal_label$annotations() {
        }

        @SerialName("interstitial_content")
        @JsonAnnotations2(names = {"interstitial_content"})
        public static /* synthetic */ void getInterstitial_content$annotations() {
        }

        @SerialName("interstitial_cta_label")
        @JsonAnnotations2(names = {"interstitial_cta_label"})
        public static /* synthetic */ void getInterstitial_cta_label$annotations() {
        }

        @SerialName("tags")
        @JsonAnnotations2(names = {"tags"})
        public static /* synthetic */ void getTags$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final List<String> component10() {
            return this.tags;
        }

        /* renamed from: component11, reason: from getter */
        public final String getChatbot_content() {
            return this.chatbot_content;
        }

        /* renamed from: component12, reason: from getter */
        public final String getChatbot_cta_label() {
            return this.chatbot_cta_label;
        }

        /* renamed from: component13, reason: from getter */
        public final String getInterstitial_content() {
            return this.interstitial_content;
        }

        /* renamed from: component14, reason: from getter */
        public final String getInterstitial_cta_label() {
            return this.interstitial_cta_label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFlow_id() {
            return this.flow_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeploy() {
            return this.deploy;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInternal_label() {
            return this.internal_label;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component6, reason: from getter */
        public final ImageConfigDto getImage_url() {
            return this.image_url;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCta_label() {
            return this.cta_label;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Surrogate copy(int id, String flow_id, String deploy, String internal_label, String created_at, ImageConfigDto image_url, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label) {
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
            return new Surrogate(id, flow_id, deploy, internal_label, created_at, image_url, content, cta_label, deeplink, tags, chatbot_content, chatbot_cta_label, interstitial_content, interstitial_cta_label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.id == surrogate.id && Intrinsics.areEqual(this.flow_id, surrogate.flow_id) && Intrinsics.areEqual(this.deploy, surrogate.deploy) && Intrinsics.areEqual(this.internal_label, surrogate.internal_label) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.cta_label, surrogate.cta_label) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.tags, surrogate.tags) && Intrinsics.areEqual(this.chatbot_content, surrogate.chatbot_content) && Intrinsics.areEqual(this.chatbot_cta_label, surrogate.chatbot_cta_label) && Intrinsics.areEqual(this.interstitial_content, surrogate.interstitial_content) && Intrinsics.areEqual(this.interstitial_cta_label, surrogate.interstitial_cta_label);
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.id) * 31) + this.flow_id.hashCode()) * 31) + this.deploy.hashCode()) * 31) + this.internal_label.hashCode()) * 31) + this.created_at.hashCode()) * 31;
            ImageConfigDto imageConfigDto = this.image_url;
            return ((((((((((((((((iHashCode + (imageConfigDto == null ? 0 : imageConfigDto.hashCode())) * 31) + this.content.hashCode()) * 31) + this.cta_label.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.chatbot_content.hashCode()) * 31) + this.chatbot_cta_label.hashCode()) * 31) + this.interstitial_content.hashCode()) * 31) + this.interstitial_cta_label.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", flow_id=" + this.flow_id + ", deploy=" + this.deploy + ", internal_label=" + this.internal_label + ", created_at=" + this.created_at + ", image_url=" + this.image_url + ", content=" + this.content + ", cta_label=" + this.cta_label + ", deeplink=" + this.deeplink + ", tags=" + this.tags + ", chatbot_content=" + this.chatbot_content + ", chatbot_cta_label=" + this.chatbot_cta_label + ", interstitial_content=" + this.interstitial_content + ", interstitial_cta_label=" + this.interstitial_cta_label + ")";
        }

        /* compiled from: SelfServeFlowDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SelfServeFlowDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, ImageConfigDto imageConfigDto, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.flow_id = "";
            } else {
                this.flow_id = str;
            }
            if ((i & 4) == 0) {
                this.deploy = "";
            } else {
                this.deploy = str2;
            }
            if ((i & 8) == 0) {
                this.internal_label = "";
            } else {
                this.internal_label = str3;
            }
            if ((i & 16) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str4;
            }
            if ((i & 32) == 0) {
                this.image_url = null;
            } else {
                this.image_url = imageConfigDto;
            }
            if ((i & 64) == 0) {
                this.content = "";
            } else {
                this.content = str5;
            }
            if ((i & 128) == 0) {
                this.cta_label = "";
            } else {
                this.cta_label = str6;
            }
            if ((i & 256) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str7;
            }
            if ((i & 512) == 0) {
                this.tags = CollectionsKt.emptyList();
            } else {
                this.tags = list;
            }
            if ((i & 1024) == 0) {
                this.chatbot_content = "";
            } else {
                this.chatbot_content = str8;
            }
            if ((i & 2048) == 0) {
                this.chatbot_cta_label = "";
            } else {
                this.chatbot_cta_label = str9;
            }
            if ((i & 4096) == 0) {
                this.interstitial_content = "";
            } else {
                this.interstitial_content = str10;
            }
            if ((i & 8192) == 0) {
                this.interstitial_cta_label = "";
            } else {
                this.interstitial_cta_label = str11;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i = self.id;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.flow_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.flow_id);
            }
            if (!Intrinsics.areEqual(self.deploy, "")) {
                output.encodeStringElement(serialDesc, 2, self.deploy);
            }
            if (!Intrinsics.areEqual(self.internal_label, "")) {
                output.encodeStringElement(serialDesc, 3, self.internal_label);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 4, self.created_at);
            }
            ImageConfigDto imageConfigDto = self.image_url;
            if (imageConfigDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ImageConfigDto.Serializer.INSTANCE, imageConfigDto);
            }
            if (!Intrinsics.areEqual(self.content, "")) {
                output.encodeStringElement(serialDesc, 6, self.content);
            }
            if (!Intrinsics.areEqual(self.cta_label, "")) {
                output.encodeStringElement(serialDesc, 7, self.cta_label);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 8, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.tags, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.tags);
            }
            if (!Intrinsics.areEqual(self.chatbot_content, "")) {
                output.encodeStringElement(serialDesc, 10, self.chatbot_content);
            }
            if (!Intrinsics.areEqual(self.chatbot_cta_label, "")) {
                output.encodeStringElement(serialDesc, 11, self.chatbot_cta_label);
            }
            if (!Intrinsics.areEqual(self.interstitial_content, "")) {
                output.encodeStringElement(serialDesc, 12, self.interstitial_content);
            }
            if (Intrinsics.areEqual(self.interstitial_cta_label, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.interstitial_cta_label);
        }

        public Surrogate(int i, String flow_id, String deploy, String internal_label, String created_at, ImageConfigDto imageConfigDto, String content, String cta_label, String deeplink, List<String> tags, String chatbot_content, String chatbot_cta_label, String interstitial_content, String interstitial_cta_label) {
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
            this.id = i;
            this.flow_id = flow_id;
            this.deploy = deploy;
            this.internal_label = internal_label;
            this.created_at = created_at;
            this.image_url = imageConfigDto;
            this.content = content;
            this.cta_label = cta_label;
            this.deeplink = deeplink;
            this.tags = tags;
            this.chatbot_content = chatbot_content;
            this.chatbot_cta_label = chatbot_cta_label;
            this.interstitial_content = interstitial_content;
            this.interstitial_cta_label = interstitial_cta_label;
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, ImageConfigDto imageConfigDto, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : imageConfigDto, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11);
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

        public final ImageConfigDto getImage_url() {
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

        public final List<String> getTags() {
            return this.tags;
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
    }

    /* compiled from: SelfServeFlowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto;", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SelfServeFlowDetailsDto, SelfServeFlowDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SelfServeFlowDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelfServeFlowDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelfServeFlowDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SelfServeFlowDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SelfServeFlowDetails> getProtoAdapter() {
            return SelfServeFlowDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelfServeFlowDetailsDto getZeroValue() {
            return SelfServeFlowDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelfServeFlowDetailsDto fromProto(SelfServeFlowDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int id = proto.getId();
            String flow_id = proto.getFlow_id();
            String deploy = proto.getDeploy();
            String internal_label = proto.getInternal_label();
            String created_at = proto.getCreated_at();
            ImageConfig image_url = proto.getImage_url();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ImageConfigDto imageConfigDtoFromProto = image_url != null ? ImageConfigDto.INSTANCE.fromProto(image_url) : null;
            String content = proto.getContent();
            String cta_label = proto.getCta_label();
            String deeplink = proto.getDeeplink();
            List<String> tags = proto.getTags();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tags, 10));
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new SelfServeFlowDetailsDto(new Surrogate(id, flow_id, deploy, internal_label, created_at, imageConfigDtoFromProto, content, cta_label, deeplink, arrayList, proto.getChatbot_content(), proto.getChatbot_cta_label(), proto.getInterstitial_content(), proto.getInterstitial_cta_label()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.SelfServeFlowDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfServeFlowDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new SelfServeFlowDetailsDto(0, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SelfServeFlowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SelfServeFlowDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.SelfServeFlowDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SelfServeFlowDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SelfServeFlowDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SelfServeFlowDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SelfServeFlowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.SelfServeFlowDetailsDto";
        }
    }
}
