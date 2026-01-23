package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: SuggestedResponseFlinkProtoDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProto;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate;)V", "id", "", "message_id", "response", "display_order", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getMessage_id", "getResponse", "getDisplay_order", "getSelected", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class SuggestedResponseFlinkProtoDto implements Dto3<SuggestedResponseFlinkProto>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SuggestedResponseFlinkProtoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SuggestedResponseFlinkProtoDto, SuggestedResponseFlinkProto>> binaryBase64Serializer$delegate;
    private static final SuggestedResponseFlinkProtoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SuggestedResponseFlinkProtoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SuggestedResponseFlinkProtoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getMessage_id() {
        return this.surrogate.getMessage_id();
    }

    public final String getResponse() {
        return this.surrogate.getResponse();
    }

    public final String getDisplay_order() {
        return this.surrogate.getDisplay_order();
    }

    public final boolean getSelected() {
        return this.surrogate.getSelected();
    }

    public /* synthetic */ SuggestedResponseFlinkProtoDto(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestedResponseFlinkProtoDto(String id, String message_id, String response, String display_order, boolean z) {
        this(new Surrogate(id, message_id, response, display_order, z));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message_id, "message_id");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(display_order, "display_order");
    }

    public static /* synthetic */ SuggestedResponseFlinkProtoDto copy$default(SuggestedResponseFlinkProtoDto suggestedResponseFlinkProtoDto, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedResponseFlinkProtoDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = suggestedResponseFlinkProtoDto.surrogate.getMessage_id();
        }
        if ((i & 4) != 0) {
            str3 = suggestedResponseFlinkProtoDto.surrogate.getResponse();
        }
        if ((i & 8) != 0) {
            str4 = suggestedResponseFlinkProtoDto.surrogate.getDisplay_order();
        }
        if ((i & 16) != 0) {
            z = suggestedResponseFlinkProtoDto.surrogate.getSelected();
        }
        boolean z2 = z;
        String str5 = str3;
        return suggestedResponseFlinkProtoDto.copy(str, str2, str5, str4, z2);
    }

    public final SuggestedResponseFlinkProtoDto copy(String id, String message_id, String response, String display_order, boolean selected) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message_id, "message_id");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(display_order, "display_order");
        return new SuggestedResponseFlinkProtoDto(new Surrogate(id, message_id, response, display_order, selected));
    }

    @Override // com.robinhood.idl.Dto
    public SuggestedResponseFlinkProto toProto() {
        return new SuggestedResponseFlinkProto(this.surrogate.getId(), this.surrogate.getMessage_id(), this.surrogate.getResponse(), this.surrogate.getDisplay_order(), this.surrogate.getSelected(), null, 32, null);
    }

    public String toString() {
        return "[SuggestedResponseFlinkProtoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SuggestedResponseFlinkProtoDto) && Intrinsics.areEqual(((SuggestedResponseFlinkProtoDto) other).surrogate, this.surrogate);
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
    /* compiled from: SuggestedResponseFlinkProtoDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate;", "", "id", "", "message_id", "response", "display_order", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getMessage_id$annotations", "getMessage_id", "getResponse$annotations", "getResponse", "getDisplay_order$annotations", "getDisplay_order", "getSelected$annotations", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String display_order;
        private final String id;
        private final String message_id;
        private final String response;
        private final boolean selected;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.message_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.response;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.display_order;
            }
            if ((i & 16) != 0) {
                z = surrogate.selected;
            }
            boolean z2 = z;
            String str5 = str3;
            return surrogate.copy(str, str2, str5, str4, z2);
        }

        @SerialName("displayOrder")
        @JsonAnnotations2(names = {"display_order"})
        public static /* synthetic */ void getDisplay_order$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("messageId")
        @JsonAnnotations2(names = {"message_id"})
        public static /* synthetic */ void getMessage_id$annotations() {
        }

        @SerialName("response")
        @JsonAnnotations2(names = {"response"})
        public static /* synthetic */ void getResponse$annotations() {
        }

        @SerialName("selected")
        @JsonAnnotations2(names = {"selected"})
        public static /* synthetic */ void getSelected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage_id() {
            return this.message_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getResponse() {
            return this.response;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplay_order() {
            return this.display_order;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Surrogate copy(String id, String message_id, String response, String display_order, boolean selected) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(message_id, "message_id");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(display_order, "display_order");
            return new Surrogate(id, message_id, response, display_order, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.message_id, surrogate.message_id) && Intrinsics.areEqual(this.response, surrogate.response) && Intrinsics.areEqual(this.display_order, surrogate.display_order) && this.selected == surrogate.selected;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.message_id.hashCode()) * 31) + this.response.hashCode()) * 31) + this.display_order.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", message_id=" + this.message_id + ", response=" + this.response + ", display_order=" + this.display_order + ", selected=" + this.selected + ")";
        }

        /* compiled from: SuggestedResponseFlinkProtoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SuggestedResponseFlinkProtoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.message_id = "";
            } else {
                this.message_id = str2;
            }
            if ((i & 4) == 0) {
                this.response = "";
            } else {
                this.response = str3;
            }
            if ((i & 8) == 0) {
                this.display_order = "";
            } else {
                this.display_order = str4;
            }
            if ((i & 16) == 0) {
                this.selected = false;
            } else {
                this.selected = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.message_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.message_id);
            }
            if (!Intrinsics.areEqual(self.response, "")) {
                output.encodeStringElement(serialDesc, 2, self.response);
            }
            if (!Intrinsics.areEqual(self.display_order, "")) {
                output.encodeStringElement(serialDesc, 3, self.display_order);
            }
            boolean z = self.selected;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(String id, String message_id, String response, String display_order, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(message_id, "message_id");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(display_order, "display_order");
            this.id = id;
            this.message_id = message_id;
            this.response = response;
            this.display_order = display_order;
            this.selected = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z);
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessage_id() {
            return this.message_id;
        }

        public final String getResponse() {
            return this.response;
        }

        public final String getDisplay_order() {
            return this.display_order;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }

    /* compiled from: SuggestedResponseFlinkProtoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProto;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SuggestedResponseFlinkProtoDto, SuggestedResponseFlinkProto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SuggestedResponseFlinkProtoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SuggestedResponseFlinkProtoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SuggestedResponseFlinkProtoDto> getBinaryBase64Serializer() {
            return (KSerializer) SuggestedResponseFlinkProtoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SuggestedResponseFlinkProto> getProtoAdapter() {
            return SuggestedResponseFlinkProto.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SuggestedResponseFlinkProtoDto getZeroValue() {
            return SuggestedResponseFlinkProtoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SuggestedResponseFlinkProtoDto fromProto(SuggestedResponseFlinkProto proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SuggestedResponseFlinkProtoDto(new Surrogate(proto.getId(), proto.getMessage_id(), proto.getResponse(), proto.getDisplay_order(), proto.getSelected()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.SuggestedResponseFlinkProtoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuggestedResponseFlinkProtoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SuggestedResponseFlinkProtoDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SuggestedResponseFlinkProtoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<SuggestedResponseFlinkProtoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.SuggestedResponseFlinkProto", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SuggestedResponseFlinkProtoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SuggestedResponseFlinkProtoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SuggestedResponseFlinkProtoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SuggestedResponseFlinkProtoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProtoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.SuggestedResponseFlinkProtoDto";
        }
    }
}
