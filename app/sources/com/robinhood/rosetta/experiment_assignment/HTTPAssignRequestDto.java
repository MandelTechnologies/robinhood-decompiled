package com.robinhood.rosetta.experiment_assignment;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.experiment_assignment.HTTPAssignRequestDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: HTTPAssignRequestDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046789B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0017J\u008f\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\tH\u0016J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;)V", "entity_id", "", "names", "", "entity_type", "trigger", "", "userleap", "platform", "app_version", "os_version", "user_origin", "assignment_logging", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getEntity_id", "()Ljava/lang/String;", "getNames", "()Ljava/util/List;", "getEntity_type", "getTrigger", "()Ljava/lang/Boolean;", "getUserleap", "getPlatform", "getApp_version", "getOs_version", "getUser_origin", "getAssignment_logging", "getAccount_type", "getApplication", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class HTTPAssignRequestDto implements Dto3<HTTPAssignRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HTTPAssignRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HTTPAssignRequestDto, HTTPAssignRequest>> binaryBase64Serializer$delegate;
    private static final HTTPAssignRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HTTPAssignRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HTTPAssignRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final List<String> getNames() {
        return this.surrogate.getNames();
    }

    public final String getEntity_type() {
        return this.surrogate.getEntity_type();
    }

    public final Boolean getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final Boolean getUserleap() {
        return this.surrogate.getUserleap();
    }

    public final String getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final String getApp_version() {
        return this.surrogate.getApp_version();
    }

    public final String getOs_version() {
        return this.surrogate.getOs_version();
    }

    public final String getUser_origin() {
        return this.surrogate.getUser_origin();
    }

    public final Boolean getAssignment_logging() {
        return this.surrogate.getAssignment_logging();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getApplication() {
        return this.surrogate.getApplication();
    }

    public /* synthetic */ HTTPAssignRequestDto(String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? bool3 : null, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HTTPAssignRequestDto(String entity_id, List<String> names, String entity_type, Boolean bool, Boolean bool2, String platform, String app_version, String os_version, String user_origin, Boolean bool3, String account_type, String application) {
        this(new Surrogate(entity_id, names, entity_type, bool, bool2, platform, app_version, os_version, user_origin, bool3, account_type, application));
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(user_origin, "user_origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
    }

    public static /* synthetic */ HTTPAssignRequestDto copy$default(HTTPAssignRequestDto hTTPAssignRequestDto, String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTTPAssignRequestDto.surrogate.getEntity_id();
        }
        if ((i & 2) != 0) {
            list = hTTPAssignRequestDto.surrogate.getNames();
        }
        if ((i & 4) != 0) {
            str2 = hTTPAssignRequestDto.surrogate.getEntity_type();
        }
        if ((i & 8) != 0) {
            bool = hTTPAssignRequestDto.surrogate.getTrigger();
        }
        if ((i & 16) != 0) {
            bool2 = hTTPAssignRequestDto.surrogate.getUserleap();
        }
        if ((i & 32) != 0) {
            str3 = hTTPAssignRequestDto.surrogate.getPlatform();
        }
        if ((i & 64) != 0) {
            str4 = hTTPAssignRequestDto.surrogate.getApp_version();
        }
        if ((i & 128) != 0) {
            str5 = hTTPAssignRequestDto.surrogate.getOs_version();
        }
        if ((i & 256) != 0) {
            str6 = hTTPAssignRequestDto.surrogate.getUser_origin();
        }
        if ((i & 512) != 0) {
            bool3 = hTTPAssignRequestDto.surrogate.getAssignment_logging();
        }
        if ((i & 1024) != 0) {
            str7 = hTTPAssignRequestDto.surrogate.getAccount_type();
        }
        if ((i & 2048) != 0) {
            str8 = hTTPAssignRequestDto.surrogate.getApplication();
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        Boolean bool4 = bool3;
        String str12 = str4;
        String str13 = str5;
        Boolean bool5 = bool2;
        String str14 = str3;
        return hTTPAssignRequestDto.copy(str, list, str2, bool, bool5, str14, str12, str13, str11, bool4, str9, str10);
    }

    public final HTTPAssignRequestDto copy(String entity_id, List<String> names, String entity_type, Boolean trigger, Boolean userleap, String platform, String app_version, String os_version, String user_origin, Boolean assignment_logging, String account_type, String application) {
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(user_origin, "user_origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        return new HTTPAssignRequestDto(new Surrogate(entity_id, names, entity_type, trigger, userleap, platform, app_version, os_version, user_origin, assignment_logging, account_type, application));
    }

    @Override // com.robinhood.idl.Dto
    public HTTPAssignRequest toProto() {
        String entity_id = this.surrogate.getEntity_id();
        List<String> names = this.surrogate.getNames();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(names, 10));
        Iterator<T> it = names.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new HTTPAssignRequest(entity_id, arrayList, this.surrogate.getEntity_type(), this.surrogate.getTrigger(), this.surrogate.getUserleap(), this.surrogate.getPlatform(), this.surrogate.getApp_version(), this.surrogate.getOs_version(), this.surrogate.getUser_origin(), this.surrogate.getAssignment_logging(), this.surrogate.getAccount_type(), this.surrogate.getApplication(), null, 4096, null);
    }

    public String toString() {
        return "[HTTPAssignRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HTTPAssignRequestDto) && Intrinsics.areEqual(((HTTPAssignRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: HTTPAssignRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002OPB\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0092\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0014HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J%\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010$\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010$\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010#R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR \u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010$\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010#R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;", "", "entity_id", "", "names", "", "entity_type", "trigger", "", "userleap", "platform", "app_version", "os_version", "user_origin", "assignment_logging", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntity_id$annotations", "()V", "getEntity_id", "()Ljava/lang/String;", "getNames$annotations", "getNames", "()Ljava/util/List;", "getEntity_type$annotations", "getEntity_type", "getTrigger$annotations", "getTrigger", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserleap$annotations", "getUserleap", "getPlatform$annotations", "getPlatform", "getApp_version$annotations", "getApp_version", "getOs_version$annotations", "getOs_version", "getUser_origin$annotations", "getUser_origin", "getAssignment_logging$annotations", "getAssignment_logging", "getAccount_type$annotations", "getAccount_type", "getApplication$annotations", "getApplication", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$experiment_assignment_service_externalRelease", "$serializer", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_type;
        private final String app_version;
        private final String application;
        private final Boolean assignment_logging;
        private final String entity_id;
        private final String entity_type;
        private final List<String> names;
        private final String os_version;
        private final String platform;
        private final Boolean trigger;
        private final String user_origin;
        private final Boolean userleap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.HTTPAssignRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HTTPAssignRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.entity_id;
            }
            if ((i & 2) != 0) {
                list = surrogate.names;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.entity_type;
            }
            if ((i & 8) != 0) {
                bool = surrogate.trigger;
            }
            if ((i & 16) != 0) {
                bool2 = surrogate.userleap;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.platform;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.app_version;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.os_version;
            }
            if ((i & 256) != 0) {
                str6 = surrogate.user_origin;
            }
            if ((i & 512) != 0) {
                bool3 = surrogate.assignment_logging;
            }
            if ((i & 1024) != 0) {
                str7 = surrogate.account_type;
            }
            if ((i & 2048) != 0) {
                str8 = surrogate.application;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str6;
            Boolean bool4 = bool3;
            String str12 = str4;
            String str13 = str5;
            Boolean bool5 = bool2;
            String str14 = str3;
            return surrogate.copy(str, list, str2, bool, bool5, str14, str12, str13, str11, bool4, str9, str10);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("appVersion")
        @JsonAnnotations2(names = {"app_version"})
        public static /* synthetic */ void getApp_version$annotations() {
        }

        @SerialName("application")
        @JsonAnnotations2(names = {"application"})
        public static /* synthetic */ void getApplication$annotations() {
        }

        @SerialName("assignmentLogging")
        @JsonAnnotations2(names = {"assignment_logging"})
        public static /* synthetic */ void getAssignment_logging$annotations() {
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("entityType")
        @JsonAnnotations2(names = {"entity_type"})
        public static /* synthetic */ void getEntity_type$annotations() {
        }

        @SerialName("names")
        @JsonAnnotations2(names = {"names"})
        public static /* synthetic */ void getNames$annotations() {
        }

        @SerialName("osVersion")
        @JsonAnnotations2(names = {"os_version"})
        public static /* synthetic */ void getOs_version$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("userOrigin")
        @JsonAnnotations2(names = {"user_origin"})
        public static /* synthetic */ void getUser_origin$annotations() {
        }

        @SerialName("userleap")
        @JsonAnnotations2(names = {"userleap"})
        public static /* synthetic */ void getUserleap$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntity_id() {
            return this.entity_id;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getAssignment_logging() {
            return this.assignment_logging;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component12, reason: from getter */
        public final String getApplication() {
            return this.application;
        }

        public final List<String> component2() {
            return this.names;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntity_type() {
            return this.entity_type;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getTrigger() {
            return this.trigger;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getUserleap() {
            return this.userleap;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component7, reason: from getter */
        public final String getApp_version() {
            return this.app_version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getOs_version() {
            return this.os_version;
        }

        /* renamed from: component9, reason: from getter */
        public final String getUser_origin() {
            return this.user_origin;
        }

        public final Surrogate copy(String entity_id, List<String> names, String entity_type, Boolean trigger, Boolean userleap, String platform, String app_version, String os_version, String user_origin, Boolean assignment_logging, String account_type, String application) {
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            Intrinsics.checkNotNullParameter(user_origin, "user_origin");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(application, "application");
            return new Surrogate(entity_id, names, entity_type, trigger, userleap, platform, app_version, os_version, user_origin, assignment_logging, account_type, application);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.entity_id, surrogate.entity_id) && Intrinsics.areEqual(this.names, surrogate.names) && Intrinsics.areEqual(this.entity_type, surrogate.entity_type) && Intrinsics.areEqual(this.trigger, surrogate.trigger) && Intrinsics.areEqual(this.userleap, surrogate.userleap) && Intrinsics.areEqual(this.platform, surrogate.platform) && Intrinsics.areEqual(this.app_version, surrogate.app_version) && Intrinsics.areEqual(this.os_version, surrogate.os_version) && Intrinsics.areEqual(this.user_origin, surrogate.user_origin) && Intrinsics.areEqual(this.assignment_logging, surrogate.assignment_logging) && Intrinsics.areEqual(this.account_type, surrogate.account_type) && Intrinsics.areEqual(this.application, surrogate.application);
        }

        public int hashCode() {
            int iHashCode = ((((this.entity_id.hashCode() * 31) + this.names.hashCode()) * 31) + this.entity_type.hashCode()) * 31;
            Boolean bool = this.trigger;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.userleap;
            int iHashCode3 = (((((((((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.app_version.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.user_origin.hashCode()) * 31;
            Boolean bool3 = this.assignment_logging;
            return ((((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.account_type.hashCode()) * 31) + this.application.hashCode();
        }

        public String toString() {
            return "Surrogate(entity_id=" + this.entity_id + ", names=" + this.names + ", entity_type=" + this.entity_type + ", trigger=" + this.trigger + ", userleap=" + this.userleap + ", platform=" + this.platform + ", app_version=" + this.app_version + ", os_version=" + this.os_version + ", user_origin=" + this.user_origin + ", assignment_logging=" + this.assignment_logging + ", account_type=" + this.account_type + ", application=" + this.application + ")";
        }

        /* compiled from: HTTPAssignRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HTTPAssignRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.entity_id = "";
            } else {
                this.entity_id = str;
            }
            if ((i & 2) == 0) {
                this.names = CollectionsKt.emptyList();
            } else {
                this.names = list;
            }
            if ((i & 4) == 0) {
                this.entity_type = "";
            } else {
                this.entity_type = str2;
            }
            if ((i & 8) == 0) {
                this.trigger = null;
            } else {
                this.trigger = bool;
            }
            if ((i & 16) == 0) {
                this.userleap = null;
            } else {
                this.userleap = bool2;
            }
            if ((i & 32) == 0) {
                this.platform = "";
            } else {
                this.platform = str3;
            }
            if ((i & 64) == 0) {
                this.app_version = "";
            } else {
                this.app_version = str4;
            }
            if ((i & 128) == 0) {
                this.os_version = "";
            } else {
                this.os_version = str5;
            }
            if ((i & 256) == 0) {
                this.user_origin = "";
            } else {
                this.user_origin = str6;
            }
            if ((i & 512) == 0) {
                this.assignment_logging = null;
            } else {
                this.assignment_logging = bool3;
            }
            if ((i & 1024) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str7;
            }
            if ((i & 2048) == 0) {
                this.application = "";
            } else {
                this.application = str8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$experiment_assignment_service_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.entity_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.entity_id);
            }
            if (!Intrinsics.areEqual(self.names, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.names);
            }
            if (!Intrinsics.areEqual(self.entity_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.entity_type);
            }
            Boolean bool = self.trigger;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.userleap;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool2);
            }
            if (!Intrinsics.areEqual(self.platform, "")) {
                output.encodeStringElement(serialDesc, 5, self.platform);
            }
            if (!Intrinsics.areEqual(self.app_version, "")) {
                output.encodeStringElement(serialDesc, 6, self.app_version);
            }
            if (!Intrinsics.areEqual(self.os_version, "")) {
                output.encodeStringElement(serialDesc, 7, self.os_version);
            }
            if (!Intrinsics.areEqual(self.user_origin, "")) {
                output.encodeStringElement(serialDesc, 8, self.user_origin);
            }
            Boolean bool3 = self.assignment_logging;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, bool3);
            }
            if (!Intrinsics.areEqual(self.account_type, "")) {
                output.encodeStringElement(serialDesc, 10, self.account_type);
            }
            if (Intrinsics.areEqual(self.application, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 11, self.application);
        }

        public Surrogate(String entity_id, List<String> names, String entity_type, Boolean bool, Boolean bool2, String platform, String app_version, String os_version, String user_origin, Boolean bool3, String account_type, String application) {
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            Intrinsics.checkNotNullParameter(user_origin, "user_origin");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(application, "application");
            this.entity_id = entity_id;
            this.names = names;
            this.entity_type = entity_type;
            this.trigger = bool;
            this.userleap = bool2;
            this.platform = platform;
            this.app_version = app_version;
            this.os_version = os_version;
            this.user_origin = user_origin;
            this.assignment_logging = bool3;
            this.account_type = account_type;
            this.application = application;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? bool3 : null, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8);
        }

        public final String getEntity_id() {
            return this.entity_id;
        }

        public final List<String> getNames() {
            return this.names;
        }

        public final String getEntity_type() {
            return this.entity_type;
        }

        public final Boolean getTrigger() {
            return this.trigger;
        }

        public final Boolean getUserleap() {
            return this.userleap;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getApp_version() {
            return this.app_version;
        }

        public final String getOs_version() {
            return this.os_version;
        }

        public final String getUser_origin() {
            return this.user_origin;
        }

        public final Boolean getAssignment_logging() {
            return this.assignment_logging;
        }

        public final String getAccount_type() {
            return this.account_type;
        }

        public final String getApplication() {
            return this.application;
        }
    }

    /* compiled from: HTTPAssignRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HTTPAssignRequestDto, HTTPAssignRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HTTPAssignRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HTTPAssignRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HTTPAssignRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) HTTPAssignRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HTTPAssignRequest> getProtoAdapter() {
            return HTTPAssignRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HTTPAssignRequestDto getZeroValue() {
            return HTTPAssignRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HTTPAssignRequestDto fromProto(HTTPAssignRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String entity_id = proto.getEntity_id();
            List<String> names = proto.getNames();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(names, 10));
            Iterator<T> it = names.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new HTTPAssignRequestDto(new Surrogate(entity_id, arrayList, proto.getEntity_type(), proto.getTrigger(), proto.getUserleap(), proto.getPlatform(), proto.getApp_version(), proto.getOs_version(), proto.getUser_origin(), proto.getAssignment_logging(), proto.getAccount_type(), proto.getApplication()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.HTTPAssignRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HTTPAssignRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new HTTPAssignRequestDto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HTTPAssignRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HTTPAssignRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.experiment_assignment.service.HTTPAssignRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HTTPAssignRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HTTPAssignRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HTTPAssignRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: HTTPAssignRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.experiment_assignment.HTTPAssignRequestDto";
        }
    }
}
