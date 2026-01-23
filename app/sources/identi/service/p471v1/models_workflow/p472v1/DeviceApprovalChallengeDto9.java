package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.SheriffChallengeDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DeviceApprovalChallengeDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006*"}, m3636d2 = {"identi/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "sheriff_challenge", "", "sheriff_flow_id", "fallback_cta_text", "(Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;", "getSheriff_challenge", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "getSheriff_flow_id", "getFallback_cta_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto, reason: use source file name */
/* loaded from: classes21.dex */
public final class DeviceApprovalChallengeDto9 implements Dto3<DeviceApprovalChallenge$ScreenParams>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceApprovalChallengeDto9> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceApprovalChallengeDto9, DeviceApprovalChallenge$ScreenParams>> binaryBase64Serializer$delegate;
    private static final DeviceApprovalChallengeDto9 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceApprovalChallengeDto9(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceApprovalChallengeDto9(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SheriffChallengeDto getSheriff_challenge() {
        return this.surrogate.getSheriff_challenge();
    }

    public final String getSheriff_flow_id() {
        return this.surrogate.getSheriff_flow_id();
    }

    public final String getFallback_cta_text() {
        return this.surrogate.getFallback_cta_text();
    }

    public /* synthetic */ DeviceApprovalChallengeDto9(SheriffChallengeDto sheriffChallengeDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sheriffChallengeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceApprovalChallengeDto9(SheriffChallengeDto sheriffChallengeDto, String sheriff_flow_id, String str) {
        this(new Surrogate(sheriffChallengeDto, sheriff_flow_id, str));
        Intrinsics.checkNotNullParameter(sheriff_flow_id, "sheriff_flow_id");
    }

    @Override // com.robinhood.idl.Dto
    public DeviceApprovalChallenge$ScreenParams toProto() {
        SheriffChallengeDto sheriff_challenge = this.surrogate.getSheriff_challenge();
        return new DeviceApprovalChallenge$ScreenParams(sheriff_challenge != null ? sheriff_challenge.toProto() : null, this.surrogate.getSheriff_flow_id(), this.surrogate.getFallback_cta_text(), null, 8, null);
    }

    public String toString() {
        return "[ScreenParamsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceApprovalChallengeDto9) && Intrinsics.areEqual(((DeviceApprovalChallengeDto9) other).surrogate, this.surrogate);
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
    /* compiled from: DeviceApprovalChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "sheriff_challenge", "", "sheriff_flow_id", "fallback_cta_text", "<init>", "(Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/SheriffChallengeDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "getSheriff_challenge", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "getSheriff_challenge$annotations", "()V", "Ljava/lang/String;", "getSheriff_flow_id", "getSheriff_flow_id$annotations", "getFallback_cta_text", "getFallback_cta_text$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String fallback_cta_text;
        private final SheriffChallengeDto sheriff_challenge;
        private final String sheriff_flow_id;

        public Surrogate() {
            this((SheriffChallengeDto) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.sheriff_challenge, surrogate.sheriff_challenge) && Intrinsics.areEqual(this.sheriff_flow_id, surrogate.sheriff_flow_id) && Intrinsics.areEqual(this.fallback_cta_text, surrogate.fallback_cta_text);
        }

        public int hashCode() {
            SheriffChallengeDto sheriffChallengeDto = this.sheriff_challenge;
            int iHashCode = (((sheriffChallengeDto == null ? 0 : sheriffChallengeDto.hashCode()) * 31) + this.sheriff_flow_id.hashCode()) * 31;
            String str = this.fallback_cta_text;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(sheriff_challenge=" + this.sheriff_challenge + ", sheriff_flow_id=" + this.sheriff_flow_id + ", fallback_cta_text=" + this.fallback_cta_text + ")";
        }

        /* compiled from: DeviceApprovalChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceApprovalChallengeDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SheriffChallengeDto sheriffChallengeDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.sheriff_challenge = null;
            } else {
                this.sheriff_challenge = sheriffChallengeDto;
            }
            if ((i & 2) == 0) {
                this.sheriff_flow_id = "";
            } else {
                this.sheriff_flow_id = str;
            }
            if ((i & 4) == 0) {
                this.fallback_cta_text = null;
            } else {
                this.fallback_cta_text = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SheriffChallengeDto sheriffChallengeDto = self.sheriff_challenge;
            if (sheriffChallengeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SheriffChallengeDto.Serializer.INSTANCE, sheriffChallengeDto);
            }
            if (!Intrinsics.areEqual(self.sheriff_flow_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.sheriff_flow_id);
            }
            String str = self.fallback_cta_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(SheriffChallengeDto sheriffChallengeDto, String sheriff_flow_id, String str) {
            Intrinsics.checkNotNullParameter(sheriff_flow_id, "sheriff_flow_id");
            this.sheriff_challenge = sheriffChallengeDto;
            this.sheriff_flow_id = sheriff_flow_id;
            this.fallback_cta_text = str;
        }

        public final SheriffChallengeDto getSheriff_challenge() {
            return this.sheriff_challenge;
        }

        public final String getSheriff_flow_id() {
            return this.sheriff_flow_id;
        }

        public /* synthetic */ Surrogate(SheriffChallengeDto sheriffChallengeDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sheriffChallengeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
        }

        public final String getFallback_cta_text() {
            return this.fallback_cta_text;
        }
    }

    /* compiled from: DeviceApprovalChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<DeviceApprovalChallengeDto9, DeviceApprovalChallenge$ScreenParams> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceApprovalChallengeDto9> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceApprovalChallengeDto9> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceApprovalChallengeDto9> getBinaryBase64Serializer() {
            return (KSerializer) DeviceApprovalChallengeDto9.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceApprovalChallenge$ScreenParams> getProtoAdapter() {
            return DeviceApprovalChallenge$ScreenParams.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceApprovalChallengeDto9 getZeroValue() {
            return DeviceApprovalChallengeDto9.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceApprovalChallengeDto9 fromProto(DeviceApprovalChallenge$ScreenParams proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SheriffChallenge sheriff_challenge = proto.getSheriff_challenge();
            return new DeviceApprovalChallengeDto9(new Surrogate(sheriff_challenge != null ? SheriffChallengeDto.INSTANCE.fromProto(sheriff_challenge) : null, proto.getSheriff_flow_id(), proto.getFallback_cta_text()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceApprovalChallengeDto9.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceApprovalChallengeDto9(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DeviceApprovalChallengeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$Serializer */
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<DeviceApprovalChallengeDto9> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.DeviceApprovalChallenge.ScreenParams", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceApprovalChallengeDto9 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceApprovalChallengeDto9 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceApprovalChallengeDto9((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DeviceApprovalChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.DeviceApprovalChallengeDto$ScreenParamsDto";
        }
    }
}
