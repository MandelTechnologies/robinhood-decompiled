package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategoryPercentageLinePositionDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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

/* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;)V", "", "ticker", "subtitle", "percent_text", "amount", "bar_color", "", "bar_percentage", "deeplink", "id", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "negative_line_position", "caret_position_percentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;", "getTicker", "getSubtitle", "getPercent_text", "getAmount", "getBar_percentage", "()D", "getDeeplink", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getCaret_position_percentage", "()Ljava/lang/Double;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto */
/* loaded from: classes16.dex */
public final class C3328x929dba61 implements Dto3<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<C3328x929dba61> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<C3328x929dba61, InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails>> binaryBase64Serializer$delegate;
    private static final C3328x929dba61 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ C3328x929dba61(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private C3328x929dba61(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTicker() {
        return this.surrogate.getTicker();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getPercent_text() {
        return this.surrogate.getPercent_text();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final double getBar_percentage() {
        return this.surrogate.getBar_percentage();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final InvestmentsTrackerCategoryPercentageLinePositionDto getNegative_line_position() {
        return this.surrogate.getNegative_line_position();
    }

    public final Double getCaret_position_percentage() {
        return this.surrogate.getCaret_position_percentage();
    }

    public /* synthetic */ C3328x929dba61(String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePositionDto, (i & 512) != 0 ? null : d2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3328x929dba61(String ticker, String subtitle, String percent_text, String amount, String bar_color, double d, String deeplink, String id, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2) {
        this(new Surrogate(ticker, subtitle, percent_text, amount, bar_color, d, deeplink, id, investmentsTrackerCategoryPercentageLinePositionDto, d2));
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(percent_text, "percent_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bar_color, "bar_color");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(id, "id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails toProto() {
        String ticker = this.surrogate.getTicker();
        String subtitle = this.surrogate.getSubtitle();
        String percent_text = this.surrogate.getPercent_text();
        String amount = this.surrogate.getAmount();
        String bar_color = this.surrogate.getBar_color();
        double bar_percentage = this.surrogate.getBar_percentage();
        String deeplink = this.surrogate.getDeeplink();
        String id = this.surrogate.getId();
        InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position = this.surrogate.getNegative_line_position();
        return new InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails(ticker, subtitle, percent_text, amount, bar_color, bar_percentage, deeplink, id, negative_line_position != null ? (InvestmentsTrackerCategoryPercentageLinePosition) negative_line_position.toProto() : null, this.surrogate.getCaret_position_percentage(), null, 1024, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof C3328x929dba61) && Intrinsics.areEqual(((C3328x929dba61) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\u0012\u0010\u0013B}\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010#R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010#R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010#R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010*\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010#R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010*\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010#R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R1\u0010\u0011\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;", "", "", "ticker", "subtitle", "percent_text", "amount", "bar_color", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "bar_percentage", "deeplink", "id", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "negative_line_position", "caret_position_percentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTicker", "getTicker$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getPercent_text", "getPercent_text$annotations", "getAmount", "getAmount$annotations", "getBar_color", "getBar_color$annotations", "D", "getBar_percentage", "()D", "getBar_percentage$annotations", "getDeeplink", "getDeeplink$annotations", "getId", "getId$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "getNegative_line_position$annotations", "Ljava/lang/Double;", "getCaret_position_percentage", "()Ljava/lang/Double;", "getCaret_position_percentage$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String amount;
        private final String bar_color;
        private final double bar_percentage;
        private final Double caret_position_percentage;
        private final String deeplink;
        private final String id;
        private final InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position;
        private final String percent_text;
        private final String subtitle;
        private final String ticker;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (InvestmentsTrackerCategoryPercentageLinePositionDto) null, (Double) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ticker, surrogate.ticker) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.percent_text, surrogate.percent_text) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.bar_color, surrogate.bar_color) && Double.compare(this.bar_percentage, surrogate.bar_percentage) == 0 && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.id, surrogate.id) && this.negative_line_position == surrogate.negative_line_position && Intrinsics.areEqual((Object) this.caret_position_percentage, (Object) surrogate.caret_position_percentage);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.ticker.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.percent_text.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.bar_color.hashCode()) * 31) + Double.hashCode(this.bar_percentage)) * 31) + this.deeplink.hashCode()) * 31) + this.id.hashCode()) * 31;
            InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto = this.negative_line_position;
            int iHashCode2 = (iHashCode + (investmentsTrackerCategoryPercentageLinePositionDto == null ? 0 : investmentsTrackerCategoryPercentageLinePositionDto.hashCode())) * 31;
            Double d = this.caret_position_percentage;
            return iHashCode2 + (d != null ? d.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ticker=" + this.ticker + ", subtitle=" + this.subtitle + ", percent_text=" + this.percent_text + ", amount=" + this.amount + ", bar_color=" + this.bar_color + ", bar_percentage=" + this.bar_percentage + ", deeplink=" + this.deeplink + ", id=" + this.id + ", negative_line_position=" + this.negative_line_position + ", caret_position_percentage=" + this.caret_position_percentage + ")";
        }

        /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ticker = "";
            } else {
                this.ticker = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.percent_text = "";
            } else {
                this.percent_text = str3;
            }
            if ((i & 8) == 0) {
                this.amount = "";
            } else {
                this.amount = str4;
            }
            if ((i & 16) == 0) {
                this.bar_color = "";
            } else {
                this.bar_color = str5;
            }
            if ((i & 32) == 0) {
                this.bar_percentage = 0.0d;
            } else {
                this.bar_percentage = d;
            }
            if ((i & 64) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str6;
            }
            if ((i & 128) == 0) {
                this.id = "";
            } else {
                this.id = str7;
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
            if (!Intrinsics.areEqual(self.ticker, "")) {
                output.encodeStringElement(serialDesc, 0, self.ticker);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.percent_text, "")) {
                output.encodeStringElement(serialDesc, 2, self.percent_text);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 3, self.amount);
            }
            if (!Intrinsics.areEqual(self.bar_color, "")) {
                output.encodeStringElement(serialDesc, 4, self.bar_color);
            }
            if (Double.compare(self.bar_percentage, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.bar_percentage));
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 6, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 7, self.id);
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

        public Surrogate(String ticker, String subtitle, String percent_text, String amount, String bar_color, double d, String deeplink, String id, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2) {
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(percent_text, "percent_text");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(bar_color, "bar_color");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(id, "id");
            this.ticker = ticker;
            this.subtitle = subtitle;
            this.percent_text = percent_text;
            this.amount = amount;
            this.bar_color = bar_color;
            this.bar_percentage = d;
            this.deeplink = deeplink;
            this.id = id;
            this.negative_line_position = investmentsTrackerCategoryPercentageLinePositionDto;
            this.caret_position_percentage = d2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePositionDto, (i & 512) != 0 ? null : d2);
        }

        public final String getTicker() {
            return this.ticker;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getPercent_text() {
            return this.percent_text;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getBar_color() {
            return this.bar_color;
        }

        public final double getBar_percentage() {
            return this.bar_percentage;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getId() {
            return this.id;
        }

        public final InvestmentsTrackerCategoryPercentageLinePositionDto getNegative_line_position() {
            return this.negative_line_position;
        }

        public final Double getCaret_position_percentage() {
            return this.caret_position_percentage;
        }
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<C3328x929dba61, InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<C3328x929dba61> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<C3328x929dba61> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<C3328x929dba61> getBinaryBase64Serializer() {
            return (KSerializer) C3328x929dba61.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> getProtoAdapter() {
            return InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public C3328x929dba61 getZeroValue() {
            return C3328x929dba61.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public C3328x929dba61 fromProto(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ticker = proto.getTicker();
            String subtitle = proto.getSubtitle();
            String percent_text = proto.getPercent_text();
            String amount = proto.getAmount();
            String bar_color = proto.getBar_color();
            double bar_percentage = proto.getBar_percentage();
            String deeplink = proto.getDeeplink();
            String id = proto.getId();
            InvestmentsTrackerCategoryPercentageLinePosition negative_line_position = proto.getNegative_line_position();
            return new C3328x929dba61(new Surrogate(ticker, subtitle, percent_text, amount, bar_color, bar_percentage, deeplink, id, negative_line_position != null ? InvestmentsTrackerCategoryPercentageLinePositionDto.INSTANCE.fromProto(negative_line_position) : null, proto.getCaret_position_percentage()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3328x929dba61.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new C3328x929dba61(null, null, null, null, null, 0.0d, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$Serializer */
    public static final class Serializer implements KSerializer<C3328x929dba61> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, C3328x929dba61 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public C3328x929dba61 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new C3328x929dba61((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetailsDto";
        }
    }
}
