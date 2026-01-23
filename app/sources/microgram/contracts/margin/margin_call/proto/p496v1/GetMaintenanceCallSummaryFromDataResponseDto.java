package microgram.contracts.margin.margin_call.proto.p496v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.TradeDto;

/* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;)V", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "trades", "", "total_credit_cost_header", "total_credit_cost_value", "call_credit_cost_value", InstantCashConstants.ACCOUNT_TYPE_KEY, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;", "getTrades", "()Ljava/util/List;", "getTotal_credit_cost_header", "getTotal_credit_cost_value", "getCall_credit_cost_value", "getAccount_type", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class GetMaintenanceCallSummaryFromDataResponseDto implements Dto3<GetMaintenanceCallSummaryFromDataResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMaintenanceCallSummaryFromDataResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMaintenanceCallSummaryFromDataResponseDto, GetMaintenanceCallSummaryFromDataResponse>> binaryBase64Serializer$delegate;
    private static final GetMaintenanceCallSummaryFromDataResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMaintenanceCallSummaryFromDataResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMaintenanceCallSummaryFromDataResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<TradeDto> getTrades() {
        return this.surrogate.getTrades();
    }

    public final String getTotal_credit_cost_header() {
        return this.surrogate.getTotal_credit_cost_header();
    }

    public final String getTotal_credit_cost_value() {
        return this.surrogate.getTotal_credit_cost_value();
    }

    public final String getCall_credit_cost_value() {
        return this.surrogate.getCall_credit_cost_value();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetMaintenanceCallSummaryFromDataResponseDto(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r8 = r7 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            r3 = r0
        Lf:
            r8 = r7 & 4
            if (r8 == 0) goto L14
            r4 = r0
        L14:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            r5 = r0
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L24
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L24:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMaintenanceCallSummaryFromDataResponseDto(List<TradeDto> trades, String total_credit_cost_header, String total_credit_cost_value, String call_credit_cost_value, String account_type) {
        this(new Surrogate(trades, total_credit_cost_header, total_credit_cost_value, call_credit_cost_value, account_type));
        Intrinsics.checkNotNullParameter(trades, "trades");
        Intrinsics.checkNotNullParameter(total_credit_cost_header, "total_credit_cost_header");
        Intrinsics.checkNotNullParameter(total_credit_cost_value, "total_credit_cost_value");
        Intrinsics.checkNotNullParameter(call_credit_cost_value, "call_credit_cost_value");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
    }

    @Override // com.robinhood.idl.Dto
    public GetMaintenanceCallSummaryFromDataResponse toProto() {
        List<TradeDto> trades = this.surrogate.getTrades();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trades, 10));
        Iterator<T> it = trades.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeDto) it.next()).toProto());
        }
        return new GetMaintenanceCallSummaryFromDataResponse(arrayList, this.surrogate.getTotal_credit_cost_header(), this.surrogate.getTotal_credit_cost_value(), this.surrogate.getCall_credit_cost_value(), this.surrogate.getAccount_type(), null, 32, null);
    }

    public String toString() {
        return "[GetMaintenanceCallSummaryFromDataResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMaintenanceCallSummaryFromDataResponseDto) && Intrinsics.areEqual(((GetMaintenanceCallSummaryFromDataResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001bR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010\u001b¨\u00062"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;", "", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/TradeDto;", "trades", "", "total_credit_cost_header", "total_credit_cost_value", "call_credit_cost_value", InstantCashConstants.ACCOUNT_TYPE_KEY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTrades", "()Ljava/util/List;", "getTrades$annotations", "()V", "Ljava/lang/String;", "getTotal_credit_cost_header", "getTotal_credit_cost_header$annotations", "getTotal_credit_cost_value", "getTotal_credit_cost_value$annotations", "getCall_credit_cost_value", "getCall_credit_cost_value$annotations", "getAccount_type", "getAccount_type$annotations", "Companion", "$serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_type;
        private final String call_credit_cost_value;
        private final String total_credit_cost_header;
        private final String total_credit_cost_value;
        private final List<TradeDto> trades;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallSummaryFromDataResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMaintenanceCallSummaryFromDataResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TradeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.trades, surrogate.trades) && Intrinsics.areEqual(this.total_credit_cost_header, surrogate.total_credit_cost_header) && Intrinsics.areEqual(this.total_credit_cost_value, surrogate.total_credit_cost_value) && Intrinsics.areEqual(this.call_credit_cost_value, surrogate.call_credit_cost_value) && Intrinsics.areEqual(this.account_type, surrogate.account_type);
        }

        public int hashCode() {
            return (((((((this.trades.hashCode() * 31) + this.total_credit_cost_header.hashCode()) * 31) + this.total_credit_cost_value.hashCode()) * 31) + this.call_credit_cost_value.hashCode()) * 31) + this.account_type.hashCode();
        }

        public String toString() {
            return "Surrogate(trades=" + this.trades + ", total_credit_cost_header=" + this.total_credit_cost_header + ", total_credit_cost_value=" + this.total_credit_cost_value + ", call_credit_cost_value=" + this.call_credit_cost_value + ", account_type=" + this.account_type + ")";
        }

        /* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMaintenanceCallSummaryFromDataResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.trades = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.total_credit_cost_header = "";
            } else {
                this.total_credit_cost_header = str;
            }
            if ((i & 4) == 0) {
                this.total_credit_cost_value = "";
            } else {
                this.total_credit_cost_value = str2;
            }
            if ((i & 8) == 0) {
                this.call_credit_cost_value = "";
            } else {
                this.call_credit_cost_value = str3;
            }
            if ((i & 16) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str4;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease */
        public static final /* synthetic */ void m3766xd30f103b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.trades, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.trades);
            }
            if (!Intrinsics.areEqual(self.total_credit_cost_header, "")) {
                output.encodeStringElement(serialDesc, 1, self.total_credit_cost_header);
            }
            if (!Intrinsics.areEqual(self.total_credit_cost_value, "")) {
                output.encodeStringElement(serialDesc, 2, self.total_credit_cost_value);
            }
            if (!Intrinsics.areEqual(self.call_credit_cost_value, "")) {
                output.encodeStringElement(serialDesc, 3, self.call_credit_cost_value);
            }
            if (Intrinsics.areEqual(self.account_type, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.account_type);
        }

        public Surrogate(List<TradeDto> trades, String total_credit_cost_header, String total_credit_cost_value, String call_credit_cost_value, String account_type) {
            Intrinsics.checkNotNullParameter(trades, "trades");
            Intrinsics.checkNotNullParameter(total_credit_cost_header, "total_credit_cost_header");
            Intrinsics.checkNotNullParameter(total_credit_cost_value, "total_credit_cost_value");
            Intrinsics.checkNotNullParameter(call_credit_cost_value, "call_credit_cost_value");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            this.trades = trades;
            this.total_credit_cost_header = total_credit_cost_header;
            this.total_credit_cost_value = total_credit_cost_value;
            this.call_credit_cost_value = call_credit_cost_value;
            this.account_type = account_type;
        }

        public final List<TradeDto> getTrades() {
            return this.trades;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r8 = r7 & 2
                java.lang.String r0 = ""
                if (r8 == 0) goto Lf
                r3 = r0
            Lf:
                r8 = r7 & 4
                if (r8 == 0) goto L14
                r4 = r0
            L14:
                r8 = r7 & 8
                if (r8 == 0) goto L19
                r5 = r0
            L19:
                r7 = r7 & 16
                if (r7 == 0) goto L24
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2a
            L24:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2a:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto.Surrogate.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTotal_credit_cost_header() {
            return this.total_credit_cost_header;
        }

        public final String getTotal_credit_cost_value() {
            return this.total_credit_cost_value;
        }

        public final String getCall_credit_cost_value() {
            return this.call_credit_cost_value;
        }

        public final String getAccount_type() {
            return this.account_type;
        }
    }

    /* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMaintenanceCallSummaryFromDataResponseDto, GetMaintenanceCallSummaryFromDataResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMaintenanceCallSummaryFromDataResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceCallSummaryFromDataResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceCallSummaryFromDataResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMaintenanceCallSummaryFromDataResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMaintenanceCallSummaryFromDataResponse> getProtoAdapter() {
            return GetMaintenanceCallSummaryFromDataResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceCallSummaryFromDataResponseDto getZeroValue() {
            return GetMaintenanceCallSummaryFromDataResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceCallSummaryFromDataResponseDto fromProto(GetMaintenanceCallSummaryFromDataResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<Trade> trades = proto.getTrades();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trades, 10));
            Iterator<T> it = trades.iterator();
            while (it.hasNext()) {
                arrayList.add(TradeDto.INSTANCE.fromProto((Trade) it.next()));
            }
            return new GetMaintenanceCallSummaryFromDataResponseDto(new Surrogate(arrayList, proto.getTotal_credit_cost_header(), proto.getTotal_credit_cost_value(), proto.getCall_credit_cost_value(), proto.getAccount_type()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallSummaryFromDataResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMaintenanceCallSummaryFromDataResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetMaintenanceCallSummaryFromDataResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMaintenanceCallSummaryFromDataResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallSummaryFromDataResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMaintenanceCallSummaryFromDataResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMaintenanceCallSummaryFromDataResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMaintenanceCallSummaryFromDataResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMaintenanceCallSummaryFromDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallSummaryFromDataResponseDto";
        }
    }
}
