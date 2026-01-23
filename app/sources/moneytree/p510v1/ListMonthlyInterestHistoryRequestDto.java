package moneytree.p510v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0006\u0010\u0010JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequest;", "Landroid/os/Parcelable;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;", "surrogate", "<init>", "(Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;)V", "", "cursor", "", "limit", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at_gte", "created_at_lte", "(Ljava/lang/String;ILj$/time/Instant;Lj$/time/Instant;)V", "copy", "(Ljava/lang/String;ILj$/time/Instant;Lj$/time/Instant;)Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "toProto", "()Lmoneytree/v1/ListMonthlyInterestHistoryRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;", "getCursor", "getLimit", "getCreated_at_gte", "()Lj$/time/Instant;", "getCreated_at_lte", "Companion", "Surrogate", "Serializer", "MultibindingModule", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class ListMonthlyInterestHistoryRequestDto implements Dto3<ListMonthlyInterestHistoryRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListMonthlyInterestHistoryRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListMonthlyInterestHistoryRequestDto, ListMonthlyInterestHistoryRequest>> binaryBase64Serializer$delegate;
    private static final ListMonthlyInterestHistoryRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListMonthlyInterestHistoryRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListMonthlyInterestHistoryRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final int getLimit() {
        return this.surrogate.getLimit();
    }

    public final Instant getCreated_at_gte() {
        return this.surrogate.getCreated_at_gte();
    }

    public final Instant getCreated_at_lte() {
        return this.surrogate.getCreated_at_lte();
    }

    public /* synthetic */ ListMonthlyInterestHistoryRequestDto(String str, int i, Instant instant, Instant instant2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListMonthlyInterestHistoryRequestDto(String cursor, int i, Instant instant, Instant instant2) {
        this(new Surrogate(cursor, i, instant, instant2));
        Intrinsics.checkNotNullParameter(cursor, "cursor");
    }

    public static /* synthetic */ ListMonthlyInterestHistoryRequestDto copy$default(ListMonthlyInterestHistoryRequestDto listMonthlyInterestHistoryRequestDto, String str, int i, Instant instant, Instant instant2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listMonthlyInterestHistoryRequestDto.surrogate.getCursor();
        }
        if ((i2 & 2) != 0) {
            i = listMonthlyInterestHistoryRequestDto.surrogate.getLimit();
        }
        if ((i2 & 4) != 0) {
            instant = listMonthlyInterestHistoryRequestDto.surrogate.getCreated_at_gte();
        }
        if ((i2 & 8) != 0) {
            instant2 = listMonthlyInterestHistoryRequestDto.surrogate.getCreated_at_lte();
        }
        return listMonthlyInterestHistoryRequestDto.copy(str, i, instant, instant2);
    }

    public final ListMonthlyInterestHistoryRequestDto copy(String cursor, int limit, Instant created_at_gte, Instant created_at_lte) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        return new ListMonthlyInterestHistoryRequestDto(new Surrogate(cursor, limit, created_at_gte, created_at_lte));
    }

    @Override // com.robinhood.idl.Dto
    public ListMonthlyInterestHistoryRequest toProto() {
        return new ListMonthlyInterestHistoryRequest(this.surrogate.getCursor(), this.surrogate.getLimit(), this.surrogate.getCreated_at_gte(), this.surrogate.getCreated_at_lte(), null, 16, null);
    }

    public String toString() {
        return "[ListMonthlyInterestHistoryRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListMonthlyInterestHistoryRequestDto) && Intrinsics.areEqual(((ListMonthlyInterestHistoryRequestDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B\u008a\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010 RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.RF\u0010\r\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010,\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010.¨\u00064"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;", "", "", "cursor", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "limit", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at_gte", "created_at_lte", "<init>", "(Ljava/lang/String;ILj$/time/Instant;Lj$/time/Instant;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$moneytree_v1_externalRelease", "(Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCursor", "getCursor$annotations", "()V", "I", "getLimit", "getLimit$annotations", "Lj$/time/Instant;", "getCreated_at_gte", "()Lj$/time/Instant;", "getCreated_at_gte$annotations", "getCreated_at_lte", "getCreated_at_lte$annotations", "Companion", "$serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant created_at_gte;
        private final Instant created_at_lte;
        private final String cursor;
        private final int limit;

        public Surrogate() {
            this((String) null, 0, (Instant) null, (Instant) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.cursor, surrogate.cursor) && this.limit == surrogate.limit && Intrinsics.areEqual(this.created_at_gte, surrogate.created_at_gte) && Intrinsics.areEqual(this.created_at_lte, surrogate.created_at_lte);
        }

        public int hashCode() {
            int iHashCode = ((this.cursor.hashCode() * 31) + Integer.hashCode(this.limit)) * 31;
            Instant instant = this.created_at_gte;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.created_at_lte;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(cursor=" + this.cursor + ", limit=" + this.limit + ", created_at_gte=" + this.created_at_gte + ", created_at_lte=" + this.created_at_lte + ")";
        }

        /* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListMonthlyInterestHistoryRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            this.cursor = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.limit = 0;
            } else {
                this.limit = i2;
            }
            if ((i & 4) == 0) {
                this.created_at_gte = null;
            } else {
                this.created_at_gte = instant;
            }
            if ((i & 8) == 0) {
                this.created_at_lte = null;
            } else {
                this.created_at_lte = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$moneytree_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.cursor, "")) {
                output.encodeStringElement(serialDesc, 0, self.cursor);
            }
            int i = self.limit;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            Instant instant = self.created_at_gte;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.created_at_lte;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String cursor, int i, Instant instant, Instant instant2) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            this.cursor = cursor;
            this.limit = i;
            this.created_at_gte = instant;
            this.created_at_lte = instant2;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public /* synthetic */ Surrogate(String str, int i, Instant instant, Instant instant2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2);
        }

        public final int getLimit() {
            return this.limit;
        }

        public final Instant getCreated_at_gte() {
            return this.created_at_gte;
        }

        public final Instant getCreated_at_lte() {
            return this.created_at_lte;
        }
    }

    /* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ListMonthlyInterestHistoryRequestDto, ListMonthlyInterestHistoryRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListMonthlyInterestHistoryRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListMonthlyInterestHistoryRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListMonthlyInterestHistoryRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ListMonthlyInterestHistoryRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListMonthlyInterestHistoryRequest> getProtoAdapter() {
            return ListMonthlyInterestHistoryRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListMonthlyInterestHistoryRequestDto getZeroValue() {
            return ListMonthlyInterestHistoryRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListMonthlyInterestHistoryRequestDto fromProto(ListMonthlyInterestHistoryRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ListMonthlyInterestHistoryRequestDto(new Surrogate(proto.getCursor(), proto.getLimit(), proto.getCreated_at_gte(), proto.getCreated_at_lte()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: moneytree.v1.ListMonthlyInterestHistoryRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListMonthlyInterestHistoryRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ListMonthlyInterestHistoryRequestDto(null, 0, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "<init>", "()V", "surrogateSerializer", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ListMonthlyInterestHistoryRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/moneytree.v1.ListMonthlyInterestHistoryRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListMonthlyInterestHistoryRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListMonthlyInterestHistoryRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListMonthlyInterestHistoryRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ListMonthlyInterestHistoryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "moneytree.v1.ListMonthlyInterestHistoryRequestDto";
        }
    }
}
