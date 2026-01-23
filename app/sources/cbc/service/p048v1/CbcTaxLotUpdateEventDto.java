package cbc.service.p048v1;

import android.os.Parcel;
import android.os.Parcelable;
import cbc.service.p048v1.CbcTaxLotUpdateEventDto;
import cbc.service.p048v1.DownstreamEventTypeDto;
import cbc.service.p048v1.QueueTypeDto;
import cbc.service.p048v1.TaxLotDetailDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: CbcTaxLotUpdateEventDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.¨\u00063"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcbc/service/v1/CbcTaxLotUpdateEvent;", "Landroid/os/Parcelable;", "Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;", "surrogate", "<init>", "(Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;)V", "", "id", "account_id", "Lcbc/service/v1/DownstreamEventTypeDto;", "event_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "Lcbc/service/v1/TaxLotDetailDto;", "tax_lot_details", "", "is_gk_sync", "execution_id", "is_cancel_event", "record_date", "Lcbc/service/v1/QueueTypeDto;", "queue_type", "cbc_sent_time", "(Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/DownstreamEventTypeDto;Lj$/time/Instant;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lcbc/service/v1/QueueTypeDto;Lj$/time/Instant;)V", "toProto", "()Lcbc/service/v1/CbcTaxLotUpdateEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CbcTaxLotUpdateEventDto implements Dto3<CbcTaxLotUpdateEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CbcTaxLotUpdateEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CbcTaxLotUpdateEventDto, CbcTaxLotUpdateEvent>> binaryBase64Serializer$delegate;
    private static final CbcTaxLotUpdateEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CbcTaxLotUpdateEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CbcTaxLotUpdateEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CbcTaxLotUpdateEventDto(String str, String str2, DownstreamEventTypeDto downstreamEventTypeDto, Instant instant, List list, boolean z, String str3, boolean z2, String str4, QueueTypeDto queueTypeDto, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DownstreamEventTypeDto.INSTANCE.getZeroValue() : downstreamEventTypeDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? QueueTypeDto.INSTANCE.getZeroValue() : queueTypeDto, (i & 1024) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CbcTaxLotUpdateEventDto(String id, String account_id, DownstreamEventTypeDto event_type, Instant instant, List<TaxLotDetailDto> tax_lot_details, boolean z, String execution_id, boolean z2, String record_date, QueueTypeDto queue_type, Instant instant2) {
        this(new Surrogate(id, account_id, event_type, instant, tax_lot_details, z, execution_id, z2, record_date, queue_type, instant2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(tax_lot_details, "tax_lot_details");
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(queue_type, "queue_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CbcTaxLotUpdateEvent toProto() {
        String id = this.surrogate.getId();
        String account_id = this.surrogate.getAccount_id();
        DownstreamEventType downstreamEventType = (DownstreamEventType) this.surrogate.getEvent_type().toProto();
        Instant created_at = this.surrogate.getCreated_at();
        List<TaxLotDetailDto> tax_lot_details = this.surrogate.getTax_lot_details();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_details, 10));
        Iterator<T> it = tax_lot_details.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotDetailDto) it.next()).toProto());
        }
        return new CbcTaxLotUpdateEvent(id, account_id, downstreamEventType, created_at, arrayList, this.surrogate.getIs_gk_sync(), this.surrogate.getExecution_id(), this.surrogate.getIs_cancel_event(), this.surrogate.getRecord_date(), (QueueType) this.surrogate.getQueue_type().toProto(), this.surrogate.getCbc_sent_time(), null, 2048, null);
    }

    public String toString() {
        return "[CbcTaxLotUpdateEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CbcTaxLotUpdateEventDto) && Intrinsics.areEqual(((CbcTaxLotUpdateEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CbcTaxLotUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POBÇ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\u0018\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010)R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b8\u00102\u001a\u0004\b6\u00107RF\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u00102\u001a\u0004\b:\u0010;R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u00102\u001a\u0004\b>\u0010?R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\bC\u00102\u001a\u0004\b\u0011\u0010BR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010/\u0012\u0004\bE\u00102\u001a\u0004\bD\u0010)R \u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010A\u0012\u0004\bF\u00102\u001a\u0004\b\u0013\u0010BR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010/\u0012\u0004\bH\u00102\u001a\u0004\bG\u0010)R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010I\u0012\u0004\bL\u00102\u001a\u0004\bJ\u0010KRF\u0010\u0017\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00109\u0012\u0004\bN\u00102\u001a\u0004\bM\u0010;¨\u0006Q"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;", "", "", "id", "account_id", "Lcbc/service/v1/DownstreamEventTypeDto;", "event_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "", "Lcbc/service/v1/TaxLotDetailDto;", "tax_lot_details", "", "is_gk_sync", "execution_id", "is_cancel_event", "record_date", "Lcbc/service/v1/QueueTypeDto;", "queue_type", "cbc_sent_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/DownstreamEventTypeDto;Lj$/time/Instant;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lcbc/service/v1/QueueTypeDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcbc/service/v1/DownstreamEventTypeDto;Lj$/time/Instant;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lcbc/service/v1/QueueTypeDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cbc_v1_externalRelease", "(Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_id", "getAccount_id$annotations", "Lcbc/service/v1/DownstreamEventTypeDto;", "getEvent_type", "()Lcbc/service/v1/DownstreamEventTypeDto;", "getEvent_type$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Ljava/util/List;", "getTax_lot_details", "()Ljava/util/List;", "getTax_lot_details$annotations", "Z", "()Z", "is_gk_sync$annotations", "getExecution_id", "getExecution_id$annotations", "is_cancel_event$annotations", "getRecord_date", "getRecord_date$annotations", "Lcbc/service/v1/QueueTypeDto;", "getQueue_type", "()Lcbc/service/v1/QueueTypeDto;", "getQueue_type$annotations", "getCbc_sent_time", "getCbc_sent_time$annotations", "Companion", "$serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_id;
        private final Instant cbc_sent_time;
        private final Instant created_at;
        private final DownstreamEventTypeDto event_type;
        private final String execution_id;
        private final String id;
        private final boolean is_cancel_event;
        private final boolean is_gk_sync;
        private final QueueTypeDto queue_type;
        private final String record_date;
        private final List<TaxLotDetailDto> tax_lot_details;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: cbc.service.v1.CbcTaxLotUpdateEventDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CbcTaxLotUpdateEventDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (DownstreamEventTypeDto) null, (Instant) null, (List) null, false, (String) null, false, (String) null, (QueueTypeDto) null, (Instant) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotDetailDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.event_type == surrogate.event_type && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.tax_lot_details, surrogate.tax_lot_details) && this.is_gk_sync == surrogate.is_gk_sync && Intrinsics.areEqual(this.execution_id, surrogate.execution_id) && this.is_cancel_event == surrogate.is_cancel_event && Intrinsics.areEqual(this.record_date, surrogate.record_date) && this.queue_type == surrogate.queue_type && Intrinsics.areEqual(this.cbc_sent_time, surrogate.cbc_sent_time);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.event_type.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.tax_lot_details.hashCode()) * 31) + Boolean.hashCode(this.is_gk_sync)) * 31) + this.execution_id.hashCode()) * 31) + Boolean.hashCode(this.is_cancel_event)) * 31) + this.record_date.hashCode()) * 31) + this.queue_type.hashCode()) * 31;
            Instant instant2 = this.cbc_sent_time;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", event_type=" + this.event_type + ", created_at=" + this.created_at + ", tax_lot_details=" + this.tax_lot_details + ", is_gk_sync=" + this.is_gk_sync + ", execution_id=" + this.execution_id + ", is_cancel_event=" + this.is_cancel_event + ", record_date=" + this.record_date + ", queue_type=" + this.queue_type + ", cbc_sent_time=" + this.cbc_sent_time + ")";
        }

        /* compiled from: CbcTaxLotUpdateEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CbcTaxLotUpdateEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, DownstreamEventTypeDto downstreamEventTypeDto, Instant instant, List list, boolean z, String str3, boolean z2, String str4, QueueTypeDto queueTypeDto, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.event_type = DownstreamEventTypeDto.INSTANCE.getZeroValue();
            } else {
                this.event_type = downstreamEventTypeDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.tax_lot_details = CollectionsKt.emptyList();
            } else {
                this.tax_lot_details = list;
            }
            if ((i & 32) == 0) {
                this.is_gk_sync = false;
            } else {
                this.is_gk_sync = z;
            }
            if ((i & 64) == 0) {
                this.execution_id = "";
            } else {
                this.execution_id = str3;
            }
            if ((i & 128) == 0) {
                this.is_cancel_event = false;
            } else {
                this.is_cancel_event = z2;
            }
            if ((i & 256) == 0) {
                this.record_date = "";
            } else {
                this.record_date = str4;
            }
            if ((i & 512) == 0) {
                this.queue_type = QueueTypeDto.INSTANCE.getZeroValue();
            } else {
                this.queue_type = queueTypeDto;
            }
            if ((i & 1024) == 0) {
                this.cbc_sent_time = null;
            } else {
                this.cbc_sent_time = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cbc_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (self.event_type != DownstreamEventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DownstreamEventTypeDto.Serializer.INSTANCE, self.event_type);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.tax_lot_details, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.tax_lot_details);
            }
            boolean z = self.is_gk_sync;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            if (!Intrinsics.areEqual(self.execution_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.execution_id);
            }
            boolean z2 = self.is_cancel_event;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 7, z2);
            }
            if (!Intrinsics.areEqual(self.record_date, "")) {
                output.encodeStringElement(serialDesc, 8, self.record_date);
            }
            if (self.queue_type != QueueTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, QueueTypeDto.Serializer.INSTANCE, self.queue_type);
            }
            Instant instant2 = self.cbc_sent_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String id, String account_id, DownstreamEventTypeDto event_type, Instant instant, List<TaxLotDetailDto> tax_lot_details, boolean z, String execution_id, boolean z2, String record_date, QueueTypeDto queue_type, Instant instant2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            Intrinsics.checkNotNullParameter(tax_lot_details, "tax_lot_details");
            Intrinsics.checkNotNullParameter(execution_id, "execution_id");
            Intrinsics.checkNotNullParameter(record_date, "record_date");
            Intrinsics.checkNotNullParameter(queue_type, "queue_type");
            this.id = id;
            this.account_id = account_id;
            this.event_type = event_type;
            this.created_at = instant;
            this.tax_lot_details = tax_lot_details;
            this.is_gk_sync = z;
            this.execution_id = execution_id;
            this.is_cancel_event = z2;
            this.record_date = record_date;
            this.queue_type = queue_type;
            this.cbc_sent_time = instant2;
        }

        public /* synthetic */ Surrogate(String str, String str2, DownstreamEventTypeDto downstreamEventTypeDto, Instant instant, List list, boolean z, String str3, boolean z2, String str4, QueueTypeDto queueTypeDto, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DownstreamEventTypeDto.INSTANCE.getZeroValue() : downstreamEventTypeDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? QueueTypeDto.INSTANCE.getZeroValue() : queueTypeDto, (i & 1024) != 0 ? null : instant2);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final DownstreamEventTypeDto getEvent_type() {
            return this.event_type;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final List<TaxLotDetailDto> getTax_lot_details() {
            return this.tax_lot_details;
        }

        /* renamed from: is_gk_sync, reason: from getter */
        public final boolean getIs_gk_sync() {
            return this.is_gk_sync;
        }

        public final String getExecution_id() {
            return this.execution_id;
        }

        /* renamed from: is_cancel_event, reason: from getter */
        public final boolean getIs_cancel_event() {
            return this.is_cancel_event;
        }

        public final String getRecord_date() {
            return this.record_date;
        }

        public final QueueTypeDto getQueue_type() {
            return this.queue_type;
        }

        public final Instant getCbc_sent_time() {
            return this.cbc_sent_time;
        }
    }

    /* compiled from: CbcTaxLotUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "Lcbc/service/v1/CbcTaxLotUpdateEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CbcTaxLotUpdateEventDto, CbcTaxLotUpdateEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CbcTaxLotUpdateEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CbcTaxLotUpdateEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CbcTaxLotUpdateEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CbcTaxLotUpdateEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CbcTaxLotUpdateEvent> getProtoAdapter() {
            return CbcTaxLotUpdateEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CbcTaxLotUpdateEventDto getZeroValue() {
            return CbcTaxLotUpdateEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CbcTaxLotUpdateEventDto fromProto(CbcTaxLotUpdateEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_id = proto.getAccount_id();
            DownstreamEventTypeDto downstreamEventTypeDtoFromProto = DownstreamEventTypeDto.INSTANCE.fromProto(proto.getEvent_type());
            Instant created_at = proto.getCreated_at();
            List<TaxLotDetail> tax_lot_details = proto.getTax_lot_details();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_details, 10));
            Iterator<T> it = tax_lot_details.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotDetailDto.INSTANCE.fromProto((TaxLotDetail) it.next()));
            }
            return new CbcTaxLotUpdateEventDto(new Surrogate(id, account_id, downstreamEventTypeDtoFromProto, created_at, arrayList, proto.getIs_gk_sync(), proto.getExecution_id(), proto.getIs_cancel_event(), proto.getRecord_date(), QueueTypeDto.INSTANCE.fromProto(proto.getQueue_type()), proto.getCbc_sent_time()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.CbcTaxLotUpdateEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CbcTaxLotUpdateEventDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CbcTaxLotUpdateEventDto(null, null, null, null, null, false, null, false, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CbcTaxLotUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/CbcTaxLotUpdateEventDto;", "<init>", "()V", "surrogateSerializer", "Lcbc/service/v1/CbcTaxLotUpdateEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<CbcTaxLotUpdateEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cbc.service.v1.CbcTaxLotUpdateEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CbcTaxLotUpdateEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CbcTaxLotUpdateEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CbcTaxLotUpdateEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CbcTaxLotUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "cbc.service.v1.CbcTaxLotUpdateEventDto";
        }
    }
}
