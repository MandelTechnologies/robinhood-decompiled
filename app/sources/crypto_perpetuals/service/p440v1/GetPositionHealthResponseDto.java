package crypto_perpetuals.service.p440v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
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

/* compiled from: GetPositionHealthResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponse;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;)V", "Lcrypto_perpetuals/common/v1/MoneyDto;", "unsettled_open_pnl", "settled_open_pnl", "open_pnl", "unsettled_closed_pnl", "settled_closed_pnl", "closed_pnl", "lifetime_pnl", "", "account_id", "(Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;)V", "toProto", "()Lcrypto_perpetuals/service/v1/GetPositionHealthResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class GetPositionHealthResponseDto implements Dto3<GetPositionHealthResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetPositionHealthResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetPositionHealthResponseDto, GetPositionHealthResponse>> binaryBase64Serializer$delegate;
    private static final GetPositionHealthResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetPositionHealthResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetPositionHealthResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetPositionHealthResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : moneyDto4, (i & 16) != 0 ? null : moneyDto5, (i & 32) != 0 ? null : moneyDto6, (i & 64) != 0 ? null : moneyDto7, (i & 128) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPositionHealthResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, String account_id) {
        this(new Surrogate(moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, moneyDto6, moneyDto7, account_id));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
    }

    @Override // com.robinhood.idl.Dto
    public GetPositionHealthResponse toProto() {
        MoneyDto unsettled_open_pnl = this.surrogate.getUnsettled_open_pnl();
        Money proto = unsettled_open_pnl != null ? unsettled_open_pnl.toProto() : null;
        MoneyDto settled_open_pnl = this.surrogate.getSettled_open_pnl();
        Money proto2 = settled_open_pnl != null ? settled_open_pnl.toProto() : null;
        MoneyDto open_pnl = this.surrogate.getOpen_pnl();
        Money proto3 = open_pnl != null ? open_pnl.toProto() : null;
        MoneyDto unsettled_closed_pnl = this.surrogate.getUnsettled_closed_pnl();
        Money proto4 = unsettled_closed_pnl != null ? unsettled_closed_pnl.toProto() : null;
        MoneyDto settled_closed_pnl = this.surrogate.getSettled_closed_pnl();
        Money proto5 = settled_closed_pnl != null ? settled_closed_pnl.toProto() : null;
        MoneyDto closed_pnl = this.surrogate.getClosed_pnl();
        Money proto6 = closed_pnl != null ? closed_pnl.toProto() : null;
        MoneyDto lifetime_pnl = this.surrogate.getLifetime_pnl();
        return new GetPositionHealthResponse(proto, proto2, proto3, proto4, proto5, proto6, lifetime_pnl != null ? lifetime_pnl.toProto() : null, this.surrogate.getAccount_id(), null, 256, null);
    }

    public String toString() {
        return "[GetPositionHealthResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetPositionHealthResponseDto) && Intrinsics.areEqual(((GetPositionHealthResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetPositionHealthResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010&R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b7\u0010(\u001a\u0004\b6\u0010\u001d¨\u0006:"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;", "", "Lcrypto_perpetuals/common/v1/MoneyDto;", "unsettled_open_pnl", "settled_open_pnl", "open_pnl", "unsettled_closed_pnl", "settled_closed_pnl", "closed_pnl", "lifetime_pnl", "", "account_id", "<init>", "(Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_service_v1_externalRelease", "(Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getUnsettled_open_pnl", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getUnsettled_open_pnl$annotations", "()V", "getSettled_open_pnl", "getSettled_open_pnl$annotations", "getOpen_pnl", "getOpen_pnl$annotations", "getUnsettled_closed_pnl", "getUnsettled_closed_pnl$annotations", "getSettled_closed_pnl", "getSettled_closed_pnl$annotations", "getClosed_pnl", "getClosed_pnl$annotations", "getLifetime_pnl", "getLifetime_pnl$annotations", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "Companion", "$serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final MoneyDto closed_pnl;
        private final MoneyDto lifetime_pnl;
        private final MoneyDto open_pnl;
        private final MoneyDto settled_closed_pnl;
        private final MoneyDto settled_open_pnl;
        private final MoneyDto unsettled_closed_pnl;
        private final MoneyDto unsettled_open_pnl;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.unsettled_open_pnl, surrogate.unsettled_open_pnl) && Intrinsics.areEqual(this.settled_open_pnl, surrogate.settled_open_pnl) && Intrinsics.areEqual(this.open_pnl, surrogate.open_pnl) && Intrinsics.areEqual(this.unsettled_closed_pnl, surrogate.unsettled_closed_pnl) && Intrinsics.areEqual(this.settled_closed_pnl, surrogate.settled_closed_pnl) && Intrinsics.areEqual(this.closed_pnl, surrogate.closed_pnl) && Intrinsics.areEqual(this.lifetime_pnl, surrogate.lifetime_pnl) && Intrinsics.areEqual(this.account_id, surrogate.account_id);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.unsettled_open_pnl;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.settled_open_pnl;
            int iHashCode2 = (iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.open_pnl;
            int iHashCode3 = (iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.unsettled_closed_pnl;
            int iHashCode4 = (iHashCode3 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.settled_closed_pnl;
            int iHashCode5 = (iHashCode4 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.closed_pnl;
            int iHashCode6 = (iHashCode5 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31;
            MoneyDto moneyDto7 = this.lifetime_pnl;
            return ((iHashCode6 + (moneyDto7 != null ? moneyDto7.hashCode() : 0)) * 31) + this.account_id.hashCode();
        }

        public String toString() {
            return "Surrogate(unsettled_open_pnl=" + this.unsettled_open_pnl + ", settled_open_pnl=" + this.settled_open_pnl + ", open_pnl=" + this.open_pnl + ", unsettled_closed_pnl=" + this.unsettled_closed_pnl + ", settled_closed_pnl=" + this.settled_closed_pnl + ", closed_pnl=" + this.closed_pnl + ", lifetime_pnl=" + this.lifetime_pnl + ", account_id=" + this.account_id + ")";
        }

        /* compiled from: GetPositionHealthResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetPositionHealthResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.unsettled_open_pnl = null;
            } else {
                this.unsettled_open_pnl = moneyDto;
            }
            if ((i & 2) == 0) {
                this.settled_open_pnl = null;
            } else {
                this.settled_open_pnl = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.open_pnl = null;
            } else {
                this.open_pnl = moneyDto3;
            }
            if ((i & 8) == 0) {
                this.unsettled_closed_pnl = null;
            } else {
                this.unsettled_closed_pnl = moneyDto4;
            }
            if ((i & 16) == 0) {
                this.settled_closed_pnl = null;
            } else {
                this.settled_closed_pnl = moneyDto5;
            }
            if ((i & 32) == 0) {
                this.closed_pnl = null;
            } else {
                this.closed_pnl = moneyDto6;
            }
            if ((i & 64) == 0) {
                this.lifetime_pnl = null;
            } else {
                this.lifetime_pnl = moneyDto7;
            }
            if ((i & 128) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.unsettled_open_pnl;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.settled_open_pnl;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.open_pnl;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.unsettled_closed_pnl;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.settled_closed_pnl;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.closed_pnl;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
            MoneyDto moneyDto7 = self.lifetime_pnl;
            if (moneyDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto7);
            }
            if (Intrinsics.areEqual(self.account_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.account_id);
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, String account_id) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            this.unsettled_open_pnl = moneyDto;
            this.settled_open_pnl = moneyDto2;
            this.open_pnl = moneyDto3;
            this.unsettled_closed_pnl = moneyDto4;
            this.settled_closed_pnl = moneyDto5;
            this.closed_pnl = moneyDto6;
            this.lifetime_pnl = moneyDto7;
            this.account_id = account_id;
        }

        public final MoneyDto getUnsettled_open_pnl() {
            return this.unsettled_open_pnl;
        }

        public final MoneyDto getSettled_open_pnl() {
            return this.settled_open_pnl;
        }

        public final MoneyDto getOpen_pnl() {
            return this.open_pnl;
        }

        public final MoneyDto getUnsettled_closed_pnl() {
            return this.unsettled_closed_pnl;
        }

        public final MoneyDto getSettled_closed_pnl() {
            return this.settled_closed_pnl;
        }

        public final MoneyDto getClosed_pnl() {
            return this.closed_pnl;
        }

        public final MoneyDto getLifetime_pnl() {
            return this.lifetime_pnl;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : moneyDto4, (i & 16) != 0 ? null : moneyDto5, (i & 32) != 0 ? null : moneyDto6, (i & 64) != 0 ? null : moneyDto7, (i & 128) != 0 ? "" : str);
        }
    }

    /* compiled from: GetPositionHealthResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetPositionHealthResponseDto, GetPositionHealthResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetPositionHealthResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPositionHealthResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPositionHealthResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetPositionHealthResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetPositionHealthResponse> getProtoAdapter() {
            return GetPositionHealthResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPositionHealthResponseDto getZeroValue() {
            return GetPositionHealthResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPositionHealthResponseDto fromProto(GetPositionHealthResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money unsettled_open_pnl = proto.getUnsettled_open_pnl();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = unsettled_open_pnl != null ? MoneyDto.INSTANCE.fromProto(unsettled_open_pnl) : null;
            Money settled_open_pnl = proto.getSettled_open_pnl();
            MoneyDto moneyDtoFromProto2 = settled_open_pnl != null ? MoneyDto.INSTANCE.fromProto(settled_open_pnl) : null;
            Money open_pnl = proto.getOpen_pnl();
            MoneyDto moneyDtoFromProto3 = open_pnl != null ? MoneyDto.INSTANCE.fromProto(open_pnl) : null;
            Money unsettled_closed_pnl = proto.getUnsettled_closed_pnl();
            MoneyDto moneyDtoFromProto4 = unsettled_closed_pnl != null ? MoneyDto.INSTANCE.fromProto(unsettled_closed_pnl) : null;
            Money settled_closed_pnl = proto.getSettled_closed_pnl();
            MoneyDto moneyDtoFromProto5 = settled_closed_pnl != null ? MoneyDto.INSTANCE.fromProto(settled_closed_pnl) : null;
            Money closed_pnl = proto.getClosed_pnl();
            MoneyDto moneyDtoFromProto6 = closed_pnl != null ? MoneyDto.INSTANCE.fromProto(closed_pnl) : null;
            Money lifetime_pnl = proto.getLifetime_pnl();
            return new GetPositionHealthResponseDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, moneyDtoFromProto5, moneyDtoFromProto6, lifetime_pnl != null ? MoneyDto.INSTANCE.fromProto(lifetime_pnl) : null, proto.getAccount_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.service.v1.GetPositionHealthResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPositionHealthResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetPositionHealthResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetPositionHealthResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<GetPositionHealthResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.service.v1.GetPositionHealthResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetPositionHealthResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetPositionHealthResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetPositionHealthResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetPositionHealthResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "crypto_perpetuals.service.v1.GetPositionHealthResponseDto";
        }
    }
}
