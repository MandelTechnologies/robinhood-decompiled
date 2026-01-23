package bff_money_movement.service.p019v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerComponent.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010;\u001a\u00020\u0002H\u0017J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0014H\u0016J¨\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006E"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponent;", "Lcom/squareup/wire/Message;", "", "type", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "button_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetails;", "upsell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetails;", "category_section_details", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "metadata_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetails;", "stock_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCell;", "get_started_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetails;", "performance_chart_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "id", "", "manage_external_account_details", "Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetails;", "category_percentage_cell_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "allocations_bar_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "upsell_card_details", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCard;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetails;Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCell;Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCard;Lokio/ByteString;)V", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentType;", "getButton_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentButtonDetails;", "getUpsell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetails;", "getCategory_section_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "getMetadata_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetails;", "getStock_cell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCell;", "getGet_started_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentGetStartedDetails;", "getPerformance_chart_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "getId", "()Ljava/lang/String;", "getManage_external_account_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerManageExternalAccountsDetails;", "getCategory_percentage_cell_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "getAllocations_bar_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "getUpsell_card_details", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCard;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponent extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponent> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetails#ADAPTER", jsonName = "allocationsBarDetails", schemaIndex = 11, tag = 12)
    private final InvestmentsTrackerComponentAllocationsBarDetails allocations_bar_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentButtonDetails#ADAPTER", jsonName = "buttonDetails", schemaIndex = 1, tag = 2)
    private final InvestmentsTrackerComponentButtonDetails button_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetails#ADAPTER", jsonName = "categoryPercentageCellDetails", schemaIndex = 10, tag = 11)
    private final InvestmentsTrackerComponentCategoryPercentageCellDetails category_percentage_cell_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetails#ADAPTER", jsonName = "categorySectionDetails", schemaIndex = 3, tag = 4)
    private final InvestmentsTrackerCategorySectionDetails category_section_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentGetStartedDetails#ADAPTER", jsonName = "getStartedDetails", schemaIndex = 6, tag = 7)
    private final InvestmentsTrackerComponentGetStartedDetails get_started_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String id;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerManageExternalAccountsDetails#ADAPTER", jsonName = "manageExternalAccountDetails", schemaIndex = 9, tag = 10)
    private final InvestmentsTrackerManageExternalAccountsDetails manage_external_account_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentMetadataDetails#ADAPTER", jsonName = "metadataDetails", schemaIndex = 4, tag = 5)
    private final InvestmentsTrackerComponentMetadataDetails metadata_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetails#ADAPTER", jsonName = "performanceChartDetails", schemaIndex = 7, tag = 8)
    private final InvestmentsTrackerComponentPerformanceChartDetails performance_chart_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentStockCell#ADAPTER", jsonName = "stockCellDetails", schemaIndex = 5, tag = 6)
    private final InvestmentsTrackerComponentStockCell stock_cell_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerComponentType type;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentUpsellCard#ADAPTER", jsonName = "upsellCardDetails", schemaIndex = 12, tag = 13)
    private final InvestmentsTrackerComponentUpsellCard upsell_card_details;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentUpsellDetails#ADAPTER", jsonName = "upsellDetails", schemaIndex = 2, tag = 3)
    private final InvestmentsTrackerComponentUpsellDetails upsell_details;

    public InvestmentsTrackerComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8450newBuilder();
    }

    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public /* synthetic */ InvestmentsTrackerComponent(InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails, InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails, InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails, InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetails, InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell, InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails, InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails, String str, InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetails, InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails, InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails, InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerComponentType.TYPE_UNSPECIFIED : investmentsTrackerComponentType, (i & 2) != 0 ? null : investmentsTrackerComponentButtonDetails, (i & 4) != 0 ? null : investmentsTrackerComponentUpsellDetails, (i & 8) != 0 ? null : investmentsTrackerCategorySectionDetails, (i & 16) != 0 ? null : investmentsTrackerComponentMetadataDetails, (i & 32) != 0 ? null : investmentsTrackerComponentStockCell, (i & 64) != 0 ? null : investmentsTrackerComponentGetStartedDetails, (i & 128) != 0 ? null : investmentsTrackerComponentPerformanceChartDetails, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? null : investmentsTrackerManageExternalAccountsDetails, (i & 1024) != 0 ? null : investmentsTrackerComponentCategoryPercentageCellDetails, (i & 2048) != 0 ? null : investmentsTrackerComponentAllocationsBarDetails, (i & 4096) == 0 ? investmentsTrackerComponentUpsellCard : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    public final InvestmentsTrackerComponentButtonDetails getButton_details() {
        return this.button_details;
    }

    public final InvestmentsTrackerComponentUpsellDetails getUpsell_details() {
        return this.upsell_details;
    }

    public final InvestmentsTrackerCategorySectionDetails getCategory_section_details() {
        return this.category_section_details;
    }

    public final InvestmentsTrackerComponentMetadataDetails getMetadata_details() {
        return this.metadata_details;
    }

    public final InvestmentsTrackerComponentStockCell getStock_cell_details() {
        return this.stock_cell_details;
    }

    public final InvestmentsTrackerComponentGetStartedDetails getGet_started_details() {
        return this.get_started_details;
    }

    public final InvestmentsTrackerComponentPerformanceChartDetails getPerformance_chart_details() {
        return this.performance_chart_details;
    }

    public final String getId() {
        return this.id;
    }

    public final InvestmentsTrackerManageExternalAccountsDetails getManage_external_account_details() {
        return this.manage_external_account_details;
    }

    public final InvestmentsTrackerComponentCategoryPercentageCellDetails getCategory_percentage_cell_details() {
        return this.category_percentage_cell_details;
    }

    public final InvestmentsTrackerComponentAllocationsBarDetails getAllocations_bar_details() {
        return this.allocations_bar_details;
    }

    public final InvestmentsTrackerComponentUpsellCard getUpsell_card_details() {
        return this.upsell_card_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponent(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails, InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails, InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails, InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetails, InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell, InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails, InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails, String id, InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetails, InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails, InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails, InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.button_details = investmentsTrackerComponentButtonDetails;
        this.upsell_details = investmentsTrackerComponentUpsellDetails;
        this.category_section_details = investmentsTrackerCategorySectionDetails;
        this.metadata_details = investmentsTrackerComponentMetadataDetails;
        this.stock_cell_details = investmentsTrackerComponentStockCell;
        this.get_started_details = investmentsTrackerComponentGetStartedDetails;
        this.performance_chart_details = investmentsTrackerComponentPerformanceChartDetails;
        this.id = id;
        this.manage_external_account_details = investmentsTrackerManageExternalAccountsDetails;
        this.category_percentage_cell_details = investmentsTrackerComponentCategoryPercentageCellDetails;
        this.allocations_bar_details = investmentsTrackerComponentAllocationsBarDetails;
        this.upsell_card_details = investmentsTrackerComponentUpsellCard;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8450newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponent)) {
            return false;
        }
        InvestmentsTrackerComponent investmentsTrackerComponent = (InvestmentsTrackerComponent) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponent.unknownFields()) && this.type == investmentsTrackerComponent.type && Intrinsics.areEqual(this.button_details, investmentsTrackerComponent.button_details) && Intrinsics.areEqual(this.upsell_details, investmentsTrackerComponent.upsell_details) && Intrinsics.areEqual(this.category_section_details, investmentsTrackerComponent.category_section_details) && Intrinsics.areEqual(this.metadata_details, investmentsTrackerComponent.metadata_details) && Intrinsics.areEqual(this.stock_cell_details, investmentsTrackerComponent.stock_cell_details) && Intrinsics.areEqual(this.get_started_details, investmentsTrackerComponent.get_started_details) && Intrinsics.areEqual(this.performance_chart_details, investmentsTrackerComponent.performance_chart_details) && Intrinsics.areEqual(this.id, investmentsTrackerComponent.id) && Intrinsics.areEqual(this.manage_external_account_details, investmentsTrackerComponent.manage_external_account_details) && Intrinsics.areEqual(this.category_percentage_cell_details, investmentsTrackerComponent.category_percentage_cell_details) && Intrinsics.areEqual(this.allocations_bar_details, investmentsTrackerComponent.allocations_bar_details) && Intrinsics.areEqual(this.upsell_card_details, investmentsTrackerComponent.upsell_card_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails = this.button_details;
        int iHashCode2 = (iHashCode + (investmentsTrackerComponentButtonDetails != null ? investmentsTrackerComponentButtonDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails = this.upsell_details;
        int iHashCode3 = (iHashCode2 + (investmentsTrackerComponentUpsellDetails != null ? investmentsTrackerComponentUpsellDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails = this.category_section_details;
        int iHashCode4 = (iHashCode3 + (investmentsTrackerCategorySectionDetails != null ? investmentsTrackerCategorySectionDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetails = this.metadata_details;
        int iHashCode5 = (iHashCode4 + (investmentsTrackerComponentMetadataDetails != null ? investmentsTrackerComponentMetadataDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell = this.stock_cell_details;
        int iHashCode6 = (iHashCode5 + (investmentsTrackerComponentStockCell != null ? investmentsTrackerComponentStockCell.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails = this.get_started_details;
        int iHashCode7 = (iHashCode6 + (investmentsTrackerComponentGetStartedDetails != null ? investmentsTrackerComponentGetStartedDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails = this.performance_chart_details;
        int iHashCode8 = (((iHashCode7 + (investmentsTrackerComponentPerformanceChartDetails != null ? investmentsTrackerComponentPerformanceChartDetails.hashCode() : 0)) * 37) + this.id.hashCode()) * 37;
        InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetails = this.manage_external_account_details;
        int iHashCode9 = (iHashCode8 + (investmentsTrackerManageExternalAccountsDetails != null ? investmentsTrackerManageExternalAccountsDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails = this.category_percentage_cell_details;
        int iHashCode10 = (iHashCode9 + (investmentsTrackerComponentCategoryPercentageCellDetails != null ? investmentsTrackerComponentCategoryPercentageCellDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails = this.allocations_bar_details;
        int iHashCode11 = (iHashCode10 + (investmentsTrackerComponentAllocationsBarDetails != null ? investmentsTrackerComponentAllocationsBarDetails.hashCode() : 0)) * 37;
        InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard = this.upsell_card_details;
        int iHashCode12 = iHashCode11 + (investmentsTrackerComponentUpsellCard != null ? investmentsTrackerComponentUpsellCard.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails = this.button_details;
        if (investmentsTrackerComponentButtonDetails != null) {
            arrayList.add("button_details=" + investmentsTrackerComponentButtonDetails);
        }
        InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails = this.upsell_details;
        if (investmentsTrackerComponentUpsellDetails != null) {
            arrayList.add("upsell_details=" + investmentsTrackerComponentUpsellDetails);
        }
        InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails = this.category_section_details;
        if (investmentsTrackerCategorySectionDetails != null) {
            arrayList.add("category_section_details=" + investmentsTrackerCategorySectionDetails);
        }
        InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetails = this.metadata_details;
        if (investmentsTrackerComponentMetadataDetails != null) {
            arrayList.add("metadata_details=" + investmentsTrackerComponentMetadataDetails);
        }
        InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell = this.stock_cell_details;
        if (investmentsTrackerComponentStockCell != null) {
            arrayList.add("stock_cell_details=" + investmentsTrackerComponentStockCell);
        }
        InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetails = this.get_started_details;
        if (investmentsTrackerComponentGetStartedDetails != null) {
            arrayList.add("get_started_details=" + investmentsTrackerComponentGetStartedDetails);
        }
        InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails = this.performance_chart_details;
        if (investmentsTrackerComponentPerformanceChartDetails != null) {
            arrayList.add("performance_chart_details=" + investmentsTrackerComponentPerformanceChartDetails);
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetails = this.manage_external_account_details;
        if (investmentsTrackerManageExternalAccountsDetails != null) {
            arrayList.add("manage_external_account_details=" + investmentsTrackerManageExternalAccountsDetails);
        }
        InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails = this.category_percentage_cell_details;
        if (investmentsTrackerComponentCategoryPercentageCellDetails != null) {
            arrayList.add("category_percentage_cell_details=" + investmentsTrackerComponentCategoryPercentageCellDetails);
        }
        InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetails = this.allocations_bar_details;
        if (investmentsTrackerComponentAllocationsBarDetails != null) {
            arrayList.add("allocations_bar_details=" + investmentsTrackerComponentAllocationsBarDetails);
        }
        InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard = this.upsell_card_details;
        if (investmentsTrackerComponentUpsellCard != null) {
            arrayList.add("upsell_card_details=" + investmentsTrackerComponentUpsellCard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponent{", "}", 0, null, null, 56, null);
    }

    public final InvestmentsTrackerComponent copy(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentButtonDetails button_details, InvestmentsTrackerComponentUpsellDetails upsell_details, InvestmentsTrackerCategorySectionDetails category_section_details, InvestmentsTrackerComponentMetadataDetails metadata_details, InvestmentsTrackerComponentStockCell stock_cell_details, InvestmentsTrackerComponentGetStartedDetails get_started_details, InvestmentsTrackerComponentPerformanceChartDetails performance_chart_details, String id, InvestmentsTrackerManageExternalAccountsDetails manage_external_account_details, InvestmentsTrackerComponentCategoryPercentageCellDetails category_percentage_cell_details, InvestmentsTrackerComponentAllocationsBarDetails allocations_bar_details, InvestmentsTrackerComponentUpsellCard upsell_card_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponent(type2, button_details, upsell_details, category_section_details, metadata_details, stock_cell_details, get_started_details, performance_chart_details, id, manage_external_account_details, category_percentage_cell_details, allocations_bar_details, upsell_card_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != InvestmentsTrackerComponentType.TYPE_UNSPECIFIED) {
                    size += InvestmentsTrackerComponentType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                int iEncodedSizeWithTag = size + InvestmentsTrackerComponentButtonDetails.ADAPTER.encodedSizeWithTag(2, value.getButton_details()) + InvestmentsTrackerComponentUpsellDetails.ADAPTER.encodedSizeWithTag(3, value.getUpsell_details()) + InvestmentsTrackerCategorySectionDetails.ADAPTER.encodedSizeWithTag(4, value.getCategory_section_details()) + InvestmentsTrackerComponentMetadataDetails.ADAPTER.encodedSizeWithTag(5, value.getMetadata_details()) + InvestmentsTrackerComponentStockCell.ADAPTER.encodedSizeWithTag(6, value.getStock_cell_details()) + InvestmentsTrackerComponentGetStartedDetails.ADAPTER.encodedSizeWithTag(7, value.getGet_started_details()) + InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER.encodedSizeWithTag(8, value.getPerformance_chart_details());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getId());
                }
                return iEncodedSizeWithTag + InvestmentsTrackerManageExternalAccountsDetails.ADAPTER.encodedSizeWithTag(10, value.getManage_external_account_details()) + InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER.encodedSizeWithTag(11, value.getCategory_percentage_cell_details()) + InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER.encodedSizeWithTag(12, value.getAllocations_bar_details()) + InvestmentsTrackerComponentUpsellCard.ADAPTER.encodedSizeWithTag(13, value.getUpsell_card_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != InvestmentsTrackerComponentType.TYPE_UNSPECIFIED) {
                    InvestmentsTrackerComponentType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                InvestmentsTrackerComponentButtonDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getButton_details());
                InvestmentsTrackerComponentUpsellDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpsell_details());
                InvestmentsTrackerCategorySectionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getCategory_section_details());
                InvestmentsTrackerComponentMetadataDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getMetadata_details());
                InvestmentsTrackerComponentStockCell.ADAPTER.encodeWithTag(writer, 6, (int) value.getStock_cell_details());
                InvestmentsTrackerComponentGetStartedDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getGet_started_details());
                InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getPerformance_chart_details());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getId());
                }
                InvestmentsTrackerManageExternalAccountsDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getManage_external_account_details());
                InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getCategory_percentage_cell_details());
                InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER.encodeWithTag(writer, 12, (int) value.getAllocations_bar_details());
                InvestmentsTrackerComponentUpsellCard.ADAPTER.encodeWithTag(writer, 13, (int) value.getUpsell_card_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerComponentUpsellCard.ADAPTER.encodeWithTag(writer, 13, (int) value.getUpsell_card_details());
                InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER.encodeWithTag(writer, 12, (int) value.getAllocations_bar_details());
                InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getCategory_percentage_cell_details());
                InvestmentsTrackerManageExternalAccountsDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getManage_external_account_details());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getId());
                }
                InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getPerformance_chart_details());
                InvestmentsTrackerComponentGetStartedDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getGet_started_details());
                InvestmentsTrackerComponentStockCell.ADAPTER.encodeWithTag(writer, 6, (int) value.getStock_cell_details());
                InvestmentsTrackerComponentMetadataDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getMetadata_details());
                InvestmentsTrackerCategorySectionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getCategory_section_details());
                InvestmentsTrackerComponentUpsellDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpsell_details());
                InvestmentsTrackerComponentButtonDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getButton_details());
                if (value.getType() != InvestmentsTrackerComponentType.TYPE_UNSPECIFIED) {
                    InvestmentsTrackerComponentType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponent decode(ProtoReader reader) throws IOException {
                InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetails;
                InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails;
                InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails;
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InvestmentsTrackerComponentType investmentsTrackerComponentTypeDecode = investmentsTrackerComponentType;
                InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetailsDecode = null;
                InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetailsDecode = null;
                InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetailsDecode = null;
                InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCellDecode = null;
                InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetailsDecode = null;
                InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetailsDecode = null;
                InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetailsDecode = null;
                InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetailsDecode = null;
                InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetailsDecode = null;
                InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCardDecode = null;
                String strDecode = "";
                InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    investmentsTrackerComponentTypeDecode = InvestmentsTrackerComponentType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    investmentsTrackerComponentButtonDetails = investmentsTrackerComponentButtonDetailsDecode;
                                    investmentsTrackerComponentUpsellDetails = investmentsTrackerComponentUpsellDetailsDecode;
                                    investmentsTrackerCategorySectionDetails = investmentsTrackerCategorySectionDetailsDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                investmentsTrackerComponentButtonDetailsDecode = InvestmentsTrackerComponentButtonDetails.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                investmentsTrackerComponentUpsellDetailsDecode = InvestmentsTrackerComponentUpsellDetails.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                investmentsTrackerCategorySectionDetailsDecode = InvestmentsTrackerCategorySectionDetails.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                investmentsTrackerComponentMetadataDetailsDecode = InvestmentsTrackerComponentMetadataDetails.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                investmentsTrackerComponentStockCellDecode = InvestmentsTrackerComponentStockCell.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                investmentsTrackerComponentGetStartedDetailsDecode = InvestmentsTrackerComponentGetStartedDetails.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                investmentsTrackerComponentPerformanceChartDetailsDecode = InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                investmentsTrackerManageExternalAccountsDetailsDecode = InvestmentsTrackerManageExternalAccountsDetails.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                investmentsTrackerComponentCategoryPercentageCellDetailsDecode = InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                investmentsTrackerComponentAllocationsBarDetailsDecode = InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                investmentsTrackerComponentUpsellCardDecode = InvestmentsTrackerComponentUpsellCard.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                investmentsTrackerComponentButtonDetails = investmentsTrackerComponentButtonDetailsDecode;
                                investmentsTrackerComponentUpsellDetails = investmentsTrackerComponentUpsellDetailsDecode;
                                investmentsTrackerCategorySectionDetails = investmentsTrackerCategorySectionDetailsDecode;
                                break;
                        }
                        investmentsTrackerComponentButtonDetailsDecode = investmentsTrackerComponentButtonDetails;
                        investmentsTrackerCategorySectionDetailsDecode = investmentsTrackerCategorySectionDetails;
                        investmentsTrackerComponentUpsellDetailsDecode = investmentsTrackerComponentUpsellDetails;
                    } else {
                        return new InvestmentsTrackerComponent(investmentsTrackerComponentTypeDecode, investmentsTrackerComponentButtonDetailsDecode, investmentsTrackerComponentUpsellDetailsDecode, investmentsTrackerCategorySectionDetailsDecode, investmentsTrackerComponentMetadataDetailsDecode, investmentsTrackerComponentStockCellDecode, investmentsTrackerComponentGetStartedDetailsDecode, investmentsTrackerComponentPerformanceChartDetailsDecode, strDecode, investmentsTrackerManageExternalAccountsDetailsDecode, investmentsTrackerComponentCategoryPercentageCellDetailsDecode, investmentsTrackerComponentAllocationsBarDetailsDecode, investmentsTrackerComponentUpsellCardDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponent redact(InvestmentsTrackerComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerComponentButtonDetails button_details = value.getButton_details();
                InvestmentsTrackerComponentButtonDetails investmentsTrackerComponentButtonDetailsRedact = button_details != null ? InvestmentsTrackerComponentButtonDetails.ADAPTER.redact(button_details) : null;
                InvestmentsTrackerComponentUpsellDetails upsell_details = value.getUpsell_details();
                InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetailsRedact = upsell_details != null ? InvestmentsTrackerComponentUpsellDetails.ADAPTER.redact(upsell_details) : null;
                InvestmentsTrackerCategorySectionDetails category_section_details = value.getCategory_section_details();
                InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetailsRedact = category_section_details != null ? InvestmentsTrackerCategorySectionDetails.ADAPTER.redact(category_section_details) : null;
                InvestmentsTrackerComponentMetadataDetails metadata_details = value.getMetadata_details();
                InvestmentsTrackerComponentMetadataDetails investmentsTrackerComponentMetadataDetailsRedact = metadata_details != null ? InvestmentsTrackerComponentMetadataDetails.ADAPTER.redact(metadata_details) : null;
                InvestmentsTrackerComponentStockCell stock_cell_details = value.getStock_cell_details();
                InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCellRedact = stock_cell_details != null ? InvestmentsTrackerComponentStockCell.ADAPTER.redact(stock_cell_details) : null;
                InvestmentsTrackerComponentGetStartedDetails get_started_details = value.getGet_started_details();
                InvestmentsTrackerComponentGetStartedDetails investmentsTrackerComponentGetStartedDetailsRedact = get_started_details != null ? InvestmentsTrackerComponentGetStartedDetails.ADAPTER.redact(get_started_details) : null;
                InvestmentsTrackerComponentPerformanceChartDetails performance_chart_details = value.getPerformance_chart_details();
                InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetailsRedact = performance_chart_details != null ? InvestmentsTrackerComponentPerformanceChartDetails.ADAPTER.redact(performance_chart_details) : null;
                InvestmentsTrackerManageExternalAccountsDetails manage_external_account_details = value.getManage_external_account_details();
                InvestmentsTrackerManageExternalAccountsDetails investmentsTrackerManageExternalAccountsDetailsRedact = manage_external_account_details != null ? InvestmentsTrackerManageExternalAccountsDetails.ADAPTER.redact(manage_external_account_details) : null;
                InvestmentsTrackerComponentCategoryPercentageCellDetails category_percentage_cell_details = value.getCategory_percentage_cell_details();
                InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetailsRedact = category_percentage_cell_details != null ? InvestmentsTrackerComponentCategoryPercentageCellDetails.ADAPTER.redact(category_percentage_cell_details) : null;
                InvestmentsTrackerComponentAllocationsBarDetails allocations_bar_details = value.getAllocations_bar_details();
                InvestmentsTrackerComponentAllocationsBarDetails investmentsTrackerComponentAllocationsBarDetailsRedact = allocations_bar_details != null ? InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER.redact(allocations_bar_details) : null;
                InvestmentsTrackerComponentUpsellCard upsell_card_details = value.getUpsell_card_details();
                return value.copy((EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 1) != 0 ? value.type : null, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 2) != 0 ? value.button_details : investmentsTrackerComponentButtonDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 4) != 0 ? value.upsell_details : investmentsTrackerComponentUpsellDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 8) != 0 ? value.category_section_details : investmentsTrackerCategorySectionDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 16) != 0 ? value.metadata_details : investmentsTrackerComponentMetadataDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 32) != 0 ? value.stock_cell_details : investmentsTrackerComponentStockCellRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 64) != 0 ? value.get_started_details : investmentsTrackerComponentGetStartedDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 128) != 0 ? value.performance_chart_details : investmentsTrackerComponentPerformanceChartDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 256) != 0 ? value.id : null, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 512) != 0 ? value.manage_external_account_details : investmentsTrackerManageExternalAccountsDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 1024) != 0 ? value.category_percentage_cell_details : investmentsTrackerComponentCategoryPercentageCellDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 2048) != 0 ? value.allocations_bar_details : investmentsTrackerComponentAllocationsBarDetailsRedact, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 4096) != 0 ? value.upsell_card_details : upsell_card_details != null ? InvestmentsTrackerComponentUpsellCard.ADAPTER.redact(upsell_card_details) : null, (EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
