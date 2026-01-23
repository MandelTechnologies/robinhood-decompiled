package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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

/* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004?>@AB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006B"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;)V", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;", "type", "", "icon", "title", "subtitle", "amount", "Lcom/robinhood/idl/IdlDecimal;", "percentage", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "action", "id", "logo_url", "connect_text", "deeplink", "account_last_four", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;", "getIcon", "getTitle", "getSubtitle", "getAmount", "getPercentage", "()Lcom/robinhood/idl/IdlDecimal;", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "getId", "getLogo_url", "getConnect_text", "getDeeplink", "getAccount_last_four", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InvestmentsTrackerCategorySectionRowDetailsDto implements Dto3<InvestmentsTrackerCategorySectionRowDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerCategorySectionRowDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerCategorySectionRowDetailsDto, InvestmentsTrackerCategorySectionRowDetails>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerCategorySectionRowDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerCategorySectionRowDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerCategorySectionRowDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final IdlDecimal getPercentage() {
        return this.surrogate.getPercentage();
    }

    public final InvestmentsTrackerActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getLogo_url() {
        return this.surrogate.getLogo_url();
    }

    public final String getConnect_text() {
        return this.surrogate.getConnect_text();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getAccount_last_four() {
        return this.surrogate.getAccount_last_four();
    }

    public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
        return this.surrogate.getDisconnected_data();
    }

    public /* synthetic */ InvestmentsTrackerCategorySectionRowDetailsDto(InvestmentsTrackerCategorySectionRowTypeDto investmentsTrackerCategorySectionRowTypeDto, String str, String str2, String str3, String str4, IdlDecimal idlDecimal, InvestmentsTrackerActionDto investmentsTrackerActionDto, String str5, String str6, String str7, String str8, String str9, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerCategorySectionRowTypeDto.INSTANCE.getZeroValue() : investmentsTrackerCategorySectionRowTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? InvestmentsTrackerActionDto.INSTANCE.getZeroValue() : investmentsTrackerActionDto, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) == 0 ? str9 : "", (i & 4096) != 0 ? null : investmentsTrackerDisconnectedDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerCategorySectionRowDetailsDto(InvestmentsTrackerCategorySectionRowTypeDto type2, String icon, String title, String subtitle, String amount, IdlDecimal percentage, InvestmentsTrackerActionDto action, String id, String logo_url, String connect_text, String deeplink, String account_last_four, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
        this(new Surrogate(type2, icon, title, subtitle, amount, percentage, action, id, logo_url, connect_text, deeplink, account_last_four, investmentsTrackerDisconnectedDataDto));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(connect_text, "connect_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerCategorySectionRowDetails toProto() {
        InvestmentsTrackerCategorySectionRowType investmentsTrackerCategorySectionRowType = (InvestmentsTrackerCategorySectionRowType) this.surrogate.getType().toProto();
        String icon = this.surrogate.getIcon();
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String amount = this.surrogate.getAmount();
        String stringValue = this.surrogate.getPercentage().getStringValue();
        InvestmentsTrackerAction investmentsTrackerAction = (InvestmentsTrackerAction) this.surrogate.getAction().toProto();
        String id = this.surrogate.getId();
        String logo_url = this.surrogate.getLogo_url();
        String connect_text = this.surrogate.getConnect_text();
        String deeplink = this.surrogate.getDeeplink();
        String account_last_four = this.surrogate.getAccount_last_four();
        InvestmentsTrackerDisconnectedDataDto disconnected_data = this.surrogate.getDisconnected_data();
        return new InvestmentsTrackerCategorySectionRowDetails(investmentsTrackerCategorySectionRowType, icon, title, subtitle, amount, stringValue, investmentsTrackerAction, id, logo_url, connect_text, deeplink, account_last_four, disconnected_data != null ? disconnected_data.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[InvestmentsTrackerCategorySectionRowDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerCategorySectionRowDetailsDto) && Intrinsics.areEqual(((InvestmentsTrackerCategorySectionRowDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u009a\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u009d\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010(R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010(R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010(R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b<\u00103\u001a\u0004\b;\u0010(R/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b@\u00103\u001a\u0004\b>\u0010?R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u00103\u001a\u0004\bB\u0010CR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00104\u0012\u0004\bF\u00103\u001a\u0004\bE\u0010(R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00104\u0012\u0004\bH\u00103\u001a\u0004\bG\u0010(R \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00104\u0012\u0004\bJ\u00103\u001a\u0004\bI\u0010(R \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00104\u0012\u0004\bL\u00103\u001a\u0004\bK\u0010(R \u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00104\u0012\u0004\bN\u00103\u001a\u0004\bM\u0010(R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010O\u0012\u0004\bR\u00103\u001a\u0004\bP\u0010Q¨\u0006U"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;", "", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;", "type", "", "icon", "title", "subtitle", "amount", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "percentage", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "action", "id", "logo_url", "connect_text", "deeplink", "account_last_four", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowTypeDto;", "getType$annotations", "()V", "Ljava/lang/String;", "getIcon", "getIcon$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getAmount", "getAmount$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getPercentage", "()Lcom/robinhood/idl/IdlDecimal;", "getPercentage$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "getAction$annotations", "getId", "getId$annotations", "getLogo_url", "getLogo_url$annotations", "getConnect_text", "getConnect_text$annotations", "getDeeplink", "getDeeplink$annotations", "getAccount_last_four", "getAccount_last_four$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_last_four;
        private final InvestmentsTrackerActionDto action;
        private final String amount;
        private final String connect_text;
        private final String deeplink;
        private final InvestmentsTrackerDisconnectedDataDto disconnected_data;
        private final String icon;
        private final String id;
        private final String logo_url;
        private final IdlDecimal percentage;
        private final String subtitle;
        private final String title;
        private final InvestmentsTrackerCategorySectionRowTypeDto type;

        public Surrogate() {
            this((InvestmentsTrackerCategorySectionRowTypeDto) null, (String) null, (String) null, (String) null, (String) null, (IdlDecimal) null, (InvestmentsTrackerActionDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InvestmentsTrackerDisconnectedDataDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.percentage, surrogate.percentage) && this.action == surrogate.action && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.logo_url, surrogate.logo_url) && Intrinsics.areEqual(this.connect_text, surrogate.connect_text) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.account_last_four, surrogate.account_last_four) && Intrinsics.areEqual(this.disconnected_data, surrogate.disconnected_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.type.hashCode() * 31) + this.icon.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.action.hashCode()) * 31) + this.id.hashCode()) * 31) + this.logo_url.hashCode()) * 31) + this.connect_text.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.account_last_four.hashCode()) * 31;
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = this.disconnected_data;
            return iHashCode + (investmentsTrackerDisconnectedDataDto == null ? 0 : investmentsTrackerDisconnectedDataDto.hashCode());
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", amount=" + this.amount + ", percentage=" + this.percentage + ", action=" + this.action + ", id=" + this.id + ", logo_url=" + this.logo_url + ", connect_text=" + this.connect_text + ", deeplink=" + this.deeplink + ", account_last_four=" + this.account_last_four + ", disconnected_data=" + this.disconnected_data + ")";
        }

        /* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerCategorySectionRowDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InvestmentsTrackerCategorySectionRowTypeDto investmentsTrackerCategorySectionRowTypeDto, String str, String str2, String str3, String str4, IdlDecimal idlDecimal, InvestmentsTrackerActionDto investmentsTrackerActionDto, String str5, String str6, String str7, String str8, String str9, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? InvestmentsTrackerCategorySectionRowTypeDto.INSTANCE.getZeroValue() : investmentsTrackerCategorySectionRowTypeDto;
            if ((i & 2) == 0) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            if ((i & 4) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 8) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str3;
            }
            if ((i & 16) == 0) {
                this.amount = "";
            } else {
                this.amount = str4;
            }
            if ((i & 32) == 0) {
                this.percentage = new IdlDecimal("");
            } else {
                this.percentage = idlDecimal;
            }
            if ((i & 64) == 0) {
                this.action = InvestmentsTrackerActionDto.INSTANCE.getZeroValue();
            } else {
                this.action = investmentsTrackerActionDto;
            }
            if ((i & 128) == 0) {
                this.id = "";
            } else {
                this.id = str5;
            }
            if ((i & 256) == 0) {
                this.logo_url = "";
            } else {
                this.logo_url = str6;
            }
            if ((i & 512) == 0) {
                this.connect_text = "";
            } else {
                this.connect_text = str7;
            }
            if ((i & 1024) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str8;
            }
            if ((i & 2048) == 0) {
                this.account_last_four = "";
            } else {
                this.account_last_four = str9;
            }
            if ((i & 4096) == 0) {
                this.disconnected_data = null;
            } else {
                this.disconnected_data = investmentsTrackerDisconnectedDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != InvestmentsTrackerCategorySectionRowTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, InvestmentsTrackerCategorySectionRowTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.icon, "")) {
                output.encodeStringElement(serialDesc, 1, self.icon);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 2, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 3, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 4, self.amount);
            }
            if (!Intrinsics.areEqual(self.percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.percentage);
            }
            if (self.action != InvestmentsTrackerActionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, InvestmentsTrackerActionDto.Serializer.INSTANCE, self.action);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 7, self.id);
            }
            if (!Intrinsics.areEqual(self.logo_url, "")) {
                output.encodeStringElement(serialDesc, 8, self.logo_url);
            }
            if (!Intrinsics.areEqual(self.connect_text, "")) {
                output.encodeStringElement(serialDesc, 9, self.connect_text);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 10, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.account_last_four, "")) {
                output.encodeStringElement(serialDesc, 11, self.account_last_four);
            }
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = self.disconnected_data;
            if (investmentsTrackerDisconnectedDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, InvestmentsTrackerDisconnectedDataDto.Serializer.INSTANCE, investmentsTrackerDisconnectedDataDto);
            }
        }

        public Surrogate(InvestmentsTrackerCategorySectionRowTypeDto type2, String icon, String title, String subtitle, String amount, IdlDecimal percentage, InvestmentsTrackerActionDto action, String id, String logo_url, String connect_text, String deeplink, String account_last_four, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(logo_url, "logo_url");
            Intrinsics.checkNotNullParameter(connect_text, "connect_text");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
            this.type = type2;
            this.icon = icon;
            this.title = title;
            this.subtitle = subtitle;
            this.amount = amount;
            this.percentage = percentage;
            this.action = action;
            this.id = id;
            this.logo_url = logo_url;
            this.connect_text = connect_text;
            this.deeplink = deeplink;
            this.account_last_four = account_last_four;
            this.disconnected_data = investmentsTrackerDisconnectedDataDto;
        }

        public final InvestmentsTrackerCategorySectionRowTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(InvestmentsTrackerCategorySectionRowTypeDto investmentsTrackerCategorySectionRowTypeDto, String str, String str2, String str3, String str4, IdlDecimal idlDecimal, InvestmentsTrackerActionDto investmentsTrackerActionDto, String str5, String str6, String str7, String str8, String str9, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InvestmentsTrackerCategorySectionRowTypeDto.INSTANCE.getZeroValue() : investmentsTrackerCategorySectionRowTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? InvestmentsTrackerActionDto.INSTANCE.getZeroValue() : investmentsTrackerActionDto, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) == 0 ? str9 : "", (i & 4096) != 0 ? null : investmentsTrackerDisconnectedDataDto);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final IdlDecimal getPercentage() {
            return this.percentage;
        }

        public final InvestmentsTrackerActionDto getAction() {
            return this.action;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLogo_url() {
            return this.logo_url;
        }

        public final String getConnect_text() {
            return this.connect_text;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getAccount_last_four() {
            return this.account_last_four;
        }

        public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
            return this.disconnected_data;
        }
    }

    /* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerCategorySectionRowDetailsDto, InvestmentsTrackerCategorySectionRowDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerCategorySectionRowDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerCategorySectionRowDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerCategorySectionRowDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerCategorySectionRowDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerCategorySectionRowDetails> getProtoAdapter() {
            return InvestmentsTrackerCategorySectionRowDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerCategorySectionRowDetailsDto getZeroValue() {
            return InvestmentsTrackerCategorySectionRowDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerCategorySectionRowDetailsDto fromProto(InvestmentsTrackerCategorySectionRowDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InvestmentsTrackerCategorySectionRowTypeDto investmentsTrackerCategorySectionRowTypeDtoFromProto = InvestmentsTrackerCategorySectionRowTypeDto.INSTANCE.fromProto(proto.getType());
            String icon = proto.getIcon();
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String amount = proto.getAmount();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPercentage());
            InvestmentsTrackerActionDto investmentsTrackerActionDtoFromProto = InvestmentsTrackerActionDto.INSTANCE.fromProto(proto.getAction());
            String id = proto.getId();
            String logo_url = proto.getLogo_url();
            String connect_text = proto.getConnect_text();
            String deeplink = proto.getDeeplink();
            String account_last_four = proto.getAccount_last_four();
            InvestmentsTrackerDisconnectedData disconnected_data = proto.getDisconnected_data();
            return new InvestmentsTrackerCategorySectionRowDetailsDto(new Surrogate(investmentsTrackerCategorySectionRowTypeDtoFromProto, icon, title, subtitle, amount, idlDecimal, investmentsTrackerActionDtoFromProto, id, logo_url, connect_text, deeplink, account_last_four, disconnected_data != null ? InvestmentsTrackerDisconnectedDataDto.INSTANCE.fromProto(disconnected_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerCategorySectionRowDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestmentsTrackerCategorySectionRowDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerCategorySectionRowDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerCategorySectionRowDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerCategorySectionRowDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerCategorySectionRowDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerCategorySectionRowDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowDetailsDto";
        }
    }
}
