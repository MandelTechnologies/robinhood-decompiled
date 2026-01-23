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

/* compiled from: PushNotificationEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate;)V", "message_uuid", "", "message_type", "message", "po_box", "message_title", "message_body", "locality", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage_uuid", "()Ljava/lang/String;", "getMessage_type", "getMessage", "getPo_box", "getMessage_title", "getMessage_body", "getLocality", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PushNotificationEventDataDto implements Dto3<PushNotificationEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PushNotificationEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PushNotificationEventDataDto, PushNotificationEventData>> binaryBase64Serializer$delegate;
    private static final PushNotificationEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PushNotificationEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PushNotificationEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getMessage_uuid() {
        return this.surrogate.getMessage_uuid();
    }

    public final String getMessage_type() {
        return this.surrogate.getMessage_type();
    }

    public final String getMessage() {
        return this.surrogate.getMessage();
    }

    public final String getPo_box() {
        return this.surrogate.getPo_box();
    }

    public final String getMessage_title() {
        return this.surrogate.getMessage_title();
    }

    public final String getMessage_body() {
        return this.surrogate.getMessage_body();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public /* synthetic */ PushNotificationEventDataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushNotificationEventDataDto(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality) {
        this(new Surrogate(message_uuid, message_type, message, po_box, message_title, message_body, locality));
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(locality, "locality");
    }

    public static /* synthetic */ PushNotificationEventDataDto copy$default(PushNotificationEventDataDto pushNotificationEventDataDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationEventDataDto.surrogate.getMessage_uuid();
        }
        if ((i & 2) != 0) {
            str2 = pushNotificationEventDataDto.surrogate.getMessage_type();
        }
        if ((i & 4) != 0) {
            str3 = pushNotificationEventDataDto.surrogate.getMessage();
        }
        if ((i & 8) != 0) {
            str4 = pushNotificationEventDataDto.surrogate.getPo_box();
        }
        if ((i & 16) != 0) {
            str5 = pushNotificationEventDataDto.surrogate.getMessage_title();
        }
        if ((i & 32) != 0) {
            str6 = pushNotificationEventDataDto.surrogate.getMessage_body();
        }
        if ((i & 64) != 0) {
            str7 = pushNotificationEventDataDto.surrogate.getLocality();
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return pushNotificationEventDataDto.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final PushNotificationEventDataDto copy(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality) {
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new PushNotificationEventDataDto(new Surrogate(message_uuid, message_type, message, po_box, message_title, message_body, locality));
    }

    @Override // com.robinhood.idl.Dto
    public PushNotificationEventData toProto() {
        return new PushNotificationEventData(this.surrogate.getMessage_uuid(), this.surrogate.getMessage_type(), this.surrogate.getMessage(), this.surrogate.getPo_box(), this.surrogate.getMessage_title(), this.surrogate.getMessage_body(), this.surrogate.getLocality(), null, 128, null);
    }

    public String toString() {
        return "[PushNotificationEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PushNotificationEventDataDto) && Intrinsics.areEqual(((PushNotificationEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PushNotificationEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\rHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate;", "", "message_uuid", "", "message_type", "message", "po_box", "message_title", "message_body", "locality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage_uuid$annotations", "()V", "getMessage_uuid", "()Ljava/lang/String;", "getMessage_type$annotations", "getMessage_type", "getMessage$annotations", "getMessage", "getPo_box$annotations", "getPo_box", "getMessage_title$annotations", "getMessage_title", "getMessage_body$annotations", "getMessage_body", "getLocality$annotations", "getLocality", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String locality;
        private final String message;
        private final String message_body;
        private final String message_title;
        private final String message_type;
        private final String message_uuid;
        private final String po_box;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.message_uuid;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.message_type;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.message;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.po_box;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.message_title;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.message_body;
            }
            if ((i & 64) != 0) {
                str7 = surrogate.locality;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return surrogate.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("message")
        @JsonAnnotations2(names = {"message"})
        public static /* synthetic */ void getMessage$annotations() {
        }

        @SerialName("messageBody")
        @JsonAnnotations2(names = {"message_body"})
        public static /* synthetic */ void getMessage_body$annotations() {
        }

        @SerialName("messageTitle")
        @JsonAnnotations2(names = {"message_title"})
        public static /* synthetic */ void getMessage_title$annotations() {
        }

        @SerialName("messageType")
        @JsonAnnotations2(names = {"message_type"})
        public static /* synthetic */ void getMessage_type$annotations() {
        }

        @SerialName("messageUuid")
        @JsonAnnotations2(names = {"message_uuid"})
        public static /* synthetic */ void getMessage_uuid$annotations() {
        }

        @SerialName("poBox")
        @JsonAnnotations2(names = {"po_box"})
        public static /* synthetic */ void getPo_box$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage_type() {
            return this.message_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPo_box() {
            return this.po_box;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessage_title() {
            return this.message_title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMessage_body() {
            return this.message_body;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        public final Surrogate copy(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality) {
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body, "message_body");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Surrogate(message_uuid, message_type, message, po_box, message_title, message_body, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.message_uuid, surrogate.message_uuid) && Intrinsics.areEqual(this.message_type, surrogate.message_type) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.po_box, surrogate.po_box) && Intrinsics.areEqual(this.message_title, surrogate.message_title) && Intrinsics.areEqual(this.message_body, surrogate.message_body) && Intrinsics.areEqual(this.locality, surrogate.locality);
        }

        public int hashCode() {
            return (((((((((((this.message_uuid.hashCode() * 31) + this.message_type.hashCode()) * 31) + this.message.hashCode()) * 31) + this.po_box.hashCode()) * 31) + this.message_title.hashCode()) * 31) + this.message_body.hashCode()) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Surrogate(message_uuid=" + this.message_uuid + ", message_type=" + this.message_type + ", message=" + this.message + ", po_box=" + this.po_box + ", message_title=" + this.message_title + ", message_body=" + this.message_body + ", locality=" + this.locality + ")";
        }

        /* compiled from: PushNotificationEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PushNotificationEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.message_uuid = "";
            } else {
                this.message_uuid = str;
            }
            if ((i & 2) == 0) {
                this.message_type = "";
            } else {
                this.message_type = str2;
            }
            if ((i & 4) == 0) {
                this.message = "";
            } else {
                this.message = str3;
            }
            if ((i & 8) == 0) {
                this.po_box = "";
            } else {
                this.po_box = str4;
            }
            if ((i & 16) == 0) {
                this.message_title = "";
            } else {
                this.message_title = str5;
            }
            if ((i & 32) == 0) {
                this.message_body = "";
            } else {
                this.message_body = str6;
            }
            if ((i & 64) == 0) {
                this.locality = "";
            } else {
                this.locality = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.message_uuid, "")) {
                output.encodeStringElement(serialDesc, 0, self.message_uuid);
            }
            if (!Intrinsics.areEqual(self.message_type, "")) {
                output.encodeStringElement(serialDesc, 1, self.message_type);
            }
            if (!Intrinsics.areEqual(self.message, "")) {
                output.encodeStringElement(serialDesc, 2, self.message);
            }
            if (!Intrinsics.areEqual(self.po_box, "")) {
                output.encodeStringElement(serialDesc, 3, self.po_box);
            }
            if (!Intrinsics.areEqual(self.message_title, "")) {
                output.encodeStringElement(serialDesc, 4, self.message_title);
            }
            if (!Intrinsics.areEqual(self.message_body, "")) {
                output.encodeStringElement(serialDesc, 5, self.message_body);
            }
            if (Intrinsics.areEqual(self.locality, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.locality);
        }

        public Surrogate(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality) {
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body, "message_body");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.message_uuid = message_uuid;
            this.message_type = message_type;
            this.message = message;
            this.po_box = po_box;
            this.message_title = message_title;
            this.message_body = message_body;
            this.locality = locality;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
        }

        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        public final String getMessage_type() {
            return this.message_type;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPo_box() {
            return this.po_box;
        }

        public final String getMessage_title() {
            return this.message_title;
        }

        public final String getMessage_body() {
            return this.message_body;
        }

        public final String getLocality() {
            return this.locality;
        }
    }

    /* compiled from: PushNotificationEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PushNotificationEventDataDto, PushNotificationEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PushNotificationEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PushNotificationEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PushNotificationEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PushNotificationEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PushNotificationEventData> getProtoAdapter() {
            return PushNotificationEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PushNotificationEventDataDto getZeroValue() {
            return PushNotificationEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PushNotificationEventDataDto fromProto(PushNotificationEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PushNotificationEventDataDto(new Surrogate(proto.getMessage_uuid(), proto.getMessage_type(), proto.getMessage(), proto.getPo_box(), proto.getMessage_title(), proto.getMessage_body(), proto.getLocality()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PushNotificationEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PushNotificationEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PushNotificationEventDataDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PushNotificationEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PushNotificationEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PushNotificationEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PushNotificationEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PushNotificationEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PushNotificationEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PushNotificationEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PushNotificationEventDataDto";
        }
    }
}
