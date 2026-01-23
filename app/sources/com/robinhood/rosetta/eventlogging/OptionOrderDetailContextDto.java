package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionOrderMetaDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* compiled from: OptionOrderDetailContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0017Jj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\u0013\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u000fH\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010!R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate;)V", "order_id", "", "limit_price", "", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "total_quantity", "", "filled_quantity", "is_stop_order", "", "order_state", "chain_symbol", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "(Ljava/lang/String;FFFIIZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;)V", "getOrder_id", "()Ljava/lang/String;", "getLimit_price", "()F", "getBid_price", "getAsk_price", "getTotal_quantity", "()I", "getFilled_quantity", "()Z", "getOrder_state", "getChain_symbol", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionOrderDetailContextDto implements Dto3<OptionOrderDetailContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionOrderDetailContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderDetailContextDto, OptionOrderDetailContext>> binaryBase64Serializer$delegate;
    private static final OptionOrderDetailContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionOrderDetailContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderDetailContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final float getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final float getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final float getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final int getTotal_quantity() {
        return this.surrogate.getTotal_quantity();
    }

    public final int getFilled_quantity() {
        return this.surrogate.getFilled_quantity();
    }

    public final boolean is_stop_order() {
        return this.surrogate.is_stop_order();
    }

    public final String getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public final String getChain_symbol() {
        return this.surrogate.getChain_symbol();
    }

    public final OptionOrderMetaDto.SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public /* synthetic */ OptionOrderDetailContextDto(String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMetaDto.SourceDto sourceDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? "" : str2, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? OptionOrderMetaDto.SourceDto.INSTANCE.getZeroValue() : sourceDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailContextDto(String order_id, float f, float f2, float f3, int i, int i2, boolean z, String order_state, String chain_symbol, OptionOrderMetaDto.SourceDto source) {
        this(new Surrogate(order_id, f, f2, f3, i, i2, z, order_state, chain_symbol, source));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ OptionOrderDetailContextDto copy$default(OptionOrderDetailContextDto optionOrderDetailContextDto, String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMetaDto.SourceDto sourceDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = optionOrderDetailContextDto.surrogate.getOrder_id();
        }
        if ((i3 & 2) != 0) {
            f = optionOrderDetailContextDto.surrogate.getLimit_price();
        }
        if ((i3 & 4) != 0) {
            f2 = optionOrderDetailContextDto.surrogate.getBid_price();
        }
        if ((i3 & 8) != 0) {
            f3 = optionOrderDetailContextDto.surrogate.getAsk_price();
        }
        if ((i3 & 16) != 0) {
            i = optionOrderDetailContextDto.surrogate.getTotal_quantity();
        }
        if ((i3 & 32) != 0) {
            i2 = optionOrderDetailContextDto.surrogate.getFilled_quantity();
        }
        if ((i3 & 64) != 0) {
            z = optionOrderDetailContextDto.surrogate.is_stop_order();
        }
        if ((i3 & 128) != 0) {
            str2 = optionOrderDetailContextDto.surrogate.getOrder_state();
        }
        if ((i3 & 256) != 0) {
            str3 = optionOrderDetailContextDto.surrogate.getChain_symbol();
        }
        if ((i3 & 512) != 0) {
            sourceDto = optionOrderDetailContextDto.surrogate.getSource();
        }
        String str4 = str3;
        OptionOrderMetaDto.SourceDto sourceDto2 = sourceDto;
        boolean z2 = z;
        String str5 = str2;
        int i4 = i;
        int i5 = i2;
        return optionOrderDetailContextDto.copy(str, f, f2, f3, i4, i5, z2, str5, str4, sourceDto2);
    }

    public final OptionOrderDetailContextDto copy(String order_id, float limit_price, float bid_price, float ask_price, int total_quantity, int filled_quantity, boolean is_stop_order, String order_state, String chain_symbol, OptionOrderMetaDto.SourceDto source) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(source, "source");
        return new OptionOrderDetailContextDto(new Surrogate(order_id, limit_price, bid_price, ask_price, total_quantity, filled_quantity, is_stop_order, order_state, chain_symbol, source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionOrderDetailContext toProto() {
        return new OptionOrderDetailContext(this.surrogate.getOrder_id(), this.surrogate.getLimit_price(), this.surrogate.getBid_price(), this.surrogate.getAsk_price(), this.surrogate.getTotal_quantity(), this.surrogate.getFilled_quantity(), this.surrogate.is_stop_order(), this.surrogate.getOrder_state(), this.surrogate.getChain_symbol(), (OptionOrderMeta.Source) this.surrogate.getSource().toProto(), null, 1024, null);
    }

    public String toString() {
        return "[OptionOrderDetailContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionOrderDetailContextDto) && Intrinsics.areEqual(((OptionOrderDetailContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002KLB¶\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016Bs\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0018\u00105\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00106\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00107\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00108\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u00109\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J¸\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010?\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\fHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010!R+\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010!R+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R+\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010(R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001c\u001a\u0004\b\u000f\u0010,R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001c\u001a\u0004\b2\u00103¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate;", "", "order_id", "", "limit_price", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "total_quantity", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "filled_quantity", "is_stop_order", "", "order_state", "chain_symbol", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "<init>", "(Ljava/lang/String;FFFIIZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FFFIIZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Ljava/lang/String;", "getLimit_price$annotations", "getLimit_price", "()F", "getBid_price$annotations", "getBid_price", "getAsk_price$annotations", "getAsk_price", "getTotal_quantity$annotations", "getTotal_quantity", "()I", "getFilled_quantity$annotations", "getFilled_quantity", "is_stop_order$annotations", "()Z", "getOrder_state$annotations", "getOrder_state", "getChain_symbol$annotations", "getChain_symbol", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMetaDto$SourceDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float ask_price;
        private final float bid_price;
        private final String chain_symbol;
        private final int filled_quantity;
        private final boolean is_stop_order;
        private final float limit_price;
        private final String order_id;
        private final String order_state;
        private final OptionOrderMetaDto.SourceDto source;
        private final int total_quantity;

        public Surrogate() {
            this((String) null, 0.0f, 0.0f, 0.0f, 0, 0, false, (String) null, (String) null, (OptionOrderMetaDto.SourceDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMetaDto.SourceDto sourceDto, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.order_id;
            }
            if ((i3 & 2) != 0) {
                f = surrogate.limit_price;
            }
            if ((i3 & 4) != 0) {
                f2 = surrogate.bid_price;
            }
            if ((i3 & 8) != 0) {
                f3 = surrogate.ask_price;
            }
            if ((i3 & 16) != 0) {
                i = surrogate.total_quantity;
            }
            if ((i3 & 32) != 0) {
                i2 = surrogate.filled_quantity;
            }
            if ((i3 & 64) != 0) {
                z = surrogate.is_stop_order;
            }
            if ((i3 & 128) != 0) {
                str2 = surrogate.order_state;
            }
            if ((i3 & 256) != 0) {
                str3 = surrogate.chain_symbol;
            }
            if ((i3 & 512) != 0) {
                sourceDto = surrogate.source;
            }
            String str4 = str3;
            OptionOrderMetaDto.SourceDto sourceDto2 = sourceDto;
            boolean z2 = z;
            String str5 = str2;
            int i4 = i;
            int i5 = i2;
            return surrogate.copy(str, f, f2, f3, i4, i5, z2, str5, str4, sourceDto2);
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("chainSymbol")
        @JsonAnnotations2(names = {"chain_symbol"})
        public static /* synthetic */ void getChain_symbol$annotations() {
        }

        @SerialName("filledQuantity")
        @JsonAnnotations2(names = {"filled_quantity"})
        public static /* synthetic */ void getFilled_quantity$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("totalQuantity")
        @JsonAnnotations2(names = {"total_quantity"})
        public static /* synthetic */ void getTotal_quantity$annotations() {
        }

        @SerialName("isStopOrder")
        @JsonAnnotations2(names = {"is_stop_order"})
        public static /* synthetic */ void is_stop_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component10, reason: from getter */
        public final OptionOrderMetaDto.SourceDto getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final float getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component3, reason: from getter */
        public final float getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component4, reason: from getter */
        public final float getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTotal_quantity() {
            return this.total_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final int getFilled_quantity() {
            return this.filled_quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIs_stop_order() {
            return this.is_stop_order;
        }

        /* renamed from: component8, reason: from getter */
        public final String getOrder_state() {
            return this.order_state;
        }

        /* renamed from: component9, reason: from getter */
        public final String getChain_symbol() {
            return this.chain_symbol;
        }

        public final Surrogate copy(String order_id, float limit_price, float bid_price, float ask_price, int total_quantity, int filled_quantity, boolean is_stop_order, String order_state, String chain_symbol, OptionOrderMetaDto.SourceDto source) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(order_id, limit_price, bid_price, ask_price, total_quantity, filled_quantity, is_stop_order, order_state, chain_symbol, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Float.compare(this.limit_price, surrogate.limit_price) == 0 && Float.compare(this.bid_price, surrogate.bid_price) == 0 && Float.compare(this.ask_price, surrogate.ask_price) == 0 && this.total_quantity == surrogate.total_quantity && this.filled_quantity == surrogate.filled_quantity && this.is_stop_order == surrogate.is_stop_order && Intrinsics.areEqual(this.order_state, surrogate.order_state) && Intrinsics.areEqual(this.chain_symbol, surrogate.chain_symbol) && this.source == surrogate.source;
        }

        public int hashCode() {
            return (((((((((((((((((this.order_id.hashCode() * 31) + Float.hashCode(this.limit_price)) * 31) + Float.hashCode(this.bid_price)) * 31) + Float.hashCode(this.ask_price)) * 31) + Integer.hashCode(this.total_quantity)) * 31) + Integer.hashCode(this.filled_quantity)) * 31) + java.lang.Boolean.hashCode(this.is_stop_order)) * 31) + this.order_state.hashCode()) * 31) + this.chain_symbol.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", limit_price=" + this.limit_price + ", bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", total_quantity=" + this.total_quantity + ", filled_quantity=" + this.filled_quantity + ", is_stop_order=" + this.is_stop_order + ", order_state=" + this.order_state + ", chain_symbol=" + this.chain_symbol + ", source=" + this.source + ")";
        }

        /* compiled from: OptionOrderDetailContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionOrderDetailContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, float f, float f2, float f3, int i2, int i3, boolean z, String str2, String str3, OptionOrderMetaDto.SourceDto sourceDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.limit_price = 0.0f;
            } else {
                this.limit_price = f;
            }
            if ((i & 4) == 0) {
                this.bid_price = 0.0f;
            } else {
                this.bid_price = f2;
            }
            if ((i & 8) == 0) {
                this.ask_price = 0.0f;
            } else {
                this.ask_price = f3;
            }
            if ((i & 16) == 0) {
                this.total_quantity = 0;
            } else {
                this.total_quantity = i2;
            }
            if ((i & 32) == 0) {
                this.filled_quantity = 0;
            } else {
                this.filled_quantity = i3;
            }
            if ((i & 64) == 0) {
                this.is_stop_order = false;
            } else {
                this.is_stop_order = z;
            }
            if ((i & 128) == 0) {
                this.order_state = "";
            } else {
                this.order_state = str2;
            }
            if ((i & 256) == 0) {
                this.chain_symbol = "";
            } else {
                this.chain_symbol = str3;
            }
            if ((i & 512) == 0) {
                this.source = OptionOrderMetaDto.SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (Float.compare(self.limit_price, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.limit_price));
            }
            if (Float.compare(self.bid_price, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.bid_price));
            }
            if (Float.compare(self.ask_price, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.ask_price));
            }
            int i = self.total_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.filled_quantity;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            boolean z = self.is_stop_order;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            if (!Intrinsics.areEqual(self.order_state, "")) {
                output.encodeStringElement(serialDesc, 7, self.order_state);
            }
            if (!Intrinsics.areEqual(self.chain_symbol, "")) {
                output.encodeStringElement(serialDesc, 8, self.chain_symbol);
            }
            if (self.source != OptionOrderMetaDto.SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, OptionOrderMetaDto.SourceDto.Serializer.INSTANCE, self.source);
            }
        }

        public Surrogate(String order_id, float f, float f2, float f3, int i, int i2, boolean z, String order_state, String chain_symbol, OptionOrderMetaDto.SourceDto source) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
            Intrinsics.checkNotNullParameter(source, "source");
            this.order_id = order_id;
            this.limit_price = f;
            this.bid_price = f2;
            this.ask_price = f3;
            this.total_quantity = i;
            this.filled_quantity = i2;
            this.is_stop_order = z;
            this.order_state = order_state;
            this.chain_symbol = chain_symbol;
            this.source = source;
        }

        public /* synthetic */ Surrogate(String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMetaDto.SourceDto sourceDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? "" : str2, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? OptionOrderMetaDto.SourceDto.INSTANCE.getZeroValue() : sourceDto);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final float getLimit_price() {
            return this.limit_price;
        }

        public final float getBid_price() {
            return this.bid_price;
        }

        public final float getAsk_price() {
            return this.ask_price;
        }

        public final int getTotal_quantity() {
            return this.total_quantity;
        }

        public final int getFilled_quantity() {
            return this.filled_quantity;
        }

        public final boolean is_stop_order() {
            return this.is_stop_order;
        }

        public final String getOrder_state() {
            return this.order_state;
        }

        public final String getChain_symbol() {
            return this.chain_symbol;
        }

        public final OptionOrderMetaDto.SourceDto getSource() {
            return this.source;
        }
    }

    /* compiled from: OptionOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionOrderDetailContextDto, OptionOrderDetailContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderDetailContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderDetailContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderDetailContextDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderDetailContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderDetailContext> getProtoAdapter() {
            return OptionOrderDetailContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderDetailContextDto getZeroValue() {
            return OptionOrderDetailContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderDetailContextDto fromProto(OptionOrderDetailContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionOrderDetailContextDto(new Surrogate(proto.getOrder_id(), proto.getLimit_price(), proto.getBid_price(), proto.getAsk_price(), proto.getTotal_quantity(), proto.getFilled_quantity(), proto.getIs_stop_order(), proto.getOrder_state(), proto.getChain_symbol(), OptionOrderMetaDto.SourceDto.INSTANCE.fromProto(proto.getSource())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionOrderDetailContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderDetailContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionOrderDetailContextDto(null, 0.0f, 0.0f, 0.0f, 0, 0, false, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionOrderDetailContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionOrderDetailContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderDetailContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderDetailContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionOrderDetailContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionOrderDetailContextDto";
        }
    }
}
