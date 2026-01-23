package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.PredictionMapDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PredictionMapDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0013Jn\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015¨\u00062"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/PredictionMap;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate;)V", "db_version_date", "", "role", "message_type", "account_signals", "", "message", "verbose_msg", "metadata", "", "reference_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getDb_version_date", "()Ljava/lang/String;", "getRole", "getMessage_type", "getAccount_signals", "()Ljava/util/List;", "getMessage", "getVerbose_msg", "getMetadata", "()Ljava/util/Map;", "getReference_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class PredictionMapDto implements Dto3<PredictionMap>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PredictionMapDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PredictionMapDto, PredictionMap>> binaryBase64Serializer$delegate;
    private static final PredictionMapDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PredictionMapDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PredictionMapDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDb_version_date() {
        return this.surrogate.getDb_version_date();
    }

    public final String getRole() {
        return this.surrogate.getRole();
    }

    public final String getMessage_type() {
        return this.surrogate.getMessage_type();
    }

    public final List<String> getAccount_signals() {
        return this.surrogate.getAccount_signals();
    }

    public final String getMessage() {
        return this.surrogate.getMessage();
    }

    public final List<String> getVerbose_msg() {
        return this.surrogate.getVerbose_msg();
    }

    public final Map<String, ?> getMetadata() {
        return this.surrogate.getMetadata();
    }

    public final String getReference_id() {
        return this.surrogate.getReference_id();
    }

    public /* synthetic */ PredictionMapDto(String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : map, (i & 128) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PredictionMapDto(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ?> map, String reference_id) {
        this(new Surrogate(db_version_date, role, message_type, account_signals, message, verbose_msg, map, reference_id));
        Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(account_signals, "account_signals");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
    }

    public static /* synthetic */ PredictionMapDto copy$default(PredictionMapDto predictionMapDto, String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = predictionMapDto.surrogate.getDb_version_date();
        }
        if ((i & 2) != 0) {
            str2 = predictionMapDto.surrogate.getRole();
        }
        if ((i & 4) != 0) {
            str3 = predictionMapDto.surrogate.getMessage_type();
        }
        if ((i & 8) != 0) {
            list = predictionMapDto.surrogate.getAccount_signals();
        }
        if ((i & 16) != 0) {
            str4 = predictionMapDto.surrogate.getMessage();
        }
        if ((i & 32) != 0) {
            list2 = predictionMapDto.surrogate.getVerbose_msg();
        }
        if ((i & 64) != 0) {
            map = predictionMapDto.surrogate.getMetadata();
        }
        if ((i & 128) != 0) {
            str5 = predictionMapDto.surrogate.getReference_id();
        }
        Map map2 = map;
        String str6 = str5;
        String str7 = str4;
        List list3 = list2;
        return predictionMapDto.copy(str, str2, str3, list, str7, list3, map2, str6);
    }

    public final PredictionMapDto copy(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ?> metadata, String reference_id) {
        Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(account_signals, "account_signals");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        return new PredictionMapDto(new Surrogate(db_version_date, role, message_type, account_signals, message, verbose_msg, metadata, reference_id));
    }

    @Override // com.robinhood.idl.Dto
    public PredictionMap toProto() {
        String db_version_date = this.surrogate.getDb_version_date();
        String role = this.surrogate.getRole();
        String message_type = this.surrogate.getMessage_type();
        List<String> account_signals = this.surrogate.getAccount_signals();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_signals, 10));
        Iterator<T> it = account_signals.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String message = this.surrogate.getMessage();
        List<String> verbose_msg = this.surrogate.getVerbose_msg();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(verbose_msg, 10));
        Iterator<T> it2 = verbose_msg.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        return new PredictionMap(db_version_date, role, message_type, arrayList, message, arrayList2, this.surrogate.getMetadata(), this.surrogate.getReference_id(), null, 256, null);
    }

    public String toString() {
        return "[PredictionMapDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PredictionMapDto) && Intrinsics.areEqual(((PredictionMapDto) other).surrogate, this.surrogate);
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
    /* compiled from: PredictionMapDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002ABB\u0082\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012'\b\u0002\u0010\n\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J(\u00101\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0084\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072'\b\u0002\u0010\n\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0013HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010!R;\u0010\n\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a¨\u0006C"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate;", "", "db_version_date", "", "role", "message_type", "account_signals", "", "message", "verbose_msg", "metadata", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "reference_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDb_version_date$annotations", "()V", "getDb_version_date", "()Ljava/lang/String;", "getRole$annotations", "getRole", "getMessage_type$annotations", "getMessage_type", "getAccount_signals$annotations", "getAccount_signals", "()Ljava/util/List;", "getMessage$annotations", "getMessage", "getVerbose_msg$annotations", "getVerbose_msg", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "getReference_id$annotations", "getReference_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> account_signals;
        private final String db_version_date;
        private final String message;
        private final String message_type;
        private final Map<String, Object> metadata;
        private final String reference_id;
        private final String role;
        private final List<String> verbose_msg;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (List) null, (String) null, (List) null, (Map) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.db_version_date;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.role;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.message_type;
            }
            if ((i & 8) != 0) {
                list = surrogate.account_signals;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.message;
            }
            if ((i & 32) != 0) {
                list2 = surrogate.verbose_msg;
            }
            if ((i & 64) != 0) {
                map = surrogate.metadata;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.reference_id;
            }
            Map map2 = map;
            String str6 = str5;
            String str7 = str4;
            List list3 = list2;
            return surrogate.copy(str, str2, str3, list, str7, list3, map2, str6);
        }

        @SerialName("accountSignals")
        @JsonAnnotations2(names = {"account_signals"})
        public static /* synthetic */ void getAccount_signals$annotations() {
        }

        @SerialName("dbVersionDate")
        @JsonAnnotations2(names = {"db_version_date"})
        public static /* synthetic */ void getDb_version_date$annotations() {
        }

        @SerialName("message")
        @JsonAnnotations2(names = {"message"})
        public static /* synthetic */ void getMessage$annotations() {
        }

        @SerialName("messageType")
        @JsonAnnotations2(names = {"message_type"})
        public static /* synthetic */ void getMessage_type$annotations() {
        }

        @SerialName("metadata")
        @JsonAnnotations2(names = {"metadata"})
        public static /* synthetic */ void getMetadata$annotations() {
        }

        @SerialName("referenceId")
        @JsonAnnotations2(names = {"reference_id"})
        public static /* synthetic */ void getReference_id$annotations() {
        }

        @SerialName("role")
        @JsonAnnotations2(names = {"role"})
        public static /* synthetic */ void getRole$annotations() {
        }

        @SerialName("verboseMsg")
        @JsonAnnotations2(names = {"verbose_msg"})
        public static /* synthetic */ void getVerbose_msg$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDb_version_date() {
            return this.db_version_date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage_type() {
            return this.message_type;
        }

        public final List<String> component4() {
            return this.account_signals;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<String> component6() {
            return this.verbose_msg;
        }

        public final Map<String, Object> component7() {
            return this.metadata;
        }

        /* renamed from: component8, reason: from getter */
        public final String getReference_id() {
            return this.reference_id;
        }

        public final Surrogate copy(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ? extends Object> metadata, String reference_id) {
            Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(account_signals, "account_signals");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            return new Surrogate(db_version_date, role, message_type, account_signals, message, verbose_msg, metadata, reference_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.db_version_date, surrogate.db_version_date) && Intrinsics.areEqual(this.role, surrogate.role) && Intrinsics.areEqual(this.message_type, surrogate.message_type) && Intrinsics.areEqual(this.account_signals, surrogate.account_signals) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.verbose_msg, surrogate.verbose_msg) && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.reference_id, surrogate.reference_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.db_version_date.hashCode() * 31) + this.role.hashCode()) * 31) + this.message_type.hashCode()) * 31) + this.account_signals.hashCode()) * 31) + this.message.hashCode()) * 31) + this.verbose_msg.hashCode()) * 31;
            Map<String, Object> map = this.metadata;
            return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.reference_id.hashCode();
        }

        public String toString() {
            return "Surrogate(db_version_date=" + this.db_version_date + ", role=" + this.role + ", message_type=" + this.message_type + ", account_signals=" + this.account_signals + ", message=" + this.message + ", verbose_msg=" + this.verbose_msg + ", metadata=" + this.metadata + ", reference_id=" + this.reference_id + ")";
        }

        /* compiled from: PredictionMapDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PredictionMapDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.chatbot.proto.v1.PredictionMapDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PredictionMapDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.chatbot.proto.v1.PredictionMapDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PredictionMapDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.chatbot.proto.v1.PredictionMapDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PredictionMapDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.db_version_date = "";
            } else {
                this.db_version_date = str;
            }
            if ((i & 2) == 0) {
                this.role = "";
            } else {
                this.role = str2;
            }
            if ((i & 4) == 0) {
                this.message_type = "";
            } else {
                this.message_type = str3;
            }
            if ((i & 8) == 0) {
                this.account_signals = CollectionsKt.emptyList();
            } else {
                this.account_signals = list;
            }
            if ((i & 16) == 0) {
                this.message = "";
            } else {
                this.message = str4;
            }
            if ((i & 32) == 0) {
                this.verbose_msg = CollectionsKt.emptyList();
            } else {
                this.verbose_msg = list2;
            }
            if ((i & 64) == 0) {
                this.metadata = null;
            } else {
                this.metadata = map;
            }
            if ((i & 128) == 0) {
                this.reference_id = "";
            } else {
                this.reference_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.db_version_date, "")) {
                output.encodeStringElement(serialDesc, 0, self.db_version_date);
            }
            if (!Intrinsics.areEqual(self.role, "")) {
                output.encodeStringElement(serialDesc, 1, self.role);
            }
            if (!Intrinsics.areEqual(self.message_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.message_type);
            }
            if (!Intrinsics.areEqual(self.account_signals, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.account_signals);
            }
            if (!Intrinsics.areEqual(self.message, "")) {
                output.encodeStringElement(serialDesc, 4, self.message);
            }
            if (!Intrinsics.areEqual(self.verbose_msg, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.verbose_msg);
            }
            if (self.metadata != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.metadata);
            }
            if (Intrinsics.areEqual(self.reference_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.reference_id);
        }

        public Surrogate(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ? extends Object> map, String reference_id) {
            Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(account_signals, "account_signals");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            this.db_version_date = db_version_date;
            this.role = role;
            this.message_type = message_type;
            this.account_signals = account_signals;
            this.message = message;
            this.verbose_msg = verbose_msg;
            this.metadata = map;
            this.reference_id = reference_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : map, (i & 128) != 0 ? "" : str5);
        }

        public final String getDb_version_date() {
            return this.db_version_date;
        }

        public final String getRole() {
            return this.role;
        }

        public final String getMessage_type() {
            return this.message_type;
        }

        public final List<String> getAccount_signals() {
            return this.account_signals;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<String> getVerbose_msg() {
            return this.verbose_msg;
        }

        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public final String getReference_id() {
            return this.reference_id;
        }
    }

    /* compiled from: PredictionMapDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "Lcom/robinhood/chatbot/proto/v1/PredictionMap;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PredictionMapDto, PredictionMap> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PredictionMapDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PredictionMapDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PredictionMapDto> getBinaryBase64Serializer() {
            return (KSerializer) PredictionMapDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PredictionMap> getProtoAdapter() {
            return PredictionMap.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PredictionMapDto getZeroValue() {
            return PredictionMapDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PredictionMapDto fromProto(PredictionMap proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String db_version_date = proto.getDb_version_date();
            String role = proto.getRole();
            String message_type = proto.getMessage_type();
            List<String> account_signals = proto.getAccount_signals();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_signals, 10));
            Iterator<T> it = account_signals.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            String message = proto.getMessage();
            List<String> verbose_msg = proto.getVerbose_msg();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(verbose_msg, 10));
            Iterator<T> it2 = verbose_msg.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            return new PredictionMapDto(new Surrogate(db_version_date, role, message_type, arrayList, message, arrayList2, proto.getMetadata(), proto.getReference_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.PredictionMapDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PredictionMapDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PredictionMapDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PredictionMapDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<PredictionMapDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.PredictionMap", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PredictionMapDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PredictionMapDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PredictionMapDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PredictionMapDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMapDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.PredictionMapDto";
        }
    }
}
