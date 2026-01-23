package midas.service.p509v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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
import midas.service.p509v1.AgreementDto;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: GoldSweepAgreementsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¹\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.¨\u00063"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto;", "Lcom/robinhood/idl/MessageDto;", "Lmidas/service/v1/GoldSweepAgreements;", "Landroid/os/Parcelable;", "Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;", "surrogate", "<init>", "(Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;)V", "", "title", "description", "gold_title", "gold_description_markdown", "gold_description_cta", "Lmidas/service/v1/AgreementDto;", "gold_full_agreement", "sweep_title", "sweep_description_markdown", "sweep_description_cta", "sweep_full_agreement", "disclaimer_markdown", "cta_text", "secondary_cta_text", "web_sidebar_title", "web_sidebar_description", "web_sidebar_infotag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmidas/service/v1/GoldSweepAgreements;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GoldSweepAgreementsDto implements Dto3<GoldSweepAgreements>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GoldSweepAgreementsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GoldSweepAgreementsDto, GoldSweepAgreements>> binaryBase64Serializer$delegate;
    private static final GoldSweepAgreementsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GoldSweepAgreementsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GoldSweepAgreementsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GoldSweepAgreementsDto(String str, String str2, String str3, String str4, String str5, AgreementDto agreementDto, String str6, String str7, String str8, AgreementDto agreementDto2, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : agreementDto, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : agreementDto2, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldSweepAgreementsDto(String title, String description, String gold_title, String gold_description_markdown, String str, AgreementDto agreementDto, String sweep_title, String sweep_description_markdown, String str2, AgreementDto agreementDto2, String disclaimer_markdown, String cta_text, String str3, String str4, String str5, String str6) {
        this(new Surrogate(title, description, gold_title, gold_description_markdown, str, agreementDto, sweep_title, sweep_description_markdown, str2, agreementDto2, disclaimer_markdown, cta_text, str3, str4, str5, str6));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(gold_title, "gold_title");
        Intrinsics.checkNotNullParameter(gold_description_markdown, "gold_description_markdown");
        Intrinsics.checkNotNullParameter(sweep_title, "sweep_title");
        Intrinsics.checkNotNullParameter(sweep_description_markdown, "sweep_description_markdown");
        Intrinsics.checkNotNullParameter(disclaimer_markdown, "disclaimer_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
    }

    @Override // com.robinhood.idl.Dto
    public GoldSweepAgreements toProto() {
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        String gold_title = this.surrogate.getGold_title();
        String gold_description_markdown = this.surrogate.getGold_description_markdown();
        String gold_description_cta = this.surrogate.getGold_description_cta();
        AgreementDto gold_full_agreement = this.surrogate.getGold_full_agreement();
        Agreement proto = gold_full_agreement != null ? gold_full_agreement.toProto() : null;
        String sweep_title = this.surrogate.getSweep_title();
        String sweep_description_markdown = this.surrogate.getSweep_description_markdown();
        String sweep_description_cta = this.surrogate.getSweep_description_cta();
        AgreementDto sweep_full_agreement = this.surrogate.getSweep_full_agreement();
        return new GoldSweepAgreements(title, description, gold_title, gold_description_markdown, gold_description_cta, proto, sweep_title, sweep_description_markdown, sweep_description_cta, sweep_full_agreement != null ? sweep_full_agreement.toProto() : null, this.surrogate.getDisclaimer_markdown(), this.surrogate.getCta_text(), this.surrogate.getSecondary_cta_text(), this.surrogate.getWeb_sidebar_title(), this.surrogate.getWeb_sidebar_description(), this.surrogate.getWeb_sidebar_infotag(), null, 65536, null);
    }

    public String toString() {
        return "[GoldSweepAgreementsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GoldSweepAgreementsDto) && Intrinsics.areEqual(((GoldSweepAgreementsDto) other).surrogate, this.surrogate);
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
    /* compiled from: GoldSweepAgreementsDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B»\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010%R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b?\u0010/\u001a\u0004\b>\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010:R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010,\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010%R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010,\u0012\u0004\bG\u0010/\u001a\u0004\bF\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010,\u0012\u0004\bI\u0010/\u001a\u0004\bH\u0010%R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010,\u0012\u0004\bK\u0010/\u001a\u0004\bJ\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010,\u0012\u0004\bM\u0010/\u001a\u0004\bL\u0010%R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\bO\u0010/\u001a\u0004\bN\u0010%¨\u0006R"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;", "", "", "title", "description", "gold_title", "gold_description_markdown", "gold_description_cta", "Lmidas/service/v1/AgreementDto;", "gold_full_agreement", "sweep_title", "sweep_description_markdown", "sweep_description_cta", "sweep_full_agreement", "disclaimer_markdown", "cta_text", "secondary_cta_text", "web_sidebar_title", "web_sidebar_description", "web_sidebar_infotag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$midas_service_v1_externalRelease", "(Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getGold_title", "getGold_title$annotations", "getGold_description_markdown", "getGold_description_markdown$annotations", "getGold_description_cta", "getGold_description_cta$annotations", "Lmidas/service/v1/AgreementDto;", "getGold_full_agreement", "()Lmidas/service/v1/AgreementDto;", "getGold_full_agreement$annotations", "getSweep_title", "getSweep_title$annotations", "getSweep_description_markdown", "getSweep_description_markdown$annotations", "getSweep_description_cta", "getSweep_description_cta$annotations", "getSweep_full_agreement", "getSweep_full_agreement$annotations", "getDisclaimer_markdown", "getDisclaimer_markdown$annotations", "getCta_text", "getCta_text$annotations", "getSecondary_cta_text", "getSecondary_cta_text$annotations", "getWeb_sidebar_title", "getWeb_sidebar_title$annotations", "getWeb_sidebar_description", "getWeb_sidebar_description$annotations", "getWeb_sidebar_infotag", "getWeb_sidebar_infotag$annotations", "Companion", "$serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String cta_text;
        private final String description;
        private final String disclaimer_markdown;
        private final String gold_description_cta;
        private final String gold_description_markdown;
        private final AgreementDto gold_full_agreement;
        private final String gold_title;
        private final String secondary_cta_text;
        private final String sweep_description_cta;
        private final String sweep_description_markdown;
        private final AgreementDto sweep_full_agreement;
        private final String sweep_title;
        private final String title;
        private final String web_sidebar_description;
        private final String web_sidebar_infotag;
        private final String web_sidebar_title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (AgreementDto) null, (String) null, (String) null, (String) null, (AgreementDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.gold_title, surrogate.gold_title) && Intrinsics.areEqual(this.gold_description_markdown, surrogate.gold_description_markdown) && Intrinsics.areEqual(this.gold_description_cta, surrogate.gold_description_cta) && Intrinsics.areEqual(this.gold_full_agreement, surrogate.gold_full_agreement) && Intrinsics.areEqual(this.sweep_title, surrogate.sweep_title) && Intrinsics.areEqual(this.sweep_description_markdown, surrogate.sweep_description_markdown) && Intrinsics.areEqual(this.sweep_description_cta, surrogate.sweep_description_cta) && Intrinsics.areEqual(this.sweep_full_agreement, surrogate.sweep_full_agreement) && Intrinsics.areEqual(this.disclaimer_markdown, surrogate.disclaimer_markdown) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text) && Intrinsics.areEqual(this.secondary_cta_text, surrogate.secondary_cta_text) && Intrinsics.areEqual(this.web_sidebar_title, surrogate.web_sidebar_title) && Intrinsics.areEqual(this.web_sidebar_description, surrogate.web_sidebar_description) && Intrinsics.areEqual(this.web_sidebar_infotag, surrogate.web_sidebar_infotag);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.gold_title.hashCode()) * 31) + this.gold_description_markdown.hashCode()) * 31;
            String str = this.gold_description_cta;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AgreementDto agreementDto = this.gold_full_agreement;
            int iHashCode3 = (((((iHashCode2 + (agreementDto == null ? 0 : agreementDto.hashCode())) * 31) + this.sweep_title.hashCode()) * 31) + this.sweep_description_markdown.hashCode()) * 31;
            String str2 = this.sweep_description_cta;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AgreementDto agreementDto2 = this.sweep_full_agreement;
            int iHashCode5 = (((((iHashCode4 + (agreementDto2 == null ? 0 : agreementDto2.hashCode())) * 31) + this.disclaimer_markdown.hashCode()) * 31) + this.cta_text.hashCode()) * 31;
            String str3 = this.secondary_cta_text;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.web_sidebar_title;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.web_sidebar_description;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.web_sidebar_infotag;
            return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", gold_title=" + this.gold_title + ", gold_description_markdown=" + this.gold_description_markdown + ", gold_description_cta=" + this.gold_description_cta + ", gold_full_agreement=" + this.gold_full_agreement + ", sweep_title=" + this.sweep_title + ", sweep_description_markdown=" + this.sweep_description_markdown + ", sweep_description_cta=" + this.sweep_description_cta + ", sweep_full_agreement=" + this.sweep_full_agreement + ", disclaimer_markdown=" + this.disclaimer_markdown + ", cta_text=" + this.cta_text + ", secondary_cta_text=" + this.secondary_cta_text + ", web_sidebar_title=" + this.web_sidebar_title + ", web_sidebar_description=" + this.web_sidebar_description + ", web_sidebar_infotag=" + this.web_sidebar_infotag + ")";
        }

        /* compiled from: GoldSweepAgreementsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GoldSweepAgreementsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, AgreementDto agreementDto, String str6, String str7, String str8, AgreementDto agreementDto2, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.gold_title = "";
            } else {
                this.gold_title = str3;
            }
            if ((i & 8) == 0) {
                this.gold_description_markdown = "";
            } else {
                this.gold_description_markdown = str4;
            }
            if ((i & 16) == 0) {
                this.gold_description_cta = null;
            } else {
                this.gold_description_cta = str5;
            }
            if ((i & 32) == 0) {
                this.gold_full_agreement = null;
            } else {
                this.gold_full_agreement = agreementDto;
            }
            if ((i & 64) == 0) {
                this.sweep_title = "";
            } else {
                this.sweep_title = str6;
            }
            if ((i & 128) == 0) {
                this.sweep_description_markdown = "";
            } else {
                this.sweep_description_markdown = str7;
            }
            if ((i & 256) == 0) {
                this.sweep_description_cta = null;
            } else {
                this.sweep_description_cta = str8;
            }
            if ((i & 512) == 0) {
                this.sweep_full_agreement = null;
            } else {
                this.sweep_full_agreement = agreementDto2;
            }
            if ((i & 1024) == 0) {
                this.disclaimer_markdown = "";
            } else {
                this.disclaimer_markdown = str9;
            }
            if ((i & 2048) == 0) {
                this.cta_text = "";
            } else {
                this.cta_text = str10;
            }
            if ((i & 4096) == 0) {
                this.secondary_cta_text = null;
            } else {
                this.secondary_cta_text = str11;
            }
            if ((i & 8192) == 0) {
                this.web_sidebar_title = null;
            } else {
                this.web_sidebar_title = str12;
            }
            if ((i & 16384) == 0) {
                this.web_sidebar_description = null;
            } else {
                this.web_sidebar_description = str13;
            }
            if ((i & 32768) == 0) {
                this.web_sidebar_infotag = null;
            } else {
                this.web_sidebar_infotag = str14;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$midas_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            if (!Intrinsics.areEqual(self.gold_title, "")) {
                output.encodeStringElement(serialDesc, 2, self.gold_title);
            }
            if (!Intrinsics.areEqual(self.gold_description_markdown, "")) {
                output.encodeStringElement(serialDesc, 3, self.gold_description_markdown);
            }
            String str = self.gold_description_cta;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            AgreementDto agreementDto = self.gold_full_agreement;
            if (agreementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AgreementDto.Serializer.INSTANCE, agreementDto);
            }
            if (!Intrinsics.areEqual(self.sweep_title, "")) {
                output.encodeStringElement(serialDesc, 6, self.sweep_title);
            }
            if (!Intrinsics.areEqual(self.sweep_description_markdown, "")) {
                output.encodeStringElement(serialDesc, 7, self.sweep_description_markdown);
            }
            String str2 = self.sweep_description_cta;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str2);
            }
            AgreementDto agreementDto2 = self.sweep_full_agreement;
            if (agreementDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, AgreementDto.Serializer.INSTANCE, agreementDto2);
            }
            if (!Intrinsics.areEqual(self.disclaimer_markdown, "")) {
                output.encodeStringElement(serialDesc, 10, self.disclaimer_markdown);
            }
            if (!Intrinsics.areEqual(self.cta_text, "")) {
                output.encodeStringElement(serialDesc, 11, self.cta_text);
            }
            String str3 = self.secondary_cta_text;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.web_sidebar_title;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.web_sidebar_description;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.web_sidebar_infotag;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, str6);
            }
        }

        public Surrogate(String title, String description, String gold_title, String gold_description_markdown, String str, AgreementDto agreementDto, String sweep_title, String sweep_description_markdown, String str2, AgreementDto agreementDto2, String disclaimer_markdown, String cta_text, String str3, String str4, String str5, String str6) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(gold_title, "gold_title");
            Intrinsics.checkNotNullParameter(gold_description_markdown, "gold_description_markdown");
            Intrinsics.checkNotNullParameter(sweep_title, "sweep_title");
            Intrinsics.checkNotNullParameter(sweep_description_markdown, "sweep_description_markdown");
            Intrinsics.checkNotNullParameter(disclaimer_markdown, "disclaimer_markdown");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            this.title = title;
            this.description = description;
            this.gold_title = gold_title;
            this.gold_description_markdown = gold_description_markdown;
            this.gold_description_cta = str;
            this.gold_full_agreement = agreementDto;
            this.sweep_title = sweep_title;
            this.sweep_description_markdown = sweep_description_markdown;
            this.sweep_description_cta = str2;
            this.sweep_full_agreement = agreementDto2;
            this.disclaimer_markdown = disclaimer_markdown;
            this.cta_text = cta_text;
            this.secondary_cta_text = str3;
            this.web_sidebar_title = str4;
            this.web_sidebar_description = str5;
            this.web_sidebar_infotag = str6;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, AgreementDto agreementDto, String str6, String str7, String str8, AgreementDto agreementDto2, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : agreementDto, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : agreementDto2, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getGold_title() {
            return this.gold_title;
        }

        public final String getGold_description_markdown() {
            return this.gold_description_markdown;
        }

        public final String getGold_description_cta() {
            return this.gold_description_cta;
        }

        public final AgreementDto getGold_full_agreement() {
            return this.gold_full_agreement;
        }

        public final String getSweep_title() {
            return this.sweep_title;
        }

        public final String getSweep_description_markdown() {
            return this.sweep_description_markdown;
        }

        public final String getSweep_description_cta() {
            return this.sweep_description_cta;
        }

        public final AgreementDto getSweep_full_agreement() {
            return this.sweep_full_agreement;
        }

        public final String getDisclaimer_markdown() {
            return this.disclaimer_markdown;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        public final String getSecondary_cta_text() {
            return this.secondary_cta_text;
        }

        public final String getWeb_sidebar_title() {
            return this.web_sidebar_title;
        }

        public final String getWeb_sidebar_description() {
            return this.web_sidebar_description;
        }

        public final String getWeb_sidebar_infotag() {
            return this.web_sidebar_infotag;
        }
    }

    /* compiled from: GoldSweepAgreementsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmidas/service/v1/GoldSweepAgreementsDto;", "Lmidas/service/v1/GoldSweepAgreements;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmidas/service/v1/GoldSweepAgreementsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GoldSweepAgreementsDto, GoldSweepAgreements> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldSweepAgreementsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldSweepAgreementsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldSweepAgreementsDto> getBinaryBase64Serializer() {
            return (KSerializer) GoldSweepAgreementsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GoldSweepAgreements> getProtoAdapter() {
            return GoldSweepAgreements.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldSweepAgreementsDto getZeroValue() {
            return GoldSweepAgreementsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldSweepAgreementsDto fromProto(GoldSweepAgreements proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description = proto.getDescription();
            String gold_title = proto.getGold_title();
            String gold_description_markdown = proto.getGold_description_markdown();
            String gold_description_cta = proto.getGold_description_cta();
            Agreement gold_full_agreement = proto.getGold_full_agreement();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AgreementDto agreementDtoFromProto = gold_full_agreement != null ? AgreementDto.INSTANCE.fromProto(gold_full_agreement) : null;
            String sweep_title = proto.getSweep_title();
            String sweep_description_markdown = proto.getSweep_description_markdown();
            String sweep_description_cta = proto.getSweep_description_cta();
            Agreement sweep_full_agreement = proto.getSweep_full_agreement();
            return new GoldSweepAgreementsDto(new Surrogate(title, description, gold_title, gold_description_markdown, gold_description_cta, agreementDtoFromProto, sweep_title, sweep_description_markdown, sweep_description_cta, sweep_full_agreement != null ? AgreementDto.INSTANCE.fromProto(sweep_full_agreement) : null, proto.getDisclaimer_markdown(), proto.getCta_text(), proto.getSecondary_cta_text(), proto.getWeb_sidebar_title(), proto.getWeb_sidebar_description(), proto.getWeb_sidebar_infotag()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: midas.service.v1.GoldSweepAgreementsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldSweepAgreementsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GoldSweepAgreementsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GoldSweepAgreementsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/GoldSweepAgreementsDto;", "<init>", "()V", "surrogateSerializer", "Lmidas/service/v1/GoldSweepAgreementsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<GoldSweepAgreementsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/midas.service.v1.GoldSweepAgreements", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GoldSweepAgreementsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GoldSweepAgreementsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GoldSweepAgreementsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GoldSweepAgreementsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreementsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "midas.service.v1.GoldSweepAgreementsDto";
        }
    }
}
