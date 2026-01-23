package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContextDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0011JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate;)V", "initial_portfolio_value", "", "deposit_frequency", "", "deposit_amount", "projection_range_1", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;", "projection_range_15", "projection_range_30", "(DLjava/lang/String;DLcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;)V", "getInitial_portfolio_value", "()D", "getDeposit_frequency", "()Ljava/lang/String;", "getDeposit_amount", "getProjection_range_1", "()Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;", "getProjection_range_15", "getProjection_range_30", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class AdvisoryFutureReturnsGraphContextDto implements Dto3<AdvisoryFutureReturnsGraphContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryFutureReturnsGraphContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryFutureReturnsGraphContextDto, AdvisoryFutureReturnsGraphContext>> binaryBase64Serializer$delegate;
    private static final AdvisoryFutureReturnsGraphContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryFutureReturnsGraphContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryFutureReturnsGraphContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getInitial_portfolio_value() {
        return this.surrogate.getInitial_portfolio_value();
    }

    public final String getDeposit_frequency() {
        return this.surrogate.getDeposit_frequency();
    }

    public final double getDeposit_amount() {
        return this.surrogate.getDeposit_amount();
    }

    public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_1() {
        return this.surrogate.getProjection_range_1();
    }

    public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_15() {
        return this.surrogate.getProjection_range_15();
    }

    public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_30() {
        return this.surrogate.getProjection_range_30();
    }

    public /* synthetic */ AdvisoryFutureReturnsGraphContextDto(double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto, (i & 16) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto2, (i & 32) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryFutureReturnsGraphContextDto(double d, String deposit_frequency, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3) {
        this(new Surrogate(d, deposit_frequency, d2, advisoryFutureReturnsProjectionRangeContextDto, advisoryFutureReturnsProjectionRangeContextDto2, advisoryFutureReturnsProjectionRangeContextDto3));
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
    }

    public static /* synthetic */ AdvisoryFutureReturnsGraphContextDto copy$default(AdvisoryFutureReturnsGraphContextDto advisoryFutureReturnsGraphContextDto, double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = advisoryFutureReturnsGraphContextDto.surrogate.getInitial_portfolio_value();
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = advisoryFutureReturnsGraphContextDto.surrogate.getDeposit_frequency();
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d2 = advisoryFutureReturnsGraphContextDto.surrogate.getDeposit_amount();
        }
        double d4 = d2;
        if ((i & 8) != 0) {
            advisoryFutureReturnsProjectionRangeContextDto = advisoryFutureReturnsGraphContextDto.surrogate.getProjection_range_1();
        }
        return advisoryFutureReturnsGraphContextDto.copy(d3, str2, d4, advisoryFutureReturnsProjectionRangeContextDto, (i & 16) != 0 ? advisoryFutureReturnsGraphContextDto.surrogate.getProjection_range_15() : advisoryFutureReturnsProjectionRangeContextDto2, (i & 32) != 0 ? advisoryFutureReturnsGraphContextDto.surrogate.getProjection_range_30() : advisoryFutureReturnsProjectionRangeContextDto3);
    }

    public final AdvisoryFutureReturnsGraphContextDto copy(double initial_portfolio_value, String deposit_frequency, double deposit_amount, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_1, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_15, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_30) {
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        return new AdvisoryFutureReturnsGraphContextDto(new Surrogate(initial_portfolio_value, deposit_frequency, deposit_amount, projection_range_1, projection_range_15, projection_range_30));
    }

    @Override // com.robinhood.idl.Dto
    public AdvisoryFutureReturnsGraphContext toProto() {
        double initial_portfolio_value = this.surrogate.getInitial_portfolio_value();
        String deposit_frequency = this.surrogate.getDeposit_frequency();
        double deposit_amount = this.surrogate.getDeposit_amount();
        AdvisoryFutureReturnsProjectionRangeContextDto projection_range_1 = this.surrogate.getProjection_range_1();
        AdvisoryFutureReturnsProjectionRangeContext proto = projection_range_1 != null ? projection_range_1.toProto() : null;
        AdvisoryFutureReturnsProjectionRangeContextDto projection_range_15 = this.surrogate.getProjection_range_15();
        AdvisoryFutureReturnsProjectionRangeContext proto2 = projection_range_15 != null ? projection_range_15.toProto() : null;
        AdvisoryFutureReturnsProjectionRangeContextDto projection_range_30 = this.surrogate.getProjection_range_30();
        return new AdvisoryFutureReturnsGraphContext(initial_portfolio_value, deposit_frequency, deposit_amount, proto, proto2, projection_range_30 != null ? projection_range_30.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[AdvisoryFutureReturnsGraphContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryFutureReturnsGraphContextDto) && Intrinsics.areEqual(((AdvisoryFutureReturnsGraphContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:Bg\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010%\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0018\u0010'\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003Ji\u0010+\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010 ¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate;", "", "initial_portfolio_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "deposit_frequency", "", "deposit_amount", "projection_range_1", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;", "projection_range_15", "projection_range_30", "<init>", "(DLjava/lang/String;DLcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLjava/lang/String;DLcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInitial_portfolio_value$annotations", "()V", "getInitial_portfolio_value", "()D", "getDeposit_frequency$annotations", "getDeposit_frequency", "()Ljava/lang/String;", "getDeposit_amount$annotations", "getDeposit_amount", "getProjection_range_1$annotations", "getProjection_range_1", "()Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContextDto;", "getProjection_range_15$annotations", "getProjection_range_15", "getProjection_range_30$annotations", "getProjection_range_30", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double deposit_amount;
        private final String deposit_frequency;
        private final double initial_portfolio_value;
        private final AdvisoryFutureReturnsProjectionRangeContextDto projection_range_1;
        private final AdvisoryFutureReturnsProjectionRangeContextDto projection_range_15;
        private final AdvisoryFutureReturnsProjectionRangeContextDto projection_range_30;

        public Surrogate() {
            this(0.0d, (String) null, 0.0d, (AdvisoryFutureReturnsProjectionRangeContextDto) null, (AdvisoryFutureReturnsProjectionRangeContextDto) null, (AdvisoryFutureReturnsProjectionRangeContextDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = surrogate.initial_portfolio_value;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                str = surrogate.deposit_frequency;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                d2 = surrogate.deposit_amount;
            }
            double d4 = d2;
            if ((i & 8) != 0) {
                advisoryFutureReturnsProjectionRangeContextDto = surrogate.projection_range_1;
            }
            return surrogate.copy(d3, str2, d4, advisoryFutureReturnsProjectionRangeContextDto, (i & 16) != 0 ? surrogate.projection_range_15 : advisoryFutureReturnsProjectionRangeContextDto2, (i & 32) != 0 ? surrogate.projection_range_30 : advisoryFutureReturnsProjectionRangeContextDto3);
        }

        @SerialName(EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT)
        @JsonAnnotations2(names = {"deposit_amount"})
        public static /* synthetic */ void getDeposit_amount$annotations() {
        }

        @SerialName("depositFrequency")
        @JsonAnnotations2(names = {"deposit_frequency"})
        public static /* synthetic */ void getDeposit_frequency$annotations() {
        }

        @SerialName("initialPortfolioValue")
        @JsonAnnotations2(names = {"initial_portfolio_value"})
        public static /* synthetic */ void getInitial_portfolio_value$annotations() {
        }

        @SerialName("projectionRange1")
        @JsonAnnotations2(names = {"projection_range_1"})
        public static /* synthetic */ void getProjection_range_1$annotations() {
        }

        @SerialName("projectionRange15")
        @JsonAnnotations2(names = {"projection_range_15"})
        public static /* synthetic */ void getProjection_range_15$annotations() {
        }

        @SerialName("projectionRange30")
        @JsonAnnotations2(names = {"projection_range_30"})
        public static /* synthetic */ void getProjection_range_30$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final double getInitial_portfolio_value() {
            return this.initial_portfolio_value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeposit_frequency() {
            return this.deposit_frequency;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDeposit_amount() {
            return this.deposit_amount;
        }

        /* renamed from: component4, reason: from getter */
        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_1() {
            return this.projection_range_1;
        }

        /* renamed from: component5, reason: from getter */
        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_15() {
            return this.projection_range_15;
        }

        /* renamed from: component6, reason: from getter */
        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_30() {
            return this.projection_range_30;
        }

        public final Surrogate copy(double initial_portfolio_value, String deposit_frequency, double deposit_amount, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_1, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_15, AdvisoryFutureReturnsProjectionRangeContextDto projection_range_30) {
            Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
            return new Surrogate(initial_portfolio_value, deposit_frequency, deposit_amount, projection_range_1, projection_range_15, projection_range_30);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.initial_portfolio_value, surrogate.initial_portfolio_value) == 0 && Intrinsics.areEqual(this.deposit_frequency, surrogate.deposit_frequency) && Double.compare(this.deposit_amount, surrogate.deposit_amount) == 0 && Intrinsics.areEqual(this.projection_range_1, surrogate.projection_range_1) && Intrinsics.areEqual(this.projection_range_15, surrogate.projection_range_15) && Intrinsics.areEqual(this.projection_range_30, surrogate.projection_range_30);
        }

        public int hashCode() {
            int iHashCode = ((((Double.hashCode(this.initial_portfolio_value) * 31) + this.deposit_frequency.hashCode()) * 31) + Double.hashCode(this.deposit_amount)) * 31;
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto = this.projection_range_1;
            int iHashCode2 = (iHashCode + (advisoryFutureReturnsProjectionRangeContextDto == null ? 0 : advisoryFutureReturnsProjectionRangeContextDto.hashCode())) * 31;
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2 = this.projection_range_15;
            int iHashCode3 = (iHashCode2 + (advisoryFutureReturnsProjectionRangeContextDto2 == null ? 0 : advisoryFutureReturnsProjectionRangeContextDto2.hashCode())) * 31;
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3 = this.projection_range_30;
            return iHashCode3 + (advisoryFutureReturnsProjectionRangeContextDto3 != null ? advisoryFutureReturnsProjectionRangeContextDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(initial_portfolio_value=" + this.initial_portfolio_value + ", deposit_frequency=" + this.deposit_frequency + ", deposit_amount=" + this.deposit_amount + ", projection_range_1=" + this.projection_range_1 + ", projection_range_15=" + this.projection_range_15 + ", projection_range_30=" + this.projection_range_30 + ")";
        }

        /* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryFutureReturnsGraphContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.initial_portfolio_value = 0.0d;
            } else {
                this.initial_portfolio_value = d;
            }
            if ((i & 2) == 0) {
                this.deposit_frequency = "";
            } else {
                this.deposit_frequency = str;
            }
            if ((i & 4) == 0) {
                this.deposit_amount = 0.0d;
            } else {
                this.deposit_amount = d2;
            }
            if ((i & 8) == 0) {
                this.projection_range_1 = null;
            } else {
                this.projection_range_1 = advisoryFutureReturnsProjectionRangeContextDto;
            }
            if ((i & 16) == 0) {
                this.projection_range_15 = null;
            } else {
                this.projection_range_15 = advisoryFutureReturnsProjectionRangeContextDto2;
            }
            if ((i & 32) == 0) {
                this.projection_range_30 = null;
            } else {
                this.projection_range_30 = advisoryFutureReturnsProjectionRangeContextDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.initial_portfolio_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.initial_portfolio_value));
            }
            if (!Intrinsics.areEqual(self.deposit_frequency, "")) {
                output.encodeStringElement(serialDesc, 1, self.deposit_frequency);
            }
            if (Double.compare(self.deposit_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.deposit_amount));
            }
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto = self.projection_range_1;
            if (advisoryFutureReturnsProjectionRangeContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisoryFutureReturnsProjectionRangeContextDto.Serializer.INSTANCE, advisoryFutureReturnsProjectionRangeContextDto);
            }
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2 = self.projection_range_15;
            if (advisoryFutureReturnsProjectionRangeContextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AdvisoryFutureReturnsProjectionRangeContextDto.Serializer.INSTANCE, advisoryFutureReturnsProjectionRangeContextDto2);
            }
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3 = self.projection_range_30;
            if (advisoryFutureReturnsProjectionRangeContextDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AdvisoryFutureReturnsProjectionRangeContextDto.Serializer.INSTANCE, advisoryFutureReturnsProjectionRangeContextDto3);
            }
        }

        public Surrogate(double d, String deposit_frequency, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3) {
            Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
            this.initial_portfolio_value = d;
            this.deposit_frequency = deposit_frequency;
            this.deposit_amount = d2;
            this.projection_range_1 = advisoryFutureReturnsProjectionRangeContextDto;
            this.projection_range_15 = advisoryFutureReturnsProjectionRangeContextDto2;
            this.projection_range_30 = advisoryFutureReturnsProjectionRangeContextDto3;
        }

        public final double getInitial_portfolio_value() {
            return this.initial_portfolio_value;
        }

        public final String getDeposit_frequency() {
            return this.deposit_frequency;
        }

        public /* synthetic */ Surrogate(double d, String str, double d2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto2, AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto, (i & 16) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto2, (i & 32) != 0 ? null : advisoryFutureReturnsProjectionRangeContextDto3);
        }

        public final double getDeposit_amount() {
            return this.deposit_amount;
        }

        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_1() {
            return this.projection_range_1;
        }

        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_15() {
            return this.projection_range_15;
        }

        public final AdvisoryFutureReturnsProjectionRangeContextDto getProjection_range_30() {
            return this.projection_range_30;
        }
    }

    /* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto;", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryFutureReturnsGraphContextDto, AdvisoryFutureReturnsGraphContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryFutureReturnsGraphContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryFutureReturnsGraphContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryFutureReturnsGraphContextDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryFutureReturnsGraphContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryFutureReturnsGraphContext> getProtoAdapter() {
            return AdvisoryFutureReturnsGraphContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryFutureReturnsGraphContextDto getZeroValue() {
            return AdvisoryFutureReturnsGraphContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryFutureReturnsGraphContextDto fromProto(AdvisoryFutureReturnsGraphContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            double initial_portfolio_value = proto.getInitial_portfolio_value();
            String deposit_frequency = proto.getDeposit_frequency();
            double deposit_amount = proto.getDeposit_amount();
            AdvisoryFutureReturnsProjectionRangeContext projection_range_1 = proto.getProjection_range_1();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDtoFromProto = projection_range_1 != null ? AdvisoryFutureReturnsProjectionRangeContextDto.INSTANCE.fromProto(projection_range_1) : null;
            AdvisoryFutureReturnsProjectionRangeContext projection_range_15 = proto.getProjection_range_15();
            AdvisoryFutureReturnsProjectionRangeContextDto advisoryFutureReturnsProjectionRangeContextDtoFromProto2 = projection_range_15 != null ? AdvisoryFutureReturnsProjectionRangeContextDto.INSTANCE.fromProto(projection_range_15) : null;
            AdvisoryFutureReturnsProjectionRangeContext projection_range_30 = proto.getProjection_range_30();
            return new AdvisoryFutureReturnsGraphContextDto(new Surrogate(initial_portfolio_value, deposit_frequency, deposit_amount, advisoryFutureReturnsProjectionRangeContextDtoFromProto, advisoryFutureReturnsProjectionRangeContextDtoFromProto2, projection_range_30 != null ? AdvisoryFutureReturnsProjectionRangeContextDto.INSTANCE.fromProto(projection_range_30) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryFutureReturnsGraphContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryFutureReturnsGraphContextDto(0.0d, null, 0.0d, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisoryFutureReturnsGraphContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AdvisoryFutureReturnsGraphContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryFutureReturnsGraphContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryFutureReturnsGraphContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryFutureReturnsGraphContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryFutureReturnsGraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsGraphContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContextDto";
        }
    }
}
