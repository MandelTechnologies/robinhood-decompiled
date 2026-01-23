package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.CreatedByDto;
import hippo.model.p469v1.InstrumentTypeDto;
import hippo.model.p469v1.LinkingGroupColorsDto;
import hippo.model.p469v1.LinkingGroupDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;

/* compiled from: LinkingGroupDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u00104R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010#¨\u0006A"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/LinkingGroup;", "Landroid/os/Parcelable;", "Lhippo/model/v1/LinkingGroupDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/LinkingGroupDto$Surrogate;)V", "", "id", "", "is_linked", "Lhippo/model/v1/LinkingGroupColorsDto;", ResourceTypes.COLOR, "Lhippo/model/v1/CreatedByDto;", "created_by", "", "widget_ids", "instrument_id", "Lhippo/model/v1/InstrumentTypeDto;", "instrument_type", "spotlight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "is_cleared", "triggering_widget_id", "secondary_instrument_id", "secondary_instrument_type", "instrument_symbol", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColorsDto;Lhippo/model/v1/CreatedByDto;Ljava/util/List;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/String;)V", "toProto", "()Lhippo/model/v1/LinkingGroup;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/LinkingGroupDto$Surrogate;", "getId", "()Ljava/lang/Boolean;", "getColor", "()Lhippo/model/v1/LinkingGroupColorsDto;", "getWidget_ids", "()Ljava/util/List;", "getInstrument_id", "getInstrument_type", "()Lhippo/model/v1/InstrumentTypeDto;", "getInstrument_symbol", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class LinkingGroupDto implements Dto3<LinkingGroup>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LinkingGroupDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LinkingGroupDto, LinkingGroup>> binaryBase64Serializer$delegate;
    private static final LinkingGroupDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LinkingGroupDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LinkingGroupDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final Boolean is_linked() {
        return this.surrogate.getIs_linked();
    }

    public final LinkingGroupColorsDto getColor() {
        return this.surrogate.getColor();
    }

    public final List<String> getWidget_ids() {
        return this.surrogate.getWidget_ids();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final String getInstrument_symbol() {
        return this.surrogate.getInstrument_symbol();
    }

    public /* synthetic */ LinkingGroupDto(String str, Boolean bool, LinkingGroupColorsDto linkingGroupColorsDto, CreatedByDto createdByDto, List list, String str2, InstrumentTypeDto instrumentTypeDto, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str3, String str4, InstrumentTypeDto instrumentTypeDto2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? LinkingGroupColorsDto.INSTANCE.getZeroValue() : linkingGroupColorsDto, (i & 8) != 0 ? CreatedByDto.INSTANCE.getZeroValue() : createdByDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : instrumentTypeDto2, (i & 16384) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkingGroupDto(String id, Boolean bool, LinkingGroupColorsDto color, CreatedByDto created_by, List<String> widget_ids, String instrument_id, InstrumentTypeDto instrument_type, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str, String str2, InstrumentTypeDto instrumentTypeDto, String instrument_symbol) {
        this(new Surrogate(id, bool, color, created_by, widget_ids, instrument_id, instrument_type, bool2, instant, instant2, bool3, str, str2, instrumentTypeDto, instrument_symbol));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(created_by, "created_by");
        Intrinsics.checkNotNullParameter(widget_ids, "widget_ids");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LinkingGroup toProto() {
        String id = this.surrogate.getId();
        Boolean is_linked = this.surrogate.getIs_linked();
        LinkingGroupColors linkingGroupColors = (LinkingGroupColors) this.surrogate.getColor().toProto();
        CreatedBy createdBy = (CreatedBy) this.surrogate.getCreated_by().toProto();
        List<String> widget_ids = this.surrogate.getWidget_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(widget_ids, 10));
        Iterator<T> it = widget_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String instrument_id = this.surrogate.getInstrument_id();
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        Boolean spotlight = this.surrogate.getSpotlight();
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        Boolean is_cleared = this.surrogate.getIs_cleared();
        String triggering_widget_id = this.surrogate.getTriggering_widget_id();
        String secondary_instrument_id = this.surrogate.getSecondary_instrument_id();
        InstrumentTypeDto secondary_instrument_type = this.surrogate.getSecondary_instrument_type();
        return new LinkingGroup(id, is_linked, linkingGroupColors, createdBy, arrayList, instrument_id, instrumentType, spotlight, created_at, updated_at, is_cleared, triggering_widget_id, secondary_instrument_id, secondary_instrument_type != null ? (InstrumentType) secondary_instrument_type.toProto() : null, this.surrogate.getInstrument_symbol(), null, 32768, null);
    }

    public String toString() {
        return "[LinkingGroupDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LinkingGroupDto) && Intrinsics.areEqual(((LinkingGroupDto) other).surrogate, this.surrogate);
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
    /* compiled from: LinkingGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b7\b\u0083\b\u0018\u0000 ]2\u00020\u0001:\u0002^]Bû\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dB·\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b\u0005\u00108R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b=\u00106\u001a\u0004\b;\u0010<R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bA\u00106\u001a\u0004\b?\u0010@R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bE\u00106\u001a\u0004\bC\u0010DR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\bG\u00106\u001a\u0004\bF\u0010-R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010H\u0012\u0004\bK\u00106\u001a\u0004\bI\u0010JR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\bM\u00106\u001a\u0004\bL\u00108RF\u0010\u0015\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010N\u0012\u0004\bQ\u00106\u001a\u0004\bO\u0010PRF\u0010\u0016\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\bS\u00106\u001a\u0004\bR\u0010PR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00107\u0012\u0004\bT\u00106\u001a\u0004\b\u0017\u00108R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00103\u0012\u0004\bV\u00106\u001a\u0004\bU\u0010-R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00103\u0012\u0004\bX\u00106\u001a\u0004\bW\u0010-R\"\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010H\u0012\u0004\bZ\u00106\u001a\u0004\bY\u0010JR \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00103\u0012\u0004\b\\\u00106\u001a\u0004\b[\u0010-¨\u0006_"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto$Surrogate;", "", "", "id", "", "is_linked", "Lhippo/model/v1/LinkingGroupColorsDto;", ResourceTypes.COLOR, "Lhippo/model/v1/CreatedByDto;", "created_by", "", "widget_ids", "instrument_id", "Lhippo/model/v1/InstrumentTypeDto;", "instrument_type", "spotlight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "is_cleared", "triggering_widget_id", "secondary_instrument_id", "secondary_instrument_type", "instrument_symbol", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColorsDto;Lhippo/model/v1/CreatedByDto;Ljava/util/List;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColorsDto;Lhippo/model/v1/CreatedByDto;Ljava/util/List;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/LinkingGroupDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_linked$annotations", "Lhippo/model/v1/LinkingGroupColorsDto;", "getColor", "()Lhippo/model/v1/LinkingGroupColorsDto;", "getColor$annotations", "Lhippo/model/v1/CreatedByDto;", "getCreated_by", "()Lhippo/model/v1/CreatedByDto;", "getCreated_by$annotations", "Ljava/util/List;", "getWidget_ids", "()Ljava/util/List;", "getWidget_ids$annotations", "getInstrument_id", "getInstrument_id$annotations", "Lhippo/model/v1/InstrumentTypeDto;", "getInstrument_type", "()Lhippo/model/v1/InstrumentTypeDto;", "getInstrument_type$annotations", "getSpotlight", "getSpotlight$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "is_cleared$annotations", "getTriggering_widget_id", "getTriggering_widget_id$annotations", "getSecondary_instrument_id", "getSecondary_instrument_id$annotations", "getSecondary_instrument_type", "getSecondary_instrument_type$annotations", "getInstrument_symbol", "getInstrument_symbol$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final LinkingGroupColorsDto color;
        private final Instant created_at;
        private final CreatedByDto created_by;
        private final String id;
        private final String instrument_id;
        private final String instrument_symbol;
        private final InstrumentTypeDto instrument_type;
        private final Boolean is_cleared;
        private final Boolean is_linked;
        private final String secondary_instrument_id;
        private final InstrumentTypeDto secondary_instrument_type;
        private final Boolean spotlight;
        private final String triggering_widget_id;
        private final Instant updated_at;
        private final List<String> widget_ids;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: hippo.model.v1.LinkingGroupDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingGroupDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (Boolean) null, (LinkingGroupColorsDto) null, (CreatedByDto) null, (List) null, (String) null, (InstrumentTypeDto) null, (Boolean) null, (Instant) null, (Instant) null, (Boolean) null, (String) null, (String) null, (InstrumentTypeDto) null, (String) null, 32767, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.is_linked, surrogate.is_linked) && this.color == surrogate.color && this.created_by == surrogate.created_by && Intrinsics.areEqual(this.widget_ids, surrogate.widget_ids) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.instrument_type == surrogate.instrument_type && Intrinsics.areEqual(this.spotlight, surrogate.spotlight) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.is_cleared, surrogate.is_cleared) && Intrinsics.areEqual(this.triggering_widget_id, surrogate.triggering_widget_id) && Intrinsics.areEqual(this.secondary_instrument_id, surrogate.secondary_instrument_id) && this.secondary_instrument_type == surrogate.secondary_instrument_type && Intrinsics.areEqual(this.instrument_symbol, surrogate.instrument_symbol);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Boolean bool = this.is_linked;
            int iHashCode2 = (((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.color.hashCode()) * 31) + this.created_by.hashCode()) * 31) + this.widget_ids.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.instrument_type.hashCode()) * 31;
            Boolean bool2 = this.spotlight;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Instant instant = this.created_at;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode5 = (iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Boolean bool3 = this.is_cleared;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.triggering_widget_id;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.secondary_instrument_id;
            int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            InstrumentTypeDto instrumentTypeDto = this.secondary_instrument_type;
            return ((iHashCode8 + (instrumentTypeDto != null ? instrumentTypeDto.hashCode() : 0)) * 31) + this.instrument_symbol.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", is_linked=" + this.is_linked + ", color=" + this.color + ", created_by=" + this.created_by + ", widget_ids=" + this.widget_ids + ", instrument_id=" + this.instrument_id + ", instrument_type=" + this.instrument_type + ", spotlight=" + this.spotlight + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", is_cleared=" + this.is_cleared + ", triggering_widget_id=" + this.triggering_widget_id + ", secondary_instrument_id=" + this.secondary_instrument_id + ", secondary_instrument_type=" + this.secondary_instrument_type + ", instrument_symbol=" + this.instrument_symbol + ")";
        }

        /* compiled from: LinkingGroupDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/LinkingGroupDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LinkingGroupDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Boolean bool, LinkingGroupColorsDto linkingGroupColorsDto, CreatedByDto createdByDto, List list, String str2, InstrumentTypeDto instrumentTypeDto, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str3, String str4, InstrumentTypeDto instrumentTypeDto2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.is_linked = null;
            } else {
                this.is_linked = bool;
            }
            if ((i & 4) == 0) {
                this.color = LinkingGroupColorsDto.INSTANCE.getZeroValue();
            } else {
                this.color = linkingGroupColorsDto;
            }
            if ((i & 8) == 0) {
                this.created_by = CreatedByDto.INSTANCE.getZeroValue();
            } else {
                this.created_by = createdByDto;
            }
            if ((i & 16) == 0) {
                this.widget_ids = CollectionsKt.emptyList();
            } else {
                this.widget_ids = list;
            }
            if ((i & 32) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 64) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
            if ((i & 128) == 0) {
                this.spotlight = null;
            } else {
                this.spotlight = bool2;
            }
            if ((i & 256) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 512) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 1024) == 0) {
                this.is_cleared = null;
            } else {
                this.is_cleared = bool3;
            }
            if ((i & 2048) == 0) {
                this.triggering_widget_id = null;
            } else {
                this.triggering_widget_id = str3;
            }
            if ((i & 4096) == 0) {
                this.secondary_instrument_id = null;
            } else {
                this.secondary_instrument_id = str4;
            }
            if ((i & 8192) == 0) {
                this.secondary_instrument_type = null;
            } else {
                this.secondary_instrument_type = instrumentTypeDto2;
            }
            if ((i & 16384) == 0) {
                this.instrument_symbol = "";
            } else {
                this.instrument_symbol = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            Boolean bool = self.is_linked;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, bool);
            }
            if (self.color != LinkingGroupColorsDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, LinkingGroupColorsDto.Serializer.INSTANCE, self.color);
            }
            if (self.created_by != CreatedByDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CreatedByDto.Serializer.INSTANCE, self.created_by);
            }
            if (!Intrinsics.areEqual(self.widget_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.widget_ids);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.instrument_id);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            Boolean bool2 = self.spotlight;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool2);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireInstantSerializer.INSTANCE, instant2);
            }
            Boolean bool3 = self.is_cleared;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, bool3);
            }
            String str = self.triggering_widget_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str);
            }
            String str2 = self.secondary_instrument_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str2);
            }
            InstrumentTypeDto instrumentTypeDto = self.secondary_instrument_type;
            if (instrumentTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, InstrumentTypeDto.Serializer.INSTANCE, instrumentTypeDto);
            }
            if (Intrinsics.areEqual(self.instrument_symbol, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 14, self.instrument_symbol);
        }

        public Surrogate(String id, Boolean bool, LinkingGroupColorsDto color, CreatedByDto created_by, List<String> widget_ids, String instrument_id, InstrumentTypeDto instrument_type, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str, String str2, InstrumentTypeDto instrumentTypeDto, String instrument_symbol) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(created_by, "created_by");
            Intrinsics.checkNotNullParameter(widget_ids, "widget_ids");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
            this.id = id;
            this.is_linked = bool;
            this.color = color;
            this.created_by = created_by;
            this.widget_ids = widget_ids;
            this.instrument_id = instrument_id;
            this.instrument_type = instrument_type;
            this.spotlight = bool2;
            this.created_at = instant;
            this.updated_at = instant2;
            this.is_cleared = bool3;
            this.triggering_widget_id = str;
            this.secondary_instrument_id = str2;
            this.secondary_instrument_type = instrumentTypeDto;
            this.instrument_symbol = instrument_symbol;
        }

        public /* synthetic */ Surrogate(String str, Boolean bool, LinkingGroupColorsDto linkingGroupColorsDto, CreatedByDto createdByDto, List list, String str2, InstrumentTypeDto instrumentTypeDto, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str3, String str4, InstrumentTypeDto instrumentTypeDto2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? LinkingGroupColorsDto.INSTANCE.getZeroValue() : linkingGroupColorsDto, (i & 8) != 0 ? CreatedByDto.INSTANCE.getZeroValue() : createdByDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : instrumentTypeDto2, (i & 16384) != 0 ? "" : str5);
        }

        public final String getId() {
            return this.id;
        }

        /* renamed from: is_linked, reason: from getter */
        public final Boolean getIs_linked() {
            return this.is_linked;
        }

        public final LinkingGroupColorsDto getColor() {
            return this.color;
        }

        public final CreatedByDto getCreated_by() {
            return this.created_by;
        }

        public final List<String> getWidget_ids() {
            return this.widget_ids;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final Boolean getSpotlight() {
            return this.spotlight;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: is_cleared, reason: from getter */
        public final Boolean getIs_cleared() {
            return this.is_cleared;
        }

        public final String getTriggering_widget_id() {
            return this.triggering_widget_id;
        }

        public final String getSecondary_instrument_id() {
            return this.secondary_instrument_id;
        }

        public final InstrumentTypeDto getSecondary_instrument_type() {
            return this.secondary_instrument_type;
        }

        public final String getInstrument_symbol() {
            return this.instrument_symbol;
        }
    }

    /* compiled from: LinkingGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/LinkingGroupDto;", "Lhippo/model/v1/LinkingGroup;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/LinkingGroupDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LinkingGroupDto, LinkingGroup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LinkingGroupDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkingGroupDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkingGroupDto> getBinaryBase64Serializer() {
            return (KSerializer) LinkingGroupDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LinkingGroup> getProtoAdapter() {
            return LinkingGroup.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkingGroupDto getZeroValue() {
            return LinkingGroupDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkingGroupDto fromProto(LinkingGroup proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Boolean is_linked = proto.getIs_linked();
            LinkingGroupColorsDto linkingGroupColorsDtoFromProto = LinkingGroupColorsDto.INSTANCE.fromProto(proto.getColor());
            CreatedByDto createdByDtoFromProto = CreatedByDto.INSTANCE.fromProto(proto.getCreated_by());
            List<String> widget_ids = proto.getWidget_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(widget_ids, 10));
            Iterator<T> it = widget_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            String instrument_id = proto.getInstrument_id();
            InstrumentTypeDto.Companion companion = InstrumentTypeDto.INSTANCE;
            InstrumentTypeDto instrumentTypeDtoFromProto = companion.fromProto(proto.getInstrument_type());
            Boolean spotlight = proto.getSpotlight();
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            Boolean is_cleared = proto.getIs_cleared();
            String triggering_widget_id = proto.getTriggering_widget_id();
            String secondary_instrument_id = proto.getSecondary_instrument_id();
            InstrumentType secondary_instrument_type = proto.getSecondary_instrument_type();
            return new LinkingGroupDto(new Surrogate(id, is_linked, linkingGroupColorsDtoFromProto, createdByDtoFromProto, arrayList, instrument_id, instrumentTypeDtoFromProto, spotlight, created_at, updated_at, is_cleared, triggering_widget_id, secondary_instrument_id, secondary_instrument_type != null ? companion.fromProto(secondary_instrument_type) : null, proto.getInstrument_symbol()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.LinkingGroupDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkingGroupDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new LinkingGroupDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LinkingGroupDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/LinkingGroupDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/LinkingGroupDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LinkingGroupDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.LinkingGroup", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LinkingGroupDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LinkingGroupDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LinkingGroupDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LinkingGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "hippo.model.v1.LinkingGroupDto";
        }
    }
}
