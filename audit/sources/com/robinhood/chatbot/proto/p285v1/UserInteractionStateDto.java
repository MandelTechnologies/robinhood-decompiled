package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ExtraUserInputTypeDto;
import com.robinhood.chatbot.proto.p285v1.SelectionMenuDto;
import com.robinhood.chatbot.proto.p285v1.SuggestedResponseDto;
import com.robinhood.chatbot.proto.p285v1.ThinkingStateDto;
import com.robinhood.chatbot.proto.p285v1.UserInteractionStateDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: UserInteractionStateDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005789:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0017Jd\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u000eH\u0016J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000200H\u0016J\b\u00106\u001a\u000200H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006<"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate;)V", "text_input_allowed", "", "suggested_responses", "", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseDto;", "text_input_placeholder", "", "text_input_state", "is_typing", "thinking_state", "Lcom/robinhood/chatbot/proto/v1/ThinkingStateDto;", "extra_user_input_type", "Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;", "extra_user_input", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/chatbot/proto/v1/ThinkingStateDto;Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;)V", "getText_input_allowed", "()Z", "getSuggested_responses", "()Ljava/util/List;", "getText_input_placeholder", "()Ljava/lang/String;", "getText_input_state", "getThinking_state", "()Lcom/robinhood/chatbot/proto/v1/ThinkingStateDto;", "getExtra_user_input_type", "()Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;", "getExtra_user_input", "()Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;", "selection_menu", "Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "getSelection_menu", "()Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ExtraUserInputDto", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class UserInteractionStateDto implements Dto3<UserInteractionState>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UserInteractionStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UserInteractionStateDto, UserInteractionState>> binaryBase64Serializer$delegate;
    private static final UserInteractionStateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UserInteractionStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UserInteractionStateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getText_input_allowed() {
        return this.surrogate.getText_input_allowed();
    }

    public final List<SuggestedResponseDto> getSuggested_responses() {
        return this.surrogate.getSuggested_responses();
    }

    public final String getText_input_placeholder() {
        return this.surrogate.getText_input_placeholder();
    }

    public final String getText_input_state() {
        return this.surrogate.getText_input_state();
    }

    public final boolean is_typing() {
        return this.surrogate.is_typing();
    }

    public final ThinkingStateDto getThinking_state() {
        return this.surrogate.getThinking_state();
    }

    public final ExtraUserInputTypeDto getExtra_user_input_type() {
        return this.surrogate.getExtra_user_input_type();
    }

    public final ExtraUserInputDto getExtra_user_input() {
        if (this.surrogate.getSelection_menu() != null) {
            return new ExtraUserInputDto.SelectionMenu(this.surrogate.getSelection_menu());
        }
        return null;
    }

    public final SelectionMenuDto getSelection_menu() {
        return this.surrogate.getSelection_menu();
    }

    public /* synthetic */ UserInteractionStateDto(boolean z, List list, String str, String str2, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, ExtraUserInputDto extraUserInputDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : thinkingStateDto, (i & 64) != 0 ? null : extraUserInputTypeDto, (i & 128) != 0 ? null : extraUserInputDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserInteractionStateDto(boolean z, List<SuggestedResponseDto> suggested_responses, String str, String text_input_state, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, ExtraUserInputDto extraUserInputDto) {
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
        ExtraUserInputDto.SelectionMenu selectionMenu = extraUserInputDto instanceof ExtraUserInputDto.SelectionMenu ? (ExtraUserInputDto.SelectionMenu) extraUserInputDto : null;
        this(new Surrogate(z, suggested_responses, str, text_input_state, z2, thinkingStateDto, extraUserInputTypeDto, selectionMenu != null ? selectionMenu.getValue() : null));
    }

    public static /* synthetic */ UserInteractionStateDto copy$default(UserInteractionStateDto userInteractionStateDto, boolean z, List list, String str, String str2, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, ExtraUserInputDto extraUserInputDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userInteractionStateDto.surrogate.getText_input_allowed();
        }
        if ((i & 2) != 0) {
            list = userInteractionStateDto.surrogate.getSuggested_responses();
        }
        if ((i & 4) != 0) {
            str = userInteractionStateDto.surrogate.getText_input_placeholder();
        }
        if ((i & 8) != 0) {
            str2 = userInteractionStateDto.surrogate.getText_input_state();
        }
        if ((i & 16) != 0) {
            z2 = userInteractionStateDto.surrogate.is_typing();
        }
        if ((i & 32) != 0) {
            thinkingStateDto = userInteractionStateDto.surrogate.getThinking_state();
        }
        if ((i & 64) != 0) {
            extraUserInputTypeDto = userInteractionStateDto.surrogate.getExtra_user_input_type();
        }
        if ((i & 128) != 0) {
            extraUserInputDto = userInteractionStateDto.getExtra_user_input();
        }
        ExtraUserInputTypeDto extraUserInputTypeDto2 = extraUserInputTypeDto;
        ExtraUserInputDto extraUserInputDto2 = extraUserInputDto;
        boolean z3 = z2;
        ThinkingStateDto thinkingStateDto2 = thinkingStateDto;
        return userInteractionStateDto.copy(z, list, str, str2, z3, thinkingStateDto2, extraUserInputTypeDto2, extraUserInputDto2);
    }

    public final UserInteractionStateDto copy(boolean text_input_allowed, List<SuggestedResponseDto> suggested_responses, String text_input_placeholder, String text_input_state, boolean is_typing, ThinkingStateDto thinking_state, ExtraUserInputTypeDto extra_user_input_type, ExtraUserInputDto extra_user_input) {
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
        ExtraUserInputDto.SelectionMenu selectionMenu = extra_user_input instanceof ExtraUserInputDto.SelectionMenu ? (ExtraUserInputDto.SelectionMenu) extra_user_input : null;
        return new UserInteractionStateDto(new Surrogate(text_input_allowed, suggested_responses, text_input_placeholder, text_input_state, is_typing, thinking_state, extra_user_input_type, selectionMenu != null ? selectionMenu.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UserInteractionState toProto() {
        boolean text_input_allowed = this.surrogate.getText_input_allowed();
        List<SuggestedResponseDto> suggested_responses = this.surrogate.getSuggested_responses();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggested_responses, 10));
        Iterator<T> it = suggested_responses.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuggestedResponseDto) it.next()).toProto());
        }
        String text_input_placeholder = this.surrogate.getText_input_placeholder();
        String text_input_state = this.surrogate.getText_input_state();
        boolean zIs_typing = this.surrogate.is_typing();
        ThinkingStateDto thinking_state = this.surrogate.getThinking_state();
        ThinkingState proto = thinking_state != null ? thinking_state.toProto() : null;
        ExtraUserInputTypeDto extra_user_input_type = this.surrogate.getExtra_user_input_type();
        ExtraUserInputType extraUserInputType = extra_user_input_type != null ? (ExtraUserInputType) extra_user_input_type.toProto() : null;
        SelectionMenuDto selection_menu = this.surrogate.getSelection_menu();
        return new UserInteractionState(text_input_allowed, arrayList, text_input_placeholder, text_input_state, zIs_typing, proto, extraUserInputType, selection_menu != null ? selection_menu.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[UserInteractionStateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UserInteractionStateDto) && Intrinsics.areEqual(((UserInteractionStateDto) other).surrogate, this.surrogate);
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
    /* compiled from: UserInteractionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002CDBe\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0014HÖ\u0001J\t\u0010:\u001a\u00020\bHÖ\u0001J%\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010!R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b\n\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-¨\u0006E"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate;", "", "text_input_allowed", "", "suggested_responses", "", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseDto;", "text_input_placeholder", "", "text_input_state", "is_typing", "thinking_state", "Lcom/robinhood/chatbot/proto/v1/ThinkingStateDto;", "extra_user_input_type", "Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;", "selection_menu", "Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/chatbot/proto/v1/ThinkingStateDto;Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/chatbot/proto/v1/ThinkingStateDto;Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText_input_allowed$annotations", "()V", "getText_input_allowed", "()Z", "getSuggested_responses$annotations", "getSuggested_responses", "()Ljava/util/List;", "getText_input_placeholder$annotations", "getText_input_placeholder", "()Ljava/lang/String;", "getText_input_state$annotations", "getText_input_state", "is_typing$annotations", "getThinking_state$annotations", "getThinking_state", "()Lcom/robinhood/chatbot/proto/v1/ThinkingStateDto;", "getExtra_user_input_type$annotations", "getExtra_user_input_type", "()Lcom/robinhood/chatbot/proto/v1/ExtraUserInputTypeDto;", "getSelection_menu$annotations", "getSelection_menu", "()Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ExtraUserInputTypeDto extra_user_input_type;
        private final boolean is_typing;
        private final SelectionMenuDto selection_menu;
        private final List<SuggestedResponseDto> suggested_responses;
        private final boolean text_input_allowed;
        private final String text_input_placeholder;
        private final String text_input_state;
        private final ThinkingStateDto thinking_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.chatbot.proto.v1.UserInteractionStateDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInteractionStateDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null};

        public Surrogate() {
            this(false, (List) null, (String) null, (String) null, false, (ThinkingStateDto) null, (ExtraUserInputTypeDto) null, (SelectionMenuDto) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SuggestedResponseDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, List list, String str, String str2, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, SelectionMenuDto selectionMenuDto, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.text_input_allowed;
            }
            if ((i & 2) != 0) {
                list = surrogate.suggested_responses;
            }
            if ((i & 4) != 0) {
                str = surrogate.text_input_placeholder;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.text_input_state;
            }
            if ((i & 16) != 0) {
                z2 = surrogate.is_typing;
            }
            if ((i & 32) != 0) {
                thinkingStateDto = surrogate.thinking_state;
            }
            if ((i & 64) != 0) {
                extraUserInputTypeDto = surrogate.extra_user_input_type;
            }
            if ((i & 128) != 0) {
                selectionMenuDto = surrogate.selection_menu;
            }
            ExtraUserInputTypeDto extraUserInputTypeDto2 = extraUserInputTypeDto;
            SelectionMenuDto selectionMenuDto2 = selectionMenuDto;
            boolean z3 = z2;
            ThinkingStateDto thinkingStateDto2 = thinkingStateDto;
            return surrogate.copy(z, list, str, str2, z3, thinkingStateDto2, extraUserInputTypeDto2, selectionMenuDto2);
        }

        @SerialName("extraUserInputType")
        @JsonAnnotations2(names = {"extra_user_input_type"})
        public static /* synthetic */ void getExtra_user_input_type$annotations() {
        }

        @SerialName("selectionMenu")
        @JsonAnnotations2(names = {"selection_menu"})
        public static /* synthetic */ void getSelection_menu$annotations() {
        }

        @SerialName("suggestedResponses")
        @JsonAnnotations2(names = {"suggested_responses"})
        public static /* synthetic */ void getSuggested_responses$annotations() {
        }

        @SerialName("textInputAllowed")
        @JsonAnnotations2(names = {"text_input_allowed"})
        public static /* synthetic */ void getText_input_allowed$annotations() {
        }

        @SerialName("textInputPlaceholder")
        @JsonAnnotations2(names = {"text_input_placeholder"})
        public static /* synthetic */ void getText_input_placeholder$annotations() {
        }

        @SerialName("textInputState")
        @JsonAnnotations2(names = {"text_input_state"})
        public static /* synthetic */ void getText_input_state$annotations() {
        }

        @SerialName("thinkingState")
        @JsonAnnotations2(names = {"thinking_state"})
        public static /* synthetic */ void getThinking_state$annotations() {
        }

        @SerialName("isTyping")
        @JsonAnnotations2(names = {"is_typing"})
        public static /* synthetic */ void is_typing$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getText_input_allowed() {
            return this.text_input_allowed;
        }

        public final List<SuggestedResponseDto> component2() {
            return this.suggested_responses;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText_input_placeholder() {
            return this.text_input_placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final String getText_input_state() {
            return this.text_input_state;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs_typing() {
            return this.is_typing;
        }

        /* renamed from: component6, reason: from getter */
        public final ThinkingStateDto getThinking_state() {
            return this.thinking_state;
        }

        /* renamed from: component7, reason: from getter */
        public final ExtraUserInputTypeDto getExtra_user_input_type() {
            return this.extra_user_input_type;
        }

        /* renamed from: component8, reason: from getter */
        public final SelectionMenuDto getSelection_menu() {
            return this.selection_menu;
        }

        public final Surrogate copy(boolean text_input_allowed, List<SuggestedResponseDto> suggested_responses, String text_input_placeholder, String text_input_state, boolean is_typing, ThinkingStateDto thinking_state, ExtraUserInputTypeDto extra_user_input_type, SelectionMenuDto selection_menu) {
            Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
            Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
            return new Surrogate(text_input_allowed, suggested_responses, text_input_placeholder, text_input_state, is_typing, thinking_state, extra_user_input_type, selection_menu);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.text_input_allowed == surrogate.text_input_allowed && Intrinsics.areEqual(this.suggested_responses, surrogate.suggested_responses) && Intrinsics.areEqual(this.text_input_placeholder, surrogate.text_input_placeholder) && Intrinsics.areEqual(this.text_input_state, surrogate.text_input_state) && this.is_typing == surrogate.is_typing && Intrinsics.areEqual(this.thinking_state, surrogate.thinking_state) && this.extra_user_input_type == surrogate.extra_user_input_type && Intrinsics.areEqual(this.selection_menu, surrogate.selection_menu);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.text_input_allowed) * 31) + this.suggested_responses.hashCode()) * 31;
            String str = this.text_input_placeholder;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text_input_state.hashCode()) * 31) + Boolean.hashCode(this.is_typing)) * 31;
            ThinkingStateDto thinkingStateDto = this.thinking_state;
            int iHashCode3 = (iHashCode2 + (thinkingStateDto == null ? 0 : thinkingStateDto.hashCode())) * 31;
            ExtraUserInputTypeDto extraUserInputTypeDto = this.extra_user_input_type;
            int iHashCode4 = (iHashCode3 + (extraUserInputTypeDto == null ? 0 : extraUserInputTypeDto.hashCode())) * 31;
            SelectionMenuDto selectionMenuDto = this.selection_menu;
            return iHashCode4 + (selectionMenuDto != null ? selectionMenuDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(text_input_allowed=" + this.text_input_allowed + ", suggested_responses=" + this.suggested_responses + ", text_input_placeholder=" + this.text_input_placeholder + ", text_input_state=" + this.text_input_state + ", is_typing=" + this.is_typing + ", thinking_state=" + this.thinking_state + ", extra_user_input_type=" + this.extra_user_input_type + ", selection_menu=" + this.selection_menu + ")";
        }

        /* compiled from: UserInteractionStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UserInteractionStateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, List list, String str, String str2, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, SelectionMenuDto selectionMenuDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.text_input_allowed = false;
            } else {
                this.text_input_allowed = z;
            }
            if ((i & 2) == 0) {
                this.suggested_responses = CollectionsKt.emptyList();
            } else {
                this.suggested_responses = list;
            }
            if ((i & 4) == 0) {
                this.text_input_placeholder = null;
            } else {
                this.text_input_placeholder = str;
            }
            if ((i & 8) == 0) {
                this.text_input_state = "";
            } else {
                this.text_input_state = str2;
            }
            if ((i & 16) == 0) {
                this.is_typing = false;
            } else {
                this.is_typing = z2;
            }
            if ((i & 32) == 0) {
                this.thinking_state = null;
            } else {
                this.thinking_state = thinkingStateDto;
            }
            if ((i & 64) == 0) {
                this.extra_user_input_type = null;
            } else {
                this.extra_user_input_type = extraUserInputTypeDto;
            }
            if ((i & 128) == 0) {
                this.selection_menu = null;
            } else {
                this.selection_menu = selectionMenuDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            boolean z = self.text_input_allowed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (!Intrinsics.areEqual(self.suggested_responses, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.suggested_responses);
            }
            String str = self.text_input_placeholder;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.text_input_state, "")) {
                output.encodeStringElement(serialDesc, 3, self.text_input_state);
            }
            boolean z2 = self.is_typing;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 4, z2);
            }
            ThinkingStateDto thinkingStateDto = self.thinking_state;
            if (thinkingStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThinkingStateDto.Serializer.INSTANCE, thinkingStateDto);
            }
            ExtraUserInputTypeDto extraUserInputTypeDto = self.extra_user_input_type;
            if (extraUserInputTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ExtraUserInputTypeDto.Serializer.INSTANCE, extraUserInputTypeDto);
            }
            SelectionMenuDto selectionMenuDto = self.selection_menu;
            if (selectionMenuDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SelectionMenuDto.Serializer.INSTANCE, selectionMenuDto);
            }
        }

        public Surrogate(boolean z, List<SuggestedResponseDto> suggested_responses, String str, String text_input_state, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, SelectionMenuDto selectionMenuDto) {
            Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
            Intrinsics.checkNotNullParameter(text_input_state, "text_input_state");
            this.text_input_allowed = z;
            this.suggested_responses = suggested_responses;
            this.text_input_placeholder = str;
            this.text_input_state = text_input_state;
            this.is_typing = z2;
            this.thinking_state = thinkingStateDto;
            this.extra_user_input_type = extraUserInputTypeDto;
            this.selection_menu = selectionMenuDto;
        }

        public final boolean getText_input_allowed() {
            return this.text_input_allowed;
        }

        public final List<SuggestedResponseDto> getSuggested_responses() {
            return this.suggested_responses;
        }

        public /* synthetic */ Surrogate(boolean z, List list, String str, String str2, boolean z2, ThinkingStateDto thinkingStateDto, ExtraUserInputTypeDto extraUserInputTypeDto, SelectionMenuDto selectionMenuDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : thinkingStateDto, (i & 64) != 0 ? null : extraUserInputTypeDto, (i & 128) != 0 ? null : selectionMenuDto);
        }

        public final String getText_input_placeholder() {
            return this.text_input_placeholder;
        }

        public final String getText_input_state() {
            return this.text_input_state;
        }

        public final boolean is_typing() {
            return this.is_typing;
        }

        public final ThinkingStateDto getThinking_state() {
            return this.thinking_state;
        }

        public final ExtraUserInputTypeDto getExtra_user_input_type() {
            return this.extra_user_input_type;
        }

        public final SelectionMenuDto getSelection_menu() {
            return this.selection_menu;
        }
    }

    /* compiled from: UserInteractionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UserInteractionStateDto, UserInteractionState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UserInteractionStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserInteractionStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserInteractionStateDto> getBinaryBase64Serializer() {
            return (KSerializer) UserInteractionStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UserInteractionState> getProtoAdapter() {
            return UserInteractionState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserInteractionStateDto getZeroValue() {
            return UserInteractionStateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserInteractionStateDto fromProto(UserInteractionState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean text_input_allowed = proto.getText_input_allowed();
            List<SuggestedResponse> suggested_responses = proto.getSuggested_responses();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggested_responses, 10));
            Iterator<T> it = suggested_responses.iterator();
            while (it.hasNext()) {
                arrayList.add(SuggestedResponseDto.INSTANCE.fromProto((SuggestedResponse) it.next()));
            }
            String text_input_placeholder = proto.getText_input_placeholder();
            String text_input_state = proto.getText_input_state();
            boolean is_typing = proto.getIs_typing();
            ThinkingState thinking_state = proto.getThinking_state();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThinkingStateDto thinkingStateDtoFromProto = thinking_state != null ? ThinkingStateDto.INSTANCE.fromProto(thinking_state) : null;
            ExtraUserInputType extra_user_input_type = proto.getExtra_user_input_type();
            ExtraUserInputTypeDto extraUserInputTypeDtoFromProto = extra_user_input_type != null ? ExtraUserInputTypeDto.INSTANCE.fromProto(extra_user_input_type) : null;
            SelectionMenu selection_menu = proto.getSelection_menu();
            return new UserInteractionStateDto(new Surrogate(text_input_allowed, arrayList, text_input_placeholder, text_input_state, is_typing, thinkingStateDtoFromProto, extraUserInputTypeDtoFromProto, selection_menu != null ? SelectionMenuDto.INSTANCE.fromProto(selection_menu) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.UserInteractionStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInteractionStateDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new UserInteractionStateDto(false, null, null, null, false, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UserInteractionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SelectionMenu", "Companion", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto$SelectionMenu;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* loaded from: classes15.dex */
    public static abstract class ExtraUserInputDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ExtraUserInputDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ExtraUserInputDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: UserInteractionStateDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto$SelectionMenu;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;", "value", "Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/SelectionMenuDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectionMenu extends ExtraUserInputDto {
            private final SelectionMenuDto value;

            public static /* synthetic */ SelectionMenu copy$default(SelectionMenu selectionMenu, SelectionMenuDto selectionMenuDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    selectionMenuDto = selectionMenu.value;
                }
                return selectionMenu.copy(selectionMenuDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectionMenuDto getValue() {
                return this.value;
            }

            public final SelectionMenu copy(SelectionMenuDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SelectionMenu(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectionMenu) && Intrinsics.areEqual(this.value, ((SelectionMenu) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SelectionMenu(value=" + this.value + ")";
            }

            public final SelectionMenuDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectionMenu(SelectionMenuDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UserInteractionStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$ExtraUserInputDto;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ExtraUserInputDto, UserInteractionState> {
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
            public ProtoAdapter<UserInteractionState> getProtoAdapter() {
                return UserInteractionState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExtraUserInputDto fromProto(UserInteractionState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSelection_menu() != null) {
                    return new SelectionMenu(SelectionMenuDto.INSTANCE.fromProto(proto.getSelection_menu()));
                }
                return null;
            }
        }
    }

    /* compiled from: UserInteractionStateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<UserInteractionStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.UserInteractionState", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UserInteractionStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UserInteractionStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UserInteractionStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UserInteractionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/UserInteractionStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.UserInteractionStateDto";
        }
    }
}
