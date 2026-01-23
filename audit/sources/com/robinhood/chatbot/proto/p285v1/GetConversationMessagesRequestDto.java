package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.models.card.p311db.Card;
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

/* compiled from: GetConversationMessagesRequestDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate;)V", "id", "", "page_offset", "", "page_size", Card.Icon.ORDER, "(Ljava/lang/String;IILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPage_offset", "()I", "getPage_size", "getOrder", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class GetConversationMessagesRequestDto implements Dto3<GetConversationMessagesRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetConversationMessagesRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetConversationMessagesRequestDto, GetConversationMessagesRequest>> binaryBase64Serializer$delegate;
    private static final GetConversationMessagesRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetConversationMessagesRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetConversationMessagesRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final int getPage_offset() {
        return this.surrogate.getPage_offset();
    }

    public final int getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final String getOrder() {
        return this.surrogate.getOrder();
    }

    public /* synthetic */ GetConversationMessagesRequestDto(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetConversationMessagesRequestDto(String id, int i, int i2, String order) {
        this(new Surrogate(id, i, i2, order));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order, "order");
    }

    public static /* synthetic */ GetConversationMessagesRequestDto copy$default(GetConversationMessagesRequestDto getConversationMessagesRequestDto, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getConversationMessagesRequestDto.surrogate.getId();
        }
        if ((i3 & 2) != 0) {
            i = getConversationMessagesRequestDto.surrogate.getPage_offset();
        }
        if ((i3 & 4) != 0) {
            i2 = getConversationMessagesRequestDto.surrogate.getPage_size();
        }
        if ((i3 & 8) != 0) {
            str2 = getConversationMessagesRequestDto.surrogate.getOrder();
        }
        return getConversationMessagesRequestDto.copy(str, i, i2, str2);
    }

    public final GetConversationMessagesRequestDto copy(String id, int page_offset, int page_size, String order) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order, "order");
        return new GetConversationMessagesRequestDto(new Surrogate(id, page_offset, page_size, order));
    }

    @Override // com.robinhood.idl.Dto
    public GetConversationMessagesRequest toProto() {
        return new GetConversationMessagesRequest(this.surrogate.getId(), this.surrogate.getPage_offset(), this.surrogate.getPage_size(), this.surrogate.getOrder(), null, 16, null);
    }

    public String toString() {
        return "[GetConversationMessagesRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetConversationMessagesRequestDto) && Intrinsics.areEqual(((GetConversationMessagesRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetConversationMessagesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u001d\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate;", "", "id", "", "page_offset", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "page_size", Card.Icon.ORDER, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getPage_offset$annotations", "getPage_offset", "()I", "getPage_size$annotations", "getPage_size", "getOrder$annotations", "getOrder", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final String order;
        private final int page_offset;
        private final int page_size;

        public Surrogate() {
            this((String) null, 0, 0, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, int i2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i3 & 2) != 0) {
                i = surrogate.page_offset;
            }
            if ((i3 & 4) != 0) {
                i2 = surrogate.page_size;
            }
            if ((i3 & 8) != 0) {
                str2 = surrogate.order;
            }
            return surrogate.copy(str, i, i2, str2);
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName(Card.Icon.ORDER)
        @JsonAnnotations2(names = {Card.Icon.ORDER})
        public static /* synthetic */ void getOrder$annotations() {
        }

        @SerialName("pageOffset")
        @JsonAnnotations2(names = {"page_offset"})
        public static /* synthetic */ void getPage_offset$annotations() {
        }

        @SerialName("pageSize")
        @JsonAnnotations2(names = {"page_size"})
        public static /* synthetic */ void getPage_size$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPage_offset() {
            return this.page_offset;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPage_size() {
            return this.page_size;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOrder() {
            return this.order;
        }

        public final Surrogate copy(String id, int page_offset, int page_size, String order) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(order, "order");
            return new Surrogate(id, page_offset, page_size, order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.page_offset == surrogate.page_offset && this.page_size == surrogate.page_size && Intrinsics.areEqual(this.order, surrogate.order);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Integer.hashCode(this.page_offset)) * 31) + Integer.hashCode(this.page_size)) * 31) + this.order.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", page_offset=" + this.page_offset + ", page_size=" + this.page_size + ", order=" + this.order + ")";
        }

        /* compiled from: GetConversationMessagesRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetConversationMessagesRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.page_offset = 0;
            } else {
                this.page_offset = i2;
            }
            if ((i & 4) == 0) {
                this.page_size = 0;
            } else {
                this.page_size = i3;
            }
            if ((i & 8) == 0) {
                this.order = "";
            } else {
                this.order = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            int i = self.page_offset;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.page_size;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Intrinsics.areEqual(self.order, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.order);
        }

        public Surrogate(String id, int i, int i2, String order) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(order, "order");
            this.id = id;
            this.page_offset = i;
            this.page_size = i2;
            this.order = order;
        }

        public /* synthetic */ Surrogate(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
        }

        public final String getId() {
            return this.id;
        }

        public final int getPage_offset() {
            return this.page_offset;
        }

        public final int getPage_size() {
            return this.page_size;
        }

        public final String getOrder() {
            return this.order;
        }
    }

    /* compiled from: GetConversationMessagesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetConversationMessagesRequestDto, GetConversationMessagesRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetConversationMessagesRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetConversationMessagesRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetConversationMessagesRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetConversationMessagesRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetConversationMessagesRequest> getProtoAdapter() {
            return GetConversationMessagesRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetConversationMessagesRequestDto getZeroValue() {
            return GetConversationMessagesRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetConversationMessagesRequestDto fromProto(GetConversationMessagesRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetConversationMessagesRequestDto(new Surrogate(proto.getId(), proto.getPage_offset(), proto.getPage_size(), proto.getOrder()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.GetConversationMessagesRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetConversationMessagesRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetConversationMessagesRequestDto(null, 0, 0, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetConversationMessagesRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<GetConversationMessagesRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.GetConversationMessagesRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetConversationMessagesRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetConversationMessagesRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetConversationMessagesRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetConversationMessagesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.GetConversationMessagesRequestDto";
        }
    }
}
