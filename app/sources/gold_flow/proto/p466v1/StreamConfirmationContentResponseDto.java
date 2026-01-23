package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.CtaDto;
import gold_flow.proto.p466v1.GoldConfirmationAlertDto;
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

/* compiled from: StreamConfirmationContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamConfirmationContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;)V", "", "asset_path", "title", "description", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lgold_flow/proto/v1/GoldConfirmationAlertDto;", "alert", "logging_identifier", "cta_disclosure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldConfirmationAlertDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lgold_flow/proto/v1/StreamConfirmationContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class StreamConfirmationContentResponseDto implements Dto3<StreamConfirmationContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamConfirmationContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamConfirmationContentResponseDto, StreamConfirmationContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamConfirmationContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamConfirmationContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamConfirmationContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamConfirmationContentResponseDto(String str, String str2, String str3, CtaDto ctaDto, CtaDto ctaDto2, GoldConfirmationAlertDto goldConfirmationAlertDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : ctaDto, (i & 16) != 0 ? null : ctaDto2, (i & 32) != 0 ? null : goldConfirmationAlertDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }

    public StreamConfirmationContentResponseDto(String str, String str2, String str3, CtaDto ctaDto, CtaDto ctaDto2, GoldConfirmationAlertDto goldConfirmationAlertDto, String str4, String str5) {
        this(new Surrogate(str, str2, str3, ctaDto, ctaDto2, goldConfirmationAlertDto, str4, str5));
    }

    @Override // com.robinhood.idl.Dto
    public StreamConfirmationContentResponse toProto() {
        String asset_path = this.surrogate.getAsset_path();
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        CtaDto cta = this.surrogate.getCta();
        Cta proto = cta != null ? cta.toProto() : null;
        CtaDto secondary_cta = this.surrogate.getSecondary_cta();
        Cta proto2 = secondary_cta != null ? secondary_cta.toProto() : null;
        GoldConfirmationAlertDto alert = this.surrogate.getAlert();
        return new StreamConfirmationContentResponse(asset_path, title, description, proto, proto2, alert != null ? alert.toProto() : null, this.surrogate.getLogging_identifier(), this.surrogate.getCta_disclosure(), null, 256, null);
    }

    public String toString() {
        return "[StreamConfirmationContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamConfirmationContentResponseDto) && Intrinsics.areEqual(((StreamConfirmationContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamConfirmationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010%\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b:\u0010(\u001a\u0004\b9\u0010\u001e¨\u0006="}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;", "", "", "asset_path", "title", "description", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lgold_flow/proto/v1/GoldConfirmationAlertDto;", "alert", "logging_identifier", "cta_disclosure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldConfirmationAlertDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldConfirmationAlertDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsset_path", "getAsset_path$annotations", "()V", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "Lgold_flow/proto/v1/GoldConfirmationAlertDto;", "getAlert", "()Lgold_flow/proto/v1/GoldConfirmationAlertDto;", "getAlert$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "getCta_disclosure", "getCta_disclosure$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GoldConfirmationAlertDto alert;
        private final String asset_path;
        private final CtaDto cta;
        private final String cta_disclosure;
        private final String description;
        private final String logging_identifier;
        private final CtaDto secondary_cta;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (CtaDto) null, (CtaDto) null, (GoldConfirmationAlertDto) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.asset_path, surrogate.asset_path) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && Intrinsics.areEqual(this.alert, surrogate.alert) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.cta_disclosure, surrogate.cta_disclosure);
        }

        public int hashCode() {
            String str = this.asset_path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode4 = (iHashCode3 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            CtaDto ctaDto2 = this.secondary_cta;
            int iHashCode5 = (iHashCode4 + (ctaDto2 == null ? 0 : ctaDto2.hashCode())) * 31;
            GoldConfirmationAlertDto goldConfirmationAlertDto = this.alert;
            int iHashCode6 = (iHashCode5 + (goldConfirmationAlertDto == null ? 0 : goldConfirmationAlertDto.hashCode())) * 31;
            String str4 = this.logging_identifier;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cta_disclosure;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(asset_path=" + this.asset_path + ", title=" + this.title + ", description=" + this.description + ", cta=" + this.cta + ", secondary_cta=" + this.secondary_cta + ", alert=" + this.alert + ", logging_identifier=" + this.logging_identifier + ", cta_disclosure=" + this.cta_disclosure + ")";
        }

        /* compiled from: StreamConfirmationContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamConfirmationContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, CtaDto ctaDto, CtaDto ctaDto2, GoldConfirmationAlertDto goldConfirmationAlertDto, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.asset_path = null;
            } else {
                this.asset_path = str;
            }
            if ((i & 2) == 0) {
                this.title = null;
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.description = null;
            } else {
                this.description = str3;
            }
            if ((i & 8) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto;
            }
            if ((i & 16) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = ctaDto2;
            }
            if ((i & 32) == 0) {
                this.alert = null;
            } else {
                this.alert = goldConfirmationAlertDto;
            }
            if ((i & 64) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str4;
            }
            if ((i & 128) == 0) {
                this.cta_disclosure = null;
            } else {
                this.cta_disclosure = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.asset_path;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.title;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.description;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str3);
            }
            CtaDto ctaDto = self.cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            CtaDto ctaDto2 = self.secondary_cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
            GoldConfirmationAlertDto goldConfirmationAlertDto = self.alert;
            if (goldConfirmationAlertDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GoldConfirmationAlertDto.Serializer.INSTANCE, goldConfirmationAlertDto);
            }
            String str4 = self.logging_identifier;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.cta_disclosure;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str5);
            }
        }

        public Surrogate(String str, String str2, String str3, CtaDto ctaDto, CtaDto ctaDto2, GoldConfirmationAlertDto goldConfirmationAlertDto, String str4, String str5) {
            this.asset_path = str;
            this.title = str2;
            this.description = str3;
            this.cta = ctaDto;
            this.secondary_cta = ctaDto2;
            this.alert = goldConfirmationAlertDto;
            this.logging_identifier = str4;
            this.cta_disclosure = str5;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, CtaDto ctaDto, CtaDto ctaDto2, GoldConfirmationAlertDto goldConfirmationAlertDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : ctaDto, (i & 16) != 0 ? null : ctaDto2, (i & 32) != 0 ? null : goldConfirmationAlertDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
        }

        public final String getAsset_path() {
            return this.asset_path;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final CtaDto getSecondary_cta() {
            return this.secondary_cta;
        }

        public final GoldConfirmationAlertDto getAlert() {
            return this.alert;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final String getCta_disclosure() {
            return this.cta_disclosure;
        }
    }

    /* compiled from: StreamConfirmationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "Lgold_flow/proto/v1/StreamConfirmationContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamConfirmationContentResponseDto, StreamConfirmationContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamConfirmationContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamConfirmationContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamConfirmationContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamConfirmationContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamConfirmationContentResponse> getProtoAdapter() {
            return StreamConfirmationContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamConfirmationContentResponseDto getZeroValue() {
            return StreamConfirmationContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamConfirmationContentResponseDto fromProto(StreamConfirmationContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String asset_path = proto.getAsset_path();
            String title = proto.getTitle();
            String description = proto.getDescription();
            Cta cta = proto.getCta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            Cta secondary_cta = proto.getSecondary_cta();
            CtaDto ctaDtoFromProto2 = secondary_cta != null ? CtaDto.INSTANCE.fromProto(secondary_cta) : null;
            GoldConfirmationAlert alert = proto.getAlert();
            return new StreamConfirmationContentResponseDto(new Surrogate(asset_path, title, description, ctaDtoFromProto, ctaDtoFromProto2, alert != null ? GoldConfirmationAlertDto.INSTANCE.fromProto(alert) : null, proto.getLogging_identifier(), proto.getCta_disclosure()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamConfirmationContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamConfirmationContentResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamConfirmationContentResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamConfirmationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamConfirmationContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamConfirmationContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamConfirmationContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamConfirmationContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamConfirmationContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamConfirmationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamConfirmationContentResponseDto";
        }
    }
}
