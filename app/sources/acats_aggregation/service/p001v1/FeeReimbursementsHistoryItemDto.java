package acats_aggregation.service.p001v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: FeeReimbursementsHistoryItemDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItem;", "Landroid/os/Parcelable;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;", "surrogate", "<init>", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;)V", "", "id", "account_number", "", "amount", "title", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "completion_date", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lj$/time/Instant;)V", "toProto", "()Lacats_aggregation/service/v1/FeeReimbursementsHistoryItem;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;", "getId", "getAccount_number", "getAmount", "()D", "getTitle", "getCompletion_date", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FeeReimbursementsHistoryItemDto implements Dto3<FeeReimbursementsHistoryItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeReimbursementsHistoryItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeReimbursementsHistoryItemDto, FeeReimbursementsHistoryItem>> binaryBase64Serializer$delegate;
    private static final FeeReimbursementsHistoryItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeReimbursementsHistoryItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeReimbursementsHistoryItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final Instant getCompletion_date() {
        return this.surrogate.getCompletion_date();
    }

    public /* synthetic */ FeeReimbursementsHistoryItemDto(String str, String str2, double d, String str3, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeReimbursementsHistoryItemDto(String id, String account_number, double d, String title, Instant instant) {
        this(new Surrogate(id, account_number, d, title, instant));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
    }

    @Override // com.robinhood.idl.Dto
    public FeeReimbursementsHistoryItem toProto() {
        return new FeeReimbursementsHistoryItem(this.surrogate.getId(), this.surrogate.getAccount_number(), this.surrogate.getAmount(), this.surrogate.getTitle(), this.surrogate.getCompletion_date(), null, 32, null);
    }

    public String toString() {
        return "[FeeReimbursementsHistoryItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeReimbursementsHistoryItemDto) && Intrinsics.areEqual(((FeeReimbursementsHistoryItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeReimbursementsHistoryItemDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287Bn\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010 R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010 RF\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;", "", "", "id", "account_number", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "amount", "title", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "completion_date", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$acats_aggregation_service_v1_externalRelease", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "D", "getAmount", "()D", "getAmount$annotations", "getTitle", "getTitle$annotations", "Lj$/time/Instant;", "getCompletion_date", "()Lj$/time/Instant;", "getCompletion_date$annotations", "Companion", "$serializer", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final double amount;
        private final Instant completion_date;
        private final String id;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, 0.0d, (String) null, (Instant) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Double.compare(this.amount, surrogate.amount) == 0 && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.completion_date, surrogate.completion_date);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.title.hashCode()) * 31;
            Instant instant = this.completion_date;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", amount=" + this.amount + ", title=" + this.title + ", completion_date=" + this.completion_date + ")";
        }

        /* compiled from: FeeReimbursementsHistoryItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeReimbursementsHistoryItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, double d, String str3, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 8) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 16) == 0) {
                this.completion_date = null;
            } else {
                this.completion_date = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$acats_aggregation_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 3, self.title);
            }
            Instant instant = self.completion_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(String id, String account_number, double d, String title, Instant instant) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id;
            this.account_number = account_number;
            this.amount = d;
            this.title = title;
            this.completion_date = instant;
        }

        public /* synthetic */ Surrogate(String str, String str2, double d, String str3, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : instant);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Instant getCompletion_date() {
            return this.completion_date;
        }
    }

    /* compiled from: FeeReimbursementsHistoryItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FeeReimbursementsHistoryItemDto, FeeReimbursementsHistoryItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeReimbursementsHistoryItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeReimbursementsHistoryItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeReimbursementsHistoryItemDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeReimbursementsHistoryItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeReimbursementsHistoryItem> getProtoAdapter() {
            return FeeReimbursementsHistoryItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeReimbursementsHistoryItemDto getZeroValue() {
            return FeeReimbursementsHistoryItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeReimbursementsHistoryItemDto fromProto(FeeReimbursementsHistoryItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FeeReimbursementsHistoryItemDto(new Surrogate(proto.getId(), proto.getAccount_number(), proto.getAmount(), proto.getTitle(), proto.getCompletion_date()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: acats_aggregation.service.v1.FeeReimbursementsHistoryItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeReimbursementsHistoryItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeReimbursementsHistoryItemDto(null, null, 0.0d, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeReimbursementsHistoryItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto;", "<init>", "()V", "surrogateSerializer", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeReimbursementsHistoryItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/acats_aggregation.service.v1.FeeReimbursementsHistoryItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeReimbursementsHistoryItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeReimbursementsHistoryItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeReimbursementsHistoryItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeReimbursementsHistoryItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "acats_aggregation.service.v1.FeeReimbursementsHistoryItemDto";
        }
    }
}
