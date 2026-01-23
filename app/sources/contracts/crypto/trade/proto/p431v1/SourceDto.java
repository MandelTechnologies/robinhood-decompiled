package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.Source;
import contracts.crypto.trade.proto.p431v1.SourceDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SourceDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000f! \"#$%&'()*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006/"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "SpotEditingDto", "SpotReviewDto", "SpotConfirmationDto", "TaxLotEditingDto", "TaxLotReviewDto", "TaxLotSelectionDto", "TaxLotConfirmationDto", "TokenizedStockEditingDto", "TokenizedStockReviewDto", "TokenizedStockConfirmationDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class SourceDto implements Dto3<Source>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SourceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SourceDto, Source>> binaryBase64Serializer$delegate;
    private static final SourceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SourceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SourceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SourceDto(TypeDto typeDto) {
        TypeDto.SpotEditing spotEditing = typeDto instanceof TypeDto.SpotEditing ? (TypeDto.SpotEditing) typeDto : null;
        SpotEditingDto value = spotEditing != null ? spotEditing.getValue() : null;
        TypeDto.SpotReview spotReview = typeDto instanceof TypeDto.SpotReview ? (TypeDto.SpotReview) typeDto : null;
        SpotReviewDto value2 = spotReview != null ? spotReview.getValue() : null;
        TypeDto.SpotConfirmation spotConfirmation = typeDto instanceof TypeDto.SpotConfirmation ? (TypeDto.SpotConfirmation) typeDto : null;
        SpotConfirmationDto value3 = spotConfirmation != null ? spotConfirmation.getValue() : null;
        TypeDto.TaxLotEditing taxLotEditing = typeDto instanceof TypeDto.TaxLotEditing ? (TypeDto.TaxLotEditing) typeDto : null;
        TaxLotEditingDto value4 = taxLotEditing != null ? taxLotEditing.getValue() : null;
        TypeDto.TaxLotReview taxLotReview = typeDto instanceof TypeDto.TaxLotReview ? (TypeDto.TaxLotReview) typeDto : null;
        TaxLotReviewDto value5 = taxLotReview != null ? taxLotReview.getValue() : null;
        TypeDto.TaxLotSelection taxLotSelection = typeDto instanceof TypeDto.TaxLotSelection ? (TypeDto.TaxLotSelection) typeDto : null;
        TaxLotSelectionDto value6 = taxLotSelection != null ? taxLotSelection.getValue() : null;
        TypeDto.TaxLotConfirmation taxLotConfirmation = typeDto instanceof TypeDto.TaxLotConfirmation ? (TypeDto.TaxLotConfirmation) typeDto : null;
        TaxLotConfirmationDto value7 = taxLotConfirmation != null ? taxLotConfirmation.getValue() : null;
        TypeDto.TokenizedStockEditing tokenizedStockEditing = typeDto instanceof TypeDto.TokenizedStockEditing ? (TypeDto.TokenizedStockEditing) typeDto : null;
        TokenizedStockEditingDto value8 = tokenizedStockEditing != null ? tokenizedStockEditing.getValue() : null;
        TypeDto.TokenizedStockReview tokenizedStockReview = typeDto instanceof TypeDto.TokenizedStockReview ? (TypeDto.TokenizedStockReview) typeDto : null;
        TokenizedStockReviewDto value9 = tokenizedStockReview != null ? tokenizedStockReview.getValue() : null;
        TypeDto.TokenizedStockConfirmation tokenizedStockConfirmation = typeDto instanceof TypeDto.TokenizedStockConfirmation ? (TypeDto.TokenizedStockConfirmation) typeDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, value6, value7, value8, value9, tokenizedStockConfirmation != null ? tokenizedStockConfirmation.getValue() : null));
    }

    public /* synthetic */ SourceDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public Source toProto() {
        SpotEditingDto spot_editing = this.surrogate.getSpot_editing();
        Source.SpotEditing proto = spot_editing != null ? spot_editing.toProto() : null;
        SpotReviewDto spot_review = this.surrogate.getSpot_review();
        Source.SpotReview proto2 = spot_review != null ? spot_review.toProto() : null;
        SpotConfirmationDto spot_confirmation = this.surrogate.getSpot_confirmation();
        Source.SpotConfirmation proto3 = spot_confirmation != null ? spot_confirmation.toProto() : null;
        TaxLotEditingDto tax_lot_editing = this.surrogate.getTax_lot_editing();
        Source.TaxLotEditing proto4 = tax_lot_editing != null ? tax_lot_editing.toProto() : null;
        TaxLotReviewDto tax_lot_review = this.surrogate.getTax_lot_review();
        Source.TaxLotReview proto5 = tax_lot_review != null ? tax_lot_review.toProto() : null;
        TaxLotSelectionDto tax_lot_selection = this.surrogate.getTax_lot_selection();
        Source.TaxLotSelection proto6 = tax_lot_selection != null ? tax_lot_selection.toProto() : null;
        TaxLotConfirmationDto tax_lot_confirmation = this.surrogate.getTax_lot_confirmation();
        Source.TaxLotConfirmation proto7 = tax_lot_confirmation != null ? tax_lot_confirmation.toProto() : null;
        TokenizedStockEditingDto tokenized_stock_editing = this.surrogate.getTokenized_stock_editing();
        Source.TokenizedStockEditing proto8 = tokenized_stock_editing != null ? tokenized_stock_editing.toProto() : null;
        TokenizedStockReviewDto tokenized_stock_review = this.surrogate.getTokenized_stock_review();
        Source.TokenizedStockReview proto9 = tokenized_stock_review != null ? tokenized_stock_review.toProto() : null;
        TokenizedStockConfirmationDto tokenized_stock_confirmation = this.surrogate.getTokenized_stock_confirmation();
        return new Source(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, tokenized_stock_confirmation != null ? tokenized_stock_confirmation.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[SourceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SourceDto) && Intrinsics.areEqual(((SourceDto) other).surrogate, this.surrogate);
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
    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b.\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u007f\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00103\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u00103\u001a\u0004\bM\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bS\u00103\u001a\u0004\bQ\u0010RR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010T\u0012\u0004\bW\u00103\u001a\u0004\bU\u0010V¨\u0006Z"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "spot_editing", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "spot_review", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "spot_confirmation", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "tax_lot_editing", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "tax_lot_review", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "tax_lot_selection", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "tax_lot_confirmation", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "tokenized_stock_editing", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "tokenized_stock_review", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "tokenized_stock_confirmation", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "getSpot_editing", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "getSpot_editing$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "getSpot_review", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "getSpot_review$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "getSpot_confirmation", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "getSpot_confirmation$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "getTax_lot_editing", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "getTax_lot_editing$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "getTax_lot_review", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "getTax_lot_review$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "getTax_lot_selection", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "getTax_lot_selection$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "getTax_lot_confirmation", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "getTax_lot_confirmation$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "getTokenized_stock_editing", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "getTokenized_stock_editing$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "getTokenized_stock_review", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "getTokenized_stock_review$annotations", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "getTokenized_stock_confirmation", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "getTokenized_stock_confirmation$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SpotConfirmationDto spot_confirmation;
        private final SpotEditingDto spot_editing;
        private final SpotReviewDto spot_review;
        private final TaxLotConfirmationDto tax_lot_confirmation;
        private final TaxLotEditingDto tax_lot_editing;
        private final TaxLotReviewDto tax_lot_review;
        private final TaxLotSelectionDto tax_lot_selection;
        private final TokenizedStockConfirmationDto tokenized_stock_confirmation;
        private final TokenizedStockEditingDto tokenized_stock_editing;
        private final TokenizedStockReviewDto tokenized_stock_review;

        public Surrogate() {
            this((SpotEditingDto) null, (SpotReviewDto) null, (SpotConfirmationDto) null, (TaxLotEditingDto) null, (TaxLotReviewDto) null, (TaxLotSelectionDto) null, (TaxLotConfirmationDto) null, (TokenizedStockEditingDto) null, (TokenizedStockReviewDto) null, (TokenizedStockConfirmationDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.spot_editing, surrogate.spot_editing) && Intrinsics.areEqual(this.spot_review, surrogate.spot_review) && Intrinsics.areEqual(this.spot_confirmation, surrogate.spot_confirmation) && Intrinsics.areEqual(this.tax_lot_editing, surrogate.tax_lot_editing) && Intrinsics.areEqual(this.tax_lot_review, surrogate.tax_lot_review) && Intrinsics.areEqual(this.tax_lot_selection, surrogate.tax_lot_selection) && Intrinsics.areEqual(this.tax_lot_confirmation, surrogate.tax_lot_confirmation) && Intrinsics.areEqual(this.tokenized_stock_editing, surrogate.tokenized_stock_editing) && Intrinsics.areEqual(this.tokenized_stock_review, surrogate.tokenized_stock_review) && Intrinsics.areEqual(this.tokenized_stock_confirmation, surrogate.tokenized_stock_confirmation);
        }

        public int hashCode() {
            SpotEditingDto spotEditingDto = this.spot_editing;
            int iHashCode = (spotEditingDto == null ? 0 : spotEditingDto.hashCode()) * 31;
            SpotReviewDto spotReviewDto = this.spot_review;
            int iHashCode2 = (iHashCode + (spotReviewDto == null ? 0 : spotReviewDto.hashCode())) * 31;
            SpotConfirmationDto spotConfirmationDto = this.spot_confirmation;
            int iHashCode3 = (iHashCode2 + (spotConfirmationDto == null ? 0 : spotConfirmationDto.hashCode())) * 31;
            TaxLotEditingDto taxLotEditingDto = this.tax_lot_editing;
            int iHashCode4 = (iHashCode3 + (taxLotEditingDto == null ? 0 : taxLotEditingDto.hashCode())) * 31;
            TaxLotReviewDto taxLotReviewDto = this.tax_lot_review;
            int iHashCode5 = (iHashCode4 + (taxLotReviewDto == null ? 0 : taxLotReviewDto.hashCode())) * 31;
            TaxLotSelectionDto taxLotSelectionDto = this.tax_lot_selection;
            int iHashCode6 = (iHashCode5 + (taxLotSelectionDto == null ? 0 : taxLotSelectionDto.hashCode())) * 31;
            TaxLotConfirmationDto taxLotConfirmationDto = this.tax_lot_confirmation;
            int iHashCode7 = (iHashCode6 + (taxLotConfirmationDto == null ? 0 : taxLotConfirmationDto.hashCode())) * 31;
            TokenizedStockEditingDto tokenizedStockEditingDto = this.tokenized_stock_editing;
            int iHashCode8 = (iHashCode7 + (tokenizedStockEditingDto == null ? 0 : tokenizedStockEditingDto.hashCode())) * 31;
            TokenizedStockReviewDto tokenizedStockReviewDto = this.tokenized_stock_review;
            int iHashCode9 = (iHashCode8 + (tokenizedStockReviewDto == null ? 0 : tokenizedStockReviewDto.hashCode())) * 31;
            TokenizedStockConfirmationDto tokenizedStockConfirmationDto = this.tokenized_stock_confirmation;
            return iHashCode9 + (tokenizedStockConfirmationDto != null ? tokenizedStockConfirmationDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(spot_editing=" + this.spot_editing + ", spot_review=" + this.spot_review + ", spot_confirmation=" + this.spot_confirmation + ", tax_lot_editing=" + this.tax_lot_editing + ", tax_lot_review=" + this.tax_lot_review + ", tax_lot_selection=" + this.tax_lot_selection + ", tax_lot_confirmation=" + this.tax_lot_confirmation + ", tokenized_stock_editing=" + this.tokenized_stock_editing + ", tokenized_stock_review=" + this.tokenized_stock_review + ", tokenized_stock_confirmation=" + this.tokenized_stock_confirmation + ")";
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SourceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SpotEditingDto spotEditingDto, SpotReviewDto spotReviewDto, SpotConfirmationDto spotConfirmationDto, TaxLotEditingDto taxLotEditingDto, TaxLotReviewDto taxLotReviewDto, TaxLotSelectionDto taxLotSelectionDto, TaxLotConfirmationDto taxLotConfirmationDto, TokenizedStockEditingDto tokenizedStockEditingDto, TokenizedStockReviewDto tokenizedStockReviewDto, TokenizedStockConfirmationDto tokenizedStockConfirmationDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.spot_editing = null;
            } else {
                this.spot_editing = spotEditingDto;
            }
            if ((i & 2) == 0) {
                this.spot_review = null;
            } else {
                this.spot_review = spotReviewDto;
            }
            if ((i & 4) == 0) {
                this.spot_confirmation = null;
            } else {
                this.spot_confirmation = spotConfirmationDto;
            }
            if ((i & 8) == 0) {
                this.tax_lot_editing = null;
            } else {
                this.tax_lot_editing = taxLotEditingDto;
            }
            if ((i & 16) == 0) {
                this.tax_lot_review = null;
            } else {
                this.tax_lot_review = taxLotReviewDto;
            }
            if ((i & 32) == 0) {
                this.tax_lot_selection = null;
            } else {
                this.tax_lot_selection = taxLotSelectionDto;
            }
            if ((i & 64) == 0) {
                this.tax_lot_confirmation = null;
            } else {
                this.tax_lot_confirmation = taxLotConfirmationDto;
            }
            if ((i & 128) == 0) {
                this.tokenized_stock_editing = null;
            } else {
                this.tokenized_stock_editing = tokenizedStockEditingDto;
            }
            if ((i & 256) == 0) {
                this.tokenized_stock_review = null;
            } else {
                this.tokenized_stock_review = tokenizedStockReviewDto;
            }
            if ((i & 512) == 0) {
                this.tokenized_stock_confirmation = null;
            } else {
                this.tokenized_stock_confirmation = tokenizedStockConfirmationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SpotEditingDto spotEditingDto = self.spot_editing;
            if (spotEditingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SpotEditingDto.Serializer.INSTANCE, spotEditingDto);
            }
            SpotReviewDto spotReviewDto = self.spot_review;
            if (spotReviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SpotReviewDto.Serializer.INSTANCE, spotReviewDto);
            }
            SpotConfirmationDto spotConfirmationDto = self.spot_confirmation;
            if (spotConfirmationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SpotConfirmationDto.Serializer.INSTANCE, spotConfirmationDto);
            }
            TaxLotEditingDto taxLotEditingDto = self.tax_lot_editing;
            if (taxLotEditingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLotEditingDto.Serializer.INSTANCE, taxLotEditingDto);
            }
            TaxLotReviewDto taxLotReviewDto = self.tax_lot_review;
            if (taxLotReviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TaxLotReviewDto.Serializer.INSTANCE, taxLotReviewDto);
            }
            TaxLotSelectionDto taxLotSelectionDto = self.tax_lot_selection;
            if (taxLotSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TaxLotSelectionDto.Serializer.INSTANCE, taxLotSelectionDto);
            }
            TaxLotConfirmationDto taxLotConfirmationDto = self.tax_lot_confirmation;
            if (taxLotConfirmationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TaxLotConfirmationDto.Serializer.INSTANCE, taxLotConfirmationDto);
            }
            TokenizedStockEditingDto tokenizedStockEditingDto = self.tokenized_stock_editing;
            if (tokenizedStockEditingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TokenizedStockEditingDto.Serializer.INSTANCE, tokenizedStockEditingDto);
            }
            TokenizedStockReviewDto tokenizedStockReviewDto = self.tokenized_stock_review;
            if (tokenizedStockReviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, TokenizedStockReviewDto.Serializer.INSTANCE, tokenizedStockReviewDto);
            }
            TokenizedStockConfirmationDto tokenizedStockConfirmationDto = self.tokenized_stock_confirmation;
            if (tokenizedStockConfirmationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, TokenizedStockConfirmationDto.Serializer.INSTANCE, tokenizedStockConfirmationDto);
            }
        }

        public Surrogate(SpotEditingDto spotEditingDto, SpotReviewDto spotReviewDto, SpotConfirmationDto spotConfirmationDto, TaxLotEditingDto taxLotEditingDto, TaxLotReviewDto taxLotReviewDto, TaxLotSelectionDto taxLotSelectionDto, TaxLotConfirmationDto taxLotConfirmationDto, TokenizedStockEditingDto tokenizedStockEditingDto, TokenizedStockReviewDto tokenizedStockReviewDto, TokenizedStockConfirmationDto tokenizedStockConfirmationDto) {
            this.spot_editing = spotEditingDto;
            this.spot_review = spotReviewDto;
            this.spot_confirmation = spotConfirmationDto;
            this.tax_lot_editing = taxLotEditingDto;
            this.tax_lot_review = taxLotReviewDto;
            this.tax_lot_selection = taxLotSelectionDto;
            this.tax_lot_confirmation = taxLotConfirmationDto;
            this.tokenized_stock_editing = tokenizedStockEditingDto;
            this.tokenized_stock_review = tokenizedStockReviewDto;
            this.tokenized_stock_confirmation = tokenizedStockConfirmationDto;
        }

        public /* synthetic */ Surrogate(SpotEditingDto spotEditingDto, SpotReviewDto spotReviewDto, SpotConfirmationDto spotConfirmationDto, TaxLotEditingDto taxLotEditingDto, TaxLotReviewDto taxLotReviewDto, TaxLotSelectionDto taxLotSelectionDto, TaxLotConfirmationDto taxLotConfirmationDto, TokenizedStockEditingDto tokenizedStockEditingDto, TokenizedStockReviewDto tokenizedStockReviewDto, TokenizedStockConfirmationDto tokenizedStockConfirmationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : spotEditingDto, (i & 2) != 0 ? null : spotReviewDto, (i & 4) != 0 ? null : spotConfirmationDto, (i & 8) != 0 ? null : taxLotEditingDto, (i & 16) != 0 ? null : taxLotReviewDto, (i & 32) != 0 ? null : taxLotSelectionDto, (i & 64) != 0 ? null : taxLotConfirmationDto, (i & 128) != 0 ? null : tokenizedStockEditingDto, (i & 256) != 0 ? null : tokenizedStockReviewDto, (i & 512) != 0 ? null : tokenizedStockConfirmationDto);
        }

        public final SpotEditingDto getSpot_editing() {
            return this.spot_editing;
        }

        public final SpotReviewDto getSpot_review() {
            return this.spot_review;
        }

        public final SpotConfirmationDto getSpot_confirmation() {
            return this.spot_confirmation;
        }

        public final TaxLotEditingDto getTax_lot_editing() {
            return this.tax_lot_editing;
        }

        public final TaxLotReviewDto getTax_lot_review() {
            return this.tax_lot_review;
        }

        public final TaxLotSelectionDto getTax_lot_selection() {
            return this.tax_lot_selection;
        }

        public final TaxLotConfirmationDto getTax_lot_confirmation() {
            return this.tax_lot_confirmation;
        }

        public final TokenizedStockEditingDto getTokenized_stock_editing() {
            return this.tokenized_stock_editing;
        }

        public final TokenizedStockReviewDto getTokenized_stock_review() {
            return this.tokenized_stock_review;
        }

        public final TokenizedStockConfirmationDto getTokenized_stock_confirmation() {
            return this.tokenized_stock_confirmation;
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "Lcontracts/crypto/trade/proto/v1/Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SourceDto, Source> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SourceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SourceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SourceDto> getBinaryBase64Serializer() {
            return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Source> getProtoAdapter() {
            return Source.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SourceDto getZeroValue() {
            return SourceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SourceDto fromProto(Source proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Source.SpotEditing spot_editing = proto.getSpot_editing();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SpotEditingDto spotEditingDtoFromProto = spot_editing != null ? SpotEditingDto.INSTANCE.fromProto(spot_editing) : null;
            Source.SpotReview spot_review = proto.getSpot_review();
            SpotReviewDto spotReviewDtoFromProto = spot_review != null ? SpotReviewDto.INSTANCE.fromProto(spot_review) : null;
            Source.SpotConfirmation spot_confirmation = proto.getSpot_confirmation();
            SpotConfirmationDto spotConfirmationDtoFromProto = spot_confirmation != null ? SpotConfirmationDto.INSTANCE.fromProto(spot_confirmation) : null;
            Source.TaxLotEditing tax_lot_editing = proto.getTax_lot_editing();
            TaxLotEditingDto taxLotEditingDtoFromProto = tax_lot_editing != null ? TaxLotEditingDto.INSTANCE.fromProto(tax_lot_editing) : null;
            Source.TaxLotReview tax_lot_review = proto.getTax_lot_review();
            TaxLotReviewDto taxLotReviewDtoFromProto = tax_lot_review != null ? TaxLotReviewDto.INSTANCE.fromProto(tax_lot_review) : null;
            Source.TaxLotSelection tax_lot_selection = proto.getTax_lot_selection();
            TaxLotSelectionDto taxLotSelectionDtoFromProto = tax_lot_selection != null ? TaxLotSelectionDto.INSTANCE.fromProto(tax_lot_selection) : null;
            Source.TaxLotConfirmation tax_lot_confirmation = proto.getTax_lot_confirmation();
            TaxLotConfirmationDto taxLotConfirmationDtoFromProto = tax_lot_confirmation != null ? TaxLotConfirmationDto.INSTANCE.fromProto(tax_lot_confirmation) : null;
            Source.TokenizedStockEditing tokenized_stock_editing = proto.getTokenized_stock_editing();
            TokenizedStockEditingDto tokenizedStockEditingDtoFromProto = tokenized_stock_editing != null ? TokenizedStockEditingDto.INSTANCE.fromProto(tokenized_stock_editing) : null;
            Source.TokenizedStockReview tokenized_stock_review = proto.getTokenized_stock_review();
            TokenizedStockReviewDto tokenizedStockReviewDtoFromProto = tokenized_stock_review != null ? TokenizedStockReviewDto.INSTANCE.fromProto(tokenized_stock_review) : null;
            Source.TokenizedStockConfirmation tokenized_stock_confirmation = proto.getTokenized_stock_confirmation();
            return new SourceDto(new Surrogate(spotEditingDtoFromProto, spotReviewDtoFromProto, spotConfirmationDtoFromProto, taxLotEditingDtoFromProto, taxLotReviewDtoFromProto, taxLotSelectionDtoFromProto, taxLotConfirmationDtoFromProto, tokenizedStockEditingDtoFromProto, tokenizedStockReviewDtoFromProto, tokenized_stock_confirmation != null ? TokenizedStockConfirmationDto.INSTANCE.fromProto(tokenized_stock_confirmation) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SourceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SourceDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SpotEditing", "SpotReview", "SpotConfirmation", "TaxLotEditing", "TaxLotReview", "TaxLotSelection", "TaxLotConfirmation", "TokenizedStockEditing", "TokenizedStockReview", "TokenizedStockConfirmation", "Companion", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotReview;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotReview;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotSelection;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockReview;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SpotEditing extends TypeDto {
            private final SpotEditingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpotEditing) && Intrinsics.areEqual(this.value, ((SpotEditing) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SpotEditing(value=" + this.value + ")";
            }

            public final SpotEditingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SpotEditing(SpotEditingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotReview;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SpotReview extends TypeDto {
            private final SpotReviewDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpotReview) && Intrinsics.areEqual(this.value, ((SpotReview) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SpotReview(value=" + this.value + ")";
            }

            public final SpotReviewDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SpotReview(SpotReviewDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$SpotConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SpotConfirmation extends TypeDto {
            private final SpotConfirmationDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpotConfirmation) && Intrinsics.areEqual(this.value, ((SpotConfirmation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SpotConfirmation(value=" + this.value + ")";
            }

            public final SpotConfirmationDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SpotConfirmation(SpotConfirmationDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotEditing extends TypeDto {
            private final TaxLotEditingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotEditing) && Intrinsics.areEqual(this.value, ((TaxLotEditing) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotEditing(value=" + this.value + ")";
            }

            public final TaxLotEditingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotEditing(TaxLotEditingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotReview;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotReview extends TypeDto {
            private final TaxLotReviewDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotReview) && Intrinsics.areEqual(this.value, ((TaxLotReview) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotReview(value=" + this.value + ")";
            }

            public final TaxLotReviewDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotReview(TaxLotReviewDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotSelection;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotSelection extends TypeDto {
            private final TaxLotSelectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotSelection) && Intrinsics.areEqual(this.value, ((TaxLotSelection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotSelection(value=" + this.value + ")";
            }

            public final TaxLotSelectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotSelection(TaxLotSelectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TaxLotConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotConfirmation extends TypeDto {
            private final TaxLotConfirmationDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotConfirmation) && Intrinsics.areEqual(this.value, ((TaxLotConfirmation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotConfirmation(value=" + this.value + ")";
            }

            public final TaxLotConfirmationDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotConfirmation(TaxLotConfirmationDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockEditing;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizedStockEditing extends TypeDto {
            private final TokenizedStockEditingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizedStockEditing) && Intrinsics.areEqual(this.value, ((TokenizedStockEditing) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizedStockEditing(value=" + this.value + ")";
            }

            public final TokenizedStockEditingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockEditing(TokenizedStockEditingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockReview;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizedStockReview extends TypeDto {
            private final TokenizedStockReviewDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizedStockReview) && Intrinsics.areEqual(this.value, ((TokenizedStockReview) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizedStockReview(value=" + this.value + ")";
            }

            public final TokenizedStockReviewDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockReview(TokenizedStockReviewDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$TokenizedStockConfirmation;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizedStockConfirmation extends TypeDto {
            private final TokenizedStockConfirmationDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizedStockConfirmation) && Intrinsics.areEqual(this.value, ((TokenizedStockConfirmation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizedStockConfirmation(value=" + this.value + ")";
            }

            public final TokenizedStockConfirmationDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockConfirmation(TokenizedStockConfirmationDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/Source;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TypeDto, Source> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source> getProtoAdapter() {
                return Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSpot_editing() != null) {
                    return new SpotEditing(SpotEditingDto.INSTANCE.fromProto(proto.getSpot_editing()));
                }
                if (proto.getSpot_review() != null) {
                    return new SpotReview(SpotReviewDto.INSTANCE.fromProto(proto.getSpot_review()));
                }
                if (proto.getSpot_confirmation() != null) {
                    return new SpotConfirmation(SpotConfirmationDto.INSTANCE.fromProto(proto.getSpot_confirmation()));
                }
                if (proto.getTax_lot_editing() != null) {
                    return new TaxLotEditing(TaxLotEditingDto.INSTANCE.fromProto(proto.getTax_lot_editing()));
                }
                if (proto.getTax_lot_review() != null) {
                    return new TaxLotReview(TaxLotReviewDto.INSTANCE.fromProto(proto.getTax_lot_review()));
                }
                if (proto.getTax_lot_selection() != null) {
                    return new TaxLotSelection(TaxLotSelectionDto.INSTANCE.fromProto(proto.getTax_lot_selection()));
                }
                if (proto.getTax_lot_confirmation() != null) {
                    return new TaxLotConfirmation(TaxLotConfirmationDto.INSTANCE.fromProto(proto.getTax_lot_confirmation()));
                }
                if (proto.getTokenized_stock_editing() != null) {
                    return new TokenizedStockEditing(TokenizedStockEditingDto.INSTANCE.fromProto(proto.getTokenized_stock_editing()));
                }
                if (proto.getTokenized_stock_review() != null) {
                    return new TokenizedStockReview(TokenizedStockReviewDto.INSTANCE.fromProto(proto.getTokenized_stock_review()));
                }
                if (proto.getTokenized_stock_confirmation() != null) {
                    return new TokenizedStockConfirmation(TokenizedStockConfirmationDto.INSTANCE.fromProto(proto.getTokenized_stock_confirmation()));
                }
                return null;
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpotEditingDto implements Dto3<Source.SpotEditing>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SpotEditingDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpotEditingDto, Source.SpotEditing>> binaryBase64Serializer$delegate;
        private static final SpotEditingDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SpotEditingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SpotEditingDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public SpotEditingDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.SpotEditing toProto() {
            return new Source.SpotEditing(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[SpotEditingDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SpotEditingDto) && Intrinsics.areEqual(((SpotEditingDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotEditingDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotEditingDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -579918592;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.SpotEditingDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotEditing;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<SpotEditingDto, Source.SpotEditing> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SpotEditingDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotEditingDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotEditingDto> getBinaryBase64Serializer() {
                return (KSerializer) SpotEditingDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.SpotEditing> getProtoAdapter() {
                return Source.SpotEditing.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotEditingDto getZeroValue() {
                return SpotEditingDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotEditingDto fromProto(Source.SpotEditing proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new SpotEditingDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotEditingDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotEditingDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SpotEditingDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SpotEditingDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.SpotEditing", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SpotEditingDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SpotEditingDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SpotEditingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotEditingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$SpotEditingDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpotReviewDto implements Dto3<Source.SpotReview>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SpotReviewDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpotReviewDto, Source.SpotReview>> binaryBase64Serializer$delegate;
        private static final SpotReviewDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SpotReviewDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SpotReviewDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public SpotReviewDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.SpotReview toProto() {
            return new Source.SpotReview(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[SpotReviewDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SpotReviewDto) && Intrinsics.areEqual(((SpotReviewDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotReviewDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotReviewDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1908238142;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.SpotReviewDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotReview;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<SpotReviewDto, Source.SpotReview> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SpotReviewDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotReviewDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotReviewDto> getBinaryBase64Serializer() {
                return (KSerializer) SpotReviewDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.SpotReview> getProtoAdapter() {
                return Source.SpotReview.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotReviewDto getZeroValue() {
                return SpotReviewDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotReviewDto fromProto(Source.SpotReview proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new SpotReviewDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotReviewDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotReviewDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SpotReviewDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SpotReviewDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.SpotReview", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SpotReviewDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SpotReviewDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SpotReviewDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotReviewDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$SpotReviewDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpotConfirmationDto implements Dto3<Source.SpotConfirmation>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SpotConfirmationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpotConfirmationDto, Source.SpotConfirmation>> binaryBase64Serializer$delegate;
        private static final SpotConfirmationDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SpotConfirmationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SpotConfirmationDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public SpotConfirmationDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.SpotConfirmation toProto() {
            return new Source.SpotConfirmation(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[SpotConfirmationDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SpotConfirmationDto) && Intrinsics.areEqual(((SpotConfirmationDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotConfirmationDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotConfirmationDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 591180357;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.SpotConfirmationDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "Lcontracts/crypto/trade/proto/v1/Source$SpotConfirmation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<SpotConfirmationDto, Source.SpotConfirmation> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SpotConfirmationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotConfirmationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpotConfirmationDto> getBinaryBase64Serializer() {
                return (KSerializer) SpotConfirmationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.SpotConfirmation> getProtoAdapter() {
                return Source.SpotConfirmation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotConfirmationDto getZeroValue() {
                return SpotConfirmationDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpotConfirmationDto fromProto(Source.SpotConfirmation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new SpotConfirmationDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$SpotConfirmationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.SpotConfirmationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SpotConfirmationDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SpotConfirmationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.SpotConfirmation", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SpotConfirmationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SpotConfirmationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SpotConfirmationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$SpotConfirmationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$SpotConfirmationDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxLotEditingDto implements Dto3<Source.TaxLotEditing>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotEditingDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotEditingDto, Source.TaxLotEditing>> binaryBase64Serializer$delegate;
        private static final TaxLotEditingDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotEditingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotEditingDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TaxLotEditingDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TaxLotEditing toProto() {
            return new Source.TaxLotEditing(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TaxLotEditingDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotEditingDto) && Intrinsics.areEqual(((TaxLotEditingDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotEditingDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotEditingDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1454939548;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TaxLotEditingDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotEditing;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxLotEditingDto, Source.TaxLotEditing> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotEditingDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotEditingDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotEditingDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotEditingDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TaxLotEditing> getProtoAdapter() {
                return Source.TaxLotEditing.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotEditingDto getZeroValue() {
                return TaxLotEditingDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotEditingDto fromProto(Source.TaxLotEditing proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxLotEditingDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotEditingDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotEditingDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxLotEditingDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotEditingDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TaxLotEditing", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotEditingDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotEditingDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotEditingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotEditingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TaxLotEditingDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxLotReviewDto implements Dto3<Source.TaxLotReview>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotReviewDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotReviewDto, Source.TaxLotReview>> binaryBase64Serializer$delegate;
        private static final TaxLotReviewDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotReviewDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotReviewDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TaxLotReviewDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TaxLotReview toProto() {
            return new Source.TaxLotReview(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TaxLotReviewDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotReviewDto) && Intrinsics.areEqual(((TaxLotReviewDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotReviewDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotReviewDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 695934686;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TaxLotReviewDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotReview;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxLotReviewDto, Source.TaxLotReview> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotReviewDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotReviewDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotReviewDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotReviewDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TaxLotReview> getProtoAdapter() {
                return Source.TaxLotReview.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotReviewDto getZeroValue() {
                return TaxLotReviewDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotReviewDto fromProto(Source.TaxLotReview proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxLotReviewDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotReviewDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotReviewDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxLotReviewDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotReviewDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TaxLotReview", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotReviewDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotReviewDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotReviewDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotReviewDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TaxLotReviewDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxLotSelectionDto implements Dto3<Source.TaxLotSelection>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotSelectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotSelectionDto, Source.TaxLotSelection>> binaryBase64Serializer$delegate;
        private static final TaxLotSelectionDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotSelectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotSelectionDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TaxLotSelectionDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TaxLotSelection toProto() {
            return new Source.TaxLotSelection(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TaxLotSelectionDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotSelectionDto) && Intrinsics.areEqual(((TaxLotSelectionDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotSelectionDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotSelectionDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -403779024;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TaxLotSelectionDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotSelection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxLotSelectionDto, Source.TaxLotSelection> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotSelectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotSelectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotSelectionDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotSelectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TaxLotSelection> getProtoAdapter() {
                return Source.TaxLotSelection.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotSelectionDto getZeroValue() {
                return TaxLotSelectionDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotSelectionDto fromProto(Source.TaxLotSelection proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxLotSelectionDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotSelectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotSelectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxLotSelectionDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotSelectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TaxLotSelection", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotSelectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotSelectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotSelectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotSelectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TaxLotSelectionDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxLotConfirmationDto implements Dto3<Source.TaxLotConfirmation>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotConfirmationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotConfirmationDto, Source.TaxLotConfirmation>> binaryBase64Serializer$delegate;
        private static final TaxLotConfirmationDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotConfirmationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotConfirmationDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TaxLotConfirmationDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TaxLotConfirmation toProto() {
            return new Source.TaxLotConfirmation(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TaxLotConfirmationDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotConfirmationDto) && Intrinsics.areEqual(((TaxLotConfirmationDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotConfirmationDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotConfirmationDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -1062784159;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TaxLotConfirmationDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "Lcontracts/crypto/trade/proto/v1/Source$TaxLotConfirmation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxLotConfirmationDto, Source.TaxLotConfirmation> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotConfirmationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotConfirmationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotConfirmationDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotConfirmationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TaxLotConfirmation> getProtoAdapter() {
                return Source.TaxLotConfirmation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotConfirmationDto getZeroValue() {
                return TaxLotConfirmationDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotConfirmationDto fromProto(Source.TaxLotConfirmation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxLotConfirmationDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TaxLotConfirmationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TaxLotConfirmationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxLotConfirmationDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotConfirmationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TaxLotConfirmation", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotConfirmationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotConfirmationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotConfirmationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TaxLotConfirmationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TaxLotConfirmationDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TokenizedStockEditingDto implements Dto3<Source.TokenizedStockEditing>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TokenizedStockEditingDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockEditingDto, Source.TokenizedStockEditing>> binaryBase64Serializer$delegate;
        private static final TokenizedStockEditingDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TokenizedStockEditingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TokenizedStockEditingDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TokenizedStockEditingDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TokenizedStockEditing toProto() {
            return new Source.TokenizedStockEditing(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TokenizedStockEditingDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TokenizedStockEditingDto) && Intrinsics.areEqual(((TokenizedStockEditingDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockEditingDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockEditingDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 1940373963;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TokenizedStockEditingDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockEditing;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TokenizedStockEditingDto, Source.TokenizedStockEditing> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TokenizedStockEditingDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockEditingDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockEditingDto> getBinaryBase64Serializer() {
                return (KSerializer) TokenizedStockEditingDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TokenizedStockEditing> getProtoAdapter() {
                return Source.TokenizedStockEditing.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockEditingDto getZeroValue() {
                return TokenizedStockEditingDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockEditingDto fromProto(Source.TokenizedStockEditing proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TokenizedStockEditingDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockEditingDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockEditingDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TokenizedStockEditingDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TokenizedStockEditingDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TokenizedStockEditing", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TokenizedStockEditingDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TokenizedStockEditingDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TokenizedStockEditingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockEditingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockEditingDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TokenizedStockReviewDto implements Dto3<Source.TokenizedStockReview>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TokenizedStockReviewDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockReviewDto, Source.TokenizedStockReview>> binaryBase64Serializer$delegate;
        private static final TokenizedStockReviewDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TokenizedStockReviewDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TokenizedStockReviewDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TokenizedStockReviewDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TokenizedStockReview toProto() {
            return new Source.TokenizedStockReview(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TokenizedStockReviewDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TokenizedStockReviewDto) && Intrinsics.areEqual(((TokenizedStockReviewDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockReviewDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockReviewDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -580012393;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TokenizedStockReviewDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockReview;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TokenizedStockReviewDto, Source.TokenizedStockReview> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TokenizedStockReviewDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockReviewDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockReviewDto> getBinaryBase64Serializer() {
                return (KSerializer) TokenizedStockReviewDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TokenizedStockReview> getProtoAdapter() {
                return Source.TokenizedStockReview.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockReviewDto getZeroValue() {
                return TokenizedStockReviewDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockReviewDto fromProto(Source.TokenizedStockReview proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TokenizedStockReviewDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockReviewDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockReviewDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TokenizedStockReviewDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TokenizedStockReviewDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TokenizedStockReview", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TokenizedStockReviewDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TokenizedStockReviewDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TokenizedStockReviewDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockReviewDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockReviewDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TokenizedStockConfirmationDto implements Dto3<Source.TokenizedStockConfirmation>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TokenizedStockConfirmationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockConfirmationDto, Source.TokenizedStockConfirmation>> binaryBase64Serializer$delegate;
        private static final TokenizedStockConfirmationDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TokenizedStockConfirmationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TokenizedStockConfirmationDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TokenizedStockConfirmationDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Source.TokenizedStockConfirmation toProto() {
            return new Source.TokenizedStockConfirmation(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TokenizedStockConfirmationDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TokenizedStockConfirmationDto) && Intrinsics.areEqual(((TokenizedStockConfirmationDto) other).surrogate, this.surrogate);
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
        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockConfirmationDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockConfirmationDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 1047354458;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.SourceDto.TokenizedStockConfirmationDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "Lcontracts/crypto/trade/proto/v1/Source$TokenizedStockConfirmation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TokenizedStockConfirmationDto, Source.TokenizedStockConfirmation> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TokenizedStockConfirmationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockConfirmationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockConfirmationDto> getBinaryBase64Serializer() {
                return (KSerializer) TokenizedStockConfirmationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Source.TokenizedStockConfirmation> getProtoAdapter() {
                return Source.TokenizedStockConfirmation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockConfirmationDto getZeroValue() {
                return TokenizedStockConfirmationDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockConfirmationDto fromProto(Source.TokenizedStockConfirmation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TokenizedStockConfirmationDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockConfirmationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SourceDto.TokenizedStockConfirmationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TokenizedStockConfirmationDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TokenizedStockConfirmationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source.TokenizedStockConfirmation", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TokenizedStockConfirmationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TokenizedStockConfirmationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TokenizedStockConfirmationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: SourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$TokenizedStockConfirmationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.SourceDto$TokenizedStockConfirmationDto";
            }
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/SourceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SourceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.Source", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SourceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SourceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SourceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SourceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/SourceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.SourceDto";
        }
    }
}
