package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ActionMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.ActionMessageStyleDto;
import com.robinhood.chatbot.proto.p285v1.ImgUrlDto;
import com.robinhood.chatbot.proto.p285v1.MessageActionDto;
import com.robinhood.chatbot.proto.p285v1.RichTextDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ActionMessageAttributesDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0013JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\tH\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate;)V", CarResultComposable2.BODY, "", "actions", "", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", Footer.f10637type, "Lcom/robinhood/chatbot/proto/v1/RichTextDto;", ResourceTypes.STYLE, "Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;", "img_url", "Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;)V", "getBody", "()Ljava/lang/String;", "getActions", "()Ljava/util/List;", "getFooter", "()Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "getStyle", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;", "getImg_url", "()Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ActionMessageAttributesDto implements Dto3<ActionMessageAttributes>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActionMessageAttributesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActionMessageAttributesDto, ActionMessageAttributes>> binaryBase64Serializer$delegate;
    private static final ActionMessageAttributesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActionMessageAttributesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActionMessageAttributesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBody() {
        return this.surrogate.getBody();
    }

    public final List<MessageActionDto> getActions() {
        return this.surrogate.getActions();
    }

    public final RichTextDto getFooter() {
        return this.surrogate.getFooter();
    }

    public final ActionMessageStyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public final ImgUrlDto getImg_url() {
        return this.surrogate.getImg_url();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ActionMessageAttributesDto(java.lang.String r2, java.util.List r3, com.robinhood.chatbot.proto.p285v1.RichTextDto r4, com.robinhood.chatbot.proto.p285v1.ActionMessageStyleDto r5, com.robinhood.chatbot.proto.p285v1.ImgUrlDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Le
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        Le:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L14
            r4 = r0
        L14:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            r5 = r0
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L24
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L24:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.chatbot.proto.p285v1.ActionMessageAttributesDto.<init>(java.lang.String, java.util.List, com.robinhood.chatbot.proto.v1.RichTextDto, com.robinhood.chatbot.proto.v1.ActionMessageStyleDto, com.robinhood.chatbot.proto.v1.ImgUrlDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionMessageAttributesDto(String body, List<MessageActionDto> actions, RichTextDto richTextDto, ActionMessageStyleDto actionMessageStyleDto, ImgUrlDto imgUrlDto) {
        this(new Surrogate(body, actions, richTextDto, actionMessageStyleDto, imgUrlDto));
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(actions, "actions");
    }

    public static /* synthetic */ ActionMessageAttributesDto copy$default(ActionMessageAttributesDto actionMessageAttributesDto, String str, List list, RichTextDto richTextDto, ActionMessageStyleDto actionMessageStyleDto, ImgUrlDto imgUrlDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionMessageAttributesDto.surrogate.getBody();
        }
        if ((i & 2) != 0) {
            list = actionMessageAttributesDto.surrogate.getActions();
        }
        if ((i & 4) != 0) {
            richTextDto = actionMessageAttributesDto.surrogate.getFooter();
        }
        if ((i & 8) != 0) {
            actionMessageStyleDto = actionMessageAttributesDto.surrogate.getStyle();
        }
        if ((i & 16) != 0) {
            imgUrlDto = actionMessageAttributesDto.surrogate.getImg_url();
        }
        ImgUrlDto imgUrlDto2 = imgUrlDto;
        RichTextDto richTextDto2 = richTextDto;
        return actionMessageAttributesDto.copy(str, list, richTextDto2, actionMessageStyleDto, imgUrlDto2);
    }

    public final ActionMessageAttributesDto copy(String body, List<MessageActionDto> actions, RichTextDto footer, ActionMessageStyleDto style, ImgUrlDto img_url) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new ActionMessageAttributesDto(new Surrogate(body, actions, footer, style, img_url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ActionMessageAttributes toProto() {
        String body = this.surrogate.getBody();
        List<MessageActionDto> actions = this.surrogate.getActions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            arrayList.add(((MessageActionDto) it.next()).toProto());
        }
        RichTextDto footer = this.surrogate.getFooter();
        RichText proto = footer != null ? footer.toProto() : null;
        ActionMessageStyleDto style = this.surrogate.getStyle();
        ActionMessageStyle actionMessageStyle = style != null ? (ActionMessageStyle) style.toProto() : null;
        ImgUrlDto img_url = this.surrogate.getImg_url();
        return new ActionMessageAttributes(body, arrayList, proto, actionMessageStyle, img_url != null ? img_url.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[ActionMessageAttributesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActionMessageAttributesDto) && Intrinsics.areEqual(((ActionMessageAttributesDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActionMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0010HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate;", "", CarResultComposable2.BODY, "", "actions", "", "Lcom/robinhood/chatbot/proto/v1/MessageActionDto;", Footer.f10637type, "Lcom/robinhood/chatbot/proto/v1/RichTextDto;", ResourceTypes.STYLE, "Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;", "img_url", "Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/RichTextDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBody$annotations", "()V", "getBody", "()Ljava/lang/String;", "getActions$annotations", "getActions", "()Ljava/util/List;", "getFooter$annotations", "getFooter", "()Lcom/robinhood/chatbot/proto/v1/RichTextDto;", "getStyle$annotations", "getStyle", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageStyleDto;", "getImg_url$annotations", "getImg_url", "()Lcom/robinhood/chatbot/proto/v1/ImgUrlDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<MessageActionDto> actions;
        private final String body;
        private final RichTextDto footer;
        private final ImgUrlDto img_url;
        private final ActionMessageStyleDto style;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.ActionMessageAttributesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActionMessageAttributesDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (RichTextDto) null, (ActionMessageStyleDto) null, (ImgUrlDto) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MessageActionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, RichTextDto richTextDto, ActionMessageStyleDto actionMessageStyleDto, ImgUrlDto imgUrlDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.body;
            }
            if ((i & 2) != 0) {
                list = surrogate.actions;
            }
            if ((i & 4) != 0) {
                richTextDto = surrogate.footer;
            }
            if ((i & 8) != 0) {
                actionMessageStyleDto = surrogate.style;
            }
            if ((i & 16) != 0) {
                imgUrlDto = surrogate.img_url;
            }
            ImgUrlDto imgUrlDto2 = imgUrlDto;
            RichTextDto richTextDto2 = richTextDto;
            return surrogate.copy(str, list, richTextDto2, actionMessageStyleDto, imgUrlDto2);
        }

        @SerialName("actions")
        @JsonAnnotations2(names = {"actions"})
        public static /* synthetic */ void getActions$annotations() {
        }

        @SerialName(CarResultComposable2.BODY)
        @JsonAnnotations2(names = {CarResultComposable2.BODY})
        public static /* synthetic */ void getBody$annotations() {
        }

        @SerialName(Footer.f10637type)
        @JsonAnnotations2(names = {Footer.f10637type})
        public static /* synthetic */ void getFooter$annotations() {
        }

        @SerialName("imgUrl")
        @JsonAnnotations2(names = {"img_url"})
        public static /* synthetic */ void getImg_url$annotations() {
        }

        @SerialName(ResourceTypes.STYLE)
        @JsonAnnotations2(names = {ResourceTypes.STYLE})
        public static /* synthetic */ void getStyle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public final List<MessageActionDto> component2() {
            return this.actions;
        }

        /* renamed from: component3, reason: from getter */
        public final RichTextDto getFooter() {
            return this.footer;
        }

        /* renamed from: component4, reason: from getter */
        public final ActionMessageStyleDto getStyle() {
            return this.style;
        }

        /* renamed from: component5, reason: from getter */
        public final ImgUrlDto getImg_url() {
            return this.img_url;
        }

        public final Surrogate copy(String body, List<MessageActionDto> actions, RichTextDto footer, ActionMessageStyleDto style, ImgUrlDto img_url) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new Surrogate(body, actions, footer, style, img_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.actions, surrogate.actions) && Intrinsics.areEqual(this.footer, surrogate.footer) && this.style == surrogate.style && Intrinsics.areEqual(this.img_url, surrogate.img_url);
        }

        public int hashCode() {
            int iHashCode = ((this.body.hashCode() * 31) + this.actions.hashCode()) * 31;
            RichTextDto richTextDto = this.footer;
            int iHashCode2 = (iHashCode + (richTextDto == null ? 0 : richTextDto.hashCode())) * 31;
            ActionMessageStyleDto actionMessageStyleDto = this.style;
            int iHashCode3 = (iHashCode2 + (actionMessageStyleDto == null ? 0 : actionMessageStyleDto.hashCode())) * 31;
            ImgUrlDto imgUrlDto = this.img_url;
            return iHashCode3 + (imgUrlDto != null ? imgUrlDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(body=" + this.body + ", actions=" + this.actions + ", footer=" + this.footer + ", style=" + this.style + ", img_url=" + this.img_url + ")";
        }

        /* compiled from: ActionMessageAttributesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActionMessageAttributesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, RichTextDto richTextDto, ActionMessageStyleDto actionMessageStyleDto, ImgUrlDto imgUrlDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.body = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.actions = CollectionsKt.emptyList();
            } else {
                this.actions = list;
            }
            if ((i & 4) == 0) {
                this.footer = null;
            } else {
                this.footer = richTextDto;
            }
            if ((i & 8) == 0) {
                this.style = null;
            } else {
                this.style = actionMessageStyleDto;
            }
            if ((i & 16) == 0) {
                this.img_url = null;
            } else {
                this.img_url = imgUrlDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.body, "")) {
                output.encodeStringElement(serialDesc, 0, self.body);
            }
            if (!Intrinsics.areEqual(self.actions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.actions);
            }
            RichTextDto richTextDto = self.footer;
            if (richTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, RichTextDto.Serializer.INSTANCE, richTextDto);
            }
            ActionMessageStyleDto actionMessageStyleDto = self.style;
            if (actionMessageStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ActionMessageStyleDto.Serializer.INSTANCE, actionMessageStyleDto);
            }
            ImgUrlDto imgUrlDto = self.img_url;
            if (imgUrlDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ImgUrlDto.Serializer.INSTANCE, imgUrlDto);
            }
        }

        public Surrogate(String body, List<MessageActionDto> actions, RichTextDto richTextDto, ActionMessageStyleDto actionMessageStyleDto, ImgUrlDto imgUrlDto) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.body = body;
            this.actions = actions;
            this.footer = richTextDto;
            this.style = actionMessageStyleDto;
            this.img_url = imgUrlDto;
        }

        public final String getBody() {
            return this.body;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, java.util.List r3, com.robinhood.chatbot.proto.p285v1.RichTextDto r4, com.robinhood.chatbot.proto.p285v1.ActionMessageStyleDto r5, com.robinhood.chatbot.proto.p285v1.ImgUrlDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Le
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            Le:
                r8 = r7 & 4
                r0 = 0
                if (r8 == 0) goto L14
                r4 = r0
            L14:
                r8 = r7 & 8
                if (r8 == 0) goto L19
                r5 = r0
            L19:
                r7 = r7 & 16
                if (r7 == 0) goto L24
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2a
            L24:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2a:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.chatbot.proto.p285v1.ActionMessageAttributesDto.Surrogate.<init>(java.lang.String, java.util.List, com.robinhood.chatbot.proto.v1.RichTextDto, com.robinhood.chatbot.proto.v1.ActionMessageStyleDto, com.robinhood.chatbot.proto.v1.ImgUrlDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<MessageActionDto> getActions() {
            return this.actions;
        }

        public final RichTextDto getFooter() {
            return this.footer;
        }

        public final ActionMessageStyleDto getStyle() {
            return this.style;
        }

        public final ImgUrlDto getImg_url() {
            return this.img_url;
        }
    }

    /* compiled from: ActionMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActionMessageAttributesDto, ActionMessageAttributes> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActionMessageAttributesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActionMessageAttributesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActionMessageAttributesDto> getBinaryBase64Serializer() {
            return (KSerializer) ActionMessageAttributesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActionMessageAttributes> getProtoAdapter() {
            return ActionMessageAttributes.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActionMessageAttributesDto getZeroValue() {
            return ActionMessageAttributesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActionMessageAttributesDto fromProto(ActionMessageAttributes proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String body = proto.getBody();
            List<MessageAction> actions = proto.getActions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                arrayList.add(MessageActionDto.INSTANCE.fromProto((MessageAction) it.next()));
            }
            RichText footer = proto.getFooter();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RichTextDto richTextDtoFromProto = footer != null ? RichTextDto.INSTANCE.fromProto(footer) : null;
            ActionMessageStyle style = proto.getStyle();
            ActionMessageStyleDto actionMessageStyleDtoFromProto = style != null ? ActionMessageStyleDto.INSTANCE.fromProto(style) : null;
            ImgUrl img_url = proto.getImg_url();
            return new ActionMessageAttributesDto(new Surrogate(body, arrayList, richTextDtoFromProto, actionMessageStyleDtoFromProto, img_url != null ? ImgUrlDto.INSTANCE.fromProto(img_url) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.ActionMessageAttributesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActionMessageAttributesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ActionMessageAttributesDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActionMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<ActionMessageAttributesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.ActionMessageAttributes", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActionMessageAttributesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActionMessageAttributesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActionMessageAttributesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActionMessageAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.ActionMessageAttributesDto";
        }
    }
}
