package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.ActionDto;
import gold_flow.proto.p466v1.GoldFlowScreenDto;
import gold_flow.proto.p466v1.PresentationTypeDto;
import gold_flow.proto.p466v1.PushScreenDto;
import gold_flow.proto.p466v1.TransitionAnimationDto;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PushScreenDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006-"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/PushScreen;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/PushScreenDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/PushScreenDto$Surrogate;)V", "Lgold_flow/proto/v1/GoldFlowScreenDto;", "screen", "", "", "generic_args", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/TransitionAnimationDto;", "transition_animation", "Lgold_flow/proto/v1/ActionDto;", "custom_back_action", "", "dismiss_on_custom_back_action", "(Lgold_flow/proto/v1/GoldFlowScreenDto;Ljava/util/Map;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;)V", "toProto", "()Lgold_flow/proto/v1/PushScreen;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/PushScreenDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class PushScreenDto implements Dto3<PushScreen>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PushScreenDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PushScreenDto, PushScreen>> binaryBase64Serializer$delegate;
    private static final PushScreenDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PushScreenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PushScreenDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PushScreenDto(gold_flow.proto.p466v1.GoldFlowScreenDto r2, java.util.Map r3, gold_flow.proto.p466v1.PresentationTypeDto r4, gold_flow.proto.p466v1.TransitionAnimationDto r5, gold_flow.proto.p466v1.ActionDto r6, java.lang.Boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            gold_flow.proto.v1.GoldFlowScreenDto$Companion r2 = gold_flow.proto.p466v1.GoldFlowScreenDto.INSTANCE
            gold_flow.proto.v1.GoldFlowScreenDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            if (r9 == 0) goto L12
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
        L12:
            r9 = r8 & 4
            if (r9 == 0) goto L1c
            gold_flow.proto.v1.PresentationTypeDto$Companion r4 = gold_flow.proto.p466v1.PresentationTypeDto.INSTANCE
            gold_flow.proto.v1.PresentationTypeDto r4 = r4.getZeroValue()
        L1c:
            r9 = r8 & 8
            if (r9 == 0) goto L26
            gold_flow.proto.v1.TransitionAnimationDto$Companion r5 = gold_flow.proto.p466v1.TransitionAnimationDto.INSTANCE
            gold_flow.proto.v1.TransitionAnimationDto r5 = r5.getZeroValue()
        L26:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L2c
            r6 = r0
        L2c:
            r8 = r8 & 32
            if (r8 == 0) goto L38
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3f
        L38:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gold_flow.proto.p466v1.PushScreenDto.<init>(gold_flow.proto.v1.GoldFlowScreenDto, java.util.Map, gold_flow.proto.v1.PresentationTypeDto, gold_flow.proto.v1.TransitionAnimationDto, gold_flow.proto.v1.ActionDto, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushScreenDto(GoldFlowScreenDto screen, Map<String, String> generic_args, PresentationTypeDto presentation_type, TransitionAnimationDto transition_animation, ActionDto actionDto, Boolean bool) {
        this(new Surrogate(screen, generic_args, presentation_type, transition_animation, actionDto, bool));
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PushScreen toProto() {
        GoldFlowScreen goldFlowScreen = (GoldFlowScreen) this.surrogate.getScreen().toProto();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getGeneric_args().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        PresentationType presentationType = (PresentationType) this.surrogate.getPresentation_type().toProto();
        TransitionAnimation transitionAnimation = (TransitionAnimation) this.surrogate.getTransition_animation().toProto();
        ActionDto custom_back_action = this.surrogate.getCustom_back_action();
        return new PushScreen(goldFlowScreen, linkedHashMap, presentationType, transitionAnimation, custom_back_action != null ? custom_back_action.toProto() : null, this.surrogate.getDismiss_on_custom_back_action(), null, 64, null);
    }

    public String toString() {
        return "[PushScreenDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PushScreenDto) && Intrinsics.areEqual(((PushScreenDto) other).surrogate, this.surrogate);
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
    /* compiled from: PushScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R,\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010*\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto$Surrogate;", "", "Lgold_flow/proto/v1/GoldFlowScreenDto;", "screen", "", "", "generic_args", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/TransitionAnimationDto;", "transition_animation", "Lgold_flow/proto/v1/ActionDto;", "custom_back_action", "", "dismiss_on_custom_back_action", "<init>", "(Lgold_flow/proto/v1/GoldFlowScreenDto;Ljava/util/Map;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgold_flow/proto/v1/GoldFlowScreenDto;Ljava/util/Map;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/PushScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/GoldFlowScreenDto;", "getScreen", "()Lgold_flow/proto/v1/GoldFlowScreenDto;", "getScreen$annotations", "()V", "Ljava/util/Map;", "getGeneric_args", "()Ljava/util/Map;", "getGeneric_args$annotations", "Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type$annotations", "Lgold_flow/proto/v1/TransitionAnimationDto;", "getTransition_animation", "()Lgold_flow/proto/v1/TransitionAnimationDto;", "getTransition_animation$annotations", "Lgold_flow/proto/v1/ActionDto;", "getCustom_back_action", "()Lgold_flow/proto/v1/ActionDto;", "getCustom_back_action$annotations", "Ljava/lang/Boolean;", "getDismiss_on_custom_back_action", "()Ljava/lang/Boolean;", "getDismiss_on_custom_back_action$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ActionDto custom_back_action;
        private final Boolean dismiss_on_custom_back_action;
        private final Map<String, String> generic_args;
        private final PresentationTypeDto presentation_type;
        private final GoldFlowScreenDto screen;
        private final TransitionAnimationDto transition_animation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.PushScreenDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PushScreenDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((GoldFlowScreenDto) null, (Map) null, (PresentationTypeDto) null, (TransitionAnimationDto) null, (ActionDto) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.screen == surrogate.screen && Intrinsics.areEqual(this.generic_args, surrogate.generic_args) && this.presentation_type == surrogate.presentation_type && this.transition_animation == surrogate.transition_animation && Intrinsics.areEqual(this.custom_back_action, surrogate.custom_back_action) && Intrinsics.areEqual(this.dismiss_on_custom_back_action, surrogate.dismiss_on_custom_back_action);
        }

        public int hashCode() {
            int iHashCode = ((((((this.screen.hashCode() * 31) + this.generic_args.hashCode()) * 31) + this.presentation_type.hashCode()) * 31) + this.transition_animation.hashCode()) * 31;
            ActionDto actionDto = this.custom_back_action;
            int iHashCode2 = (iHashCode + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            Boolean bool = this.dismiss_on_custom_back_action;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(screen=" + this.screen + ", generic_args=" + this.generic_args + ", presentation_type=" + this.presentation_type + ", transition_animation=" + this.transition_animation + ", custom_back_action=" + this.custom_back_action + ", dismiss_on_custom_back_action=" + this.dismiss_on_custom_back_action + ")";
        }

        /* compiled from: PushScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/PushScreenDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PushScreenDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GoldFlowScreenDto goldFlowScreenDto, Map map, PresentationTypeDto presentationTypeDto, TransitionAnimationDto transitionAnimationDto, ActionDto actionDto, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            this.screen = (i & 1) == 0 ? GoldFlowScreenDto.INSTANCE.getZeroValue() : goldFlowScreenDto;
            if ((i & 2) == 0) {
                this.generic_args = MapsKt.emptyMap();
            } else {
                this.generic_args = map;
            }
            if ((i & 4) == 0) {
                this.presentation_type = PresentationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.presentation_type = presentationTypeDto;
            }
            if ((i & 8) == 0) {
                this.transition_animation = TransitionAnimationDto.INSTANCE.getZeroValue();
            } else {
                this.transition_animation = transitionAnimationDto;
            }
            if ((i & 16) == 0) {
                this.custom_back_action = null;
            } else {
                this.custom_back_action = actionDto;
            }
            if ((i & 32) == 0) {
                this.dismiss_on_custom_back_action = null;
            } else {
                this.dismiss_on_custom_back_action = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.screen != GoldFlowScreenDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, GoldFlowScreenDto.Serializer.INSTANCE, self.screen);
            }
            if (!Intrinsics.areEqual(self.generic_args, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.generic_args);
            }
            if (self.presentation_type != PresentationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PresentationTypeDto.Serializer.INSTANCE, self.presentation_type);
            }
            if (self.transition_animation != TransitionAnimationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TransitionAnimationDto.Serializer.INSTANCE, self.transition_animation);
            }
            ActionDto actionDto = self.custom_back_action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ActionDto.Serializer.INSTANCE, actionDto);
            }
            Boolean bool = self.dismiss_on_custom_back_action;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(GoldFlowScreenDto screen, Map<String, String> generic_args, PresentationTypeDto presentation_type, TransitionAnimationDto transition_animation, ActionDto actionDto, Boolean bool) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(generic_args, "generic_args");
            Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
            Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
            this.screen = screen;
            this.generic_args = generic_args;
            this.presentation_type = presentation_type;
            this.transition_animation = transition_animation;
            this.custom_back_action = actionDto;
            this.dismiss_on_custom_back_action = bool;
        }

        public final GoldFlowScreenDto getScreen() {
            return this.screen;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(gold_flow.proto.p466v1.GoldFlowScreenDto r2, java.util.Map r3, gold_flow.proto.p466v1.PresentationTypeDto r4, gold_flow.proto.p466v1.TransitionAnimationDto r5, gold_flow.proto.p466v1.ActionDto r6, java.lang.Boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                gold_flow.proto.v1.GoldFlowScreenDto$Companion r2 = gold_flow.proto.p466v1.GoldFlowScreenDto.INSTANCE
                gold_flow.proto.v1.GoldFlowScreenDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                if (r9 == 0) goto L12
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
            L12:
                r9 = r8 & 4
                if (r9 == 0) goto L1c
                gold_flow.proto.v1.PresentationTypeDto$Companion r4 = gold_flow.proto.p466v1.PresentationTypeDto.INSTANCE
                gold_flow.proto.v1.PresentationTypeDto r4 = r4.getZeroValue()
            L1c:
                r9 = r8 & 8
                if (r9 == 0) goto L26
                gold_flow.proto.v1.TransitionAnimationDto$Companion r5 = gold_flow.proto.p466v1.TransitionAnimationDto.INSTANCE
                gold_flow.proto.v1.TransitionAnimationDto r5 = r5.getZeroValue()
            L26:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L2c
                r6 = r0
            L2c:
                r8 = r8 & 32
                if (r8 == 0) goto L38
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3f
            L38:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3f:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gold_flow.proto.p466v1.PushScreenDto.Surrogate.<init>(gold_flow.proto.v1.GoldFlowScreenDto, java.util.Map, gold_flow.proto.v1.PresentationTypeDto, gold_flow.proto.v1.TransitionAnimationDto, gold_flow.proto.v1.ActionDto, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Map<String, String> getGeneric_args() {
            return this.generic_args;
        }

        public final PresentationTypeDto getPresentation_type() {
            return this.presentation_type;
        }

        public final TransitionAnimationDto getTransition_animation() {
            return this.transition_animation;
        }

        public final ActionDto getCustom_back_action() {
            return this.custom_back_action;
        }

        public final Boolean getDismiss_on_custom_back_action() {
            return this.dismiss_on_custom_back_action;
        }
    }

    /* compiled from: PushScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/PushScreenDto;", "Lgold_flow/proto/v1/PushScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/PushScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PushScreenDto, PushScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PushScreenDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PushScreenDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PushScreenDto> getBinaryBase64Serializer() {
            return (KSerializer) PushScreenDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PushScreen> getProtoAdapter() {
            return PushScreen.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PushScreenDto getZeroValue() {
            return PushScreenDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PushScreenDto fromProto(PushScreen proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GoldFlowScreenDto goldFlowScreenDtoFromProto = GoldFlowScreenDto.INSTANCE.fromProto(proto.getScreen());
            Set<Map.Entry<String, String>> setEntrySet = proto.getGeneric_args().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            PresentationTypeDto presentationTypeDtoFromProto = PresentationTypeDto.INSTANCE.fromProto(proto.getPresentation_type());
            TransitionAnimationDto transitionAnimationDtoFromProto = TransitionAnimationDto.INSTANCE.fromProto(proto.getTransition_animation());
            Action custom_back_action = proto.getCustom_back_action();
            return new PushScreenDto(new Surrogate(goldFlowScreenDtoFromProto, linkedHashMap, presentationTypeDtoFromProto, transitionAnimationDtoFromProto, custom_back_action != null ? ActionDto.INSTANCE.fromProto(custom_back_action) : null, proto.getDismiss_on_custom_back_action()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.PushScreenDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PushScreenDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PushScreenDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PushScreenDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/PushScreenDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/PushScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<PushScreenDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.PushScreen", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PushScreenDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PushScreenDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PushScreenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PushScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.PushScreenDto";
        }
    }
}
