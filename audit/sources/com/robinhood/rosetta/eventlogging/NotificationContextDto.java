package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
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

/* compiled from: NotificationContextDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0014J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tJ\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\u000bH\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000bH\u0016J\b\u0010,\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NotificationContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate;)V", "type", "", RhGcmListenerService.EXTRA_CATEGORY, "", "isFixed", "", "load_id", "card_id", "title", "message", "actionUrl", "actionIdentifier", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCategory", "()I", "()Z", "getLoad_id", "getCard_id", "getTitle", "getMessage", "getActionUrl", "getActionIdentifier", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NotificationContextDto implements Dto3<NotificationContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NotificationContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NotificationContextDto, NotificationContext>> binaryBase64Serializer$delegate;
    private static final NotificationContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NotificationContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NotificationContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final int getCategory() {
        return this.surrogate.getCategory();
    }

    public final boolean isFixed() {
        return this.surrogate.isFixed();
    }

    public final String getLoad_id() {
        return this.surrogate.getLoad_id();
    }

    public final String getCard_id() {
        return this.surrogate.getCard_id();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getMessage() {
        return this.surrogate.getMessage();
    }

    public final String getActionUrl() {
        return this.surrogate.getActionUrl();
    }

    public final String getActionIdentifier() {
        return this.surrogate.getActionIdentifier();
    }

    public /* synthetic */ NotificationContextDto(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationContextDto(String type2, int i, boolean z, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier) {
        this(new Surrogate(type2, i, z, load_id, card_id, title, message, actionUrl, actionIdentifier));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
    }

    public static /* synthetic */ NotificationContextDto copy$default(NotificationContextDto notificationContextDto, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notificationContextDto.surrogate.getType();
        }
        if ((i2 & 2) != 0) {
            i = notificationContextDto.surrogate.getCategory();
        }
        if ((i2 & 4) != 0) {
            z = notificationContextDto.surrogate.isFixed();
        }
        if ((i2 & 8) != 0) {
            str2 = notificationContextDto.surrogate.getLoad_id();
        }
        if ((i2 & 16) != 0) {
            str3 = notificationContextDto.surrogate.getCard_id();
        }
        if ((i2 & 32) != 0) {
            str4 = notificationContextDto.surrogate.getTitle();
        }
        if ((i2 & 64) != 0) {
            str5 = notificationContextDto.surrogate.getMessage();
        }
        if ((i2 & 128) != 0) {
            str6 = notificationContextDto.surrogate.getActionUrl();
        }
        if ((i2 & 256) != 0) {
            str7 = notificationContextDto.surrogate.getActionIdentifier();
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        boolean z2 = z;
        return notificationContextDto.copy(str, i, z2, str2, str12, str10, str11, str8, str9);
    }

    public final NotificationContextDto copy(String type2, int category, boolean isFixed, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
        return new NotificationContextDto(new Surrogate(type2, category, isFixed, load_id, card_id, title, message, actionUrl, actionIdentifier));
    }

    @Override // com.robinhood.idl.Dto
    public NotificationContext toProto() {
        return new NotificationContext(this.surrogate.getType(), this.surrogate.getCategory(), this.surrogate.isFixed(), this.surrogate.getLoad_id(), this.surrogate.getCard_id(), this.surrogate.getTitle(), this.surrogate.getMessage(), this.surrogate.getActionUrl(), this.surrogate.getActionIdentifier(), null, 512, null);
    }

    public String toString() {
        return "[NotificationContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NotificationContextDto) && Intrinsics.areEqual(((NotificationContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: NotificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002BCBp\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0018\u0010-\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Jr\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\t\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a¨\u0006D"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate;", "", "type", "", RhGcmListenerService.EXTRA_CATEGORY, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "isFixed", "", "load_id", "card_id", "title", "message", "actionUrl", "actionIdentifier", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getCategory$annotations", "getCategory", "()I", "isFixed$annotations", "()Z", "getLoad_id$annotations", "getLoad_id", "getCard_id$annotations", "getCard_id", "getTitle$annotations", "getTitle", "getMessage$annotations", "getMessage", "getActionUrl$annotations", "getActionUrl", "getActionIdentifier$annotations", "getActionIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String actionIdentifier;
        private final String actionUrl;
        private final String card_id;
        private final int category;
        private final boolean isFixed;
        private final String load_id;
        private final String message;
        private final String title;
        private final String type;

        public Surrogate() {
            this((String) null, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.type;
            }
            if ((i2 & 2) != 0) {
                i = surrogate.category;
            }
            if ((i2 & 4) != 0) {
                z = surrogate.isFixed;
            }
            if ((i2 & 8) != 0) {
                str2 = surrogate.load_id;
            }
            if ((i2 & 16) != 0) {
                str3 = surrogate.card_id;
            }
            if ((i2 & 32) != 0) {
                str4 = surrogate.title;
            }
            if ((i2 & 64) != 0) {
                str5 = surrogate.message;
            }
            if ((i2 & 128) != 0) {
                str6 = surrogate.actionUrl;
            }
            if ((i2 & 256) != 0) {
                str7 = surrogate.actionIdentifier;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            String str12 = str3;
            boolean z2 = z;
            return surrogate.copy(str, i, z2, str2, str12, str10, str11, str8, str9);
        }

        @SerialName("actionIdentifier")
        @JsonAnnotations2(names = {"actionIdentifier"})
        public static /* synthetic */ void getActionIdentifier$annotations() {
        }

        @SerialName("actionUrl")
        @JsonAnnotations2(names = {"actionUrl"})
        public static /* synthetic */ void getActionUrl$annotations() {
        }

        @SerialName("cardId")
        @JsonAnnotations2(names = {"card_id"})
        public static /* synthetic */ void getCard_id$annotations() {
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("loadId")
        @JsonAnnotations2(names = {"load_id"})
        public static /* synthetic */ void getLoad_id$annotations() {
        }

        @SerialName("message")
        @JsonAnnotations2(names = {"message"})
        public static /* synthetic */ void getMessage$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("isFixed")
        @JsonAnnotations2(names = {"isFixed"})
        public static /* synthetic */ void isFixed$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCategory() {
            return this.category;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLoad_id() {
            return this.load_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCard_id() {
            return this.card_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component8, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        /* renamed from: component9, reason: from getter */
        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final Surrogate copy(String type2, int category, boolean isFixed, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(load_id, "load_id");
            Intrinsics.checkNotNullParameter(card_id, "card_id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
            Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
            return new Surrogate(type2, category, isFixed, load_id, card_id, title, message, actionUrl, actionIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.type, surrogate.type) && this.category == surrogate.category && this.isFixed == surrogate.isFixed && Intrinsics.areEqual(this.load_id, surrogate.load_id) && Intrinsics.areEqual(this.card_id, surrogate.card_id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.actionUrl, surrogate.actionUrl) && Intrinsics.areEqual(this.actionIdentifier, surrogate.actionIdentifier);
        }

        public int hashCode() {
            return (((((((((((((((this.type.hashCode() * 31) + Integer.hashCode(this.category)) * 31) + java.lang.Boolean.hashCode(this.isFixed)) * 31) + this.load_id.hashCode()) * 31) + this.card_id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.actionUrl.hashCode()) * 31) + this.actionIdentifier.hashCode();
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", category=" + this.category + ", isFixed=" + this.isFixed + ", load_id=" + this.load_id + ", card_id=" + this.card_id + ", title=" + this.title + ", message=" + this.message + ", actionUrl=" + this.actionUrl + ", actionIdentifier=" + this.actionIdentifier + ")";
        }

        /* compiled from: NotificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NotificationContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = "";
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.category = 0;
            } else {
                this.category = i2;
            }
            if ((i & 4) == 0) {
                this.isFixed = false;
            } else {
                this.isFixed = z;
            }
            if ((i & 8) == 0) {
                this.load_id = "";
            } else {
                this.load_id = str2;
            }
            if ((i & 16) == 0) {
                this.card_id = "";
            } else {
                this.card_id = str3;
            }
            if ((i & 32) == 0) {
                this.title = "";
            } else {
                this.title = str4;
            }
            if ((i & 64) == 0) {
                this.message = "";
            } else {
                this.message = str5;
            }
            if ((i & 128) == 0) {
                this.actionUrl = "";
            } else {
                this.actionUrl = str6;
            }
            if ((i & 256) == 0) {
                this.actionIdentifier = "";
            } else {
                this.actionIdentifier = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 0, self.type);
            }
            int i = self.category;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            boolean z = self.isFixed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (!Intrinsics.areEqual(self.load_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.load_id);
            }
            if (!Intrinsics.areEqual(self.card_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.card_id);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 5, self.title);
            }
            if (!Intrinsics.areEqual(self.message, "")) {
                output.encodeStringElement(serialDesc, 6, self.message);
            }
            if (!Intrinsics.areEqual(self.actionUrl, "")) {
                output.encodeStringElement(serialDesc, 7, self.actionUrl);
            }
            if (Intrinsics.areEqual(self.actionIdentifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.actionIdentifier);
        }

        public Surrogate(String type2, int i, boolean z, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(load_id, "load_id");
            Intrinsics.checkNotNullParameter(card_id, "card_id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
            Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
            this.type = type2;
            this.category = i;
            this.isFixed = z;
            this.load_id = load_id;
            this.card_id = card_id;
            this.title = title;
            this.message = message;
            this.actionUrl = actionUrl;
            this.actionIdentifier = actionIdentifier;
        }

        public /* synthetic */ Surrogate(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7);
        }

        public final String getType() {
            return this.type;
        }

        public final int getCategory() {
            return this.category;
        }

        public final boolean isFixed() {
            return this.isFixed;
        }

        public final String getLoad_id() {
            return this.load_id;
        }

        public final String getCard_id() {
            return this.card_id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getActionUrl() {
            return this.actionUrl;
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }
    }

    /* compiled from: NotificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NotificationContextDto;", "Lcom/robinhood/rosetta/eventlogging/NotificationContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NotificationContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NotificationContextDto, NotificationContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NotificationContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NotificationContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NotificationContextDto> getBinaryBase64Serializer() {
            return (KSerializer) NotificationContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NotificationContext> getProtoAdapter() {
            return NotificationContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NotificationContextDto getZeroValue() {
            return NotificationContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NotificationContextDto fromProto(NotificationContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NotificationContextDto(new Surrogate(proto.getType(), proto.getCategory(), proto.getIsFixed(), proto.getLoad_id(), proto.getCard_id(), proto.getTitle(), proto.getMessage(), proto.getActionUrl(), proto.getActionIdentifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NotificationContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NotificationContextDto(null, 0, false, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NotificationContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NotificationContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NotificationContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NotificationContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NotificationContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NotificationContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NotificationContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NotificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NotificationContextDto";
        }
    }
}
