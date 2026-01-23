package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.OAuthInfo;
import com.robinhood.rosetta.eventlogging.OAuthInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: OAuthInfoDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate;)V", "step", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "app_id", "", "ref_id", "error", "debug_info", "(Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "getApp_id", "()Ljava/lang/String;", "getRef_id", "getError", "getDebug_info", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OAuthStepDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OAuthInfoDto implements Dto3<OAuthInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OAuthInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OAuthInfoDto, OAuthInfo>> binaryBase64Serializer$delegate;
    private static final OAuthInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OAuthInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OAuthInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final OAuthStepDto getStep() {
        return this.surrogate.getStep();
    }

    public final String getApp_id() {
        return this.surrogate.getApp_id();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getError() {
        return this.surrogate.getError();
    }

    public final String getDebug_info() {
        return this.surrogate.getDebug_info();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OAuthInfoDto(com.robinhood.rosetta.eventlogging.OAuthInfoDto.OAuthStepDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto$Companion r2 = com.robinhood.rosetta.eventlogging.OAuthInfoDto.OAuthStepDto.INSTANCE
            com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto L11
            r3 = r0
        L11:
            r8 = r7 & 4
            if (r8 == 0) goto L16
            r4 = r0
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L1b
            r5 = r0
        L1b:
            r7 = r7 & 16
            if (r7 == 0) goto L26
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L26:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.OAuthInfoDto.<init>(com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OAuthInfoDto(OAuthStepDto step, String app_id, String ref_id, String error, String debug_info) {
        this(new Surrogate(step, app_id, ref_id, error, debug_info));
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
    }

    public static /* synthetic */ OAuthInfoDto copy$default(OAuthInfoDto oAuthInfoDto, OAuthStepDto oAuthStepDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            oAuthStepDto = oAuthInfoDto.surrogate.getStep();
        }
        if ((i & 2) != 0) {
            str = oAuthInfoDto.surrogate.getApp_id();
        }
        if ((i & 4) != 0) {
            str2 = oAuthInfoDto.surrogate.getRef_id();
        }
        if ((i & 8) != 0) {
            str3 = oAuthInfoDto.surrogate.getError();
        }
        if ((i & 16) != 0) {
            str4 = oAuthInfoDto.surrogate.getDebug_info();
        }
        String str5 = str4;
        String str6 = str2;
        return oAuthInfoDto.copy(oAuthStepDto, str, str6, str3, str5);
    }

    public final OAuthInfoDto copy(OAuthStepDto step, String app_id, String ref_id, String error, String debug_info) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
        return new OAuthInfoDto(new Surrogate(step, app_id, ref_id, error, debug_info));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OAuthInfo toProto() {
        return new OAuthInfo((OAuthInfo.OAuthStep) this.surrogate.getStep().toProto(), this.surrogate.getApp_id(), this.surrogate.getRef_id(), this.surrogate.getError(), this.surrogate.getDebug_info(), null, 32, null);
    }

    public String toString() {
        return "[OAuthInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OAuthInfoDto) && Intrinsics.areEqual(((OAuthInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: OAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0016¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "app_id", "", "ref_id", "error", "debug_info", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStep$annotations", "()V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "getApp_id$annotations", "getApp_id", "()Ljava/lang/String;", "getRef_id$annotations", "getRef_id", "getError$annotations", "getError", "getDebug_info$annotations", "getDebug_info", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String app_id;
        private final String debug_info;
        private final String error;
        private final String ref_id;
        private final OAuthStepDto step;

        public Surrogate() {
            this((OAuthStepDto) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, OAuthStepDto oAuthStepDto, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                oAuthStepDto = surrogate.step;
            }
            if ((i & 2) != 0) {
                str = surrogate.app_id;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.ref_id;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.error;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.debug_info;
            }
            String str5 = str4;
            String str6 = str2;
            return surrogate.copy(oAuthStepDto, str, str6, str3, str5);
        }

        @SerialName("appId")
        @JsonAnnotations2(names = {"app_id"})
        public static /* synthetic */ void getApp_id$annotations() {
        }

        @SerialName("debugInfo")
        @JsonAnnotations2(names = {"debug_info"})
        public static /* synthetic */ void getDebug_info$annotations() {
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("step")
        @JsonAnnotations2(names = {"step"})
        public static /* synthetic */ void getStep$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final OAuthStepDto getStep() {
            return this.step;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApp_id() {
            return this.app_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDebug_info() {
            return this.debug_info;
        }

        public final Surrogate copy(OAuthStepDto step, String app_id, String ref_id, String error, String debug_info) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(app_id, "app_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(debug_info, "debug_info");
            return new Surrogate(step, app_id, ref_id, error, debug_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.step == surrogate.step && Intrinsics.areEqual(this.app_id, surrogate.app_id) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.error, surrogate.error) && Intrinsics.areEqual(this.debug_info, surrogate.debug_info);
        }

        public int hashCode() {
            return (((((((this.step.hashCode() * 31) + this.app_id.hashCode()) * 31) + this.ref_id.hashCode()) * 31) + this.error.hashCode()) * 31) + this.debug_info.hashCode();
        }

        public String toString() {
            return "Surrogate(step=" + this.step + ", app_id=" + this.app_id + ", ref_id=" + this.ref_id + ", error=" + this.error + ", debug_info=" + this.debug_info + ")";
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OAuthInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OAuthStepDto oAuthStepDto, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.step = (i & 1) == 0 ? OAuthStepDto.INSTANCE.getZeroValue() : oAuthStepDto;
            if ((i & 2) == 0) {
                this.app_id = "";
            } else {
                this.app_id = str;
            }
            if ((i & 4) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 8) == 0) {
                this.error = "";
            } else {
                this.error = str3;
            }
            if ((i & 16) == 0) {
                this.debug_info = "";
            } else {
                this.debug_info = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.step != OAuthStepDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OAuthStepDto.Serializer.INSTANCE, self.step);
            }
            if (!Intrinsics.areEqual(self.app_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.app_id);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.error, "")) {
                output.encodeStringElement(serialDesc, 3, self.error);
            }
            if (Intrinsics.areEqual(self.debug_info, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.debug_info);
        }

        public Surrogate(OAuthStepDto step, String app_id, String ref_id, String error, String debug_info) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(app_id, "app_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(debug_info, "debug_info");
            this.step = step;
            this.app_id = app_id;
            this.ref_id = ref_id;
            this.error = error;
            this.debug_info = debug_info;
        }

        public final OAuthStepDto getStep() {
            return this.step;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.OAuthInfoDto.OAuthStepDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto$Companion r2 = com.robinhood.rosetta.eventlogging.OAuthInfoDto.OAuthStepDto.INSTANCE
                com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                java.lang.String r0 = ""
                if (r8 == 0) goto L11
                r3 = r0
            L11:
                r8 = r7 & 4
                if (r8 == 0) goto L16
                r4 = r0
            L16:
                r8 = r7 & 8
                if (r8 == 0) goto L1b
                r5 = r0
            L1b:
                r7 = r7 & 16
                if (r7 == 0) goto L26
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2c
            L26:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2c:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.OAuthInfoDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getApp_id() {
            return this.app_id;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getError() {
            return this.error;
        }

        public final String getDebug_info() {
            return this.debug_info;
        }
    }

    /* compiled from: OAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OAuthInfoDto, OAuthInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OAuthInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OAuthInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OAuthInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) OAuthInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OAuthInfo> getProtoAdapter() {
            return OAuthInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OAuthInfoDto getZeroValue() {
            return OAuthInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OAuthInfoDto fromProto(OAuthInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OAuthInfoDto(new Surrogate(OAuthStepDto.INSTANCE.fromProto(proto.getStep()), proto.getApp_id(), proto.getRef_id(), proto.getError(), proto.getDebug_info()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OAuthInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OAuthInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OAuthInfoDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OAUTH_STEP_UNSPECIFIED", "RECEIVED_DEEPLINK", "DEEPLINK_NOT_SUPPORTED", "CLIENT_GENERATED_REDIRECT_URI", "SERVER_RETURNED_REDIRECT_URI", "REDIRECT_SUCCESS", "REDIRECT_FAILURE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OAuthStepDto implements Dto2<OAuthInfo.OAuthStep>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OAuthStepDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OAuthStepDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OAuthStepDto, OAuthInfo.OAuthStep>> binaryBase64Serializer$delegate;
        public static final OAuthStepDto OAUTH_STEP_UNSPECIFIED = new OAUTH_STEP_UNSPECIFIED("OAUTH_STEP_UNSPECIFIED", 0);
        public static final OAuthStepDto RECEIVED_DEEPLINK = new RECEIVED_DEEPLINK("RECEIVED_DEEPLINK", 1);
        public static final OAuthStepDto DEEPLINK_NOT_SUPPORTED = new DEEPLINK_NOT_SUPPORTED("DEEPLINK_NOT_SUPPORTED", 2);
        public static final OAuthStepDto CLIENT_GENERATED_REDIRECT_URI = new CLIENT_GENERATED_REDIRECT_URI("CLIENT_GENERATED_REDIRECT_URI", 3);
        public static final OAuthStepDto SERVER_RETURNED_REDIRECT_URI = new SERVER_RETURNED_REDIRECT_URI("SERVER_RETURNED_REDIRECT_URI", 4);
        public static final OAuthStepDto REDIRECT_SUCCESS = new REDIRECT_SUCCESS("REDIRECT_SUCCESS", 5);
        public static final OAuthStepDto REDIRECT_FAILURE = new REDIRECT_FAILURE("REDIRECT_FAILURE", 6);

        private static final /* synthetic */ OAuthStepDto[] $values() {
            return new OAuthStepDto[]{OAUTH_STEP_UNSPECIFIED, RECEIVED_DEEPLINK, DEEPLINK_NOT_SUPPORTED, CLIENT_GENERATED_REDIRECT_URI, SERVER_RETURNED_REDIRECT_URI, REDIRECT_SUCCESS, REDIRECT_FAILURE};
        }

        public /* synthetic */ OAuthStepDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OAuthStepDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.OAUTH_STEP_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OAUTH_STEP_UNSPECIFIED extends OAuthStepDto {
            OAUTH_STEP_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED;
            }
        }

        private OAuthStepDto(String str, int i) {
        }

        static {
            OAuthStepDto[] oAuthStepDtoArr$values = $values();
            $VALUES = oAuthStepDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(oAuthStepDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OAuthInfoDto$OAuthStepDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OAuthInfoDto.OAuthStepDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.RECEIVED_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVED_DEEPLINK extends OAuthStepDto {
            RECEIVED_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.RECEIVED_DEEPLINK;
            }
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.DEEPLINK_NOT_SUPPORTED", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEEPLINK_NOT_SUPPORTED extends OAuthStepDto {
            DEEPLINK_NOT_SUPPORTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.DEEPLINK_NOT_SUPPORTED;
            }
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.CLIENT_GENERATED_REDIRECT_URI", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLIENT_GENERATED_REDIRECT_URI extends OAuthStepDto {
            CLIENT_GENERATED_REDIRECT_URI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.CLIENT_GENERATED_REDIRECT_URI;
            }
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.SERVER_RETURNED_REDIRECT_URI", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SERVER_RETURNED_REDIRECT_URI extends OAuthStepDto {
            SERVER_RETURNED_REDIRECT_URI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.SERVER_RETURNED_REDIRECT_URI;
            }
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.REDIRECT_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REDIRECT_SUCCESS extends OAuthStepDto {
            REDIRECT_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.REDIRECT_SUCCESS;
            }
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthInfoDto.OAuthStepDto.REDIRECT_FAILURE", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REDIRECT_FAILURE extends OAuthStepDto {
            REDIRECT_FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthInfo.OAuthStep toProto() {
                return OAuthInfo.OAuthStep.REDIRECT_FAILURE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo$OAuthStep;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OAuthStepDto, OAuthInfo.OAuthStep> {

            /* compiled from: OAuthInfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OAuthInfo.OAuthStep.values().length];
                    try {
                        iArr[OAuthInfo.OAuthStep.OAUTH_STEP_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.RECEIVED_DEEPLINK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.DEEPLINK_NOT_SUPPORTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.CLIENT_GENERATED_REDIRECT_URI.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.SERVER_RETURNED_REDIRECT_URI.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.REDIRECT_SUCCESS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[OAuthInfo.OAuthStep.REDIRECT_FAILURE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OAuthStepDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OAuthStepDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OAuthStepDto> getBinaryBase64Serializer() {
                return (KSerializer) OAuthStepDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OAuthInfo.OAuthStep> getProtoAdapter() {
                return OAuthInfo.OAuthStep.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OAuthStepDto getZeroValue() {
                return OAuthStepDto.OAUTH_STEP_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OAuthStepDto fromProto(OAuthInfo.OAuthStep proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return OAuthStepDto.OAUTH_STEP_UNSPECIFIED;
                    case 2:
                        return OAuthStepDto.RECEIVED_DEEPLINK;
                    case 3:
                        return OAuthStepDto.DEEPLINK_NOT_SUPPORTED;
                    case 4:
                        return OAuthStepDto.CLIENT_GENERATED_REDIRECT_URI;
                    case 5:
                        return OAuthStepDto.SERVER_RETURNED_REDIRECT_URI;
                    case 6:
                        return OAuthStepDto.REDIRECT_SUCCESS;
                    case 7:
                        return OAuthStepDto.REDIRECT_FAILURE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$OAuthStepDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OAuthStepDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OAuthStepDto, OAuthInfo.OAuthStep> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OAuthInfo.OAuthStep", OAuthStepDto.getEntries(), OAuthStepDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OAuthStepDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OAuthStepDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OAuthStepDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OAuthStepDto valueOf(String str) {
            return (OAuthStepDto) Enum.valueOf(OAuthStepDto.class, str);
        }

        public static OAuthStepDto[] values() {
            return (OAuthStepDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OAuthInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OAuthInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OAuthInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OAuthInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OAuthInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OAuthInfoDto";
        }
    }
}
