package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponse;
import bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponseDto;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007+*,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;)V", "", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "trade_bar", "buy", "sell_dollars", "sell_units", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;", "getCurrency_pair_id", "getTrade_bar", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "getBuy", "getSell_dollars", "getSell_units", "Companion", "Surrogate", "CurrencyPairAccountSwitcherTypeDto", "CurrencyPairAccountSwitcherAccountDto", "CurrencyPairAccountSwitcherDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetCurrencyPairAccountSwitcherResponseDto implements Dto3<GetCurrencyPairAccountSwitcherResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCurrencyPairAccountSwitcherResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCurrencyPairAccountSwitcherResponseDto, GetCurrencyPairAccountSwitcherResponse>> binaryBase64Serializer$delegate;
    private static final GetCurrencyPairAccountSwitcherResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCurrencyPairAccountSwitcherResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCurrencyPairAccountSwitcherResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public final CurrencyPairAccountSwitcherDto getTrade_bar() {
        return this.surrogate.getTrade_bar();
    }

    public final CurrencyPairAccountSwitcherDto getBuy() {
        return this.surrogate.getBuy();
    }

    public final CurrencyPairAccountSwitcherDto getSell_dollars() {
        return this.surrogate.getSell_dollars();
    }

    public final CurrencyPairAccountSwitcherDto getSell_units() {
        return this.surrogate.getSell_units();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetCurrencyPairAccountSwitcherResponseDto(java.lang.String r2, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r3, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r4, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r5, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponseDto.<init>(java.lang.String, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCurrencyPairAccountSwitcherResponseDto(String currency_pair_id, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto2, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto3, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto4) {
        this(new Surrogate(currency_pair_id, currencyPairAccountSwitcherDto, currencyPairAccountSwitcherDto2, currencyPairAccountSwitcherDto3, currencyPairAccountSwitcherDto4));
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
    }

    @Override // com.robinhood.idl.Dto
    public GetCurrencyPairAccountSwitcherResponse toProto() {
        String currency_pair_id = this.surrogate.getCurrency_pair_id();
        CurrencyPairAccountSwitcherDto trade_bar = this.surrogate.getTrade_bar();
        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher proto = trade_bar != null ? trade_bar.toProto() : null;
        CurrencyPairAccountSwitcherDto buy = this.surrogate.getBuy();
        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher proto2 = buy != null ? buy.toProto() : null;
        CurrencyPairAccountSwitcherDto sell_dollars = this.surrogate.getSell_dollars();
        GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher proto3 = sell_dollars != null ? sell_dollars.toProto() : null;
        CurrencyPairAccountSwitcherDto sell_units = this.surrogate.getSell_units();
        return new GetCurrencyPairAccountSwitcherResponse(currency_pair_id, proto, proto2, proto3, sell_units != null ? sell_units.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetCurrencyPairAccountSwitcherResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCurrencyPairAccountSwitcherResponseDto) && Intrinsics.areEqual(((GetCurrencyPairAccountSwitcherResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010'¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;", "", "", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "trade_bar", "buy", "sell_dollars", "sell_units", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "getTrade_bar", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "getTrade_bar$annotations", "getBuy", "getBuy$annotations", "getSell_dollars", "getSell_dollars$annotations", "getSell_units", "getSell_units$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyPairAccountSwitcherDto buy;
        private final String currency_pair_id;
        private final CurrencyPairAccountSwitcherDto sell_dollars;
        private final CurrencyPairAccountSwitcherDto sell_units;
        private final CurrencyPairAccountSwitcherDto trade_bar;

        public Surrogate() {
            this((String) null, (CurrencyPairAccountSwitcherDto) null, (CurrencyPairAccountSwitcherDto) null, (CurrencyPairAccountSwitcherDto) null, (CurrencyPairAccountSwitcherDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && Intrinsics.areEqual(this.trade_bar, surrogate.trade_bar) && Intrinsics.areEqual(this.buy, surrogate.buy) && Intrinsics.areEqual(this.sell_dollars, surrogate.sell_dollars) && Intrinsics.areEqual(this.sell_units, surrogate.sell_units);
        }

        public int hashCode() {
            int iHashCode = this.currency_pair_id.hashCode() * 31;
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto = this.trade_bar;
            int iHashCode2 = (iHashCode + (currencyPairAccountSwitcherDto == null ? 0 : currencyPairAccountSwitcherDto.hashCode())) * 31;
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto2 = this.buy;
            int iHashCode3 = (iHashCode2 + (currencyPairAccountSwitcherDto2 == null ? 0 : currencyPairAccountSwitcherDto2.hashCode())) * 31;
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto3 = this.sell_dollars;
            int iHashCode4 = (iHashCode3 + (currencyPairAccountSwitcherDto3 == null ? 0 : currencyPairAccountSwitcherDto3.hashCode())) * 31;
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto4 = this.sell_units;
            return iHashCode4 + (currencyPairAccountSwitcherDto4 != null ? currencyPairAccountSwitcherDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", trade_bar=" + this.trade_bar + ", buy=" + this.buy + ", sell_dollars=" + this.sell_dollars + ", sell_units=" + this.sell_units + ")";
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCurrencyPairAccountSwitcherResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto2, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto3, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto4, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_pair_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.trade_bar = null;
            } else {
                this.trade_bar = currencyPairAccountSwitcherDto;
            }
            if ((i & 4) == 0) {
                this.buy = null;
            } else {
                this.buy = currencyPairAccountSwitcherDto2;
            }
            if ((i & 8) == 0) {
                this.sell_dollars = null;
            } else {
                this.sell_dollars = currencyPairAccountSwitcherDto3;
            }
            if ((i & 16) == 0) {
                this.sell_units = null;
            } else {
                this.sell_units = currencyPairAccountSwitcherDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
            }
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto = self.trade_bar;
            if (currencyPairAccountSwitcherDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CurrencyPairAccountSwitcherDto.Serializer.INSTANCE, currencyPairAccountSwitcherDto);
            }
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto2 = self.buy;
            if (currencyPairAccountSwitcherDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CurrencyPairAccountSwitcherDto.Serializer.INSTANCE, currencyPairAccountSwitcherDto2);
            }
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto3 = self.sell_dollars;
            if (currencyPairAccountSwitcherDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CurrencyPairAccountSwitcherDto.Serializer.INSTANCE, currencyPairAccountSwitcherDto3);
            }
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto4 = self.sell_units;
            if (currencyPairAccountSwitcherDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CurrencyPairAccountSwitcherDto.Serializer.INSTANCE, currencyPairAccountSwitcherDto4);
            }
        }

        public Surrogate(String currency_pair_id, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto2, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto3, CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDto4) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            this.currency_pair_id = currency_pair_id;
            this.trade_bar = currencyPairAccountSwitcherDto;
            this.buy = currencyPairAccountSwitcherDto2;
            this.sell_dollars = currencyPairAccountSwitcherDto3;
            this.sell_units = currencyPairAccountSwitcherDto4;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r3, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r4, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r5, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L11
                r4 = r0
            L11:
                r8 = r7 & 8
                if (r8 == 0) goto L16
                r5 = r0
            L16:
                r7 = r7 & 16
                if (r7 == 0) goto L21
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L27
            L21:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L27:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponseDto.Surrogate.<init>(java.lang.String, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final CurrencyPairAccountSwitcherDto getTrade_bar() {
            return this.trade_bar;
        }

        public final CurrencyPairAccountSwitcherDto getBuy() {
            return this.buy;
        }

        public final CurrencyPairAccountSwitcherDto getSell_dollars() {
            return this.sell_dollars;
        }

        public final CurrencyPairAccountSwitcherDto getSell_units() {
            return this.sell_units;
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCurrencyPairAccountSwitcherResponseDto, GetCurrencyPairAccountSwitcherResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCurrencyPairAccountSwitcherResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCurrencyPairAccountSwitcherResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCurrencyPairAccountSwitcherResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCurrencyPairAccountSwitcherResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCurrencyPairAccountSwitcherResponse> getProtoAdapter() {
            return GetCurrencyPairAccountSwitcherResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCurrencyPairAccountSwitcherResponseDto getZeroValue() {
            return GetCurrencyPairAccountSwitcherResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCurrencyPairAccountSwitcherResponseDto fromProto(GetCurrencyPairAccountSwitcherResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String currency_pair_id = proto.getCurrency_pair_id();
            GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher trade_bar = proto.getTrade_bar();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDtoFromProto = trade_bar != null ? CurrencyPairAccountSwitcherDto.INSTANCE.fromProto(trade_bar) : null;
            GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher buy = proto.getBuy();
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDtoFromProto2 = buy != null ? CurrencyPairAccountSwitcherDto.INSTANCE.fromProto(buy) : null;
            GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher sell_dollars = proto.getSell_dollars();
            CurrencyPairAccountSwitcherDto currencyPairAccountSwitcherDtoFromProto3 = sell_dollars != null ? CurrencyPairAccountSwitcherDto.INSTANCE.fromProto(sell_dollars) : null;
            GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher sell_units = proto.getSell_units();
            return new GetCurrencyPairAccountSwitcherResponseDto(new Surrogate(currency_pair_id, currencyPairAccountSwitcherDtoFromProto, currencyPairAccountSwitcherDtoFromProto2, currencyPairAccountSwitcherDtoFromProto3, sell_units != null ? CurrencyPairAccountSwitcherDto.INSTANCE.fromProto(sell_units) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCurrencyPairAccountSwitcherResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCurrencyPairAccountSwitcherResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS", "CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyPairAccountSwitcherTypeDto implements Dto2<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyPairAccountSwitcherTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurrencyPairAccountSwitcherTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairAccountSwitcherTypeDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType>> binaryBase64Serializer$delegate;
        public static final CurrencyPairAccountSwitcherTypeDto CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED = new CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", 0);
        public static final CurrencyPairAccountSwitcherTypeDto CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR = new CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR", 1);
        public static final CurrencyPairAccountSwitcherTypeDto CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY = new CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY", 2);
        public static final CurrencyPairAccountSwitcherTypeDto CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS = new CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS", 3);
        public static final CurrencyPairAccountSwitcherTypeDto CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS = new CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS("CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS", 4);

        private static final /* synthetic */ CurrencyPairAccountSwitcherTypeDto[] $values() {
            return new CurrencyPairAccountSwitcherTypeDto[]{CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS, CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS};
        }

        public /* synthetic */ CurrencyPairAccountSwitcherTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurrencyPairAccountSwitcherTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyPairAccountSwitcherTypeDto(String str, int i) {
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED extends CurrencyPairAccountSwitcherTypeDto {
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType toProto() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
            }
        }

        static {
            CurrencyPairAccountSwitcherTypeDto[] currencyPairAccountSwitcherTypeDtoArr$values = $values();
            $VALUES = currencyPairAccountSwitcherTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyPairAccountSwitcherTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR extends CurrencyPairAccountSwitcherTypeDto {
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType toProto() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR;
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY extends CurrencyPairAccountSwitcherTypeDto {
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType toProto() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY;
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS extends CurrencyPairAccountSwitcherTypeDto {
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType toProto() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS;
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS extends CurrencyPairAccountSwitcherTypeDto {
            CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType toProto() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurrencyPairAccountSwitcherTypeDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType> {

            /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.values().length];
                    try {
                        iArr[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyPairAccountSwitcherTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyPairAccountSwitcherTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType> getProtoAdapter() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherTypeDto getZeroValue() {
                return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherTypeDto fromProto(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_TRADE_BAR;
                }
                if (i == 3) {
                    return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_BUY;
                }
                if (i == 4) {
                    return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_DOLLARS;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurrencyPairAccountSwitcherTypeDto.CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_SELL_UNITS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyPairAccountSwitcherTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurrencyPairAccountSwitcherTypeDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType", CurrencyPairAccountSwitcherTypeDto.getEntries(), CurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyPairAccountSwitcherTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurrencyPairAccountSwitcherTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyPairAccountSwitcherTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurrencyPairAccountSwitcherTypeDto valueOf(String str) {
            return (CurrencyPairAccountSwitcherTypeDto) Enum.valueOf(CurrencyPairAccountSwitcherTypeDto.class, str);
        }

        public static CurrencyPairAccountSwitcherTypeDto[] values() {
            return (CurrencyPairAccountSwitcherTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u00106R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;)V", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;", "getRhf_account_number", "getRhs_account_number", "getCrypto_account_id", "getEntry_title", "getTitle", "getSubtitle", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "()Z", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyPairAccountSwitcherAccountDto implements Dto3<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CurrencyPairAccountSwitcherAccountDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairAccountSwitcherAccountDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount>> binaryBase64Serializer$delegate;
        private static final CurrencyPairAccountSwitcherAccountDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CurrencyPairAccountSwitcherAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyPairAccountSwitcherAccountDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getRhf_account_number() {
            return this.surrogate.getRhf_account_number();
        }

        public final String getRhs_account_number() {
            return this.surrogate.getRhs_account_number();
        }

        public final String getCrypto_account_id() {
            return this.surrogate.getCrypto_account_id();
        }

        public final String getEntry_title() {
            return this.surrogate.getEntry_title();
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final String getSubtitle() {
            return this.surrogate.getSubtitle();
        }

        public final IconDto getIcon() {
            return this.surrogate.getIcon();
        }

        public final boolean is_selectable() {
            return this.surrogate.getIs_selectable();
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.surrogate.getBrokerage_account_type();
        }

        public final ManagementTypeDto getManagement_type() {
            return this.surrogate.getManagement_type();
        }

        public final Instant getCreated_at() {
            return this.surrogate.getCreated_at();
        }

        public /* synthetic */ CurrencyPairAccountSwitcherAccountDto(String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 512) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 1024) != 0 ? null : instant);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CurrencyPairAccountSwitcherAccountDto(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, IconDto icon, boolean z, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, Instant instant) {
            this(new Surrogate(rhf_account_number, rhs_account_number, str, entry_title, title, subtitle, icon, z, brokerage_account_type, management_type, instant));
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount toProto() {
            return new GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount(this.surrogate.getRhf_account_number(), this.surrogate.getRhs_account_number(), this.surrogate.getCrypto_account_id(), this.surrogate.getEntry_title(), this.surrogate.getTitle(), this.surrogate.getSubtitle(), (Icon) this.surrogate.getIcon().toProto(), this.surrogate.getIs_selectable(), (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getCreated_at(), null, 2048, null);
        }

        public String toString() {
            return "[CurrencyPairAccountSwitcherAccountDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CurrencyPairAccountSwitcherAccountDto) && Intrinsics.areEqual(((CurrencyPairAccountSwitcherAccountDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0087\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010(R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010(R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b?\u00101\u001a\u0004\b=\u0010>R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bB\u00101\u001a\u0004\b\f\u0010AR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010ER \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bJ\u00101\u001a\u0004\bH\u0010IRF\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010K\u0012\u0004\bN\u00101\u001a\u0004\bL\u0010M¨\u0006Q"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;", "", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhf_account_number", "getRhf_account_number$annotations", "()V", "getRhs_account_number", "getRhs_account_number$annotations", "getCrypto_account_id", "getCrypto_account_id$annotations", "getEntry_title", "getEntry_title$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Z", "()Z", "is_selectable$annotations", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BrokerageAccountTypeDto brokerage_account_type;
            private final Instant created_at;
            private final String crypto_account_id;
            private final String entry_title;
            private final IconDto icon;
            private final boolean is_selectable;
            private final ManagementTypeDto management_type;
            private final String rhf_account_number;
            private final String rhs_account_number;
            private final String subtitle;
            private final String title;

            public Surrogate() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (IconDto) null, false, (BrokerageAccountTypeDto) null, (ManagementTypeDto) null, (Instant) null, 2047, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.rhf_account_number, surrogate.rhf_account_number) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.crypto_account_id, surrogate.crypto_account_id) && Intrinsics.areEqual(this.entry_title, surrogate.entry_title) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && this.icon == surrogate.icon && this.is_selectable == surrogate.is_selectable && this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.created_at, surrogate.created_at);
            }

            public int hashCode() {
                int iHashCode = ((this.rhf_account_number.hashCode() * 31) + this.rhs_account_number.hashCode()) * 31;
                String str = this.crypto_account_id;
                int iHashCode2 = (((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entry_title.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.is_selectable)) * 31) + this.brokerage_account_type.hashCode()) * 31) + this.management_type.hashCode()) * 31;
                Instant instant = this.created_at;
                return iHashCode2 + (instant != null ? instant.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(rhf_account_number=" + this.rhf_account_number + ", rhs_account_number=" + this.rhs_account_number + ", crypto_account_id=" + this.crypto_account_id + ", entry_title=" + this.entry_title + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", is_selectable=" + this.is_selectable + ", brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", created_at=" + this.created_at + ")";
            }

            /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetCurrencyPairAccountSwitcherResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.rhf_account_number = "";
                } else {
                    this.rhf_account_number = str;
                }
                if ((i & 2) == 0) {
                    this.rhs_account_number = "";
                } else {
                    this.rhs_account_number = str2;
                }
                if ((i & 4) == 0) {
                    this.crypto_account_id = null;
                } else {
                    this.crypto_account_id = str3;
                }
                if ((i & 8) == 0) {
                    this.entry_title = "";
                } else {
                    this.entry_title = str4;
                }
                if ((i & 16) == 0) {
                    this.title = "";
                } else {
                    this.title = str5;
                }
                if ((i & 32) == 0) {
                    this.subtitle = "";
                } else {
                    this.subtitle = str6;
                }
                if ((i & 64) == 0) {
                    this.icon = IconDto.INSTANCE.getZeroValue();
                } else {
                    this.icon = iconDto;
                }
                if ((i & 128) == 0) {
                    this.is_selectable = false;
                } else {
                    this.is_selectable = z;
                }
                if ((i & 256) == 0) {
                    this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.brokerage_account_type = brokerageAccountTypeDto;
                }
                if ((i & 512) == 0) {
                    this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.management_type = managementTypeDto;
                }
                if ((i & 1024) == 0) {
                    this.created_at = null;
                } else {
                    this.created_at = instant;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.rhf_account_number, "")) {
                    output.encodeStringElement(serialDesc, 0, self.rhf_account_number);
                }
                if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                    output.encodeStringElement(serialDesc, 1, self.rhs_account_number);
                }
                String str = self.crypto_account_id;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                }
                if (!Intrinsics.areEqual(self.entry_title, "")) {
                    output.encodeStringElement(serialDesc, 3, self.entry_title);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 4, self.title);
                }
                if (!Intrinsics.areEqual(self.subtitle, "")) {
                    output.encodeStringElement(serialDesc, 5, self.subtitle);
                }
                if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 6, IconDto.Serializer.INSTANCE, self.icon);
                }
                boolean z = self.is_selectable;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 7, z);
                }
                if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 8, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
                }
                if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 9, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
                }
                Instant instant = self.created_at;
                if (instant != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
                }
            }

            public Surrogate(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, IconDto icon, boolean z, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, Instant instant) {
                Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
                Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
                Intrinsics.checkNotNullParameter(entry_title, "entry_title");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
                Intrinsics.checkNotNullParameter(management_type, "management_type");
                this.rhf_account_number = rhf_account_number;
                this.rhs_account_number = rhs_account_number;
                this.crypto_account_id = str;
                this.entry_title = entry_title;
                this.title = title;
                this.subtitle = subtitle;
                this.icon = icon;
                this.is_selectable = z;
                this.brokerage_account_type = brokerage_account_type;
                this.management_type = management_type;
                this.created_at = instant;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 512) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 1024) != 0 ? null : instant);
            }

            public final String getRhf_account_number() {
                return this.rhf_account_number;
            }

            public final String getRhs_account_number() {
                return this.rhs_account_number;
            }

            public final String getCrypto_account_id() {
                return this.crypto_account_id;
            }

            public final String getEntry_title() {
                return this.entry_title;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final IconDto getIcon() {
                return this.icon;
            }

            /* renamed from: is_selectable, reason: from getter */
            public final boolean getIs_selectable() {
                return this.is_selectable;
            }

            public final BrokerageAccountTypeDto getBrokerage_account_type() {
                return this.brokerage_account_type;
            }

            public final ManagementTypeDto getManagement_type() {
                return this.management_type;
            }

            public final Instant getCreated_at() {
                return this.created_at;
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcherAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CurrencyPairAccountSwitcherAccountDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyPairAccountSwitcherAccountDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherAccountDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherAccountDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyPairAccountSwitcherAccountDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount> getProtoAdapter() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherAccountDto getZeroValue() {
                return CurrencyPairAccountSwitcherAccountDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherAccountDto fromProto(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CurrencyPairAccountSwitcherAccountDto(new Surrogate(proto.getRhf_account_number(), proto.getRhs_account_number(), proto.getCrypto_account_id(), proto.getEntry_title(), proto.getTitle(), proto.getSubtitle(), IconDto.INSTANCE.fromProto(proto.getIcon()), proto.getIs_selectable(), BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type()), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getCreated_at()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherAccountDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CurrencyPairAccountSwitcherAccountDto(null, null, null, null, null, null, null, false, null, null, null, 2047, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyPairAccountSwitcherAccountDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyPairAccountSwitcherAccountDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyPairAccountSwitcherAccountDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CurrencyPairAccountSwitcherAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto";
            }
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;)V", "", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "type", "title", "", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "accounts", "positive_button_text", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;", "getTitle", "getAccounts", "()Ljava/util/List;", "getPositive_button_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyPairAccountSwitcherDto implements Dto3<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CurrencyPairAccountSwitcherDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairAccountSwitcherDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher>> binaryBase64Serializer$delegate;
        private static final CurrencyPairAccountSwitcherDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CurrencyPairAccountSwitcherDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyPairAccountSwitcherDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final List<CurrencyPairAccountSwitcherAccountDto> getAccounts() {
            return this.surrogate.getAccounts();
        }

        public final String getPositive_button_text() {
            return this.surrogate.getPositive_button_text();
        }

        public /* synthetic */ CurrencyPairAccountSwitcherDto(String str, CurrencyPairAccountSwitcherTypeDto currencyPairAccountSwitcherTypeDto, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue() : currencyPairAccountSwitcherTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CurrencyPairAccountSwitcherDto(String currency_pair_id, CurrencyPairAccountSwitcherTypeDto type2, String title, List<CurrencyPairAccountSwitcherAccountDto> accounts2, String positive_button_text) {
            this(new Surrogate(currency_pair_id, type2, title, accounts2, positive_button_text));
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher toProto() {
            String currency_pair_id = this.surrogate.getCurrency_pair_id();
            GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType currencyPairAccountSwitcherType = (GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherType) this.surrogate.getType().toProto();
            String title = this.surrogate.getTitle();
            List<CurrencyPairAccountSwitcherAccountDto> accounts2 = this.surrogate.getAccounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
            Iterator<T> it = accounts2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CurrencyPairAccountSwitcherAccountDto) it.next()).toProto());
            }
            return new GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher(currency_pair_id, currencyPairAccountSwitcherType, title, arrayList, this.surrogate.getPositive_button_text(), null, 32, null);
        }

        public String toString() {
            return "[CurrencyPairAccountSwitcherDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CurrencyPairAccountSwitcherDto) && Intrinsics.areEqual(((CurrencyPairAccountSwitcherDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000243B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010\u001c¨\u00065"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;", "", "", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "type", "title", "", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherAccountDto;", "accounts", "positive_button_text", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherTypeDto;", "getType$annotations", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "getAccounts$annotations", "getPositive_button_text", "getPositive_button_text$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<CurrencyPairAccountSwitcherAccountDto> accounts;
            private final String currency_pair_id;
            private final String positive_button_text;
            private final String title;
            private final CurrencyPairAccountSwitcherTypeDto type;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null};

            public Surrogate() {
                this((String) null, (CurrencyPairAccountSwitcherTypeDto) null, (String) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(CurrencyPairAccountSwitcherAccountDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.type == surrogate.type && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.accounts, surrogate.accounts) && Intrinsics.areEqual(this.positive_button_text, surrogate.positive_button_text);
            }

            public int hashCode() {
                return (((((((this.currency_pair_id.hashCode() * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.positive_button_text.hashCode();
            }

            public String toString() {
                return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", type=" + this.type + ", title=" + this.title + ", accounts=" + this.accounts + ", positive_button_text=" + this.positive_button_text + ")";
            }

            /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetCurrencyPairAccountSwitcherResponseDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, CurrencyPairAccountSwitcherTypeDto currencyPairAccountSwitcherTypeDto, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.currency_pair_id = "";
                } else {
                    this.currency_pair_id = str;
                }
                if ((i & 2) == 0) {
                    this.type = CurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.type = currencyPairAccountSwitcherTypeDto;
                }
                if ((i & 4) == 0) {
                    this.title = "";
                } else {
                    this.title = str2;
                }
                if ((i & 8) == 0) {
                    this.accounts = CollectionsKt.emptyList();
                } else {
                    this.accounts = list;
                }
                if ((i & 16) == 0) {
                    this.positive_button_text = "";
                } else {
                    this.positive_button_text = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
                }
                if (self.type != CurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, CurrencyPairAccountSwitcherTypeDto.Serializer.INSTANCE, self.type);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 2, self.title);
                }
                if (!Intrinsics.areEqual(self.accounts, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.accounts);
                }
                if (Intrinsics.areEqual(self.positive_button_text, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 4, self.positive_button_text);
            }

            public Surrogate(String currency_pair_id, CurrencyPairAccountSwitcherTypeDto type2, String title, List<CurrencyPairAccountSwitcherAccountDto> accounts2, String positive_button_text) {
                Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
                this.currency_pair_id = currency_pair_id;
                this.type = type2;
                this.title = title;
                this.accounts = accounts2;
                this.positive_button_text = positive_button_text;
            }

            public /* synthetic */ Surrogate(String str, CurrencyPairAccountSwitcherTypeDto currencyPairAccountSwitcherTypeDto, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue() : currencyPairAccountSwitcherTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str3);
            }

            public final String getCurrency_pair_id() {
                return this.currency_pair_id;
            }

            public final CurrencyPairAccountSwitcherTypeDto getType() {
                return this.type;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<CurrencyPairAccountSwitcherAccountDto> getAccounts() {
                return this.accounts;
            }

            public final String getPositive_button_text() {
                return this.positive_button_text;
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponse$CurrencyPairAccountSwitcher;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CurrencyPairAccountSwitcherDto, GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyPairAccountSwitcherDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairAccountSwitcherDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyPairAccountSwitcherDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher> getProtoAdapter() {
                return GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherDto getZeroValue() {
                return CurrencyPairAccountSwitcherDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairAccountSwitcherDto fromProto(GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String currency_pair_id = proto.getCurrency_pair_id();
                CurrencyPairAccountSwitcherTypeDto currencyPairAccountSwitcherTypeDtoFromProto = CurrencyPairAccountSwitcherTypeDto.INSTANCE.fromProto(proto.getType());
                String title = proto.getTitle();
                List<GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount> accounts2 = proto.getAccounts();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
                Iterator<T> it = accounts2.iterator();
                while (it.hasNext()) {
                    arrayList.add(CurrencyPairAccountSwitcherAccountDto.INSTANCE.fromProto((GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcherAccount) it.next()));
                }
                return new CurrencyPairAccountSwitcherDto(new Surrogate(currency_pair_id, currencyPairAccountSwitcherTypeDtoFromProto, title, arrayList, proto.getPositive_button_text()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCurrencyPairAccountSwitcherResponseDto.CurrencyPairAccountSwitcherDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new CurrencyPairAccountSwitcherDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyPairAccountSwitcherDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse.CurrencyPairAccountSwitcher", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyPairAccountSwitcherDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyPairAccountSwitcherDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CurrencyPairAccountSwitcherDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto$CurrencyPairAccountSwitcherDto";
            }
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCurrencyPairAccountSwitcherResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCurrencyPairAccountSwitcherResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCurrencyPairAccountSwitcherResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCurrencyPairAccountSwitcherResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetCurrencyPairAccountSwitcherResponseDto";
        }
    }
}
