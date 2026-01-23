package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.order.Agent;
import rosetta.order.AgentDto;

/* compiled from: CancelLogDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0013JT\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/CancelLog;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/TimeDto;", "open_agent", "Lrosetta/order/AgentDto;", "open_at", "closed_agent", "closed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getDate", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getOpen_agent", "()Lrosetta/order/AgentDto;", "getOpen_at", "getClosed_agent", "getClosed_at", "getRoute", "()Lrosetta/mainst/RouteDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class CancelLogDto implements Dto3<CancelLog>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CancelLogDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CancelLogDto, CancelLog>> binaryBase64Serializer$delegate;
    private static final CancelLogDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CancelLogDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CancelLogDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final TimeDto getDate() {
        return this.surrogate.getDate();
    }

    public final AgentDto getOpen_agent() {
        return this.surrogate.getOpen_agent();
    }

    public final TimeDto getOpen_at() {
        return this.surrogate.getOpen_at();
    }

    public final AgentDto getClosed_agent() {
        return this.surrogate.getClosed_agent();
    }

    public final TimeDto getClosed_at() {
        return this.surrogate.getClosed_at();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public /* synthetic */ CancelLogDto(UUIDDto uUIDDto, TimeDto timeDto, AgentDto agentDto, TimeDto timeDto2, AgentDto agentDto2, TimeDto timeDto3, RouteDto routeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 8) != 0 ? null : timeDto2, (i & 16) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i & 32) != 0 ? null : timeDto3, (i & 64) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancelLogDto(UUIDDto uUIDDto, TimeDto timeDto, AgentDto open_agent, TimeDto timeDto2, AgentDto closed_agent, TimeDto timeDto3, RouteDto route) {
        this(new Surrogate(uUIDDto, timeDto, open_agent, timeDto2, closed_agent, timeDto3, route));
        Intrinsics.checkNotNullParameter(open_agent, "open_agent");
        Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
        Intrinsics.checkNotNullParameter(route, "route");
    }

    public static /* synthetic */ CancelLogDto copy$default(CancelLogDto cancelLogDto, UUIDDto uUIDDto, TimeDto timeDto, AgentDto agentDto, TimeDto timeDto2, AgentDto agentDto2, TimeDto timeDto3, RouteDto routeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uUIDDto = cancelLogDto.surrogate.getOrder_id();
        }
        if ((i & 2) != 0) {
            timeDto = cancelLogDto.surrogate.getDate();
        }
        if ((i & 4) != 0) {
            agentDto = cancelLogDto.surrogate.getOpen_agent();
        }
        if ((i & 8) != 0) {
            timeDto2 = cancelLogDto.surrogate.getOpen_at();
        }
        if ((i & 16) != 0) {
            agentDto2 = cancelLogDto.surrogate.getClosed_agent();
        }
        if ((i & 32) != 0) {
            timeDto3 = cancelLogDto.surrogate.getClosed_at();
        }
        if ((i & 64) != 0) {
            routeDto = cancelLogDto.surrogate.getRoute();
        }
        TimeDto timeDto4 = timeDto3;
        RouteDto routeDto2 = routeDto;
        AgentDto agentDto3 = agentDto2;
        AgentDto agentDto4 = agentDto;
        return cancelLogDto.copy(uUIDDto, timeDto, agentDto4, timeDto2, agentDto3, timeDto4, routeDto2);
    }

    public final CancelLogDto copy(UUIDDto order_id, TimeDto date, AgentDto open_agent, TimeDto open_at, AgentDto closed_agent, TimeDto closed_at, RouteDto route) {
        Intrinsics.checkNotNullParameter(open_agent, "open_agent");
        Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
        Intrinsics.checkNotNullParameter(route, "route");
        return new CancelLogDto(new Surrogate(order_id, date, open_agent, open_at, closed_agent, closed_at, route));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CancelLog toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        TimeDto date = this.surrogate.getDate();
        Time proto2 = date != null ? date.toProto() : null;
        Agent agent = (Agent) this.surrogate.getOpen_agent().toProto();
        TimeDto open_at = this.surrogate.getOpen_at();
        Time proto3 = open_at != null ? open_at.toProto() : null;
        Agent agent2 = (Agent) this.surrogate.getClosed_agent().toProto();
        TimeDto closed_at = this.surrogate.getClosed_at();
        return new CancelLog(proto, proto2, agent, proto3, agent2, closed_at != null ? closed_at.toProto() : null, (Route) this.surrogate.getRoute().toProto(), null, 128, null);
    }

    public String toString() {
        return "[CancelLogDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CancelLogDto) && Intrinsics.areEqual(((CancelLogDto) other).surrogate, this.surrogate);
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
    /* compiled from: CancelLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003JW\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0010HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/TimeDto;", "open_agent", "Lrosetta/order/AgentDto;", "open_at", "closed_agent", "closed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getDate$annotations", "getDate", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getOpen_agent$annotations", "getOpen_agent", "()Lrosetta/order/AgentDto;", "getOpen_at$annotations", "getOpen_at", "getClosed_agent$annotations", "getClosed_agent", "getClosed_at$annotations", "getClosed_at", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AgentDto closed_agent;
        private final TimeDto closed_at;
        private final TimeDto date;
        private final AgentDto open_agent;
        private final TimeDto open_at;
        private final UUIDDto order_id;
        private final RouteDto route;

        public Surrogate() {
            this((UUIDDto) null, (TimeDto) null, (AgentDto) null, (TimeDto) null, (AgentDto) null, (TimeDto) null, (RouteDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, TimeDto timeDto, AgentDto agentDto, TimeDto timeDto2, AgentDto agentDto2, TimeDto timeDto3, RouteDto routeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uUIDDto = surrogate.order_id;
            }
            if ((i & 2) != 0) {
                timeDto = surrogate.date;
            }
            if ((i & 4) != 0) {
                agentDto = surrogate.open_agent;
            }
            if ((i & 8) != 0) {
                timeDto2 = surrogate.open_at;
            }
            if ((i & 16) != 0) {
                agentDto2 = surrogate.closed_agent;
            }
            if ((i & 32) != 0) {
                timeDto3 = surrogate.closed_at;
            }
            if ((i & 64) != 0) {
                routeDto = surrogate.route;
            }
            TimeDto timeDto4 = timeDto3;
            RouteDto routeDto2 = routeDto;
            AgentDto agentDto3 = agentDto2;
            AgentDto agentDto4 = agentDto;
            return surrogate.copy(uUIDDto, timeDto, agentDto4, timeDto2, agentDto3, timeDto4, routeDto2);
        }

        @SerialName("closedAgent")
        @JsonAnnotations2(names = {"closed_agent"})
        public static /* synthetic */ void getClosed_agent$annotations() {
        }

        @SerialName("closedAt")
        @JsonAnnotations2(names = {"closed_at"})
        public static /* synthetic */ void getClosed_at$annotations() {
        }

        @SerialName(InquiryField.DateField.TYPE)
        @JsonAnnotations2(names = {InquiryField.DateField.TYPE})
        public static /* synthetic */ void getDate$annotations() {
        }

        @SerialName("openAgent")
        @JsonAnnotations2(names = {"open_agent"})
        public static /* synthetic */ void getOpen_agent$annotations() {
        }

        @SerialName("openAt")
        @JsonAnnotations2(names = {"open_at"})
        public static /* synthetic */ void getOpen_at$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final TimeDto getDate() {
            return this.date;
        }

        /* renamed from: component3, reason: from getter */
        public final AgentDto getOpen_agent() {
            return this.open_agent;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getOpen_at() {
            return this.open_at;
        }

        /* renamed from: component5, reason: from getter */
        public final AgentDto getClosed_agent() {
            return this.closed_agent;
        }

        /* renamed from: component6, reason: from getter */
        public final TimeDto getClosed_at() {
            return this.closed_at;
        }

        /* renamed from: component7, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        public final Surrogate copy(UUIDDto order_id, TimeDto date, AgentDto open_agent, TimeDto open_at, AgentDto closed_agent, TimeDto closed_at, RouteDto route) {
            Intrinsics.checkNotNullParameter(open_agent, "open_agent");
            Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
            Intrinsics.checkNotNullParameter(route, "route");
            return new Surrogate(order_id, date, open_agent, open_at, closed_agent, closed_at, route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.date, surrogate.date) && this.open_agent == surrogate.open_agent && Intrinsics.areEqual(this.open_at, surrogate.open_at) && this.closed_agent == surrogate.closed_agent && Intrinsics.areEqual(this.closed_at, surrogate.closed_at) && this.route == surrogate.route;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            TimeDto timeDto = this.date;
            int iHashCode2 = (((iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31) + this.open_agent.hashCode()) * 31;
            TimeDto timeDto2 = this.open_at;
            int iHashCode3 = (((iHashCode2 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.closed_agent.hashCode()) * 31;
            TimeDto timeDto3 = this.closed_at;
            return ((iHashCode3 + (timeDto3 != null ? timeDto3.hashCode() : 0)) * 31) + this.route.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", date=" + this.date + ", open_agent=" + this.open_agent + ", open_at=" + this.open_at + ", closed_agent=" + this.closed_agent + ", closed_at=" + this.closed_at + ", route=" + this.route + ")";
        }

        /* compiled from: CancelLogDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CancelLogDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, TimeDto timeDto, AgentDto agentDto, TimeDto timeDto2, AgentDto agentDto2, TimeDto timeDto3, RouteDto routeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.date = null;
            } else {
                this.date = timeDto;
            }
            if ((i & 4) == 0) {
                this.open_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.open_agent = agentDto;
            }
            if ((i & 8) == 0) {
                this.open_at = null;
            } else {
                this.open_at = timeDto2;
            }
            if ((i & 16) == 0) {
                this.closed_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.closed_agent = agentDto2;
            }
            if ((i & 32) == 0) {
                this.closed_at = null;
            } else {
                this.closed_at = timeDto3;
            }
            if ((i & 64) == 0) {
                this.route = RouteDto.INSTANCE.getZeroValue();
            } else {
                this.route = routeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            TimeDto timeDto = self.date;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TimeDto.Serializer.INSTANCE, timeDto);
            }
            AgentDto agentDto = self.open_agent;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            if (agentDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AgentDto.Serializer.INSTANCE, self.open_agent);
            }
            TimeDto timeDto2 = self.open_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.closed_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AgentDto.Serializer.INSTANCE, self.closed_agent);
            }
            TimeDto timeDto3 = self.closed_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, RouteDto.Serializer.INSTANCE, self.route);
            }
        }

        public Surrogate(UUIDDto uUIDDto, TimeDto timeDto, AgentDto open_agent, TimeDto timeDto2, AgentDto closed_agent, TimeDto timeDto3, RouteDto route) {
            Intrinsics.checkNotNullParameter(open_agent, "open_agent");
            Intrinsics.checkNotNullParameter(closed_agent, "closed_agent");
            Intrinsics.checkNotNullParameter(route, "route");
            this.order_id = uUIDDto;
            this.date = timeDto;
            this.open_agent = open_agent;
            this.open_at = timeDto2;
            this.closed_agent = closed_agent;
            this.closed_at = timeDto3;
            this.route = route;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final TimeDto getDate() {
            return this.date;
        }

        public final AgentDto getOpen_agent() {
            return this.open_agent;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, TimeDto timeDto, AgentDto agentDto, TimeDto timeDto2, AgentDto agentDto2, TimeDto timeDto3, RouteDto routeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 8) != 0 ? null : timeDto2, (i & 16) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i & 32) != 0 ? null : timeDto3, (i & 64) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto);
        }

        public final TimeDto getOpen_at() {
            return this.open_at;
        }

        public final AgentDto getClosed_agent() {
            return this.closed_agent;
        }

        public final TimeDto getClosed_at() {
            return this.closed_at;
        }

        public final RouteDto getRoute() {
            return this.route;
        }
    }

    /* compiled from: CancelLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/CancelLogDto;", "Lcom/robinhood/rosetta/mainst/CancelLog;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/CancelLogDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CancelLogDto, CancelLog> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CancelLogDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CancelLogDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CancelLogDto> getBinaryBase64Serializer() {
            return (KSerializer) CancelLogDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CancelLog> getProtoAdapter() {
            return CancelLog.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CancelLogDto getZeroValue() {
            return CancelLogDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CancelLogDto fromProto(CancelLog proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            Time date = proto.getDate();
            TimeDto timeDtoFromProto = date != null ? TimeDto.INSTANCE.fromProto(date) : null;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            AgentDto agentDtoFromProto = companion.fromProto(proto.getOpen_agent());
            Time open_at = proto.getOpen_at();
            TimeDto timeDtoFromProto2 = open_at != null ? TimeDto.INSTANCE.fromProto(open_at) : null;
            AgentDto agentDtoFromProto2 = companion.fromProto(proto.getClosed_agent());
            Time closed_at = proto.getClosed_at();
            return new CancelLogDto(new Surrogate(uUIDDtoFromProto, timeDtoFromProto, agentDtoFromProto, timeDtoFromProto2, agentDtoFromProto2, closed_at != null ? TimeDto.INSTANCE.fromProto(closed_at) : null, RouteDto.INSTANCE.fromProto(proto.getRoute())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CancelLogDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelLogDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CancelLogDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CancelLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CancelLogDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/CancelLogDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CancelLogDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.CancelLog", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CancelLogDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CancelLogDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CancelLogDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CancelLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CancelLogDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.CancelLogDto";
        }
    }
}
