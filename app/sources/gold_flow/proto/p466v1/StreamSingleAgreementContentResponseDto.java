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
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.CtaDto;
import gold_flow.proto.p466v1.FullAgreementDto;
import gold_flow.proto.p466v1.WebSidebarContentDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: StreamSingleAgreementContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016¨\u0006+"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;)V", "Lgold_flow/proto/v1/FullAgreementDto;", "agreement", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", "", "request_id", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "(Lgold_flow/proto/v1/FullAgreementDto;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;", "getRequest_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class StreamSingleAgreementContentResponseDto implements Dto3<StreamSingleAgreementContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamSingleAgreementContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamSingleAgreementContentResponseDto, StreamSingleAgreementContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamSingleAgreementContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamSingleAgreementContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamSingleAgreementContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRequest_id() {
        return this.surrogate.getRequest_id();
    }

    public /* synthetic */ StreamSingleAgreementContentResponseDto(FullAgreementDto fullAgreementDto, CtaDto ctaDto, Boolean bool, String str, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fullAgreementDto, (i & 2) != 0 ? null : ctaDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : webSidebarContentDto);
    }

    public StreamSingleAgreementContentResponseDto(FullAgreementDto fullAgreementDto, CtaDto ctaDto, Boolean bool, String str, WebSidebarContentDto webSidebarContentDto) {
        this(new Surrogate(fullAgreementDto, ctaDto, bool, str, webSidebarContentDto));
    }

    @Override // com.robinhood.idl.Dto
    public StreamSingleAgreementContentResponse toProto() {
        FullAgreementDto agreement = this.surrogate.getAgreement();
        FullAgreement proto = agreement != null ? agreement.toProto() : null;
        CtaDto cta = this.surrogate.getCta();
        Cta proto2 = cta != null ? cta.toProto() : null;
        Boolean disable_sparkle_button_styling = this.surrogate.getDisable_sparkle_button_styling();
        String request_id = this.surrogate.getRequest_id();
        WebSidebarContentDto web_sidebar_content = this.surrogate.getWeb_sidebar_content();
        return new StreamSingleAgreementContentResponse(proto, proto2, disable_sparkle_button_styling, request_id, web_sidebar_content != null ? web_sidebar_content.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[StreamSingleAgreementContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamSingleAgreementContentResponseDto) && Intrinsics.areEqual(((StreamSingleAgreementContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamSingleAgreementContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010'\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;", "", "Lgold_flow/proto/v1/FullAgreementDto;", "agreement", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", "", "request_id", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "<init>", "(Lgold_flow/proto/v1/FullAgreementDto;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgold_flow/proto/v1/FullAgreementDto;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/FullAgreementDto;", "getAgreement", "()Lgold_flow/proto/v1/FullAgreementDto;", "getAgreement$annotations", "()V", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "Ljava/lang/Boolean;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "getDisable_sparkle_button_styling$annotations", "Ljava/lang/String;", "getRequest_id", "getRequest_id$annotations", "Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FullAgreementDto agreement;
        private final CtaDto cta;
        private final Boolean disable_sparkle_button_styling;
        private final String request_id;
        private final WebSidebarContentDto web_sidebar_content;

        public Surrogate() {
            this((FullAgreementDto) null, (CtaDto) null, (Boolean) null, (String) null, (WebSidebarContentDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.agreement, surrogate.agreement) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, surrogate.disable_sparkle_button_styling) && Intrinsics.areEqual(this.request_id, surrogate.request_id) && Intrinsics.areEqual(this.web_sidebar_content, surrogate.web_sidebar_content);
        }

        public int hashCode() {
            FullAgreementDto fullAgreementDto = this.agreement;
            int iHashCode = (fullAgreementDto == null ? 0 : fullAgreementDto.hashCode()) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode2 = (iHashCode + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            Boolean bool = this.disable_sparkle_button_styling;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.request_id;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            WebSidebarContentDto webSidebarContentDto = this.web_sidebar_content;
            return iHashCode4 + (webSidebarContentDto != null ? webSidebarContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(agreement=" + this.agreement + ", cta=" + this.cta + ", disable_sparkle_button_styling=" + this.disable_sparkle_button_styling + ", request_id=" + this.request_id + ", web_sidebar_content=" + this.web_sidebar_content + ")";
        }

        /* compiled from: StreamSingleAgreementContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamSingleAgreementContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FullAgreementDto fullAgreementDto, CtaDto ctaDto, Boolean bool, String str, WebSidebarContentDto webSidebarContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.agreement = null;
            } else {
                this.agreement = fullAgreementDto;
            }
            if ((i & 2) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto;
            }
            if ((i & 4) == 0) {
                this.disable_sparkle_button_styling = null;
            } else {
                this.disable_sparkle_button_styling = bool;
            }
            if ((i & 8) == 0) {
                this.request_id = null;
            } else {
                this.request_id = str;
            }
            if ((i & 16) == 0) {
                this.web_sidebar_content = null;
            } else {
                this.web_sidebar_content = webSidebarContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FullAgreementDto fullAgreementDto = self.agreement;
            if (fullAgreementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FullAgreementDto.Serializer.INSTANCE, fullAgreementDto);
            }
            CtaDto ctaDto = self.cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            Boolean bool = self.disable_sparkle_button_styling;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
            String str = self.request_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            WebSidebarContentDto webSidebarContentDto = self.web_sidebar_content;
            if (webSidebarContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WebSidebarContentDto.Serializer.INSTANCE, webSidebarContentDto);
            }
        }

        public Surrogate(FullAgreementDto fullAgreementDto, CtaDto ctaDto, Boolean bool, String str, WebSidebarContentDto webSidebarContentDto) {
            this.agreement = fullAgreementDto;
            this.cta = ctaDto;
            this.disable_sparkle_button_styling = bool;
            this.request_id = str;
            this.web_sidebar_content = webSidebarContentDto;
        }

        public /* synthetic */ Surrogate(FullAgreementDto fullAgreementDto, CtaDto ctaDto, Boolean bool, String str, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fullAgreementDto, (i & 2) != 0 ? null : ctaDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : webSidebarContentDto);
        }

        public final FullAgreementDto getAgreement() {
            return this.agreement;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final Boolean getDisable_sparkle_button_styling() {
            return this.disable_sparkle_button_styling;
        }

        public final String getRequest_id() {
            return this.request_id;
        }

        public final WebSidebarContentDto getWeb_sidebar_content() {
            return this.web_sidebar_content;
        }
    }

    /* compiled from: StreamSingleAgreementContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamSingleAgreementContentResponseDto, StreamSingleAgreementContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamSingleAgreementContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSingleAgreementContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSingleAgreementContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamSingleAgreementContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamSingleAgreementContentResponse> getProtoAdapter() {
            return StreamSingleAgreementContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSingleAgreementContentResponseDto getZeroValue() {
            return StreamSingleAgreementContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSingleAgreementContentResponseDto fromProto(StreamSingleAgreementContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FullAgreement agreement = proto.getAgreement();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FullAgreementDto fullAgreementDtoFromProto = agreement != null ? FullAgreementDto.INSTANCE.fromProto(agreement) : null;
            Cta cta = proto.getCta();
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            Boolean disable_sparkle_button_styling = proto.getDisable_sparkle_button_styling();
            String request_id = proto.getRequest_id();
            WebSidebarContent web_sidebar_content = proto.getWeb_sidebar_content();
            return new StreamSingleAgreementContentResponseDto(new Surrogate(fullAgreementDtoFromProto, ctaDtoFromProto, disable_sparkle_button_styling, request_id, web_sidebar_content != null ? WebSidebarContentDto.INSTANCE.fromProto(web_sidebar_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamSingleAgreementContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamSingleAgreementContentResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamSingleAgreementContentResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamSingleAgreementContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamSingleAgreementContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamSingleAgreementContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamSingleAgreementContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamSingleAgreementContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamSingleAgreementContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamSingleAgreementContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamSingleAgreementContentResponseDto";
        }
    }
}
