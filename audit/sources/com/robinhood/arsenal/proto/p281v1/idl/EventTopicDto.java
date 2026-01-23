package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: EventTopicDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B{\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0017J\u007f\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "Landroid/os/Parcelable;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;)V", "", "id", "name", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;", "type", "type_id", "detail_deeplink", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expiration_timestamp", "image_url", "", "rank", "dark_image_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "toProto", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "getId", "getName", "getCategory", "getType", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;", "getType_id", "getDetail_deeplink", "getExpiration_timestamp", "()Lj$/time/Instant;", "getImage_url", "getRank", "getDark_image_url", "Companion", "Surrogate", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class EventTopicDto implements Dto3<EventTopic>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventTopicDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventTopicDto, EventTopic>> binaryBase64Serializer$delegate;
    private static final EventTopicDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventTopicDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventTopicDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final EventTopicTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getType_id() {
        return this.surrogate.getType_id();
    }

    public final String getDetail_deeplink() {
        return this.surrogate.getDetail_deeplink();
    }

    public final Instant getExpiration_timestamp() {
        return this.surrogate.getExpiration_timestamp();
    }

    public final String getImage_url() {
        return this.surrogate.getImage_url();
    }

    public final int getRank() {
        return this.surrogate.getRank();
    }

    public final String getDark_image_url() {
        return this.surrogate.getDark_image_url();
    }

    public /* synthetic */ EventTopicDto(String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, Instant instant, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicTypeDto.INSTANCE.getZeroValue() : eventTopicTypeDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventTopicDto(String id, String name, String category, EventTopicTypeDto type2, String type_id, String str, Instant instant, String str2, int i, String str3) {
        this(new Surrogate(id, name, category, type2, type_id, str, instant, str2, i, str3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
    }

    public static /* synthetic */ EventTopicDto copy$default(EventTopicDto eventTopicDto, String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, Instant instant, String str6, int i, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventTopicDto.surrogate.getId();
        }
        if ((i2 & 2) != 0) {
            str2 = eventTopicDto.surrogate.getName();
        }
        if ((i2 & 4) != 0) {
            str3 = eventTopicDto.surrogate.getCategory();
        }
        if ((i2 & 8) != 0) {
            eventTopicTypeDto = eventTopicDto.surrogate.getType();
        }
        if ((i2 & 16) != 0) {
            str4 = eventTopicDto.surrogate.getType_id();
        }
        if ((i2 & 32) != 0) {
            str5 = eventTopicDto.surrogate.getDetail_deeplink();
        }
        if ((i2 & 64) != 0) {
            instant = eventTopicDto.surrogate.getExpiration_timestamp();
        }
        if ((i2 & 128) != 0) {
            str6 = eventTopicDto.surrogate.getImage_url();
        }
        if ((i2 & 256) != 0) {
            i = eventTopicDto.surrogate.getRank();
        }
        if ((i2 & 512) != 0) {
            str7 = eventTopicDto.surrogate.getDark_image_url();
        }
        int i3 = i;
        String str8 = str7;
        Instant instant2 = instant;
        String str9 = str6;
        String str10 = str4;
        String str11 = str5;
        return eventTopicDto.copy(str, str2, str3, eventTopicTypeDto, str10, str11, instant2, str9, i3, str8);
    }

    public final EventTopicDto copy(String id, String name, String category, EventTopicTypeDto type2, String type_id, String detail_deeplink, Instant expiration_timestamp, String image_url, int rank, String dark_image_url) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
        return new EventTopicDto(new Surrogate(id, name, category, type2, type_id, detail_deeplink, expiration_timestamp, image_url, rank, dark_image_url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventTopic toProto() {
        return new EventTopic(this.surrogate.getId(), this.surrogate.getName(), this.surrogate.getCategory(), (EventTopicType) this.surrogate.getType().toProto(), this.surrogate.getType_id(), this.surrogate.getDetail_deeplink(), this.surrogate.getExpiration_timestamp(), this.surrogate.getImage_url(), this.surrogate.getRank(), this.surrogate.getDark_image_url(), null, 1024, null);
    }

    public String toString() {
        return "[EventTopicDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventTopicDto) && Intrinsics.areEqual(((EventTopicDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSB¦\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J6\u0010,\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u001f\u0010/\u001a\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J¯\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022.\b\u0002\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0017\b\u0002\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010%J\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00100J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\bA\u0010=\u001a\u0004\b@\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010B\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010)R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010%RF\u0010\u000f\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010-R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\bM\u0010=\u001a\u0004\bL\u0010%R/\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010N\u0012\u0004\bP\u0010=\u001a\u0004\bO\u00100R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010:\u0012\u0004\bR\u0010=\u001a\u0004\bQ\u0010%¨\u0006U"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "", "", "id", "name", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;", "type", "type_id", "detail_deeplink", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "expiration_timestamp", "image_url", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "rank", "dark_image_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$arsenal_v1_public_externalRelease", "(Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;", "component5", "component6", "component7", "()Lj$/time/Instant;", "component8", "component9", "()I", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getCategory", "getCategory$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicTypeDto;", "getType", "getType$annotations", "getType_id", "getType_id$annotations", "getDetail_deeplink", "getDetail_deeplink$annotations", "Lj$/time/Instant;", "getExpiration_timestamp", "getExpiration_timestamp$annotations", "getImage_url", "getImage_url$annotations", "I", "getRank", "getRank$annotations", "getDark_image_url", "getDark_image_url$annotations", "Companion", "$serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String category;
        private final String dark_image_url;
        private final String detail_deeplink;
        private final Instant expiration_timestamp;
        private final String id;
        private final String image_url;
        private final String name;
        private final int rank;
        private final EventTopicTypeDto type;
        private final String type_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (EventTopicTypeDto) null, (String) null, (String) null, (Instant) null, (String) null, 0, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, Instant instant, String str6, int i, String str7, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.name;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.category;
            }
            if ((i2 & 8) != 0) {
                eventTopicTypeDto = surrogate.type;
            }
            if ((i2 & 16) != 0) {
                str4 = surrogate.type_id;
            }
            if ((i2 & 32) != 0) {
                str5 = surrogate.detail_deeplink;
            }
            if ((i2 & 64) != 0) {
                instant = surrogate.expiration_timestamp;
            }
            if ((i2 & 128) != 0) {
                str6 = surrogate.image_url;
            }
            if ((i2 & 256) != 0) {
                i = surrogate.rank;
            }
            if ((i2 & 512) != 0) {
                str7 = surrogate.dark_image_url;
            }
            int i3 = i;
            String str8 = str7;
            Instant instant2 = instant;
            String str9 = str6;
            String str10 = str4;
            String str11 = str5;
            return surrogate.copy(str, str2, str3, eventTopicTypeDto, str10, str11, instant2, str9, i3, str8);
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("darkImageUrl")
        @JsonAnnotations2(names = {"dark_image_url"})
        public static /* synthetic */ void getDark_image_url$annotations() {
        }

        @SerialName("detailDeeplink")
        @JsonAnnotations2(names = {"detail_deeplink"})
        public static /* synthetic */ void getDetail_deeplink$annotations() {
        }

        @SerialName("expirationTimestamp")
        @JsonAnnotations2(names = {"expiration_timestamp"})
        public static /* synthetic */ void getExpiration_timestamp$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName(MarkdownText4.TagImageUrl)
        @JsonAnnotations2(names = {"image_url"})
        public static /* synthetic */ void getImage_url$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("rank")
        @JsonAnnotations2(names = {"rank"})
        public static /* synthetic */ void getRank$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("typeId")
        @JsonAnnotations2(names = {"type_id"})
        public static /* synthetic */ void getType_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDark_image_url() {
            return this.dark_image_url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component4, reason: from getter */
        public final EventTopicTypeDto getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getType_id() {
            return this.type_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDetail_deeplink() {
            return this.detail_deeplink;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getExpiration_timestamp() {
            return this.expiration_timestamp;
        }

        /* renamed from: component8, reason: from getter */
        public final String getImage_url() {
            return this.image_url;
        }

        /* renamed from: component9, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        public final Surrogate copy(String id, String name, String category, EventTopicTypeDto type2, String type_id, String detail_deeplink, Instant expiration_timestamp, String image_url, int rank, String dark_image_url) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(type_id, "type_id");
            return new Surrogate(id, name, category, type2, type_id, detail_deeplink, expiration_timestamp, image_url, rank, dark_image_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.category, surrogate.category) && this.type == surrogate.type && Intrinsics.areEqual(this.type_id, surrogate.type_id) && Intrinsics.areEqual(this.detail_deeplink, surrogate.detail_deeplink) && Intrinsics.areEqual(this.expiration_timestamp, surrogate.expiration_timestamp) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && this.rank == surrogate.rank && Intrinsics.areEqual(this.dark_image_url, surrogate.dark_image_url);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.category.hashCode()) * 31) + this.type.hashCode()) * 31) + this.type_id.hashCode()) * 31;
            String str = this.detail_deeplink;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Instant instant = this.expiration_timestamp;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            String str2 = this.image_url;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.rank)) * 31;
            String str3 = this.dark_image_url;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", category=" + this.category + ", type=" + this.type + ", type_id=" + this.type_id + ", detail_deeplink=" + this.detail_deeplink + ", expiration_timestamp=" + this.expiration_timestamp + ", image_url=" + this.image_url + ", rank=" + this.rank + ", dark_image_url=" + this.dark_image_url + ")";
        }

        /* compiled from: EventTopicDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventTopicDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, Instant instant, String str6, int i2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.category = "";
            } else {
                this.category = str3;
            }
            if ((i & 8) == 0) {
                this.type = EventTopicTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = eventTopicTypeDto;
            }
            if ((i & 16) == 0) {
                this.type_id = "";
            } else {
                this.type_id = str4;
            }
            if ((i & 32) == 0) {
                this.detail_deeplink = null;
            } else {
                this.detail_deeplink = str5;
            }
            if ((i & 64) == 0) {
                this.expiration_timestamp = null;
            } else {
                this.expiration_timestamp = instant;
            }
            if ((i & 128) == 0) {
                this.image_url = null;
            } else {
                this.image_url = str6;
            }
            if ((i & 256) == 0) {
                this.rank = 0;
            } else {
                this.rank = i2;
            }
            if ((i & 512) == 0) {
                this.dark_image_url = null;
            } else {
                this.dark_image_url = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.category, "")) {
                output.encodeStringElement(serialDesc, 2, self.category);
            }
            if (self.type != EventTopicTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, EventTopicTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.type_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.type_id);
            }
            String str = self.detail_deeplink;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            Instant instant = self.expiration_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant);
            }
            String str2 = self.image_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str2);
            }
            int i = self.rank;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            String str3 = self.dark_image_url;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String id, String name, String category, EventTopicTypeDto type2, String type_id, String str, Instant instant, String str2, int i, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(type_id, "type_id");
            this.id = id;
            this.name = name;
            this.category = category;
            this.type = type2;
            this.type_id = type_id;
            this.detail_deeplink = str;
            this.expiration_timestamp = instant;
            this.image_url = str2;
            this.rank = i;
            this.dark_image_url = str3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, Instant instant, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicTypeDto.INSTANCE.getZeroValue() : eventTopicTypeDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : str7);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getCategory() {
            return this.category;
        }

        public final EventTopicTypeDto getType() {
            return this.type;
        }

        public final String getType_id() {
            return this.type_id;
        }

        public final String getDetail_deeplink() {
            return this.detail_deeplink;
        }

        public final Instant getExpiration_timestamp() {
            return this.expiration_timestamp;
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final int getRank() {
            return this.rank;
        }

        public final String getDark_image_url() {
            return this.dark_image_url;
        }
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EventTopicDto, EventTopic> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventTopicDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTopicDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTopicDto> getBinaryBase64Serializer() {
            return (KSerializer) EventTopicDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventTopic> getProtoAdapter() {
            return EventTopic.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTopicDto getZeroValue() {
            return EventTopicDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTopicDto fromProto(EventTopic proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EventTopicDto(new Surrogate(proto.getId(), proto.getName(), proto.getCategory(), EventTopicTypeDto.INSTANCE.fromProto(proto.getType()), proto.getType_id(), proto.getDetail_deeplink(), proto.getExpiration_timestamp(), proto.getImage_url(), proto.getRank(), proto.getDark_image_url()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventTopicDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventTopicDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventTopicDto(null, null, null, null, null, null, null, null, 0, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventTopicDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.EventTopic", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventTopicDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventTopicDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventTopicDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventTopicDto";
        }
    }
}
