package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EventMDLiveDataBackupDto.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0014Js\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\rH\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u00065"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;)V", "status", "", "start_ts", "home_id", "home_points", "", "away_id", "away_points", "period", "period_type", "period_remaining_time", "display_label", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getStart_ts", "getHome_id", "getHome_points", "()Ljava/lang/Integer;", "getAway_id", "getAway_points", "getPeriod", "()I", "getPeriod_type", "getPeriod_remaining_time", "getDisplay_label", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class EventMDLiveDataBackupDto implements Dto3<EventMDLiveDataBackup>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventMDLiveDataBackupDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventMDLiveDataBackupDto, EventMDLiveDataBackup>> binaryBase64Serializer$delegate;
    private static final EventMDLiveDataBackupDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventMDLiveDataBackupDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventMDLiveDataBackupDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getStart_ts() {
        return this.surrogate.getStart_ts();
    }

    public final String getHome_id() {
        return this.surrogate.getHome_id();
    }

    public final Integer getHome_points() {
        return this.surrogate.getHome_points();
    }

    public final String getAway_id() {
        return this.surrogate.getAway_id();
    }

    public final Integer getAway_points() {
        return this.surrogate.getAway_points();
    }

    public final int getPeriod() {
        return this.surrogate.getPeriod();
    }

    public final String getPeriod_type() {
        return this.surrogate.getPeriod_type();
    }

    public final String getPeriod_remaining_time() {
        return this.surrogate.getPeriod_remaining_time();
    }

    public final String getDisplay_label() {
        return this.surrogate.getDisplay_label();
    }

    public /* synthetic */ EventMDLiveDataBackupDto(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMDLiveDataBackupDto(String status, String start_ts, String home_id, Integer num, String away_id, Integer num2, int i, String period_type, String period_remaining_time, String display_label) {
        this(new Surrogate(status, start_ts, home_id, num, away_id, num2, i, period_type, period_remaining_time, display_label));
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(start_ts, "start_ts");
        Intrinsics.checkNotNullParameter(home_id, "home_id");
        Intrinsics.checkNotNullParameter(away_id, "away_id");
        Intrinsics.checkNotNullParameter(period_type, "period_type");
        Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
        Intrinsics.checkNotNullParameter(display_label, "display_label");
    }

    public static /* synthetic */ EventMDLiveDataBackupDto copy$default(EventMDLiveDataBackupDto eventMDLiveDataBackupDto, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventMDLiveDataBackupDto.surrogate.getStatus();
        }
        if ((i2 & 2) != 0) {
            str2 = eventMDLiveDataBackupDto.surrogate.getStart_ts();
        }
        if ((i2 & 4) != 0) {
            str3 = eventMDLiveDataBackupDto.surrogate.getHome_id();
        }
        if ((i2 & 8) != 0) {
            num = eventMDLiveDataBackupDto.surrogate.getHome_points();
        }
        if ((i2 & 16) != 0) {
            str4 = eventMDLiveDataBackupDto.surrogate.getAway_id();
        }
        if ((i2 & 32) != 0) {
            num2 = eventMDLiveDataBackupDto.surrogate.getAway_points();
        }
        if ((i2 & 64) != 0) {
            i = eventMDLiveDataBackupDto.surrogate.getPeriod();
        }
        if ((i2 & 128) != 0) {
            str5 = eventMDLiveDataBackupDto.surrogate.getPeriod_type();
        }
        if ((i2 & 256) != 0) {
            str6 = eventMDLiveDataBackupDto.surrogate.getPeriod_remaining_time();
        }
        if ((i2 & 512) != 0) {
            str7 = eventMDLiveDataBackupDto.surrogate.getDisplay_label();
        }
        String str8 = str6;
        String str9 = str7;
        int i3 = i;
        String str10 = str5;
        String str11 = str4;
        Integer num3 = num2;
        return eventMDLiveDataBackupDto.copy(str, str2, str3, num, str11, num3, i3, str10, str8, str9);
    }

    public final EventMDLiveDataBackupDto copy(String status, String start_ts, String home_id, Integer home_points, String away_id, Integer away_points, int period, String period_type, String period_remaining_time, String display_label) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(start_ts, "start_ts");
        Intrinsics.checkNotNullParameter(home_id, "home_id");
        Intrinsics.checkNotNullParameter(away_id, "away_id");
        Intrinsics.checkNotNullParameter(period_type, "period_type");
        Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
        Intrinsics.checkNotNullParameter(display_label, "display_label");
        return new EventMDLiveDataBackupDto(new Surrogate(status, start_ts, home_id, home_points, away_id, away_points, period, period_type, period_remaining_time, display_label));
    }

    @Override // com.robinhood.idl.Dto
    public EventMDLiveDataBackup toProto() {
        return new EventMDLiveDataBackup(this.surrogate.getStatus(), this.surrogate.getStart_ts(), this.surrogate.getHome_id(), this.surrogate.getHome_points(), this.surrogate.getAway_id(), this.surrogate.getAway_points(), this.surrogate.getPeriod(), this.surrogate.getPeriod_type(), this.surrogate.getPeriod_remaining_time(), this.surrogate.getDisplay_label(), null, 1024, null);
    }

    public String toString() {
        return "[EventMDLiveDataBackupDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventMDLiveDataBackupDto) && Intrinsics.areEqual(((EventMDLiveDataBackupDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventMDLiveDataBackupDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u009c\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u001f\u00103\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0002\u0010!J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u001f\u00105\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0002\u0010!J\u0018\u00106\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J£\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0007HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001J%\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR/\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR/\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010!R+\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001aR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001a¨\u0006K"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;", "", "status", "", "start_ts", "home_id", "home_points", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "away_id", "away_points", "period", "period_type", "period_remaining_time", "display_label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStatus$annotations", "()V", "getStatus", "()Ljava/lang/String;", "getStart_ts$annotations", "getStart_ts", "getHome_id$annotations", "getHome_id", "getHome_points$annotations", "getHome_points", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAway_id$annotations", "getAway_id", "getAway_points$annotations", "getAway_points", "getPeriod$annotations", "getPeriod", "()I", "getPeriod_type$annotations", "getPeriod_type", "getPeriod_remaining_time$annotations", "getPeriod_remaining_time", "getDisplay_label$annotations", "getDisplay_label", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String away_id;
        private final Integer away_points;
        private final String display_label;
        private final String home_id;
        private final Integer home_points;
        private final int period;
        private final String period_remaining_time;
        private final String period_type;
        private final String start_ts;
        private final String status;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, 0, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.status;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.start_ts;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.home_id;
            }
            if ((i2 & 8) != 0) {
                num = surrogate.home_points;
            }
            if ((i2 & 16) != 0) {
                str4 = surrogate.away_id;
            }
            if ((i2 & 32) != 0) {
                num2 = surrogate.away_points;
            }
            if ((i2 & 64) != 0) {
                i = surrogate.period;
            }
            if ((i2 & 128) != 0) {
                str5 = surrogate.period_type;
            }
            if ((i2 & 256) != 0) {
                str6 = surrogate.period_remaining_time;
            }
            if ((i2 & 512) != 0) {
                str7 = surrogate.display_label;
            }
            String str8 = str6;
            String str9 = str7;
            int i3 = i;
            String str10 = str5;
            String str11 = str4;
            Integer num3 = num2;
            return surrogate.copy(str, str2, str3, num, str11, num3, i3, str10, str8, str9);
        }

        @SerialName("awayId")
        @JsonAnnotations2(names = {"away_id"})
        public static /* synthetic */ void getAway_id$annotations() {
        }

        @SerialName("awayPoints")
        @JsonAnnotations2(names = {"away_points"})
        public static /* synthetic */ void getAway_points$annotations() {
        }

        @SerialName("displayLabel")
        @JsonAnnotations2(names = {"display_label"})
        public static /* synthetic */ void getDisplay_label$annotations() {
        }

        @SerialName("homeId")
        @JsonAnnotations2(names = {"home_id"})
        public static /* synthetic */ void getHome_id$annotations() {
        }

        @SerialName("homePoints")
        @JsonAnnotations2(names = {"home_points"})
        public static /* synthetic */ void getHome_points$annotations() {
        }

        @SerialName("period")
        @JsonAnnotations2(names = {"period"})
        public static /* synthetic */ void getPeriod$annotations() {
        }

        @SerialName("periodRemainingTime")
        @JsonAnnotations2(names = {"period_remaining_time"})
        public static /* synthetic */ void getPeriod_remaining_time$annotations() {
        }

        @SerialName("periodType")
        @JsonAnnotations2(names = {"period_type"})
        public static /* synthetic */ void getPeriod_type$annotations() {
        }

        @SerialName("startTs")
        @JsonAnnotations2(names = {"start_ts"})
        public static /* synthetic */ void getStart_ts$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDisplay_label() {
            return this.display_label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStart_ts() {
            return this.start_ts;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHome_id() {
            return this.home_id;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getHome_points() {
            return this.home_points;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAway_id() {
            return this.away_id;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getAway_points() {
            return this.away_points;
        }

        /* renamed from: component7, reason: from getter */
        public final int getPeriod() {
            return this.period;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPeriod_type() {
            return this.period_type;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPeriod_remaining_time() {
            return this.period_remaining_time;
        }

        public final Surrogate copy(String status, String start_ts, String home_id, Integer home_points, String away_id, Integer away_points, int period, String period_type, String period_remaining_time, String display_label) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(start_ts, "start_ts");
            Intrinsics.checkNotNullParameter(home_id, "home_id");
            Intrinsics.checkNotNullParameter(away_id, "away_id");
            Intrinsics.checkNotNullParameter(period_type, "period_type");
            Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
            Intrinsics.checkNotNullParameter(display_label, "display_label");
            return new Surrogate(status, start_ts, home_id, home_points, away_id, away_points, period, period_type, period_remaining_time, display_label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.start_ts, surrogate.start_ts) && Intrinsics.areEqual(this.home_id, surrogate.home_id) && Intrinsics.areEqual(this.home_points, surrogate.home_points) && Intrinsics.areEqual(this.away_id, surrogate.away_id) && Intrinsics.areEqual(this.away_points, surrogate.away_points) && this.period == surrogate.period && Intrinsics.areEqual(this.period_type, surrogate.period_type) && Intrinsics.areEqual(this.period_remaining_time, surrogate.period_remaining_time) && Intrinsics.areEqual(this.display_label, surrogate.display_label);
        }

        public int hashCode() {
            int iHashCode = ((((this.status.hashCode() * 31) + this.start_ts.hashCode()) * 31) + this.home_id.hashCode()) * 31;
            Integer num = this.home_points;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.away_id.hashCode()) * 31;
            Integer num2 = this.away_points;
            return ((((((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.period)) * 31) + this.period_type.hashCode()) * 31) + this.period_remaining_time.hashCode()) * 31) + this.display_label.hashCode();
        }

        public String toString() {
            return "Surrogate(status=" + this.status + ", start_ts=" + this.start_ts + ", home_id=" + this.home_id + ", home_points=" + this.home_points + ", away_id=" + this.away_id + ", away_points=" + this.away_points + ", period=" + this.period + ", period_type=" + this.period_type + ", period_remaining_time=" + this.period_remaining_time + ", display_label=" + this.display_label + ")";
        }

        /* compiled from: EventMDLiveDataBackupDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventMDLiveDataBackupDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, int i2, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.status = "";
            } else {
                this.status = str;
            }
            if ((i & 2) == 0) {
                this.start_ts = "";
            } else {
                this.start_ts = str2;
            }
            if ((i & 4) == 0) {
                this.home_id = "";
            } else {
                this.home_id = str3;
            }
            if ((i & 8) == 0) {
                this.home_points = null;
            } else {
                this.home_points = num;
            }
            if ((i & 16) == 0) {
                this.away_id = "";
            } else {
                this.away_id = str4;
            }
            if ((i & 32) == 0) {
                this.away_points = null;
            } else {
                this.away_points = num2;
            }
            if ((i & 64) == 0) {
                this.period = 0;
            } else {
                this.period = i2;
            }
            if ((i & 128) == 0) {
                this.period_type = "";
            } else {
                this.period_type = str5;
            }
            if ((i & 256) == 0) {
                this.period_remaining_time = "";
            } else {
                this.period_remaining_time = str6;
            }
            if ((i & 512) == 0) {
                this.display_label = "";
            } else {
                this.display_label = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 0, self.status);
            }
            if (!Intrinsics.areEqual(self.start_ts, "")) {
                output.encodeStringElement(serialDesc, 1, self.start_ts);
            }
            if (!Intrinsics.areEqual(self.home_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.home_id);
            }
            Integer num = self.home_points;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            if (!Intrinsics.areEqual(self.away_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.away_id);
            }
            Integer num2 = self.away_points;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, num2);
            }
            int i = self.period;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.period_type, "")) {
                output.encodeStringElement(serialDesc, 7, self.period_type);
            }
            if (!Intrinsics.areEqual(self.period_remaining_time, "")) {
                output.encodeStringElement(serialDesc, 8, self.period_remaining_time);
            }
            if (Intrinsics.areEqual(self.display_label, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.display_label);
        }

        public Surrogate(String status, String start_ts, String home_id, Integer num, String away_id, Integer num2, int i, String period_type, String period_remaining_time, String display_label) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(start_ts, "start_ts");
            Intrinsics.checkNotNullParameter(home_id, "home_id");
            Intrinsics.checkNotNullParameter(away_id, "away_id");
            Intrinsics.checkNotNullParameter(period_type, "period_type");
            Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
            Intrinsics.checkNotNullParameter(display_label, "display_label");
            this.status = status;
            this.start_ts = start_ts;
            this.home_id = home_id;
            this.home_points = num;
            this.away_id = away_id;
            this.away_points = num2;
            this.period = i;
            this.period_type = period_type;
            this.period_remaining_time = period_remaining_time;
            this.display_label = display_label;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7);
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getStart_ts() {
            return this.start_ts;
        }

        public final String getHome_id() {
            return this.home_id;
        }

        public final Integer getHome_points() {
            return this.home_points;
        }

        public final String getAway_id() {
            return this.away_id;
        }

        public final Integer getAway_points() {
            return this.away_points;
        }

        public final int getPeriod() {
            return this.period;
        }

        public final String getPeriod_type() {
            return this.period_type;
        }

        public final String getPeriod_remaining_time() {
            return this.period_remaining_time;
        }

        public final String getDisplay_label() {
            return this.display_label;
        }
    }

    /* compiled from: EventMDLiveDataBackupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EventMDLiveDataBackupDto, EventMDLiveDataBackup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventMDLiveDataBackupDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventMDLiveDataBackupDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventMDLiveDataBackupDto> getBinaryBase64Serializer() {
            return (KSerializer) EventMDLiveDataBackupDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventMDLiveDataBackup> getProtoAdapter() {
            return EventMDLiveDataBackup.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventMDLiveDataBackupDto getZeroValue() {
            return EventMDLiveDataBackupDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventMDLiveDataBackupDto fromProto(EventMDLiveDataBackup proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EventMDLiveDataBackupDto(new Surrogate(proto.getStatus(), proto.getStart_ts(), proto.getHome_id(), proto.getHome_points(), proto.getAway_id(), proto.getAway_points(), proto.getPeriod(), proto.getPeriod_type(), proto.getPeriod_remaining_time(), proto.getDisplay_label()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventMDLiveDataBackupDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventMDLiveDataBackupDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventMDLiveDataBackupDto(null, null, null, null, null, null, 0, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventMDLiveDataBackupDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventMDLiveDataBackupDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.EventMDLiveDataBackup", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventMDLiveDataBackupDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventMDLiveDataBackupDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventMDLiveDataBackupDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventMDLiveDataBackupDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackupDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventMDLiveDataBackupDto";
        }
    }
}
