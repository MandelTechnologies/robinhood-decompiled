package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.TransferActionDto;
import bff_money_movement.service.p019v1.TransferButtonDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TransferValidationErrorDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;)V", "", "title", "subtitle", "", "Lbff_money_movement/service/v1/TransferActionDto;", "markdown_actions", "", "Lbff_money_movement/service/v1/TransferButtonDto;", CarResultComposable2.BUTTONS, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "toProto", "()Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;", "getTitle", "getSubtitle", "getButtons", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TransferValidationErrorDetailsDto implements Dto3<TransferValidationErrorDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TransferValidationErrorDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferValidationErrorDetailsDto, TransferValidationErrorDetails>> binaryBase64Serializer$delegate;
    private static final TransferValidationErrorDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TransferValidationErrorDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferValidationErrorDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final List<TransferButtonDto> getButtons() {
        return this.surrogate.getButtons();
    }

    public /* synthetic */ TransferValidationErrorDetailsDto(String str, String str2, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferValidationErrorDetailsDto(String title, String subtitle, Map<String, TransferActionDto> markdown_actions, List<TransferButtonDto> buttons) {
        this(new Surrogate(title, subtitle, markdown_actions, buttons));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(markdown_actions, "markdown_actions");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
    }

    @Override // com.robinhood.idl.Dto
    public TransferValidationErrorDetails toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        Set<Map.Entry<String, TransferActionDto>> setEntrySet = this.surrogate.getMarkdown_actions().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), ((TransferActionDto) entry.getValue()).toProto());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        List<TransferButtonDto> buttons = this.surrogate.getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        Iterator<T> it2 = buttons.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TransferButtonDto) it2.next()).toProto());
        }
        return new TransferValidationErrorDetails(title, subtitle, linkedHashMap, arrayList, null, 16, null);
    }

    public String toString() {
        return "[TransferValidationErrorDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TransferValidationErrorDetailsDto) && Intrinsics.areEqual(((TransferValidationErrorDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: TransferValidationErrorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;", "", "", "title", "subtitle", "", "Lbff_money_movement/service/v1/TransferActionDto;", "markdown_actions", "", "Lbff_money_movement/service/v1/TransferButtonDto;", CarResultComposable2.BUTTONS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Ljava/util/Map;", "getMarkdown_actions", "()Ljava/util/Map;", "getMarkdown_actions$annotations", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getButtons$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<TransferButtonDto> buttons;
        private final Map<String, TransferActionDto> markdown_actions;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (Map) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, TransferActionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(TransferButtonDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.markdown_actions, surrogate.markdown_actions) && Intrinsics.areEqual(this.buttons, surrogate.buttons);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.markdown_actions.hashCode()) * 31) + this.buttons.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", markdown_actions=" + this.markdown_actions + ", buttons=" + this.buttons + ")";
        }

        /* compiled from: TransferValidationErrorDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TransferValidationErrorDetailsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.TransferValidationErrorDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferValidationErrorDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.TransferValidationErrorDetailsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferValidationErrorDetailsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Map map, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.markdown_actions = MapsKt.emptyMap();
            } else {
                this.markdown_actions = map;
            }
            if ((i & 8) == 0) {
                this.buttons = CollectionsKt.emptyList();
            } else {
                this.buttons = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.markdown_actions, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.markdown_actions);
            }
            if (Intrinsics.areEqual(self.buttons, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.buttons);
        }

        public Surrogate(String title, String subtitle, Map<String, TransferActionDto> markdown_actions, List<TransferButtonDto> buttons) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(markdown_actions, "markdown_actions");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.title = title;
            this.subtitle = subtitle;
            this.markdown_actions = markdown_actions;
            this.buttons = buttons;
        }

        public /* synthetic */ Surrogate(String str, String str2, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Map<String, TransferActionDto> getMarkdown_actions() {
            return this.markdown_actions;
        }

        public final List<TransferButtonDto> getButtons() {
            return this.buttons;
        }
    }

    /* compiled from: TransferValidationErrorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TransferValidationErrorDetailsDto, TransferValidationErrorDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferValidationErrorDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferValidationErrorDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferValidationErrorDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferValidationErrorDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferValidationErrorDetails> getProtoAdapter() {
            return TransferValidationErrorDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferValidationErrorDetailsDto getZeroValue() {
            return TransferValidationErrorDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferValidationErrorDetailsDto fromProto(TransferValidationErrorDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            Set<Map.Entry<String, TransferAction>> setEntrySet = proto.getMarkdown_actions().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), TransferActionDto.INSTANCE.fromProto((TransferAction) entry.getValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            List<TransferButton> buttons = proto.getButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            Iterator<T> it2 = buttons.iterator();
            while (it2.hasNext()) {
                arrayList.add(TransferButtonDto.INSTANCE.fromProto((TransferButton) it2.next()));
            }
            return new TransferValidationErrorDetailsDto(new Surrogate(title, subtitle, linkedHashMap, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.TransferValidationErrorDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferValidationErrorDetailsDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new TransferValidationErrorDetailsDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferValidationErrorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<TransferValidationErrorDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.TransferValidationErrorDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferValidationErrorDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TransferValidationErrorDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TransferValidationErrorDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TransferValidationErrorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.TransferValidationErrorDetailsDto";
        }
    }
}
