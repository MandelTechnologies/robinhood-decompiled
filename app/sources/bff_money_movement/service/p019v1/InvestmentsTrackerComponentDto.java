package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentButtonDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentGetStartedDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceChartDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentStockCellDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellCardDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerManageExternalAccountsDetailsDto;
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

/* compiled from: InvestmentsTrackerComponentDto.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004LKMNB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¡\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u0006\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006O"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponent;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;)V", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "type", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;", "button_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;", "upsell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "category_section_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "metadata_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;", "stock_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;", "get_started_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "performance_chart_details", "", "id", "Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;", "manage_external_account_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "category_percentage_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "allocations_bar_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "upsell_card_details", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "getButton_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;", "getUpsell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;", "getCategory_section_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "getMetadata_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "getPerformance_chart_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "getManage_external_account_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;", "getCategory_percentage_cell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "getAllocations_bar_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "getUpsell_card_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentDto implements Dto3<InvestmentsTrackerComponent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentDto, InvestmentsTrackerComponent>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InvestmentsTrackerComponentTypeDto getType() {
        return this.surrogate.getType();
    }

    public final InvestmentsTrackerComponentButtonDetailsDto getButton_details() {
        return this.surrogate.getButton_details();
    }

    public final InvestmentsTrackerComponentUpsellDetailsDto getUpsell_details() {
        return this.surrogate.getUpsell_details();
    }

    public final InvestmentsTrackerCategorySectionDetailsDto getCategory_section_details() {
        return this.surrogate.getCategory_section_details();
    }

    public final InvestmentsTrackerComponentMetadataDetailsDto getMetadata_details() {
        return this.surrogate.getMetadata_details();
    }

    public final InvestmentsTrackerComponentPerformanceChartDetailsDto getPerformance_chart_details() {
        return this.surrogate.getPerformance_chart_details();
    }

    public final InvestmentsTrackerManageExternalAccountsDetailsDto getManage_external_account_details() {
        return this.surrogate.getManage_external_account_details();
    }

    public final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto getCategory_percentage_cell_details() {
        return this.surrogate.getCategory_percentage_cell_details();
    }

    public final InvestmentsTrackerComponentAllocationsBarDetailsDto getAllocations_bar_details() {
        return this.surrogate.getAllocations_bar_details();
    }

    public final InvestmentsTrackerComponentUpsellCardDto getUpsell_card_details() {
        return this.surrogate.getUpsell_card_details();
    }

    public /* synthetic */ InvestmentsTrackerComponentDto(InvestmentsTrackerComponentTypeDto investmentsTrackerComponentTypeDto, InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto, InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto, InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, String str, InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerComponentTypeDto.INSTANCE.getZeroValue() : investmentsTrackerComponentTypeDto, (i & 2) != 0 ? null : investmentsTrackerComponentButtonDetailsDto, (i & 4) != 0 ? null : investmentsTrackerComponentUpsellDetailsDto, (i & 8) != 0 ? null : investmentsTrackerCategorySectionDetailsDto, (i & 16) != 0 ? null : investmentsTrackerComponentMetadataDetailsDto, (i & 32) != 0 ? null : investmentsTrackerComponentStockCellDto, (i & 64) != 0 ? null : investmentsTrackerComponentGetStartedDetailsDto, (i & 128) != 0 ? null : investmentsTrackerComponentPerformanceChartDetailsDto, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? null : investmentsTrackerManageExternalAccountsDetailsDto, (i & 1024) != 0 ? null : investmentsTrackerComponentCategoryPercentageCellDetailsDto, (i & 2048) != 0 ? null : investmentsTrackerComponentAllocationsBarDetailsDto, (i & 4096) != 0 ? null : investmentsTrackerComponentUpsellCardDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentDto(InvestmentsTrackerComponentTypeDto type2, InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto, InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto, InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, String id, InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto) {
        this(new Surrogate(type2, investmentsTrackerComponentButtonDetailsDto, investmentsTrackerComponentUpsellDetailsDto, investmentsTrackerCategorySectionDetailsDto, investmentsTrackerComponentMetadataDetailsDto, investmentsTrackerComponentStockCellDto, investmentsTrackerComponentGetStartedDetailsDto, investmentsTrackerComponentPerformanceChartDetailsDto, id, investmentsTrackerManageExternalAccountsDetailsDto, investmentsTrackerComponentCategoryPercentageCellDetailsDto, investmentsTrackerComponentAllocationsBarDetailsDto, investmentsTrackerComponentUpsellCardDto));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponent toProto() {
        InvestmentsTrackerComponentType investmentsTrackerComponentType = (InvestmentsTrackerComponentType) this.surrogate.getType().toProto();
        InvestmentsTrackerComponentButtonDetailsDto button_details = this.surrogate.getButton_details();
        InvestmentsTrackerComponentButtonDetails proto = button_details != null ? button_details.toProto() : null;
        InvestmentsTrackerComponentUpsellDetailsDto upsell_details = this.surrogate.getUpsell_details();
        InvestmentsTrackerComponentUpsellDetails proto2 = upsell_details != null ? upsell_details.toProto() : null;
        InvestmentsTrackerCategorySectionDetailsDto category_section_details = this.surrogate.getCategory_section_details();
        InvestmentsTrackerCategorySectionDetails proto3 = category_section_details != null ? category_section_details.toProto() : null;
        InvestmentsTrackerComponentMetadataDetailsDto metadata_details = this.surrogate.getMetadata_details();
        InvestmentsTrackerComponentMetadataDetails proto4 = metadata_details != null ? metadata_details.toProto() : null;
        InvestmentsTrackerComponentStockCellDto stock_cell_details = this.surrogate.getStock_cell_details();
        InvestmentsTrackerComponentStockCell proto5 = stock_cell_details != null ? stock_cell_details.toProto() : null;
        InvestmentsTrackerComponentGetStartedDetailsDto get_started_details = this.surrogate.getGet_started_details();
        InvestmentsTrackerComponentGetStartedDetails proto6 = get_started_details != null ? get_started_details.toProto() : null;
        InvestmentsTrackerComponentPerformanceChartDetailsDto performance_chart_details = this.surrogate.getPerformance_chart_details();
        InvestmentsTrackerComponentPerformanceChartDetails proto7 = performance_chart_details != null ? performance_chart_details.toProto() : null;
        String id = this.surrogate.getId();
        InvestmentsTrackerManageExternalAccountsDetailsDto manage_external_account_details = this.surrogate.getManage_external_account_details();
        InvestmentsTrackerManageExternalAccountsDetails proto8 = manage_external_account_details != null ? manage_external_account_details.toProto() : null;
        InvestmentsTrackerComponentCategoryPercentageCellDetailsDto category_percentage_cell_details = this.surrogate.getCategory_percentage_cell_details();
        InvestmentsTrackerComponentCategoryPercentageCellDetails proto9 = category_percentage_cell_details != null ? category_percentage_cell_details.toProto() : null;
        InvestmentsTrackerComponentAllocationsBarDetailsDto allocations_bar_details = this.surrogate.getAllocations_bar_details();
        InvestmentsTrackerComponentAllocationsBarDetails proto10 = allocations_bar_details != null ? allocations_bar_details.toProto() : null;
        InvestmentsTrackerComponentUpsellCardDto upsell_card_details = this.surrogate.getUpsell_card_details();
        return new InvestmentsTrackerComponent(investmentsTrackerComponentType, proto, proto2, proto3, proto4, proto5, proto6, proto7, id, proto8, proto9, proto10, upsell_card_details != null ? upsell_card_details.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerComponentDto) && Intrinsics.areEqual(((InvestmentsTrackerComponentDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b9\b\u0083\b\u0018\u0000 h2\u00020\u0001:\u0002ihB\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u009d\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b<\u00108\u001a\u0004\b:\u0010;R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010=\u0012\u0004\b@\u00108\u001a\u0004\b>\u0010?R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bD\u00108\u001a\u0004\bB\u0010CR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010E\u0012\u0004\bH\u00108\u001a\u0004\bF\u0010GR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bL\u00108\u001a\u0004\bJ\u0010KR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010M\u0012\u0004\bP\u00108\u001a\u0004\bN\u0010OR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Q\u0012\u0004\bT\u00108\u001a\u0004\bR\u0010SR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010U\u0012\u0004\bW\u00108\u001a\u0004\bV\u0010-R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010X\u0012\u0004\b[\u00108\u001a\u0004\bY\u0010ZR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\\\u0012\u0004\b_\u00108\u001a\u0004\b]\u0010^R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010`\u0012\u0004\bc\u00108\u001a\u0004\ba\u0010bR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010d\u0012\u0004\bg\u00108\u001a\u0004\be\u0010f¨\u0006j"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "type", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;", "button_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;", "upsell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "category_section_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "metadata_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;", "stock_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;", "get_started_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "performance_chart_details", "", "id", "Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;", "manage_external_account_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "category_percentage_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "allocations_bar_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "upsell_card_details", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentTypeDto;", "getType$annotations", "()V", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;", "getButton_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetailsDto;", "getButton_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;", "getUpsell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetailsDto;", "getUpsell_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "getCategory_section_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "getCategory_section_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "getMetadata_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "getMetadata_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;", "getStock_cell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCellDto;", "getStock_cell_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;", "getGet_started_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetailsDto;", "getGet_started_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "getPerformance_chart_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetailsDto;", "getPerformance_chart_details$annotations", "Ljava/lang/String;", "getId", "getId$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;", "getManage_external_account_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetailsDto;", "getManage_external_account_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "getCategory_percentage_cell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "getCategory_percentage_cell_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "getAllocations_bar_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "getAllocations_bar_details$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "getUpsell_card_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "getUpsell_card_details$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InvestmentsTrackerComponentAllocationsBarDetailsDto allocations_bar_details;
        private final InvestmentsTrackerComponentButtonDetailsDto button_details;
        private final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto category_percentage_cell_details;
        private final InvestmentsTrackerCategorySectionDetailsDto category_section_details;
        private final InvestmentsTrackerComponentGetStartedDetailsDto get_started_details;
        private final String id;
        private final InvestmentsTrackerManageExternalAccountsDetailsDto manage_external_account_details;
        private final InvestmentsTrackerComponentMetadataDetailsDto metadata_details;
        private final InvestmentsTrackerComponentPerformanceChartDetailsDto performance_chart_details;
        private final InvestmentsTrackerComponentStockCellDto stock_cell_details;
        private final InvestmentsTrackerComponentTypeDto type;
        private final InvestmentsTrackerComponentUpsellCardDto upsell_card_details;
        private final InvestmentsTrackerComponentUpsellDetailsDto upsell_details;

        public Surrogate() {
            this((InvestmentsTrackerComponentTypeDto) null, (InvestmentsTrackerComponentButtonDetailsDto) null, (InvestmentsTrackerComponentUpsellDetailsDto) null, (InvestmentsTrackerCategorySectionDetailsDto) null, (InvestmentsTrackerComponentMetadataDetailsDto) null, (InvestmentsTrackerComponentStockCellDto) null, (InvestmentsTrackerComponentGetStartedDetailsDto) null, (InvestmentsTrackerComponentPerformanceChartDetailsDto) null, (String) null, (InvestmentsTrackerManageExternalAccountsDetailsDto) null, (InvestmentsTrackerComponentCategoryPercentageCellDetailsDto) null, (InvestmentsTrackerComponentAllocationsBarDetailsDto) null, (InvestmentsTrackerComponentUpsellCardDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.button_details, surrogate.button_details) && Intrinsics.areEqual(this.upsell_details, surrogate.upsell_details) && Intrinsics.areEqual(this.category_section_details, surrogate.category_section_details) && Intrinsics.areEqual(this.metadata_details, surrogate.metadata_details) && Intrinsics.areEqual(this.stock_cell_details, surrogate.stock_cell_details) && Intrinsics.areEqual(this.get_started_details, surrogate.get_started_details) && Intrinsics.areEqual(this.performance_chart_details, surrogate.performance_chart_details) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.manage_external_account_details, surrogate.manage_external_account_details) && Intrinsics.areEqual(this.category_percentage_cell_details, surrogate.category_percentage_cell_details) && Intrinsics.areEqual(this.allocations_bar_details, surrogate.allocations_bar_details) && Intrinsics.areEqual(this.upsell_card_details, surrogate.upsell_card_details);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto = this.button_details;
            int iHashCode2 = (iHashCode + (investmentsTrackerComponentButtonDetailsDto == null ? 0 : investmentsTrackerComponentButtonDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto = this.upsell_details;
            int iHashCode3 = (iHashCode2 + (investmentsTrackerComponentUpsellDetailsDto == null ? 0 : investmentsTrackerComponentUpsellDetailsDto.hashCode())) * 31;
            InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto = this.category_section_details;
            int iHashCode4 = (iHashCode3 + (investmentsTrackerCategorySectionDetailsDto == null ? 0 : investmentsTrackerCategorySectionDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto = this.metadata_details;
            int iHashCode5 = (iHashCode4 + (investmentsTrackerComponentMetadataDetailsDto == null ? 0 : investmentsTrackerComponentMetadataDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto = this.stock_cell_details;
            int iHashCode6 = (iHashCode5 + (investmentsTrackerComponentStockCellDto == null ? 0 : investmentsTrackerComponentStockCellDto.hashCode())) * 31;
            InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto = this.get_started_details;
            int iHashCode7 = (iHashCode6 + (investmentsTrackerComponentGetStartedDetailsDto == null ? 0 : investmentsTrackerComponentGetStartedDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto = this.performance_chart_details;
            int iHashCode8 = (((iHashCode7 + (investmentsTrackerComponentPerformanceChartDetailsDto == null ? 0 : investmentsTrackerComponentPerformanceChartDetailsDto.hashCode())) * 31) + this.id.hashCode()) * 31;
            InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto = this.manage_external_account_details;
            int iHashCode9 = (iHashCode8 + (investmentsTrackerManageExternalAccountsDetailsDto == null ? 0 : investmentsTrackerManageExternalAccountsDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto = this.category_percentage_cell_details;
            int iHashCode10 = (iHashCode9 + (investmentsTrackerComponentCategoryPercentageCellDetailsDto == null ? 0 : investmentsTrackerComponentCategoryPercentageCellDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto = this.allocations_bar_details;
            int iHashCode11 = (iHashCode10 + (investmentsTrackerComponentAllocationsBarDetailsDto == null ? 0 : investmentsTrackerComponentAllocationsBarDetailsDto.hashCode())) * 31;
            InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto = this.upsell_card_details;
            return iHashCode11 + (investmentsTrackerComponentUpsellCardDto != null ? investmentsTrackerComponentUpsellCardDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", button_details=" + this.button_details + ", upsell_details=" + this.upsell_details + ", category_section_details=" + this.category_section_details + ", metadata_details=" + this.metadata_details + ", stock_cell_details=" + this.stock_cell_details + ", get_started_details=" + this.get_started_details + ", performance_chart_details=" + this.performance_chart_details + ", id=" + this.id + ", manage_external_account_details=" + this.manage_external_account_details + ", category_percentage_cell_details=" + this.category_percentage_cell_details + ", allocations_bar_details=" + this.allocations_bar_details + ", upsell_card_details=" + this.upsell_card_details + ")";
        }

        /* compiled from: InvestmentsTrackerComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InvestmentsTrackerComponentTypeDto investmentsTrackerComponentTypeDto, InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto, InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto, InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, String str, InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? InvestmentsTrackerComponentTypeDto.INSTANCE.getZeroValue() : investmentsTrackerComponentTypeDto;
            if ((i & 2) == 0) {
                this.button_details = null;
            } else {
                this.button_details = investmentsTrackerComponentButtonDetailsDto;
            }
            if ((i & 4) == 0) {
                this.upsell_details = null;
            } else {
                this.upsell_details = investmentsTrackerComponentUpsellDetailsDto;
            }
            if ((i & 8) == 0) {
                this.category_section_details = null;
            } else {
                this.category_section_details = investmentsTrackerCategorySectionDetailsDto;
            }
            if ((i & 16) == 0) {
                this.metadata_details = null;
            } else {
                this.metadata_details = investmentsTrackerComponentMetadataDetailsDto;
            }
            if ((i & 32) == 0) {
                this.stock_cell_details = null;
            } else {
                this.stock_cell_details = investmentsTrackerComponentStockCellDto;
            }
            if ((i & 64) == 0) {
                this.get_started_details = null;
            } else {
                this.get_started_details = investmentsTrackerComponentGetStartedDetailsDto;
            }
            if ((i & 128) == 0) {
                this.performance_chart_details = null;
            } else {
                this.performance_chart_details = investmentsTrackerComponentPerformanceChartDetailsDto;
            }
            if ((i & 256) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 512) == 0) {
                this.manage_external_account_details = null;
            } else {
                this.manage_external_account_details = investmentsTrackerManageExternalAccountsDetailsDto;
            }
            if ((i & 1024) == 0) {
                this.category_percentage_cell_details = null;
            } else {
                this.category_percentage_cell_details = investmentsTrackerComponentCategoryPercentageCellDetailsDto;
            }
            if ((i & 2048) == 0) {
                this.allocations_bar_details = null;
            } else {
                this.allocations_bar_details = investmentsTrackerComponentAllocationsBarDetailsDto;
            }
            if ((i & 4096) == 0) {
                this.upsell_card_details = null;
            } else {
                this.upsell_card_details = investmentsTrackerComponentUpsellCardDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != InvestmentsTrackerComponentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, InvestmentsTrackerComponentTypeDto.Serializer.INSTANCE, self.type);
            }
            InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto = self.button_details;
            if (investmentsTrackerComponentButtonDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, InvestmentsTrackerComponentButtonDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentButtonDetailsDto);
            }
            InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto = self.upsell_details;
            if (investmentsTrackerComponentUpsellDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, InvestmentsTrackerComponentUpsellDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentUpsellDetailsDto);
            }
            InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto = self.category_section_details;
            if (investmentsTrackerCategorySectionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, InvestmentsTrackerCategorySectionDetailsDto.Serializer.INSTANCE, investmentsTrackerCategorySectionDetailsDto);
            }
            InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto = self.metadata_details;
            if (investmentsTrackerComponentMetadataDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, InvestmentsTrackerComponentMetadataDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentMetadataDetailsDto);
            }
            InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto = self.stock_cell_details;
            if (investmentsTrackerComponentStockCellDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, InvestmentsTrackerComponentStockCellDto.Serializer.INSTANCE, investmentsTrackerComponentStockCellDto);
            }
            InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto = self.get_started_details;
            if (investmentsTrackerComponentGetStartedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, InvestmentsTrackerComponentGetStartedDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentGetStartedDetailsDto);
            }
            InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto = self.performance_chart_details;
            if (investmentsTrackerComponentPerformanceChartDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, InvestmentsTrackerComponentPerformanceChartDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentPerformanceChartDetailsDto);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 8, self.id);
            }
            InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto = self.manage_external_account_details;
            if (investmentsTrackerManageExternalAccountsDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, InvestmentsTrackerManageExternalAccountsDetailsDto.Serializer.INSTANCE, investmentsTrackerManageExternalAccountsDetailsDto);
            }
            InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto = self.category_percentage_cell_details;
            if (investmentsTrackerComponentCategoryPercentageCellDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentCategoryPercentageCellDetailsDto);
            }
            InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto = self.allocations_bar_details;
            if (investmentsTrackerComponentAllocationsBarDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, InvestmentsTrackerComponentAllocationsBarDetailsDto.Serializer.INSTANCE, investmentsTrackerComponentAllocationsBarDetailsDto);
            }
            InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto = self.upsell_card_details;
            if (investmentsTrackerComponentUpsellCardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, InvestmentsTrackerComponentUpsellCardDto.Serializer.INSTANCE, investmentsTrackerComponentUpsellCardDto);
            }
        }

        public Surrogate(InvestmentsTrackerComponentTypeDto type2, InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto, InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto, InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, String id, InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(id, "id");
            this.type = type2;
            this.button_details = investmentsTrackerComponentButtonDetailsDto;
            this.upsell_details = investmentsTrackerComponentUpsellDetailsDto;
            this.category_section_details = investmentsTrackerCategorySectionDetailsDto;
            this.metadata_details = investmentsTrackerComponentMetadataDetailsDto;
            this.stock_cell_details = investmentsTrackerComponentStockCellDto;
            this.get_started_details = investmentsTrackerComponentGetStartedDetailsDto;
            this.performance_chart_details = investmentsTrackerComponentPerformanceChartDetailsDto;
            this.id = id;
            this.manage_external_account_details = investmentsTrackerManageExternalAccountsDetailsDto;
            this.category_percentage_cell_details = investmentsTrackerComponentCategoryPercentageCellDetailsDto;
            this.allocations_bar_details = investmentsTrackerComponentAllocationsBarDetailsDto;
            this.upsell_card_details = investmentsTrackerComponentUpsellCardDto;
        }

        public final InvestmentsTrackerComponentTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(InvestmentsTrackerComponentTypeDto investmentsTrackerComponentTypeDto, InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDto, InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDto, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDto, InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDto, InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDto, String str, InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDto, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InvestmentsTrackerComponentTypeDto.INSTANCE.getZeroValue() : investmentsTrackerComponentTypeDto, (i & 2) != 0 ? null : investmentsTrackerComponentButtonDetailsDto, (i & 4) != 0 ? null : investmentsTrackerComponentUpsellDetailsDto, (i & 8) != 0 ? null : investmentsTrackerCategorySectionDetailsDto, (i & 16) != 0 ? null : investmentsTrackerComponentMetadataDetailsDto, (i & 32) != 0 ? null : investmentsTrackerComponentStockCellDto, (i & 64) != 0 ? null : investmentsTrackerComponentGetStartedDetailsDto, (i & 128) != 0 ? null : investmentsTrackerComponentPerformanceChartDetailsDto, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? null : investmentsTrackerManageExternalAccountsDetailsDto, (i & 1024) != 0 ? null : investmentsTrackerComponentCategoryPercentageCellDetailsDto, (i & 2048) != 0 ? null : investmentsTrackerComponentAllocationsBarDetailsDto, (i & 4096) != 0 ? null : investmentsTrackerComponentUpsellCardDto);
        }

        public final InvestmentsTrackerComponentButtonDetailsDto getButton_details() {
            return this.button_details;
        }

        public final InvestmentsTrackerComponentUpsellDetailsDto getUpsell_details() {
            return this.upsell_details;
        }

        public final InvestmentsTrackerCategorySectionDetailsDto getCategory_section_details() {
            return this.category_section_details;
        }

        public final InvestmentsTrackerComponentMetadataDetailsDto getMetadata_details() {
            return this.metadata_details;
        }

        public final InvestmentsTrackerComponentStockCellDto getStock_cell_details() {
            return this.stock_cell_details;
        }

        public final InvestmentsTrackerComponentGetStartedDetailsDto getGet_started_details() {
            return this.get_started_details;
        }

        public final InvestmentsTrackerComponentPerformanceChartDetailsDto getPerformance_chart_details() {
            return this.performance_chart_details;
        }

        public final String getId() {
            return this.id;
        }

        public final InvestmentsTrackerManageExternalAccountsDetailsDto getManage_external_account_details() {
            return this.manage_external_account_details;
        }

        public final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto getCategory_percentage_cell_details() {
            return this.category_percentage_cell_details;
        }

        public final InvestmentsTrackerComponentAllocationsBarDetailsDto getAllocations_bar_details() {
            return this.allocations_bar_details;
        }

        public final InvestmentsTrackerComponentUpsellCardDto getUpsell_card_details() {
            return this.upsell_card_details;
        }
    }

    /* compiled from: InvestmentsTrackerComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerComponentDto, InvestmentsTrackerComponent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponent> getProtoAdapter() {
            return InvestmentsTrackerComponent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentDto getZeroValue() {
            return InvestmentsTrackerComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentDto fromProto(InvestmentsTrackerComponent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InvestmentsTrackerComponentTypeDto investmentsTrackerComponentTypeDtoFromProto = InvestmentsTrackerComponentTypeDto.INSTANCE.fromProto(proto.getType());
            InvestmentsTrackerComponentButtonDetails button_details = proto.getButton_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InvestmentsTrackerComponentButtonDetailsDto investmentsTrackerComponentButtonDetailsDtoFromProto = button_details != null ? InvestmentsTrackerComponentButtonDetailsDto.INSTANCE.fromProto(button_details) : null;
            InvestmentsTrackerComponentUpsellDetails upsell_details = proto.getUpsell_details();
            InvestmentsTrackerComponentUpsellDetailsDto investmentsTrackerComponentUpsellDetailsDtoFromProto = upsell_details != null ? InvestmentsTrackerComponentUpsellDetailsDto.INSTANCE.fromProto(upsell_details) : null;
            InvestmentsTrackerCategorySectionDetails category_section_details = proto.getCategory_section_details();
            InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDtoFromProto = category_section_details != null ? InvestmentsTrackerCategorySectionDetailsDto.INSTANCE.fromProto(category_section_details) : null;
            InvestmentsTrackerComponentMetadataDetails metadata_details = proto.getMetadata_details();
            InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDtoFromProto = metadata_details != null ? InvestmentsTrackerComponentMetadataDetailsDto.INSTANCE.fromProto(metadata_details) : null;
            InvestmentsTrackerComponentStockCell stock_cell_details = proto.getStock_cell_details();
            InvestmentsTrackerComponentStockCellDto investmentsTrackerComponentStockCellDtoFromProto = stock_cell_details != null ? InvestmentsTrackerComponentStockCellDto.INSTANCE.fromProto(stock_cell_details) : null;
            InvestmentsTrackerComponentGetStartedDetails get_started_details = proto.getGet_started_details();
            InvestmentsTrackerComponentGetStartedDetailsDto investmentsTrackerComponentGetStartedDetailsDtoFromProto = get_started_details != null ? InvestmentsTrackerComponentGetStartedDetailsDto.INSTANCE.fromProto(get_started_details) : null;
            InvestmentsTrackerComponentPerformanceChartDetails performance_chart_details = proto.getPerformance_chart_details();
            InvestmentsTrackerComponentPerformanceChartDetailsDto investmentsTrackerComponentPerformanceChartDetailsDtoFromProto = performance_chart_details != null ? InvestmentsTrackerComponentPerformanceChartDetailsDto.INSTANCE.fromProto(performance_chart_details) : null;
            String id = proto.getId();
            InvestmentsTrackerManageExternalAccountsDetails manage_external_account_details = proto.getManage_external_account_details();
            InvestmentsTrackerManageExternalAccountsDetailsDto investmentsTrackerManageExternalAccountsDetailsDtoFromProto = manage_external_account_details != null ? InvestmentsTrackerManageExternalAccountsDetailsDto.INSTANCE.fromProto(manage_external_account_details) : null;
            InvestmentsTrackerComponentCategoryPercentageCellDetails category_percentage_cell_details = proto.getCategory_percentage_cell_details();
            InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDtoFromProto = category_percentage_cell_details != null ? InvestmentsTrackerComponentCategoryPercentageCellDetailsDto.INSTANCE.fromProto(category_percentage_cell_details) : null;
            InvestmentsTrackerComponentAllocationsBarDetails allocations_bar_details = proto.getAllocations_bar_details();
            InvestmentsTrackerComponentAllocationsBarDetailsDto investmentsTrackerComponentAllocationsBarDetailsDtoFromProto = allocations_bar_details != null ? InvestmentsTrackerComponentAllocationsBarDetailsDto.INSTANCE.fromProto(allocations_bar_details) : null;
            InvestmentsTrackerComponentUpsellCard upsell_card_details = proto.getUpsell_card_details();
            return new InvestmentsTrackerComponentDto(new Surrogate(investmentsTrackerComponentTypeDtoFromProto, investmentsTrackerComponentButtonDetailsDtoFromProto, investmentsTrackerComponentUpsellDetailsDtoFromProto, investmentsTrackerCategorySectionDetailsDtoFromProto, investmentsTrackerComponentMetadataDetailsDtoFromProto, investmentsTrackerComponentStockCellDtoFromProto, investmentsTrackerComponentGetStartedDetailsDtoFromProto, investmentsTrackerComponentPerformanceChartDetailsDtoFromProto, id, investmentsTrackerManageExternalAccountsDetailsDtoFromProto, investmentsTrackerComponentCategoryPercentageCellDetailsDtoFromProto, investmentsTrackerComponentAllocationsBarDetailsDtoFromProto, upsell_card_details != null ? InvestmentsTrackerComponentUpsellCardDto.INSTANCE.fromProto(upsell_card_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestmentsTrackerComponentDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentDto";
        }
    }
}
