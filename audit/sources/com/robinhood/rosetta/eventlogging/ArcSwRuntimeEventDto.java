package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.UnsignedLongAsStringSerializer;
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

/* compiled from: ArcSwRuntimeEventDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@ABCB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B³\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001dJ°\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\tJ\b\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u00020\tH\u0016J\u0013\u00106\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020\u0015H\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0015H\u0016J\b\u0010?\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u0010\u001b\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001f¨\u0006D"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate;)V", "event_name", "", "event_detail", "event_start_ts", "", "event_end_ts", "cmd_uuid", "author", "os_type", "repository_name", "revision_id", "diff_id", "stack_size", "", "nolint", "", "nounit", "no_rebase", "allow_untracked", "fast_mode", "diff_origin", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZZLjava/lang/String;)V", "getEvent_name", "()Ljava/lang/String;", "getEvent_detail", "getEvent_start_ts", "()J", "getEvent_end_ts", "getCmd_uuid", "getAuthor", "getOs_type", "getRepository_name", "getRevision_id", "getDiff_id", "getStack_size", "()I", "getNolint", "()Z", "getNounit", "getNo_rebase", "getAllow_untracked", "getFast_mode", "getDiff_origin", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ArcSwRuntimeEventDto implements Dto3<ArcSwRuntimeEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ArcSwRuntimeEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ArcSwRuntimeEventDto, ArcSwRuntimeEvent>> binaryBase64Serializer$delegate;
    private static final ArcSwRuntimeEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ArcSwRuntimeEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ArcSwRuntimeEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEvent_name() {
        return this.surrogate.getEvent_name();
    }

    public final String getEvent_detail() {
        return this.surrogate.getEvent_detail();
    }

    public final long getEvent_start_ts() {
        return this.surrogate.getEvent_start_ts();
    }

    public final long getEvent_end_ts() {
        return this.surrogate.getEvent_end_ts();
    }

    public final String getCmd_uuid() {
        return this.surrogate.getCmd_uuid();
    }

    public final String getAuthor() {
        return this.surrogate.getAuthor();
    }

    public final String getOs_type() {
        return this.surrogate.getOs_type();
    }

    public final String getRepository_name() {
        return this.surrogate.getRepository_name();
    }

    public final String getRevision_id() {
        return this.surrogate.getRevision_id();
    }

    public final String getDiff_id() {
        return this.surrogate.getDiff_id();
    }

    public final int getStack_size() {
        return this.surrogate.getStack_size();
    }

    public final boolean getNolint() {
        return this.surrogate.getNolint();
    }

    public final boolean getNounit() {
        return this.surrogate.getNounit();
    }

    public final boolean getNo_rebase() {
        return this.surrogate.getNo_rebase();
    }

    public final boolean getAllow_untracked() {
        return this.surrogate.getAllow_untracked();
    }

    public final boolean getFast_mode() {
        return this.surrogate.getFast_mode();
    }

    public final String getDiff_origin() {
        return this.surrogate.getDiff_origin();
    }

    public /* synthetic */ ArcSwRuntimeEventDto(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? j2 : 0L, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? false : z3, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? false : z5, (i2 & 65536) != 0 ? "" : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcSwRuntimeEventDto(String event_name, String event_detail, long j, long j2, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String diff_origin) {
        this(new Surrogate(event_name, event_detail, j, j2, cmd_uuid, author, os_type, repository_name, revision_id, diff_id, i, z, z2, z3, z4, z5, diff_origin));
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(event_detail, "event_detail");
        Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(os_type, "os_type");
        Intrinsics.checkNotNullParameter(repository_name, "repository_name");
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(diff_id, "diff_id");
        Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
    }

    public static /* synthetic */ ArcSwRuntimeEventDto copy$default(ArcSwRuntimeEventDto arcSwRuntimeEventDto, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, int i2, Object obj) {
        String diff_origin;
        boolean z6;
        String event_name = (i2 & 1) != 0 ? arcSwRuntimeEventDto.surrogate.getEvent_name() : str;
        String event_detail = (i2 & 2) != 0 ? arcSwRuntimeEventDto.surrogate.getEvent_detail() : str2;
        long event_start_ts = (i2 & 4) != 0 ? arcSwRuntimeEventDto.surrogate.getEvent_start_ts() : j;
        long event_end_ts = (i2 & 8) != 0 ? arcSwRuntimeEventDto.surrogate.getEvent_end_ts() : j2;
        String cmd_uuid = (i2 & 16) != 0 ? arcSwRuntimeEventDto.surrogate.getCmd_uuid() : str3;
        String author = (i2 & 32) != 0 ? arcSwRuntimeEventDto.surrogate.getAuthor() : str4;
        String os_type = (i2 & 64) != 0 ? arcSwRuntimeEventDto.surrogate.getOs_type() : str5;
        String repository_name = (i2 & 128) != 0 ? arcSwRuntimeEventDto.surrogate.getRepository_name() : str6;
        String revision_id = (i2 & 256) != 0 ? arcSwRuntimeEventDto.surrogate.getRevision_id() : str7;
        String diff_id = (i2 & 512) != 0 ? arcSwRuntimeEventDto.surrogate.getDiff_id() : str8;
        int stack_size = (i2 & 1024) != 0 ? arcSwRuntimeEventDto.surrogate.getStack_size() : i;
        boolean nolint = (i2 & 2048) != 0 ? arcSwRuntimeEventDto.surrogate.getNolint() : z;
        String str10 = event_name;
        boolean nounit = (i2 & 4096) != 0 ? arcSwRuntimeEventDto.surrogate.getNounit() : z2;
        boolean no_rebase = (i2 & 8192) != 0 ? arcSwRuntimeEventDto.surrogate.getNo_rebase() : z3;
        boolean allow_untracked = (i2 & 16384) != 0 ? arcSwRuntimeEventDto.surrogate.getAllow_untracked() : z4;
        boolean fast_mode = (i2 & 32768) != 0 ? arcSwRuntimeEventDto.surrogate.getFast_mode() : z5;
        if ((i2 & 65536) != 0) {
            z6 = fast_mode;
            diff_origin = arcSwRuntimeEventDto.surrogate.getDiff_origin();
        } else {
            diff_origin = str9;
            z6 = fast_mode;
        }
        return arcSwRuntimeEventDto.copy(str10, event_detail, event_start_ts, event_end_ts, cmd_uuid, author, os_type, repository_name, revision_id, diff_id, stack_size, nolint, nounit, no_rebase, allow_untracked, z6, diff_origin);
    }

    public final ArcSwRuntimeEventDto copy(String event_name, String event_detail, long event_start_ts, long event_end_ts, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int stack_size, boolean nolint, boolean nounit, boolean no_rebase, boolean allow_untracked, boolean fast_mode, String diff_origin) {
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(event_detail, "event_detail");
        Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(os_type, "os_type");
        Intrinsics.checkNotNullParameter(repository_name, "repository_name");
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(diff_id, "diff_id");
        Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
        return new ArcSwRuntimeEventDto(new Surrogate(event_name, event_detail, event_start_ts, event_end_ts, cmd_uuid, author, os_type, repository_name, revision_id, diff_id, stack_size, nolint, nounit, no_rebase, allow_untracked, fast_mode, diff_origin));
    }

    @Override // com.robinhood.idl.Dto
    public ArcSwRuntimeEvent toProto() {
        return new ArcSwRuntimeEvent(this.surrogate.getEvent_name(), this.surrogate.getEvent_detail(), this.surrogate.getEvent_start_ts(), this.surrogate.getEvent_end_ts(), this.surrogate.getCmd_uuid(), this.surrogate.getAuthor(), this.surrogate.getOs_type(), this.surrogate.getRepository_name(), this.surrogate.getRevision_id(), this.surrogate.getDiff_id(), this.surrogate.getStack_size(), this.surrogate.getNolint(), this.surrogate.getNounit(), this.surrogate.getNo_rebase(), this.surrogate.getAllow_untracked(), this.surrogate.getFast_mode(), this.surrogate.getDiff_origin(), null, 131072, null);
    }

    public String toString() {
        return "[ArcSwRuntimeEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ArcSwRuntimeEventDto) && Intrinsics.areEqual(((ArcSwRuntimeEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ArcSwRuntimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002fgBÞ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cBµ\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010 J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0018\u0010J\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010K\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0018\u0010R\u001a\u00110\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0013HÆ\u0003J\t\u0010S\u001a\u00020\u0015HÆ\u0003J\t\u0010T\u001a\u00020\u0015HÆ\u0003J\t\u0010U\u001a\u00020\u0015HÆ\u0003J\t\u0010V\u001a\u00020\u0015HÆ\u0003J\t\u0010W\u001a\u00020\u0015HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003Jà\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0017\b\u0002\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Z\u001a\u00020\u00152\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u0012HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001J%\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0001¢\u0006\u0002\beR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R+\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\"\u001a\u0004\b+\u0010)R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\"\u001a\u0004\b5\u0010$R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\"\u001a\u0004\b7\u0010$R+\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\"\u001a\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010\"\u001a\u0004\b<\u0010=R\u001c\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\"\u001a\u0004\b?\u0010=R\u001c\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\"\u001a\u0004\bA\u0010=R\u001c\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\"\u001a\u0004\bC\u0010=R\u001c\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\"\u001a\u0004\bE\u0010=R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010\"\u001a\u0004\bG\u0010$¨\u0006h"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate;", "", "event_name", "", "event_detail", "event_start_ts", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt64Serializer;", "event_end_ts", "cmd_uuid", "author", "os_type", "repository_name", "revision_id", "diff_id", "stack_size", "", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "nolint", "", "nounit", "no_rebase", "allow_untracked", "fast_mode", "diff_origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZZLjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent_name$annotations", "()V", "getEvent_name", "()Ljava/lang/String;", "getEvent_detail$annotations", "getEvent_detail", "getEvent_start_ts$annotations", "getEvent_start_ts", "()J", "getEvent_end_ts$annotations", "getEvent_end_ts", "getCmd_uuid$annotations", "getCmd_uuid", "getAuthor$annotations", "getAuthor", "getOs_type$annotations", "getOs_type", "getRepository_name$annotations", "getRepository_name", "getRevision_id$annotations", "getRevision_id", "getDiff_id$annotations", "getDiff_id", "getStack_size$annotations", "getStack_size", "()I", "getNolint$annotations", "getNolint", "()Z", "getNounit$annotations", "getNounit", "getNo_rebase$annotations", "getNo_rebase", "getAllow_untracked$annotations", "getAllow_untracked", "getFast_mode$annotations", "getFast_mode", "getDiff_origin$annotations", "getDiff_origin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean allow_untracked;
        private final String author;
        private final String cmd_uuid;
        private final String diff_id;
        private final String diff_origin;
        private final String event_detail;
        private final long event_end_ts;
        private final String event_name;
        private final long event_start_ts;
        private final boolean fast_mode;
        private final boolean no_rebase;
        private final boolean nolint;
        private final boolean nounit;
        private final String os_type;
        private final String repository_name;
        private final String revision_id;
        private final int stack_size;

        public Surrogate() {
            this((String) null, (String) null, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, false, false, false, false, (String) null, 131071, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, int i2, Object obj) {
            String str10;
            boolean z6;
            String str11 = (i2 & 1) != 0 ? surrogate.event_name : str;
            String str12 = (i2 & 2) != 0 ? surrogate.event_detail : str2;
            long j3 = (i2 & 4) != 0 ? surrogate.event_start_ts : j;
            long j4 = (i2 & 8) != 0 ? surrogate.event_end_ts : j2;
            String str13 = (i2 & 16) != 0 ? surrogate.cmd_uuid : str3;
            String str14 = (i2 & 32) != 0 ? surrogate.author : str4;
            String str15 = (i2 & 64) != 0 ? surrogate.os_type : str5;
            String str16 = (i2 & 128) != 0 ? surrogate.repository_name : str6;
            String str17 = (i2 & 256) != 0 ? surrogate.revision_id : str7;
            String str18 = (i2 & 512) != 0 ? surrogate.diff_id : str8;
            int i3 = (i2 & 1024) != 0 ? surrogate.stack_size : i;
            boolean z7 = (i2 & 2048) != 0 ? surrogate.nolint : z;
            String str19 = str11;
            boolean z8 = (i2 & 4096) != 0 ? surrogate.nounit : z2;
            boolean z9 = (i2 & 8192) != 0 ? surrogate.no_rebase : z3;
            boolean z10 = (i2 & 16384) != 0 ? surrogate.allow_untracked : z4;
            boolean z11 = (i2 & 32768) != 0 ? surrogate.fast_mode : z5;
            if ((i2 & 65536) != 0) {
                z6 = z11;
                str10 = surrogate.diff_origin;
            } else {
                str10 = str9;
                z6 = z11;
            }
            return surrogate.copy(str19, str12, j3, j4, str13, str14, str15, str16, str17, str18, i3, z7, z8, z9, z10, z6, str10);
        }

        @SerialName("allowUntracked")
        @JsonAnnotations2(names = {"allow_untracked"})
        public static /* synthetic */ void getAllow_untracked$annotations() {
        }

        @SerialName("author")
        @JsonAnnotations2(names = {"author"})
        public static /* synthetic */ void getAuthor$annotations() {
        }

        @SerialName("cmdUuid")
        @JsonAnnotations2(names = {"cmd_uuid"})
        public static /* synthetic */ void getCmd_uuid$annotations() {
        }

        @SerialName("diffId")
        @JsonAnnotations2(names = {"diff_id"})
        public static /* synthetic */ void getDiff_id$annotations() {
        }

        @SerialName("diffOrigin")
        @JsonAnnotations2(names = {"diff_origin"})
        public static /* synthetic */ void getDiff_origin$annotations() {
        }

        @SerialName("eventDetail")
        @JsonAnnotations2(names = {"event_detail"})
        public static /* synthetic */ void getEvent_detail$annotations() {
        }

        @SerialName("eventEndTs")
        @JsonAnnotations2(names = {"event_end_ts"})
        public static /* synthetic */ void getEvent_end_ts$annotations() {
        }

        @SerialName("eventName")
        @JsonAnnotations2(names = {"event_name"})
        public static /* synthetic */ void getEvent_name$annotations() {
        }

        @SerialName("eventStartTs")
        @JsonAnnotations2(names = {"event_start_ts"})
        public static /* synthetic */ void getEvent_start_ts$annotations() {
        }

        @SerialName("fastMode")
        @JsonAnnotations2(names = {"fast_mode"})
        public static /* synthetic */ void getFast_mode$annotations() {
        }

        @SerialName("noRebase")
        @JsonAnnotations2(names = {"no_rebase"})
        public static /* synthetic */ void getNo_rebase$annotations() {
        }

        @SerialName("nolint")
        @JsonAnnotations2(names = {"nolint"})
        public static /* synthetic */ void getNolint$annotations() {
        }

        @SerialName("nounit")
        @JsonAnnotations2(names = {"nounit"})
        public static /* synthetic */ void getNounit$annotations() {
        }

        @SerialName("osType")
        @JsonAnnotations2(names = {"os_type"})
        public static /* synthetic */ void getOs_type$annotations() {
        }

        @SerialName("repositoryName")
        @JsonAnnotations2(names = {"repository_name"})
        public static /* synthetic */ void getRepository_name$annotations() {
        }

        @SerialName("revisionId")
        @JsonAnnotations2(names = {"revision_id"})
        public static /* synthetic */ void getRevision_id$annotations() {
        }

        @SerialName("stackSize")
        @JsonAnnotations2(names = {"stack_size"})
        public static /* synthetic */ void getStack_size$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEvent_name() {
            return this.event_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDiff_id() {
            return this.diff_id;
        }

        /* renamed from: component11, reason: from getter */
        public final int getStack_size() {
            return this.stack_size;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getNolint() {
            return this.nolint;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getNounit() {
            return this.nounit;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getNo_rebase() {
            return this.no_rebase;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getAllow_untracked() {
            return this.allow_untracked;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getFast_mode() {
            return this.fast_mode;
        }

        /* renamed from: component17, reason: from getter */
        public final String getDiff_origin() {
            return this.diff_origin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_detail() {
            return this.event_detail;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEvent_start_ts() {
            return this.event_start_ts;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEvent_end_ts() {
            return this.event_end_ts;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCmd_uuid() {
            return this.cmd_uuid;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAuthor() {
            return this.author;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOs_type() {
            return this.os_type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRepository_name() {
            return this.repository_name;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRevision_id() {
            return this.revision_id;
        }

        public final Surrogate copy(String event_name, String event_detail, long event_start_ts, long event_end_ts, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int stack_size, boolean nolint, boolean nounit, boolean no_rebase, boolean allow_untracked, boolean fast_mode, String diff_origin) {
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(event_detail, "event_detail");
            Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(os_type, "os_type");
            Intrinsics.checkNotNullParameter(repository_name, "repository_name");
            Intrinsics.checkNotNullParameter(revision_id, "revision_id");
            Intrinsics.checkNotNullParameter(diff_id, "diff_id");
            Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
            return new Surrogate(event_name, event_detail, event_start_ts, event_end_ts, cmd_uuid, author, os_type, repository_name, revision_id, diff_id, stack_size, nolint, nounit, no_rebase, allow_untracked, fast_mode, diff_origin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.event_name, surrogate.event_name) && Intrinsics.areEqual(this.event_detail, surrogate.event_detail) && this.event_start_ts == surrogate.event_start_ts && this.event_end_ts == surrogate.event_end_ts && Intrinsics.areEqual(this.cmd_uuid, surrogate.cmd_uuid) && Intrinsics.areEqual(this.author, surrogate.author) && Intrinsics.areEqual(this.os_type, surrogate.os_type) && Intrinsics.areEqual(this.repository_name, surrogate.repository_name) && Intrinsics.areEqual(this.revision_id, surrogate.revision_id) && Intrinsics.areEqual(this.diff_id, surrogate.diff_id) && this.stack_size == surrogate.stack_size && this.nolint == surrogate.nolint && this.nounit == surrogate.nounit && this.no_rebase == surrogate.no_rebase && this.allow_untracked == surrogate.allow_untracked && this.fast_mode == surrogate.fast_mode && Intrinsics.areEqual(this.diff_origin, surrogate.diff_origin);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.event_name.hashCode() * 31) + this.event_detail.hashCode()) * 31) + Long.hashCode(this.event_start_ts)) * 31) + Long.hashCode(this.event_end_ts)) * 31) + this.cmd_uuid.hashCode()) * 31) + this.author.hashCode()) * 31) + this.os_type.hashCode()) * 31) + this.repository_name.hashCode()) * 31) + this.revision_id.hashCode()) * 31) + this.diff_id.hashCode()) * 31) + Integer.hashCode(this.stack_size)) * 31) + java.lang.Boolean.hashCode(this.nolint)) * 31) + java.lang.Boolean.hashCode(this.nounit)) * 31) + java.lang.Boolean.hashCode(this.no_rebase)) * 31) + java.lang.Boolean.hashCode(this.allow_untracked)) * 31) + java.lang.Boolean.hashCode(this.fast_mode)) * 31) + this.diff_origin.hashCode();
        }

        public String toString() {
            return "Surrogate(event_name=" + this.event_name + ", event_detail=" + this.event_detail + ", event_start_ts=" + this.event_start_ts + ", event_end_ts=" + this.event_end_ts + ", cmd_uuid=" + this.cmd_uuid + ", author=" + this.author + ", os_type=" + this.os_type + ", repository_name=" + this.repository_name + ", revision_id=" + this.revision_id + ", diff_id=" + this.diff_id + ", stack_size=" + this.stack_size + ", nolint=" + this.nolint + ", nounit=" + this.nounit + ", no_rebase=" + this.no_rebase + ", allow_untracked=" + this.allow_untracked + ", fast_mode=" + this.fast_mode + ", diff_origin=" + this.diff_origin + ")";
        }

        /* compiled from: ArcSwRuntimeEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ArcSwRuntimeEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.event_name = "";
            } else {
                this.event_name = str;
            }
            if ((i & 2) == 0) {
                this.event_detail = "";
            } else {
                this.event_detail = str2;
            }
            if ((i & 4) == 0) {
                this.event_start_ts = 0L;
            } else {
                this.event_start_ts = j;
            }
            if ((i & 8) == 0) {
                this.event_end_ts = 0L;
            } else {
                this.event_end_ts = j2;
            }
            if ((i & 16) == 0) {
                this.cmd_uuid = "";
            } else {
                this.cmd_uuid = str3;
            }
            if ((i & 32) == 0) {
                this.author = "";
            } else {
                this.author = str4;
            }
            if ((i & 64) == 0) {
                this.os_type = "";
            } else {
                this.os_type = str5;
            }
            if ((i & 128) == 0) {
                this.repository_name = "";
            } else {
                this.repository_name = str6;
            }
            if ((i & 256) == 0) {
                this.revision_id = "";
            } else {
                this.revision_id = str7;
            }
            if ((i & 512) == 0) {
                this.diff_id = "";
            } else {
                this.diff_id = str8;
            }
            if ((i & 1024) == 0) {
                this.stack_size = 0;
            } else {
                this.stack_size = i2;
            }
            if ((i & 2048) == 0) {
                this.nolint = false;
            } else {
                this.nolint = z;
            }
            if ((i & 4096) == 0) {
                this.nounit = false;
            } else {
                this.nounit = z2;
            }
            if ((i & 8192) == 0) {
                this.no_rebase = false;
            } else {
                this.no_rebase = z3;
            }
            if ((i & 16384) == 0) {
                this.allow_untracked = false;
            } else {
                this.allow_untracked = z4;
            }
            if ((32768 & i) == 0) {
                this.fast_mode = false;
            } else {
                this.fast_mode = z5;
            }
            if ((i & 65536) == 0) {
                this.diff_origin = "";
            } else {
                this.diff_origin = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.event_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.event_name);
            }
            if (!Intrinsics.areEqual(self.event_detail, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_detail);
            }
            long j = self.event_start_ts;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.event_end_ts;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            if (!Intrinsics.areEqual(self.cmd_uuid, "")) {
                output.encodeStringElement(serialDesc, 4, self.cmd_uuid);
            }
            if (!Intrinsics.areEqual(self.author, "")) {
                output.encodeStringElement(serialDesc, 5, self.author);
            }
            if (!Intrinsics.areEqual(self.os_type, "")) {
                output.encodeStringElement(serialDesc, 6, self.os_type);
            }
            if (!Intrinsics.areEqual(self.repository_name, "")) {
                output.encodeStringElement(serialDesc, 7, self.repository_name);
            }
            if (!Intrinsics.areEqual(self.revision_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.revision_id);
            }
            if (!Intrinsics.areEqual(self.diff_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.diff_id);
            }
            int i = self.stack_size;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 10, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            boolean z = self.nolint;
            if (z) {
                output.encodeBooleanElement(serialDesc, 11, z);
            }
            boolean z2 = self.nounit;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 12, z2);
            }
            boolean z3 = self.no_rebase;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 13, z3);
            }
            boolean z4 = self.allow_untracked;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 14, z4);
            }
            boolean z5 = self.fast_mode;
            if (z5) {
                output.encodeBooleanElement(serialDesc, 15, z5);
            }
            if (Intrinsics.areEqual(self.diff_origin, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 16, self.diff_origin);
        }

        public Surrogate(String event_name, String event_detail, long j, long j2, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String diff_origin) {
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(event_detail, "event_detail");
            Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(os_type, "os_type");
            Intrinsics.checkNotNullParameter(repository_name, "repository_name");
            Intrinsics.checkNotNullParameter(revision_id, "revision_id");
            Intrinsics.checkNotNullParameter(diff_id, "diff_id");
            Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
            this.event_name = event_name;
            this.event_detail = event_detail;
            this.event_start_ts = j;
            this.event_end_ts = j2;
            this.cmd_uuid = cmd_uuid;
            this.author = author;
            this.os_type = os_type;
            this.repository_name = repository_name;
            this.revision_id = revision_id;
            this.diff_id = diff_id;
            this.stack_size = i;
            this.nolint = z;
            this.nounit = z2;
            this.no_rebase = z3;
            this.allow_untracked = z4;
            this.fast_mode = z5;
            this.diff_origin = diff_origin;
        }

        public /* synthetic */ Surrogate(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? j2 : 0L, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? false : z3, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? false : z5, (i2 & 65536) != 0 ? "" : str9);
        }

        public final String getEvent_name() {
            return this.event_name;
        }

        public final String getEvent_detail() {
            return this.event_detail;
        }

        public final long getEvent_start_ts() {
            return this.event_start_ts;
        }

        public final long getEvent_end_ts() {
            return this.event_end_ts;
        }

        public final String getCmd_uuid() {
            return this.cmd_uuid;
        }

        public final String getAuthor() {
            return this.author;
        }

        public final String getOs_type() {
            return this.os_type;
        }

        public final String getRepository_name() {
            return this.repository_name;
        }

        public final String getRevision_id() {
            return this.revision_id;
        }

        public final String getDiff_id() {
            return this.diff_id;
        }

        public final int getStack_size() {
            return this.stack_size;
        }

        public final boolean getNolint() {
            return this.nolint;
        }

        public final boolean getNounit() {
            return this.nounit;
        }

        public final boolean getNo_rebase() {
            return this.no_rebase;
        }

        public final boolean getAllow_untracked() {
            return this.allow_untracked;
        }

        public final boolean getFast_mode() {
            return this.fast_mode;
        }

        public final String getDiff_origin() {
            return this.diff_origin;
        }
    }

    /* compiled from: ArcSwRuntimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto;", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ArcSwRuntimeEventDto, ArcSwRuntimeEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ArcSwRuntimeEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ArcSwRuntimeEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ArcSwRuntimeEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ArcSwRuntimeEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ArcSwRuntimeEvent> getProtoAdapter() {
            return ArcSwRuntimeEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ArcSwRuntimeEventDto getZeroValue() {
            return ArcSwRuntimeEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ArcSwRuntimeEventDto fromProto(ArcSwRuntimeEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ArcSwRuntimeEventDto(new Surrogate(proto.getEvent_name(), proto.getEvent_detail(), proto.getEvent_start_ts(), proto.getEvent_end_ts(), proto.getCmd_uuid(), proto.getAuthor(), proto.getOs_type(), proto.getRepository_name(), proto.getRevision_id(), proto.getDiff_id(), proto.getStack_size(), proto.getNolint(), proto.getNounit(), proto.getNo_rebase(), proto.getAllow_untracked(), proto.getFast_mode(), proto.getDiff_origin()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ArcSwRuntimeEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ArcSwRuntimeEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ArcSwRuntimeEventDto(null, null, 0L, 0L, null, null, null, null, null, null, 0, false, false, false, false, false, null, 131071, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ArcSwRuntimeEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ArcSwRuntimeEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ArcSwRuntimeEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ArcSwRuntimeEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ArcSwRuntimeEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ArcSwRuntimeEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ArcSwRuntimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ArcSwRuntimeEventDto";
        }
    }
}
