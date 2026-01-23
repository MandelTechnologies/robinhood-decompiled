package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.MoneyDto;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.TransferContextDto;
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

/* compiled from: TransferContextDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b23456789B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015JN\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate;)V", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "direction", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "payment_instrument", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "ref_id", "", "session_id", "(Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "getPayment_instrument", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "getRef_id", "()Ljava/lang/String;", "getSession_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DirectionDto", "EntryPointDto", "FrequencyDto", "PaymentInstrumentDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TransferContextDto implements Dto3<TransferContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TransferContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferContextDto, TransferContext>> binaryBase64Serializer$delegate;
    private static final TransferContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TransferContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final FrequencyDto getFrequency() {
        return this.surrogate.getFrequency();
    }

    public final PaymentInstrumentDto getPayment_instrument() {
        return this.surrogate.getPayment_instrument();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferContextDto(com.robinhood.rosetta.eventlogging.MoneyDto r2, com.robinhood.rosetta.eventlogging.TransferContextDto.DirectionDto r3, com.robinhood.rosetta.eventlogging.TransferContextDto.EntryPointDto r4, com.robinhood.rosetta.eventlogging.TransferContextDto.FrequencyDto r5, com.robinhood.rosetta.eventlogging.TransferContextDto.PaymentInstrumentDto r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            if (r10 == 0) goto Lf
            com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto$Companion r3 = com.robinhood.rosetta.eventlogging.TransferContextDto.DirectionDto.INSTANCE
            com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto r3 = r3.getZeroValue()
        Lf:
            r10 = r9 & 4
            if (r10 == 0) goto L19
            com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto$Companion r4 = com.robinhood.rosetta.eventlogging.TransferContextDto.EntryPointDto.INSTANCE
            com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto r4 = r4.getZeroValue()
        L19:
            r10 = r9 & 8
            if (r10 == 0) goto L23
            com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto$Companion r5 = com.robinhood.rosetta.eventlogging.TransferContextDto.FrequencyDto.INSTANCE
            com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto r5 = r5.getZeroValue()
        L23:
            r10 = r9 & 16
            if (r10 == 0) goto L2d
            com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto$Companion r6 = com.robinhood.rosetta.eventlogging.TransferContextDto.PaymentInstrumentDto.INSTANCE
            com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto r6 = r6.getZeroValue()
        L2d:
            r10 = r9 & 32
            java.lang.String r0 = ""
            if (r10 == 0) goto L34
            r7 = r0
        L34:
            r9 = r9 & 64
            if (r9 == 0) goto L41
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L49
        L41:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L49:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.TransferContextDto.<init>(com.robinhood.rosetta.eventlogging.MoneyDto, com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto, com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto, com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto, com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferContextDto(MoneyDto moneyDto, DirectionDto direction, EntryPointDto entry_point, FrequencyDto frequency, PaymentInstrumentDto payment_instrument, String ref_id, String session_id) {
        this(new Surrogate(moneyDto, direction, entry_point, frequency, payment_instrument, ref_id, session_id));
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
    }

    public static /* synthetic */ TransferContextDto copy$default(TransferContextDto transferContextDto, MoneyDto moneyDto, DirectionDto directionDto, EntryPointDto entryPointDto, FrequencyDto frequencyDto, PaymentInstrumentDto paymentInstrumentDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = transferContextDto.surrogate.getAmount();
        }
        if ((i & 2) != 0) {
            directionDto = transferContextDto.surrogate.getDirection();
        }
        if ((i & 4) != 0) {
            entryPointDto = transferContextDto.surrogate.getEntry_point();
        }
        if ((i & 8) != 0) {
            frequencyDto = transferContextDto.surrogate.getFrequency();
        }
        if ((i & 16) != 0) {
            paymentInstrumentDto = transferContextDto.surrogate.getPayment_instrument();
        }
        if ((i & 32) != 0) {
            str = transferContextDto.surrogate.getRef_id();
        }
        if ((i & 64) != 0) {
            str2 = transferContextDto.surrogate.getSession_id();
        }
        String str3 = str;
        String str4 = str2;
        PaymentInstrumentDto paymentInstrumentDto2 = paymentInstrumentDto;
        EntryPointDto entryPointDto2 = entryPointDto;
        return transferContextDto.copy(moneyDto, directionDto, entryPointDto2, frequencyDto, paymentInstrumentDto2, str3, str4);
    }

    public final TransferContextDto copy(MoneyDto amount, DirectionDto direction, EntryPointDto entry_point, FrequencyDto frequency, PaymentInstrumentDto payment_instrument, String ref_id, String session_id) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        return new TransferContextDto(new Surrogate(amount, direction, entry_point, frequency, payment_instrument, ref_id, session_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TransferContext toProto() {
        MoneyDto amount = this.surrogate.getAmount();
        return new TransferContext(amount != null ? amount.toProto() : null, (TransferContext.Direction) this.surrogate.getDirection().toProto(), (TransferContext.EntryPoint) this.surrogate.getEntry_point().toProto(), (TransferContext.Frequency) this.surrogate.getFrequency().toProto(), (TransferContext.PaymentInstrument) this.surrogate.getPayment_instrument().toProto(), this.surrogate.getRef_id(), this.surrogate.getSession_id(), null, 128, null);
    }

    public String toString() {
        return "[TransferContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TransferContextDto) && Intrinsics.areEqual(((TransferContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@ABO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003JQ\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0012HÖ\u0001J\t\u00107\u001a\u00020\rHÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010(¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate;", "", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "direction", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "payment_instrument", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "ref_id", "", "session_id", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAmount$annotations", "()V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getDirection$annotations", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "getFrequency$annotations", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "getPayment_instrument$annotations", "getPayment_instrument", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "getRef_id$annotations", "getRef_id", "()Ljava/lang/String;", "getSession_id$annotations", "getSession_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final DirectionDto direction;
        private final EntryPointDto entry_point;
        private final FrequencyDto frequency;
        private final PaymentInstrumentDto payment_instrument;
        private final String ref_id;
        private final String session_id;

        public Surrogate() {
            this((MoneyDto) null, (DirectionDto) null, (EntryPointDto) null, (FrequencyDto) null, (PaymentInstrumentDto) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, DirectionDto directionDto, EntryPointDto entryPointDto, FrequencyDto frequencyDto, PaymentInstrumentDto paymentInstrumentDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.amount;
            }
            if ((i & 2) != 0) {
                directionDto = surrogate.direction;
            }
            if ((i & 4) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            if ((i & 8) != 0) {
                frequencyDto = surrogate.frequency;
            }
            if ((i & 16) != 0) {
                paymentInstrumentDto = surrogate.payment_instrument;
            }
            if ((i & 32) != 0) {
                str = surrogate.ref_id;
            }
            if ((i & 64) != 0) {
                str2 = surrogate.session_id;
            }
            String str3 = str;
            String str4 = str2;
            PaymentInstrumentDto paymentInstrumentDto2 = paymentInstrumentDto;
            EntryPointDto entryPointDto2 = entryPointDto;
            return surrogate.copy(moneyDto, directionDto, entryPointDto2, frequencyDto, paymentInstrumentDto2, str3, str4);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("frequency")
        @JsonAnnotations2(names = {"frequency"})
        public static /* synthetic */ void getFrequency$annotations() {
        }

        @SerialName("paymentInstrument")
        @JsonAnnotations2(names = {"payment_instrument"})
        public static /* synthetic */ void getPayment_instrument$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component3, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component4, reason: from getter */
        public final FrequencyDto getFrequency() {
            return this.frequency;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentInstrumentDto getPayment_instrument() {
            return this.payment_instrument;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        public final Surrogate copy(MoneyDto amount, DirectionDto direction, EntryPointDto entry_point, FrequencyDto frequency, PaymentInstrumentDto payment_instrument, String ref_id, String session_id) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            return new Surrogate(amount, direction, entry_point, frequency, payment_instrument, ref_id, session_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.amount, surrogate.amount) && this.direction == surrogate.direction && this.entry_point == surrogate.entry_point && this.frequency == surrogate.frequency && this.payment_instrument == surrogate.payment_instrument && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.session_id, surrogate.session_id);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.amount;
            return ((((((((((((moneyDto == null ? 0 : moneyDto.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.entry_point.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.payment_instrument.hashCode()) * 31) + this.ref_id.hashCode()) * 31) + this.session_id.hashCode();
        }

        public String toString() {
            return "Surrogate(amount=" + this.amount + ", direction=" + this.direction + ", entry_point=" + this.entry_point + ", frequency=" + this.frequency + ", payment_instrument=" + this.payment_instrument + ", ref_id=" + this.ref_id + ", session_id=" + this.session_id + ")";
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TransferContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, DirectionDto directionDto, EntryPointDto entryPointDto, FrequencyDto frequencyDto, PaymentInstrumentDto paymentInstrumentDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.amount = (i & 1) == 0 ? null : moneyDto;
            if ((i & 2) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 4) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 8) == 0) {
                this.frequency = FrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = frequencyDto;
            }
            if ((i & 16) == 0) {
                this.payment_instrument = PaymentInstrumentDto.INSTANCE.getZeroValue();
            } else {
                this.payment_instrument = paymentInstrumentDto;
            }
            if ((i & 32) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 64) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (self.frequency != FrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, FrequencyDto.Serializer.INSTANCE, self.frequency);
            }
            if (self.payment_instrument != PaymentInstrumentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, PaymentInstrumentDto.Serializer.INSTANCE, self.payment_instrument);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.ref_id);
            }
            if (Intrinsics.areEqual(self.session_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.session_id);
        }

        public Surrogate(MoneyDto moneyDto, DirectionDto direction, EntryPointDto entry_point, FrequencyDto frequency, PaymentInstrumentDto payment_instrument, String ref_id, String session_id) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(payment_instrument, "payment_instrument");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            this.amount = moneyDto;
            this.direction = direction;
            this.entry_point = entry_point;
            this.frequency = frequency;
            this.payment_instrument = payment_instrument;
            this.ref_id = ref_id;
            this.session_id = session_id;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.MoneyDto r2, com.robinhood.rosetta.eventlogging.TransferContextDto.DirectionDto r3, com.robinhood.rosetta.eventlogging.TransferContextDto.EntryPointDto r4, com.robinhood.rosetta.eventlogging.TransferContextDto.FrequencyDto r5, com.robinhood.rosetta.eventlogging.TransferContextDto.PaymentInstrumentDto r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L5
                r2 = 0
            L5:
                r10 = r9 & 2
                if (r10 == 0) goto Lf
                com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto$Companion r3 = com.robinhood.rosetta.eventlogging.TransferContextDto.DirectionDto.INSTANCE
                com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto r3 = r3.getZeroValue()
            Lf:
                r10 = r9 & 4
                if (r10 == 0) goto L19
                com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto$Companion r4 = com.robinhood.rosetta.eventlogging.TransferContextDto.EntryPointDto.INSTANCE
                com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto r4 = r4.getZeroValue()
            L19:
                r10 = r9 & 8
                if (r10 == 0) goto L23
                com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto$Companion r5 = com.robinhood.rosetta.eventlogging.TransferContextDto.FrequencyDto.INSTANCE
                com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto r5 = r5.getZeroValue()
            L23:
                r10 = r9 & 16
                if (r10 == 0) goto L2d
                com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto$Companion r6 = com.robinhood.rosetta.eventlogging.TransferContextDto.PaymentInstrumentDto.INSTANCE
                com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto r6 = r6.getZeroValue()
            L2d:
                r10 = r9 & 32
                java.lang.String r0 = ""
                if (r10 == 0) goto L34
                r7 = r0
            L34:
                r9 = r9 & 64
                if (r9 == 0) goto L41
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L49
            L41:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L49:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.TransferContextDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.MoneyDto, com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto, com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto, com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto, com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final FrequencyDto getFrequency() {
            return this.frequency;
        }

        public final PaymentInstrumentDto getPayment_instrument() {
            return this.payment_instrument;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getSession_id() {
            return this.session_id;
        }
    }

    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TransferContextDto, TransferContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferContextDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferContext> getProtoAdapter() {
            return TransferContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferContextDto getZeroValue() {
            return TransferContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferContextDto fromProto(TransferContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money amount = proto.getAmount();
            return new TransferContextDto(new Surrogate(amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null, DirectionDto.INSTANCE.fromProto(proto.getDirection()), EntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), FrequencyDto.INSTANCE.fromProto(proto.getFrequency()), PaymentInstrumentDto.INSTANCE.fromProto(proto.getPayment_instrument()), proto.getRef_id(), proto.getSession_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TransferContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TransferContextDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_TYPE_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<TransferContext.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, TransferContext.Direction>> binaryBase64Serializer$delegate;
        public static final DirectionDto DIRECTION_TYPE_UNSPECIFIED = new DIRECTION_TYPE_UNSPECIFIED("DIRECTION_TYPE_UNSPECIFIED", 0);
        public static final DirectionDto DEPOSIT = new DEPOSIT("DEPOSIT", 1);
        public static final DirectionDto WITHDRAWAL = new WITHDRAWAL("WITHDRAWAL", 2);

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{DIRECTION_TYPE_UNSPECIFIED, DEPOSIT, WITHDRAWAL};
        }

        public /* synthetic */ DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.DirectionDto.DIRECTION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECTION_TYPE_UNSPECIFIED extends DirectionDto {
            DIRECTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Direction toProto() {
                return TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED;
            }
        }

        private DirectionDto(String str, int i) {
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TransferContextDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferContextDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.DirectionDto.DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends DirectionDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Direction toProto() {
                return TransferContext.Direction.DEPOSIT;
            }
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.DirectionDto.WITHDRAWAL", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAWAL extends DirectionDto {
            WITHDRAWAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Direction toProto() {
                return TransferContext.Direction.WITHDRAWAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, TransferContext.Direction> {

            /* compiled from: TransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TransferContext.Direction.values().length];
                    try {
                        iArr[TransferContext.Direction.DIRECTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TransferContext.Direction.DEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TransferContext.Direction.WITHDRAWAL.ordinal()] = 3;
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

            public final KSerializer<DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TransferContext.Direction> getProtoAdapter() {
                return TransferContext.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.DIRECTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(TransferContext.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.DIRECTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectionDto.DEPOSIT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectionDto.WITHDRAWAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, TransferContext.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TransferContext.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_TYPE_UNKNOWN", "FIRST_TRADE_RECOMMENDATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<TransferContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPointDto ENTRY_POINT_TYPE_UNKNOWN = new ENTRY_POINT_TYPE_UNKNOWN("ENTRY_POINT_TYPE_UNKNOWN", 0);
        public static final EntryPointDto FIRST_TRADE_RECOMMENDATION = new FIRST_TRADE_RECOMMENDATION("FIRST_TRADE_RECOMMENDATION", 1);
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, TransferContext.EntryPoint>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_TYPE_UNKNOWN, FIRST_TRADE_RECOMMENDATION};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.EntryPointDto.ENTRY_POINT_TYPE_UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_TYPE_UNKNOWN extends EntryPointDto {
            ENTRY_POINT_TYPE_UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.EntryPoint toProto() {
                return TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TransferContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.EntryPointDto.FIRST_TRADE_RECOMMENDATION", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIRST_TRADE_RECOMMENDATION extends EntryPointDto {
            FIRST_TRADE_RECOMMENDATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.EntryPoint toProto() {
                return TransferContext.EntryPoint.FIRST_TRADE_RECOMMENDATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, TransferContext.EntryPoint> {

            /* compiled from: TransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TransferContext.EntryPoint.values().length];
                    try {
                        iArr[TransferContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TransferContext.EntryPoint.FIRST_TRADE_RECOMMENDATION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TransferContext.EntryPoint> getProtoAdapter() {
                return TransferContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_TYPE_UNKNOWN;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(TransferContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EntryPointDto.ENTRY_POINT_TYPE_UNKNOWN;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return EntryPointDto.FIRST_TRADE_RECOMMENDATION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, TransferContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TransferContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FREQUENCY_TYPE_UNSPECIFIED", "ONCE", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FrequencyDto implements Dto2<TransferContext.Frequency>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FrequencyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FrequencyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FrequencyDto, TransferContext.Frequency>> binaryBase64Serializer$delegate;
        public static final FrequencyDto FREQUENCY_TYPE_UNSPECIFIED = new FREQUENCY_TYPE_UNSPECIFIED("FREQUENCY_TYPE_UNSPECIFIED", 0);
        public static final FrequencyDto ONCE = new ONCE("ONCE", 1);
        public static final FrequencyDto WEEKLY = new WEEKLY("WEEKLY", 2);
        public static final FrequencyDto BIWEEKLY = new BIWEEKLY("BIWEEKLY", 3);
        public static final FrequencyDto MONTHLY = new MONTHLY("MONTHLY", 4);
        public static final FrequencyDto QUARTERLY = new QUARTERLY("QUARTERLY", 5);

        private static final /* synthetic */ FrequencyDto[] $values() {
            return new FrequencyDto[]{FREQUENCY_TYPE_UNSPECIFIED, ONCE, WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
        }

        public /* synthetic */ FrequencyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FrequencyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.FREQUENCY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FREQUENCY_TYPE_UNSPECIFIED extends FrequencyDto {
            FREQUENCY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED;
            }
        }

        private FrequencyDto(String str, int i) {
        }

        static {
            FrequencyDto[] frequencyDtoArr$values = $values();
            $VALUES = frequencyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(frequencyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TransferContextDto$FrequencyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferContextDto.FrequencyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.ONCE", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONCE extends FrequencyDto {
            ONCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.ONCE;
            }
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.WEEKLY", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEEKLY extends FrequencyDto {
            WEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.WEEKLY;
            }
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.BIWEEKLY", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BIWEEKLY extends FrequencyDto {
            BIWEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.BIWEEKLY;
            }
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.MONTHLY", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MONTHLY extends FrequencyDto {
            MONTHLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.MONTHLY;
            }
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.FrequencyDto.QUARTERLY", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUARTERLY extends FrequencyDto {
            QUARTERLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.Frequency toProto() {
                return TransferContext.Frequency.QUARTERLY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FrequencyDto, TransferContext.Frequency> {

            /* compiled from: TransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TransferContext.Frequency.values().length];
                    try {
                        iArr[TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TransferContext.Frequency.ONCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TransferContext.Frequency.WEEKLY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TransferContext.Frequency.BIWEEKLY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TransferContext.Frequency.MONTHLY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TransferContext.Frequency.QUARTERLY.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FrequencyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FrequencyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FrequencyDto> getBinaryBase64Serializer() {
                return (KSerializer) FrequencyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TransferContext.Frequency> getProtoAdapter() {
                return TransferContext.Frequency.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FrequencyDto getZeroValue() {
                return FrequencyDto.FREQUENCY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FrequencyDto fromProto(TransferContext.Frequency proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return FrequencyDto.FREQUENCY_TYPE_UNSPECIFIED;
                    case 2:
                        return FrequencyDto.ONCE;
                    case 3:
                        return FrequencyDto.WEEKLY;
                    case 4:
                        return FrequencyDto.BIWEEKLY;
                    case 5:
                        return FrequencyDto.MONTHLY;
                    case 6:
                        return FrequencyDto.QUARTERLY;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<FrequencyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FrequencyDto, TransferContext.Frequency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TransferContext.Frequency", FrequencyDto.getEntries(), FrequencyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FrequencyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FrequencyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FrequencyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FrequencyDto valueOf(String str) {
            return (FrequencyDto) Enum.valueOf(FrequencyDto.class, str);
        }

        public static FrequencyDto[] values() {
            return (FrequencyDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED", "ACH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PaymentInstrumentDto implements Dto2<TransferContext.PaymentInstrument>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentInstrumentDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PaymentInstrumentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PaymentInstrumentDto, TransferContext.PaymentInstrument>> binaryBase64Serializer$delegate;
        public static final PaymentInstrumentDto PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED = new PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED("PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED", 0);
        public static final PaymentInstrumentDto ACH = new ACH("ACH", 1);

        private static final /* synthetic */ PaymentInstrumentDto[] $values() {
            return new PaymentInstrumentDto[]{PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED, ACH};
        }

        public /* synthetic */ PaymentInstrumentDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PaymentInstrumentDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PaymentInstrumentDto(String str, int i) {
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.PaymentInstrumentDto.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED extends PaymentInstrumentDto {
            PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.PaymentInstrument toProto() {
                return TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
            }
        }

        static {
            PaymentInstrumentDto[] paymentInstrumentDtoArr$values = $values();
            $VALUES = paymentInstrumentDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(paymentInstrumentDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TransferContextDto$PaymentInstrumentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferContextDto.PaymentInstrumentDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TransferContextDto.PaymentInstrumentDto.ACH", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH extends PaymentInstrumentDto {
            ACH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TransferContext.PaymentInstrument toProto() {
                return TransferContext.PaymentInstrument.ACH;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$PaymentInstrument;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PaymentInstrumentDto, TransferContext.PaymentInstrument> {

            /* compiled from: TransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TransferContext.PaymentInstrument.values().length];
                    try {
                        iArr[TransferContext.PaymentInstrument.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TransferContext.PaymentInstrument.ACH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PaymentInstrumentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PaymentInstrumentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PaymentInstrumentDto> getBinaryBase64Serializer() {
                return (KSerializer) PaymentInstrumentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TransferContext.PaymentInstrument> getProtoAdapter() {
                return TransferContext.PaymentInstrument.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PaymentInstrumentDto getZeroValue() {
                return PaymentInstrumentDto.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PaymentInstrumentDto fromProto(TransferContext.PaymentInstrument proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PaymentInstrumentDto.PAYMENT_INSTRUMENT_TYPE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return PaymentInstrumentDto.ACH;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$PaymentInstrumentDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<PaymentInstrumentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PaymentInstrumentDto, TransferContext.PaymentInstrument> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TransferContext.PaymentInstrument", PaymentInstrumentDto.getEntries(), PaymentInstrumentDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PaymentInstrumentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PaymentInstrumentDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PaymentInstrumentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PaymentInstrumentDto valueOf(String str) {
            return (PaymentInstrumentDto) Enum.valueOf(PaymentInstrumentDto.class, str);
        }

        public static PaymentInstrumentDto[] values() {
            return (PaymentInstrumentDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TransferContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TransferContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TransferContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TransferContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TransferContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TransferContextDto";
        }
    }
}
