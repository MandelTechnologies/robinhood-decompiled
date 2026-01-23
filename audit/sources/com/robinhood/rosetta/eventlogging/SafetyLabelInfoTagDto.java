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
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTagDto;
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

/* compiled from: SafetyLabelInfoTagDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate;)V", "title", "", "info_tag_type", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "logging_identifier", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getInfo_tag_type", "()Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "getLogging_identifier", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "InfoTagTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class SafetyLabelInfoTagDto implements Dto3<SafetyLabelInfoTag>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SafetyLabelInfoTagDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SafetyLabelInfoTagDto, SafetyLabelInfoTag>> binaryBase64Serializer$delegate;
    private static final SafetyLabelInfoTagDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SafetyLabelInfoTagDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SafetyLabelInfoTagDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final InfoTagTypeDto getInfo_tag_type() {
        return this.surrogate.getInfo_tag_type();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public /* synthetic */ SafetyLabelInfoTagDto(String str, InfoTagTypeDto infoTagTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? InfoTagTypeDto.INSTANCE.getZeroValue() : infoTagTypeDto, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafetyLabelInfoTagDto(String title, InfoTagTypeDto info_tag_type, String logging_identifier) {
        this(new Surrogate(title, info_tag_type, logging_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    public static /* synthetic */ SafetyLabelInfoTagDto copy$default(SafetyLabelInfoTagDto safetyLabelInfoTagDto, String str, InfoTagTypeDto infoTagTypeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safetyLabelInfoTagDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            infoTagTypeDto = safetyLabelInfoTagDto.surrogate.getInfo_tag_type();
        }
        if ((i & 4) != 0) {
            str2 = safetyLabelInfoTagDto.surrogate.getLogging_identifier();
        }
        return safetyLabelInfoTagDto.copy(str, infoTagTypeDto, str2);
    }

    public final SafetyLabelInfoTagDto copy(String title, InfoTagTypeDto info_tag_type, String logging_identifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        return new SafetyLabelInfoTagDto(new Surrogate(title, info_tag_type, logging_identifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SafetyLabelInfoTag toProto() {
        return new SafetyLabelInfoTag(this.surrogate.getTitle(), (SafetyLabelInfoTag.InfoTagType) this.surrogate.getInfo_tag_type().toProto(), this.surrogate.getLogging_identifier(), null, 8, null);
    }

    public String toString() {
        return "[SafetyLabelInfoTagDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SafetyLabelInfoTagDto) && Intrinsics.areEqual(((SafetyLabelInfoTagDto) other).surrogate, this.surrogate);
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
    /* compiled from: SafetyLabelInfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate;", "", "title", "", "info_tag_type", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "logging_identifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getInfo_tag_type$annotations", "getInfo_tag_type", "()Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "getLogging_identifier$annotations", "getLogging_identifier", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InfoTagTypeDto info_tag_type;
        private final String logging_identifier;
        private final String title;

        public Surrogate() {
            this((String) null, (InfoTagTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, InfoTagTypeDto infoTagTypeDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                infoTagTypeDto = surrogate.info_tag_type;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.logging_identifier;
            }
            return surrogate.copy(str, infoTagTypeDto, str2);
        }

        @SerialName("infoTagType")
        @JsonAnnotations2(names = {"info_tag_type"})
        public static /* synthetic */ void getInfo_tag_type$annotations() {
        }

        @SerialName("loggingIdentifier")
        @JsonAnnotations2(names = {"logging_identifier"})
        public static /* synthetic */ void getLogging_identifier$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final InfoTagTypeDto getInfo_tag_type() {
            return this.info_tag_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final Surrogate copy(String title, InfoTagTypeDto info_tag_type, String logging_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            return new Surrogate(title, info_tag_type, logging_identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && this.info_tag_type == surrogate.info_tag_type && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.info_tag_type.hashCode()) * 31) + this.logging_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", info_tag_type=" + this.info_tag_type + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SafetyLabelInfoTagDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, InfoTagTypeDto infoTagTypeDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.info_tag_type = InfoTagTypeDto.INSTANCE.getZeroValue();
            } else {
                this.info_tag_type = infoTagTypeDto;
            }
            if ((i & 4) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (self.info_tag_type != InfoTagTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, InfoTagTypeDto.Serializer.INSTANCE, self.info_tag_type);
            }
            if (Intrinsics.areEqual(self.logging_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.logging_identifier);
        }

        public Surrogate(String title, InfoTagTypeDto info_tag_type, String logging_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.title = title;
            this.info_tag_type = info_tag_type;
            this.logging_identifier = logging_identifier;
        }

        public /* synthetic */ Surrogate(String str, InfoTagTypeDto infoTagTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? InfoTagTypeDto.INSTANCE.getZeroValue() : infoTagTypeDto, (i & 4) != 0 ? "" : str2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final InfoTagTypeDto getInfo_tag_type() {
            return this.info_tag_type;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: SafetyLabelInfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SafetyLabelInfoTagDto, SafetyLabelInfoTag> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SafetyLabelInfoTagDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SafetyLabelInfoTagDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SafetyLabelInfoTagDto> getBinaryBase64Serializer() {
            return (KSerializer) SafetyLabelInfoTagDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SafetyLabelInfoTag> getProtoAdapter() {
            return SafetyLabelInfoTag.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SafetyLabelInfoTagDto getZeroValue() {
            return SafetyLabelInfoTagDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SafetyLabelInfoTagDto fromProto(SafetyLabelInfoTag proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SafetyLabelInfoTagDto(new Surrogate(proto.getTitle(), InfoTagTypeDto.INSTANCE.fromProto(proto.getInfo_tag_type()), proto.getLogging_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SafetyLabelInfoTagDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SafetyLabelInfoTagDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SafetyLabelInfoTagDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLabelInfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INFO_TAG_TYPE_UNSPECIFIED", "INFO_TAG_TYPE_ALERT", "INFO_TAG_TYPE_INFORM", "INFO_TAG_TYPE_INLINE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InfoTagTypeDto implements Dto2<SafetyLabelInfoTag.InfoTagType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoTagTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<InfoTagTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InfoTagTypeDto, SafetyLabelInfoTag.InfoTagType>> binaryBase64Serializer$delegate;
        public static final InfoTagTypeDto INFO_TAG_TYPE_UNSPECIFIED = new INFO_TAG_TYPE_UNSPECIFIED("INFO_TAG_TYPE_UNSPECIFIED", 0);
        public static final InfoTagTypeDto INFO_TAG_TYPE_ALERT = new INFO_TAG_TYPE_ALERT("INFO_TAG_TYPE_ALERT", 1);
        public static final InfoTagTypeDto INFO_TAG_TYPE_INFORM = new INFO_TAG_TYPE_INFORM("INFO_TAG_TYPE_INFORM", 2);
        public static final InfoTagTypeDto INFO_TAG_TYPE_INLINE = new INFO_TAG_TYPE_INLINE("INFO_TAG_TYPE_INLINE", 3);

        private static final /* synthetic */ InfoTagTypeDto[] $values() {
            return new InfoTagTypeDto[]{INFO_TAG_TYPE_UNSPECIFIED, INFO_TAG_TYPE_ALERT, INFO_TAG_TYPE_INFORM, INFO_TAG_TYPE_INLINE};
        }

        public /* synthetic */ InfoTagTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<InfoTagTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto.InfoTagTypeDto.INFO_TAG_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_TAG_TYPE_UNSPECIFIED extends InfoTagTypeDto {
            INFO_TAG_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SafetyLabelInfoTag.InfoTagType toProto() {
                return SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED;
            }
        }

        private InfoTagTypeDto(String str, int i) {
        }

        static {
            InfoTagTypeDto[] infoTagTypeDtoArr$values = $values();
            $VALUES = infoTagTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoTagTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SafetyLabelInfoTagDto$InfoTagTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SafetyLabelInfoTagDto.InfoTagTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto.InfoTagTypeDto.INFO_TAG_TYPE_ALERT", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_TAG_TYPE_ALERT extends InfoTagTypeDto {
            INFO_TAG_TYPE_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SafetyLabelInfoTag.InfoTagType toProto() {
                return SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_ALERT;
            }
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto.InfoTagTypeDto.INFO_TAG_TYPE_INFORM", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_TAG_TYPE_INFORM extends InfoTagTypeDto {
            INFO_TAG_TYPE_INFORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SafetyLabelInfoTag.InfoTagType toProto() {
                return SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_INFORM;
            }
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto.InfoTagTypeDto.INFO_TAG_TYPE_INLINE", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_TAG_TYPE_INLINE extends InfoTagTypeDto {
            INFO_TAG_TYPE_INLINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SafetyLabelInfoTag.InfoTagType toProto() {
                return SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_INLINE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<InfoTagTypeDto, SafetyLabelInfoTag.InfoTagType> {

            /* compiled from: SafetyLabelInfoTagDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SafetyLabelInfoTag.InfoTagType.values().length];
                    try {
                        iArr[SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_ALERT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_INFORM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_INLINE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InfoTagTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InfoTagTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InfoTagTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) InfoTagTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SafetyLabelInfoTag.InfoTagType> getProtoAdapter() {
                return SafetyLabelInfoTag.InfoTagType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InfoTagTypeDto getZeroValue() {
                return InfoTagTypeDto.INFO_TAG_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InfoTagTypeDto fromProto(SafetyLabelInfoTag.InfoTagType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return InfoTagTypeDto.INFO_TAG_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return InfoTagTypeDto.INFO_TAG_TYPE_ALERT;
                }
                if (i == 3) {
                    return InfoTagTypeDto.INFO_TAG_TYPE_INFORM;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return InfoTagTypeDto.INFO_TAG_TYPE_INLINE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SafetyLabelInfoTagDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$InfoTagTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<InfoTagTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<InfoTagTypeDto, SafetyLabelInfoTag.InfoTagType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SafetyLabelInfoTag.InfoTagType", InfoTagTypeDto.getEntries(), InfoTagTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public InfoTagTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (InfoTagTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InfoTagTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static InfoTagTypeDto valueOf(String str) {
            return (InfoTagTypeDto) Enum.valueOf(InfoTagTypeDto.class, str);
        }

        public static InfoTagTypeDto[] values() {
            return (InfoTagTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SafetyLabelInfoTagDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<SafetyLabelInfoTagDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SafetyLabelInfoTag", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SafetyLabelInfoTagDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SafetyLabelInfoTagDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SafetyLabelInfoTagDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SafetyLabelInfoTagDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTagDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SafetyLabelInfoTagDto";
        }
    }
}
