package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.ArticleSourceDto;
import com.robinhood.copilot.proto.p286v1.DigestItemDto;
import com.robinhood.copilot.proto.p286v1.StrategiesDigestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: StrategiesDigestDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0089\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u008d\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b:\u00103R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;)V", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generated_at", "title", "", "Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "items", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "overview", "period", "next_generation_epoch", "", "portfolio_change_ptc", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;D)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;D)Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "getId", "getAccount_number", "getGenerated_at", "()Lj$/time/Instant;", "getTitle", "getItems", "()Ljava/util/List;", "getSources", "getOverview", "getPeriod", "getNext_generation_epoch", "getPortfolio_change_ptc", "()D", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class StrategiesDigestDto implements Dto3<StrategiesDigest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StrategiesDigestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StrategiesDigestDto, StrategiesDigest>> binaryBase64Serializer$delegate;
    private static final StrategiesDigestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StrategiesDigestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StrategiesDigestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final Instant getGenerated_at() {
        return this.surrogate.getGenerated_at();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<DigestItemDto> getItems() {
        return this.surrogate.getItems();
    }

    public final List<ArticleSourceDto> getSources() {
        return this.surrogate.getSources();
    }

    public final String getOverview() {
        return this.surrogate.getOverview();
    }

    public final String getPeriod() {
        return this.surrogate.getPeriod();
    }

    public final Instant getNext_generation_epoch() {
        return this.surrogate.getNext_generation_epoch();
    }

    public final double getPortfolio_change_ptc() {
        return this.surrogate.getPortfolio_change_ptc();
    }

    public /* synthetic */ StrategiesDigestDto(String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? null : instant2, (i & 512) != 0 ? 0.0d : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StrategiesDigestDto(String id, String account_number, Instant instant, String title, List<DigestItemDto> items, List<ArticleSourceDto> sources, String overview, String period, Instant instant2, double d) {
        this(new Surrogate(id, account_number, instant, title, items, sources, overview, period, instant2, d));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(period, "period");
    }

    public static /* synthetic */ StrategiesDigestDto copy$default(StrategiesDigestDto strategiesDigestDto, String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategiesDigestDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = strategiesDigestDto.surrogate.getAccount_number();
        }
        if ((i & 4) != 0) {
            instant = strategiesDigestDto.surrogate.getGenerated_at();
        }
        if ((i & 8) != 0) {
            str3 = strategiesDigestDto.surrogate.getTitle();
        }
        if ((i & 16) != 0) {
            list = strategiesDigestDto.surrogate.getItems();
        }
        if ((i & 32) != 0) {
            list2 = strategiesDigestDto.surrogate.getSources();
        }
        if ((i & 64) != 0) {
            str4 = strategiesDigestDto.surrogate.getOverview();
        }
        if ((i & 128) != 0) {
            str5 = strategiesDigestDto.surrogate.getPeriod();
        }
        if ((i & 256) != 0) {
            instant2 = strategiesDigestDto.surrogate.getNext_generation_epoch();
        }
        if ((i & 512) != 0) {
            d = strategiesDigestDto.surrogate.getPortfolio_change_ptc();
        }
        double d2 = d;
        String str6 = str5;
        Instant instant3 = instant2;
        List list3 = list2;
        String str7 = str4;
        List list4 = list;
        Instant instant4 = instant;
        return strategiesDigestDto.copy(str, str2, instant4, str3, list4, list3, str7, str6, instant3, d2);
    }

    public final StrategiesDigestDto copy(String id, String account_number, Instant generated_at, String title, List<DigestItemDto> items, List<ArticleSourceDto> sources, String overview, String period, Instant next_generation_epoch, double portfolio_change_ptc) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(period, "period");
        return new StrategiesDigestDto(new Surrogate(id, account_number, generated_at, title, items, sources, overview, period, next_generation_epoch, portfolio_change_ptc));
    }

    @Override // com.robinhood.idl.Dto
    public StrategiesDigest toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        Instant generated_at = this.surrogate.getGenerated_at();
        String title = this.surrogate.getTitle();
        List<DigestItemDto> items = this.surrogate.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((DigestItemDto) it.next()).toProto());
        }
        List<ArticleSourceDto> sources = this.surrogate.getSources();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
        Iterator<T> it2 = sources.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ArticleSourceDto) it2.next()).toProto());
        }
        return new StrategiesDigest(id, account_number, generated_at, title, arrayList, arrayList2, this.surrogate.getOverview(), this.surrogate.getPeriod(), this.surrogate.getNext_generation_epoch(), this.surrogate.getPortfolio_change_ptc(), null, 1024, null);
    }

    public String toString() {
        return "[StrategiesDigestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StrategiesDigestDto) && Intrinsics.areEqual(((StrategiesDigestDto) other).surrogate, this.surrogate);
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
    /* compiled from: StrategiesDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002XWBÒ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0089\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J6\u0010*\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J6\u00102\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b2\u0010+J\u001f\u00103\u001a\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0015HÆ\u0003¢\u0006\u0004\b3\u00104JÛ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u0016\u001a\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0015HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010(J\u0010\u00108\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010(RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010+R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010(R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010.R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010I\u0012\u0004\bM\u0010A\u001a\u0004\bL\u0010.R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010(R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010>\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010(RF\u0010\u0013\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010D\u0012\u0004\bS\u0010A\u001a\u0004\bR\u0010+R/\u0010\u0016\u001a\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010T\u0012\u0004\bV\u0010A\u001a\u0004\bU\u00104¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "generated_at", "title", "", "Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "items", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "overview", "period", "next_generation_epoch", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "portfolio_change_ptc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;D)Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "Lj$/time/Instant;", "getGenerated_at", "getGenerated_at$annotations", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getItems", "getItems$annotations", "getSources", "getSources$annotations", "getOverview", "getOverview$annotations", "getPeriod", "getPeriod$annotations", "getNext_generation_epoch", "getNext_generation_epoch$annotations", "D", "getPortfolio_change_ptc", "getPortfolio_change_ptc$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final Instant generated_at;
        private final String id;
        private final List<DigestItemDto> items;
        private final Instant next_generation_epoch;
        private final String overview;
        private final String period;
        private final double portfolio_change_ptc;
        private final List<ArticleSourceDto> sources;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (String) null, (List) null, (List) null, (String) null, (String) null, (Instant) null, 0.0d, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(DigestItemDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.account_number;
            }
            if ((i & 4) != 0) {
                instant = surrogate.generated_at;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.title;
            }
            if ((i & 16) != 0) {
                list = surrogate.items;
            }
            if ((i & 32) != 0) {
                list2 = surrogate.sources;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.overview;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.period;
            }
            if ((i & 256) != 0) {
                instant2 = surrogate.next_generation_epoch;
            }
            if ((i & 512) != 0) {
                d = surrogate.portfolio_change_ptc;
            }
            double d2 = d;
            String str6 = str5;
            Instant instant3 = instant2;
            List list3 = list2;
            String str7 = str4;
            List list4 = list;
            Instant instant4 = instant;
            return surrogate.copy(str, str2, instant4, str3, list4, list3, str7, str6, instant3, d2);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("generatedAt")
        @JsonAnnotations2(names = {"generated_at"})
        public static /* synthetic */ void getGenerated_at$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("items")
        @JsonAnnotations2(names = {"items"})
        public static /* synthetic */ void getItems$annotations() {
        }

        @SerialName("nextGenerationEpoch")
        @JsonAnnotations2(names = {"next_generation_epoch"})
        public static /* synthetic */ void getNext_generation_epoch$annotations() {
        }

        @SerialName("overview")
        @JsonAnnotations2(names = {"overview"})
        public static /* synthetic */ void getOverview$annotations() {
        }

        @SerialName("period")
        @JsonAnnotations2(names = {"period"})
        public static /* synthetic */ void getPeriod$annotations() {
        }

        @SerialName("portfolioChangePtc")
        @JsonAnnotations2(names = {"portfolio_change_ptc"})
        public static /* synthetic */ void getPortfolio_change_ptc$annotations() {
        }

        @SerialName("sources")
        @JsonAnnotations2(names = {"sources"})
        public static /* synthetic */ void getSources$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final double getPortfolio_change_ptc() {
            return this.portfolio_change_ptc;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getGenerated_at() {
            return this.generated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<DigestItemDto> component5() {
            return this.items;
        }

        public final List<ArticleSourceDto> component6() {
            return this.sources;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOverview() {
            return this.overview;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        /* renamed from: component9, reason: from getter */
        public final Instant getNext_generation_epoch() {
            return this.next_generation_epoch;
        }

        public final Surrogate copy(String id, String account_number, Instant generated_at, String title, List<DigestItemDto> items, List<ArticleSourceDto> sources, String overview, String period, Instant next_generation_epoch, double portfolio_change_ptc) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(overview, "overview");
            Intrinsics.checkNotNullParameter(period, "period");
            return new Surrogate(id, account_number, generated_at, title, items, sources, overview, period, next_generation_epoch, portfolio_change_ptc);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.generated_at, surrogate.generated_at) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.items, surrogate.items) && Intrinsics.areEqual(this.sources, surrogate.sources) && Intrinsics.areEqual(this.overview, surrogate.overview) && Intrinsics.areEqual(this.period, surrogate.period) && Intrinsics.areEqual(this.next_generation_epoch, surrogate.next_generation_epoch) && Double.compare(this.portfolio_change_ptc, surrogate.portfolio_change_ptc) == 0;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31;
            Instant instant = this.generated_at;
            int iHashCode2 = (((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.title.hashCode()) * 31) + this.items.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.overview.hashCode()) * 31) + this.period.hashCode()) * 31;
            Instant instant2 = this.next_generation_epoch;
            return ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + Double.hashCode(this.portfolio_change_ptc);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", generated_at=" + this.generated_at + ", title=" + this.title + ", items=" + this.items + ", sources=" + this.sources + ", overview=" + this.overview + ", period=" + this.period + ", next_generation_epoch=" + this.next_generation_epoch + ", portfolio_change_ptc=" + this.portfolio_change_ptc + ")";
        }

        /* compiled from: StrategiesDigestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StrategiesDigestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.StrategiesDigestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StrategiesDigestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.StrategiesDigestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StrategiesDigestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.generated_at = null;
            } else {
                this.generated_at = instant;
            }
            if ((i & 8) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 16) == 0) {
                this.items = CollectionsKt.emptyList();
            } else {
                this.items = list;
            }
            if ((i & 32) == 0) {
                this.sources = CollectionsKt.emptyList();
            } else {
                this.sources = list2;
            }
            if ((i & 64) == 0) {
                this.overview = "";
            } else {
                this.overview = str4;
            }
            if ((i & 128) == 0) {
                this.period = "";
            } else {
                this.period = str5;
            }
            if ((i & 256) == 0) {
                this.next_generation_epoch = null;
            } else {
                this.next_generation_epoch = instant2;
            }
            if ((i & 512) == 0) {
                this.portfolio_change_ptc = 0.0d;
            } else {
                this.portfolio_change_ptc = d;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            Instant instant = self.generated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 3, self.title);
            }
            if (!Intrinsics.areEqual(self.items, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.items);
            }
            if (!Intrinsics.areEqual(self.sources, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.sources);
            }
            if (!Intrinsics.areEqual(self.overview, "")) {
                output.encodeStringElement(serialDesc, 6, self.overview);
            }
            if (!Intrinsics.areEqual(self.period, "")) {
                output.encodeStringElement(serialDesc, 7, self.period);
            }
            Instant instant2 = self.next_generation_epoch;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant2);
            }
            if (Double.compare(self.portfolio_change_ptc, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.portfolio_change_ptc));
            }
        }

        public Surrogate(String id, String account_number, Instant instant, String title, List<DigestItemDto> items, List<ArticleSourceDto> sources, String overview, String period, Instant instant2, double d) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(overview, "overview");
            Intrinsics.checkNotNullParameter(period, "period");
            this.id = id;
            this.account_number = account_number;
            this.generated_at = instant;
            this.title = title;
            this.items = items;
            this.sources = sources;
            this.overview = overview;
            this.period = period;
            this.next_generation_epoch = instant2;
            this.portfolio_change_ptc = d;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, String str3, List list, List list2, String str4, String str5, Instant instant2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? null : instant2, (i & 512) != 0 ? 0.0d : d);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final Instant getGenerated_at() {
            return this.generated_at;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<DigestItemDto> getItems() {
            return this.items;
        }

        public final List<ArticleSourceDto> getSources() {
            return this.sources;
        }

        public final String getOverview() {
            return this.overview;
        }

        public final String getPeriod() {
            return this.period;
        }

        public final Instant getNext_generation_epoch() {
            return this.next_generation_epoch;
        }

        public final double getPortfolio_change_ptc() {
            return this.portfolio_change_ptc;
        }
    }

    /* compiled from: StrategiesDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StrategiesDigestDto, StrategiesDigest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StrategiesDigestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategiesDigestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategiesDigestDto> getBinaryBase64Serializer() {
            return (KSerializer) StrategiesDigestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StrategiesDigest> getProtoAdapter() {
            return StrategiesDigest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategiesDigestDto getZeroValue() {
            return StrategiesDigestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategiesDigestDto fromProto(StrategiesDigest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            Instant generated_at = proto.getGenerated_at();
            String title = proto.getTitle();
            List<DigestItem> items = proto.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(DigestItemDto.INSTANCE.fromProto((DigestItem) it.next()));
            }
            List<ArticleSource> sources = proto.getSources();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
            Iterator<T> it2 = sources.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it2.next()));
            }
            return new StrategiesDigestDto(new Surrogate(id, account_number, generated_at, title, arrayList, arrayList2, proto.getOverview(), proto.getPeriod(), proto.getNext_generation_epoch(), proto.getPortfolio_change_ptc()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.StrategiesDigestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategiesDigestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new StrategiesDigestDto(null, null, null, null, null, null, null, null, null, 0.0d, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StrategiesDigestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StrategiesDigestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.StrategiesDigest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StrategiesDigestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StrategiesDigestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StrategiesDigestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StrategiesDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/StrategiesDigestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.StrategiesDigestDto";
        }
    }
}
