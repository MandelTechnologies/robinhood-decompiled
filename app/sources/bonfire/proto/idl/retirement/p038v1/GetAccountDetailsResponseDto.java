package bonfire.proto.idl.retirement.p038v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.retirement.p038v1.DataRowDto;
import bonfire.proto.idl.retirement.p038v1.GetAccountDetailsResponseDto;
import bonfire.proto.idl.retirement.p038v1.PortfolioAllocationDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: GetAccountDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EDFGB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÙ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010#R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010#R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108F¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010#R\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010#R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0011\u0010\u001d\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010#R\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bC\u0010#¨\u0006H"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;)V", "", "title", "broker_name", "connected_date", "account_balance", "contribution_type", "last_contribution_date", "account_fees", "", "Lbonfire/proto/idl/retirement/v1/PortfolioAllocationDto;", "portfolio_allocations", "Lbonfire/proto/idl/retirement/v1/DataRowDto;", "account_details_rows", "portfolio_allocation_rows", "connected_message", "plaid_disclaimer", "footer_disclaimer", "disconnect_button_label", "disconnect_deeplink", "account_options_button_label", "account_options_deeplink", "account_details_heading", "portfolio_allocation_heading", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;", "getTitle", "getBroker_name", "getConnected_date", "getAccount_balance", "getContribution_type", "getLast_contribution_date", "getAccount_fees", "getPortfolio_allocations", "()Ljava/util/List;", "getAccount_details_rows", "getPortfolio_allocation_rows", "getConnected_message", "getPlaid_disclaimer", "getFooter_disclaimer", "getAccount_details_heading", "getPortfolio_allocation_heading", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetAccountDetailsResponseDto implements Dto3<GetAccountDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountDetailsResponseDto, GetAccountDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getBroker_name() {
        return this.surrogate.getBroker_name();
    }

    public final String getConnected_date() {
        return this.surrogate.getConnected_date();
    }

    public final String getAccount_balance() {
        return this.surrogate.getAccount_balance();
    }

    public final String getContribution_type() {
        return this.surrogate.getContribution_type();
    }

    public final String getLast_contribution_date() {
        return this.surrogate.getLast_contribution_date();
    }

    public final String getAccount_fees() {
        return this.surrogate.getAccount_fees();
    }

    public final List<PortfolioAllocationDto> getPortfolio_allocations() {
        return this.surrogate.getPortfolio_allocations();
    }

    public final List<DataRowDto> getAccount_details_rows() {
        return this.surrogate.getAccount_details_rows();
    }

    public final List<DataRowDto> getPortfolio_allocation_rows() {
        return this.surrogate.getPortfolio_allocation_rows();
    }

    public final String getConnected_message() {
        return this.surrogate.getConnected_message();
    }

    public final String getPlaid_disclaimer() {
        return this.surrogate.getPlaid_disclaimer();
    }

    public final String getFooter_disclaimer() {
        return this.surrogate.getFooter_disclaimer();
    }

    public final String getAccount_details_heading() {
        return this.surrogate.getAccount_details_heading();
    }

    public final String getPortfolio_allocation_heading() {
        return this.surrogate.getPortfolio_allocation_heading();
    }

    public /* synthetic */ GetAccountDetailsResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? "" : str16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountDetailsResponseDto(String title, String broker_name, String connected_date, String account_balance, String contribution_type, String last_contribution_date, String account_fees, List<PortfolioAllocationDto> portfolio_allocations, List<DataRowDto> account_details_rows, List<DataRowDto> portfolio_allocation_rows, String connected_message, String plaid_disclaimer, String footer_disclaimer, String disconnect_button_label, String disconnect_deeplink, String account_options_button_label, String account_options_deeplink, String account_details_heading, String portfolio_allocation_heading) {
        this(new Surrogate(title, broker_name, connected_date, account_balance, contribution_type, last_contribution_date, account_fees, portfolio_allocations, account_details_rows, portfolio_allocation_rows, connected_message, plaid_disclaimer, footer_disclaimer, disconnect_button_label, disconnect_deeplink, account_options_button_label, account_options_deeplink, account_details_heading, portfolio_allocation_heading));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(broker_name, "broker_name");
        Intrinsics.checkNotNullParameter(connected_date, "connected_date");
        Intrinsics.checkNotNullParameter(account_balance, "account_balance");
        Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
        Intrinsics.checkNotNullParameter(last_contribution_date, "last_contribution_date");
        Intrinsics.checkNotNullParameter(account_fees, "account_fees");
        Intrinsics.checkNotNullParameter(portfolio_allocations, "portfolio_allocations");
        Intrinsics.checkNotNullParameter(account_details_rows, "account_details_rows");
        Intrinsics.checkNotNullParameter(portfolio_allocation_rows, "portfolio_allocation_rows");
        Intrinsics.checkNotNullParameter(connected_message, "connected_message");
        Intrinsics.checkNotNullParameter(plaid_disclaimer, "plaid_disclaimer");
        Intrinsics.checkNotNullParameter(footer_disclaimer, "footer_disclaimer");
        Intrinsics.checkNotNullParameter(disconnect_button_label, "disconnect_button_label");
        Intrinsics.checkNotNullParameter(disconnect_deeplink, "disconnect_deeplink");
        Intrinsics.checkNotNullParameter(account_options_button_label, "account_options_button_label");
        Intrinsics.checkNotNullParameter(account_options_deeplink, "account_options_deeplink");
        Intrinsics.checkNotNullParameter(account_details_heading, "account_details_heading");
        Intrinsics.checkNotNullParameter(portfolio_allocation_heading, "portfolio_allocation_heading");
    }

    @Override // com.robinhood.idl.Dto
    public GetAccountDetailsResponse toProto() {
        String title = this.surrogate.getTitle();
        String broker_name = this.surrogate.getBroker_name();
        String connected_date = this.surrogate.getConnected_date();
        String account_balance = this.surrogate.getAccount_balance();
        String contribution_type = this.surrogate.getContribution_type();
        String last_contribution_date = this.surrogate.getLast_contribution_date();
        String account_fees = this.surrogate.getAccount_fees();
        List<PortfolioAllocationDto> portfolio_allocations = this.surrogate.getPortfolio_allocations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocations, 10));
        Iterator<T> it = portfolio_allocations.iterator();
        while (it.hasNext()) {
            arrayList.add(((PortfolioAllocationDto) it.next()).toProto());
        }
        List<DataRowDto> account_details_rows = this.surrogate.getAccount_details_rows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_details_rows, 10));
        Iterator<T> it2 = account_details_rows.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DataRowDto) it2.next()).toProto());
        }
        List<DataRowDto> portfolio_allocation_rows = this.surrogate.getPortfolio_allocation_rows();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocation_rows, 10));
        Iterator<T> it3 = portfolio_allocation_rows.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((DataRowDto) it3.next()).toProto());
        }
        return new GetAccountDetailsResponse(title, broker_name, connected_date, account_balance, contribution_type, last_contribution_date, account_fees, arrayList, arrayList2, arrayList3, this.surrogate.getConnected_message(), this.surrogate.getPlaid_disclaimer(), this.surrogate.getFooter_disclaimer(), this.surrogate.getDisconnect_button_label(), this.surrogate.getDisconnect_deeplink(), this.surrogate.getAccount_options_button_label(), this.surrogate.getAccount_options_deeplink(), this.surrogate.getAccount_details_heading(), this.surrogate.getPortfolio_allocation_heading(), null, 524288, null);
    }

    public String toString() {
        return "[GetAccountDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountDetailsResponseDto) && Intrinsics.areEqual(((GetAccountDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b/\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002\\[B×\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aBë\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010*R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010*R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010*R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010*R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010*R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010*R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bD\u00104\u001a\u0004\bB\u0010CR&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bF\u00104\u001a\u0004\bE\u0010CR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010CR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00101\u0012\u0004\bJ\u00104\u001a\u0004\bI\u0010*R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00101\u0012\u0004\bL\u00104\u001a\u0004\bK\u0010*R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00101\u0012\u0004\bN\u00104\u001a\u0004\bM\u0010*R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00101\u0012\u0004\bP\u00104\u001a\u0004\bO\u0010*R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00101\u0012\u0004\bR\u00104\u001a\u0004\bQ\u0010*R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00101\u0012\u0004\bT\u00104\u001a\u0004\bS\u0010*R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00101\u0012\u0004\bV\u00104\u001a\u0004\bU\u0010*R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00101\u0012\u0004\bX\u00104\u001a\u0004\bW\u0010*R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00101\u0012\u0004\bZ\u00104\u001a\u0004\bY\u0010*¨\u0006]"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;", "", "", "title", "broker_name", "connected_date", "account_balance", "contribution_type", "last_contribution_date", "account_fees", "", "Lbonfire/proto/idl/retirement/v1/PortfolioAllocationDto;", "portfolio_allocations", "Lbonfire/proto/idl/retirement/v1/DataRowDto;", "account_details_rows", "portfolio_allocation_rows", "connected_message", "plaid_disclaimer", "footer_disclaimer", "disconnect_button_label", "disconnect_deeplink", "account_options_button_label", "account_options_deeplink", "account_details_heading", "portfolio_allocation_heading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_retirement_v1_externalRelease", "(Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBroker_name", "getBroker_name$annotations", "getConnected_date", "getConnected_date$annotations", "getAccount_balance", "getAccount_balance$annotations", "getContribution_type", "getContribution_type$annotations", "getLast_contribution_date", "getLast_contribution_date$annotations", "getAccount_fees", "getAccount_fees$annotations", "Ljava/util/List;", "getPortfolio_allocations", "()Ljava/util/List;", "getPortfolio_allocations$annotations", "getAccount_details_rows", "getAccount_details_rows$annotations", "getPortfolio_allocation_rows", "getPortfolio_allocation_rows$annotations", "getConnected_message", "getConnected_message$annotations", "getPlaid_disclaimer", "getPlaid_disclaimer$annotations", "getFooter_disclaimer", "getFooter_disclaimer$annotations", "getDisconnect_button_label", "getDisconnect_button_label$annotations", "getDisconnect_deeplink", "getDisconnect_deeplink$annotations", "getAccount_options_button_label", "getAccount_options_button_label$annotations", "getAccount_options_deeplink", "getAccount_options_deeplink$annotations", "getAccount_details_heading", "getAccount_details_heading$annotations", "getPortfolio_allocation_heading", "getPortfolio_allocation_heading$annotations", "Companion", "$serializer", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_balance;
        private final String account_details_heading;
        private final List<DataRowDto> account_details_rows;
        private final String account_fees;
        private final String account_options_button_label;
        private final String account_options_deeplink;
        private final String broker_name;
        private final String connected_date;
        private final String connected_message;
        private final String contribution_type;
        private final String disconnect_button_label;
        private final String disconnect_deeplink;
        private final String footer_disclaimer;
        private final String last_contribution_date;
        private final String plaid_disclaimer;
        private final String portfolio_allocation_heading;
        private final List<DataRowDto> portfolio_allocation_rows;
        private final List<PortfolioAllocationDto> portfolio_allocations;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PortfolioAllocationDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(DataRowDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(DataRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.broker_name, surrogate.broker_name) && Intrinsics.areEqual(this.connected_date, surrogate.connected_date) && Intrinsics.areEqual(this.account_balance, surrogate.account_balance) && Intrinsics.areEqual(this.contribution_type, surrogate.contribution_type) && Intrinsics.areEqual(this.last_contribution_date, surrogate.last_contribution_date) && Intrinsics.areEqual(this.account_fees, surrogate.account_fees) && Intrinsics.areEqual(this.portfolio_allocations, surrogate.portfolio_allocations) && Intrinsics.areEqual(this.account_details_rows, surrogate.account_details_rows) && Intrinsics.areEqual(this.portfolio_allocation_rows, surrogate.portfolio_allocation_rows) && Intrinsics.areEqual(this.connected_message, surrogate.connected_message) && Intrinsics.areEqual(this.plaid_disclaimer, surrogate.plaid_disclaimer) && Intrinsics.areEqual(this.footer_disclaimer, surrogate.footer_disclaimer) && Intrinsics.areEqual(this.disconnect_button_label, surrogate.disconnect_button_label) && Intrinsics.areEqual(this.disconnect_deeplink, surrogate.disconnect_deeplink) && Intrinsics.areEqual(this.account_options_button_label, surrogate.account_options_button_label) && Intrinsics.areEqual(this.account_options_deeplink, surrogate.account_options_deeplink) && Intrinsics.areEqual(this.account_details_heading, surrogate.account_details_heading) && Intrinsics.areEqual(this.portfolio_allocation_heading, surrogate.portfolio_allocation_heading);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.broker_name.hashCode()) * 31) + this.connected_date.hashCode()) * 31) + this.account_balance.hashCode()) * 31) + this.contribution_type.hashCode()) * 31) + this.last_contribution_date.hashCode()) * 31) + this.account_fees.hashCode()) * 31) + this.portfolio_allocations.hashCode()) * 31) + this.account_details_rows.hashCode()) * 31) + this.portfolio_allocation_rows.hashCode()) * 31) + this.connected_message.hashCode()) * 31) + this.plaid_disclaimer.hashCode()) * 31) + this.footer_disclaimer.hashCode()) * 31) + this.disconnect_button_label.hashCode()) * 31) + this.disconnect_deeplink.hashCode()) * 31) + this.account_options_button_label.hashCode()) * 31) + this.account_options_deeplink.hashCode()) * 31) + this.account_details_heading.hashCode()) * 31) + this.portfolio_allocation_heading.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", broker_name=" + this.broker_name + ", connected_date=" + this.connected_date + ", account_balance=" + this.account_balance + ", contribution_type=" + this.contribution_type + ", last_contribution_date=" + this.last_contribution_date + ", account_fees=" + this.account_fees + ", portfolio_allocations=" + this.portfolio_allocations + ", account_details_rows=" + this.account_details_rows + ", portfolio_allocation_rows=" + this.portfolio_allocation_rows + ", connected_message=" + this.connected_message + ", plaid_disclaimer=" + this.plaid_disclaimer + ", footer_disclaimer=" + this.footer_disclaimer + ", disconnect_button_label=" + this.disconnect_button_label + ", disconnect_deeplink=" + this.disconnect_deeplink + ", account_options_button_label=" + this.account_options_button_label + ", account_options_deeplink=" + this.account_options_deeplink + ", account_details_heading=" + this.account_details_heading + ", portfolio_allocation_heading=" + this.portfolio_allocation_heading + ")";
        }

        /* compiled from: GetAccountDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountDetailsResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.retirement.v1.GetAccountDetailsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountDetailsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.retirement.v1.GetAccountDetailsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountDetailsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.retirement.v1.GetAccountDetailsResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountDetailsResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.broker_name = "";
            } else {
                this.broker_name = str2;
            }
            if ((i & 4) == 0) {
                this.connected_date = "";
            } else {
                this.connected_date = str3;
            }
            if ((i & 8) == 0) {
                this.account_balance = "";
            } else {
                this.account_balance = str4;
            }
            if ((i & 16) == 0) {
                this.contribution_type = "";
            } else {
                this.contribution_type = str5;
            }
            if ((i & 32) == 0) {
                this.last_contribution_date = "";
            } else {
                this.last_contribution_date = str6;
            }
            if ((i & 64) == 0) {
                this.account_fees = "";
            } else {
                this.account_fees = str7;
            }
            if ((i & 128) == 0) {
                this.portfolio_allocations = CollectionsKt.emptyList();
            } else {
                this.portfolio_allocations = list;
            }
            if ((i & 256) == 0) {
                this.account_details_rows = CollectionsKt.emptyList();
            } else {
                this.account_details_rows = list2;
            }
            if ((i & 512) == 0) {
                this.portfolio_allocation_rows = CollectionsKt.emptyList();
            } else {
                this.portfolio_allocation_rows = list3;
            }
            if ((i & 1024) == 0) {
                this.connected_message = "";
            } else {
                this.connected_message = str8;
            }
            if ((i & 2048) == 0) {
                this.plaid_disclaimer = "";
            } else {
                this.plaid_disclaimer = str9;
            }
            if ((i & 4096) == 0) {
                this.footer_disclaimer = "";
            } else {
                this.footer_disclaimer = str10;
            }
            if ((i & 8192) == 0) {
                this.disconnect_button_label = "";
            } else {
                this.disconnect_button_label = str11;
            }
            if ((i & 16384) == 0) {
                this.disconnect_deeplink = "";
            } else {
                this.disconnect_deeplink = str12;
            }
            if ((32768 & i) == 0) {
                this.account_options_button_label = "";
            } else {
                this.account_options_button_label = str13;
            }
            if ((65536 & i) == 0) {
                this.account_options_deeplink = "";
            } else {
                this.account_options_deeplink = str14;
            }
            if ((131072 & i) == 0) {
                this.account_details_heading = "";
            } else {
                this.account_details_heading = str15;
            }
            if ((i & 262144) == 0) {
                this.portfolio_allocation_heading = "";
            } else {
                this.portfolio_allocation_heading = str16;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_retirement_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.broker_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.broker_name);
            }
            if (!Intrinsics.areEqual(self.connected_date, "")) {
                output.encodeStringElement(serialDesc, 2, self.connected_date);
            }
            if (!Intrinsics.areEqual(self.account_balance, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_balance);
            }
            if (!Intrinsics.areEqual(self.contribution_type, "")) {
                output.encodeStringElement(serialDesc, 4, self.contribution_type);
            }
            if (!Intrinsics.areEqual(self.last_contribution_date, "")) {
                output.encodeStringElement(serialDesc, 5, self.last_contribution_date);
            }
            if (!Intrinsics.areEqual(self.account_fees, "")) {
                output.encodeStringElement(serialDesc, 6, self.account_fees);
            }
            if (!Intrinsics.areEqual(self.portfolio_allocations, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.portfolio_allocations);
            }
            if (!Intrinsics.areEqual(self.account_details_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.account_details_rows);
            }
            if (!Intrinsics.areEqual(self.portfolio_allocation_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.portfolio_allocation_rows);
            }
            if (!Intrinsics.areEqual(self.connected_message, "")) {
                output.encodeStringElement(serialDesc, 10, self.connected_message);
            }
            if (!Intrinsics.areEqual(self.plaid_disclaimer, "")) {
                output.encodeStringElement(serialDesc, 11, self.plaid_disclaimer);
            }
            if (!Intrinsics.areEqual(self.footer_disclaimer, "")) {
                output.encodeStringElement(serialDesc, 12, self.footer_disclaimer);
            }
            if (!Intrinsics.areEqual(self.disconnect_button_label, "")) {
                output.encodeStringElement(serialDesc, 13, self.disconnect_button_label);
            }
            if (!Intrinsics.areEqual(self.disconnect_deeplink, "")) {
                output.encodeStringElement(serialDesc, 14, self.disconnect_deeplink);
            }
            if (!Intrinsics.areEqual(self.account_options_button_label, "")) {
                output.encodeStringElement(serialDesc, 15, self.account_options_button_label);
            }
            if (!Intrinsics.areEqual(self.account_options_deeplink, "")) {
                output.encodeStringElement(serialDesc, 16, self.account_options_deeplink);
            }
            if (!Intrinsics.areEqual(self.account_details_heading, "")) {
                output.encodeStringElement(serialDesc, 17, self.account_details_heading);
            }
            if (Intrinsics.areEqual(self.portfolio_allocation_heading, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 18, self.portfolio_allocation_heading);
        }

        public Surrogate(String title, String broker_name, String connected_date, String account_balance, String contribution_type, String last_contribution_date, String account_fees, List<PortfolioAllocationDto> portfolio_allocations, List<DataRowDto> account_details_rows, List<DataRowDto> portfolio_allocation_rows, String connected_message, String plaid_disclaimer, String footer_disclaimer, String disconnect_button_label, String disconnect_deeplink, String account_options_button_label, String account_options_deeplink, String account_details_heading, String portfolio_allocation_heading) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(broker_name, "broker_name");
            Intrinsics.checkNotNullParameter(connected_date, "connected_date");
            Intrinsics.checkNotNullParameter(account_balance, "account_balance");
            Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
            Intrinsics.checkNotNullParameter(last_contribution_date, "last_contribution_date");
            Intrinsics.checkNotNullParameter(account_fees, "account_fees");
            Intrinsics.checkNotNullParameter(portfolio_allocations, "portfolio_allocations");
            Intrinsics.checkNotNullParameter(account_details_rows, "account_details_rows");
            Intrinsics.checkNotNullParameter(portfolio_allocation_rows, "portfolio_allocation_rows");
            Intrinsics.checkNotNullParameter(connected_message, "connected_message");
            Intrinsics.checkNotNullParameter(plaid_disclaimer, "plaid_disclaimer");
            Intrinsics.checkNotNullParameter(footer_disclaimer, "footer_disclaimer");
            Intrinsics.checkNotNullParameter(disconnect_button_label, "disconnect_button_label");
            Intrinsics.checkNotNullParameter(disconnect_deeplink, "disconnect_deeplink");
            Intrinsics.checkNotNullParameter(account_options_button_label, "account_options_button_label");
            Intrinsics.checkNotNullParameter(account_options_deeplink, "account_options_deeplink");
            Intrinsics.checkNotNullParameter(account_details_heading, "account_details_heading");
            Intrinsics.checkNotNullParameter(portfolio_allocation_heading, "portfolio_allocation_heading");
            this.title = title;
            this.broker_name = broker_name;
            this.connected_date = connected_date;
            this.account_balance = account_balance;
            this.contribution_type = contribution_type;
            this.last_contribution_date = last_contribution_date;
            this.account_fees = account_fees;
            this.portfolio_allocations = portfolio_allocations;
            this.account_details_rows = account_details_rows;
            this.portfolio_allocation_rows = portfolio_allocation_rows;
            this.connected_message = connected_message;
            this.plaid_disclaimer = plaid_disclaimer;
            this.footer_disclaimer = footer_disclaimer;
            this.disconnect_button_label = disconnect_button_label;
            this.disconnect_deeplink = disconnect_deeplink;
            this.account_options_button_label = account_options_button_label;
            this.account_options_deeplink = account_options_deeplink;
            this.account_details_heading = account_details_heading;
            this.portfolio_allocation_heading = portfolio_allocation_heading;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? "" : str16);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBroker_name() {
            return this.broker_name;
        }

        public final String getConnected_date() {
            return this.connected_date;
        }

        public final String getAccount_balance() {
            return this.account_balance;
        }

        public final String getContribution_type() {
            return this.contribution_type;
        }

        public final String getLast_contribution_date() {
            return this.last_contribution_date;
        }

        public final String getAccount_fees() {
            return this.account_fees;
        }

        public final List<PortfolioAllocationDto> getPortfolio_allocations() {
            return this.portfolio_allocations;
        }

        public final List<DataRowDto> getAccount_details_rows() {
            return this.account_details_rows;
        }

        public final List<DataRowDto> getPortfolio_allocation_rows() {
            return this.portfolio_allocation_rows;
        }

        public final String getConnected_message() {
            return this.connected_message;
        }

        public final String getPlaid_disclaimer() {
            return this.plaid_disclaimer;
        }

        public final String getFooter_disclaimer() {
            return this.footer_disclaimer;
        }

        public final String getDisconnect_button_label() {
            return this.disconnect_button_label;
        }

        public final String getDisconnect_deeplink() {
            return this.disconnect_deeplink;
        }

        public final String getAccount_options_button_label() {
            return this.account_options_button_label;
        }

        public final String getAccount_options_deeplink() {
            return this.account_options_deeplink;
        }

        public final String getAccount_details_heading() {
            return this.account_details_heading;
        }

        public final String getPortfolio_allocation_heading() {
            return this.portfolio_allocation_heading;
        }
    }

    /* compiled from: GetAccountDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountDetailsResponseDto, GetAccountDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountDetailsResponse> getProtoAdapter() {
            return GetAccountDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountDetailsResponseDto getZeroValue() {
            return GetAccountDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountDetailsResponseDto fromProto(GetAccountDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String broker_name = proto.getBroker_name();
            String connected_date = proto.getConnected_date();
            String account_balance = proto.getAccount_balance();
            String contribution_type = proto.getContribution_type();
            String last_contribution_date = proto.getLast_contribution_date();
            String account_fees = proto.getAccount_fees();
            List<PortfolioAllocation> portfolio_allocations = proto.getPortfolio_allocations();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocations, 10));
            Iterator<T> it = portfolio_allocations.iterator();
            while (it.hasNext()) {
                arrayList.add(PortfolioAllocationDto.INSTANCE.fromProto((PortfolioAllocation) it.next()));
            }
            List<DataRow> account_details_rows = proto.getAccount_details_rows();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_details_rows, 10));
            Iterator<T> it2 = account_details_rows.iterator();
            while (it2.hasNext()) {
                arrayList2.add(DataRowDto.INSTANCE.fromProto((DataRow) it2.next()));
            }
            List<DataRow> portfolio_allocation_rows = proto.getPortfolio_allocation_rows();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocation_rows, 10));
            Iterator<T> it3 = portfolio_allocation_rows.iterator();
            while (it3.hasNext()) {
                arrayList3.add(DataRowDto.INSTANCE.fromProto((DataRow) it3.next()));
            }
            return new GetAccountDetailsResponseDto(new Surrogate(title, broker_name, connected_date, account_balance, contribution_type, last_contribution_date, account_fees, arrayList, arrayList2, arrayList3, proto.getConnected_message(), proto.getPlaid_disclaimer(), proto.getFooter_disclaimer(), proto.getDisconnect_button_label(), proto.getDisconnect_deeplink(), proto.getAccount_options_button_label(), proto.getAccount_options_deeplink(), proto.getAccount_details_heading(), proto.getPortfolio_allocation_heading()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.retirement.v1.GetAccountDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountDetailsResponseDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new GetAccountDetailsResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.retirement.v1.GetAccountDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.retirement.v1.GetAccountDetailsResponseDto";
        }
    }
}
