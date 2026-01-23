package microgram.contracts.mcw_cash_balances.proto.p497v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import microgram.contracts.mcw_cash_balances.proto.p497v1.CtaDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.DisplayCurrencyDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesHomeSectionResponseDto;

/* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b*\u0010'¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;)V", "", "account_number", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "title", "", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/DisplayCurrencyDto;", "display_currency_balances", Footer.f10637type, "(Ljava/lang/String;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Ljava/util/List;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;)V", "toProto", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;", "getAccount_number", "getTitle", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getDisplay_currency_balances", "()Ljava/util/List;", "getFooter", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class GetCashBalancesHomeSectionResponseDto implements Dto3<GetCashBalancesHomeSectionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCashBalancesHomeSectionResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCashBalancesHomeSectionResponseDto, GetCashBalancesHomeSectionResponse>> binaryBase64Serializer$delegate;
    private static final GetCashBalancesHomeSectionResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCashBalancesHomeSectionResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCashBalancesHomeSectionResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final CtaDto getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<DisplayCurrencyDto> getDisplay_currency_balances() {
        return this.surrogate.getDisplay_currency_balances();
    }

    public final CtaDto getFooter() {
        return this.surrogate.getFooter();
    }

    public /* synthetic */ GetCashBalancesHomeSectionResponseDto(String str, CtaDto ctaDto, List list, CtaDto ctaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : ctaDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : ctaDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCashBalancesHomeSectionResponseDto(String account_number, CtaDto ctaDto, List<DisplayCurrencyDto> display_currency_balances, CtaDto ctaDto2) {
        this(new Surrogate(account_number, ctaDto, display_currency_balances, ctaDto2));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(display_currency_balances, "display_currency_balances");
    }

    @Override // com.robinhood.idl.Dto
    public GetCashBalancesHomeSectionResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        CtaDto title = this.surrogate.getTitle();
        Cta proto = title != null ? title.toProto() : null;
        List<DisplayCurrencyDto> display_currency_balances = this.surrogate.getDisplay_currency_balances();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_currency_balances, 10));
        Iterator<T> it = display_currency_balances.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisplayCurrencyDto) it.next()).toProto());
        }
        CtaDto footer = this.surrogate.getFooter();
        return new GetCashBalancesHomeSectionResponse(account_number, proto, arrayList, footer != null ? footer.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetCashBalancesHomeSectionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCashBalancesHomeSectionResponseDto) && Intrinsics.areEqual(((GetCashBalancesHomeSectionResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010(¨\u00062"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;", "", "", "account_number", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "title", "", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/DisplayCurrencyDto;", "display_currency_balances", Footer.f10637type, "<init>", "(Ljava/lang/String;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Ljava/util/List;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Ljava/util/List;Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_mcw_cash_balances_proto_v1_externalRelease", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getTitle", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/CtaDto;", "getTitle$annotations", "Ljava/util/List;", "getDisplay_currency_balances", "()Ljava/util/List;", "getDisplay_currency_balances$annotations", "getFooter", "getFooter$annotations", "Companion", "$serializer", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final List<DisplayCurrencyDto> display_currency_balances;
        private final CtaDto footer;
        private final CtaDto title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesHomeSectionResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCashBalancesHomeSectionResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (CtaDto) null, (List) null, (CtaDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(DisplayCurrencyDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.display_currency_balances, surrogate.display_currency_balances) && Intrinsics.areEqual(this.footer, surrogate.footer);
        }

        public int hashCode() {
            int iHashCode = this.account_number.hashCode() * 31;
            CtaDto ctaDto = this.title;
            int iHashCode2 = (((iHashCode + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31) + this.display_currency_balances.hashCode()) * 31;
            CtaDto ctaDto2 = this.footer;
            return iHashCode2 + (ctaDto2 != null ? ctaDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", title=" + this.title + ", display_currency_balances=" + this.display_currency_balances + ", footer=" + this.footer + ")";
        }

        /* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCashBalancesHomeSectionResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CtaDto ctaDto, List list, CtaDto ctaDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.title = null;
            } else {
                this.title = ctaDto;
            }
            if ((i & 4) == 0) {
                this.display_currency_balances = CollectionsKt.emptyList();
            } else {
                this.display_currency_balances = list;
            }
            if ((i & 8) == 0) {
                this.footer = null;
            } else {
                this.footer = ctaDto2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_mcw_cash_balances_proto_v1_externalRelease */
        public static final /* synthetic */ void m3777xb0f71e1e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            CtaDto ctaDto = self.title;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            if (!Intrinsics.areEqual(self.display_currency_balances, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.display_currency_balances);
            }
            CtaDto ctaDto2 = self.footer;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
        }

        public Surrogate(String account_number, CtaDto ctaDto, List<DisplayCurrencyDto> display_currency_balances, CtaDto ctaDto2) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(display_currency_balances, "display_currency_balances");
            this.account_number = account_number;
            this.title = ctaDto;
            this.display_currency_balances = display_currency_balances;
            this.footer = ctaDto2;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, CtaDto ctaDto, List list, CtaDto ctaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : ctaDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : ctaDto2);
        }

        public final CtaDto getTitle() {
            return this.title;
        }

        public final List<DisplayCurrencyDto> getDisplay_currency_balances() {
            return this.display_currency_balances;
        }

        public final CtaDto getFooter() {
            return this.footer;
        }
    }

    /* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCashBalancesHomeSectionResponseDto, GetCashBalancesHomeSectionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCashBalancesHomeSectionResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashBalancesHomeSectionResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashBalancesHomeSectionResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCashBalancesHomeSectionResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCashBalancesHomeSectionResponse> getProtoAdapter() {
            return GetCashBalancesHomeSectionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashBalancesHomeSectionResponseDto getZeroValue() {
            return GetCashBalancesHomeSectionResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashBalancesHomeSectionResponseDto fromProto(GetCashBalancesHomeSectionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            Cta title = proto.getTitle();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = title != null ? CtaDto.INSTANCE.fromProto(title) : null;
            List<DisplayCurrency> display_currency_balances = proto.getDisplay_currency_balances();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_currency_balances, 10));
            Iterator<T> it = display_currency_balances.iterator();
            while (it.hasNext()) {
                arrayList.add(DisplayCurrencyDto.INSTANCE.fromProto((DisplayCurrency) it.next()));
            }
            Cta footer = proto.getFooter();
            return new GetCashBalancesHomeSectionResponseDto(new Surrogate(account_number, ctaDtoFromProto, arrayList, footer != null ? CtaDto.INSTANCE.fromProto(footer) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesHomeSectionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCashBalancesHomeSectionResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetCashBalancesHomeSectionResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCashBalancesHomeSectionResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesHomeSectionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCashBalancesHomeSectionResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCashBalancesHomeSectionResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCashBalancesHomeSectionResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCashBalancesHomeSectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesHomeSectionResponseDto";
        }
    }
}
