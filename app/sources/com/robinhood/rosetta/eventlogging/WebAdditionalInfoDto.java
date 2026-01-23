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

/* compiled from: WebAdditionalInfoDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0010JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\tH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate;)V", "time_spent", "", Constants.REFERRER, "", "referrer_host", "value", "masked_referrer", "masked_referrer_host", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTime_spent", "()I", "getReferrer", "()Ljava/lang/String;", "getReferrer_host", "getValue", "getMasked_referrer", "getMasked_referrer_host", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class WebAdditionalInfoDto implements Dto3<WebAdditionalInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WebAdditionalInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WebAdditionalInfoDto, WebAdditionalInfo>> binaryBase64Serializer$delegate;
    private static final WebAdditionalInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WebAdditionalInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WebAdditionalInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final String getReferrer() {
        return this.surrogate.getReferrer();
    }

    public final String getReferrer_host() {
        return this.surrogate.getReferrer_host();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    public final String getMasked_referrer() {
        return this.surrogate.getMasked_referrer();
    }

    public final String getMasked_referrer_host() {
        return this.surrogate.getMasked_referrer_host();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WebAdditionalInfoDto(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.WebAdditionalInfoDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebAdditionalInfoDto(int i, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host) {
        this(new Surrogate(i, referrer, referrer_host, value, masked_referrer, masked_referrer_host));
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
    }

    public static /* synthetic */ WebAdditionalInfoDto copy$default(WebAdditionalInfoDto webAdditionalInfoDto, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webAdditionalInfoDto.surrogate.getTime_spent();
        }
        if ((i2 & 2) != 0) {
            str = webAdditionalInfoDto.surrogate.getReferrer();
        }
        if ((i2 & 4) != 0) {
            str2 = webAdditionalInfoDto.surrogate.getReferrer_host();
        }
        if ((i2 & 8) != 0) {
            str3 = webAdditionalInfoDto.surrogate.getValue();
        }
        if ((i2 & 16) != 0) {
            str4 = webAdditionalInfoDto.surrogate.getMasked_referrer();
        }
        if ((i2 & 32) != 0) {
            str5 = webAdditionalInfoDto.surrogate.getMasked_referrer_host();
        }
        String str6 = str4;
        String str7 = str5;
        return webAdditionalInfoDto.copy(i, str, str2, str3, str6, str7);
    }

    public final WebAdditionalInfoDto copy(int time_spent, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
        return new WebAdditionalInfoDto(new Surrogate(time_spent, referrer, referrer_host, value, masked_referrer, masked_referrer_host));
    }

    @Override // com.robinhood.idl.Dto
    public WebAdditionalInfo toProto() {
        return new WebAdditionalInfo(this.surrogate.getTime_spent(), this.surrogate.getReferrer(), this.surrogate.getReferrer_host(), this.surrogate.getValue(), this.surrogate.getMasked_referrer(), this.surrogate.getMasked_referrer_host(), null, 64, null);
    }

    public String toString() {
        return "[WebAdditionalInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WebAdditionalInfoDto) && Intrinsics.areEqual(((WebAdditionalInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: WebAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BR\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010\"\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003JT\u0010(\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0019¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate;", "", "time_spent", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", Constants.REFERRER, "", "referrer_host", "value", "masked_referrer", "masked_referrer_host", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTime_spent$annotations", "()V", "getTime_spent", "()I", "getReferrer$annotations", "getReferrer", "()Ljava/lang/String;", "getReferrer_host$annotations", "getReferrer_host", "getValue$annotations", "getValue", "getMasked_referrer$annotations", "getMasked_referrer", "getMasked_referrer_host$annotations", "getMasked_referrer_host", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String masked_referrer;
        private final String masked_referrer_host;
        private final String referrer;
        private final String referrer_host;
        private final int time_spent;
        private final String value;

        public Surrogate() {
            this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = surrogate.time_spent;
            }
            if ((i2 & 2) != 0) {
                str = surrogate.referrer;
            }
            if ((i2 & 4) != 0) {
                str2 = surrogate.referrer_host;
            }
            if ((i2 & 8) != 0) {
                str3 = surrogate.value;
            }
            if ((i2 & 16) != 0) {
                str4 = surrogate.masked_referrer;
            }
            if ((i2 & 32) != 0) {
                str5 = surrogate.masked_referrer_host;
            }
            String str6 = str4;
            String str7 = str5;
            return surrogate.copy(i, str, str2, str3, str6, str7);
        }

        @SerialName("maskedReferrer")
        @JsonAnnotations2(names = {"masked_referrer"})
        public static /* synthetic */ void getMasked_referrer$annotations() {
        }

        @SerialName("maskedReferrerHost")
        @JsonAnnotations2(names = {"masked_referrer_host"})
        public static /* synthetic */ void getMasked_referrer_host$annotations() {
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
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReferrer_host() {
            return this.referrer_host;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMasked_referrer() {
            return this.masked_referrer;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMasked_referrer_host() {
            return this.masked_referrer_host;
        }

        public final Surrogate copy(int time_spent, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host) {
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
            Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
            return new Surrogate(time_spent, referrer, referrer_host, value, masked_referrer, masked_referrer_host);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.time_spent == surrogate.time_spent && Intrinsics.areEqual(this.referrer, surrogate.referrer) && Intrinsics.areEqual(this.referrer_host, surrogate.referrer_host) && Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.masked_referrer, surrogate.masked_referrer) && Intrinsics.areEqual(this.masked_referrer_host, surrogate.masked_referrer_host);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.time_spent) * 31) + this.referrer.hashCode()) * 31) + this.referrer_host.hashCode()) * 31) + this.value.hashCode()) * 31) + this.masked_referrer.hashCode()) * 31) + this.masked_referrer_host.hashCode();
        }

        public String toString() {
            return "Surrogate(time_spent=" + this.time_spent + ", referrer=" + this.referrer + ", referrer_host=" + this.referrer_host + ", value=" + this.value + ", masked_referrer=" + this.masked_referrer + ", masked_referrer_host=" + this.masked_referrer_host + ")";
        }

        /* compiled from: WebAdditionalInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WebAdditionalInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            this.time_spent = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.referrer = "";
            } else {
                this.referrer = str;
            }
            if ((i & 4) == 0) {
                this.referrer_host = "";
            } else {
                this.referrer_host = str2;
            }
            if ((i & 8) == 0) {
                this.value = "";
            } else {
                this.value = str3;
            }
            if ((i & 16) == 0) {
                this.masked_referrer = "";
            } else {
                this.masked_referrer = str4;
            }
            if ((i & 32) == 0) {
                this.masked_referrer_host = "";
            } else {
                this.masked_referrer_host = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.time_spent;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.referrer, "")) {
                output.encodeStringElement(serialDesc, 1, self.referrer);
            }
            if (!Intrinsics.areEqual(self.referrer_host, "")) {
                output.encodeStringElement(serialDesc, 2, self.referrer_host);
            }
            if (!Intrinsics.areEqual(self.value, "")) {
                output.encodeStringElement(serialDesc, 3, self.value);
            }
            if (!Intrinsics.areEqual(self.masked_referrer, "")) {
                output.encodeStringElement(serialDesc, 4, self.masked_referrer);
            }
            if (Intrinsics.areEqual(self.masked_referrer_host, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.masked_referrer_host);
        }

        public Surrogate(int i, String referrer, String referrer_host, String value, String masked_referrer, String masked_referrer_host) {
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(referrer_host, "referrer_host");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
            Intrinsics.checkNotNullParameter(masked_referrer_host, "masked_referrer_host");
            this.time_spent = i;
            this.referrer = referrer;
            this.referrer_host = referrer_host;
            this.value = value;
            this.masked_referrer = masked_referrer;
            this.masked_referrer_host = masked_referrer_host;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 2
                java.lang.String r0 = ""
                if (r9 == 0) goto Lc
                r3 = r0
            Lc:
                r9 = r8 & 4
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L16
                r5 = r0
            L16:
                r9 = r8 & 16
                if (r9 == 0) goto L1b
                r6 = r0
            L1b:
                r8 = r8 & 32
                if (r8 == 0) goto L27
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2e
            L27:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2e:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.WebAdditionalInfoDto.Surrogate.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final String getReferrer_host() {
            return this.referrer_host;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getMasked_referrer() {
            return this.masked_referrer;
        }

        public final String getMasked_referrer_host() {
            return this.masked_referrer_host;
        }
    }

    /* compiled from: WebAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<WebAdditionalInfoDto, WebAdditionalInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WebAdditionalInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebAdditionalInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebAdditionalInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) WebAdditionalInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WebAdditionalInfo> getProtoAdapter() {
            return WebAdditionalInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebAdditionalInfoDto getZeroValue() {
            return WebAdditionalInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebAdditionalInfoDto fromProto(WebAdditionalInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new WebAdditionalInfoDto(new Surrogate(proto.getTime_spent(), proto.getReferrer(), proto.getReferrer_host(), proto.getValue(), proto.getMasked_referrer(), proto.getMasked_referrer_host()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebAdditionalInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebAdditionalInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WebAdditionalInfoDto(0, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WebAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<WebAdditionalInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.WebAdditionalInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WebAdditionalInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WebAdditionalInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WebAdditionalInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WebAdditionalInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.WebAdditionalInfoDto";
        }
    }
}
