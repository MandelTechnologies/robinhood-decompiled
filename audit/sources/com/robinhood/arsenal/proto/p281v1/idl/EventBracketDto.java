package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.EventBracketDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventBracketTradeButtonDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: EventBracketDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bo\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016Js\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "Landroid/os/Parcelable;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;)V", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "end_time", "name", "background_image_url", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;", "trade_button_metadata", "", "event_ids", "banner_text", "", "default_round_index", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "toProto", "()Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "getId", "getEnd_time", "()Lj$/time/Instant;", "getName", "getBackground_image_url", "getTrade_button_metadata", "()Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;", "getEvent_ids", "()Ljava/util/List;", "getBanner_text", "getDefault_round_index", "()Ljava/lang/Integer;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class EventBracketDto implements Dto3<EventBracket>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventBracketDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventBracketDto, EventBracket>> binaryBase64Serializer$delegate;
    private static final EventBracketDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventBracketDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventBracketDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final Instant getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getBackground_image_url() {
        return this.surrogate.getBackground_image_url();
    }

    public final EventBracketTradeButtonDto getTrade_button_metadata() {
        return this.surrogate.getTrade_button_metadata();
    }

    public final List<String> getEvent_ids() {
        return this.surrogate.getEvent_ids();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final Integer getDefault_round_index() {
        return this.surrogate.getDefault_round_index();
    }

    public /* synthetic */ EventBracketDto(String str, Instant instant, String str2, String str3, EventBracketTradeButtonDto eventBracketTradeButtonDto, List list, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : eventBracketTradeButtonDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventBracketDto(String id, Instant instant, String name, String str, EventBracketTradeButtonDto eventBracketTradeButtonDto, List<String> event_ids, String str2, Integer num) {
        this(new Surrogate(id, instant, name, str, eventBracketTradeButtonDto, event_ids, str2, num));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
    }

    public static /* synthetic */ EventBracketDto copy$default(EventBracketDto eventBracketDto, String str, Instant instant, String str2, String str3, EventBracketTradeButtonDto eventBracketTradeButtonDto, List list, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventBracketDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            instant = eventBracketDto.surrogate.getEnd_time();
        }
        if ((i & 4) != 0) {
            str2 = eventBracketDto.surrogate.getName();
        }
        if ((i & 8) != 0) {
            str3 = eventBracketDto.surrogate.getBackground_image_url();
        }
        if ((i & 16) != 0) {
            eventBracketTradeButtonDto = eventBracketDto.surrogate.getTrade_button_metadata();
        }
        if ((i & 32) != 0) {
            list = eventBracketDto.surrogate.getEvent_ids();
        }
        if ((i & 64) != 0) {
            str4 = eventBracketDto.surrogate.getBanner_text();
        }
        if ((i & 128) != 0) {
            num = eventBracketDto.surrogate.getDefault_round_index();
        }
        String str5 = str4;
        Integer num2 = num;
        EventBracketTradeButtonDto eventBracketTradeButtonDto2 = eventBracketTradeButtonDto;
        List list2 = list;
        return eventBracketDto.copy(str, instant, str2, str3, eventBracketTradeButtonDto2, list2, str5, num2);
    }

    public final EventBracketDto copy(String id, Instant end_time, String name, String background_image_url, EventBracketTradeButtonDto trade_button_metadata, List<String> event_ids, String banner_text, Integer default_round_index) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        return new EventBracketDto(new Surrogate(id, end_time, name, background_image_url, trade_button_metadata, event_ids, banner_text, default_round_index));
    }

    @Override // com.robinhood.idl.Dto
    public EventBracket toProto() {
        String id = this.surrogate.getId();
        Instant end_time = this.surrogate.getEnd_time();
        String name = this.surrogate.getName();
        String background_image_url = this.surrogate.getBackground_image_url();
        EventBracketTradeButtonDto trade_button_metadata = this.surrogate.getTrade_button_metadata();
        EventBracketTradeButton proto = trade_button_metadata != null ? trade_button_metadata.toProto() : null;
        List<String> event_ids = this.surrogate.getEvent_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_ids, 10));
        Iterator<T> it = event_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new EventBracket(id, end_time, name, background_image_url, proto, arrayList, this.surrogate.getBanner_text(), this.surrogate.getDefault_round_index(), null, 256, null);
    }

    public String toString() {
        return "[EventBracketDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventBracketDto) && Intrinsics.areEqual(((EventBracketDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventBracketDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u009a\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bq\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010$J!\u0010.\u001a\u0013\u0018\u00010\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J£\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0012HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010$RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010&R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\bA\u0010<\u001a\u0004\b@\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010*R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010,R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010$R1\u0010\u0013\u001a\u0013\u0018\u00010\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010L\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010/¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "end_time", "name", "background_image_url", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;", "trade_button_metadata", "", "event_ids", "banner_text", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "default_round_index", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$arsenal_v1_public_externalRelease", "(Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "()Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;", "component6", "()Ljava/util/List;", "component7", "component8", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lj$/time/Instant;", "getEnd_time", "getEnd_time$annotations", "getName", "getName$annotations", "getBackground_image_url", "getBackground_image_url$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketTradeButtonDto;", "getTrade_button_metadata", "getTrade_button_metadata$annotations", "Ljava/util/List;", "getEvent_ids", "getEvent_ids$annotations", "getBanner_text", "getBanner_text$annotations", "Ljava/lang/Integer;", "getDefault_round_index", "getDefault_round_index$annotations", "Companion", "$serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String background_image_url;
        private final String banner_text;
        private final Integer default_round_index;
        private final Instant end_time;
        private final List<String> event_ids;
        private final String id;
        private final String name;
        private final EventBracketTradeButtonDto trade_button_metadata;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventBracketDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventBracketDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, (String) null, (EventBracketTradeButtonDto) null, (List) null, (String) null, (Integer) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, String str3, EventBracketTradeButtonDto eventBracketTradeButtonDto, List list, String str4, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                instant = surrogate.end_time;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.background_image_url;
            }
            if ((i & 16) != 0) {
                eventBracketTradeButtonDto = surrogate.trade_button_metadata;
            }
            if ((i & 32) != 0) {
                list = surrogate.event_ids;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.banner_text;
            }
            if ((i & 128) != 0) {
                num = surrogate.default_round_index;
            }
            String str5 = str4;
            Integer num2 = num;
            EventBracketTradeButtonDto eventBracketTradeButtonDto2 = eventBracketTradeButtonDto;
            List list2 = list;
            return surrogate.copy(str, instant, str2, str3, eventBracketTradeButtonDto2, list2, str5, num2);
        }

        @SerialName("backgroundImageUrl")
        @JsonAnnotations2(names = {"background_image_url"})
        public static /* synthetic */ void getBackground_image_url$annotations() {
        }

        @SerialName("bannerText")
        @JsonAnnotations2(names = {"banner_text"})
        public static /* synthetic */ void getBanner_text$annotations() {
        }

        @SerialName("defaultRoundIndex")
        @JsonAnnotations2(names = {"default_round_index"})
        public static /* synthetic */ void getDefault_round_index$annotations() {
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("eventIds")
        @JsonAnnotations2(names = {"event_ids"})
        public static /* synthetic */ void getEvent_ids$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("tradeButtonMetadata")
        @JsonAnnotations2(names = {"trade_button_metadata"})
        public static /* synthetic */ void getTrade_button_metadata$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getEnd_time() {
            return this.end_time;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackground_image_url() {
            return this.background_image_url;
        }

        /* renamed from: component5, reason: from getter */
        public final EventBracketTradeButtonDto getTrade_button_metadata() {
            return this.trade_button_metadata;
        }

        public final List<String> component6() {
            return this.event_ids;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBanner_text() {
            return this.banner_text;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getDefault_round_index() {
            return this.default_round_index;
        }

        public final Surrogate copy(String id, Instant end_time, String name, String background_image_url, EventBracketTradeButtonDto trade_button_metadata, List<String> event_ids, String banner_text, Integer default_round_index) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(event_ids, "event_ids");
            return new Surrogate(id, end_time, name, background_image_url, trade_button_metadata, event_ids, banner_text, default_round_index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.end_time, surrogate.end_time) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.background_image_url, surrogate.background_image_url) && Intrinsics.areEqual(this.trade_button_metadata, surrogate.trade_button_metadata) && Intrinsics.areEqual(this.event_ids, surrogate.event_ids) && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.default_round_index, surrogate.default_round_index);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Instant instant = this.end_time;
            int iHashCode2 = (((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.name.hashCode()) * 31;
            String str = this.background_image_url;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            EventBracketTradeButtonDto eventBracketTradeButtonDto = this.trade_button_metadata;
            int iHashCode4 = (((iHashCode3 + (eventBracketTradeButtonDto == null ? 0 : eventBracketTradeButtonDto.hashCode())) * 31) + this.event_ids.hashCode()) * 31;
            String str2 = this.banner_text;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.default_round_index;
            return iHashCode5 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", end_time=" + this.end_time + ", name=" + this.name + ", background_image_url=" + this.background_image_url + ", trade_button_metadata=" + this.trade_button_metadata + ", event_ids=" + this.event_ids + ", banner_text=" + this.banner_text + ", default_round_index=" + this.default_round_index + ")";
        }

        /* compiled from: EventBracketDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventBracketDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, String str3, EventBracketTradeButtonDto eventBracketTradeButtonDto, List list, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.end_time = null;
            } else {
                this.end_time = instant;
            }
            if ((i & 4) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 8) == 0) {
                this.background_image_url = null;
            } else {
                this.background_image_url = str3;
            }
            if ((i & 16) == 0) {
                this.trade_button_metadata = null;
            } else {
                this.trade_button_metadata = eventBracketTradeButtonDto;
            }
            if ((i & 32) == 0) {
                this.event_ids = CollectionsKt.emptyList();
            } else {
                this.event_ids = list;
            }
            if ((i & 64) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str4;
            }
            if ((i & 128) == 0) {
                this.default_round_index = null;
            } else {
                this.default_round_index = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            Instant instant = self.end_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            String str = self.background_image_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            EventBracketTradeButtonDto eventBracketTradeButtonDto = self.trade_button_metadata;
            if (eventBracketTradeButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EventBracketTradeButtonDto.Serializer.INSTANCE, eventBracketTradeButtonDto);
            }
            if (!Intrinsics.areEqual(self.event_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.event_ids);
            }
            String str2 = self.banner_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.default_round_index;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(String id, Instant instant, String name, String str, EventBracketTradeButtonDto eventBracketTradeButtonDto, List<String> event_ids, String str2, Integer num) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(event_ids, "event_ids");
            this.id = id;
            this.end_time = instant;
            this.name = name;
            this.background_image_url = str;
            this.trade_button_metadata = eventBracketTradeButtonDto;
            this.event_ids = event_ids;
            this.banner_text = str2;
            this.default_round_index = num;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, String str3, EventBracketTradeButtonDto eventBracketTradeButtonDto, List list, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : eventBracketTradeButtonDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num);
        }

        public final String getId() {
            return this.id;
        }

        public final Instant getEnd_time() {
            return this.end_time;
        }

        public final String getName() {
            return this.name;
        }

        public final String getBackground_image_url() {
            return this.background_image_url;
        }

        public final EventBracketTradeButtonDto getTrade_button_metadata() {
            return this.trade_button_metadata;
        }

        public final List<String> getEvent_ids() {
            return this.event_ids;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final Integer getDefault_round_index() {
            return this.default_round_index;
        }
    }

    /* compiled from: EventBracketDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventBracketDto, EventBracket> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventBracketDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventBracketDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventBracketDto> getBinaryBase64Serializer() {
            return (KSerializer) EventBracketDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventBracket> getProtoAdapter() {
            return EventBracket.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventBracketDto getZeroValue() {
            return EventBracketDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventBracketDto fromProto(EventBracket proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Instant end_time = proto.getEnd_time();
            String name = proto.getName();
            String background_image_url = proto.getBackground_image_url();
            EventBracketTradeButton trade_button_metadata = proto.getTrade_button_metadata();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EventBracketTradeButtonDto eventBracketTradeButtonDtoFromProto = trade_button_metadata != null ? EventBracketTradeButtonDto.INSTANCE.fromProto(trade_button_metadata) : null;
            List<String> event_ids = proto.getEvent_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_ids, 10));
            Iterator<T> it = event_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new EventBracketDto(new Surrogate(id, end_time, name, background_image_url, eventBracketTradeButtonDtoFromProto, arrayList, proto.getBanner_text(), proto.getDefault_round_index()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventBracketDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventBracketDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EventBracketDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventBracketDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventBracketDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.EventBracket", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventBracketDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventBracketDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventBracketDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventBracketDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventBracketDto";
        }
    }
}
