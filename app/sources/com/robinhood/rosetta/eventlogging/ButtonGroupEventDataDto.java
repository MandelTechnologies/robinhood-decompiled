package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.ButtonGroupEventDataAdditionalInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ButtonGroupEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011JN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate;)V", "button_group_title", "", "button_title", "button_description", "entity_id", "tag", "entity_type", "additional_info", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;)V", "getButton_group_title", "()Ljava/lang/String;", "getButton_title", "getButton_description", "getEntity_id", "getTag", "getEntity_type", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ButtonGroupEventDataDto implements Dto3<ButtonGroupEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ButtonGroupEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ButtonGroupEventDataDto, ButtonGroupEventData>> binaryBase64Serializer$delegate;
    private static final ButtonGroupEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ButtonGroupEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ButtonGroupEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getButton_group_title() {
        return this.surrogate.getButton_group_title();
    }

    public final String getButton_title() {
        return this.surrogate.getButton_title();
    }

    public final String getButton_description() {
        return this.surrogate.getButton_description();
    }

    public final String getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final String getTag() {
        return this.surrogate.getTag();
    }

    public final String getEntity_type() {
        return this.surrogate.getEntity_type();
    }

    public final ButtonGroupEventDataAdditionalInfoDto getAdditional_info() {
        return this.surrogate.getAdditional_info();
    }

    public /* synthetic */ ButtonGroupEventDataDto(String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : buttonGroupEventDataAdditionalInfoDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonGroupEventDataDto(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto) {
        this(new Surrogate(button_group_title, button_title, button_description, entity_id, tag, entity_type, buttonGroupEventDataAdditionalInfoDto));
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
    }

    public static /* synthetic */ ButtonGroupEventDataDto copy$default(ButtonGroupEventDataDto buttonGroupEventDataDto, String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonGroupEventDataDto.surrogate.getButton_group_title();
        }
        if ((i & 2) != 0) {
            str2 = buttonGroupEventDataDto.surrogate.getButton_title();
        }
        if ((i & 4) != 0) {
            str3 = buttonGroupEventDataDto.surrogate.getButton_description();
        }
        if ((i & 8) != 0) {
            str4 = buttonGroupEventDataDto.surrogate.getEntity_id();
        }
        if ((i & 16) != 0) {
            str5 = buttonGroupEventDataDto.surrogate.getTag();
        }
        if ((i & 32) != 0) {
            str6 = buttonGroupEventDataDto.surrogate.getEntity_type();
        }
        if ((i & 64) != 0) {
            buttonGroupEventDataAdditionalInfoDto = buttonGroupEventDataDto.surrogate.getAdditional_info();
        }
        String str7 = str6;
        ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto2 = buttonGroupEventDataAdditionalInfoDto;
        String str8 = str5;
        String str9 = str3;
        return buttonGroupEventDataDto.copy(str, str2, str9, str4, str8, str7, buttonGroupEventDataAdditionalInfoDto2);
    }

    public final ButtonGroupEventDataDto copy(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfoDto additional_info) {
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        return new ButtonGroupEventDataDto(new Surrogate(button_group_title, button_title, button_description, entity_id, tag, entity_type, additional_info));
    }

    @Override // com.robinhood.idl.Dto
    public ButtonGroupEventData toProto() {
        String button_group_title = this.surrogate.getButton_group_title();
        String button_title = this.surrogate.getButton_title();
        String button_description = this.surrogate.getButton_description();
        String entity_id = this.surrogate.getEntity_id();
        String tag = this.surrogate.getTag();
        String entity_type = this.surrogate.getEntity_type();
        ButtonGroupEventDataAdditionalInfoDto additional_info = this.surrogate.getAdditional_info();
        return new ButtonGroupEventData(button_group_title, button_title, button_description, entity_id, tag, entity_type, additional_info != null ? additional_info.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[ButtonGroupEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ButtonGroupEventDataDto) && Intrinsics.areEqual(((ButtonGroupEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ButtonGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate;", "", "button_group_title", "", "button_title", "button_description", "entity_id", "tag", "entity_type", "additional_info", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getButton_group_title$annotations", "()V", "getButton_group_title", "()Ljava/lang/String;", "getButton_title$annotations", "getButton_title", "getButton_description$annotations", "getButton_description", "getEntity_id$annotations", "getEntity_id", "getTag$annotations", "getTag", "getEntity_type$annotations", "getEntity_type", "getAdditional_info$annotations", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataAdditionalInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ButtonGroupEventDataAdditionalInfoDto additional_info;
        private final String button_description;
        private final String button_group_title;
        private final String button_title;
        private final String entity_id;
        private final String entity_type;
        private final String tag;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ButtonGroupEventDataAdditionalInfoDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.button_group_title;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.button_title;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.button_description;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.entity_id;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.tag;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.entity_type;
            }
            if ((i & 64) != 0) {
                buttonGroupEventDataAdditionalInfoDto = surrogate.additional_info;
            }
            String str7 = str6;
            ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto2 = buttonGroupEventDataAdditionalInfoDto;
            String str8 = str5;
            String str9 = str3;
            return surrogate.copy(str, str2, str9, str4, str8, str7, buttonGroupEventDataAdditionalInfoDto2);
        }

        @SerialName("additionalInfo")
        @JsonAnnotations2(names = {"additional_info"})
        public static /* synthetic */ void getAdditional_info$annotations() {
        }

        @SerialName("buttonDescription")
        @JsonAnnotations2(names = {"button_description"})
        public static /* synthetic */ void getButton_description$annotations() {
        }

        @SerialName("buttonGroupTitle")
        @JsonAnnotations2(names = {"button_group_title"})
        public static /* synthetic */ void getButton_group_title$annotations() {
        }

        @SerialName("buttonTitle")
        @JsonAnnotations2(names = {"button_title"})
        public static /* synthetic */ void getButton_title$annotations() {
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("entityType")
        @JsonAnnotations2(names = {"entity_type"})
        public static /* synthetic */ void getEntity_type$annotations() {
        }

        @SerialName("tag")
        @JsonAnnotations2(names = {"tag"})
        public static /* synthetic */ void getTag$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getButton_group_title() {
            return this.button_group_title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButton_title() {
            return this.button_title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getButton_description() {
            return this.button_description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEntity_id() {
            return this.entity_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEntity_type() {
            return this.entity_type;
        }

        /* renamed from: component7, reason: from getter */
        public final ButtonGroupEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }

        public final Surrogate copy(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfoDto additional_info) {
            Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
            Intrinsics.checkNotNullParameter(button_title, "button_title");
            Intrinsics.checkNotNullParameter(button_description, "button_description");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            return new Surrogate(button_group_title, button_title, button_description, entity_id, tag, entity_type, additional_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.button_group_title, surrogate.button_group_title) && Intrinsics.areEqual(this.button_title, surrogate.button_title) && Intrinsics.areEqual(this.button_description, surrogate.button_description) && Intrinsics.areEqual(this.entity_id, surrogate.entity_id) && Intrinsics.areEqual(this.tag, surrogate.tag) && Intrinsics.areEqual(this.entity_type, surrogate.entity_type) && Intrinsics.areEqual(this.additional_info, surrogate.additional_info);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.button_group_title.hashCode() * 31) + this.button_title.hashCode()) * 31) + this.button_description.hashCode()) * 31) + this.entity_id.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.entity_type.hashCode()) * 31;
            ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto = this.additional_info;
            return iHashCode + (buttonGroupEventDataAdditionalInfoDto == null ? 0 : buttonGroupEventDataAdditionalInfoDto.hashCode());
        }

        public String toString() {
            return "Surrogate(button_group_title=" + this.button_group_title + ", button_title=" + this.button_title + ", button_description=" + this.button_description + ", entity_id=" + this.entity_id + ", tag=" + this.tag + ", entity_type=" + this.entity_type + ", additional_info=" + this.additional_info + ")";
        }

        /* compiled from: ButtonGroupEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ButtonGroupEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.button_group_title = "";
            } else {
                this.button_group_title = str;
            }
            if ((i & 2) == 0) {
                this.button_title = "";
            } else {
                this.button_title = str2;
            }
            if ((i & 4) == 0) {
                this.button_description = "";
            } else {
                this.button_description = str3;
            }
            if ((i & 8) == 0) {
                this.entity_id = "";
            } else {
                this.entity_id = str4;
            }
            if ((i & 16) == 0) {
                this.tag = "";
            } else {
                this.tag = str5;
            }
            if ((i & 32) == 0) {
                this.entity_type = "";
            } else {
                this.entity_type = str6;
            }
            if ((i & 64) == 0) {
                this.additional_info = null;
            } else {
                this.additional_info = buttonGroupEventDataAdditionalInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.button_group_title, "")) {
                output.encodeStringElement(serialDesc, 0, self.button_group_title);
            }
            if (!Intrinsics.areEqual(self.button_title, "")) {
                output.encodeStringElement(serialDesc, 1, self.button_title);
            }
            if (!Intrinsics.areEqual(self.button_description, "")) {
                output.encodeStringElement(serialDesc, 2, self.button_description);
            }
            if (!Intrinsics.areEqual(self.entity_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.entity_id);
            }
            if (!Intrinsics.areEqual(self.tag, "")) {
                output.encodeStringElement(serialDesc, 4, self.tag);
            }
            if (!Intrinsics.areEqual(self.entity_type, "")) {
                output.encodeStringElement(serialDesc, 5, self.entity_type);
            }
            ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto = self.additional_info;
            if (buttonGroupEventDataAdditionalInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ButtonGroupEventDataAdditionalInfoDto.Serializer.INSTANCE, buttonGroupEventDataAdditionalInfoDto);
            }
        }

        public Surrogate(String button_group_title, String button_title, String button_description, String entity_id, String tag, String entity_type, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto) {
            Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
            Intrinsics.checkNotNullParameter(button_title, "button_title");
            Intrinsics.checkNotNullParameter(button_description, "button_description");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            this.button_group_title = button_group_title;
            this.button_title = button_title;
            this.button_description = button_description;
            this.entity_id = entity_id;
            this.tag = tag;
            this.entity_type = entity_type;
            this.additional_info = buttonGroupEventDataAdditionalInfoDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, ButtonGroupEventDataAdditionalInfoDto buttonGroupEventDataAdditionalInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : buttonGroupEventDataAdditionalInfoDto);
        }

        public final String getButton_group_title() {
            return this.button_group_title;
        }

        public final String getButton_title() {
            return this.button_title;
        }

        public final String getButton_description() {
            return this.button_description;
        }

        public final String getEntity_id() {
            return this.entity_id;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getEntity_type() {
            return this.entity_type;
        }

        public final ButtonGroupEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }
    }

    /* compiled from: ButtonGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ButtonGroupEventDataDto, ButtonGroupEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ButtonGroupEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ButtonGroupEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ButtonGroupEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) ButtonGroupEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ButtonGroupEventData> getProtoAdapter() {
            return ButtonGroupEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ButtonGroupEventDataDto getZeroValue() {
            return ButtonGroupEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ButtonGroupEventDataDto fromProto(ButtonGroupEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String button_group_title = proto.getButton_group_title();
            String button_title = proto.getButton_title();
            String button_description = proto.getButton_description();
            String entity_id = proto.getEntity_id();
            String tag = proto.getTag();
            String entity_type = proto.getEntity_type();
            ButtonGroupEventDataAdditionalInfo additional_info = proto.getAdditional_info();
            return new ButtonGroupEventDataDto(new Surrogate(button_group_title, button_title, button_description, entity_id, tag, entity_type, additional_info != null ? ButtonGroupEventDataAdditionalInfoDto.INSTANCE.fromProto(additional_info) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ButtonGroupEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ButtonGroupEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ButtonGroupEventDataDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ButtonGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ButtonGroupEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ButtonGroupEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ButtonGroupEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ButtonGroupEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ButtonGroupEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ButtonGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ButtonGroupEventDataDto";
        }
    }
}
