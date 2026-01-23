package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.C3328x929dba61;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategoryPercentageLinePositionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;:<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bw\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;)V", "", "title", "subtitle", "id", "", "line_fill_percentage", "line_fill_color", "percentage_text", "amount", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", CryptoDetailSource.HOLDINGS, "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "negative_line_position", "caret_position_percentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;", "getTitle", "getSubtitle", "getId", "getLine_fill_percentage", "()D", "getLine_fill_color", "getPercentage_text", "getAmount", "getHoldings", "()Ljava/util/List;", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getCaret_position_percentage", "()Ljava/lang/Double;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentCategoryPercentageCellDetailsDto implements Dto3<InvestmentsTrackerComponentCategoryPercentageCellDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetails>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final double getLine_fill_percentage() {
        return this.surrogate.getLine_fill_percentage();
    }

    public final String getLine_fill_color() {
        return this.surrogate.getLine_fill_color();
    }

    public final String getPercentage_text() {
        return this.surrogate.getPercentage_text();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final List<C3328x929dba61> getHoldings() {
        return this.surrogate.getHoldings();
    }

    public final InvestmentsTrackerCategoryPercentageLinePositionDto getNegative_line_position() {
        return this.surrogate.getNegative_line_position();
    }

    public final Double getCaret_position_percentage() {
        return this.surrogate.getCaret_position_percentage();
    }

    public /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(String str, String str2, String str3, double d, String str4, String str5, String str6, List list, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePositionDto, (i & 512) != 0 ? null : d2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(String title, String subtitle, String id, double d, String line_fill_color, String percentage_text, String amount, List<C3328x929dba61> holdings, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2) {
        this(new Surrogate(title, subtitle, id, d, line_fill_color, percentage_text, amount, holdings, investmentsTrackerCategoryPercentageLinePositionDto, d2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(line_fill_color, "line_fill_color");
        Intrinsics.checkNotNullParameter(percentage_text, "percentage_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponentCategoryPercentageCellDetails toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String id = this.surrogate.getId();
        double line_fill_percentage = this.surrogate.getLine_fill_percentage();
        String line_fill_color = this.surrogate.getLine_fill_color();
        String percentage_text = this.surrogate.getPercentage_text();
        String amount = this.surrogate.getAmount();
        List<C3328x929dba61> holdings = this.surrogate.getHoldings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
        Iterator<T> it = holdings.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3328x929dba61) it.next()).toProto());
        }
        InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position = this.surrogate.getNegative_line_position();
        return new InvestmentsTrackerComponentCategoryPercentageCellDetails(title, subtitle, id, line_fill_percentage, line_fill_color, percentage_text, amount, arrayList, negative_line_position != null ? (InvestmentsTrackerCategoryPercentageLinePosition) negative_line_position.toProto() : null, this.surrogate.getCaret_position_percentage(), null, 1024, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentCategoryPercentageCellDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerComponentCategoryPercentageCellDetailsDto) && Intrinsics.areEqual(((InvestmentsTrackerComponentCategoryPercentageCellDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\u0014\u0010\u0015B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010%R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010%R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010,\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010%R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u0010/\u001a\u0004\b?\u0010@R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bE\u0010/\u001a\u0004\bC\u0010DR1\u0010\u0013\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bI\u0010/\u001a\u0004\bG\u0010H¨\u0006L"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;", "", "", "title", "subtitle", "id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "line_fill_percentage", "line_fill_color", "percentage_text", "amount", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", CryptoDetailSource.HOLDINGS, "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "negative_line_position", "caret_position_percentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getId", "getId$annotations", "D", "getLine_fill_percentage", "()D", "getLine_fill_percentage$annotations", "getLine_fill_color", "getLine_fill_color$annotations", "getPercentage_text", "getPercentage_text$annotations", "getAmount", "getAmount$annotations", "Ljava/util/List;", "getHoldings", "()Ljava/util/List;", "getHoldings$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getNegative_line_position$annotations", "Ljava/lang/Double;", "getCaret_position_percentage", "()Ljava/lang/Double;", "getCaret_position_percentage$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String amount;
        private final Double caret_position_percentage;
        private final List<C3328x929dba61> holdings;
        private final String id;
        private final String line_fill_color;
        private final double line_fill_percentage;
        private final InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position;
        private final String percentage_text;
        private final String subtitle;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (String) null, (List) null, (InvestmentsTrackerCategoryPercentageLinePositionDto) null, (Double) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(C3328x929dba61.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.id, surrogate.id) && Double.compare(this.line_fill_percentage, surrogate.line_fill_percentage) == 0 && Intrinsics.areEqual(this.line_fill_color, surrogate.line_fill_color) && Intrinsics.areEqual(this.percentage_text, surrogate.percentage_text) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.holdings, surrogate.holdings) && this.negative_line_position == surrogate.negative_line_position && Intrinsics.areEqual((Object) this.caret_position_percentage, (Object) surrogate.caret_position_percentage);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.id.hashCode()) * 31) + Double.hashCode(this.line_fill_percentage)) * 31) + this.line_fill_color.hashCode()) * 31) + this.percentage_text.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.holdings.hashCode()) * 31;
            InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto = this.negative_line_position;
            int iHashCode2 = (iHashCode + (investmentsTrackerCategoryPercentageLinePositionDto == null ? 0 : investmentsTrackerCategoryPercentageLinePositionDto.hashCode())) * 31;
            Double d = this.caret_position_percentage;
            return iHashCode2 + (d != null ? d.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", id=" + this.id + ", line_fill_percentage=" + this.line_fill_percentage + ", line_fill_color=" + this.line_fill_color + ", percentage_text=" + this.percentage_text + ", amount=" + this.amount + ", holdings=" + this.holdings + ", negative_line_position=" + this.negative_line_position + ", caret_position_percentage=" + this.caret_position_percentage + ")";
        }

        /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentCategoryPercentageCellDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, double d, String str4, String str5, String str6, List list, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.id = "";
            } else {
                this.id = str3;
            }
            if ((i & 8) == 0) {
                this.line_fill_percentage = 0.0d;
            } else {
                this.line_fill_percentage = d;
            }
            if ((i & 16) == 0) {
                this.line_fill_color = "";
            } else {
                this.line_fill_color = str4;
            }
            if ((i & 32) == 0) {
                this.percentage_text = "";
            } else {
                this.percentage_text = str5;
            }
            if ((i & 64) == 0) {
                this.amount = "";
            } else {
                this.amount = str6;
            }
            if ((i & 128) == 0) {
                this.holdings = CollectionsKt.emptyList();
            } else {
                this.holdings = list;
            }
            if ((i & 256) == 0) {
                this.negative_line_position = null;
            } else {
                this.negative_line_position = investmentsTrackerCategoryPercentageLinePositionDto;
            }
            if ((i & 512) == 0) {
                this.caret_position_percentage = null;
            } else {
                this.caret_position_percentage = d2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 2, self.id);
            }
            if (Double.compare(self.line_fill_percentage, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.line_fill_percentage));
            }
            if (!Intrinsics.areEqual(self.line_fill_color, "")) {
                output.encodeStringElement(serialDesc, 4, self.line_fill_color);
            }
            if (!Intrinsics.areEqual(self.percentage_text, "")) {
                output.encodeStringElement(serialDesc, 5, self.percentage_text);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 6, self.amount);
            }
            if (!Intrinsics.areEqual(self.holdings, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.holdings);
            }
            InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto = self.negative_line_position;
            if (investmentsTrackerCategoryPercentageLinePositionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, InvestmentsTrackerCategoryPercentageLinePositionDto.Serializer.INSTANCE, investmentsTrackerCategoryPercentageLinePositionDto);
            }
            Double d = self.caret_position_percentage;
            if (d != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, d);
            }
        }

        public Surrogate(String title, String subtitle, String id, double d, String line_fill_color, String percentage_text, String amount, List<C3328x929dba61> holdings, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(line_fill_color, "line_fill_color");
            Intrinsics.checkNotNullParameter(percentage_text, "percentage_text");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            this.title = title;
            this.subtitle = subtitle;
            this.id = id;
            this.line_fill_percentage = d;
            this.line_fill_color = line_fill_color;
            this.percentage_text = percentage_text;
            this.amount = amount;
            this.holdings = holdings;
            this.negative_line_position = investmentsTrackerCategoryPercentageLinePositionDto;
            this.caret_position_percentage = d2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, double d, String str4, String str5, String str6, List list, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePositionDto, (i & 512) != 0 ? null : d2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getId() {
            return this.id;
        }

        public final double getLine_fill_percentage() {
            return this.line_fill_percentage;
        }

        public final String getLine_fill_color() {
            return this.line_fill_color;
        }

        public final String getPercentage_text() {
            return this.percentage_text;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final List<C3328x929dba61> getHoldings() {
            return this.holdings;
        }

        public final InvestmentsTrackerCategoryPercentageLinePositionDto getNegative_line_position() {
            return this.negative_line_position;
        }

        public final Double getCaret_position_percentage() {
            return this.caret_position_percentage;
        }
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellDetails> getProtoAdapter() {
            return InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentCategoryPercentageCellDetailsDto getZeroValue() {
            return InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentCategoryPercentageCellDetailsDto fromProto(InvestmentsTrackerComponentCategoryPercentageCellDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String id = proto.getId();
            double line_fill_percentage = proto.getLine_fill_percentage();
            String line_fill_color = proto.getLine_fill_color();
            String percentage_text = proto.getPercentage_text();
            String amount = proto.getAmount();
            List<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> holdings = proto.getHoldings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
            Iterator<T> it = holdings.iterator();
            while (it.hasNext()) {
                arrayList.add(C3328x929dba61.INSTANCE.fromProto((InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails) it.next()));
            }
            InvestmentsTrackerCategoryPercentageLinePosition negative_line_position = proto.getNegative_line_position();
            return new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(new Surrogate(title, subtitle, id, line_fill_percentage, line_fill_color, percentage_text, amount, arrayList, negative_line_position != null ? InvestmentsTrackerCategoryPercentageLinePositionDto.INSTANCE.fromProto(negative_line_position) : null, proto.getCaret_position_percentage()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto(null, null, null, 0.0d, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentCategoryPercentageCellDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentCategoryPercentageCellDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto";
        }
    }
}
