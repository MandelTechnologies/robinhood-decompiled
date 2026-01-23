package com.robinhood.rosetta.postoffice;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CommInfoDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/postoffice/CommInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate;)V", "po_box", "", "campaign_id", "idempotent_id", "channel_type", "source_service", "ttl", "", "variant_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getPo_box", "()Ljava/lang/String;", "getCampaign_id", "getIdempotent_id", "getChannel_type", "getSource_service", "getTtl", "()J", "getVariant_name", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CommInfoDto implements Dto3<CommInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CommInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CommInfoDto, CommInfo>> binaryBase64Serializer$delegate;
    private static final CommInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CommInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CommInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPo_box() {
        return this.surrogate.getPo_box();
    }

    public final String getCampaign_id() {
        return this.surrogate.getCampaign_id();
    }

    public final String getIdempotent_id() {
        return this.surrogate.getIdempotent_id();
    }

    public final String getChannel_type() {
        return this.surrogate.getChannel_type();
    }

    public final String getSource_service() {
        return this.surrogate.getSource_service();
    }

    public final long getTtl() {
        return this.surrogate.getTtl();
    }

    public final String getVariant_name() {
        return this.surrogate.getVariant_name();
    }

    public /* synthetic */ CommInfoDto(String str, String str2, String str3, String str4, String str5, long j, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommInfoDto(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long j, String variant_name) {
        this(new Surrogate(po_box, campaign_id, idempotent_id, channel_type, source_service, j, variant_name));
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(channel_type, "channel_type");
        Intrinsics.checkNotNullParameter(source_service, "source_service");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
    }

    public static /* synthetic */ CommInfoDto copy$default(CommInfoDto commInfoDto, String str, String str2, String str3, String str4, String str5, long j, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commInfoDto.surrogate.getPo_box();
        }
        if ((i & 2) != 0) {
            str2 = commInfoDto.surrogate.getCampaign_id();
        }
        if ((i & 4) != 0) {
            str3 = commInfoDto.surrogate.getIdempotent_id();
        }
        if ((i & 8) != 0) {
            str4 = commInfoDto.surrogate.getChannel_type();
        }
        if ((i & 16) != 0) {
            str5 = commInfoDto.surrogate.getSource_service();
        }
        if ((i & 32) != 0) {
            j = commInfoDto.surrogate.getTtl();
        }
        if ((i & 64) != 0) {
            str6 = commInfoDto.surrogate.getVariant_name();
        }
        String str7 = str6;
        long j2 = j;
        String str8 = str5;
        String str9 = str3;
        return commInfoDto.copy(str, str2, str9, str4, str8, j2, str7);
    }

    public final CommInfoDto copy(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long ttl, String variant_name) {
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
        Intrinsics.checkNotNullParameter(channel_type, "channel_type");
        Intrinsics.checkNotNullParameter(source_service, "source_service");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        return new CommInfoDto(new Surrogate(po_box, campaign_id, idempotent_id, channel_type, source_service, ttl, variant_name));
    }

    @Override // com.robinhood.idl.Dto
    public CommInfo toProto() {
        return new CommInfo(this.surrogate.getPo_box(), this.surrogate.getCampaign_id(), this.surrogate.getIdempotent_id(), this.surrogate.getChannel_type(), this.surrogate.getSource_service(), this.surrogate.getTtl(), this.surrogate.getVariant_name(), null, 128, null);
    }

    public String toString() {
        return "[CommInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CommInfoDto) && Intrinsics.areEqual(((CommInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: CommInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0018\u0010+\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J^\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate;", "", "po_box", "", "campaign_id", "idempotent_id", "channel_type", "source_service", "ttl", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "variant_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPo_box$annotations", "()V", "getPo_box", "()Ljava/lang/String;", "getCampaign_id$annotations", "getCampaign_id", "getIdempotent_id$annotations", "getIdempotent_id", "getChannel_type$annotations", "getChannel_type", "getSource_service$annotations", "getSource_service", "getTtl$annotations", "getTtl", "()J", "getVariant_name$annotations", "getVariant_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_postoffice_externalRelease", "$serializer", "Companion", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String campaign_id;
        private final String channel_type;
        private final String idempotent_id;
        private final String po_box;
        private final String source_service;
        private final long ttl;
        private final String variant_name;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, long j, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.po_box;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.campaign_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.idempotent_id;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.channel_type;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.source_service;
            }
            if ((i & 32) != 0) {
                j = surrogate.ttl;
            }
            if ((i & 64) != 0) {
                str6 = surrogate.variant_name;
            }
            String str7 = str6;
            long j2 = j;
            String str8 = str5;
            String str9 = str3;
            return surrogate.copy(str, str2, str9, str4, str8, j2, str7);
        }

        @SerialName("campaignId")
        @JsonAnnotations2(names = {"campaign_id"})
        public static /* synthetic */ void getCampaign_id$annotations() {
        }

        @SerialName("channelType")
        @JsonAnnotations2(names = {"channel_type"})
        public static /* synthetic */ void getChannel_type$annotations() {
        }

        @SerialName("idempotentId")
        @JsonAnnotations2(names = {"idempotent_id"})
        public static /* synthetic */ void getIdempotent_id$annotations() {
        }

        @SerialName("poBox")
        @JsonAnnotations2(names = {"po_box"})
        public static /* synthetic */ void getPo_box$annotations() {
        }

        @SerialName("sourceService")
        @JsonAnnotations2(names = {"source_service"})
        public static /* synthetic */ void getSource_service$annotations() {
        }

        @SerialName("ttl")
        @JsonAnnotations2(names = {"ttl"})
        public static /* synthetic */ void getTtl$annotations() {
        }

        @SerialName("variantName")
        @JsonAnnotations2(names = {"variant_name"})
        public static /* synthetic */ void getVariant_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPo_box() {
            return this.po_box;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCampaign_id() {
            return this.campaign_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIdempotent_id() {
            return this.idempotent_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getChannel_type() {
            return this.channel_type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource_service() {
            return this.source_service;
        }

        /* renamed from: component6, reason: from getter */
        public final long getTtl() {
            return this.ttl;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVariant_name() {
            return this.variant_name;
        }

        public final Surrogate copy(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long ttl, String variant_name) {
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(channel_type, "channel_type");
            Intrinsics.checkNotNullParameter(source_service, "source_service");
            Intrinsics.checkNotNullParameter(variant_name, "variant_name");
            return new Surrogate(po_box, campaign_id, idempotent_id, channel_type, source_service, ttl, variant_name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.po_box, surrogate.po_box) && Intrinsics.areEqual(this.campaign_id, surrogate.campaign_id) && Intrinsics.areEqual(this.idempotent_id, surrogate.idempotent_id) && Intrinsics.areEqual(this.channel_type, surrogate.channel_type) && Intrinsics.areEqual(this.source_service, surrogate.source_service) && this.ttl == surrogate.ttl && Intrinsics.areEqual(this.variant_name, surrogate.variant_name);
        }

        public int hashCode() {
            return (((((((((((this.po_box.hashCode() * 31) + this.campaign_id.hashCode()) * 31) + this.idempotent_id.hashCode()) * 31) + this.channel_type.hashCode()) * 31) + this.source_service.hashCode()) * 31) + Long.hashCode(this.ttl)) * 31) + this.variant_name.hashCode();
        }

        public String toString() {
            return "Surrogate(po_box=" + this.po_box + ", campaign_id=" + this.campaign_id + ", idempotent_id=" + this.idempotent_id + ", channel_type=" + this.channel_type + ", source_service=" + this.source_service + ", ttl=" + this.ttl + ", variant_name=" + this.variant_name + ")";
        }

        /* compiled from: CommInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CommInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.po_box = "";
            } else {
                this.po_box = str;
            }
            if ((i & 2) == 0) {
                this.campaign_id = "";
            } else {
                this.campaign_id = str2;
            }
            if ((i & 4) == 0) {
                this.idempotent_id = "";
            } else {
                this.idempotent_id = str3;
            }
            if ((i & 8) == 0) {
                this.channel_type = "";
            } else {
                this.channel_type = str4;
            }
            if ((i & 16) == 0) {
                this.source_service = "";
            } else {
                this.source_service = str5;
            }
            if ((i & 32) == 0) {
                this.ttl = 0L;
            } else {
                this.ttl = j;
            }
            if ((i & 64) == 0) {
                this.variant_name = "";
            } else {
                this.variant_name = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_postoffice_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.po_box, "")) {
                output.encodeStringElement(serialDesc, 0, self.po_box);
            }
            if (!Intrinsics.areEqual(self.campaign_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.campaign_id);
            }
            if (!Intrinsics.areEqual(self.idempotent_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.idempotent_id);
            }
            if (!Intrinsics.areEqual(self.channel_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.channel_type);
            }
            if (!Intrinsics.areEqual(self.source_service, "")) {
                output.encodeStringElement(serialDesc, 4, self.source_service);
            }
            long j = self.ttl;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (Intrinsics.areEqual(self.variant_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.variant_name);
        }

        public Surrogate(String po_box, String campaign_id, String idempotent_id, String channel_type, String source_service, long j, String variant_name) {
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(idempotent_id, "idempotent_id");
            Intrinsics.checkNotNullParameter(channel_type, "channel_type");
            Intrinsics.checkNotNullParameter(source_service, "source_service");
            Intrinsics.checkNotNullParameter(variant_name, "variant_name");
            this.po_box = po_box;
            this.campaign_id = campaign_id;
            this.idempotent_id = idempotent_id;
            this.channel_type = channel_type;
            this.source_service = source_service;
            this.ttl = j;
            this.variant_name = variant_name;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, long j, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? "" : str6);
        }

        public final String getPo_box() {
            return this.po_box;
        }

        public final String getCampaign_id() {
            return this.campaign_id;
        }

        public final String getIdempotent_id() {
            return this.idempotent_id;
        }

        public final String getChannel_type() {
            return this.channel_type;
        }

        public final String getSource_service() {
            return this.source_service;
        }

        public final long getTtl() {
            return this.ttl;
        }

        public final String getVariant_name() {
            return this.variant_name;
        }
    }

    /* compiled from: CommInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "Lcom/robinhood/rosetta/postoffice/CommInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CommInfoDto, CommInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CommInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CommInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CommInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) CommInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CommInfo> getProtoAdapter() {
            return CommInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CommInfoDto getZeroValue() {
            return CommInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CommInfoDto fromProto(CommInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CommInfoDto(new Surrogate(proto.getPo_box(), proto.getCampaign_id(), proto.getIdempotent_id(), proto.getChannel_type(), proto.getSource_service(), proto.getTtl(), proto.getVariant_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.postoffice.CommInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CommInfoDto(null, null, null, null, null, 0L, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CommInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/postoffice/CommInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CommInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.postoffice.CommInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CommInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CommInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CommInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CommInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/CommInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.postoffice.CommInfoDto";
        }
    }
}
