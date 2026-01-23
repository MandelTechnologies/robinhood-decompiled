package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
import com.robinhood.rosetta.eventlogging.EquityOrderMetaDto;
import com.robinhood.rosetta.eventlogging.QuoteDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: EquityOrderMetaDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00072345678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0015JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate;)V", "existing_order_id", "", "source", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "ipo_access_status", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "quote", "Lcom/robinhood/rosetta/eventlogging/QuoteDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "order_to_replace_id", "order_form_type", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;Lcom/robinhood/rosetta/eventlogging/QuoteDto;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;)V", "getExisting_order_id", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "getIpo_access_status", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "getQuote", "()Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getOrder_to_replace_id", "getOrder_form_type", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceDto", "IPOAccessStatusDto", "OrderFormTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class EquityOrderMetaDto implements Dto3<EquityOrderMeta>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityOrderMetaDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOrderMetaDto, EquityOrderMeta>> binaryBase64Serializer$delegate;
    private static final EquityOrderMetaDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityOrderMetaDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOrderMetaDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getExisting_order_id() {
        return this.surrogate.getExisting_order_id();
    }

    public final SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public final IPOAccessStatusDto getIpo_access_status() {
        return this.surrogate.getIpo_access_status();
    }

    public final QuoteDto getQuote() {
        return this.surrogate.getQuote();
    }

    public final BrokerageAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getOrder_to_replace_id() {
        return this.surrogate.getOrder_to_replace_id();
    }

    public final OrderFormTypeDto getOrder_form_type() {
        return this.surrogate.getOrder_form_type();
    }

    public /* synthetic */ EquityOrderMetaDto(String str, SourceDto sourceDto, IPOAccessStatusDto iPOAccessStatusDto, QuoteDto quoteDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str2, OrderFormTypeDto orderFormTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 4) != 0 ? IPOAccessStatusDto.INSTANCE.getZeroValue() : iPOAccessStatusDto, (i & 8) != 0 ? null : quoteDto, (i & 16) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? OrderFormTypeDto.INSTANCE.getZeroValue() : orderFormTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityOrderMetaDto(String existing_order_id, SourceDto source, IPOAccessStatusDto ipo_access_status, QuoteDto quoteDto, BrokerageAccountTypeDto account_type, String order_to_replace_id, OrderFormTypeDto order_form_type) {
        this(new Surrogate(existing_order_id, source, ipo_access_status, quoteDto, account_type, order_to_replace_id, order_form_type));
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
    }

    public static /* synthetic */ EquityOrderMetaDto copy$default(EquityOrderMetaDto equityOrderMetaDto, String str, SourceDto sourceDto, IPOAccessStatusDto iPOAccessStatusDto, QuoteDto quoteDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str2, OrderFormTypeDto orderFormTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityOrderMetaDto.surrogate.getExisting_order_id();
        }
        if ((i & 2) != 0) {
            sourceDto = equityOrderMetaDto.surrogate.getSource();
        }
        if ((i & 4) != 0) {
            iPOAccessStatusDto = equityOrderMetaDto.surrogate.getIpo_access_status();
        }
        if ((i & 8) != 0) {
            quoteDto = equityOrderMetaDto.surrogate.getQuote();
        }
        if ((i & 16) != 0) {
            brokerageAccountTypeDto = equityOrderMetaDto.surrogate.getAccount_type();
        }
        if ((i & 32) != 0) {
            str2 = equityOrderMetaDto.surrogate.getOrder_to_replace_id();
        }
        if ((i & 64) != 0) {
            orderFormTypeDto = equityOrderMetaDto.surrogate.getOrder_form_type();
        }
        String str3 = str2;
        OrderFormTypeDto orderFormTypeDto2 = orderFormTypeDto;
        BrokerageAccountTypeDto brokerageAccountTypeDto2 = brokerageAccountTypeDto;
        IPOAccessStatusDto iPOAccessStatusDto2 = iPOAccessStatusDto;
        return equityOrderMetaDto.copy(str, sourceDto, iPOAccessStatusDto2, quoteDto, brokerageAccountTypeDto2, str3, orderFormTypeDto2);
    }

    public final EquityOrderMetaDto copy(String existing_order_id, SourceDto source, IPOAccessStatusDto ipo_access_status, QuoteDto quote, BrokerageAccountTypeDto account_type, String order_to_replace_id, OrderFormTypeDto order_form_type) {
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        return new EquityOrderMetaDto(new Surrogate(existing_order_id, source, ipo_access_status, quote, account_type, order_to_replace_id, order_form_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityOrderMeta toProto() {
        String existing_order_id = this.surrogate.getExisting_order_id();
        EquityOrderMeta.Source source = (EquityOrderMeta.Source) this.surrogate.getSource().toProto();
        EquityOrderMeta.IPOAccessStatus iPOAccessStatus = (EquityOrderMeta.IPOAccessStatus) this.surrogate.getIpo_access_status().toProto();
        QuoteDto quote = this.surrogate.getQuote();
        return new EquityOrderMeta(existing_order_id, source, iPOAccessStatus, quote != null ? quote.toProto() : null, (BrokerageAccountType) this.surrogate.getAccount_type().toProto(), this.surrogate.getOrder_to_replace_id(), (EquityOrderMeta.OrderFormType) this.surrogate.getOrder_form_type().toProto(), null, 128, null);
    }

    public String toString() {
        return "[EquityOrderMetaDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityOrderMetaDto) && Intrinsics.areEqual(((EquityOrderMetaDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@ABO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003JQ\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0012HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate;", "", "existing_order_id", "", "source", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "ipo_access_status", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "quote", "Lcom/robinhood/rosetta/eventlogging/QuoteDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountTypeDto;", "order_to_replace_id", "order_form_type", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;Lcom/robinhood/rosetta/eventlogging/QuoteDto;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;Lcom/robinhood/rosetta/eventlogging/QuoteDto;Lrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExisting_order_id$annotations", "()V", "getExisting_order_id", "()Ljava/lang/String;", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "getIpo_access_status$annotations", "getIpo_access_status", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "getQuote$annotations", "getQuote", "()Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "getAccount_type$annotations", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getOrder_to_replace_id$annotations", "getOrder_to_replace_id", "getOrder_form_type$annotations", "getOrder_form_type", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountTypeDto account_type;
        private final String existing_order_id;
        private final IPOAccessStatusDto ipo_access_status;
        private final OrderFormTypeDto order_form_type;
        private final String order_to_replace_id;
        private final QuoteDto quote;
        private final SourceDto source;

        public Surrogate() {
            this((String) null, (SourceDto) null, (IPOAccessStatusDto) null, (QuoteDto) null, (BrokerageAccountTypeDto) null, (String) null, (OrderFormTypeDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, SourceDto sourceDto, IPOAccessStatusDto iPOAccessStatusDto, QuoteDto quoteDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str2, OrderFormTypeDto orderFormTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.existing_order_id;
            }
            if ((i & 2) != 0) {
                sourceDto = surrogate.source;
            }
            if ((i & 4) != 0) {
                iPOAccessStatusDto = surrogate.ipo_access_status;
            }
            if ((i & 8) != 0) {
                quoteDto = surrogate.quote;
            }
            if ((i & 16) != 0) {
                brokerageAccountTypeDto = surrogate.account_type;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.order_to_replace_id;
            }
            if ((i & 64) != 0) {
                orderFormTypeDto = surrogate.order_form_type;
            }
            String str3 = str2;
            OrderFormTypeDto orderFormTypeDto2 = orderFormTypeDto;
            BrokerageAccountTypeDto brokerageAccountTypeDto2 = brokerageAccountTypeDto;
            IPOAccessStatusDto iPOAccessStatusDto2 = iPOAccessStatusDto;
            return surrogate.copy(str, sourceDto, iPOAccessStatusDto2, quoteDto, brokerageAccountTypeDto2, str3, orderFormTypeDto2);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("existingOrderId")
        @JsonAnnotations2(names = {"existing_order_id"})
        public static /* synthetic */ void getExisting_order_id$annotations() {
        }

        @SerialName("ipoAccessStatus")
        @JsonAnnotations2(names = {"ipo_access_status"})
        public static /* synthetic */ void getIpo_access_status$annotations() {
        }

        @SerialName("orderFormType")
        @JsonAnnotations2(names = {"order_form_type"})
        public static /* synthetic */ void getOrder_form_type$annotations() {
        }

        @SerialName("orderToReplaceId")
        @JsonAnnotations2(names = {"order_to_replace_id"})
        public static /* synthetic */ void getOrder_to_replace_id$annotations() {
        }

        @SerialName("quote")
        @JsonAnnotations2(names = {"quote"})
        public static /* synthetic */ void getQuote$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getExisting_order_id() {
            return this.existing_order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final SourceDto getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final IPOAccessStatusDto getIpo_access_status() {
            return this.ipo_access_status;
        }

        /* renamed from: component4, reason: from getter */
        public final QuoteDto getQuote() {
            return this.quote;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOrder_to_replace_id() {
            return this.order_to_replace_id;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderFormTypeDto getOrder_form_type() {
            return this.order_form_type;
        }

        public final Surrogate copy(String existing_order_id, SourceDto source, IPOAccessStatusDto ipo_access_status, QuoteDto quote, BrokerageAccountTypeDto account_type, String order_to_replace_id, OrderFormTypeDto order_form_type) {
            Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
            Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
            return new Surrogate(existing_order_id, source, ipo_access_status, quote, account_type, order_to_replace_id, order_form_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.existing_order_id, surrogate.existing_order_id) && this.source == surrogate.source && this.ipo_access_status == surrogate.ipo_access_status && Intrinsics.areEqual(this.quote, surrogate.quote) && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.order_to_replace_id, surrogate.order_to_replace_id) && this.order_form_type == surrogate.order_form_type;
        }

        public int hashCode() {
            int iHashCode = ((((this.existing_order_id.hashCode() * 31) + this.source.hashCode()) * 31) + this.ipo_access_status.hashCode()) * 31;
            QuoteDto quoteDto = this.quote;
            return ((((((iHashCode + (quoteDto == null ? 0 : quoteDto.hashCode())) * 31) + this.account_type.hashCode()) * 31) + this.order_to_replace_id.hashCode()) * 31) + this.order_form_type.hashCode();
        }

        public String toString() {
            return "Surrogate(existing_order_id=" + this.existing_order_id + ", source=" + this.source + ", ipo_access_status=" + this.ipo_access_status + ", quote=" + this.quote + ", account_type=" + this.account_type + ", order_to_replace_id=" + this.order_to_replace_id + ", order_form_type=" + this.order_form_type + ")";
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityOrderMetaDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SourceDto sourceDto, IPOAccessStatusDto iPOAccessStatusDto, QuoteDto quoteDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str2, OrderFormTypeDto orderFormTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.existing_order_id = "";
            } else {
                this.existing_order_id = str;
            }
            if ((i & 2) == 0) {
                this.source = SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
            if ((i & 4) == 0) {
                this.ipo_access_status = IPOAccessStatusDto.INSTANCE.getZeroValue();
            } else {
                this.ipo_access_status = iPOAccessStatusDto;
            }
            if ((i & 8) == 0) {
                this.quote = null;
            } else {
                this.quote = quoteDto;
            }
            if ((i & 16) == 0) {
                this.account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = brokerageAccountTypeDto;
            }
            if ((i & 32) == 0) {
                this.order_to_replace_id = "";
            } else {
                this.order_to_replace_id = str2;
            }
            if ((i & 64) == 0) {
                this.order_form_type = OrderFormTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_form_type = orderFormTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.existing_order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.existing_order_id);
            }
            if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SourceDto.Serializer.INSTANCE, self.source);
            }
            if (self.ipo_access_status != IPOAccessStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, IPOAccessStatusDto.Serializer.INSTANCE, self.ipo_access_status);
            }
            QuoteDto quoteDto = self.quote;
            if (quoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, QuoteDto.Serializer.INSTANCE, quoteDto);
            }
            if (self.account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BrokerageAccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (!Intrinsics.areEqual(self.order_to_replace_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.order_to_replace_id);
            }
            if (self.order_form_type != OrderFormTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, OrderFormTypeDto.Serializer.INSTANCE, self.order_form_type);
            }
        }

        public Surrogate(String existing_order_id, SourceDto source, IPOAccessStatusDto ipo_access_status, QuoteDto quoteDto, BrokerageAccountTypeDto account_type, String order_to_replace_id, OrderFormTypeDto order_form_type) {
            Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
            Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
            this.existing_order_id = existing_order_id;
            this.source = source;
            this.ipo_access_status = ipo_access_status;
            this.quote = quoteDto;
            this.account_type = account_type;
            this.order_to_replace_id = order_to_replace_id;
            this.order_form_type = order_form_type;
        }

        public /* synthetic */ Surrogate(String str, SourceDto sourceDto, IPOAccessStatusDto iPOAccessStatusDto, QuoteDto quoteDto, BrokerageAccountTypeDto brokerageAccountTypeDto, String str2, OrderFormTypeDto orderFormTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i & 4) != 0 ? IPOAccessStatusDto.INSTANCE.getZeroValue() : iPOAccessStatusDto, (i & 8) != 0 ? null : quoteDto, (i & 16) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? OrderFormTypeDto.INSTANCE.getZeroValue() : orderFormTypeDto);
        }

        public final String getExisting_order_id() {
            return this.existing_order_id;
        }

        public final SourceDto getSource() {
            return this.source;
        }

        public final IPOAccessStatusDto getIpo_access_status() {
            return this.ipo_access_status;
        }

        public final QuoteDto getQuote() {
            return this.quote;
        }

        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final String getOrder_to_replace_id() {
            return this.order_to_replace_id;
        }

        public final OrderFormTypeDto getOrder_form_type() {
            return this.order_form_type;
        }
    }

    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquityOrderMetaDto, EquityOrderMeta> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOrderMetaDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderMetaDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderMetaDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOrderMetaDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOrderMeta> getProtoAdapter() {
            return EquityOrderMeta.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderMetaDto getZeroValue() {
            return EquityOrderMetaDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderMetaDto fromProto(EquityOrderMeta proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String existing_order_id = proto.getExisting_order_id();
            SourceDto sourceDtoFromProto = SourceDto.INSTANCE.fromProto(proto.getSource());
            IPOAccessStatusDto iPOAccessStatusDtoFromProto = IPOAccessStatusDto.INSTANCE.fromProto(proto.getIpo_access_status());
            Quote quote = proto.getQuote();
            return new EquityOrderMetaDto(new Surrogate(existing_order_id, sourceDtoFromProto, iPOAccessStatusDtoFromProto, quote != null ? QuoteDto.INSTANCE.fromProto(quote) : null, BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type()), proto.getOrder_to_replace_id(), OrderFormTypeDto.INSTANCE.fromProto(proto.getOrder_form_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMetaDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderMetaDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EquityOrderMetaDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "SOURCE_STOCK_DETAIL", "SOURCE_ORDER_DETAIL", "SOURCE_INBOX_DEEPLINK", "SOURCE_PUSH_NOTIFICATION_DEEPLINK", "SOURCE_EMAIL_DEEPLINK", "SOURCE_INSTRUMENT_ROW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceDto implements Dto2<EquityOrderMeta.Source>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceDto, EquityOrderMeta.Source>> binaryBase64Serializer$delegate;
        public static final SourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
        public static final SourceDto SOURCE_STOCK_DETAIL = new SOURCE_STOCK_DETAIL("SOURCE_STOCK_DETAIL", 1);
        public static final SourceDto SOURCE_ORDER_DETAIL = new SOURCE_ORDER_DETAIL("SOURCE_ORDER_DETAIL", 2);
        public static final SourceDto SOURCE_INBOX_DEEPLINK = new SOURCE_INBOX_DEEPLINK("SOURCE_INBOX_DEEPLINK", 3);
        public static final SourceDto SOURCE_PUSH_NOTIFICATION_DEEPLINK = new SOURCE_PUSH_NOTIFICATION_DEEPLINK("SOURCE_PUSH_NOTIFICATION_DEEPLINK", 4);
        public static final SourceDto SOURCE_EMAIL_DEEPLINK = new SOURCE_EMAIL_DEEPLINK("SOURCE_EMAIL_DEEPLINK", 5);
        public static final SourceDto SOURCE_INSTRUMENT_ROW = new SOURCE_INSTRUMENT_ROW("SOURCE_INSTRUMENT_ROW", 6);

        private static final /* synthetic */ SourceDto[] $values() {
            return new SourceDto[]{SOURCE_UNSPECIFIED, SOURCE_STOCK_DETAIL, SOURCE_ORDER_DETAIL, SOURCE_INBOX_DEEPLINK, SOURCE_PUSH_NOTIFICATION_DEEPLINK, SOURCE_EMAIL_DEEPLINK, SOURCE_INSTRUMENT_ROW};
        }

        public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_UNSPECIFIED extends SourceDto {
            SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
            }
        }

        private SourceDto(String str, int i) {
        }

        static {
            SourceDto[] sourceDtoArr$values = $values();
            $VALUES = sourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMetaDto$SourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderMetaDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_STOCK_DETAIL", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_STOCK_DETAIL extends SourceDto {
            SOURCE_STOCK_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_STOCK_DETAIL;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_ORDER_DETAIL", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ORDER_DETAIL extends SourceDto {
            SOURCE_ORDER_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_ORDER_DETAIL;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_INBOX_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_INBOX_DEEPLINK extends SourceDto {
            SOURCE_INBOX_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_INBOX_DEEPLINK;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_PUSH_NOTIFICATION_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_PUSH_NOTIFICATION_DEEPLINK extends SourceDto {
            SOURCE_PUSH_NOTIFICATION_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_PUSH_NOTIFICATION_DEEPLINK;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_EMAIL_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_EMAIL_DEEPLINK extends SourceDto {
            SOURCE_EMAIL_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_EMAIL_DEEPLINK;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.SourceDto.SOURCE_INSTRUMENT_ROW", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_INSTRUMENT_ROW extends SourceDto {
            SOURCE_INSTRUMENT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.Source toProto() {
                return EquityOrderMeta.Source.SOURCE_INSTRUMENT_ROW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceDto, EquityOrderMeta.Source> {

            /* compiled from: EquityOrderMetaDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EquityOrderMeta.Source.values().length];
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_STOCK_DETAIL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_ORDER_DETAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_INBOX_DEEPLINK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_PUSH_NOTIFICATION_DEEPLINK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_EMAIL_DEEPLINK.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[EquityOrderMeta.Source.SOURCE_INSTRUMENT_ROW.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
            public ProtoAdapter<EquityOrderMeta.Source> getProtoAdapter() {
                return EquityOrderMeta.Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto getZeroValue() {
                return SourceDto.SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto fromProto(EquityOrderMeta.Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SourceDto.SOURCE_UNSPECIFIED;
                    case 2:
                        return SourceDto.SOURCE_STOCK_DETAIL;
                    case 3:
                        return SourceDto.SOURCE_ORDER_DETAIL;
                    case 4:
                        return SourceDto.SOURCE_INBOX_DEEPLINK;
                    case 5:
                        return SourceDto.SOURCE_PUSH_NOTIFICATION_DEEPLINK;
                    case 6:
                        return SourceDto.SOURCE_EMAIL_DEEPLINK;
                    case 7:
                        return SourceDto.SOURCE_INSTRUMENT_ROW;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceDto, EquityOrderMeta.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EquityOrderMeta.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "IPO_ACCESS_STATUS_UNSPECIFIED", "IPO_ACCESS_STATUS_S1_FILED", "IPO_ACCESS_STATUS_PRICE_INITIALIZED", "IPO_ACCESS_STATUS_PRICE_FINALIZED", "IPO_ACCESS_STATUS_PUBLIC", "IPO_ACCESS_STATUS_CANCELED", "IPO_ACCESS_STATUS_DELAYED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IPOAccessStatusDto implements Dto2<EquityOrderMeta.IPOAccessStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IPOAccessStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<IPOAccessStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IPOAccessStatusDto, EquityOrderMeta.IPOAccessStatus>> binaryBase64Serializer$delegate;
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_UNSPECIFIED = new IPO_ACCESS_STATUS_UNSPECIFIED("IPO_ACCESS_STATUS_UNSPECIFIED", 0);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_S1_FILED = new IPO_ACCESS_STATUS_S1_FILED("IPO_ACCESS_STATUS_S1_FILED", 1);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PRICE_INITIALIZED = new IPO_ACCESS_STATUS_PRICE_INITIALIZED("IPO_ACCESS_STATUS_PRICE_INITIALIZED", 2);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PRICE_FINALIZED = new IPO_ACCESS_STATUS_PRICE_FINALIZED("IPO_ACCESS_STATUS_PRICE_FINALIZED", 3);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PUBLIC = new IPO_ACCESS_STATUS_PUBLIC("IPO_ACCESS_STATUS_PUBLIC", 4);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_CANCELED = new IPO_ACCESS_STATUS_CANCELED("IPO_ACCESS_STATUS_CANCELED", 5);
        public static final IPOAccessStatusDto IPO_ACCESS_STATUS_DELAYED = new IPO_ACCESS_STATUS_DELAYED("IPO_ACCESS_STATUS_DELAYED", 6);

        private static final /* synthetic */ IPOAccessStatusDto[] $values() {
            return new IPOAccessStatusDto[]{IPO_ACCESS_STATUS_UNSPECIFIED, IPO_ACCESS_STATUS_S1_FILED, IPO_ACCESS_STATUS_PRICE_INITIALIZED, IPO_ACCESS_STATUS_PRICE_FINALIZED, IPO_ACCESS_STATUS_PUBLIC, IPO_ACCESS_STATUS_CANCELED, IPO_ACCESS_STATUS_DELAYED};
        }

        public /* synthetic */ IPOAccessStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<IPOAccessStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_UNSPECIFIED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED;
            }
        }

        private IPOAccessStatusDto(String str, int i) {
        }

        static {
            IPOAccessStatusDto[] iPOAccessStatusDtoArr$values = $values();
            $VALUES = iPOAccessStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(iPOAccessStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMetaDto$IPOAccessStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderMetaDto.IPOAccessStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_S1_FILED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_S1_FILED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_S1_FILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_INITIALIZED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_PRICE_INITIALIZED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_PRICE_INITIALIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_FINALIZED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_PRICE_FINALIZED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_PRICE_FINALIZED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_PUBLIC", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_PUBLIC extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_PUBLIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_CANCELED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_CANCELED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.IPOAccessStatusDto.IPO_ACCESS_STATUS_DELAYED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IPO_ACCESS_STATUS_DELAYED extends IPOAccessStatusDto {
            IPO_ACCESS_STATUS_DELAYED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.IPOAccessStatus toProto() {
                return EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<IPOAccessStatusDto, EquityOrderMeta.IPOAccessStatus> {

            /* compiled from: EquityOrderMetaDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EquityOrderMeta.IPOAccessStatus.values().length];
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IPOAccessStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IPOAccessStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IPOAccessStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) IPOAccessStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<EquityOrderMeta.IPOAccessStatus> getProtoAdapter() {
                return EquityOrderMeta.IPOAccessStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IPOAccessStatusDto getZeroValue() {
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IPOAccessStatusDto fromProto(EquityOrderMeta.IPOAccessStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED;
                    case 2:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_S1_FILED;
                    case 3:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
                    case 4:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_FINALIZED;
                    case 5:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_PUBLIC;
                    case 6:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_CANCELED;
                    case 7:
                        return IPOAccessStatusDto.IPO_ACCESS_STATUS_DELAYED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$IPOAccessStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IPOAccessStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<IPOAccessStatusDto, EquityOrderMeta.IPOAccessStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EquityOrderMeta.IPOAccessStatus", IPOAccessStatusDto.getEntries(), IPOAccessStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public IPOAccessStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (IPOAccessStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IPOAccessStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static IPOAccessStatusDto valueOf(String str) {
            return (IPOAccessStatusDto) Enum.valueOf(IPOAccessStatusDto.class, str);
        }

        public static IPOAccessStatusDto[] values() {
            return (IPOAccessStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_FORM_TYPE_UNSPECIFIED", "ORDER_FORM_TYPE_DOLLARS", "ORDER_FORM_TYPE_SHARES", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class OrderFormTypeDto implements Dto2<EquityOrderMeta.OrderFormType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderFormTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderFormTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderFormTypeDto, EquityOrderMeta.OrderFormType>> binaryBase64Serializer$delegate;
        public static final OrderFormTypeDto ORDER_FORM_TYPE_UNSPECIFIED = new ORDER_FORM_TYPE_UNSPECIFIED("ORDER_FORM_TYPE_UNSPECIFIED", 0);
        public static final OrderFormTypeDto ORDER_FORM_TYPE_DOLLARS = new ORDER_FORM_TYPE_DOLLARS("ORDER_FORM_TYPE_DOLLARS", 1);
        public static final OrderFormTypeDto ORDER_FORM_TYPE_SHARES = new ORDER_FORM_TYPE_SHARES("ORDER_FORM_TYPE_SHARES", 2);

        private static final /* synthetic */ OrderFormTypeDto[] $values() {
            return new OrderFormTypeDto[]{ORDER_FORM_TYPE_UNSPECIFIED, ORDER_FORM_TYPE_DOLLARS, ORDER_FORM_TYPE_SHARES};
        }

        public /* synthetic */ OrderFormTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderFormTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.OrderFormTypeDto.ORDER_FORM_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_FORM_TYPE_UNSPECIFIED extends OrderFormTypeDto {
            ORDER_FORM_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.OrderFormType toProto() {
                return EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED;
            }
        }

        private OrderFormTypeDto(String str, int i) {
        }

        static {
            OrderFormTypeDto[] orderFormTypeDtoArr$values = $values();
            $VALUES = orderFormTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderFormTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMetaDto$OrderFormTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderMetaDto.OrderFormTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.OrderFormTypeDto.ORDER_FORM_TYPE_DOLLARS", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_FORM_TYPE_DOLLARS extends OrderFormTypeDto {
            ORDER_FORM_TYPE_DOLLARS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.OrderFormType toProto() {
                return EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_DOLLARS;
            }
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EquityOrderMetaDto.OrderFormTypeDto.ORDER_FORM_TYPE_SHARES", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_FORM_TYPE_SHARES extends OrderFormTypeDto {
            ORDER_FORM_TYPE_SHARES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EquityOrderMeta.OrderFormType toProto() {
                return EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_SHARES;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderFormTypeDto, EquityOrderMeta.OrderFormType> {

            /* compiled from: EquityOrderMetaDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EquityOrderMeta.OrderFormType.values().length];
                    try {
                        iArr[EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_DOLLARS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_SHARES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderFormTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderFormTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderFormTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderFormTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<EquityOrderMeta.OrderFormType> getProtoAdapter() {
                return EquityOrderMeta.OrderFormType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderFormTypeDto getZeroValue() {
                return OrderFormTypeDto.ORDER_FORM_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderFormTypeDto fromProto(EquityOrderMeta.OrderFormType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderFormTypeDto.ORDER_FORM_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderFormTypeDto.ORDER_FORM_TYPE_DOLLARS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderFormTypeDto.ORDER_FORM_TYPE_SHARES;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EquityOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$OrderFormTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderFormTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderFormTypeDto, EquityOrderMeta.OrderFormType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EquityOrderMeta.OrderFormType", OrderFormTypeDto.getEntries(), OrderFormTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderFormTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderFormTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderFormTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderFormTypeDto valueOf(String str) {
            return (OrderFormTypeDto) Enum.valueOf(OrderFormTypeDto.class, str);
        }

        public static OrderFormTypeDto[] values() {
            return (OrderFormTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EquityOrderMetaDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EquityOrderMeta", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOrderMetaDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityOrderMetaDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityOrderMetaDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EquityOrderMetaDto";
        }
    }
}
