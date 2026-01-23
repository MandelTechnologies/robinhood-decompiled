package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowDetailsDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010 R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;)V", "", "header_text", "header_subtitle", "amount", "Lcom/robinhood/idl/IdlDecimal;", "percentage", "", "row_display_minimum", "", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "rows", "dot_color_light", "dot_color_dark", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;", "getHeader_text", "getHeader_subtitle", "getAmount", "getPercentage", "()Lcom/robinhood/idl/IdlDecimal;", "getRow_display_minimum", "getRows", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerCategorySectionDetailsDto implements Dto3<InvestmentsTrackerCategorySectionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerCategorySectionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerCategorySectionDetails>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerCategorySectionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerCategorySectionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerCategorySectionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeader_text() {
        return this.surrogate.getHeader_text();
    }

    public final String getHeader_subtitle() {
        return this.surrogate.getHeader_subtitle();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final IdlDecimal getPercentage() {
        return this.surrogate.getPercentage();
    }

    public final int getRow_display_minimum() {
        return this.surrogate.getRow_display_minimum();
    }

    public final List<InvestmentsTrackerCategorySectionRowDetailsDto> getRows() {
        return this.surrogate.getRows();
    }

    public /* synthetic */ InvestmentsTrackerCategorySectionDetailsDto(String str, String str2, String str3, IdlDecimal idlDecimal, int i, List list, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerCategorySectionDetailsDto(String header_text, String header_subtitle, String amount, IdlDecimal percentage, int i, List<InvestmentsTrackerCategorySectionRowDetailsDto> rows, String dot_color_light, String dot_color_dark) {
        this(new Surrogate(header_text, header_subtitle, amount, percentage, i, rows, dot_color_light, dot_color_dark));
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(header_subtitle, "header_subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(dot_color_light, "dot_color_light");
        Intrinsics.checkNotNullParameter(dot_color_dark, "dot_color_dark");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerCategorySectionDetails toProto() {
        String header_text = this.surrogate.getHeader_text();
        String header_subtitle = this.surrogate.getHeader_subtitle();
        String amount = this.surrogate.getAmount();
        String stringValue = this.surrogate.getPercentage().getStringValue();
        int row_display_minimum = this.surrogate.getRow_display_minimum();
        List<InvestmentsTrackerCategorySectionRowDetailsDto> rows = this.surrogate.getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentsTrackerCategorySectionRowDetailsDto) it.next()).toProto());
        }
        return new InvestmentsTrackerCategorySectionDetails(header_text, header_subtitle, amount, stringValue, row_display_minimum, arrayList, this.surrogate.getDot_color_light(), this.surrogate.getDot_color_dark(), null, 256, null);
    }

    public String toString() {
        return "[InvestmentsTrackerCategorySectionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerCategorySectionDetailsDto) && Intrinsics.areEqual(((InvestmentsTrackerCategorySectionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BAB{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014Bo\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010#R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R/\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010%R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b:\u0010;R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010*\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010#R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010*\u0012\u0004\b@\u0010-\u001a\u0004\b?\u0010#¨\u0006C"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;", "", "", "header_text", "header_subtitle", "amount", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "percentage", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "row_display_minimum", "", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "rows", "dot_color_light", "dot_color_dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader_text", "getHeader_text$annotations", "()V", "getHeader_subtitle", "getHeader_subtitle$annotations", "getAmount", "getAmount$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getPercentage", "()Lcom/robinhood/idl/IdlDecimal;", "getPercentage$annotations", "I", "getRow_display_minimum", "getRow_display_minimum$annotations", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "getRows$annotations", "getDot_color_light", "getDot_color_light$annotations", "getDot_color_dark", "getDot_color_dark$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String amount;
        private final String dot_color_dark;
        private final String dot_color_light;
        private final String header_subtitle;
        private final String header_text;
        private final IdlDecimal percentage;
        private final int row_display_minimum;
        private final List<InvestmentsTrackerCategorySectionRowDetailsDto> rows;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerCategorySectionDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (IdlDecimal) null, 0, (List) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InvestmentsTrackerCategorySectionRowDetailsDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.header_text, surrogate.header_text) && Intrinsics.areEqual(this.header_subtitle, surrogate.header_subtitle) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.percentage, surrogate.percentage) && this.row_display_minimum == surrogate.row_display_minimum && Intrinsics.areEqual(this.rows, surrogate.rows) && Intrinsics.areEqual(this.dot_color_light, surrogate.dot_color_light) && Intrinsics.areEqual(this.dot_color_dark, surrogate.dot_color_dark);
        }

        public int hashCode() {
            return (((((((((((((this.header_text.hashCode() * 31) + this.header_subtitle.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.percentage.hashCode()) * 31) + Integer.hashCode(this.row_display_minimum)) * 31) + this.rows.hashCode()) * 31) + this.dot_color_light.hashCode()) * 31) + this.dot_color_dark.hashCode();
        }

        public String toString() {
            return "Surrogate(header_text=" + this.header_text + ", header_subtitle=" + this.header_subtitle + ", amount=" + this.amount + ", percentage=" + this.percentage + ", row_display_minimum=" + this.row_display_minimum + ", rows=" + this.rows + ", dot_color_light=" + this.dot_color_light + ", dot_color_dark=" + this.dot_color_dark + ")";
        }

        /* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerCategorySectionDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, IdlDecimal idlDecimal, int i2, List list, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.header_text = "";
            } else {
                this.header_text = str;
            }
            if ((i & 2) == 0) {
                this.header_subtitle = "";
            } else {
                this.header_subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.amount = "";
            } else {
                this.amount = str3;
            }
            if ((i & 8) == 0) {
                this.percentage = new IdlDecimal("");
            } else {
                this.percentage = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.row_display_minimum = 0;
            } else {
                this.row_display_minimum = i2;
            }
            if ((i & 32) == 0) {
                this.rows = CollectionsKt.emptyList();
            } else {
                this.rows = list;
            }
            if ((i & 64) == 0) {
                this.dot_color_light = "";
            } else {
                this.dot_color_light = str4;
            }
            if ((i & 128) == 0) {
                this.dot_color_dark = "";
            } else {
                this.dot_color_dark = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.header_text, "")) {
                output.encodeStringElement(serialDesc, 0, self.header_text);
            }
            if (!Intrinsics.areEqual(self.header_subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.header_subtitle);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 2, self.amount);
            }
            if (!Intrinsics.areEqual(self.percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.percentage);
            }
            int i = self.row_display_minimum;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.rows);
            }
            if (!Intrinsics.areEqual(self.dot_color_light, "")) {
                output.encodeStringElement(serialDesc, 6, self.dot_color_light);
            }
            if (Intrinsics.areEqual(self.dot_color_dark, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.dot_color_dark);
        }

        public Surrogate(String header_text, String header_subtitle, String amount, IdlDecimal percentage, int i, List<InvestmentsTrackerCategorySectionRowDetailsDto> rows, String dot_color_light, String dot_color_dark) {
            Intrinsics.checkNotNullParameter(header_text, "header_text");
            Intrinsics.checkNotNullParameter(header_subtitle, "header_subtitle");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(dot_color_light, "dot_color_light");
            Intrinsics.checkNotNullParameter(dot_color_dark, "dot_color_dark");
            this.header_text = header_text;
            this.header_subtitle = header_subtitle;
            this.amount = amount;
            this.percentage = percentage;
            this.row_display_minimum = i;
            this.rows = rows;
            this.dot_color_light = dot_color_light;
            this.dot_color_dark = dot_color_dark;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, IdlDecimal idlDecimal, int i, List list, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5);
        }

        public final String getHeader_text() {
            return this.header_text;
        }

        public final String getHeader_subtitle() {
            return this.header_subtitle;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final IdlDecimal getPercentage() {
            return this.percentage;
        }

        public final int getRow_display_minimum() {
            return this.row_display_minimum;
        }

        public final List<InvestmentsTrackerCategorySectionRowDetailsDto> getRows() {
            return this.rows;
        }

        public final String getDot_color_light() {
            return this.dot_color_light;
        }

        public final String getDot_color_dark() {
            return this.dot_color_dark;
        }
    }

    /* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerCategorySectionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerCategorySectionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerCategorySectionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerCategorySectionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerCategorySectionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerCategorySectionDetails> getProtoAdapter() {
            return InvestmentsTrackerCategorySectionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerCategorySectionDetailsDto getZeroValue() {
            return InvestmentsTrackerCategorySectionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerCategorySectionDetailsDto fromProto(InvestmentsTrackerCategorySectionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String header_text = proto.getHeader_text();
            String header_subtitle = proto.getHeader_subtitle();
            String amount = proto.getAmount();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPercentage());
            int row_display_minimum = proto.getRow_display_minimum();
            List<InvestmentsTrackerCategorySectionRowDetails> rows = proto.getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                arrayList.add(InvestmentsTrackerCategorySectionRowDetailsDto.INSTANCE.fromProto((InvestmentsTrackerCategorySectionRowDetails) it.next()));
            }
            return new InvestmentsTrackerCategorySectionDetailsDto(new Surrogate(header_text, header_subtitle, amount, idlDecimal, row_display_minimum, arrayList, proto.getDot_color_light(), proto.getDot_color_dark()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerCategorySectionDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InvestmentsTrackerCategorySectionDetailsDto(null, null, null, null, 0, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerCategorySectionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerCategorySectionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerCategorySectionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerCategorySectionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerCategorySectionDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetailsDto";
        }
    }
}
