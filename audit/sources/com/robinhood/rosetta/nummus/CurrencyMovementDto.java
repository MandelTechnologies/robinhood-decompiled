package com.robinhood.rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
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

/* compiled from: CurrencyMovementDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J=\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010(¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;)V", "Lokio/ByteString;", "currency_id", "", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "source_id", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "copy", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "toProto", "()Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "getCurrency_id", "()Lokio/ByteString;", "getAmount", "getTimestamp", "()Lj$/time/Instant;", "getSource_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class CurrencyMovementDto implements Dto3<CurrencyMovement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CurrencyMovementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyMovementDto, CurrencyMovement>> binaryBase64Serializer$delegate;
    private static final CurrencyMovementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CurrencyMovementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyMovementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getCurrency_id() {
        return this.surrogate.getCurrency_id();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final ByteString getSource_id() {
        return this.surrogate.getSource_id();
    }

    public /* synthetic */ CurrencyMovementDto(ByteString byteString, String str, Instant instant, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyMovementDto(ByteString currency_id, String amount, Instant instant, ByteString source_id) {
        this(new Surrogate(currency_id, amount, instant, source_id));
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
    }

    public static /* synthetic */ CurrencyMovementDto copy$default(CurrencyMovementDto currencyMovementDto, ByteString byteString, String str, Instant instant, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = currencyMovementDto.surrogate.getCurrency_id();
        }
        if ((i & 2) != 0) {
            str = currencyMovementDto.surrogate.getAmount();
        }
        if ((i & 4) != 0) {
            instant = currencyMovementDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            byteString2 = currencyMovementDto.surrogate.getSource_id();
        }
        return currencyMovementDto.copy(byteString, str, instant, byteString2);
    }

    public final CurrencyMovementDto copy(ByteString currency_id, String amount, Instant timestamp, ByteString source_id) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        return new CurrencyMovementDto(new Surrogate(currency_id, amount, timestamp, source_id));
    }

    @Override // com.robinhood.idl.Dto
    public CurrencyMovement toProto() {
        return new CurrencyMovement(this.surrogate.getCurrency_id(), this.surrogate.getAmount(), this.surrogate.getTimestamp(), this.surrogate.getSource_id(), null, 16, null);
    }

    public String toString() {
        return "[CurrencyMovementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CurrencyMovementDto) && Intrinsics.areEqual(((CurrencyMovementDto) other).surrogate, this.surrogate);
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
    /* compiled from: CurrencyMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bs\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u000e\u0010\u000fBC\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J6\u0010\"\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ|\u0010%\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010!RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010#R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u001f¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "currency_id", "", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "source_id", "<init>", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_nummus_nummus_externalRelease", "(Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Instant;", "component4", "copy", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getCurrency_id", "getCurrency_id$annotations", "()V", "Ljava/lang/String;", "getAmount", "getAmount$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getSource_id", "getSource_id$annotations", "Companion", "$serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String amount;
        private final ByteString currency_id;
        private final ByteString source_id;
        private final Instant timestamp;

        public Surrogate() {
            this((ByteString) null, (String) null, (Instant) null, (ByteString) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, String str, Instant instant, ByteString byteString2, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.currency_id;
            }
            if ((i & 2) != 0) {
                str = surrogate.amount;
            }
            if ((i & 4) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 8) != 0) {
                byteString2 = surrogate.source_id;
            }
            return surrogate.copy(byteString, str, instant, byteString2);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("currencyId")
        @JsonAnnotations2(names = {"currency_id"})
        public static /* synthetic */ void getCurrency_id$annotations() {
        }

        @SerialName("sourceId")
        @JsonAnnotations2(names = {"source_id"})
        public static /* synthetic */ void getSource_id$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getCurrency_id() {
            return this.currency_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final ByteString getSource_id() {
            return this.source_id;
        }

        public final Surrogate copy(ByteString currency_id, String amount, Instant timestamp, ByteString source_id) {
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            return new Surrogate(currency_id, amount, timestamp, source_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_id, surrogate.currency_id) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.source_id, surrogate.source_id);
        }

        public int hashCode() {
            int iHashCode = ((this.currency_id.hashCode() * 31) + this.amount.hashCode()) * 31;
            Instant instant = this.timestamp;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.source_id.hashCode();
        }

        public String toString() {
            return "Surrogate(currency_id=" + this.currency_id + ", amount=" + this.amount + ", timestamp=" + this.timestamp + ", source_id=" + this.source_id + ")";
        }

        /* compiled from: CurrencyMovementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyMovementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, String str, Instant instant, ByteString byteString2, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.amount = "";
            } else {
                this.amount = str;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.source_id = ByteString.EMPTY;
            } else {
                this.source_id = byteString2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.currency_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.currency_id);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 1, self.amount);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.source_id, byteString2)) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, ByteStringSerializer.INSTANCE, self.source_id);
        }

        public Surrogate(ByteString currency_id, String amount, Instant instant, ByteString source_id) {
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            this.currency_id = currency_id;
            this.amount = amount;
            this.timestamp = instant;
            this.source_id = source_id;
        }

        public final ByteString getCurrency_id() {
            return this.currency_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, String str, Instant instant, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString2);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final ByteString getSource_id() {
            return this.source_id;
        }
    }

    /* compiled from: CurrencyMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CurrencyMovementDto, CurrencyMovement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyMovementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyMovementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyMovementDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyMovementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CurrencyMovement> getProtoAdapter() {
            return CurrencyMovement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyMovementDto getZeroValue() {
            return CurrencyMovementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyMovementDto fromProto(CurrencyMovement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CurrencyMovementDto(new Surrogate(proto.getCurrency_id(), proto.getAmount(), proto.getTimestamp(), proto.getSource_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyMovementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyMovementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CurrencyMovementDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CurrencyMovementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CurrencyMovementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.CurrencyMovement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyMovementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyMovementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CurrencyMovementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CurrencyMovementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.nummus.CurrencyMovementDto";
        }
    }
}
