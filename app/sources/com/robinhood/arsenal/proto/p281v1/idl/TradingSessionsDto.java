package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.SessionDto;
import com.robinhood.arsenal.proto.p281v1.idl.TradingSessionsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: TradingSessionsDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0015Js\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;)V", InquiryField.DateField.TYPE, "", "futures_contract_id", "is_holiday", "", "start_time", "end_time", "sessions", "", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "current_session", "previous_session", "next_session", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;)V", "getDate", "()Ljava/lang/String;", "getFutures_contract_id", "()Ljava/lang/Boolean;", "getStart_time", "getEnd_time", "getSessions", "()Ljava/util/List;", "getCurrent_session", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "getPrevious_session", "getNext_session", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;)Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class TradingSessionsDto implements Dto3<TradingSessions>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TradingSessionsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TradingSessionsDto, TradingSessions>> binaryBase64Serializer$delegate;
    private static final TradingSessionsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TradingSessionsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TradingSessionsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDate() {
        return this.surrogate.getDate();
    }

    public final String getFutures_contract_id() {
        return this.surrogate.getFutures_contract_id();
    }

    public final Boolean is_holiday() {
        return this.surrogate.is_holiday();
    }

    public final String getStart_time() {
        return this.surrogate.getStart_time();
    }

    public final String getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    public final List<SessionDto> getSessions() {
        return this.surrogate.getSessions();
    }

    public final SessionDto getCurrent_session() {
        return this.surrogate.getCurrent_session();
    }

    public final SessionDto getPrevious_session() {
        return this.surrogate.getPrevious_session();
    }

    public final SessionDto getNext_session() {
        return this.surrogate.getNext_session();
    }

    public /* synthetic */ TradingSessionsDto(String str, String str2, Boolean bool, String str3, String str4, List list, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : sessionDto, (i & 128) != 0 ? null : sessionDto2, (i & 256) != 0 ? null : sessionDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TradingSessionsDto(String date, String futures_contract_id, Boolean bool, String start_time, String end_time, List<SessionDto> sessions, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3) {
        this(new Surrogate(date, futures_contract_id, bool, start_time, end_time, sessions, sessionDto, sessionDto2, sessionDto3));
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
    }

    public static /* synthetic */ TradingSessionsDto copy$default(TradingSessionsDto tradingSessionsDto, String str, String str2, Boolean bool, String str3, String str4, List list, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingSessionsDto.surrogate.getDate();
        }
        if ((i & 2) != 0) {
            str2 = tradingSessionsDto.surrogate.getFutures_contract_id();
        }
        if ((i & 4) != 0) {
            bool = tradingSessionsDto.surrogate.is_holiday();
        }
        if ((i & 8) != 0) {
            str3 = tradingSessionsDto.surrogate.getStart_time();
        }
        if ((i & 16) != 0) {
            str4 = tradingSessionsDto.surrogate.getEnd_time();
        }
        if ((i & 32) != 0) {
            list = tradingSessionsDto.surrogate.getSessions();
        }
        if ((i & 64) != 0) {
            sessionDto = tradingSessionsDto.surrogate.getCurrent_session();
        }
        if ((i & 128) != 0) {
            sessionDto2 = tradingSessionsDto.surrogate.getPrevious_session();
        }
        if ((i & 256) != 0) {
            sessionDto3 = tradingSessionsDto.surrogate.getNext_session();
        }
        SessionDto sessionDto4 = sessionDto2;
        SessionDto sessionDto5 = sessionDto3;
        List list2 = list;
        SessionDto sessionDto6 = sessionDto;
        String str5 = str4;
        Boolean bool2 = bool;
        return tradingSessionsDto.copy(str, str2, bool2, str3, str5, list2, sessionDto6, sessionDto4, sessionDto5);
    }

    public final TradingSessionsDto copy(String date, String futures_contract_id, Boolean is_holiday, String start_time, String end_time, List<SessionDto> sessions, SessionDto current_session, SessionDto previous_session, SessionDto next_session) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        return new TradingSessionsDto(new Surrogate(date, futures_contract_id, is_holiday, start_time, end_time, sessions, current_session, previous_session, next_session));
    }

    @Override // com.robinhood.idl.Dto
    public TradingSessions toProto() {
        String date = this.surrogate.getDate();
        String futures_contract_id = this.surrogate.getFutures_contract_id();
        Boolean boolIs_holiday = this.surrogate.is_holiday();
        String start_time = this.surrogate.getStart_time();
        String end_time = this.surrogate.getEnd_time();
        List<SessionDto> sessions = this.surrogate.getSessions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sessions, 10));
        Iterator<T> it = sessions.iterator();
        while (it.hasNext()) {
            arrayList.add(((SessionDto) it.next()).toProto());
        }
        SessionDto current_session = this.surrogate.getCurrent_session();
        Session proto = current_session != null ? current_session.toProto() : null;
        SessionDto previous_session = this.surrogate.getPrevious_session();
        Session proto2 = previous_session != null ? previous_session.toProto() : null;
        SessionDto next_session = this.surrogate.getNext_session();
        return new TradingSessions(date, futures_contract_id, boolIs_holiday, start_time, end_time, arrayList, proto, proto2, next_session != null ? next_session.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[TradingSessionsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TradingSessionsDto) && Intrinsics.areEqual(((TradingSessionsDto) other).surrogate, this.surrogate);
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
    /* compiled from: TradingSessionsDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002DEBo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jv\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0012HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J%\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0002\bCR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0005\u0010\u001dR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010(R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010(¨\u0006F"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;", "", InquiryField.DateField.TYPE, "", "futures_contract_id", "is_holiday", "", "start_time", "end_time", "sessions", "", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "current_session", "previous_session", "next_session", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDate$annotations", "()V", "getDate", "()Ljava/lang/String;", "getFutures_contract_id$annotations", "getFutures_contract_id", "is_holiday$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStart_time$annotations", "getStart_time", "getEnd_time$annotations", "getEnd_time", "getSessions$annotations", "getSessions", "()Ljava/util/List;", "getCurrent_session$annotations", "getCurrent_session", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "getPrevious_session$annotations", "getPrevious_session", "getNext_session$annotations", "getNext_session", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;)Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final SessionDto current_session;
        private final String date;
        private final String end_time;
        private final String futures_contract_id;
        private final Boolean is_holiday;
        private final SessionDto next_session;
        private final SessionDto previous_session;
        private final List<SessionDto> sessions;
        private final String start_time;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.TradingSessionsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingSessionsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (List) null, (SessionDto) null, (SessionDto) null, (SessionDto) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SessionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Boolean bool, String str3, String str4, List list, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.date;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.futures_contract_id;
            }
            if ((i & 4) != 0) {
                bool = surrogate.is_holiday;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.start_time;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.end_time;
            }
            if ((i & 32) != 0) {
                list = surrogate.sessions;
            }
            if ((i & 64) != 0) {
                sessionDto = surrogate.current_session;
            }
            if ((i & 128) != 0) {
                sessionDto2 = surrogate.previous_session;
            }
            if ((i & 256) != 0) {
                sessionDto3 = surrogate.next_session;
            }
            SessionDto sessionDto4 = sessionDto2;
            SessionDto sessionDto5 = sessionDto3;
            List list2 = list;
            SessionDto sessionDto6 = sessionDto;
            String str5 = str4;
            Boolean bool2 = bool;
            return surrogate.copy(str, str2, bool2, str3, str5, list2, sessionDto6, sessionDto4, sessionDto5);
        }

        @SerialName("currentSession")
        @JsonAnnotations2(names = {"current_session"})
        public static /* synthetic */ void getCurrent_session$annotations() {
        }

        @SerialName(InquiryField.DateField.TYPE)
        @JsonAnnotations2(names = {InquiryField.DateField.TYPE})
        public static /* synthetic */ void getDate$annotations() {
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("futuresContractId")
        @JsonAnnotations2(names = {"futures_contract_id"})
        public static /* synthetic */ void getFutures_contract_id$annotations() {
        }

        @SerialName("nextSession")
        @JsonAnnotations2(names = {"next_session"})
        public static /* synthetic */ void getNext_session$annotations() {
        }

        @SerialName("previousSession")
        @JsonAnnotations2(names = {"previous_session"})
        public static /* synthetic */ void getPrevious_session$annotations() {
        }

        @SerialName("sessions")
        @JsonAnnotations2(names = {"sessions"})
        public static /* synthetic */ void getSessions$annotations() {
        }

        @SerialName("startTime")
        @JsonAnnotations2(names = {"start_time"})
        public static /* synthetic */ void getStart_time$annotations() {
        }

        @SerialName("isHoliday")
        @JsonAnnotations2(names = {"is_holiday"})
        public static /* synthetic */ void is_holiday$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFutures_contract_id() {
            return this.futures_contract_id;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIs_holiday() {
            return this.is_holiday;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStart_time() {
            return this.start_time;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEnd_time() {
            return this.end_time;
        }

        public final List<SessionDto> component6() {
            return this.sessions;
        }

        /* renamed from: component7, reason: from getter */
        public final SessionDto getCurrent_session() {
            return this.current_session;
        }

        /* renamed from: component8, reason: from getter */
        public final SessionDto getPrevious_session() {
            return this.previous_session;
        }

        /* renamed from: component9, reason: from getter */
        public final SessionDto getNext_session() {
            return this.next_session;
        }

        public final Surrogate copy(String date, String futures_contract_id, Boolean is_holiday, String start_time, String end_time, List<SessionDto> sessions, SessionDto current_session, SessionDto previous_session, SessionDto next_session) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            return new Surrogate(date, futures_contract_id, is_holiday, start_time, end_time, sessions, current_session, previous_session, next_session);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.date, surrogate.date) && Intrinsics.areEqual(this.futures_contract_id, surrogate.futures_contract_id) && Intrinsics.areEqual(this.is_holiday, surrogate.is_holiday) && Intrinsics.areEqual(this.start_time, surrogate.start_time) && Intrinsics.areEqual(this.end_time, surrogate.end_time) && Intrinsics.areEqual(this.sessions, surrogate.sessions) && Intrinsics.areEqual(this.current_session, surrogate.current_session) && Intrinsics.areEqual(this.previous_session, surrogate.previous_session) && Intrinsics.areEqual(this.next_session, surrogate.next_session);
        }

        public int hashCode() {
            int iHashCode = ((this.date.hashCode() * 31) + this.futures_contract_id.hashCode()) * 31;
            Boolean bool = this.is_holiday;
            int iHashCode2 = (((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.start_time.hashCode()) * 31) + this.end_time.hashCode()) * 31) + this.sessions.hashCode()) * 31;
            SessionDto sessionDto = this.current_session;
            int iHashCode3 = (iHashCode2 + (sessionDto == null ? 0 : sessionDto.hashCode())) * 31;
            SessionDto sessionDto2 = this.previous_session;
            int iHashCode4 = (iHashCode3 + (sessionDto2 == null ? 0 : sessionDto2.hashCode())) * 31;
            SessionDto sessionDto3 = this.next_session;
            return iHashCode4 + (sessionDto3 != null ? sessionDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(date=" + this.date + ", futures_contract_id=" + this.futures_contract_id + ", is_holiday=" + this.is_holiday + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", sessions=" + this.sessions + ", current_session=" + this.current_session + ", previous_session=" + this.previous_session + ", next_session=" + this.next_session + ")";
        }

        /* compiled from: TradingSessionsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TradingSessionsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Boolean bool, String str3, String str4, List list, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.date = "";
            } else {
                this.date = str;
            }
            if ((i & 2) == 0) {
                this.futures_contract_id = "";
            } else {
                this.futures_contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.is_holiday = null;
            } else {
                this.is_holiday = bool;
            }
            if ((i & 8) == 0) {
                this.start_time = "";
            } else {
                this.start_time = str3;
            }
            if ((i & 16) == 0) {
                this.end_time = "";
            } else {
                this.end_time = str4;
            }
            if ((i & 32) == 0) {
                this.sessions = CollectionsKt.emptyList();
            } else {
                this.sessions = list;
            }
            if ((i & 64) == 0) {
                this.current_session = null;
            } else {
                this.current_session = sessionDto;
            }
            if ((i & 128) == 0) {
                this.previous_session = null;
            } else {
                this.previous_session = sessionDto2;
            }
            if ((i & 256) == 0) {
                this.next_session = null;
            } else {
                this.next_session = sessionDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.date, "")) {
                output.encodeStringElement(serialDesc, 0, self.date);
            }
            if (!Intrinsics.areEqual(self.futures_contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.futures_contract_id);
            }
            Boolean bool = self.is_holiday;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
            if (!Intrinsics.areEqual(self.start_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.start_time);
            }
            if (!Intrinsics.areEqual(self.end_time, "")) {
                output.encodeStringElement(serialDesc, 4, self.end_time);
            }
            if (!Intrinsics.areEqual(self.sessions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.sessions);
            }
            SessionDto sessionDto = self.current_session;
            if (sessionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SessionDto.Serializer.INSTANCE, sessionDto);
            }
            SessionDto sessionDto2 = self.previous_session;
            if (sessionDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SessionDto.Serializer.INSTANCE, sessionDto2);
            }
            SessionDto sessionDto3 = self.next_session;
            if (sessionDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SessionDto.Serializer.INSTANCE, sessionDto3);
            }
        }

        public Surrogate(String date, String futures_contract_id, Boolean bool, String start_time, String end_time, List<SessionDto> sessions, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            this.date = date;
            this.futures_contract_id = futures_contract_id;
            this.is_holiday = bool;
            this.start_time = start_time;
            this.end_time = end_time;
            this.sessions = sessions;
            this.current_session = sessionDto;
            this.previous_session = sessionDto2;
            this.next_session = sessionDto3;
        }

        public /* synthetic */ Surrogate(String str, String str2, Boolean bool, String str3, String str4, List list, SessionDto sessionDto, SessionDto sessionDto2, SessionDto sessionDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : sessionDto, (i & 128) != 0 ? null : sessionDto2, (i & 256) != 0 ? null : sessionDto3);
        }

        public final String getDate() {
            return this.date;
        }

        public final String getFutures_contract_id() {
            return this.futures_contract_id;
        }

        public final Boolean is_holiday() {
            return this.is_holiday;
        }

        public final String getStart_time() {
            return this.start_time;
        }

        public final String getEnd_time() {
            return this.end_time;
        }

        public final List<SessionDto> getSessions() {
            return this.sessions;
        }

        public final SessionDto getCurrent_session() {
            return this.current_session;
        }

        public final SessionDto getPrevious_session() {
            return this.previous_session;
        }

        public final SessionDto getNext_session() {
            return this.next_session;
        }
    }

    /* compiled from: TradingSessionsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TradingSessionsDto, TradingSessions> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradingSessionsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradingSessionsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradingSessionsDto> getBinaryBase64Serializer() {
            return (KSerializer) TradingSessionsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TradingSessions> getProtoAdapter() {
            return TradingSessions.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradingSessionsDto getZeroValue() {
            return TradingSessionsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradingSessionsDto fromProto(TradingSessions proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String date = proto.getDate();
            String futures_contract_id = proto.getFutures_contract_id();
            Boolean is_holiday = proto.getIs_holiday();
            String start_time = proto.getStart_time();
            String end_time = proto.getEnd_time();
            List<Session> sessions = proto.getSessions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sessions, 10));
            Iterator<T> it = sessions.iterator();
            while (it.hasNext()) {
                arrayList.add(SessionDto.INSTANCE.fromProto((Session) it.next()));
            }
            Session current_session = proto.getCurrent_session();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SessionDto sessionDtoFromProto = current_session != null ? SessionDto.INSTANCE.fromProto(current_session) : null;
            Session previous_session = proto.getPrevious_session();
            SessionDto sessionDtoFromProto2 = previous_session != null ? SessionDto.INSTANCE.fromProto(previous_session) : null;
            Session next_session = proto.getNext_session();
            return new TradingSessionsDto(new Surrogate(date, futures_contract_id, is_holiday, start_time, end_time, arrayList, sessionDtoFromProto, sessionDtoFromProto2, next_session != null ? SessionDto.INSTANCE.fromProto(next_session) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.TradingSessionsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingSessionsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TradingSessionsDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TradingSessionsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer implements KSerializer<TradingSessionsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.TradingSessions", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TradingSessionsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TradingSessionsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TradingSessionsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TradingSessionsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.TradingSessionsDto";
        }
    }
}
