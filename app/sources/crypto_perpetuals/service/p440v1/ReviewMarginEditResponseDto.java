package crypto_perpetuals.service.p440v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.FXFee;
import crypto_perpetuals.common.p435v1.FXFeeDto;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.FXQuoteDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.service.p440v1.ReviewMarginEditResponseDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ReviewMarginEditResponseDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;:<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bo\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001b¨\u0006>"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponse;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;)V", "", "position_id", "ref_id", "Lcrypto_perpetuals/common/v1/FXFeeDto;", "fx_fee", "Lcom/robinhood/idl/IdlDecimal;", "new_estimated_liquidation_price", "", "Lcrypto_perpetuals/common/v1/MoneyDto;", "margin_delta_breakdown", "total_margin_delta", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "fx_summary", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/FXFeeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcrypto_perpetuals/service/v1/ReviewMarginEditResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;", "getPosition_id", "getRef_id", "getFx_fee", "()Lcrypto_perpetuals/common/v1/FXFeeDto;", "getNew_estimated_liquidation_price", "()Lcom/robinhood/idl/IdlDecimal;", "getMargin_delta_breakdown", "()Ljava/util/List;", "getTotal_margin_delta", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_summary", "getDisclosure", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ReviewMarginEditResponseDto implements Dto3<ReviewMarginEditResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReviewMarginEditResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReviewMarginEditResponseDto, ReviewMarginEditResponse>> binaryBase64Serializer$delegate;
    private static final ReviewMarginEditResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReviewMarginEditResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReviewMarginEditResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final FXFeeDto getFx_fee() {
        return this.surrogate.getFx_fee();
    }

    public final IdlDecimal getNew_estimated_liquidation_price() {
        return this.surrogate.getNew_estimated_liquidation_price();
    }

    public final List<MoneyDto> getMargin_delta_breakdown() {
        return this.surrogate.getMargin_delta_breakdown();
    }

    public final MoneyDto getTotal_margin_delta() {
        return this.surrogate.getTotal_margin_delta();
    }

    public final FXQuoteDto getFx_quote() {
        return this.surrogate.getFx_quote();
    }

    public final String getFx_summary() {
        return this.surrogate.getFx_summary();
    }

    public final String getDisclosure() {
        return this.surrogate.getDisclosure();
    }

    public /* synthetic */ ReviewMarginEditResponseDto(String str, String str2, FXFeeDto fXFeeDto, IdlDecimal idlDecimal, List list, MoneyDto moneyDto, FXQuoteDto fXQuoteDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : fXFeeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : fXQuoteDto, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReviewMarginEditResponseDto(String position_id, String ref_id, FXFeeDto fXFeeDto, IdlDecimal new_estimated_liquidation_price, List<MoneyDto> margin_delta_breakdown, MoneyDto moneyDto, FXQuoteDto fXQuoteDto, String fx_summary, String disclosure) {
        this(new Surrogate(position_id, ref_id, fXFeeDto, new_estimated_liquidation_price, margin_delta_breakdown, moneyDto, fXQuoteDto, fx_summary, disclosure));
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(new_estimated_liquidation_price, "new_estimated_liquidation_price");
        Intrinsics.checkNotNullParameter(margin_delta_breakdown, "margin_delta_breakdown");
        Intrinsics.checkNotNullParameter(fx_summary, "fx_summary");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
    }

    @Override // com.robinhood.idl.Dto
    public ReviewMarginEditResponse toProto() {
        String position_id = this.surrogate.getPosition_id();
        String ref_id = this.surrogate.getRef_id();
        FXFeeDto fx_fee = this.surrogate.getFx_fee();
        FXFee proto = fx_fee != null ? fx_fee.toProto() : null;
        String stringValue = this.surrogate.getNew_estimated_liquidation_price().getStringValue();
        List<MoneyDto> margin_delta_breakdown = this.surrogate.getMargin_delta_breakdown();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_delta_breakdown, 10));
        Iterator<T> it = margin_delta_breakdown.iterator();
        while (it.hasNext()) {
            arrayList.add(((MoneyDto) it.next()).toProto());
        }
        MoneyDto total_margin_delta = this.surrogate.getTotal_margin_delta();
        Money proto2 = total_margin_delta != null ? total_margin_delta.toProto() : null;
        FXQuoteDto fx_quote = this.surrogate.getFx_quote();
        return new ReviewMarginEditResponse(position_id, ref_id, proto, stringValue, arrayList, proto2, fx_quote != null ? fx_quote.toProto() : null, this.surrogate.getFx_summary(), this.surrogate.getDisclosure(), null, 512, null);
    }

    public String toString() {
        return "[ReviewMarginEditResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReviewMarginEditResponseDto) && Intrinsics.areEqual(((ReviewMarginEditResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReviewMarginEditResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJB|\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015B{\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b5\u0010/\u001a\u0004\b3\u00104R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010/\u001a\u0004\b7\u00108R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010/\u001a\u0004\b;\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\bA\u0010/\u001a\u0004\b?\u0010@R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010B\u0012\u0004\bE\u0010/\u001a\u0004\bC\u0010DR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010,\u0012\u0004\bG\u0010/\u001a\u0004\bF\u0010%R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\bI\u0010/\u001a\u0004\bH\u0010%¨\u0006L"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;", "", "", "position_id", "ref_id", "Lcrypto_perpetuals/common/v1/FXFeeDto;", "fx_fee", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "new_estimated_liquidation_price", "", "Lcrypto_perpetuals/common/v1/MoneyDto;", "margin_delta_breakdown", "total_margin_delta", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "fx_summary", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/FXFeeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/FXFeeDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_service_v1_externalRelease", "(Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPosition_id", "getPosition_id$annotations", "()V", "getRef_id", "getRef_id$annotations", "Lcrypto_perpetuals/common/v1/FXFeeDto;", "getFx_fee", "()Lcrypto_perpetuals/common/v1/FXFeeDto;", "getFx_fee$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getNew_estimated_liquidation_price", "()Lcom/robinhood/idl/IdlDecimal;", "getNew_estimated_liquidation_price$annotations", "Ljava/util/List;", "getMargin_delta_breakdown", "()Ljava/util/List;", "getMargin_delta_breakdown$annotations", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getTotal_margin_delta", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getTotal_margin_delta$annotations", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote$annotations", "getFx_summary", "getFx_summary$annotations", "getDisclosure", "getDisclosure$annotations", "Companion", "$serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String disclosure;
        private final FXFeeDto fx_fee;
        private final FXQuoteDto fx_quote;
        private final String fx_summary;
        private final List<MoneyDto> margin_delta_breakdown;
        private final IdlDecimal new_estimated_liquidation_price;
        private final String position_id;
        private final String ref_id;
        private final MoneyDto total_margin_delta;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: crypto_perpetuals.service.v1.ReviewMarginEditResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewMarginEditResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (FXFeeDto) null, (IdlDecimal) null, (List) null, (MoneyDto) null, (FXQuoteDto) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MoneyDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.fx_fee, surrogate.fx_fee) && Intrinsics.areEqual(this.new_estimated_liquidation_price, surrogate.new_estimated_liquidation_price) && Intrinsics.areEqual(this.margin_delta_breakdown, surrogate.margin_delta_breakdown) && Intrinsics.areEqual(this.total_margin_delta, surrogate.total_margin_delta) && Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote) && Intrinsics.areEqual(this.fx_summary, surrogate.fx_summary) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure);
        }

        public int hashCode() {
            int iHashCode = ((this.position_id.hashCode() * 31) + this.ref_id.hashCode()) * 31;
            FXFeeDto fXFeeDto = this.fx_fee;
            int iHashCode2 = (((((iHashCode + (fXFeeDto == null ? 0 : fXFeeDto.hashCode())) * 31) + this.new_estimated_liquidation_price.hashCode()) * 31) + this.margin_delta_breakdown.hashCode()) * 31;
            MoneyDto moneyDto = this.total_margin_delta;
            int iHashCode3 = (iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            FXQuoteDto fXQuoteDto = this.fx_quote;
            return ((((iHashCode3 + (fXQuoteDto != null ? fXQuoteDto.hashCode() : 0)) * 31) + this.fx_summary.hashCode()) * 31) + this.disclosure.hashCode();
        }

        public String toString() {
            return "Surrogate(position_id=" + this.position_id + ", ref_id=" + this.ref_id + ", fx_fee=" + this.fx_fee + ", new_estimated_liquidation_price=" + this.new_estimated_liquidation_price + ", margin_delta_breakdown=" + this.margin_delta_breakdown + ", total_margin_delta=" + this.total_margin_delta + ", fx_quote=" + this.fx_quote + ", fx_summary=" + this.fx_summary + ", disclosure=" + this.disclosure + ")";
        }

        /* compiled from: ReviewMarginEditResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReviewMarginEditResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, FXFeeDto fXFeeDto, IdlDecimal idlDecimal, List list, MoneyDto moneyDto, FXQuoteDto fXQuoteDto, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.position_id = "";
            } else {
                this.position_id = str;
            }
            if ((i & 2) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 4) == 0) {
                this.fx_fee = null;
            } else {
                this.fx_fee = fXFeeDto;
            }
            if ((i & 8) == 0) {
                this.new_estimated_liquidation_price = new IdlDecimal("");
            } else {
                this.new_estimated_liquidation_price = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.margin_delta_breakdown = CollectionsKt.emptyList();
            } else {
                this.margin_delta_breakdown = list;
            }
            if ((i & 32) == 0) {
                this.total_margin_delta = null;
            } else {
                this.total_margin_delta = moneyDto;
            }
            if ((i & 64) == 0) {
                this.fx_quote = null;
            } else {
                this.fx_quote = fXQuoteDto;
            }
            if ((i & 128) == 0) {
                this.fx_summary = "";
            } else {
                this.fx_summary = str3;
            }
            if ((i & 256) == 0) {
                this.disclosure = "";
            } else {
                this.disclosure = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.position_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.position_id);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.ref_id);
            }
            FXFeeDto fXFeeDto = self.fx_fee;
            if (fXFeeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FXFeeDto.Serializer.INSTANCE, fXFeeDto);
            }
            if (!Intrinsics.areEqual(self.new_estimated_liquidation_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.new_estimated_liquidation_price);
            }
            if (!Intrinsics.areEqual(self.margin_delta_breakdown, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.margin_delta_breakdown);
            }
            MoneyDto moneyDto = self.total_margin_delta;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            FXQuoteDto fXQuoteDto = self.fx_quote;
            if (fXQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, FXQuoteDto.Serializer.INSTANCE, fXQuoteDto);
            }
            if (!Intrinsics.areEqual(self.fx_summary, "")) {
                output.encodeStringElement(serialDesc, 7, self.fx_summary);
            }
            if (Intrinsics.areEqual(self.disclosure, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.disclosure);
        }

        public Surrogate(String position_id, String ref_id, FXFeeDto fXFeeDto, IdlDecimal new_estimated_liquidation_price, List<MoneyDto> margin_delta_breakdown, MoneyDto moneyDto, FXQuoteDto fXQuoteDto, String fx_summary, String disclosure) {
            Intrinsics.checkNotNullParameter(position_id, "position_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(new_estimated_liquidation_price, "new_estimated_liquidation_price");
            Intrinsics.checkNotNullParameter(margin_delta_breakdown, "margin_delta_breakdown");
            Intrinsics.checkNotNullParameter(fx_summary, "fx_summary");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.position_id = position_id;
            this.ref_id = ref_id;
            this.fx_fee = fXFeeDto;
            this.new_estimated_liquidation_price = new_estimated_liquidation_price;
            this.margin_delta_breakdown = margin_delta_breakdown;
            this.total_margin_delta = moneyDto;
            this.fx_quote = fXQuoteDto;
            this.fx_summary = fx_summary;
            this.disclosure = disclosure;
        }

        public /* synthetic */ Surrogate(String str, String str2, FXFeeDto fXFeeDto, IdlDecimal idlDecimal, List list, MoneyDto moneyDto, FXQuoteDto fXQuoteDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : fXFeeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : fXQuoteDto, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
        }

        public final String getPosition_id() {
            return this.position_id;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final FXFeeDto getFx_fee() {
            return this.fx_fee;
        }

        public final IdlDecimal getNew_estimated_liquidation_price() {
            return this.new_estimated_liquidation_price;
        }

        public final List<MoneyDto> getMargin_delta_breakdown() {
            return this.margin_delta_breakdown;
        }

        public final MoneyDto getTotal_margin_delta() {
            return this.total_margin_delta;
        }

        public final FXQuoteDto getFx_quote() {
            return this.fx_quote;
        }

        public final String getFx_summary() {
            return this.fx_summary;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }
    }

    /* compiled from: ReviewMarginEditResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ReviewMarginEditResponseDto, ReviewMarginEditResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReviewMarginEditResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReviewMarginEditResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReviewMarginEditResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) ReviewMarginEditResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReviewMarginEditResponse> getProtoAdapter() {
            return ReviewMarginEditResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReviewMarginEditResponseDto getZeroValue() {
            return ReviewMarginEditResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReviewMarginEditResponseDto fromProto(ReviewMarginEditResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String position_id = proto.getPosition_id();
            String ref_id = proto.getRef_id();
            FXFee fx_fee = proto.getFx_fee();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FXFeeDto fXFeeDtoFromProto = fx_fee != null ? FXFeeDto.INSTANCE.fromProto(fx_fee) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getNew_estimated_liquidation_price());
            List<Money> margin_delta_breakdown = proto.getMargin_delta_breakdown();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_delta_breakdown, 10));
            Iterator<T> it = margin_delta_breakdown.iterator();
            while (it.hasNext()) {
                arrayList.add(MoneyDto.INSTANCE.fromProto((Money) it.next()));
            }
            Money total_margin_delta = proto.getTotal_margin_delta();
            MoneyDto moneyDtoFromProto = total_margin_delta != null ? MoneyDto.INSTANCE.fromProto(total_margin_delta) : null;
            FXQuote fx_quote = proto.getFx_quote();
            return new ReviewMarginEditResponseDto(new Surrogate(position_id, ref_id, fXFeeDtoFromProto, idlDecimal, arrayList, moneyDtoFromProto, fx_quote != null ? FXQuoteDto.INSTANCE.fromProto(fx_quote) : null, proto.getFx_summary(), proto.getDisclosure()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.service.v1.ReviewMarginEditResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewMarginEditResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ReviewMarginEditResponseDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ReviewMarginEditResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<ReviewMarginEditResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.service.v1.ReviewMarginEditResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReviewMarginEditResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReviewMarginEditResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReviewMarginEditResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReviewMarginEditResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "crypto_perpetuals.service.v1.ReviewMarginEditResponseDto";
        }
    }
}
