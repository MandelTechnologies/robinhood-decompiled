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
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.SearchResultItemDto;
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

/* compiled from: SearchResultItemDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate;)V", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "title", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;Ljava/lang/String;)V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "getTitle", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ContentTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class SearchResultItemDto implements Dto3<SearchResultItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SearchResultItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SearchResultItemDto, SearchResultItem>> binaryBase64Serializer$delegate;
    private static final SearchResultItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SearchResultItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SearchResultItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUnique_identifier() {
        return this.surrogate.getUnique_identifier();
    }

    public final ContentTypeDto getContent_type() {
        return this.surrogate.getContent_type();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public /* synthetic */ SearchResultItemDto(String str, ContentTypeDto contentTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContentTypeDto.INSTANCE.getZeroValue() : contentTypeDto, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResultItemDto(String unique_identifier, ContentTypeDto content_type, String title) {
        this(new Surrogate(unique_identifier, content_type, title));
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(title, "title");
    }

    public static /* synthetic */ SearchResultItemDto copy$default(SearchResultItemDto searchResultItemDto, String str, ContentTypeDto contentTypeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResultItemDto.surrogate.getUnique_identifier();
        }
        if ((i & 2) != 0) {
            contentTypeDto = searchResultItemDto.surrogate.getContent_type();
        }
        if ((i & 4) != 0) {
            str2 = searchResultItemDto.surrogate.getTitle();
        }
        return searchResultItemDto.copy(str, contentTypeDto, str2);
    }

    public final SearchResultItemDto copy(String unique_identifier, ContentTypeDto content_type, String title) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(title, "title");
        return new SearchResultItemDto(new Surrogate(unique_identifier, content_type, title));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SearchResultItem toProto() {
        return new SearchResultItem(this.surrogate.getUnique_identifier(), (SearchResultItem.ContentType) this.surrogate.getContent_type().toProto(), this.surrogate.getTitle(), null, 8, null);
    }

    public String toString() {
        return "[SearchResultItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SearchResultItemDto) && Intrinsics.areEqual(((SearchResultItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: SearchResultItemDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate;", "", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "title", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUnique_identifier$annotations", "()V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type$annotations", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "getTitle$annotations", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContentTypeDto content_type;
        private final String title;
        private final String unique_identifier;

        public Surrogate() {
            this((String) null, (ContentTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ContentTypeDto contentTypeDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.unique_identifier;
            }
            if ((i & 2) != 0) {
                contentTypeDto = surrogate.content_type;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.title;
            }
            return surrogate.copy(str, contentTypeDto, str2);
        }

        @SerialName("contentType")
        @JsonAnnotations2(names = {"content_type"})
        public static /* synthetic */ void getContent_type$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
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
        public final String getTitle() {
            return this.title;
        }

        public final Surrogate copy(String unique_identifier, ContentTypeDto content_type, String title) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(content_type, "content_type");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Surrogate(unique_identifier, content_type, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.unique_identifier, surrogate.unique_identifier) && this.content_type == surrogate.content_type && Intrinsics.areEqual(this.title, surrogate.title);
        }

        public int hashCode() {
            return (((this.unique_identifier.hashCode() * 31) + this.content_type.hashCode()) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Surrogate(unique_identifier=" + this.unique_identifier + ", content_type=" + this.content_type + ", title=" + this.title + ")";
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SearchResultItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ContentTypeDto contentTypeDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.title = "";
            } else {
                this.title = str2;
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
            if (Intrinsics.areEqual(self.title, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.title);
        }

        public Surrogate(String unique_identifier, ContentTypeDto content_type, String title) {
            Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
            Intrinsics.checkNotNullParameter(content_type, "content_type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.unique_identifier = unique_identifier;
            this.content_type = content_type;
            this.title = title;
        }

        public /* synthetic */ Surrogate(String str, ContentTypeDto contentTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContentTypeDto.INSTANCE.getZeroValue() : contentTypeDto, (i & 4) != 0 ? "" : str2);
        }

        public final String getUnique_identifier() {
            return this.unique_identifier;
        }

        public final ContentTypeDto getContent_type() {
            return this.content_type;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: SearchResultItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SearchResultItemDto, SearchResultItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SearchResultItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SearchResultItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SearchResultItemDto> getBinaryBase64Serializer() {
            return (KSerializer) SearchResultItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SearchResultItem> getProtoAdapter() {
            return SearchResultItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SearchResultItemDto getZeroValue() {
            return SearchResultItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SearchResultItemDto fromProto(SearchResultItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SearchResultItemDto(new Surrogate(proto.getUnique_identifier(), ContentTypeDto.INSTANCE.fromProto(proto.getContent_type()), proto.getTitle()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SearchResultItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SearchResultItemDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchResultItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_TYPE_UNSPECIFIED", "INSTRUMENT", "LIST", "CRYPTO", "HELP_ARTICLE", "LEARN_ARTICLE", "DEEPLINK", "EDUCATION", "ACTIVE_FUTURES", "NON_ACTIVE_FUTURES", "MARKET_INDEXES", "FUTURES_PRODUCTS", "EVENT_CONTRACTS", "FUTURES_CONTRACTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContentTypeDto implements Dto2<SearchResultItem.ContentType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContentTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContentTypeDto, SearchResultItem.ContentType>> binaryBase64Serializer$delegate;
        public static final ContentTypeDto CONTENT_TYPE_UNSPECIFIED = new CONTENT_TYPE_UNSPECIFIED("CONTENT_TYPE_UNSPECIFIED", 0);
        public static final ContentTypeDto INSTRUMENT = new INSTRUMENT("INSTRUMENT", 1);
        public static final ContentTypeDto LIST = new LIST("LIST", 2);
        public static final ContentTypeDto CRYPTO = new CRYPTO("CRYPTO", 3);
        public static final ContentTypeDto HELP_ARTICLE = new HELP_ARTICLE("HELP_ARTICLE", 4);
        public static final ContentTypeDto LEARN_ARTICLE = new LEARN_ARTICLE("LEARN_ARTICLE", 5);
        public static final ContentTypeDto DEEPLINK = new DEEPLINK("DEEPLINK", 6);
        public static final ContentTypeDto EDUCATION = new EDUCATION("EDUCATION", 7);
        public static final ContentTypeDto ACTIVE_FUTURES = new ACTIVE_FUTURES("ACTIVE_FUTURES", 8);
        public static final ContentTypeDto NON_ACTIVE_FUTURES = new NON_ACTIVE_FUTURES("NON_ACTIVE_FUTURES", 9);
        public static final ContentTypeDto MARKET_INDEXES = new MARKET_INDEXES("MARKET_INDEXES", 10);
        public static final ContentTypeDto FUTURES_PRODUCTS = new FUTURES_PRODUCTS("FUTURES_PRODUCTS", 11);
        public static final ContentTypeDto EVENT_CONTRACTS = new EVENT_CONTRACTS("EVENT_CONTRACTS", 12);
        public static final ContentTypeDto FUTURES_CONTRACTS = new FUTURES_CONTRACTS("FUTURES_CONTRACTS", 13);

        private static final /* synthetic */ ContentTypeDto[] $values() {
            return new ContentTypeDto[]{CONTENT_TYPE_UNSPECIFIED, INSTRUMENT, LIST, CRYPTO, HELP_ARTICLE, LEARN_ARTICLE, DEEPLINK, EDUCATION, ACTIVE_FUTURES, NON_ACTIVE_FUTURES, MARKET_INDEXES, FUTURES_PRODUCTS, EVENT_CONTRACTS, FUTURES_CONTRACTS};
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

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.CONTENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_TYPE_UNSPECIFIED extends ContentTypeDto {
            CONTENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SearchResultItemDto$ContentTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchResultItemDto.ContentTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.INSTRUMENT", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSTRUMENT extends ContentTypeDto {
            INSTRUMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.INSTRUMENT;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.LIST", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST extends ContentTypeDto {
            LIST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.LIST;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.CRYPTO", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends ContentTypeDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.CRYPTO;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.HELP_ARTICLE", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HELP_ARTICLE extends ContentTypeDto {
            HELP_ARTICLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.HELP_ARTICLE;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.LEARN_ARTICLE", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARN_ARTICLE extends ContentTypeDto {
            LEARN_ARTICLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.LEARN_ARTICLE;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEEPLINK extends ContentTypeDto {
            DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.DEEPLINK;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.EDUCATION", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EDUCATION extends ContentTypeDto {
            EDUCATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.EDUCATION;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.ACTIVE_FUTURES", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTIVE_FUTURES extends ContentTypeDto {
            ACTIVE_FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.ACTIVE_FUTURES;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.NON_ACTIVE_FUTURES", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NON_ACTIVE_FUTURES extends ContentTypeDto {
            NON_ACTIVE_FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.NON_ACTIVE_FUTURES;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.MARKET_INDEXES", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_INDEXES extends ContentTypeDto {
            MARKET_INDEXES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.MARKET_INDEXES;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.FUTURES_PRODUCTS", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FUTURES_PRODUCTS extends ContentTypeDto {
            FUTURES_PRODUCTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.FUTURES_PRODUCTS;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.EVENT_CONTRACTS", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACTS extends ContentTypeDto {
            EVENT_CONTRACTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.EVENT_CONTRACTS;
            }
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SearchResultItemDto.ContentTypeDto.FUTURES_CONTRACTS", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FUTURES_CONTRACTS extends ContentTypeDto {
            FUTURES_CONTRACTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SearchResultItem.ContentType toProto() {
                return SearchResultItem.ContentType.FUTURES_CONTRACTS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContentTypeDto, SearchResultItem.ContentType> {

            /* compiled from: SearchResultItemDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SearchResultItem.ContentType.values().length];
                    try {
                        iArr[SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.INSTRUMENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.LIST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.CRYPTO.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.HELP_ARTICLE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.LEARN_ARTICLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.DEEPLINK.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.EDUCATION.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.ACTIVE_FUTURES.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.NON_ACTIVE_FUTURES.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.MARKET_INDEXES.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.FUTURES_PRODUCTS.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.EVENT_CONTRACTS.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[SearchResultItem.ContentType.FUTURES_CONTRACTS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
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
            public ProtoAdapter<SearchResultItem.ContentType> getProtoAdapter() {
                return SearchResultItem.ContentType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentTypeDto getZeroValue() {
                return ContentTypeDto.CONTENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentTypeDto fromProto(SearchResultItem.ContentType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ContentTypeDto.CONTENT_TYPE_UNSPECIFIED;
                    case 2:
                        return ContentTypeDto.INSTRUMENT;
                    case 3:
                        return ContentTypeDto.LIST;
                    case 4:
                        return ContentTypeDto.CRYPTO;
                    case 5:
                        return ContentTypeDto.HELP_ARTICLE;
                    case 6:
                        return ContentTypeDto.LEARN_ARTICLE;
                    case 7:
                        return ContentTypeDto.DEEPLINK;
                    case 8:
                        return ContentTypeDto.EDUCATION;
                    case 9:
                        return ContentTypeDto.ACTIVE_FUTURES;
                    case 10:
                        return ContentTypeDto.NON_ACTIVE_FUTURES;
                    case 11:
                        return ContentTypeDto.MARKET_INDEXES;
                    case 12:
                        return ContentTypeDto.FUTURES_PRODUCTS;
                    case 13:
                        return ContentTypeDto.EVENT_CONTRACTS;
                    case 14:
                        return ContentTypeDto.FUTURES_CONTRACTS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SearchResultItemDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$ContentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContentTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContentTypeDto, SearchResultItem.ContentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SearchResultItem.ContentType", ContentTypeDto.getEntries(), ContentTypeDto.INSTANCE.getZeroValue());

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

    /* compiled from: SearchResultItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<SearchResultItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SearchResultItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SearchResultItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SearchResultItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SearchResultItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SearchResultItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SearchResultItemDto";
        }
    }
}
