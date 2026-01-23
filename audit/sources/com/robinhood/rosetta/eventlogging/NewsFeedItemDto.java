package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.NewsFeedItemDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: NewsFeedItemDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006)*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate;)V", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "media_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "source", "carousel_item_count", "", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;Ljava/lang/String;I)V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "getMedia_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "getSource", "getCarousel_item_count", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ContentTypeDto", "MediaTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NewsFeedItemDto implements Dto3<NewsFeedItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NewsFeedItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NewsFeedItemDto, NewsFeedItem>> binaryBase64Serializer$delegate;
    private static final NewsFeedItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NewsFeedItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NewsFeedItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUnique_identifier() {
        return this.surrogate.getUnique_identifier();
    }

    public final ContentTypeDto getContent_type() {
        return this.surrogate.getContent_type();
    }

    public final MediaTypeDto getMedia_type() {
        return this.surrogate.getMedia_type();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final int getCarousel_item_count() {
        return this.surrogate.getCarousel_item_count();
    }

    public /* synthetic */ NewsFeedItemDto(String str, ContentTypeDto contentTypeDto, MediaTypeDto mediaTypeDto, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ContentTypeDto.INSTANCE.getZeroValue() : contentTypeDto, (i2 & 4) != 0 ? MediaTypeDto.INSTANCE.getZeroValue() : mediaTypeDto, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsFeedItemDto(String unique_identifier, ContentTypeDto content_type, MediaTypeDto media_type, String source, int i) {
        this(new Surrogate(unique_identifier, content_type, media_type, source, i));
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(media_type, "media_type");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ NewsFeedItemDto copy$default(NewsFeedItemDto newsFeedItemDto, String str, ContentTypeDto contentTypeDto, MediaTypeDto mediaTypeDto, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newsFeedItemDto.surrogate.getUnique_identifier();
        }
        if ((i2 & 2) != 0) {
            contentTypeDto = newsFeedItemDto.surrogate.getContent_type();
        }
        if ((i2 & 4) != 0) {
            mediaTypeDto = newsFeedItemDto.surrogate.getMedia_type();
        }
        if ((i2 & 8) != 0) {
            str2 = newsFeedItemDto.surrogate.getSource();
        }
        if ((i2 & 16) != 0) {
            i = newsFeedItemDto.surrogate.getCarousel_item_count();
        }
        int i3 = i;
        MediaTypeDto mediaTypeDto2 = mediaTypeDto;
        return newsFeedItemDto.copy(str, contentTypeDto, mediaTypeDto2, str2, i3);
    }

    public final NewsFeedItemDto copy(String unique_identifier, ContentTypeDto content_type, MediaTypeDto media_type, String source, int carousel_item_count) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(media_type, "media_type");
        Intrinsics.checkNotNullParameter(source, "source");
        return new NewsFeedItemDto(new Surrogate(unique_identifier, content_type, media_type, source, carousel_item_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NewsFeedItem toProto() {
        return new NewsFeedItem(this.surrogate.getUnique_identifier(), (NewsFeedItem.ContentType) this.surrogate.getContent_type().toProto(), (NewsFeedItem.MediaType) this.surrogate.getMedia_type().toProto(), this.surrogate.getSource(), this.surrogate.getCarousel_item_count(), null, 32, null);
    }

    public String toString() {
        return "[NewsFeedItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NewsFeedItemDto) && Intrinsics.areEqual(((NewsFeedItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BH\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0018\u0010'\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003JJ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate;", "", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "media_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "source", "carousel_item_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUnique_identifier$annotations", "()V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type$annotations", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "getMedia_type$annotations", "getMedia_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "getSource$annotations", "getSource", "getCarousel_item_count$annotations", "getCarousel_item_count", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int carousel_item_count;
        private final ContentTypeDto content_type;
        private final MediaTypeDto media_type;
        private final String source;
        private final String unique_identifier;

        public Surrogate() {
            this((String) null, (ContentTypeDto) null, (MediaTypeDto) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ContentTypeDto contentTypeDto, MediaTypeDto mediaTypeDto, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.unique_identifier;
            }
            if ((i2 & 2) != 0) {
                contentTypeDto = surrogate.content_type;
            }
            if ((i2 & 4) != 0) {
                mediaTypeDto = surrogate.media_type;
            }
            if ((i2 & 8) != 0) {
                str2 = surrogate.source;
            }
            if ((i2 & 16) != 0) {
                i = surrogate.carousel_item_count;
            }
            int i3 = i;
            MediaTypeDto mediaTypeDto2 = mediaTypeDto;
            return surrogate.copy(str, contentTypeDto, mediaTypeDto2, str2, i3);
        }

        @SerialName("carouselItemCount")
        @JsonAnnotations2(names = {"carousel_item_count"})
        public static /* synthetic */ void getCarousel_item_count$annotations() {
        }

        @SerialName("contentType")
        @JsonAnnotations2(names = {"content_type"})
        public static /* synthetic */ void getContent_type$annotations() {
        }

        @SerialName("mediaType")
        @JsonAnnotations2(names = {"media_type"})
        public static /* synthetic */ void getMedia_type$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("uniqueIdentifier")
        @JsonAnnotations2(names = {"unique_identifier"})
        public static /* synthetic */ void getUnique_identifier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUnique_identifier() {
            return this.unique_identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final ContentTypeDto getContent_type() {
            return this.content_type;
        }

        /* renamed from: component3, reason: from getter */
        public final MediaTypeDto getMedia_type() {
            return this.media_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCarousel_item_count() {
            return this.carousel_item_count;
        }

        public final Surrogate copy(String unique_identifier, ContentTypeDto content_type, MediaTypeDto media_type, String source, int carousel_item_count) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(content_type, "content_type");
            Intrinsics.checkNotNullParameter(media_type, "media_type");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(unique_identifier, content_type, media_type, source, carousel_item_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.unique_identifier, surrogate.unique_identifier) && this.content_type == surrogate.content_type && this.media_type == surrogate.media_type && Intrinsics.areEqual(this.source, surrogate.source) && this.carousel_item_count == surrogate.carousel_item_count;
        }

        public int hashCode() {
            return (((((((this.unique_identifier.hashCode() * 31) + this.content_type.hashCode()) * 31) + this.media_type.hashCode()) * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.carousel_item_count);
        }

        public String toString() {
            return "Surrogate(unique_identifier=" + this.unique_identifier + ", content_type=" + this.content_type + ", media_type=" + this.media_type + ", source=" + this.source + ", carousel_item_count=" + this.carousel_item_count + ")";
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NewsFeedItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ContentTypeDto contentTypeDto, MediaTypeDto mediaTypeDto, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.unique_identifier = "";
            } else {
                this.unique_identifier = str;
            }
            if ((i & 2) == 0) {
                this.content_type = ContentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.content_type = contentTypeDto;
            }
            if ((i & 4) == 0) {
                this.media_type = MediaTypeDto.INSTANCE.getZeroValue();
            } else {
                this.media_type = mediaTypeDto;
            }
            if ((i & 8) == 0) {
                this.source = "";
            } else {
                this.source = str2;
            }
            if ((i & 16) == 0) {
                this.carousel_item_count = 0;
            } else {
                this.carousel_item_count = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.unique_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.unique_identifier);
            }
            if (self.content_type != ContentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ContentTypeDto.Serializer.INSTANCE, self.content_type);
            }
            if (self.media_type != MediaTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, MediaTypeDto.Serializer.INSTANCE, self.media_type);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 3, self.source);
            }
            int i = self.carousel_item_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String unique_identifier, ContentTypeDto content_type, MediaTypeDto media_type, String source, int i) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(content_type, "content_type");
            Intrinsics.checkNotNullParameter(media_type, "media_type");
            Intrinsics.checkNotNullParameter(source, "source");
            this.unique_identifier = unique_identifier;
            this.content_type = content_type;
            this.media_type = media_type;
            this.source = source;
            this.carousel_item_count = i;
        }

        public /* synthetic */ Surrogate(String str, ContentTypeDto contentTypeDto, MediaTypeDto mediaTypeDto, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ContentTypeDto.INSTANCE.getZeroValue() : contentTypeDto, (i2 & 4) != 0 ? MediaTypeDto.INSTANCE.getZeroValue() : mediaTypeDto, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i);
        }

        public final String getUnique_identifier() {
            return this.unique_identifier;
        }

        public final ContentTypeDto getContent_type() {
            return this.content_type;
        }

        public final MediaTypeDto getMedia_type() {
            return this.media_type;
        }

        public final String getSource() {
            return this.source;
        }

        public final int getCarousel_item_count() {
            return this.carousel_item_count;
        }
    }

    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NewsFeedItemDto, NewsFeedItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NewsFeedItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NewsFeedItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NewsFeedItemDto> getBinaryBase64Serializer() {
            return (KSerializer) NewsFeedItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NewsFeedItem> getProtoAdapter() {
            return NewsFeedItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NewsFeedItemDto getZeroValue() {
            return NewsFeedItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NewsFeedItemDto fromProto(NewsFeedItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NewsFeedItemDto(new Surrogate(proto.getUnique_identifier(), ContentTypeDto.INSTANCE.fromProto(proto.getContent_type()), MediaTypeDto.INSTANCE.fromProto(proto.getMedia_type()), proto.getSource(), proto.getCarousel_item_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NewsFeedItemDto(null, null, null, null, 0, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_TYPE_UNSPECIFIED", "REGULAR_ARTICLE", "EMBEDDED_ARTICLE", "VIDEO", "CAROUSEL", "LIST_CHIP_GRID", "LEARNING_ENTRY_POINT", "MARKET_UPDATES", "MARKET_INDICATOR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContentTypeDto implements Dto2<NewsFeedItem.ContentType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContentTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContentTypeDto, NewsFeedItem.ContentType>> binaryBase64Serializer$delegate;
        public static final ContentTypeDto CONTENT_TYPE_UNSPECIFIED = new CONTENT_TYPE_UNSPECIFIED("CONTENT_TYPE_UNSPECIFIED", 0);
        public static final ContentTypeDto REGULAR_ARTICLE = new REGULAR_ARTICLE("REGULAR_ARTICLE", 1);
        public static final ContentTypeDto EMBEDDED_ARTICLE = new EMBEDDED_ARTICLE("EMBEDDED_ARTICLE", 2);
        public static final ContentTypeDto VIDEO = new VIDEO("VIDEO", 3);
        public static final ContentTypeDto CAROUSEL = new CAROUSEL("CAROUSEL", 4);
        public static final ContentTypeDto LIST_CHIP_GRID = new LIST_CHIP_GRID("LIST_CHIP_GRID", 5);
        public static final ContentTypeDto LEARNING_ENTRY_POINT = new LEARNING_ENTRY_POINT("LEARNING_ENTRY_POINT", 6);
        public static final ContentTypeDto MARKET_UPDATES = new MARKET_UPDATES("MARKET_UPDATES", 7);
        public static final ContentTypeDto MARKET_INDICATOR = new MARKET_INDICATOR("MARKET_INDICATOR", 8);

        private static final /* synthetic */ ContentTypeDto[] $values() {
            return new ContentTypeDto[]{CONTENT_TYPE_UNSPECIFIED, REGULAR_ARTICLE, EMBEDDED_ARTICLE, VIDEO, CAROUSEL, LIST_CHIP_GRID, LEARNING_ENTRY_POINT, MARKET_UPDATES, MARKET_INDICATOR};
        }

        public /* synthetic */ ContentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ContentTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.CONTENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_TYPE_UNSPECIFIED extends ContentTypeDto {
            CONTENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED;
            }
        }

        private ContentTypeDto(String str, int i) {
        }

        static {
            ContentTypeDto[] contentTypeDtoArr$values = $values();
            $VALUES = contentTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItemDto$ContentTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewsFeedItemDto.ContentTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.REGULAR_ARTICLE", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REGULAR_ARTICLE extends ContentTypeDto {
            REGULAR_ARTICLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.REGULAR_ARTICLE;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.EMBEDDED_ARTICLE", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMBEDDED_ARTICLE extends ContentTypeDto {
            EMBEDDED_ARTICLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.EMBEDDED_ARTICLE;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.VIDEO", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VIDEO extends ContentTypeDto {
            VIDEO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.VIDEO;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.CAROUSEL", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CAROUSEL extends ContentTypeDto {
            CAROUSEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.CAROUSEL;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.LIST_CHIP_GRID", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_CHIP_GRID extends ContentTypeDto {
            LIST_CHIP_GRID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.LIST_CHIP_GRID;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.LEARNING_ENTRY_POINT", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_ENTRY_POINT extends ContentTypeDto {
            LEARNING_ENTRY_POINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.LEARNING_ENTRY_POINT;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.MARKET_UPDATES", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_UPDATES extends ContentTypeDto {
            MARKET_UPDATES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.MARKET_UPDATES;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.ContentTypeDto.MARKET_INDICATOR", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_INDICATOR extends ContentTypeDto {
            MARKET_INDICATOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.ContentType toProto() {
                return NewsFeedItem.ContentType.MARKET_INDICATOR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContentTypeDto, NewsFeedItem.ContentType> {

            /* compiled from: NewsFeedItemDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NewsFeedItem.ContentType.values().length];
                    try {
                        iArr[NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.REGULAR_ARTICLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.EMBEDDED_ARTICLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.VIDEO.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.CAROUSEL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.LIST_CHIP_GRID.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.LEARNING_ENTRY_POINT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.MARKET_UPDATES.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[NewsFeedItem.ContentType.MARKET_INDICATOR.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContentTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContentTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContentTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ContentTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NewsFeedItem.ContentType> getProtoAdapter() {
                return NewsFeedItem.ContentType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentTypeDto getZeroValue() {
                return ContentTypeDto.CONTENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentTypeDto fromProto(NewsFeedItem.ContentType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ContentTypeDto.CONTENT_TYPE_UNSPECIFIED;
                    case 2:
                        return ContentTypeDto.REGULAR_ARTICLE;
                    case 3:
                        return ContentTypeDto.EMBEDDED_ARTICLE;
                    case 4:
                        return ContentTypeDto.VIDEO;
                    case 5:
                        return ContentTypeDto.CAROUSEL;
                    case 6:
                        return ContentTypeDto.LIST_CHIP_GRID;
                    case 7:
                        return ContentTypeDto.LEARNING_ENTRY_POINT;
                    case 8:
                        return ContentTypeDto.MARKET_UPDATES;
                    case 9:
                        return ContentTypeDto.MARKET_INDICATOR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$ContentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContentTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContentTypeDto, NewsFeedItem.ContentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NewsFeedItem.ContentType", ContentTypeDto.getEntries(), ContentTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ContentTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ContentTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContentTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ContentTypeDto valueOf(String str) {
            return (ContentTypeDto) Enum.valueOf(ContentTypeDto.class, str);
        }

        public static ContentTypeDto[] values() {
            return (ContentTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA_TYPE_NONE", "MEDIA_TYPE_IMAGE", "MEDIA_TYPE_VIDEO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MediaTypeDto implements Dto2<NewsFeedItem.MediaType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MediaTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MediaTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MediaTypeDto, NewsFeedItem.MediaType>> binaryBase64Serializer$delegate;
        public static final MediaTypeDto MEDIA_TYPE_NONE = new MEDIA_TYPE_NONE("MEDIA_TYPE_NONE", 0);
        public static final MediaTypeDto MEDIA_TYPE_IMAGE = new MEDIA_TYPE_IMAGE("MEDIA_TYPE_IMAGE", 1);
        public static final MediaTypeDto MEDIA_TYPE_VIDEO = new MEDIA_TYPE_VIDEO("MEDIA_TYPE_VIDEO", 2);

        private static final /* synthetic */ MediaTypeDto[] $values() {
            return new MediaTypeDto[]{MEDIA_TYPE_NONE, MEDIA_TYPE_IMAGE, MEDIA_TYPE_VIDEO};
        }

        public /* synthetic */ MediaTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MediaTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.MediaTypeDto.MEDIA_TYPE_NONE", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MEDIA_TYPE_NONE extends MediaTypeDto {
            MEDIA_TYPE_NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.MediaType toProto() {
                return NewsFeedItem.MediaType.MEDIA_TYPE_NONE;
            }
        }

        private MediaTypeDto(String str, int i) {
        }

        static {
            MediaTypeDto[] mediaTypeDtoArr$values = $values();
            $VALUES = mediaTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mediaTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItemDto$MediaTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewsFeedItemDto.MediaTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.MediaTypeDto.MEDIA_TYPE_IMAGE", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MEDIA_TYPE_IMAGE extends MediaTypeDto {
            MEDIA_TYPE_IMAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.MediaType toProto() {
                return NewsFeedItem.MediaType.MEDIA_TYPE_IMAGE;
            }
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NewsFeedItemDto.MediaTypeDto.MEDIA_TYPE_VIDEO", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MEDIA_TYPE_VIDEO extends MediaTypeDto {
            MEDIA_TYPE_VIDEO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NewsFeedItem.MediaType toProto() {
                return NewsFeedItem.MediaType.MEDIA_TYPE_VIDEO;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MediaTypeDto, NewsFeedItem.MediaType> {

            /* compiled from: NewsFeedItemDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NewsFeedItem.MediaType.values().length];
                    try {
                        iArr[NewsFeedItem.MediaType.MEDIA_TYPE_NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NewsFeedItem.MediaType.MEDIA_TYPE_IMAGE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NewsFeedItem.MediaType.MEDIA_TYPE_VIDEO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MediaTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MediaTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MediaTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) MediaTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NewsFeedItem.MediaType> getProtoAdapter() {
                return NewsFeedItem.MediaType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MediaTypeDto getZeroValue() {
                return MediaTypeDto.MEDIA_TYPE_NONE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MediaTypeDto fromProto(NewsFeedItem.MediaType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MediaTypeDto.MEDIA_TYPE_NONE;
                }
                if (i == 2) {
                    return MediaTypeDto.MEDIA_TYPE_IMAGE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return MediaTypeDto.MEDIA_TYPE_VIDEO;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NewsFeedItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MediaTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MediaTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MediaTypeDto, NewsFeedItem.MediaType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NewsFeedItem.MediaType", MediaTypeDto.getEntries(), MediaTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MediaTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MediaTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MediaTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MediaTypeDto valueOf(String str) {
            return (MediaTypeDto) Enum.valueOf(MediaTypeDto.class, str);
        }

        public static MediaTypeDto[] values() {
            return (MediaTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NewsFeedItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NewsFeedItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NewsFeedItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NewsFeedItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NewsFeedItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NewsFeedItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NewsFeedItemDto";
        }
    }
}
