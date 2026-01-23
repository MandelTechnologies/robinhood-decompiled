package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.GetInsightsRequestDto;
import com.robinhood.copilot.proto.p286v1.InsightCategoryDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: GetInsightsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014J_\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b1\u0010!¨\u00066"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;)V", "", "instrument_id", "", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "categories", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "", "page_offset", "page_size", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;II)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;II)Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "getInstrument_id", "getCategories", "()Ljava/util/List;", "getStart_date", "()Lj$/time/Instant;", "getEnd_date", "getPage_offset", "getPage_size", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetInsightsRequestDto implements Dto3<GetInsightsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetInsightsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetInsightsRequestDto, GetInsightsRequest>> binaryBase64Serializer$delegate;
    private static final GetInsightsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetInsightsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetInsightsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final List<InsightCategoryDto> getCategories() {
        return this.surrogate.getCategories();
    }

    public final Instant getStart_date() {
        return this.surrogate.getStart_date();
    }

    public final Instant getEnd_date() {
        return this.surrogate.getEnd_date();
    }

    public final int getPage_offset() {
        return this.surrogate.getPage_offset();
    }

    public final int getPage_size() {
        return this.surrogate.getPage_size();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetInsightsRequestDto(java.lang.String r2, java.util.List r3, p479j$.time.Instant r4, p479j$.time.Instant r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Le
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        Le:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L14
            r4 = r0
        L14:
            r9 = r8 & 8
            if (r9 == 0) goto L19
            r5 = r0
        L19:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1f
            r6 = r0
        L1f:
            r8 = r8 & 32
            if (r8 == 0) goto L2b
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L32
        L2b:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L32:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.copilot.proto.p286v1.GetInsightsRequestDto.<init>(java.lang.String, java.util.List, j$.time.Instant, j$.time.Instant, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetInsightsRequestDto(String instrument_id, List<? extends InsightCategoryDto> categories, Instant instant, Instant instant2, int i, int i2) {
        this(new Surrogate(instrument_id, categories, instant, instant2, i, i2));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(categories, "categories");
    }

    public static /* synthetic */ GetInsightsRequestDto copy$default(GetInsightsRequestDto getInsightsRequestDto, String str, List list, Instant instant, Instant instant2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getInsightsRequestDto.surrogate.getInstrument_id();
        }
        if ((i3 & 2) != 0) {
            list = getInsightsRequestDto.surrogate.getCategories();
        }
        if ((i3 & 4) != 0) {
            instant = getInsightsRequestDto.surrogate.getStart_date();
        }
        if ((i3 & 8) != 0) {
            instant2 = getInsightsRequestDto.surrogate.getEnd_date();
        }
        if ((i3 & 16) != 0) {
            i = getInsightsRequestDto.surrogate.getPage_offset();
        }
        if ((i3 & 32) != 0) {
            i2 = getInsightsRequestDto.surrogate.getPage_size();
        }
        int i4 = i;
        int i5 = i2;
        return getInsightsRequestDto.copy(str, list, instant, instant2, i4, i5);
    }

    public final GetInsightsRequestDto copy(String instrument_id, List<? extends InsightCategoryDto> categories, Instant start_date, Instant end_date, int page_offset, int page_size) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new GetInsightsRequestDto(new Surrogate(instrument_id, categories, start_date, end_date, page_offset, page_size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetInsightsRequest toProto() {
        String instrument_id = this.surrogate.getInstrument_id();
        List<InsightCategoryDto> categories = this.surrogate.getCategories();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add((InsightCategory) ((InsightCategoryDto) it.next()).toProto());
        }
        return new GetInsightsRequest(instrument_id, arrayList, this.surrogate.getStart_date(), this.surrogate.getEnd_date(), this.surrogate.getPage_offset(), this.surrogate.getPage_size(), null, 64, null);
    }

    public String toString() {
        return "[GetInsightsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetInsightsRequestDto) && Intrinsics.areEqual(((GetInsightsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetInsightsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0012\u0010\u0013BY\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J6\u0010'\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J¼\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2.\b\u0002\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010)J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010$RF\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010&RF\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010&R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010)R/\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010)¨\u0006F"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "", "", "instrument_id", "", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "categories", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "start_date", "end_date", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "page_offset", "page_size", "<init>", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;II)Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "Ljava/util/List;", "getCategories", "getCategories$annotations", "Lj$/time/Instant;", "getStart_date", "getStart_date$annotations", "getEnd_date", "getEnd_date$annotations", "I", "getPage_offset", "getPage_offset$annotations", "getPage_size", "getPage_size$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<InsightCategoryDto> categories;
        private final Instant end_date;
        private final String instrument_id;
        private final int page_offset;
        private final int page_size;
        private final Instant start_date;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.GetInsightsRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetInsightsRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (Instant) null, (Instant) null, 0, 0, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InsightCategoryDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, Instant instant, Instant instant2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i3 & 2) != 0) {
                list = surrogate.categories;
            }
            if ((i3 & 4) != 0) {
                instant = surrogate.start_date;
            }
            if ((i3 & 8) != 0) {
                instant2 = surrogate.end_date;
            }
            if ((i3 & 16) != 0) {
                i = surrogate.page_offset;
            }
            if ((i3 & 32) != 0) {
                i2 = surrogate.page_size;
            }
            int i4 = i;
            int i5 = i2;
            return surrogate.copy(str, list, instant, instant2, i4, i5);
        }

        @SerialName("categories")
        @JsonAnnotations2(names = {"categories"})
        public static /* synthetic */ void getCategories$annotations() {
        }

        @SerialName("endDate")
        @JsonAnnotations2(names = {"end_date"})
        public static /* synthetic */ void getEnd_date$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("pageOffset")
        @JsonAnnotations2(names = {"page_offset"})
        public static /* synthetic */ void getPage_offset$annotations() {
        }

        @SerialName("pageSize")
        @JsonAnnotations2(names = {"page_size"})
        public static /* synthetic */ void getPage_size$annotations() {
        }

        @SerialName("startDate")
        @JsonAnnotations2(names = {"start_date"})
        public static /* synthetic */ void getStart_date$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final List<InsightCategoryDto> component2() {
            return this.categories;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getStart_date() {
            return this.start_date;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getEnd_date() {
            return this.end_date;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPage_offset() {
            return this.page_offset;
        }

        /* renamed from: component6, reason: from getter */
        public final int getPage_size() {
            return this.page_size;
        }

        public final Surrogate copy(String instrument_id, List<? extends InsightCategoryDto> categories, Instant start_date, Instant end_date, int page_offset, int page_size) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(categories, "categories");
            return new Surrogate(instrument_id, categories, start_date, end_date, page_offset, page_size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.categories, surrogate.categories) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.end_date, surrogate.end_date) && this.page_offset == surrogate.page_offset && this.page_size == surrogate.page_size;
        }

        public int hashCode() {
            int iHashCode = ((this.instrument_id.hashCode() * 31) + this.categories.hashCode()) * 31;
            Instant instant = this.start_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.end_date;
            return ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + Integer.hashCode(this.page_offset)) * 31) + Integer.hashCode(this.page_size);
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", categories=" + this.categories + ", start_date=" + this.start_date + ", end_date=" + this.end_date + ", page_offset=" + this.page_offset + ", page_size=" + this.page_size + ")";
        }

        /* compiled from: GetInsightsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetInsightsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, Instant instant, Instant instant2, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            this.instrument_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.categories = CollectionsKt.emptyList();
            } else {
                this.categories = list;
            }
            if ((i & 4) == 0) {
                this.start_date = null;
            } else {
                this.start_date = instant;
            }
            if ((i & 8) == 0) {
                this.end_date = null;
            } else {
                this.end_date = instant2;
            }
            if ((i & 16) == 0) {
                this.page_offset = 0;
            } else {
                this.page_offset = i2;
            }
            if ((i & 32) == 0) {
                this.page_size = 0;
            } else {
                this.page_size = i3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.categories, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.categories);
            }
            Instant instant = self.start_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.end_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            int i = self.page_offset;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.page_size;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String instrument_id, List<? extends InsightCategoryDto> categories, Instant instant, Instant instant2, int i, int i2) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.instrument_id = instrument_id;
            this.categories = categories;
            this.start_date = instant;
            this.end_date = instant2;
            this.page_offset = i;
            this.page_size = i2;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, java.util.List r3, p479j$.time.Instant r4, p479j$.time.Instant r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto Le
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            Le:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L14
                r4 = r0
            L14:
                r9 = r8 & 8
                if (r9 == 0) goto L19
                r5 = r0
            L19:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L1f
                r6 = r0
            L1f:
                r8 = r8 & 32
                if (r8 == 0) goto L2b
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L32
            L2b:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L32:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.copilot.proto.p286v1.GetInsightsRequestDto.Surrogate.<init>(java.lang.String, java.util.List, j$.time.Instant, j$.time.Instant, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<InsightCategoryDto> getCategories() {
            return this.categories;
        }

        public final Instant getStart_date() {
            return this.start_date;
        }

        public final Instant getEnd_date() {
            return this.end_date;
        }

        public final int getPage_offset() {
            return this.page_offset;
        }

        public final int getPage_size() {
            return this.page_size;
        }
    }

    /* compiled from: GetInsightsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetInsightsRequestDto, GetInsightsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetInsightsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetInsightsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetInsightsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetInsightsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetInsightsRequest> getProtoAdapter() {
            return GetInsightsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetInsightsRequestDto getZeroValue() {
            return GetInsightsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetInsightsRequestDto fromProto(GetInsightsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String instrument_id = proto.getInstrument_id();
            List<InsightCategory> categories = proto.getCategories();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
            Iterator<T> it = categories.iterator();
            while (it.hasNext()) {
                arrayList.add(InsightCategoryDto.INSTANCE.fromProto((InsightCategory) it.next()));
            }
            return new GetInsightsRequestDto(new Surrogate(instrument_id, arrayList, proto.getStart_date(), proto.getEnd_date(), proto.getPage_offset(), proto.getPage_size()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetInsightsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetInsightsRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetInsightsRequestDto(null, null, null, null, 0, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetInsightsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetInsightsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetInsightsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetInsightsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetInsightsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetInsightsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetInsightsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetInsightsRequestDto";
        }
    }
}
