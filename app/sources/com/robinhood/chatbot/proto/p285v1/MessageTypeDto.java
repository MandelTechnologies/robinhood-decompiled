package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001d\u001eB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "MESSAGE_TYPE_UNSPECIFIED", "TEXT", "DISCLAIMER", "MARKDOWN", "LINK", "ACTION", "SUGGESTED_RESPONSES", "INFO", "CTA_ACTION", "SELECTION", "MEDIA", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public abstract class MessageTypeDto implements Dto2<MessageType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MessageTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MessageTypeDto, MessageType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final MessageTypeDto MESSAGE_TYPE_UNSPECIFIED = new MessageTypeDto("MESSAGE_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.MESSAGE_TYPE_UNSPECIFIED
        {
            String str = "message_type_unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.MESSAGE_TYPE_UNSPECIFIED;
        }
    };
    public static final MessageTypeDto TEXT = new MessageTypeDto("TEXT", 1) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.TEXT
        {
            String str = "text";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.TEXT;
        }
    };
    public static final MessageTypeDto DISCLAIMER = new MessageTypeDto("DISCLAIMER", 2) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.DISCLAIMER
        {
            String str = "disclaimer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.DISCLAIMER;
        }
    };
    public static final MessageTypeDto MARKDOWN = new MessageTypeDto("MARKDOWN", 3) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.MARKDOWN
        {
            String str = InstantRetirementAgreementComponents.MarkdownTag;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.MARKDOWN;
        }
    };
    public static final MessageTypeDto LINK = new MessageTypeDto("LINK", 4) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.LINK
        {
            String str = "link";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.LINK;
        }
    };
    public static final MessageTypeDto ACTION = new MessageTypeDto("ACTION", 5) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.ACTION
        {
            String str = "action";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.ACTION;
        }
    };
    public static final MessageTypeDto SUGGESTED_RESPONSES = new MessageTypeDto("SUGGESTED_RESPONSES", 6) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.SUGGESTED_RESPONSES
        {
            String str = "suggested_responses";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.SUGGESTED_RESPONSES;
        }
    };
    public static final MessageTypeDto INFO = new MessageTypeDto("INFO", 7) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.INFO
        {
            String str = SduiFeatureDiscovery3.INFO_TAG;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.INFO;
        }
    };
    public static final MessageTypeDto CTA_ACTION = new MessageTypeDto("CTA_ACTION", 8) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.CTA_ACTION
        {
            String str = AccountOverviewOptionsSettingCard4.CTA;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.CTA_ACTION;
        }
    };
    public static final MessageTypeDto SELECTION = new MessageTypeDto("SELECTION", 9) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.SELECTION
        {
            String str = "selection";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.SELECTION;
        }
    };
    public static final MessageTypeDto MEDIA = new MessageTypeDto("MEDIA", 10) { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto.MEDIA
        {
            String str = "media";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MessageType toProto() {
            return MessageType.MEDIA;
        }
    };

    private static final /* synthetic */ MessageTypeDto[] $values() {
        return new MessageTypeDto[]{MESSAGE_TYPE_UNSPECIFIED, TEXT, DISCLAIMER, MARKDOWN, LINK, ACTION, SUGGESTED_RESPONSES, INFO, CTA_ACTION, SELECTION, MEDIA};
    }

    public /* synthetic */ MessageTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<MessageTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MessageTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        MessageTypeDto[] messageTypeDtoArr$values = $values();
        $VALUES = messageTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(messageTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.MessageTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MessageTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MessageTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MessageTypeDto, MessageType> {

        /* compiled from: MessageTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageType.values().length];
                try {
                    iArr[MessageType.MESSAGE_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageType.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MessageType.DISCLAIMER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MessageType.MARKDOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MessageType.LINK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MessageType.ACTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MessageType.SUGGESTED_RESPONSES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MessageType.INFO.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MessageType.CTA_ACTION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MessageType.SELECTION.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MessageType.MEDIA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MessageTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) MessageTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MessageType> getProtoAdapter() {
            return MessageType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageTypeDto getZeroValue() {
            return MessageTypeDto.MESSAGE_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageTypeDto fromProto(MessageType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return MessageTypeDto.MESSAGE_TYPE_UNSPECIFIED;
                case 2:
                    return MessageTypeDto.TEXT;
                case 3:
                    return MessageTypeDto.DISCLAIMER;
                case 4:
                    return MessageTypeDto.MARKDOWN;
                case 5:
                    return MessageTypeDto.LINK;
                case 6:
                    return MessageTypeDto.ACTION;
                case 7:
                    return MessageTypeDto.SUGGESTED_RESPONSES;
                case 8:
                    return MessageTypeDto.INFO;
                case 9:
                    return MessageTypeDto.CTA_ACTION;
                case 10:
                    return MessageTypeDto.SELECTION;
                case 11:
                    return MessageTypeDto.MEDIA;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MessageTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<MessageTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MessageTypeDto, MessageType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/chatbot.service.MessageType", MessageTypeDto.getEntries(), MessageTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MessageTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MessageTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MessageTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MessageTypeDto valueOf(String str) {
        return (MessageTypeDto) Enum.valueOf(MessageTypeDto.class, str);
    }

    public static MessageTypeDto[] values() {
        return (MessageTypeDto[]) $VALUES.clone();
    }
}
