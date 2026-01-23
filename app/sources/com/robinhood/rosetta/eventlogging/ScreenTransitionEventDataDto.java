package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: ScreenTransitionEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0016J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tJ\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u000bH\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate;)V", "screen_name", "", "screen_depth", "", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "target_screen_name", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth", "()I", "getScreen_description", "getTime_spent", "getTransition_reason", "getType", "getMessage_type", "getMessage_uuid", "getEntity_id", "getSource", "getSource_screen_name", "getTarget_screen_name", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ScreenTransitionEventDataDto implements Dto3<ScreenTransitionEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ScreenTransitionEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ScreenTransitionEventDataDto, ScreenTransitionEventData>> binaryBase64Serializer$delegate;
    private static final ScreenTransitionEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ScreenTransitionEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ScreenTransitionEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getScreen_name() {
        return this.surrogate.getScreen_name();
    }

    public final int getScreen_depth() {
        return this.surrogate.getScreen_depth();
    }

    public final String getScreen_description() {
        return this.surrogate.getScreen_description();
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final String getTransition_reason() {
        return this.surrogate.getTransition_reason();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getMessage_type() {
        return this.surrogate.getMessage_type();
    }

    public final String getMessage_uuid() {
        return this.surrogate.getMessage_uuid();
    }

    public final int getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getSource_screen_name() {
        return this.surrogate.getSource_screen_name();
    }

    public final String getTarget_screen_name() {
        return this.surrogate.getTarget_screen_name();
    }

    public /* synthetic */ ScreenTransitionEventDataDto(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? "" : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenTransitionEventDataDto(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, int i3, String source, String source_screen_name, String target_screen_name) {
        this(new Surrogate(screen_name, i, screen_description, i2, transition_reason, type2, message_type, message_uuid, i3, source, source_screen_name, target_screen_name));
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
    }

    public static /* synthetic */ ScreenTransitionEventDataDto copy$default(ScreenTransitionEventDataDto screenTransitionEventDataDto, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = screenTransitionEventDataDto.surrogate.getScreen_name();
        }
        if ((i4 & 2) != 0) {
            i = screenTransitionEventDataDto.surrogate.getScreen_depth();
        }
        if ((i4 & 4) != 0) {
            str2 = screenTransitionEventDataDto.surrogate.getScreen_description();
        }
        if ((i4 & 8) != 0) {
            i2 = screenTransitionEventDataDto.surrogate.getTime_spent();
        }
        if ((i4 & 16) != 0) {
            str3 = screenTransitionEventDataDto.surrogate.getTransition_reason();
        }
        if ((i4 & 32) != 0) {
            str4 = screenTransitionEventDataDto.surrogate.getType();
        }
        if ((i4 & 64) != 0) {
            str5 = screenTransitionEventDataDto.surrogate.getMessage_type();
        }
        if ((i4 & 128) != 0) {
            str6 = screenTransitionEventDataDto.surrogate.getMessage_uuid();
        }
        if ((i4 & 256) != 0) {
            i3 = screenTransitionEventDataDto.surrogate.getEntity_id();
        }
        if ((i4 & 512) != 0) {
            str7 = screenTransitionEventDataDto.surrogate.getSource();
        }
        if ((i4 & 1024) != 0) {
            str8 = screenTransitionEventDataDto.surrogate.getSource_screen_name();
        }
        if ((i4 & 2048) != 0) {
            str9 = screenTransitionEventDataDto.surrogate.getTarget_screen_name();
        }
        String str10 = str8;
        String str11 = str9;
        int i5 = i3;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        String str15 = str3;
        String str16 = str4;
        return screenTransitionEventDataDto.copy(str, i, str2, i2, str15, str16, str13, str14, i5, str12, str10, str11);
    }

    public final ScreenTransitionEventDataDto copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, int entity_id, String source, String source_screen_name, String target_screen_name) {
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        return new ScreenTransitionEventDataDto(new Surrogate(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, target_screen_name));
    }

    @Override // com.robinhood.idl.Dto
    public ScreenTransitionEventData toProto() {
        return new ScreenTransitionEventData(this.surrogate.getScreen_name(), this.surrogate.getScreen_depth(), this.surrogate.getScreen_description(), this.surrogate.getTime_spent(), this.surrogate.getTransition_reason(), this.surrogate.getType(), this.surrogate.getMessage_type(), this.surrogate.getMessage_uuid(), this.surrogate.getEntity_id(), this.surrogate.getSource(), this.surrogate.getSource_screen_name(), this.surrogate.getTarget_screen_name(), null, 4096, null);
    }

    public String toString() {
        return "[ScreenTransitionEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ScreenTransitionEventDataDto) && Intrinsics.areEqual(((ScreenTransitionEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ScreenTransitionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002NOB¬\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0018J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0018\u00105\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0018\u00107\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0018\u0010<\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J®\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0017\b\u0002\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J%\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0001¢\u0006\u0002\bMR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR+\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR+\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate;", "", "screen_name", "", "screen_depth", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "target_screen_name", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getScreen_name$annotations", "()V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth$annotations", "getScreen_depth", "()I", "getScreen_description$annotations", "getScreen_description", "getTime_spent$annotations", "getTime_spent", "getTransition_reason$annotations", "getTransition_reason", "getType$annotations", "getType", "getMessage_type$annotations", "getMessage_type", "getMessage_uuid$annotations", "getMessage_uuid", "getEntity_id$annotations", "getEntity_id", "getSource$annotations", "getSource", "getSource_screen_name$annotations", "getSource_screen_name", "getTarget_screen_name$annotations", "getTarget_screen_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int entity_id;
        private final String message_type;
        private final String message_uuid;
        private final int screen_depth;
        private final String screen_description;
        private final String screen_name;
        private final String source;
        private final String source_screen_name;
        private final String target_screen_name;
        private final int time_spent;
        private final String transition_reason;
        private final String type;

        public Surrogate() {
            this((String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = surrogate.screen_name;
            }
            if ((i4 & 2) != 0) {
                i = surrogate.screen_depth;
            }
            if ((i4 & 4) != 0) {
                str2 = surrogate.screen_description;
            }
            if ((i4 & 8) != 0) {
                i2 = surrogate.time_spent;
            }
            if ((i4 & 16) != 0) {
                str3 = surrogate.transition_reason;
            }
            if ((i4 & 32) != 0) {
                str4 = surrogate.type;
            }
            if ((i4 & 64) != 0) {
                str5 = surrogate.message_type;
            }
            if ((i4 & 128) != 0) {
                str6 = surrogate.message_uuid;
            }
            if ((i4 & 256) != 0) {
                i3 = surrogate.entity_id;
            }
            if ((i4 & 512) != 0) {
                str7 = surrogate.source;
            }
            if ((i4 & 1024) != 0) {
                str8 = surrogate.source_screen_name;
            }
            if ((i4 & 2048) != 0) {
                str9 = surrogate.target_screen_name;
            }
            String str10 = str8;
            String str11 = str9;
            int i5 = i3;
            String str12 = str7;
            String str13 = str5;
            String str14 = str6;
            String str15 = str3;
            String str16 = str4;
            return surrogate.copy(str, i, str2, i2, str15, str16, str13, str14, i5, str12, str10, str11);
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("messageType")
        @JsonAnnotations2(names = {"message_type"})
        public static /* synthetic */ void getMessage_type$annotations() {
        }

        @SerialName("messageUuid")
        @JsonAnnotations2(names = {"message_uuid"})
        public static /* synthetic */ void getMessage_uuid$annotations() {
        }

        @SerialName("screenDepth")
        @JsonAnnotations2(names = {"screen_depth"})
        public static /* synthetic */ void getScreen_depth$annotations() {
        }

        @SerialName("screenDescription")
        @JsonAnnotations2(names = {"screen_description"})
        public static /* synthetic */ void getScreen_description$annotations() {
        }

        @SerialName("screenName")
        @JsonAnnotations2(names = {"screen_name"})
        public static /* synthetic */ void getScreen_name$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("sourceScreenName")
        @JsonAnnotations2(names = {"source_screen_name"})
        public static /* synthetic */ void getSource_screen_name$annotations() {
        }

        @SerialName("targetScreenName")
        @JsonAnnotations2(names = {"target_screen_name"})
        public static /* synthetic */ void getTarget_screen_name$annotations() {
        }

        @SerialName("timeSpent")
        @JsonAnnotations2(names = {"time_spent"})
        public static /* synthetic */ void getTime_spent$annotations() {
        }

        @SerialName("transitionReason")
        @JsonAnnotations2(names = {"transition_reason"})
        public static /* synthetic */ void getTransition_reason$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreen_name() {
            return this.screen_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSource_screen_name() {
            return this.source_screen_name;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTarget_screen_name() {
            return this.target_screen_name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScreen_depth() {
            return this.screen_depth;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreen_description() {
            return this.screen_description;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTransition_reason() {
            return this.transition_reason;
        }

        /* renamed from: component6, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMessage_type() {
            return this.message_type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        /* renamed from: component9, reason: from getter */
        public final int getEntity_id() {
            return this.entity_id;
        }

        public final Surrogate copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, int entity_id, String source, String source_screen_name, String target_screen_name) {
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(screen_description, "screen_description");
            Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
            Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
            return new Surrogate(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, target_screen_name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.screen_name, surrogate.screen_name) && this.screen_depth == surrogate.screen_depth && Intrinsics.areEqual(this.screen_description, surrogate.screen_description) && this.time_spent == surrogate.time_spent && Intrinsics.areEqual(this.transition_reason, surrogate.transition_reason) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.message_type, surrogate.message_type) && Intrinsics.areEqual(this.message_uuid, surrogate.message_uuid) && this.entity_id == surrogate.entity_id && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.source_screen_name, surrogate.source_screen_name) && Intrinsics.areEqual(this.target_screen_name, surrogate.target_screen_name);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.screen_name.hashCode() * 31) + Integer.hashCode(this.screen_depth)) * 31) + this.screen_description.hashCode()) * 31) + Integer.hashCode(this.time_spent)) * 31) + this.transition_reason.hashCode()) * 31) + this.type.hashCode()) * 31) + this.message_type.hashCode()) * 31) + this.message_uuid.hashCode()) * 31) + Integer.hashCode(this.entity_id)) * 31) + this.source.hashCode()) * 31) + this.source_screen_name.hashCode()) * 31) + this.target_screen_name.hashCode();
        }

        public String toString() {
            return "Surrogate(screen_name=" + this.screen_name + ", screen_depth=" + this.screen_depth + ", screen_description=" + this.screen_description + ", time_spent=" + this.time_spent + ", transition_reason=" + this.transition_reason + ", type=" + this.type + ", message_type=" + this.message_type + ", message_uuid=" + this.message_uuid + ", entity_id=" + this.entity_id + ", source=" + this.source + ", source_screen_name=" + this.source_screen_name + ", target_screen_name=" + this.target_screen_name + ")";
        }

        /* compiled from: ScreenTransitionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ScreenTransitionEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, String str6, int i4, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.screen_name = "";
            } else {
                this.screen_name = str;
            }
            if ((i & 2) == 0) {
                this.screen_depth = 0;
            } else {
                this.screen_depth = i2;
            }
            if ((i & 4) == 0) {
                this.screen_description = "";
            } else {
                this.screen_description = str2;
            }
            if ((i & 8) == 0) {
                this.time_spent = 0;
            } else {
                this.time_spent = i3;
            }
            if ((i & 16) == 0) {
                this.transition_reason = "";
            } else {
                this.transition_reason = str3;
            }
            if ((i & 32) == 0) {
                this.type = "";
            } else {
                this.type = str4;
            }
            if ((i & 64) == 0) {
                this.message_type = "";
            } else {
                this.message_type = str5;
            }
            if ((i & 128) == 0) {
                this.message_uuid = "";
            } else {
                this.message_uuid = str6;
            }
            if ((i & 256) == 0) {
                this.entity_id = 0;
            } else {
                this.entity_id = i4;
            }
            if ((i & 512) == 0) {
                this.source = "";
            } else {
                this.source = str7;
            }
            if ((i & 1024) == 0) {
                this.source_screen_name = "";
            } else {
                this.source_screen_name = str8;
            }
            if ((i & 2048) == 0) {
                this.target_screen_name = "";
            } else {
                this.target_screen_name = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.screen_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.screen_name);
            }
            int i = self.screen_depth;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.screen_description, "")) {
                output.encodeStringElement(serialDesc, 2, self.screen_description);
            }
            int i2 = self.time_spent;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.transition_reason, "")) {
                output.encodeStringElement(serialDesc, 4, self.transition_reason);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 5, self.type);
            }
            if (!Intrinsics.areEqual(self.message_type, "")) {
                output.encodeStringElement(serialDesc, 6, self.message_type);
            }
            if (!Intrinsics.areEqual(self.message_uuid, "")) {
                output.encodeStringElement(serialDesc, 7, self.message_uuid);
            }
            int i3 = self.entity_id;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 9, self.source);
            }
            if (!Intrinsics.areEqual(self.source_screen_name, "")) {
                output.encodeStringElement(serialDesc, 10, self.source_screen_name);
            }
            if (Intrinsics.areEqual(self.target_screen_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 11, self.target_screen_name);
        }

        public Surrogate(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, int i3, String source, String source_screen_name, String target_screen_name) {
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(screen_description, "screen_description");
            Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
            Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
            this.screen_name = screen_name;
            this.screen_depth = i;
            this.screen_description = screen_description;
            this.time_spent = i2;
            this.transition_reason = transition_reason;
            this.type = type2;
            this.message_type = message_type;
            this.message_uuid = message_uuid;
            this.entity_id = i3;
            this.source = source;
            this.source_screen_name = source_screen_name;
            this.target_screen_name = target_screen_name;
        }

        public /* synthetic */ Surrogate(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? "" : str9);
        }

        public final String getScreen_name() {
            return this.screen_name;
        }

        public final int getScreen_depth() {
            return this.screen_depth;
        }

        public final String getScreen_description() {
            return this.screen_description;
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final String getTransition_reason() {
            return this.transition_reason;
        }

        public final String getType() {
            return this.type;
        }

        public final String getMessage_type() {
            return this.message_type;
        }

        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        public final int getEntity_id() {
            return this.entity_id;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getSource_screen_name() {
            return this.source_screen_name;
        }

        public final String getTarget_screen_name() {
            return this.target_screen_name;
        }
    }

    /* compiled from: ScreenTransitionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ScreenTransitionEventDataDto, ScreenTransitionEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ScreenTransitionEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ScreenTransitionEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ScreenTransitionEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) ScreenTransitionEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ScreenTransitionEventData> getProtoAdapter() {
            return ScreenTransitionEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ScreenTransitionEventDataDto getZeroValue() {
            return ScreenTransitionEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ScreenTransitionEventDataDto fromProto(ScreenTransitionEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ScreenTransitionEventDataDto(new Surrogate(proto.getScreen_name(), proto.getScreen_depth(), proto.getScreen_description(), proto.getTime_spent(), proto.getTransition_reason(), proto.getType(), proto.getMessage_type(), proto.getMessage_uuid(), proto.getEntity_id(), proto.getSource(), proto.getSource_screen_name(), proto.getTarget_screen_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ScreenTransitionEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScreenTransitionEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ScreenTransitionEventDataDto(null, 0, null, 0, null, null, null, null, 0, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ScreenTransitionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ScreenTransitionEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ScreenTransitionEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ScreenTransitionEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ScreenTransitionEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ScreenTransitionEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ScreenTransitionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ScreenTransitionEventDataDto";
        }
    }
}
