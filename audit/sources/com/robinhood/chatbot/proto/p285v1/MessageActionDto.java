package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.CTADataDto;
import com.robinhood.chatbot.proto.p285v1.DeepLinkDataDto;
import com.robinhood.chatbot.proto.p285v1.MessageActionTypeDto;
import com.robinhood.chatbot.proto.p285v1.RichTextDto;
import com.robinhood.chatbot.proto.p285v1.TriageActionAttributesDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: MessageActionDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005=>?@AB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0017Jj\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\u0013\u00102\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000206H\u0016J\b\u0010<\u001a\u000206H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006B"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/MessageAction;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate;)V", "type", "Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;", "title", "", "subtitle", "Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "triage_action_attributes", "Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;", "icon", "button_style", "disable_after_escalation", "", "disabled", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "(Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;)V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "getTriage_action_attributes", "()Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;", "getIcon", "getButton_style", "getDisable_after_escalation", "()Z", "getDisabled", "getData", "()Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "deeplink_data", "Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "getDeeplink_data", "()Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "cta_data", "Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "getCta_data", "()Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DataDto", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class MessageActionDto implements Dto3<MessageAction>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MessageActionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MessageActionDto, MessageAction>> binaryBase64Serializer$delegate;
    private static final MessageActionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MessageActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MessageActionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MessageActionTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final RichTextDto getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final TriageActionAttributesDto getTriage_action_attributes() {
        return this.surrogate.getTriage_action_attributes();
    }

    public final String getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getButton_style() {
        return this.surrogate.getButton_style();
    }

    public final boolean getDisable_after_escalation() {
        return this.surrogate.getDisable_after_escalation();
    }

    public final boolean getDisabled() {
        return this.surrogate.getDisabled();
    }

    public final DataDto getData() {
        if (this.surrogate.getDeeplink_data() != null) {
            return new DataDto.DeeplinkData(this.surrogate.getDeeplink_data());
        }
        if (this.surrogate.getCta_data() != null) {
            return new DataDto.CtaData(this.surrogate.getCta_data());
        }
        return null;
    }

    public final DeepLinkDataDto getDeeplink_data() {
        return this.surrogate.getDeeplink_data();
    }

    public final CTADataDto getCta_data() {
        return this.surrogate.getCta_data();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MessageActionDto(com.robinhood.chatbot.proto.p285v1.MessageActionTypeDto r3, java.lang.String r4, com.robinhood.chatbot.proto.p285v1.RichTextDto r5, com.robinhood.chatbot.proto.p285v1.TriageActionAttributesDto r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, com.robinhood.chatbot.proto.v1.MessageActionDto.DataDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto La
            com.robinhood.chatbot.proto.v1.MessageActionTypeDto$Companion r3 = com.robinhood.chatbot.proto.p285v1.MessageActionTypeDto.INSTANCE
            com.robinhood.chatbot.proto.v1.MessageActionTypeDto r3 = r3.getZeroValue()
        La:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            java.lang.String r4 = ""
        L10:
            r13 = r12 & 4
            r0 = 0
            if (r13 == 0) goto L16
            r5 = r0
        L16:
            r13 = r12 & 8
            if (r13 == 0) goto L1b
            r6 = r0
        L1b:
            r13 = r12 & 16
            if (r13 == 0) goto L20
            r7 = r0
        L20:
            r13 = r12 & 32
            if (r13 == 0) goto L25
            r8 = r0
        L25:
            r13 = r12 & 64
            r1 = 0
            if (r13 == 0) goto L2b
            r9 = r1
        L2b:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L30
            r10 = r1
        L30:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3f
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L49
        L3f:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L49:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.chatbot.proto.p285v1.MessageActionDto.<init>(com.robinhood.chatbot.proto.v1.MessageActionTypeDto, java.lang.String, com.robinhood.chatbot.proto.v1.RichTextDto, com.robinhood.chatbot.proto.v1.TriageActionAttributesDto, java.lang.String, java.lang.String, boolean, boolean, com.robinhood.chatbot.proto.v1.MessageActionDto$DataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageActionDto(MessageActionTypeDto type2, String title, RichTextDto richTextDto, TriageActionAttributesDto triageActionAttributesDto, String str, String str2, boolean z, boolean z2, DataDto dataDto) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        DataDto.DeeplinkData deeplinkData = dataDto instanceof DataDto.DeeplinkData ? (DataDto.DeeplinkData) dataDto : null;
        DeepLinkDataDto value = deeplinkData != null ? deeplinkData.getValue() : null;
        DataDto.CtaData ctaData = dataDto instanceof DataDto.CtaData ? (DataDto.CtaData) dataDto : null;
        this(new Surrogate(type2, title, richTextDto, triageActionAttributesDto, str, str2, z, z2, value, ctaData != null ? ctaData.getValue() : null));
    }

    public static /* synthetic */ MessageActionDto copy$default(MessageActionDto messageActionDto, MessageActionTypeDto messageActionTypeDto, String str, RichTextDto richTextDto, TriageActionAttributesDto triageActionAttributesDto, String str2, String str3, boolean z, boolean z2, DataDto dataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            messageActionTypeDto = messageActionDto.surrogate.getType();
        }
        if ((i & 2) != 0) {
            str = messageActionDto.surrogate.getTitle();
        }
        if ((i & 4) != 0) {
            richTextDto = messageActionDto.surrogate.getSubtitle();
        }
        if ((i & 8) != 0) {
            triageActionAttributesDto = messageActionDto.surrogate.getTriage_action_attributes();
        }
        if ((i & 16) != 0) {
            str2 = messageActionDto.surrogate.getIcon();
        }
        if ((i & 32) != 0) {
            str3 = messageActionDto.surrogate.getButton_style();
        }
        if ((i & 64) != 0) {
            z = messageActionDto.surrogate.getDisable_after_escalation();
        }
        if ((i & 128) != 0) {
            z2 = messageActionDto.surrogate.getDisabled();
        }
        if ((i & 256) != 0) {
            dataDto = messageActionDto.getData();
        }
        boolean z3 = z2;
        DataDto dataDto2 = dataDto;
        String str4 = str3;
        boolean z4 = z;
        String str5 = str2;
        RichTextDto richTextDto2 = richTextDto;
        return messageActionDto.copy(messageActionTypeDto, str, richTextDto2, triageActionAttributesDto, str5, str4, z4, z3, dataDto2);
    }

    public final MessageActionDto copy(MessageActionTypeDto type2, String title, RichTextDto subtitle, TriageActionAttributesDto triage_action_attributes, String icon, String button_style, boolean disable_after_escalation, boolean disabled, DataDto data) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        DataDto.DeeplinkData deeplinkData = data instanceof DataDto.DeeplinkData ? (DataDto.DeeplinkData) data : null;
        DeepLinkDataDto value = deeplinkData != null ? deeplinkData.getValue() : null;
        DataDto.CtaData ctaData = data instanceof DataDto.CtaData ? (DataDto.CtaData) data : null;
        return new MessageActionDto(new Surrogate(type2, title, subtitle, triage_action_attributes, icon, button_style, disable_after_escalation, disabled, value, ctaData != null ? ctaData.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MessageAction toProto() {
        MessageActionType messageActionType = (MessageActionType) this.surrogate.getType().toProto();
        String title = this.surrogate.getTitle();
        RichTextDto subtitle = this.surrogate.getSubtitle();
        RichText proto = subtitle != null ? subtitle.toProto() : null;
        TriageActionAttributesDto triage_action_attributes = this.surrogate.getTriage_action_attributes();
        TriageActionAttributes proto2 = triage_action_attributes != null ? triage_action_attributes.toProto() : null;
        String icon = this.surrogate.getIcon();
        String button_style = this.surrogate.getButton_style();
        boolean disable_after_escalation = this.surrogate.getDisable_after_escalation();
        boolean disabled = this.surrogate.getDisabled();
        DeepLinkDataDto deeplink_data = this.surrogate.getDeeplink_data();
        DeepLinkData proto3 = deeplink_data != null ? deeplink_data.toProto() : null;
        CTADataDto cta_data = this.surrogate.getCta_data();
        return new MessageAction(messageActionType, title, proto, proto2, icon, button_style, proto3, cta_data != null ? cta_data.toProto() : null, disable_after_escalation, disabled, null, 1024, null);
    }

    public String toString() {
        return "[MessageActionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MessageActionDto) && Intrinsics.areEqual(((MessageActionDto) other).surrogate, this.surrogate);
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
    /* compiled from: MessageActionDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 N2\u00020\u0001:\u0002MNBw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0013\u0010\u0019J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jy\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010A\u001a\u00020\r2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0016HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010 R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010-R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001b\u001a\u0004\b1\u00102R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u00105¨\u0006O"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate;", "", "type", "Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;", "title", "", "subtitle", "Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "triage_action_attributes", "Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;", "icon", "button_style", "disable_after_escalation", "", "disabled", "deeplink_data", "Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "cta_data", "Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;Lcom/robinhood/chatbot/proto/v1/CTADataDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;Lcom/robinhood/chatbot/proto/v1/CTADataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageActionTypeDto;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getSubtitle$annotations", "getSubtitle", "()Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "getTriage_action_attributes$annotations", "getTriage_action_attributes", "()Lcom/robinhood/chatbot/proto/v1/TriageActionAttributesDto;", "getIcon$annotations", "getIcon", "getButton_style$annotations", "getButton_style", "getDisable_after_escalation$annotations", "getDisable_after_escalation", "()Z", "getDisabled$annotations", "getDisabled", "getDeeplink_data$annotations", "getDeeplink_data", "()Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "getCta_data$annotations", "getCta_data", "()Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String button_style;
        private final CTADataDto cta_data;
        private final DeepLinkDataDto deeplink_data;
        private final boolean disable_after_escalation;
        private final boolean disabled;
        private final String icon;
        private final RichTextDto subtitle;
        private final String title;
        private final TriageActionAttributesDto triage_action_attributes;
        private final MessageActionTypeDto type;

        public Surrogate() {
            this((MessageActionTypeDto) null, (String) null, (RichTextDto) null, (TriageActionAttributesDto) null, (String) null, (String) null, false, false, (DeepLinkDataDto) null, (CTADataDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MessageActionTypeDto messageActionTypeDto, String str, RichTextDto richTextDto, TriageActionAttributesDto triageActionAttributesDto, String str2, String str3, boolean z, boolean z2, DeepLinkDataDto deepLinkDataDto, CTADataDto cTADataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                messageActionTypeDto = surrogate.type;
            }
            if ((i & 2) != 0) {
                str = surrogate.title;
            }
            if ((i & 4) != 0) {
                richTextDto = surrogate.subtitle;
            }
            if ((i & 8) != 0) {
                triageActionAttributesDto = surrogate.triage_action_attributes;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.icon;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.button_style;
            }
            if ((i & 64) != 0) {
                z = surrogate.disable_after_escalation;
            }
            if ((i & 128) != 0) {
                z2 = surrogate.disabled;
            }
            if ((i & 256) != 0) {
                deepLinkDataDto = surrogate.deeplink_data;
            }
            if ((i & 512) != 0) {
                cTADataDto = surrogate.cta_data;
            }
            DeepLinkDataDto deepLinkDataDto2 = deepLinkDataDto;
            CTADataDto cTADataDto2 = cTADataDto;
            boolean z3 = z;
            boolean z4 = z2;
            String str4 = str2;
            String str5 = str3;
            return surrogate.copy(messageActionTypeDto, str, richTextDto, triageActionAttributesDto, str4, str5, z3, z4, deepLinkDataDto2, cTADataDto2);
        }

        @SerialName("buttonStyle")
        @JsonAnnotations2(names = {"button_style"})
        public static /* synthetic */ void getButton_style$annotations() {
        }

        @SerialName("ctaData")
        @JsonAnnotations2(names = {"cta_data"})
        public static /* synthetic */ void getCta_data$annotations() {
        }

        @SerialName("deeplinkData")
        @JsonAnnotations2(names = {"deeplink_data"})
        public static /* synthetic */ void getDeeplink_data$annotations() {
        }

        @SerialName("disableAfterEscalation")
        @JsonAnnotations2(names = {"disable_after_escalation"})
        public static /* synthetic */ void getDisable_after_escalation$annotations() {
        }

        @SerialName("disabled")
        @JsonAnnotations2(names = {"disabled"})
        public static /* synthetic */ void getDisabled$annotations() {
        }

        @SerialName("icon")
        @JsonAnnotations2(names = {"icon"})
        public static /* synthetic */ void getIcon$annotations() {
        }

        @SerialName("subtitle")
        @JsonAnnotations2(names = {"subtitle"})
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("triageActionAttributes")
        @JsonAnnotations2(names = {"triage_action_attributes"})
        public static /* synthetic */ void getTriage_action_attributes$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MessageActionTypeDto getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final CTADataDto getCta_data() {
            return this.cta_data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final RichTextDto getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final TriageActionAttributesDto getTriage_action_attributes() {
            return this.triage_action_attributes;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final String getButton_style() {
            return this.button_style;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getDisable_after_escalation() {
            return this.disable_after_escalation;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component9, reason: from getter */
        public final DeepLinkDataDto getDeeplink_data() {
            return this.deeplink_data;
        }

        public final Surrogate copy(MessageActionTypeDto type2, String title, RichTextDto subtitle, TriageActionAttributesDto triage_action_attributes, String icon, String button_style, boolean disable_after_escalation, boolean disabled, DeepLinkDataDto deeplink_data, CTADataDto cta_data) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Surrogate(type2, title, subtitle, triage_action_attributes, icon, button_style, disable_after_escalation, disabled, deeplink_data, cta_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.triage_action_attributes, surrogate.triage_action_attributes) && Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.button_style, surrogate.button_style) && this.disable_after_escalation == surrogate.disable_after_escalation && this.disabled == surrogate.disabled && Intrinsics.areEqual(this.deeplink_data, surrogate.deeplink_data) && Intrinsics.areEqual(this.cta_data, surrogate.cta_data);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.title.hashCode()) * 31;
            RichTextDto richTextDto = this.subtitle;
            int iHashCode2 = (iHashCode + (richTextDto == null ? 0 : richTextDto.hashCode())) * 31;
            TriageActionAttributesDto triageActionAttributesDto = this.triage_action_attributes;
            int iHashCode3 = (iHashCode2 + (triageActionAttributesDto == null ? 0 : triageActionAttributesDto.hashCode())) * 31;
            String str = this.icon;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.button_style;
            int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.disable_after_escalation)) * 31) + Boolean.hashCode(this.disabled)) * 31;
            DeepLinkDataDto deepLinkDataDto = this.deeplink_data;
            int iHashCode6 = (iHashCode5 + (deepLinkDataDto == null ? 0 : deepLinkDataDto.hashCode())) * 31;
            CTADataDto cTADataDto = this.cta_data;
            return iHashCode6 + (cTADataDto != null ? cTADataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", triage_action_attributes=" + this.triage_action_attributes + ", icon=" + this.icon + ", button_style=" + this.button_style + ", disable_after_escalation=" + this.disable_after_escalation + ", disabled=" + this.disabled + ", deeplink_data=" + this.deeplink_data + ", cta_data=" + this.cta_data + ")";
        }

        /* compiled from: MessageActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MessageActionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MessageActionTypeDto messageActionTypeDto, String str, RichTextDto richTextDto, TriageActionAttributesDto triageActionAttributesDto, String str2, String str3, boolean z, boolean z2, DeepLinkDataDto deepLinkDataDto, CTADataDto cTADataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? MessageActionTypeDto.INSTANCE.getZeroValue() : messageActionTypeDto;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = richTextDto;
            }
            if ((i & 8) == 0) {
                this.triage_action_attributes = null;
            } else {
                this.triage_action_attributes = triageActionAttributesDto;
            }
            if ((i & 16) == 0) {
                this.icon = null;
            } else {
                this.icon = str2;
            }
            if ((i & 32) == 0) {
                this.button_style = null;
            } else {
                this.button_style = str3;
            }
            if ((i & 64) == 0) {
                this.disable_after_escalation = false;
            } else {
                this.disable_after_escalation = z;
            }
            if ((i & 128) == 0) {
                this.disabled = false;
            } else {
                this.disabled = z2;
            }
            if ((i & 256) == 0) {
                this.deeplink_data = null;
            } else {
                this.deeplink_data = deepLinkDataDto;
            }
            if ((i & 512) == 0) {
                this.cta_data = null;
            } else {
                this.cta_data = cTADataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != MessageActionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MessageActionTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            RichTextDto richTextDto = self.subtitle;
            if (richTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, RichTextDto.Serializer.INSTANCE, richTextDto);
            }
            TriageActionAttributesDto triageActionAttributesDto = self.triage_action_attributes;
            if (triageActionAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TriageActionAttributesDto.Serializer.INSTANCE, triageActionAttributesDto);
            }
            String str = self.icon;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            String str2 = self.button_style;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str2);
            }
            boolean z = self.disable_after_escalation;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            boolean z2 = self.disabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 7, z2);
            }
            DeepLinkDataDto deepLinkDataDto = self.deeplink_data;
            if (deepLinkDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DeepLinkDataDto.Serializer.INSTANCE, deepLinkDataDto);
            }
            CTADataDto cTADataDto = self.cta_data;
            if (cTADataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, CTADataDto.Serializer.INSTANCE, cTADataDto);
            }
        }

        public Surrogate(MessageActionTypeDto type2, String title, RichTextDto richTextDto, TriageActionAttributesDto triageActionAttributesDto, String str, String str2, boolean z, boolean z2, DeepLinkDataDto deepLinkDataDto, CTADataDto cTADataDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = type2;
            this.title = title;
            this.subtitle = richTextDto;
            this.triage_action_attributes = triageActionAttributesDto;
            this.icon = str;
            this.button_style = str2;
            this.disable_after_escalation = z;
            this.disabled = z2;
            this.deeplink_data = deepLinkDataDto;
            this.cta_data = cTADataDto;
        }

        public final MessageActionTypeDto getType() {
            return this.type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.chatbot.proto.p285v1.MessageActionTypeDto r3, java.lang.String r4, com.robinhood.chatbot.proto.p285v1.RichTextDto r5, com.robinhood.chatbot.proto.p285v1.TriageActionAttributesDto r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, com.robinhood.chatbot.proto.p285v1.DeepLinkDataDto r11, com.robinhood.chatbot.proto.p285v1.CTADataDto r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r2 = this;
                r14 = r13 & 1
                if (r14 == 0) goto La
                com.robinhood.chatbot.proto.v1.MessageActionTypeDto$Companion r3 = com.robinhood.chatbot.proto.p285v1.MessageActionTypeDto.INSTANCE
                com.robinhood.chatbot.proto.v1.MessageActionTypeDto r3 = r3.getZeroValue()
            La:
                r14 = r13 & 2
                if (r14 == 0) goto L10
                java.lang.String r4 = ""
            L10:
                r14 = r13 & 4
                r0 = 0
                if (r14 == 0) goto L16
                r5 = r0
            L16:
                r14 = r13 & 8
                if (r14 == 0) goto L1b
                r6 = r0
            L1b:
                r14 = r13 & 16
                if (r14 == 0) goto L20
                r7 = r0
            L20:
                r14 = r13 & 32
                if (r14 == 0) goto L25
                r8 = r0
            L25:
                r14 = r13 & 64
                r1 = 0
                if (r14 == 0) goto L2b
                r9 = r1
            L2b:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L30
                r10 = r1
            L30:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L35
                r11 = r0
            L35:
                r13 = r13 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L45
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L50
            L45:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L50:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.chatbot.proto.p285v1.MessageActionDto.Surrogate.<init>(com.robinhood.chatbot.proto.v1.MessageActionTypeDto, java.lang.String, com.robinhood.chatbot.proto.v1.RichTextDto, com.robinhood.chatbot.proto.v1.TriageActionAttributesDto, java.lang.String, java.lang.String, boolean, boolean, com.robinhood.chatbot.proto.v1.DeepLinkDataDto, com.robinhood.chatbot.proto.v1.CTADataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTitle() {
            return this.title;
        }

        public final RichTextDto getSubtitle() {
            return this.subtitle;
        }

        public final TriageActionAttributesDto getTriage_action_attributes() {
            return this.triage_action_attributes;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getButton_style() {
            return this.button_style;
        }

        public final boolean getDisable_after_escalation() {
            return this.disable_after_escalation;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final DeepLinkDataDto getDeeplink_data() {
            return this.deeplink_data;
        }

        public final CTADataDto getCta_data() {
            return this.cta_data;
        }
    }

    /* compiled from: MessageActionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", "Lcom/robinhood/chatbot/proto/v1/MessageAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MessageActionDto, MessageAction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MessageActionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageActionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageActionDto> getBinaryBase64Serializer() {
            return (KSerializer) MessageActionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MessageAction> getProtoAdapter() {
            return MessageAction.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageActionDto getZeroValue() {
            return MessageActionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageActionDto fromProto(MessageAction proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MessageActionTypeDto messageActionTypeDtoFromProto = MessageActionTypeDto.INSTANCE.fromProto(proto.getType());
            String title = proto.getTitle();
            RichText subtitle = proto.getSubtitle();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RichTextDto richTextDtoFromProto = subtitle != null ? RichTextDto.INSTANCE.fromProto(subtitle) : null;
            TriageActionAttributes triage_action_attributes = proto.getTriage_action_attributes();
            TriageActionAttributesDto triageActionAttributesDtoFromProto = triage_action_attributes != null ? TriageActionAttributesDto.INSTANCE.fromProto(triage_action_attributes) : null;
            String icon = proto.getIcon();
            String button_style = proto.getButton_style();
            boolean disable_after_escalation = proto.getDisable_after_escalation();
            boolean disabled = proto.getDisabled();
            DeepLinkData deeplink_data = proto.getDeeplink_data();
            DeepLinkDataDto deepLinkDataDtoFromProto = deeplink_data != null ? DeepLinkDataDto.INSTANCE.fromProto(deeplink_data) : null;
            CTAData cta_data = proto.getCta_data();
            return new MessageActionDto(new Surrogate(messageActionTypeDtoFromProto, title, richTextDtoFromProto, triageActionAttributesDtoFromProto, icon, button_style, disable_after_escalation, disabled, deepLinkDataDtoFromProto, cta_data != null ? CTADataDto.INSTANCE.fromProto(cta_data) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.MessageActionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MessageActionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MessageActionDto(null, null, null, null, null, null, false, false, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MessageActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DeeplinkData", "CtaData", "Companion", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto$CtaData;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto$DeeplinkData;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MessageActionDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto$DeeplinkData;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "value", "Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/DeepLinkDataDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DeeplinkData extends DataDto {
            private final DeepLinkDataDto value;

            public static /* synthetic */ DeeplinkData copy$default(DeeplinkData deeplinkData, DeepLinkDataDto deepLinkDataDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    deepLinkDataDto = deeplinkData.value;
                }
                return deeplinkData.copy(deepLinkDataDto);
            }

            /* renamed from: component1, reason: from getter */
            public final DeepLinkDataDto getValue() {
                return this.value;
            }

            public final DeeplinkData copy(DeepLinkDataDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new DeeplinkData(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeeplinkData) && Intrinsics.areEqual(this.value, ((DeeplinkData) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DeeplinkData(value=" + this.value + ")";
            }

            public final DeepLinkDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeeplinkData(DeepLinkDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageActionDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto$CtaData;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "value", "Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/CTADataDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/CTADataDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CtaData extends DataDto {
            private final CTADataDto value;

            public static /* synthetic */ CtaData copy$default(CtaData ctaData, CTADataDto cTADataDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    cTADataDto = ctaData.value;
                }
                return ctaData.copy(cTADataDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CTADataDto getValue() {
                return this.value;
            }

            public final CtaData copy(CTADataDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CtaData(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CtaData) && Intrinsics.areEqual(this.value, ((CtaData) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CtaData(value=" + this.value + ")";
            }

            public final CTADataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CtaData(CTADataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageActionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$DataDto;", "Lcom/robinhood/chatbot/proto/v1/MessageAction;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion implements Dto4.Creator<DataDto, MessageAction> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MessageAction> getProtoAdapter() {
                return MessageAction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DataDto fromProto(MessageAction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getDeeplink_data() != null) {
                    return new DeeplinkData(DeepLinkDataDto.INSTANCE.fromProto(proto.getDeeplink_data()));
                }
                if (proto.getCta_data() != null) {
                    return new CtaData(CTADataDto.INSTANCE.fromProto(proto.getCta_data()));
                }
                return null;
            }
        }
    }

    /* compiled from: MessageActionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MessageActionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.MessageAction", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MessageActionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MessageActionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MessageActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MessageActionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.MessageActionDto";
        }
    }
}
