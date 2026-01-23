package com.robinhood.rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import okio.ByteString;
import p479j$.time.Instant;
import rosetta.order.Side;
import rosetta.order.SideDto;

/* compiled from: ExecutionDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b3\u00101R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b6\u0010\u001b¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/nummus/Execution;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;)V", "Lokio/ByteString;", "id", "Lrosetta/order/SideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "settlement_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "fee_amount", "(Lokio/ByteString;Lrosetta/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)V", "copy", "(Lokio/ByteString;Lrosetta/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/rosetta/nummus/ExecutionDto;", "toProto", "()Lcom/robinhood/rosetta/nummus/Execution;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "getId", "()Lokio/ByteString;", "getSide", "()Lrosetta/order/SideDto;", "getPrice", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getSettlement_amount", "getTimestamp", "()Lj$/time/Instant;", "getFee_amount", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ExecutionDto implements Dto3<Execution>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ExecutionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ExecutionDto, Execution>> binaryBase64Serializer$delegate;
    private static final ExecutionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ExecutionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ExecutionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getId() {
        return this.surrogate.getId();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final IdlDecimal getPrice() {
        return this.surrogate.getPrice();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getSettlement_amount() {
        return this.surrogate.getSettlement_amount();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getFee_amount() {
        return this.surrogate.getFee_amount();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ExecutionDto(okio.ByteString r2, rosetta.order.SideDto r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.idl.IdlDecimal r5, com.robinhood.idl.IdlDecimal r6, p479j$.time.Instant r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            okio.ByteString r2 = okio.ByteString.EMPTY
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto L10
            rosetta.order.SideDto$Companion r3 = rosetta.order.SideDto.INSTANCE
            rosetta.order.SideDto r3 = r3.getZeroValue()
        L10:
            r10 = r9 & 4
            java.lang.String r0 = ""
            if (r10 == 0) goto L1b
            com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
            r4.<init>(r0)
        L1b:
            r10 = r9 & 8
            if (r10 == 0) goto L24
            com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
            r5.<init>(r0)
        L24:
            r10 = r9 & 16
            if (r10 == 0) goto L2d
            com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
            r6.<init>(r0)
        L2d:
            r10 = r9 & 32
            if (r10 == 0) goto L32
            r7 = 0
        L32:
            r9 = r9 & 64
            if (r9 == 0) goto L3f
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L47
        L3f:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L47:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.nummus.ExecutionDto.<init>(okio.ByteString, rosetta.order.SideDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, j$.time.Instant, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExecutionDto(ByteString id, SideDto side, IdlDecimal price, IdlDecimal quantity, IdlDecimal settlement_amount, Instant instant, String fee_amount) {
        this(new Surrogate(id, side, price, quantity, settlement_amount, instant, fee_amount));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
    }

    public static /* synthetic */ ExecutionDto copy$default(ExecutionDto executionDto, ByteString byteString, SideDto sideDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, Instant instant, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = executionDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            sideDto = executionDto.surrogate.getSide();
        }
        if ((i & 4) != 0) {
            idlDecimal = executionDto.surrogate.getPrice();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = executionDto.surrogate.getQuantity();
        }
        if ((i & 16) != 0) {
            idlDecimal3 = executionDto.surrogate.getSettlement_amount();
        }
        if ((i & 32) != 0) {
            instant = executionDto.surrogate.getTimestamp();
        }
        if ((i & 64) != 0) {
            str = executionDto.surrogate.getFee_amount();
        }
        Instant instant2 = instant;
        String str2 = str;
        IdlDecimal idlDecimal4 = idlDecimal3;
        IdlDecimal idlDecimal5 = idlDecimal;
        return executionDto.copy(byteString, sideDto, idlDecimal5, idlDecimal2, idlDecimal4, instant2, str2);
    }

    public final ExecutionDto copy(ByteString id, SideDto side, IdlDecimal price, IdlDecimal quantity, IdlDecimal settlement_amount, Instant timestamp, String fee_amount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
        return new ExecutionDto(new Surrogate(id, side, price, quantity, settlement_amount, timestamp, fee_amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Execution toProto() {
        return new Execution(this.surrogate.getId(), (Side) this.surrogate.getSide().toProto(), this.surrogate.getPrice().getStringValue(), this.surrogate.getQuantity().getStringValue(), this.surrogate.getSettlement_amount().getStringValue(), this.surrogate.getTimestamp(), this.surrogate.getFee_amount(), null, 128, null);
    }

    public String toString() {
        return "[ExecutionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ExecutionDto) && Intrinsics.areEqual(((ExecutionDto) other).surrogate, this.surrogate);
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
    /* compiled from: ExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMB¯\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Ba\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u001f\u0010+\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b+\u0010)J6\u0010,\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J¸\u0001\u00100\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\b\u0002\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\f\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010'R/\u0010\u000b\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010)R/\u0010\f\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010)R/\u0010\r\u001a\u00110\t¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010)RF\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010-R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010J\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010/¨\u0006O"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "id", "Lrosetta/order/SideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "settlement_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "fee_amount", "<init>", "(Lokio/ByteString;Lrosetta/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lrosetta/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_nummus_nummus_externalRelease", "(Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Lrosetta/order/SideDto;", "component3", "()Lcom/robinhood/idl/IdlDecimal;", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lrosetta/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getId", "getId$annotations", "()V", "Lrosetta/order/SideDto;", "getSide", "getSide$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getPrice", "getPrice$annotations", "getQuantity", "getQuantity$annotations", "getSettlement_amount", "getSettlement_amount$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getFee_amount", "getFee_amount$annotations", "Companion", "$serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String fee_amount;
        private final ByteString id;
        private final IdlDecimal price;
        private final IdlDecimal quantity;
        private final IdlDecimal settlement_amount;
        private final SideDto side;
        private final Instant timestamp;

        public Surrogate() {
            this((ByteString) null, (SideDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, SideDto sideDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, Instant instant, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.id;
            }
            if ((i & 2) != 0) {
                sideDto = surrogate.side;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.price;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.quantity;
            }
            if ((i & 16) != 0) {
                idlDecimal3 = surrogate.settlement_amount;
            }
            if ((i & 32) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 64) != 0) {
                str = surrogate.fee_amount;
            }
            Instant instant2 = instant;
            String str2 = str;
            IdlDecimal idlDecimal4 = idlDecimal3;
            IdlDecimal idlDecimal5 = idlDecimal;
            return surrogate.copy(byteString, sideDto, idlDecimal5, idlDecimal2, idlDecimal4, instant2, str2);
        }

        @SerialName("feeAmount")
        @JsonAnnotations2(names = {"fee_amount"})
        public static /* synthetic */ void getFee_amount$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("settlementAmount")
        @JsonAnnotations2(names = {"settlement_amount"})
        public static /* synthetic */ void getSettlement_amount$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getSettlement_amount() {
            return this.settlement_amount;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFee_amount() {
            return this.fee_amount;
        }

        public final Surrogate copy(ByteString id, SideDto side, IdlDecimal price, IdlDecimal quantity, IdlDecimal settlement_amount, Instant timestamp, String fee_amount) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
            Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
            return new Surrogate(id, side, price, quantity, settlement_amount, timestamp, fee_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.side == surrogate.side && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.settlement_amount, surrogate.settlement_amount) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.fee_amount, surrogate.fee_amount);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.side.hashCode()) * 31) + this.price.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.settlement_amount.hashCode()) * 31;
            Instant instant = this.timestamp;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.fee_amount.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", side=" + this.side + ", price=" + this.price + ", quantity=" + this.quantity + ", settlement_amount=" + this.settlement_amount + ", timestamp=" + this.timestamp + ", fee_amount=" + this.fee_amount + ")";
        }

        /* compiled from: ExecutionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ExecutionDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, SideDto sideDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, Instant instant, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 4) == 0) {
                this.price = new IdlDecimal("");
            } else {
                this.price = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.settlement_amount = new IdlDecimal("");
            } else {
                this.settlement_amount = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 64) == 0) {
                this.fee_amount = "";
            } else {
                this.fee_amount = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.id);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.side);
            }
            if (!Intrinsics.areEqual(self.price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.price);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.settlement_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.settlement_amount);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.fee_amount, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.fee_amount);
        }

        public Surrogate(ByteString id, SideDto side, IdlDecimal price, IdlDecimal quantity, IdlDecimal settlement_amount, Instant instant, String fee_amount) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(settlement_amount, "settlement_amount");
            Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
            this.id = id;
            this.side = side;
            this.price = price;
            this.quantity = quantity;
            this.settlement_amount = settlement_amount;
            this.timestamp = instant;
            this.fee_amount = fee_amount;
        }

        public final ByteString getId() {
            return this.id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(okio.ByteString r2, rosetta.order.SideDto r3, com.robinhood.idl.IdlDecimal r4, com.robinhood.idl.IdlDecimal r5, com.robinhood.idl.IdlDecimal r6, p479j$.time.Instant r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                okio.ByteString r2 = okio.ByteString.EMPTY
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto L10
                rosetta.order.SideDto$Companion r3 = rosetta.order.SideDto.INSTANCE
                rosetta.order.SideDto r3 = r3.getZeroValue()
            L10:
                r10 = r9 & 4
                java.lang.String r0 = ""
                if (r10 == 0) goto L1b
                com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
                r4.<init>(r0)
            L1b:
                r10 = r9 & 8
                if (r10 == 0) goto L24
                com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
                r5.<init>(r0)
            L24:
                r10 = r9 & 16
                if (r10 == 0) goto L2d
                com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
                r6.<init>(r0)
            L2d:
                r10 = r9 & 32
                if (r10 == 0) goto L32
                r7 = 0
            L32:
                r9 = r9 & 64
                if (r9 == 0) goto L3f
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L47
            L3f:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L47:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.nummus.ExecutionDto.Surrogate.<init>(okio.ByteString, rosetta.order.SideDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, j$.time.Instant, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getSettlement_amount() {
            return this.settlement_amount;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getFee_amount() {
            return this.fee_amount;
        }
    }

    /* compiled from: ExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/nummus/ExecutionDto;", "Lcom/robinhood/rosetta/nummus/Execution;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/ExecutionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ExecutionDto, Execution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExecutionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExecutionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExecutionDto> getBinaryBase64Serializer() {
            return (KSerializer) ExecutionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Execution> getProtoAdapter() {
            return Execution.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExecutionDto getZeroValue() {
            return ExecutionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExecutionDto fromProto(Execution proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ExecutionDto(new Surrogate(proto.getId(), SideDto.INSTANCE.fromProto(proto.getSide()), new IdlDecimal(proto.getPrice()), new IdlDecimal(proto.getQuantity()), new IdlDecimal(proto.getSettlement_amount()), proto.getTimestamp(), proto.getFee_amount()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.ExecutionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExecutionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ExecutionDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ExecutionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/ExecutionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/nummus/ExecutionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ExecutionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.Execution", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ExecutionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ExecutionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ExecutionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ExecutionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.nummus.ExecutionDto";
        }
    }
}
