package hippo.model.p469v1;

import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: LinkingGroup.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EBÉ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(JÏ\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b\u0006\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b5\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b9\u0010.R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b=\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b\u0015\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b>\u0010(R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b?\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b@\u00108R\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\bA\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, m3636d2 = {"Lhippo/model/v1/LinkingGroup;", "Lcom/squareup/wire/Message;", "", "", "id", "", "is_linked", "Lhippo/model/v1/LinkingGroupColors;", ResourceTypes.COLOR, "Lhippo/model/v1/CreatedBy;", "created_by", "", "widget_ids", "instrument_id", "Lhippo/model/v1/InstrumentType;", "instrument_type", "spotlight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "is_cleared", "triggering_widget_id", "secondary_instrument_id", "secondary_instrument_type", "instrument_symbol", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColors;Lhippo/model/v1/CreatedBy;Ljava/util/List;Ljava/lang/String;Lhippo/model/v1/InstrumentType;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lhippo/model/v1/InstrumentType;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColors;Lhippo/model/v1/CreatedBy;Ljava/util/List;Ljava/lang/String;Lhippo/model/v1/InstrumentType;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lhippo/model/v1/InstrumentType;Ljava/lang/String;Lokio/ByteString;)Lhippo/model/v1/LinkingGroup;", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lhippo/model/v1/LinkingGroupColors;", "getColor", "()Lhippo/model/v1/LinkingGroupColors;", "Lhippo/model/v1/CreatedBy;", "getCreated_by", "()Lhippo/model/v1/CreatedBy;", "getInstrument_id", "Lhippo/model/v1/InstrumentType;", "getInstrument_type", "()Lhippo/model/v1/InstrumentType;", "getSpotlight", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getTriggering_widget_id", "getSecondary_instrument_id", "getSecondary_instrument_type", "getInstrument_symbol", "Ljava/util/List;", "getWidget_ids", "()Ljava/util/List;", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LinkingGroup extends Message {

    @JvmField
    public static final ProtoAdapter<LinkingGroup> ADAPTER;

    @WireField(adapter = "hippo.model.v1.LinkingGroupColors#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final LinkingGroupColors color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant created_at;

    @WireField(adapter = "hippo.model.v1.CreatedBy#ADAPTER", jsonName = "createdBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CreatedBy created_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String instrument_symbol;

    @WireField(adapter = "hippo.model.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCleared", schemaIndex = 10, tag = 11)
    private final Boolean is_cleared;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLinked", schemaIndex = 1, tag = 2)
    private final Boolean is_linked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryInstrumentId", schemaIndex = 12, tag = 13)
    private final String secondary_instrument_id;

    @WireField(adapter = "hippo.model.v1.InstrumentType#ADAPTER", jsonName = "secondaryInstrumentType", schemaIndex = 13, tag = 14)
    private final InstrumentType secondary_instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    private final Boolean spotlight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "triggeringWidgetId", schemaIndex = 11, tag = 12)
    private final String triggering_widget_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Instant updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "widgetIds", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> widget_ids;

    public LinkingGroup() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public /* synthetic */ LinkingGroup(String str, Boolean bool, LinkingGroupColors linkingGroupColors, CreatedBy createdBy, List list, String str2, InstrumentType instrumentType, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str3, String str4, InstrumentType instrumentType2, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED : linkingGroupColors, (i & 8) != 0 ? CreatedBy.CREATED_BY_UNSPECIFIED : createdBy, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : instrumentType2, (i & 16384) == 0 ? str5 : "", (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28250newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: is_linked, reason: from getter */
    public final Boolean getIs_linked() {
        return this.is_linked;
    }

    public final LinkingGroupColors getColor() {
        return this.color;
    }

    public final CreatedBy getCreated_by() {
        return this.created_by;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final InstrumentType getInstrument_type() {
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

    public final InstrumentType getSecondary_instrument_type() {
        return this.secondary_instrument_type;
    }

    public final String getInstrument_symbol() {
        return this.instrument_symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkingGroup(String id, Boolean bool, LinkingGroupColors color, CreatedBy created_by, List<String> widget_ids, String instrument_id, InstrumentType instrument_type, Boolean bool2, Instant instant, Instant instant2, Boolean bool3, String str, String str2, InstrumentType instrumentType, String instrument_symbol, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(created_by, "created_by");
        Intrinsics.checkNotNullParameter(widget_ids, "widget_ids");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.is_linked = bool;
        this.color = color;
        this.created_by = created_by;
        this.instrument_id = instrument_id;
        this.instrument_type = instrument_type;
        this.spotlight = bool2;
        this.created_at = instant;
        this.updated_at = instant2;
        this.is_cleared = bool3;
        this.triggering_widget_id = str;
        this.secondary_instrument_id = str2;
        this.secondary_instrument_type = instrumentType;
        this.instrument_symbol = instrument_symbol;
        this.widget_ids = Internal.immutableCopyOf("widget_ids", widget_ids);
    }

    public final List<String> getWidget_ids() {
        return this.widget_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28250newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LinkingGroup)) {
            return false;
        }
        LinkingGroup linkingGroup = (LinkingGroup) other;
        return Intrinsics.areEqual(unknownFields(), linkingGroup.unknownFields()) && Intrinsics.areEqual(this.id, linkingGroup.id) && Intrinsics.areEqual(this.is_linked, linkingGroup.is_linked) && this.color == linkingGroup.color && this.created_by == linkingGroup.created_by && Intrinsics.areEqual(this.widget_ids, linkingGroup.widget_ids) && Intrinsics.areEqual(this.instrument_id, linkingGroup.instrument_id) && this.instrument_type == linkingGroup.instrument_type && Intrinsics.areEqual(this.spotlight, linkingGroup.spotlight) && Intrinsics.areEqual(this.created_at, linkingGroup.created_at) && Intrinsics.areEqual(this.updated_at, linkingGroup.updated_at) && Intrinsics.areEqual(this.is_cleared, linkingGroup.is_cleared) && Intrinsics.areEqual(this.triggering_widget_id, linkingGroup.triggering_widget_id) && Intrinsics.areEqual(this.secondary_instrument_id, linkingGroup.secondary_instrument_id) && this.secondary_instrument_type == linkingGroup.secondary_instrument_type && Intrinsics.areEqual(this.instrument_symbol, linkingGroup.instrument_symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Boolean bool = this.is_linked;
        int iHashCode2 = (((((((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 37) + this.color.hashCode()) * 37) + this.created_by.hashCode()) * 37) + this.widget_ids.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.instrument_type.hashCode()) * 37;
        Boolean bool2 = this.spotlight;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode5 = (iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_cleared;
        int iHashCode6 = (iHashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str = this.triggering_widget_id;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.secondary_instrument_id;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.secondary_instrument_type;
        int iHashCode9 = ((iHashCode8 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37) + this.instrument_symbol.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Boolean bool = this.is_linked;
        if (bool != null) {
            arrayList.add("is_linked=" + bool);
        }
        arrayList.add("color=" + this.color);
        arrayList.add("created_by=" + this.created_by);
        if (!this.widget_ids.isEmpty()) {
            arrayList.add("widget_ids=" + Internal.sanitize(this.widget_ids));
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("instrument_type=" + this.instrument_type);
        Boolean bool2 = this.spotlight;
        if (bool2 != null) {
            arrayList.add("spotlight=" + bool2);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Boolean bool3 = this.is_cleared;
        if (bool3 != null) {
            arrayList.add("is_cleared=" + bool3);
        }
        String str = this.triggering_widget_id;
        if (str != null) {
            arrayList.add("triggering_widget_id=" + Internal.sanitize(str));
        }
        String str2 = this.secondary_instrument_id;
        if (str2 != null) {
            arrayList.add("secondary_instrument_id=" + Internal.sanitize(str2));
        }
        InstrumentType instrumentType = this.secondary_instrument_type;
        if (instrumentType != null) {
            arrayList.add("secondary_instrument_type=" + instrumentType);
        }
        arrayList.add("instrument_symbol=" + Internal.sanitize(this.instrument_symbol));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkingGroup{", "}", 0, null, null, 56, null);
    }

    public final LinkingGroup copy(String id, Boolean is_linked, LinkingGroupColors color, CreatedBy created_by, List<String> widget_ids, String instrument_id, InstrumentType instrument_type, Boolean spotlight, Instant created_at, Instant updated_at, Boolean is_cleared, String triggering_widget_id, String secondary_instrument_id, InstrumentType secondary_instrument_type, String instrument_symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(created_by, "created_by");
        Intrinsics.checkNotNullParameter(widget_ids, "widget_ids");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LinkingGroup(id, is_linked, color, created_by, widget_ids, instrument_id, instrument_type, spotlight, created_at, updated_at, is_cleared, triggering_widget_id, secondary_instrument_id, secondary_instrument_type, instrument_symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LinkingGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LinkingGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.LinkingGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LinkingGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getIs_linked());
                if (value.getColor() != LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED) {
                    iEncodedSizeWithTag += LinkingGroupColors.ADAPTER.encodedSizeWithTag(3, value.getColor());
                }
                if (value.getCreated_by() != CreatedBy.CREATED_BY_UNSPECIFIED) {
                    iEncodedSizeWithTag += CreatedBy.ADAPTER.encodedSizeWithTag(4, value.getCreated_by());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(5, value.getWidget_ids());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(6, value.getInstrument_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += InstrumentType.ADAPTER.encodedSizeWithTag(7, value.getInstrument_type());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(8, value.getSpotlight());
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag3 += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    iEncodedSizeWithTag3 += ProtoAdapter.INSTANT.encodedSizeWithTag(10, value.getUpdated_at());
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(11, value.getIs_cleared()) + protoAdapter2.encodedSizeWithTag(12, value.getTriggering_widget_id()) + protoAdapter2.encodedSizeWithTag(13, value.getSecondary_instrument_id()) + InstrumentType.ADAPTER.encodedSizeWithTag(14, value.getSecondary_instrument_type());
                return !Intrinsics.areEqual(value.getInstrument_symbol(), "") ? iEncodedSizeWithTag4 + protoAdapter2.encodedSizeWithTag(15, value.getInstrument_symbol()) : iEncodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LinkingGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getIs_linked());
                if (value.getColor() != LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED) {
                    LinkingGroupColors.ADAPTER.encodeWithTag(writer, 3, (int) value.getColor());
                }
                if (value.getCreated_by() != CreatedBy.CREATED_BY_UNSPECIFIED) {
                    CreatedBy.ADAPTER.encodeWithTag(writer, 4, (int) value.getCreated_by());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(writer, 5, (int) value.getWidget_ids());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getInstrument_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getSpotlight());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                protoAdapter.encodeWithTag(writer, 11, (int) value.getIs_cleared());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getTriggering_widget_id());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getSecondary_instrument_id());
                InstrumentType.ADAPTER.encodeWithTag(writer, 14, (int) value.getSecondary_instrument_type());
                if (!Intrinsics.areEqual(value.getInstrument_symbol(), "")) {
                    protoAdapter2.encodeWithTag(writer, 15, (int) value.getInstrument_symbol());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LinkingGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstrument_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getInstrument_symbol());
                }
                ProtoAdapter<InstrumentType> protoAdapter = InstrumentType.ADAPTER;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getSecondary_instrument_type());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getSecondary_instrument_id());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getTriggering_widget_id());
                ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 11, (int) value.getIs_cleared());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                protoAdapter3.encodeWithTag(writer, 8, (int) value.getSpotlight());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getInstrument_id());
                }
                protoAdapter2.asRepeated().encodeWithTag(writer, 5, (int) value.getWidget_ids());
                if (value.getCreated_by() != CreatedBy.CREATED_BY_UNSPECIFIED) {
                    CreatedBy.ADAPTER.encodeWithTag(writer, 4, (int) value.getCreated_by());
                }
                if (value.getColor() != LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED) {
                    LinkingGroupColors.ADAPTER.encodeWithTag(writer, 3, (int) value.getColor());
                }
                protoAdapter3.encodeWithTag(writer, 2, (int) value.getIs_linked());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LinkingGroup decode(ProtoReader reader) throws IOException {
                CreatedBy createdBy;
                InstrumentType instrumentType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkingGroupColors linkingGroupColors = LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED;
                CreatedBy createdBy2 = CreatedBy.CREATED_BY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                InstrumentType instrumentType2 = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                LinkingGroupColors linkingGroupColorsDecode = linkingGroupColors;
                String strDecode = "";
                String strDecode2 = strDecode;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Boolean boolDecode3 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                InstrumentType instrumentTypeDecode = null;
                InstrumentType instrumentTypeDecode2 = instrumentType2;
                String strDecode5 = strDecode2;
                CreatedBy createdByDecode = createdBy2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 3:
                                createdBy = createdByDecode;
                                instrumentType = instrumentTypeDecode2;
                                str = strDecode5;
                                try {
                                    linkingGroupColorsDecode = LinkingGroupColors.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                createdByDecode = createdBy;
                                instrumentTypeDecode2 = instrumentType;
                                strDecode5 = str;
                                break;
                            case 4:
                                createdBy = createdByDecode;
                                instrumentType = instrumentTypeDecode2;
                                str = strDecode5;
                                try {
                                    createdByDecode = CreatedBy.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                instrumentTypeDecode2 = instrumentType;
                                strDecode5 = str;
                                break;
                            case 5:
                                createdBy = createdByDecode;
                                instrumentType = instrumentTypeDecode2;
                                str = strDecode5;
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                createdByDecode = createdBy;
                                instrumentTypeDecode2 = instrumentType;
                                strDecode5 = str;
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                createdBy = createdByDecode;
                                instrumentType = instrumentTypeDecode2;
                                str = strDecode5;
                                try {
                                    instrumentTypeDecode2 = InstrumentType.ADAPTER.decode(reader);
                                    createdByDecode = createdBy;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                strDecode5 = str;
                                break;
                            case 8:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 9:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 11:
                                boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 12:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    createdBy = createdByDecode;
                                    instrumentType = instrumentTypeDecode2;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 15:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                createdBy = createdByDecode;
                                instrumentType = instrumentTypeDecode2;
                                str = strDecode5;
                                createdByDecode = createdBy;
                                instrumentTypeDecode2 = instrumentType;
                                strDecode5 = str;
                                break;
                        }
                    } else {
                        return new LinkingGroup(strDecode5, boolDecode, linkingGroupColorsDecode, createdByDecode, arrayList, strDecode, instrumentTypeDecode2, boolDecode2, instantDecode, instantDecode2, boolDecode3, strDecode3, strDecode4, instrumentTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinkingGroup redact(LinkingGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return value.copy((31999 & 1) != 0 ? value.id : null, (31999 & 2) != 0 ? value.is_linked : null, (31999 & 4) != 0 ? value.color : null, (31999 & 8) != 0 ? value.created_by : null, (31999 & 16) != 0 ? value.widget_ids : null, (31999 & 32) != 0 ? value.instrument_id : null, (31999 & 64) != 0 ? value.instrument_type : null, (31999 & 128) != 0 ? value.spotlight : null, (31999 & 256) != 0 ? value.created_at : instantRedact, (31999 & 512) != 0 ? value.updated_at : updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, (31999 & 1024) != 0 ? value.is_cleared : null, (31999 & 2048) != 0 ? value.triggering_widget_id : null, (31999 & 4096) != 0 ? value.secondary_instrument_id : null, (31999 & 8192) != 0 ? value.secondary_instrument_type : null, (31999 & 16384) != 0 ? value.instrument_symbol : null, (31999 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
