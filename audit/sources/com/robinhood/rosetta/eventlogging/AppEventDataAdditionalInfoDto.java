package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
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

/* compiled from: AppEventDataAdditionalInfoDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0010JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\tH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate;)V", "num_shares", "", "direction", "", "time_spent", "referrer_host", Constants.REFERRER, "value", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNum_shares", "()I", "getDirection", "()Ljava/lang/String;", "getTime_spent", "getReferrer_host", "getReferrer", "getValue", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AppEventDataAdditionalInfoDto implements Dto3<AppEventDataAdditionalInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AppEventDataAdditionalInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppEventDataAdditionalInfoDto, AppEventDataAdditionalInfo>> binaryBase64Serializer$delegate;
    private static final AppEventDataAdditionalInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AppEventDataAdditionalInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppEventDataAdditionalInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getNum_shares() {
        return this.surrogate.getNum_shares();
    }

    public final String getDirection() {
        return this.surrogate.getDirection();
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final String getReferrer_host() {
        return this.surrogate.getReferrer_host();
    }

    public final String getReferrer() {
        return this.surrogate.getReferrer();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    public /* synthetic */ AppEventDataAdditionalInfoDto(int i, String str, int i2, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppEventDataAdditionalInfoDto(int i, String direction, int i2, String referrer_host, String referrer, String value) {
        this(new Surrogate(i, direction, i2, referrer_host, referrer, value));
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static /* synthetic */ AppEventDataAdditionalInfoDto copy$default(AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, int i, String str, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appEventDataAdditionalInfoDto.surrogate.getNum_shares();
        }
        if ((i3 & 2) != 0) {
            str = appEventDataAdditionalInfoDto.surrogate.getDirection();
        }
        if ((i3 & 4) != 0) {
            i2 = appEventDataAdditionalInfoDto.surrogate.getTime_spent();
        }
        if ((i3 & 8) != 0) {
            str2 = appEventDataAdditionalInfoDto.surrogate.getReferrer_host();
        }
        if ((i3 & 16) != 0) {
            str3 = appEventDataAdditionalInfoDto.surrogate.getReferrer();
        }
        if ((i3 & 32) != 0) {
            str4 = appEventDataAdditionalInfoDto.surrogate.getValue();
        }
        String str5 = str3;
        String str6 = str4;
        return appEventDataAdditionalInfoDto.copy(i, str, i2, str2, str5, str6);
    }

    public final AppEventDataAdditionalInfoDto copy(int num_shares, String direction, int time_spent, String referrer_host, String referrer, String value) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AppEventDataAdditionalInfoDto(new Surrogate(num_shares, direction, time_spent, referrer_host, referrer, value));
    }

    @Override // com.robinhood.idl.Dto
    public AppEventDataAdditionalInfo toProto() {
        return new AppEventDataAdditionalInfo(this.surrogate.getNum_shares(), this.surrogate.getDirection(), this.surrogate.getTime_spent(), this.surrogate.getReferrer_host(), this.surrogate.getReferrer(), this.surrogate.getValue(), null, 64, null);
    }

    public String toString() {
        return "[AppEventDataAdditionalInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AppEventDataAdditionalInfoDto) && Intrinsics.areEqual(((AppEventDataAdditionalInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: AppEventDataAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267Ba\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010\"\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0018\u0010$\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003Jc\u0010(\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0019¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate;", "", "num_shares", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "direction", "", "time_spent", "referrer_host", Constants.REFERRER, "value", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNum_shares$annotations", "()V", "getNum_shares", "()I", "getDirection$annotations", "getDirection", "()Ljava/lang/String;", "getTime_spent$annotations", "getTime_spent", "getReferrer_host$annotations", "getReferrer_host", "getReferrer$annotations", "getReferrer", "getValue$annotations", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String direction;
        private final int num_shares;
        private final String referrer;
        private final String referrer_host;
        private final int time_spent;
        private final String value;

        public Surrogate() {
            this(0, (String) null, 0, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, String str, int i2, String str2, String str3, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = surrogate.num_shares;
            }
            if ((i3 & 2) != 0) {
                str = surrogate.direction;
            }
            if ((i3 & 4) != 0) {
                i2 = surrogate.time_spent;
            }
            if ((i3 & 8) != 0) {
                str2 = surrogate.referrer_host;
            }
            if ((i3 & 16) != 0) {
                str3 = surrogate.referrer;
            }
            if ((i3 & 32) != 0) {
                str4 = surrogate.value;
            }
            String str5 = str3;
            String str6 = str4;
            return surrogate.copy(i, str, i2, str2, str5, str6);
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("numShares")
        @JsonAnnotations2(names = {"num_shares"})
        public static /* synthetic */ void getNum_shares$annotations() {
        }

        @SerialName(Constants.REFERRER)
        @JsonAnnotations2(names = {Constants.REFERRER})
        public static /* synthetic */ void getReferrer$annotations() {
        }

        @SerialName("referrerHost")
        @JsonAnnotations2(names = {"referrer_host"})
        public static /* synthetic */ void getReferrer_host$annotations() {
        }

        @SerialName("timeSpent")
        @JsonAnnotations2(names = {"time_spent"})
        public static /* synthetic */ void getTime_spent$annotations() {
        }

        @SerialName("value")
        @JsonAnnotations2(names = {"value"})
        public static /* synthetic */ void getValue$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getNum_shares() {
            return this.num_shares;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReferrer_host() {
            return this.referrer_host;
        }

        /* renamed from: component5, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component6, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Surrogate copy(int num_shares, String direction, int time_spent, String referrer_host, String referrer, String value) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Surrogate(num_shares, direction, time_spent, referrer_host, referrer, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.num_shares == surrogate.num_shares && Intrinsics.areEqual(this.direction, surrogate.direction) && this.time_spent == surrogate.time_spent && Intrinsics.areEqual(this.referrer_host, surrogate.referrer_host) && Intrinsics.areEqual(this.referrer, surrogate.referrer) && Intrinsics.areEqual(this.value, surrogate.value);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.num_shares) * 31) + this.direction.hashCode()) * 31) + Integer.hashCode(this.time_spent)) * 31) + this.referrer_host.hashCode()) * 31) + this.referrer.hashCode()) * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Surrogate(num_shares=" + this.num_shares + ", direction=" + this.direction + ", time_spent=" + this.time_spent + ", referrer_host=" + this.referrer_host + ", referrer=" + this.referrer + ", value=" + this.value + ")";
        }

        /* compiled from: AppEventDataAdditionalInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AppEventDataAdditionalInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, int i3, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.num_shares = 0;
            } else {
                this.num_shares = i2;
            }
            if ((i & 2) == 0) {
                this.direction = "";
            } else {
                this.direction = str;
            }
            if ((i & 4) == 0) {
                this.time_spent = 0;
            } else {
                this.time_spent = i3;
            }
            if ((i & 8) == 0) {
                this.referrer_host = "";
            } else {
                this.referrer_host = str2;
            }
            if ((i & 16) == 0) {
                this.referrer = "";
            } else {
                this.referrer = str3;
            }
            if ((i & 32) == 0) {
                this.value = "";
            } else {
                this.value = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.num_shares;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.direction, "")) {
                output.encodeStringElement(serialDesc, 1, self.direction);
            }
            int i2 = self.time_spent;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.referrer_host, "")) {
                output.encodeStringElement(serialDesc, 3, self.referrer_host);
            }
            if (!Intrinsics.areEqual(self.referrer, "")) {
                output.encodeStringElement(serialDesc, 4, self.referrer);
            }
            if (Intrinsics.areEqual(self.value, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.value);
        }

        public Surrogate(int i, String direction, int i2, String referrer_host, String referrer, String value) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(value, "value");
            this.num_shares = i;
            this.direction = direction;
            this.time_spent = i2;
            this.referrer_host = referrer_host;
            this.referrer = referrer;
            this.value = value;
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
        }

        public final int getNum_shares() {
            return this.num_shares;
        }

        public final String getDirection() {
            return this.direction;
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final String getReferrer_host() {
            return this.referrer_host;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: AppEventDataAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AppEventDataAdditionalInfoDto, AppEventDataAdditionalInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppEventDataAdditionalInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDataAdditionalInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDataAdditionalInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) AppEventDataAdditionalInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppEventDataAdditionalInfo> getProtoAdapter() {
            return AppEventDataAdditionalInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDataAdditionalInfoDto getZeroValue() {
            return AppEventDataAdditionalInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDataAdditionalInfoDto fromProto(AppEventDataAdditionalInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AppEventDataAdditionalInfoDto(new Surrogate(proto.getNum_shares(), proto.getDirection(), proto.getTime_spent(), proto.getReferrer_host(), proto.getReferrer(), proto.getValue()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AppEventDataAdditionalInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppEventDataAdditionalInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AppEventDataAdditionalInfoDto(0, null, 0, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AppEventDataAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AppEventDataAdditionalInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AppEventDataAdditionalInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppEventDataAdditionalInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AppEventDataAdditionalInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AppEventDataAdditionalInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AppEventDataAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AppEventDataAdditionalInfoDto";
        }
    }
}
