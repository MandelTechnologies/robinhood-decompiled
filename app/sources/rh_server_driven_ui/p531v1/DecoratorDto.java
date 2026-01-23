package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.UnitSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.BorderDto;
import rh_server_driven_ui.p531v1.Decorator;
import rh_server_driven_ui.p531v1.DecoratorDto;
import rh_server_driven_ui.p531v1.MarkdownTextDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: DecoratorDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", "component", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "modifiers", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;", "getComponent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getModifiers", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "Companion", "Surrogate", "ModifiersDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class DecoratorDto implements Dto3<Decorator>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DecoratorDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DecoratorDto, Decorator>> binaryBase64Serializer$delegate;
    private static final DecoratorDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DecoratorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DecoratorDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UIComponentDto getComponent() {
        return this.surrogate.getComponent();
    }

    public final ModifiersDto getModifiers() {
        return this.surrogate.getModifiers();
    }

    public DecoratorDto(UIComponentDto uIComponentDto, ModifiersDto modifiersDto) {
        this(new Surrogate(uIComponentDto, modifiersDto));
    }

    public /* synthetic */ DecoratorDto(UIComponentDto uIComponentDto, ModifiersDto modifiersDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : modifiersDto);
    }

    @Override // com.robinhood.idl.Dto
    public Decorator toProto() {
        UIComponentDto component = this.surrogate.getComponent();
        UIComponent proto = component != null ? component.toProto() : null;
        ModifiersDto modifiers = this.surrogate.getModifiers();
        return new Decorator(proto, modifiers != null ? modifiers.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[DecoratorDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DecoratorDto) && Intrinsics.areEqual(((DecoratorDto) other).surrogate, this.surrogate);
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
    /* compiled from: DecoratorDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "component", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "modifiers", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getComponent", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getComponent$annotations", "()V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "getModifiers", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "getModifiers$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UIComponentDto component;
        private final ModifiersDto modifiers;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((UIComponentDto) null, (ModifiersDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.component, surrogate.component) && Intrinsics.areEqual(this.modifiers, surrogate.modifiers);
        }

        public int hashCode() {
            UIComponentDto uIComponentDto = this.component;
            int iHashCode = (uIComponentDto == null ? 0 : uIComponentDto.hashCode()) * 31;
            ModifiersDto modifiersDto = this.modifiers;
            return iHashCode + (modifiersDto != null ? modifiersDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(component=" + this.component + ", modifiers=" + this.modifiers + ")";
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DecoratorDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, ModifiersDto modifiersDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.component = null;
            } else {
                this.component = uIComponentDto;
            }
            if ((i & 2) == 0) {
                this.modifiers = null;
            } else {
                this.modifiers = modifiersDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UIComponentDto uIComponentDto = self.component;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            ModifiersDto modifiersDto = self.modifiers;
            if (modifiersDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ModifiersDto.Serializer.INSTANCE, modifiersDto);
            }
        }

        public Surrogate(UIComponentDto uIComponentDto, ModifiersDto modifiersDto) {
            this.component = uIComponentDto;
            this.modifiers = modifiersDto;
        }

        public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, ModifiersDto modifiersDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : modifiersDto);
        }

        public final UIComponentDto getComponent() {
            return this.component;
        }

        public final ModifiersDto getModifiers() {
            return this.modifiers;
        }
    }

    /* compiled from: DecoratorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto;", "Lrh_server_driven_ui/v1/Decorator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DecoratorDto, Decorator> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DecoratorDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DecoratorDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DecoratorDto> getBinaryBase64Serializer() {
            return (KSerializer) DecoratorDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Decorator> getProtoAdapter() {
            return Decorator.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DecoratorDto getZeroValue() {
            return DecoratorDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DecoratorDto fromProto(Decorator proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UIComponent component = proto.getComponent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = component != null ? UIComponentDto.INSTANCE.fromProto(component) : null;
            Decorator.Modifiers modifiers = proto.getModifiers();
            return new DecoratorDto(new Surrogate(uIComponentDtoFromProto, modifiers != null ? ModifiersDto.INSTANCE.fromProto(modifiers) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DecoratorDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DecoratorDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DecoratorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b(\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\fTSUVWXYZ[\\]^B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bß\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u0006\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b<\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bA\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006_"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;)V", "", "identifier", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "Lrh_server_driven_ui/v1/BorderDto;", "border", "", "corner_radius", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "insets", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "gutter_behavior", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "sizing", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "analytics_event_descriptor", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "gold_shimmer", "Lrh_server_driven_ui/v1/ActionDto;", "on_tap_action", "on_will_appear", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "accessibility", "tag", "", "alpha", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "tooltip", "test_tag", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "background_gradient", "background_color_opacity", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/BorderDto;ILrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;Ljava/lang/Integer;Ljava/lang/Float;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;Ljava/lang/Float;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;", "getIdentifier", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBorder", "()Lrh_server_driven_ui/v1/BorderDto;", "getCorner_radius", "getInsets", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "getGutter_behavior", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "getSizing", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "getAnalytics_event_descriptor", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "getGold_shimmer", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "getOn_tap_action", "()Lrh_server_driven_ui/v1/ActionDto;", "getOn_will_appear", "getAlpha", "()Ljava/lang/Float;", "getBackground_gradient", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "Companion", "Surrogate", "InsetsDto", "GutterBehaviorDto", "SizingDto", "AnalyticsEventDescriptorDto", "GoldShimmerDto", "AccessibilityModifierDto", "TooltipDto", "BackgroundGradientDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ModifiersDto implements Dto3<Decorator.Modifiers>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ModifiersDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ModifiersDto, Decorator.Modifiers>> binaryBase64Serializer$delegate;
        private static final ModifiersDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ModifiersDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ModifiersDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getIdentifier() {
            return this.surrogate.getIdentifier();
        }

        public final ThemedColorDto getBackground_color() {
            return this.surrogate.getBackground_color();
        }

        public final BorderDto getBorder() {
            return this.surrogate.getBorder();
        }

        public final int getCorner_radius() {
            return this.surrogate.getCorner_radius();
        }

        public final InsetsDto getInsets() {
            return this.surrogate.getInsets();
        }

        public final GutterBehaviorDto getGutter_behavior() {
            return this.surrogate.getGutter_behavior();
        }

        public final SizingDto getSizing() {
            return this.surrogate.getSizing();
        }

        public final AnalyticsEventDescriptorDto getAnalytics_event_descriptor() {
            return this.surrogate.getAnalytics_event_descriptor();
        }

        public final GoldShimmerDto getGold_shimmer() {
            return this.surrogate.getGold_shimmer();
        }

        public final ActionDto getOn_tap_action() {
            return this.surrogate.getOn_tap_action();
        }

        public final ActionDto getOn_will_appear() {
            return this.surrogate.getOn_will_appear();
        }

        public final Float getAlpha() {
            return this.surrogate.getAlpha();
        }

        public final BackgroundGradientDto getBackground_gradient() {
            return this.surrogate.getBackground_gradient();
        }

        public /* synthetic */ ModifiersDto(String str, ThemedColorDto themedColorDto, BorderDto borderDto, int i, InsetsDto insetsDto, GutterBehaviorDto gutterBehaviorDto, SizingDto sizingDto, AnalyticsEventDescriptorDto analyticsEventDescriptorDto, GoldShimmerDto goldShimmerDto, ActionDto actionDto, ActionDto actionDto2, AccessibilityModifierDto accessibilityModifierDto, Integer num, Float f, TooltipDto tooltipDto, String str2, BackgroundGradientDto backgroundGradientDto, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : themedColorDto, (i2 & 4) != 0 ? null : borderDto, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : insetsDto, (i2 & 32) != 0 ? null : gutterBehaviorDto, (i2 & 64) != 0 ? null : sizingDto, (i2 & 128) != 0 ? null : analyticsEventDescriptorDto, (i2 & 256) != 0 ? null : goldShimmerDto, (i2 & 512) != 0 ? null : actionDto, (i2 & 1024) != 0 ? null : actionDto2, (i2 & 2048) != 0 ? null : accessibilityModifierDto, (i2 & 4096) != 0 ? null : num, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : tooltipDto, (i2 & 32768) != 0 ? null : str2, (i2 & 65536) != 0 ? null : backgroundGradientDto, (i2 & 131072) != 0 ? null : f2);
        }

        public ModifiersDto(String str, ThemedColorDto themedColorDto, BorderDto borderDto, int i, InsetsDto insetsDto, GutterBehaviorDto gutterBehaviorDto, SizingDto sizingDto, AnalyticsEventDescriptorDto analyticsEventDescriptorDto, GoldShimmerDto goldShimmerDto, ActionDto actionDto, ActionDto actionDto2, AccessibilityModifierDto accessibilityModifierDto, Integer num, Float f, TooltipDto tooltipDto, String str2, BackgroundGradientDto backgroundGradientDto, Float f2) {
            this(new Surrogate(str, themedColorDto, borderDto, i, insetsDto, gutterBehaviorDto, sizingDto, analyticsEventDescriptorDto, goldShimmerDto, actionDto, actionDto2, accessibilityModifierDto, num, f, tooltipDto, str2, backgroundGradientDto, f2));
        }

        @Override // com.robinhood.idl.Dto
        public Decorator.Modifiers toProto() {
            String identifier = this.surrogate.getIdentifier();
            ThemedColorDto background_color = this.surrogate.getBackground_color();
            ThemedColor proto = background_color != null ? background_color.toProto() : null;
            BorderDto border = this.surrogate.getBorder();
            Border proto2 = border != null ? border.toProto() : null;
            int corner_radius = this.surrogate.getCorner_radius();
            InsetsDto insets = this.surrogate.getInsets();
            Decorator.Modifiers.Insets proto3 = insets != null ? insets.toProto() : null;
            GutterBehaviorDto gutter_behavior = this.surrogate.getGutter_behavior();
            Decorator.Modifiers.GutterBehavior proto4 = gutter_behavior != null ? gutter_behavior.toProto() : null;
            SizingDto sizing = this.surrogate.getSizing();
            Decorator.Modifiers.Sizing proto5 = sizing != null ? sizing.toProto() : null;
            AnalyticsEventDescriptorDto analytics_event_descriptor = this.surrogate.getAnalytics_event_descriptor();
            Decorator.Modifiers.AnalyticsEventDescriptor proto6 = analytics_event_descriptor != null ? analytics_event_descriptor.toProto() : null;
            GoldShimmerDto gold_shimmer = this.surrogate.getGold_shimmer();
            Decorator.Modifiers.GoldShimmer proto7 = gold_shimmer != null ? gold_shimmer.toProto() : null;
            ActionDto on_tap_action = this.surrogate.getOn_tap_action();
            Action proto8 = on_tap_action != null ? on_tap_action.toProto() : null;
            ActionDto on_will_appear = this.surrogate.getOn_will_appear();
            Action proto9 = on_will_appear != null ? on_will_appear.toProto() : null;
            AccessibilityModifierDto accessibility = this.surrogate.getAccessibility();
            Decorator.Modifiers.AccessibilityModifier proto10 = accessibility != null ? accessibility.toProto() : null;
            Integer tag = this.surrogate.getTag();
            Float alpha = this.surrogate.getAlpha();
            TooltipDto tooltip = this.surrogate.getTooltip();
            Decorator.Modifiers.Tooltip proto11 = tooltip != null ? tooltip.toProto() : null;
            String test_tag = this.surrogate.getTest_tag();
            BackgroundGradientDto background_gradient = this.surrogate.getBackground_gradient();
            return new Decorator.Modifiers(identifier, proto, proto2, corner_radius, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, tag, alpha, proto11, test_tag, background_gradient != null ? background_gradient.toProto() : null, this.surrogate.getBackground_color_opacity(), null, 262144, null);
        }

        public String toString() {
            return "[ModifiersDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ModifiersDto) && Intrinsics.areEqual(((ModifiersDto) other).surrogate, this.surrogate);
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
        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bF\b\u0083\b\u0018\u0000 ~2\u00020\u0001:\u0002\u007f~B\u0099\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0019\b\u0002\u0010\u001c\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\u001f\u001a\u0013\u0018\u00010\u001d¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0019\b\u0002\u0010%\u001a\u0013\u0018\u00010\u001d¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u001e¢\u0006\u0004\b&\u0010'BÍ\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u00106R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bD\u0010@\u001a\u0004\bB\u0010CR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bH\u0010@\u001a\u0004\bF\u0010GR/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010I\u0012\u0004\bK\u0010@\u001a\u0004\bJ\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010L\u0012\u0004\bO\u0010@\u001a\u0004\bM\u0010NR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bS\u0010@\u001a\u0004\bQ\u0010RR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bW\u0010@\u001a\u0004\bU\u0010VR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010X\u0012\u0004\b[\u0010@\u001a\u0004\bY\u0010ZR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\\\u0012\u0004\b_\u0010@\u001a\u0004\b]\u0010^R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010`\u0012\u0004\bc\u0010@\u001a\u0004\ba\u0010bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010`\u0012\u0004\be\u0010@\u001a\u0004\bd\u0010bR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010f\u0012\u0004\bi\u0010@\u001a\u0004\bg\u0010hR1\u0010\u001c\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010j\u0012\u0004\bm\u0010@\u001a\u0004\bk\u0010lR1\u0010\u001f\u001a\u0013\u0018\u00010\u001d¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010n\u0012\u0004\bq\u0010@\u001a\u0004\bo\u0010pR\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010r\u0012\u0004\bu\u0010@\u001a\u0004\bs\u0010tR\"\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010=\u0012\u0004\bw\u0010@\u001a\u0004\bv\u00106R\"\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010x\u0012\u0004\b{\u0010@\u001a\u0004\by\u0010zR1\u0010%\u001a\u0013\u0018\u00010\u001d¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010n\u0012\u0004\b}\u0010@\u001a\u0004\b|\u0010p¨\u0006\u0080\u0001"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;", "", "", "identifier", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "Lrh_server_driven_ui/v1/BorderDto;", "border", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "corner_radius", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "insets", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "gutter_behavior", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "sizing", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "analytics_event_descriptor", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "gold_shimmer", "Lrh_server_driven_ui/v1/ActionDto;", "on_tap_action", "on_will_appear", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "accessibility", "tag", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "alpha", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "tooltip", "test_tag", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "background_gradient", "background_color_opacity", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/BorderDto;ILrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;Ljava/lang/Integer;Ljava/lang/Float;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;Ljava/lang/Float;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/BorderDto;ILrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;Ljava/lang/Integer;Ljava/lang/Float;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "Lrh_server_driven_ui/v1/BorderDto;", "getBorder", "()Lrh_server_driven_ui/v1/BorderDto;", "getBorder$annotations", "I", "getCorner_radius", "getCorner_radius$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "getInsets", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "getInsets$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "getGutter_behavior", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "getGutter_behavior$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "getSizing", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "getSizing$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "getAnalytics_event_descriptor", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "getAnalytics_event_descriptor$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "getGold_shimmer", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "getGold_shimmer$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getOn_tap_action", "()Lrh_server_driven_ui/v1/ActionDto;", "getOn_tap_action$annotations", "getOn_will_appear", "getOn_will_appear$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "getAccessibility", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "getAccessibility$annotations", "Ljava/lang/Integer;", "getTag", "()Ljava/lang/Integer;", "getTag$annotations", "Ljava/lang/Float;", "getAlpha", "()Ljava/lang/Float;", "getAlpha$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "getTooltip", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "getTooltip$annotations", "getTest_tag", "getTest_tag$annotations", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "getBackground_gradient", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "getBackground_gradient$annotations", "getBackground_color_opacity", "getBackground_color_opacity$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AccessibilityModifierDto accessibility;
            private final Float alpha;
            private final AnalyticsEventDescriptorDto analytics_event_descriptor;
            private final ThemedColorDto background_color;
            private final Float background_color_opacity;
            private final BackgroundGradientDto background_gradient;
            private final BorderDto border;
            private final int corner_radius;
            private final GoldShimmerDto gold_shimmer;
            private final GutterBehaviorDto gutter_behavior;
            private final String identifier;
            private final InsetsDto insets;
            private final ActionDto on_tap_action;
            private final ActionDto on_will_appear;
            private final SizingDto sizing;
            private final Integer tag;
            private final String test_tag;
            private final TooltipDto tooltip;

            public Surrogate() {
                this((String) null, (ThemedColorDto) null, (BorderDto) null, 0, (InsetsDto) null, (GutterBehaviorDto) null, (SizingDto) null, (AnalyticsEventDescriptorDto) null, (GoldShimmerDto) null, (ActionDto) null, (ActionDto) null, (AccessibilityModifierDto) null, (Integer) null, (Float) null, (TooltipDto) null, (String) null, (BackgroundGradientDto) null, (Float) null, 262143, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.border, surrogate.border) && this.corner_radius == surrogate.corner_radius && Intrinsics.areEqual(this.insets, surrogate.insets) && Intrinsics.areEqual(this.gutter_behavior, surrogate.gutter_behavior) && Intrinsics.areEqual(this.sizing, surrogate.sizing) && Intrinsics.areEqual(this.analytics_event_descriptor, surrogate.analytics_event_descriptor) && Intrinsics.areEqual(this.gold_shimmer, surrogate.gold_shimmer) && Intrinsics.areEqual(this.on_tap_action, surrogate.on_tap_action) && Intrinsics.areEqual(this.on_will_appear, surrogate.on_will_appear) && Intrinsics.areEqual(this.accessibility, surrogate.accessibility) && Intrinsics.areEqual(this.tag, surrogate.tag) && Intrinsics.areEqual((Object) this.alpha, (Object) surrogate.alpha) && Intrinsics.areEqual(this.tooltip, surrogate.tooltip) && Intrinsics.areEqual(this.test_tag, surrogate.test_tag) && Intrinsics.areEqual(this.background_gradient, surrogate.background_gradient) && Intrinsics.areEqual((Object) this.background_color_opacity, (Object) surrogate.background_color_opacity);
            }

            public int hashCode() {
                String str = this.identifier;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                ThemedColorDto themedColorDto = this.background_color;
                int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
                BorderDto borderDto = this.border;
                int iHashCode3 = (((iHashCode2 + (borderDto == null ? 0 : borderDto.hashCode())) * 31) + Integer.hashCode(this.corner_radius)) * 31;
                InsetsDto insetsDto = this.insets;
                int iHashCode4 = (iHashCode3 + (insetsDto == null ? 0 : insetsDto.hashCode())) * 31;
                GutterBehaviorDto gutterBehaviorDto = this.gutter_behavior;
                int iHashCode5 = (iHashCode4 + (gutterBehaviorDto == null ? 0 : gutterBehaviorDto.hashCode())) * 31;
                SizingDto sizingDto = this.sizing;
                int iHashCode6 = (iHashCode5 + (sizingDto == null ? 0 : sizingDto.hashCode())) * 31;
                AnalyticsEventDescriptorDto analyticsEventDescriptorDto = this.analytics_event_descriptor;
                int iHashCode7 = (iHashCode6 + (analyticsEventDescriptorDto == null ? 0 : analyticsEventDescriptorDto.hashCode())) * 31;
                GoldShimmerDto goldShimmerDto = this.gold_shimmer;
                int iHashCode8 = (iHashCode7 + (goldShimmerDto == null ? 0 : goldShimmerDto.hashCode())) * 31;
                ActionDto actionDto = this.on_tap_action;
                int iHashCode9 = (iHashCode8 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
                ActionDto actionDto2 = this.on_will_appear;
                int iHashCode10 = (iHashCode9 + (actionDto2 == null ? 0 : actionDto2.hashCode())) * 31;
                AccessibilityModifierDto accessibilityModifierDto = this.accessibility;
                int iHashCode11 = (iHashCode10 + (accessibilityModifierDto == null ? 0 : accessibilityModifierDto.hashCode())) * 31;
                Integer num = this.tag;
                int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
                Float f = this.alpha;
                int iHashCode13 = (iHashCode12 + (f == null ? 0 : f.hashCode())) * 31;
                TooltipDto tooltipDto = this.tooltip;
                int iHashCode14 = (iHashCode13 + (tooltipDto == null ? 0 : tooltipDto.hashCode())) * 31;
                String str2 = this.test_tag;
                int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
                BackgroundGradientDto backgroundGradientDto = this.background_gradient;
                int iHashCode16 = (iHashCode15 + (backgroundGradientDto == null ? 0 : backgroundGradientDto.hashCode())) * 31;
                Float f2 = this.background_color_opacity;
                return iHashCode16 + (f2 != null ? f2.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(identifier=" + this.identifier + ", background_color=" + this.background_color + ", border=" + this.border + ", corner_radius=" + this.corner_radius + ", insets=" + this.insets + ", gutter_behavior=" + this.gutter_behavior + ", sizing=" + this.sizing + ", analytics_event_descriptor=" + this.analytics_event_descriptor + ", gold_shimmer=" + this.gold_shimmer + ", on_tap_action=" + this.on_tap_action + ", on_will_appear=" + this.on_will_appear + ", accessibility=" + this.accessibility + ", tag=" + this.tag + ", alpha=" + this.alpha + ", tooltip=" + this.tooltip + ", test_tag=" + this.test_tag + ", background_gradient=" + this.background_gradient + ", background_color_opacity=" + this.background_color_opacity + ")";
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DecoratorDto$ModifiersDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, ThemedColorDto themedColorDto, BorderDto borderDto, int i2, InsetsDto insetsDto, GutterBehaviorDto gutterBehaviorDto, SizingDto sizingDto, AnalyticsEventDescriptorDto analyticsEventDescriptorDto, GoldShimmerDto goldShimmerDto, ActionDto actionDto, ActionDto actionDto2, AccessibilityModifierDto accessibilityModifierDto, Integer num, Float f, TooltipDto tooltipDto, String str2, BackgroundGradientDto backgroundGradientDto, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.identifier = null;
                } else {
                    this.identifier = str;
                }
                if ((i & 2) == 0) {
                    this.background_color = null;
                } else {
                    this.background_color = themedColorDto;
                }
                if ((i & 4) == 0) {
                    this.border = null;
                } else {
                    this.border = borderDto;
                }
                if ((i & 8) == 0) {
                    this.corner_radius = 0;
                } else {
                    this.corner_radius = i2;
                }
                if ((i & 16) == 0) {
                    this.insets = null;
                } else {
                    this.insets = insetsDto;
                }
                if ((i & 32) == 0) {
                    this.gutter_behavior = null;
                } else {
                    this.gutter_behavior = gutterBehaviorDto;
                }
                if ((i & 64) == 0) {
                    this.sizing = null;
                } else {
                    this.sizing = sizingDto;
                }
                if ((i & 128) == 0) {
                    this.analytics_event_descriptor = null;
                } else {
                    this.analytics_event_descriptor = analyticsEventDescriptorDto;
                }
                if ((i & 256) == 0) {
                    this.gold_shimmer = null;
                } else {
                    this.gold_shimmer = goldShimmerDto;
                }
                if ((i & 512) == 0) {
                    this.on_tap_action = null;
                } else {
                    this.on_tap_action = actionDto;
                }
                if ((i & 1024) == 0) {
                    this.on_will_appear = null;
                } else {
                    this.on_will_appear = actionDto2;
                }
                if ((i & 2048) == 0) {
                    this.accessibility = null;
                } else {
                    this.accessibility = accessibilityModifierDto;
                }
                if ((i & 4096) == 0) {
                    this.tag = null;
                } else {
                    this.tag = num;
                }
                if ((i & 8192) == 0) {
                    this.alpha = null;
                } else {
                    this.alpha = f;
                }
                if ((i & 16384) == 0) {
                    this.tooltip = null;
                } else {
                    this.tooltip = tooltipDto;
                }
                if ((32768 & i) == 0) {
                    this.test_tag = null;
                } else {
                    this.test_tag = str2;
                }
                if ((65536 & i) == 0) {
                    this.background_gradient = null;
                } else {
                    this.background_gradient = backgroundGradientDto;
                }
                if ((i & 131072) == 0) {
                    this.background_color_opacity = null;
                } else {
                    this.background_color_opacity = f2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                String str = self.identifier;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
                }
                ThemedColorDto themedColorDto = self.background_color;
                if (themedColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
                }
                BorderDto borderDto = self.border;
                if (borderDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, BorderDto.Serializer.INSTANCE, borderDto);
                }
                int i = self.corner_radius;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                InsetsDto insetsDto = self.insets;
                if (insetsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, InsetsDto.Serializer.INSTANCE, insetsDto);
                }
                GutterBehaviorDto gutterBehaviorDto = self.gutter_behavior;
                if (gutterBehaviorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, GutterBehaviorDto.Serializer.INSTANCE, gutterBehaviorDto);
                }
                SizingDto sizingDto = self.sizing;
                if (sizingDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, SizingDto.Serializer.INSTANCE, sizingDto);
                }
                AnalyticsEventDescriptorDto analyticsEventDescriptorDto = self.analytics_event_descriptor;
                if (analyticsEventDescriptorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, AnalyticsEventDescriptorDto.Serializer.INSTANCE, analyticsEventDescriptorDto);
                }
                GoldShimmerDto goldShimmerDto = self.gold_shimmer;
                if (goldShimmerDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, GoldShimmerDto.Serializer.INSTANCE, goldShimmerDto);
                }
                ActionDto actionDto = self.on_tap_action;
                if (actionDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 9, ActionDto.Serializer.INSTANCE, actionDto);
                }
                ActionDto actionDto2 = self.on_will_appear;
                if (actionDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, ActionDto.Serializer.INSTANCE, actionDto2);
                }
                AccessibilityModifierDto accessibilityModifierDto = self.accessibility;
                if (accessibilityModifierDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 11, AccessibilityModifierDto.Serializer.INSTANCE, accessibilityModifierDto);
                }
                Integer num = self.tag;
                if (num != null) {
                    output.encodeNullableSerializableElement(serialDesc, 12, SignedIntAsNumberSerializer.INSTANCE, num);
                }
                Float f = self.alpha;
                if (f != null) {
                    output.encodeNullableSerializableElement(serialDesc, 13, FloatAsNumberSerializer.INSTANCE, f);
                }
                TooltipDto tooltipDto = self.tooltip;
                if (tooltipDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 14, TooltipDto.Serializer.INSTANCE, tooltipDto);
                }
                String str2 = self.test_tag;
                if (str2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, str2);
                }
                BackgroundGradientDto backgroundGradientDto = self.background_gradient;
                if (backgroundGradientDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 16, BackgroundGradientDto.Serializer.INSTANCE, backgroundGradientDto);
                }
                Float f2 = self.background_color_opacity;
                if (f2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 17, FloatAsNumberSerializer.INSTANCE, f2);
                }
            }

            public Surrogate(String str, ThemedColorDto themedColorDto, BorderDto borderDto, int i, InsetsDto insetsDto, GutterBehaviorDto gutterBehaviorDto, SizingDto sizingDto, AnalyticsEventDescriptorDto analyticsEventDescriptorDto, GoldShimmerDto goldShimmerDto, ActionDto actionDto, ActionDto actionDto2, AccessibilityModifierDto accessibilityModifierDto, Integer num, Float f, TooltipDto tooltipDto, String str2, BackgroundGradientDto backgroundGradientDto, Float f2) {
                this.identifier = str;
                this.background_color = themedColorDto;
                this.border = borderDto;
                this.corner_radius = i;
                this.insets = insetsDto;
                this.gutter_behavior = gutterBehaviorDto;
                this.sizing = sizingDto;
                this.analytics_event_descriptor = analyticsEventDescriptorDto;
                this.gold_shimmer = goldShimmerDto;
                this.on_tap_action = actionDto;
                this.on_will_appear = actionDto2;
                this.accessibility = accessibilityModifierDto;
                this.tag = num;
                this.alpha = f;
                this.tooltip = tooltipDto;
                this.test_tag = str2;
                this.background_gradient = backgroundGradientDto;
                this.background_color_opacity = f2;
            }

            public /* synthetic */ Surrogate(String str, ThemedColorDto themedColorDto, BorderDto borderDto, int i, InsetsDto insetsDto, GutterBehaviorDto gutterBehaviorDto, SizingDto sizingDto, AnalyticsEventDescriptorDto analyticsEventDescriptorDto, GoldShimmerDto goldShimmerDto, ActionDto actionDto, ActionDto actionDto2, AccessibilityModifierDto accessibilityModifierDto, Integer num, Float f, TooltipDto tooltipDto, String str2, BackgroundGradientDto backgroundGradientDto, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : themedColorDto, (i2 & 4) != 0 ? null : borderDto, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : insetsDto, (i2 & 32) != 0 ? null : gutterBehaviorDto, (i2 & 64) != 0 ? null : sizingDto, (i2 & 128) != 0 ? null : analyticsEventDescriptorDto, (i2 & 256) != 0 ? null : goldShimmerDto, (i2 & 512) != 0 ? null : actionDto, (i2 & 1024) != 0 ? null : actionDto2, (i2 & 2048) != 0 ? null : accessibilityModifierDto, (i2 & 4096) != 0 ? null : num, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : tooltipDto, (i2 & 32768) != 0 ? null : str2, (i2 & 65536) != 0 ? null : backgroundGradientDto, (i2 & 131072) != 0 ? null : f2);
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public final ThemedColorDto getBackground_color() {
                return this.background_color;
            }

            public final BorderDto getBorder() {
                return this.border;
            }

            public final int getCorner_radius() {
                return this.corner_radius;
            }

            public final InsetsDto getInsets() {
                return this.insets;
            }

            public final GutterBehaviorDto getGutter_behavior() {
                return this.gutter_behavior;
            }

            public final SizingDto getSizing() {
                return this.sizing;
            }

            public final AnalyticsEventDescriptorDto getAnalytics_event_descriptor() {
                return this.analytics_event_descriptor;
            }

            public final GoldShimmerDto getGold_shimmer() {
                return this.gold_shimmer;
            }

            public final ActionDto getOn_tap_action() {
                return this.on_tap_action;
            }

            public final ActionDto getOn_will_appear() {
                return this.on_will_appear;
            }

            public final AccessibilityModifierDto getAccessibility() {
                return this.accessibility;
            }

            public final Integer getTag() {
                return this.tag;
            }

            public final Float getAlpha() {
                return this.alpha;
            }

            public final TooltipDto getTooltip() {
                return this.tooltip;
            }

            public final String getTest_tag() {
                return this.test_tag;
            }

            public final BackgroundGradientDto getBackground_gradient() {
                return this.background_gradient;
            }

            public final Float getBackground_color_opacity() {
                return this.background_color_opacity;
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ModifiersDto, Decorator.Modifiers> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ModifiersDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ModifiersDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ModifiersDto> getBinaryBase64Serializer() {
                return (KSerializer) ModifiersDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Decorator.Modifiers> getProtoAdapter() {
                return Decorator.Modifiers.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ModifiersDto getZeroValue() {
                return ModifiersDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ModifiersDto fromProto(Decorator.Modifiers proto) {
                ThemedColorDto themedColorDto;
                TooltipDto tooltipDtoFromProto;
                Intrinsics.checkNotNullParameter(proto, "proto");
                String identifier = proto.getIdentifier();
                ThemedColor background_color = proto.getBackground_color();
                ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
                Border border = proto.getBorder();
                BorderDto borderDtoFromProto = border != null ? BorderDto.INSTANCE.fromProto(border) : null;
                int corner_radius = proto.getCorner_radius();
                Decorator.Modifiers.Insets insets = proto.getInsets();
                InsetsDto insetsDtoFromProto = insets != null ? InsetsDto.INSTANCE.fromProto(insets) : null;
                Decorator.Modifiers.GutterBehavior gutter_behavior = proto.getGutter_behavior();
                GutterBehaviorDto gutterBehaviorDtoFromProto = gutter_behavior != null ? GutterBehaviorDto.INSTANCE.fromProto(gutter_behavior) : null;
                Decorator.Modifiers.Sizing sizing = proto.getSizing();
                SizingDto sizingDtoFromProto = sizing != null ? SizingDto.INSTANCE.fromProto(sizing) : null;
                Decorator.Modifiers.AnalyticsEventDescriptor analytics_event_descriptor = proto.getAnalytics_event_descriptor();
                AnalyticsEventDescriptorDto analyticsEventDescriptorDtoFromProto = analytics_event_descriptor != null ? AnalyticsEventDescriptorDto.INSTANCE.fromProto(analytics_event_descriptor) : null;
                Decorator.Modifiers.GoldShimmer gold_shimmer = proto.getGold_shimmer();
                GoldShimmerDto goldShimmerDtoFromProto = gold_shimmer != null ? GoldShimmerDto.INSTANCE.fromProto(gold_shimmer) : null;
                Action on_tap_action = proto.getOn_tap_action();
                ActionDto actionDtoFromProto = on_tap_action != null ? ActionDto.INSTANCE.fromProto(on_tap_action) : null;
                Action on_will_appear = proto.getOn_will_appear();
                ActionDto actionDtoFromProto2 = on_will_appear != null ? ActionDto.INSTANCE.fromProto(on_will_appear) : null;
                Decorator.Modifiers.AccessibilityModifier accessibility = proto.getAccessibility();
                AccessibilityModifierDto accessibilityModifierDtoFromProto = accessibility != null ? AccessibilityModifierDto.INSTANCE.fromProto(accessibility) : null;
                Integer tag = proto.getTag();
                Float alpha = proto.getAlpha();
                Decorator.Modifiers.Tooltip tooltip = proto.getTooltip();
                if (tooltip != null) {
                    ThemedColorDto themedColorDto2 = themedColorDtoFromProto;
                    tooltipDtoFromProto = TooltipDto.INSTANCE.fromProto(tooltip);
                    themedColorDto = themedColorDto2;
                } else {
                    themedColorDto = themedColorDtoFromProto;
                    tooltipDtoFromProto = null;
                }
                String test_tag = proto.getTest_tag();
                TooltipDto tooltipDto = tooltipDtoFromProto;
                Decorator.Modifiers.BackgroundGradient background_gradient = proto.getBackground_gradient();
                return new ModifiersDto(new Surrogate(identifier, themedColorDto, borderDtoFromProto, corner_radius, insetsDtoFromProto, gutterBehaviorDtoFromProto, sizingDtoFromProto, analyticsEventDescriptorDtoFromProto, goldShimmerDtoFromProto, actionDtoFromProto, actionDtoFromProto2, accessibilityModifierDtoFromProto, tag, alpha, tooltipDto, test_tag, background_gradient != null ? BackgroundGradientDto.INSTANCE.fromProto(background_gradient) : null, proto.getBackground_color_opacity()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DecoratorDto.ModifiersDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ModifiersDto(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;)V", "", "top", "left", "bottom", "right", "(IIII)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;", "getTop", "getLeft", "getBottom", "getRight", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class InsetsDto implements Dto3<Decorator.Modifiers.Insets>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<InsetsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<InsetsDto, Decorator.Modifiers.Insets>> binaryBase64Serializer$delegate;
            private static final InsetsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ InsetsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private InsetsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final int getTop() {
                return this.surrogate.getTop();
            }

            public final int getLeft() {
                return this.surrogate.getLeft();
            }

            public final int getBottom() {
                return this.surrogate.getBottom();
            }

            public final int getRight() {
                return this.surrogate.getRight();
            }

            public /* synthetic */ InsetsDto(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
            }

            public InsetsDto(int i, int i2, int i3, int i4) {
                this(new Surrogate(i, i2, i3, i4));
            }

            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.Insets toProto() {
                return new Decorator.Modifiers.Insets(this.surrogate.getTop(), this.surrogate.getLeft(), this.surrogate.getBottom(), this.surrogate.getRight(), null, 16, null);
            }

            public String toString() {
                return "[InsetsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof InsetsDto) && Intrinsics.areEqual(((InsetsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,Bk\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\n\u0010\u000bB;\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001dR/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001dR/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001dR/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001d¨\u0006."}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "top", "left", "bottom", "right", "<init>", "(IIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getTop$annotations", "()V", "getLeft", "getLeft$annotations", "getBottom", "getBottom$annotations", "getRight", "getRight$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final int bottom;
                private final int left;
                private final int right;
                private final int top;

                public Surrogate() {
                    this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.top == surrogate.top && this.left == surrogate.left && this.bottom == surrogate.bottom && this.right == surrogate.right;
                }

                public int hashCode() {
                    return (((((Integer.hashCode(this.top) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.right);
                }

                public String toString() {
                    return "Surrogate(top=" + this.top + ", left=" + this.left + ", bottom=" + this.bottom + ", right=" + this.right + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return DecoratorDto$ModifiersDto$InsetsDto$Surrogate$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.top = 0;
                    } else {
                        this.top = i2;
                    }
                    if ((i & 2) == 0) {
                        this.left = 0;
                    } else {
                        this.left = i3;
                    }
                    if ((i & 4) == 0) {
                        this.bottom = 0;
                    } else {
                        this.bottom = i4;
                    }
                    if ((i & 8) == 0) {
                        this.right = 0;
                    } else {
                        this.right = i5;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    int i = self.top;
                    if (i != 0) {
                        output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                    }
                    int i2 = self.left;
                    if (i2 != 0) {
                        output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
                    }
                    int i3 = self.bottom;
                    if (i3 != 0) {
                        output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
                    }
                    int i4 = self.right;
                    if (i4 != 0) {
                        output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
                    }
                }

                public Surrogate(int i, int i2, int i3, int i4) {
                    this.top = i;
                    this.left = i2;
                    this.bottom = i3;
                    this.right = i4;
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
                }

                public final int getTop() {
                    return this.top;
                }

                public final int getLeft() {
                    return this.left;
                }

                public final int getBottom() {
                    return this.bottom;
                }

                public final int getRight() {
                    return this.right;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Insets;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<InsetsDto, Decorator.Modifiers.Insets> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<InsetsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InsetsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InsetsDto> getBinaryBase64Serializer() {
                    return (KSerializer) InsetsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.Insets> getProtoAdapter() {
                    return Decorator.Modifiers.Insets.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InsetsDto getZeroValue() {
                    return InsetsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InsetsDto fromProto(Decorator.Modifiers.Insets proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new InsetsDto(new Surrogate(proto.getTop(), proto.getLeft(), proto.getBottom(), proto.getRight()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$InsetsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.InsetsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new InsetsDto(0, 0, 0, 0, 15, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<InsetsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.Insets", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, InsetsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public InsetsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new InsetsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$InsetsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$InsetsDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;)V", "", "no_gutter_horizontal", "(Z)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;", "getNo_gutter_horizontal", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class GutterBehaviorDto implements Dto3<Decorator.Modifiers.GutterBehavior>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<GutterBehaviorDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<GutterBehaviorDto, Decorator.Modifiers.GutterBehavior>> binaryBase64Serializer$delegate;
            private static final GutterBehaviorDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ GutterBehaviorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private GutterBehaviorDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final boolean getNo_gutter_horizontal() {
                return this.surrogate.getNo_gutter_horizontal();
            }

            public GutterBehaviorDto(boolean z) {
                this(new Surrogate(z));
            }

            public /* synthetic */ GutterBehaviorDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.GutterBehavior toProto() {
                return new Decorator.Modifiers.GutterBehavior(this.surrogate.getNo_gutter_horizontal(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[GutterBehaviorDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof GutterBehaviorDto) && Intrinsics.areEqual(((GutterBehaviorDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;", "", "", "no_gutter_horizontal", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNo_gutter_horizontal", "()Z", "getNo_gutter_horizontal$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final boolean no_gutter_horizontal;

                public Surrogate() {
                    this(false, 1, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && this.no_gutter_horizontal == ((Surrogate) other).no_gutter_horizontal;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.no_gutter_horizontal);
                }

                public String toString() {
                    return "Surrogate(no_gutter_horizontal=" + this.no_gutter_horizontal + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C48122x133ca8b7.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.no_gutter_horizontal = false;
                    } else {
                        this.no_gutter_horizontal = z;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    boolean z = self.no_gutter_horizontal;
                    if (z) {
                        output.encodeBooleanElement(serialDesc, 0, z);
                    }
                }

                public Surrogate(boolean z) {
                    this.no_gutter_horizontal = z;
                }

                public /* synthetic */ Surrogate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? false : z);
                }

                public final boolean getNo_gutter_horizontal() {
                    return this.no_gutter_horizontal;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GutterBehavior;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<GutterBehaviorDto, Decorator.Modifiers.GutterBehavior> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<GutterBehaviorDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<GutterBehaviorDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<GutterBehaviorDto> getBinaryBase64Serializer() {
                    return (KSerializer) GutterBehaviorDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.GutterBehavior> getProtoAdapter() {
                    return Decorator.Modifiers.GutterBehavior.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public GutterBehaviorDto getZeroValue() {
                    return GutterBehaviorDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public GutterBehaviorDto fromProto(Decorator.Modifiers.GutterBehavior proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new GutterBehaviorDto(new Surrogate(proto.getNo_gutter_horizontal()), null);
                }
            }

            static {
                DefaultConstructorMarker defaultConstructorMarker = null;
                Companion companion = new Companion(defaultConstructorMarker);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$GutterBehaviorDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.GutterBehaviorDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new GutterBehaviorDto(false, 1, defaultConstructorMarker);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<GutterBehaviorDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.GutterBehavior", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, GutterBehaviorDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public GutterBehaviorDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new GutterBehaviorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GutterBehaviorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$GutterBehaviorDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;)V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "vertical", "horizontal", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;", "getVertical", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "getHorizontal", "Companion", "Surrogate", "SizingPreferenceDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SizingDto implements Dto3<Decorator.Modifiers.Sizing>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SizingDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SizingDto, Decorator.Modifiers.Sizing>> binaryBase64Serializer$delegate;
            private static final SizingDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SizingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SizingDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final SizingPreferenceDto getVertical() {
                return this.surrogate.getVertical();
            }

            public final SizingPreferenceDto getHorizontal() {
                return this.surrogate.getHorizontal();
            }

            public SizingDto(SizingPreferenceDto sizingPreferenceDto, SizingPreferenceDto sizingPreferenceDto2) {
                this(new Surrogate(sizingPreferenceDto, sizingPreferenceDto2));
            }

            public /* synthetic */ SizingDto(SizingPreferenceDto sizingPreferenceDto, SizingPreferenceDto sizingPreferenceDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : sizingPreferenceDto, (i & 2) != 0 ? null : sizingPreferenceDto2);
            }

            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.Sizing toProto() {
                SizingPreferenceDto vertical = this.surrogate.getVertical();
                Decorator.Modifiers.Sizing.SizingPreference proto = vertical != null ? vertical.toProto() : null;
                SizingPreferenceDto horizontal = this.surrogate.getHorizontal();
                return new Decorator.Modifiers.Sizing(proto, horizontal != null ? horizontal.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[SizingDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SizingDto) && Intrinsics.areEqual(((SizingDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;", "", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "vertical", "horizontal", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "getVertical", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "getVertical$annotations", "()V", "getHorizontal", "getHorizontal$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final SizingPreferenceDto horizontal;
                private final SizingPreferenceDto vertical;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((SizingPreferenceDto) null, (SizingPreferenceDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.vertical, surrogate.vertical) && Intrinsics.areEqual(this.horizontal, surrogate.horizontal);
                }

                public int hashCode() {
                    SizingPreferenceDto sizingPreferenceDto = this.vertical;
                    int iHashCode = (sizingPreferenceDto == null ? 0 : sizingPreferenceDto.hashCode()) * 31;
                    SizingPreferenceDto sizingPreferenceDto2 = this.horizontal;
                    return iHashCode + (sizingPreferenceDto2 != null ? sizingPreferenceDto2.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(vertical=" + this.vertical + ", horizontal=" + this.horizontal + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return DecoratorDto$ModifiersDto$SizingDto$Surrogate$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, SizingPreferenceDto sizingPreferenceDto, SizingPreferenceDto sizingPreferenceDto2, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.vertical = null;
                    } else {
                        this.vertical = sizingPreferenceDto;
                    }
                    if ((i & 2) == 0) {
                        this.horizontal = null;
                    } else {
                        this.horizontal = sizingPreferenceDto2;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    SizingPreferenceDto sizingPreferenceDto = self.vertical;
                    if (sizingPreferenceDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, SizingPreferenceDto.Serializer.INSTANCE, sizingPreferenceDto);
                    }
                    SizingPreferenceDto sizingPreferenceDto2 = self.horizontal;
                    if (sizingPreferenceDto2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, SizingPreferenceDto.Serializer.INSTANCE, sizingPreferenceDto2);
                    }
                }

                public Surrogate(SizingPreferenceDto sizingPreferenceDto, SizingPreferenceDto sizingPreferenceDto2) {
                    this.vertical = sizingPreferenceDto;
                    this.horizontal = sizingPreferenceDto2;
                }

                public /* synthetic */ Surrogate(SizingPreferenceDto sizingPreferenceDto, SizingPreferenceDto sizingPreferenceDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : sizingPreferenceDto, (i & 2) != 0 ? null : sizingPreferenceDto2);
                }

                public final SizingPreferenceDto getVertical() {
                    return this.vertical;
                }

                public final SizingPreferenceDto getHorizontal() {
                    return this.horizontal;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<SizingDto, Decorator.Modifiers.Sizing> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SizingDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SizingDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SizingDto> getBinaryBase64Serializer() {
                    return (KSerializer) SizingDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.Sizing> getProtoAdapter() {
                    return Decorator.Modifiers.Sizing.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SizingDto getZeroValue() {
                    return SizingDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SizingDto fromProto(Decorator.Modifiers.Sizing proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    Decorator.Modifiers.Sizing.SizingPreference vertical = proto.getVertical();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    SizingPreferenceDto sizingPreferenceDtoFromProto = vertical != null ? SizingPreferenceDto.INSTANCE.fromProto(vertical) : null;
                    Decorator.Modifiers.Sizing.SizingPreference horizontal = proto.getHorizontal();
                    return new SizingDto(new Surrogate(sizingPreferenceDtoFromProto, horizontal != null ? SizingPreferenceDto.INSTANCE.fromProto(horizontal) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$SizingDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.SizingDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new SizingDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;)V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "concrete", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;", "getConcrete", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class SizingPreferenceDto implements Dto3<Decorator.Modifiers.Sizing.SizingPreference>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<SizingPreferenceDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<SizingPreferenceDto, Decorator.Modifiers.Sizing.SizingPreference>> binaryBase64Serializer$delegate;
                private static final SizingPreferenceDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ SizingPreferenceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private SizingPreferenceDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final ConcreteDto getConcrete() {
                    if (this.surrogate.getMin() != null) {
                        return ConcreteDto.Min.INSTANCE;
                    }
                    if (this.surrogate.getMax() != null) {
                        return ConcreteDto.Max.INSTANCE;
                    }
                    if (this.surrogate.getFixed() != null) {
                        return new ConcreteDto.Fixed(this.surrogate.getFixed().doubleValue());
                    }
                    return null;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public SizingPreferenceDto(ConcreteDto concreteDto) {
                    Unit unit = concreteDto instanceof ConcreteDto.Min ? Unit.INSTANCE : null;
                    Unit unit2 = concreteDto instanceof ConcreteDto.Max ? Unit.INSTANCE : null;
                    ConcreteDto.Fixed fixed = concreteDto instanceof ConcreteDto.Fixed ? (ConcreteDto.Fixed) concreteDto : null;
                    this(new Surrogate(unit, unit2, fixed != null ? Double.valueOf(fixed.getValue()) : null));
                }

                public /* synthetic */ SizingPreferenceDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : concreteDto);
                }

                @Override // com.robinhood.idl.Dto
                public Decorator.Modifiers.Sizing.SizingPreference toProto() {
                    return new Decorator.Modifiers.Sizing.SizingPreference(this.surrogate.getMin(), this.surrogate.getMax(), this.surrogate.getFixed(), null, 8, null);
                }

                public String toString() {
                    return "[SizingPreferenceDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof SizingPreferenceDto) && Intrinsics.areEqual(((SizingPreferenceDto) other).surrogate, this.surrogate);
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
                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B:\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB9\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R1\u0010\t\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;", "", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "fixed", "<init>", "(Lkotlin/Unit;Lkotlin/Unit;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/Unit;Lkotlin/Unit;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Unit;", "getMin", "()Lkotlin/Unit;", "getMin$annotations", "()V", "getMax", "getMax$annotations", "Ljava/lang/Double;", "getFixed", "()Ljava/lang/Double;", "getFixed$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final Double fixed;
                    private final Unit max;
                    private final Unit min;

                    public Surrogate() {
                        this((Unit) null, (Unit) null, (Double) null, 7, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.min, surrogate.min) && Intrinsics.areEqual(this.max, surrogate.max) && Intrinsics.areEqual((Object) this.fixed, (Object) surrogate.fixed);
                    }

                    public int hashCode() {
                        Unit unit = this.min;
                        int iHashCode = (unit == null ? 0 : unit.hashCode()) * 31;
                        Unit unit2 = this.max;
                        int iHashCode2 = (iHashCode + (unit2 == null ? 0 : unit2.hashCode())) * 31;
                        Double d = this.fixed;
                        return iHashCode2 + (d != null ? d.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(min=" + this.min + ", max=" + this.max + ", fixed=" + this.fixed + ")";
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C48124x47cee7c8.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, Unit unit, Unit unit2, Double d, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.min = null;
                        } else {
                            this.min = unit;
                        }
                        if ((i & 2) == 0) {
                            this.max = null;
                        } else {
                            this.max = unit2;
                        }
                        if ((i & 4) == 0) {
                            this.fixed = null;
                        } else {
                            this.fixed = d;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        Unit unit = self.min;
                        if (unit != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, UnitSerializer.INSTANCE, unit);
                        }
                        Unit unit2 = self.max;
                        if (unit2 != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, UnitSerializer.INSTANCE, unit2);
                        }
                        Double d = self.fixed;
                        if (d != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, d);
                        }
                    }

                    public Surrogate(Unit unit, Unit unit2, Double d) {
                        this.min = unit;
                        this.max = unit2;
                        this.fixed = d;
                    }

                    public /* synthetic */ Surrogate(Unit unit, Unit unit2, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : unit, (i & 2) != 0 ? null : unit2, (i & 4) != 0 ? null : d);
                    }

                    public final Unit getMin() {
                        return this.min;
                    }

                    public final Unit getMax() {
                        return this.max;
                    }

                    public final Double getFixed() {
                        return this.fixed;
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<SizingPreferenceDto, Decorator.Modifiers.Sizing.SizingPreference> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<SizingPreferenceDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SizingPreferenceDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SizingPreferenceDto> getBinaryBase64Serializer() {
                        return (KSerializer) SizingPreferenceDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<Decorator.Modifiers.Sizing.SizingPreference> getProtoAdapter() {
                        return Decorator.Modifiers.Sizing.SizingPreference.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SizingPreferenceDto getZeroValue() {
                        return SizingPreferenceDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SizingPreferenceDto fromProto(Decorator.Modifiers.Sizing.SizingPreference proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new SizingPreferenceDto(new Surrogate(proto.getMin(), proto.getMax(), proto.getFixed()), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new SizingPreferenceDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Min", "Max", "Fixed", "Companion", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Fixed;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Max;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Min;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @RhGenerated
                public static abstract class ConcreteDto implements Dto4 {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);

                    public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private ConcreteDto() {
                    }

                    @Override // com.robinhood.idl.Dto
                    public Void toProto() {
                        return Dto4.DefaultImpls.toProto(this);
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Min;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Min extends ConcreteDto {
                        public static final Min INSTANCE = new Min();

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Min);
                        }

                        public int hashCode() {
                            return 114904615;
                        }

                        public String toString() {
                            return "Min";
                        }

                        private Min() {
                            super(null);
                        }
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Max;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Max extends ConcreteDto {
                        public static final Max INSTANCE = new Max();

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Max);
                        }

                        public int hashCode() {
                            return 114904377;
                        }

                        public String toString() {
                            return "Max";
                        }

                        private Max() {
                            super(null);
                        }
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Fixed;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "()D", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Fixed extends ConcreteDto {
                        private final double value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Fixed) && Double.compare(this.value, ((Fixed) other).value) == 0;
                        }

                        public int hashCode() {
                            return Double.hashCode(this.value);
                        }

                        public String toString() {
                            return "Fixed(value=" + this.value + ")";
                        }

                        public final double getValue() {
                            return this.value;
                        }

                        public Fixed(double d) {
                            super(null);
                            this.value = d;
                        }
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$ConcreteDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Sizing$SizingPreference;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* loaded from: classes25.dex */
                    public static final class Companion implements Dto4.Creator<ConcreteDto, Decorator.Modifiers.Sizing.SizingPreference> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public Void getZeroValue() {
                            return Dto4.Creator.DefaultImpls.getZeroValue(this);
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<Decorator.Modifiers.Sizing.SizingPreference> getProtoAdapter() {
                            return Decorator.Modifiers.Sizing.SizingPreference.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ConcreteDto fromProto(Decorator.Modifiers.Sizing.SizingPreference proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            if (proto.getMin() != null) {
                                return Min.INSTANCE;
                            }
                            if (proto.getMax() != null) {
                                return Max.INSTANCE;
                            }
                            if (proto.getFixed() != null) {
                                return new Fixed(proto.getFixed().doubleValue());
                            }
                            return null;
                        }
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                public static final class Serializer implements KSerializer<SizingPreferenceDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.Sizing.SizingPreference", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, SizingPreferenceDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public SizingPreferenceDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new SizingPreferenceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                    public final String provideIntoMap() {
                        return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto";
                    }
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<SizingDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.Sizing", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SizingDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SizingDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SizingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$SizingDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0011¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;)V", "", "action", "component_type", "", "component_identifier", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;", "getAction", "()Ljava/lang/Integer;", "getComponent_type", "getComponent_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class AnalyticsEventDescriptorDto implements Dto3<Decorator.Modifiers.AnalyticsEventDescriptor>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<AnalyticsEventDescriptorDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<AnalyticsEventDescriptorDto, Decorator.Modifiers.AnalyticsEventDescriptor>> binaryBase64Serializer$delegate;
            private static final AnalyticsEventDescriptorDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ AnalyticsEventDescriptorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private AnalyticsEventDescriptorDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final Integer getAction() {
                return this.surrogate.getAction();
            }

            public final Integer getComponent_type() {
                return this.surrogate.getComponent_type();
            }

            public final String getComponent_identifier() {
                return this.surrogate.getComponent_identifier();
            }

            public /* synthetic */ AnalyticsEventDescriptorDto(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
            }

            public AnalyticsEventDescriptorDto(Integer num, Integer num2, String str) {
                this(new Surrogate(num, num2, str));
            }

            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.AnalyticsEventDescriptor toProto() {
                return new Decorator.Modifiers.AnalyticsEventDescriptor(this.surrogate.getAction(), this.surrogate.getComponent_type(), this.surrogate.getComponent_identifier(), null, 8, null);
            }

            public String toString() {
                return "[AnalyticsEventDescriptorDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof AnalyticsEventDescriptorDto) && Intrinsics.areEqual(((AnalyticsEventDescriptorDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BI\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "action", "component_type", "", "component_identifier", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getAction", "()Ljava/lang/Integer;", "getAction$annotations", "()V", "getComponent_type", "getComponent_type$annotations", "Ljava/lang/String;", "getComponent_identifier", "getComponent_identifier$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Integer action;
                private final String component_identifier;
                private final Integer component_type;

                public Surrogate() {
                    this((Integer) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.action, surrogate.action) && Intrinsics.areEqual(this.component_type, surrogate.component_type) && Intrinsics.areEqual(this.component_identifier, surrogate.component_identifier);
                }

                public int hashCode() {
                    Integer num = this.action;
                    int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Integer num2 = this.component_type;
                    int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    String str = this.component_identifier;
                    return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(action=" + this.action + ", component_type=" + this.component_type + ", component_identifier=" + this.component_identifier + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C48113x79cf7201.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, Integer num, Integer num2, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.action = null;
                    } else {
                        this.action = num;
                    }
                    if ((i & 2) == 0) {
                        this.component_type = null;
                    } else {
                        this.component_type = num2;
                    }
                    if ((i & 4) == 0) {
                        this.component_identifier = null;
                    } else {
                        this.component_identifier = str;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Integer num = self.action;
                    if (num != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, num);
                    }
                    Integer num2 = self.component_type;
                    if (num2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, num2);
                    }
                    String str = self.component_identifier;
                    if (str != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                    }
                }

                public Surrogate(Integer num, Integer num2, String str) {
                    this.action = num;
                    this.component_type = num2;
                    this.component_identifier = str;
                }

                public /* synthetic */ Surrogate(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
                }

                public final Integer getAction() {
                    return this.action;
                }

                public final Integer getComponent_type() {
                    return this.component_type;
                }

                public final String getComponent_identifier() {
                    return this.component_identifier;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AnalyticsEventDescriptor;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<AnalyticsEventDescriptorDto, Decorator.Modifiers.AnalyticsEventDescriptor> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<AnalyticsEventDescriptorDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AnalyticsEventDescriptorDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AnalyticsEventDescriptorDto> getBinaryBase64Serializer() {
                    return (KSerializer) AnalyticsEventDescriptorDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.AnalyticsEventDescriptor> getProtoAdapter() {
                    return Decorator.Modifiers.AnalyticsEventDescriptor.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AnalyticsEventDescriptorDto getZeroValue() {
                    return AnalyticsEventDescriptorDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AnalyticsEventDescriptorDto fromProto(Decorator.Modifiers.AnalyticsEventDescriptor proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new AnalyticsEventDescriptorDto(new Surrogate(proto.getAction(), proto.getComponent_type(), proto.getComponent_identifier()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.AnalyticsEventDescriptorDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new AnalyticsEventDescriptorDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<AnalyticsEventDescriptorDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.AnalyticsEventDescriptor", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, AnalyticsEventDescriptorDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public AnalyticsEventDescriptorDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new AnalyticsEventDescriptorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AnalyticsEventDescriptorDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;)V", "", "apply_on_top", "(Ljava/lang/Boolean;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class GoldShimmerDto implements Dto3<Decorator.Modifiers.GoldShimmer>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<GoldShimmerDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<GoldShimmerDto, Decorator.Modifiers.GoldShimmer>> binaryBase64Serializer$delegate;
            private static final GoldShimmerDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ GoldShimmerDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private GoldShimmerDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public GoldShimmerDto(Boolean bool) {
                this(new Surrogate(bool));
            }

            public /* synthetic */ GoldShimmerDto(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.GoldShimmer toProto() {
                return new Decorator.Modifiers.GoldShimmer(this.surrogate.getApply_on_top(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[GoldShimmerDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof GoldShimmerDto) && Intrinsics.areEqual(((GoldShimmerDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;", "", "", "apply_on_top", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getApply_on_top", "()Ljava/lang/Boolean;", "getApply_on_top$annotations", "()V", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Boolean apply_on_top;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.apply_on_top, ((Surrogate) other).apply_on_top);
                }

                public int hashCode() {
                    Boolean bool = this.apply_on_top;
                    if (bool == null) {
                        return 0;
                    }
                    return bool.hashCode();
                }

                public String toString() {
                    return "Surrogate(apply_on_top=" + this.apply_on_top + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.apply_on_top = null;
                    } else {
                        this.apply_on_top = bool;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Boolean bool = self.apply_on_top;
                    if (bool != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, bool);
                    }
                }

                public Surrogate(Boolean bool) {
                    this.apply_on_top = bool;
                }

                public /* synthetic */ Surrogate(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool);
                }

                public final Boolean getApply_on_top() {
                    return this.apply_on_top;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$GoldShimmer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<GoldShimmerDto, Decorator.Modifiers.GoldShimmer> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<GoldShimmerDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<GoldShimmerDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<GoldShimmerDto> getBinaryBase64Serializer() {
                    return (KSerializer) GoldShimmerDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.GoldShimmer> getProtoAdapter() {
                    return Decorator.Modifiers.GoldShimmer.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public GoldShimmerDto getZeroValue() {
                    return GoldShimmerDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public GoldShimmerDto fromProto(Decorator.Modifiers.GoldShimmer proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new GoldShimmerDto(new Surrogate(proto.getApply_on_top()), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$GoldShimmerDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.GoldShimmerDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new GoldShimmerDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<GoldShimmerDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.GoldShimmer", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, GoldShimmerDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public GoldShimmerDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new GoldShimmerDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$GoldShimmerDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$GoldShimmerDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Serializable(with = Serializer.class)
        @RhGenerated
        @SourceDebugExtension
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;)V", "", AnnotatedPrivateKey.LABEL, "", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "traits", "(Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;", "Companion", "Surrogate", "TraitDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AccessibilityModifierDto implements Dto3<Decorator.Modifiers.AccessibilityModifier>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<AccessibilityModifierDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<AccessibilityModifierDto, Decorator.Modifiers.AccessibilityModifier>> binaryBase64Serializer$delegate;
            private static final AccessibilityModifierDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ AccessibilityModifierDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private AccessibilityModifierDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public AccessibilityModifierDto(String str, List<? extends TraitDto> traits) {
                this(new Surrogate(str, traits));
                Intrinsics.checkNotNullParameter(traits, "traits");
            }

            public /* synthetic */ AccessibilityModifierDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (List<? extends TraitDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.AccessibilityModifier toProto() {
                String label = this.surrogate.getLabel();
                List<TraitDto> traits = this.surrogate.getTraits();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(traits, 10));
                Iterator<T> it = traits.iterator();
                while (it.hasNext()) {
                    arrayList.add((Decorator.Modifiers.AccessibilityModifier.Trait) ((TraitDto) it.next()).toProto());
                }
                return new Decorator.Modifiers.AccessibilityModifier(label, arrayList, null, 4, null);
            }

            public String toString() {
                return "[AccessibilityModifierDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof AccessibilityModifierDto) && Intrinsics.areEqual(((AccessibilityModifierDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;", "", "", AnnotatedPrivateKey.LABEL, "", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "traits", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "Ljava/util/List;", "getTraits", "()Ljava/util/List;", "getTraits$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                private final String label;
                private final List<TraitDto> traits;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                @JvmField
                private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.AccessibilityModifierDto.Surrogate._childSerializers$_anonymous_();
                    }
                })};

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                    return new ArrayListSerializer(TraitDto.Serializer.INSTANCE);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.label, surrogate.label) && Intrinsics.areEqual(this.traits, surrogate.traits);
                }

                public int hashCode() {
                    String str = this.label;
                    return ((str == null ? 0 : str.hashCode()) * 31) + this.traits.hashCode();
                }

                public String toString() {
                    return "Surrogate(label=" + this.label + ", traits=" + this.traits + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C48110xd437d321.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    this.label = (i & 1) == 0 ? null : str;
                    if ((i & 2) == 0) {
                        this.traits = CollectionsKt.emptyList();
                    } else {
                        this.traits = list;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    String str = self.label;
                    if (str != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
                    }
                    if (Intrinsics.areEqual(self.traits, CollectionsKt.emptyList())) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.traits);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate(String str, List<? extends TraitDto> traits) {
                    Intrinsics.checkNotNullParameter(traits, "traits");
                    this.label = str;
                    this.traits = traits;
                }

                public final String getLabel() {
                    return this.label;
                }

                public final List<TraitDto> getTraits() {
                    return this.traits;
                }

                public /* synthetic */ Surrogate(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<AccessibilityModifierDto, Decorator.Modifiers.AccessibilityModifier> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<AccessibilityModifierDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AccessibilityModifierDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AccessibilityModifierDto> getBinaryBase64Serializer() {
                    return (KSerializer) AccessibilityModifierDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.AccessibilityModifier> getProtoAdapter() {
                    return Decorator.Modifiers.AccessibilityModifier.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AccessibilityModifierDto getZeroValue() {
                    return AccessibilityModifierDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AccessibilityModifierDto fromProto(Decorator.Modifiers.AccessibilityModifier proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String label = proto.getLabel();
                    List<Decorator.Modifiers.AccessibilityModifier.Trait> traits = proto.getTraits();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(traits, 10));
                    Iterator<T> it = traits.iterator();
                    while (it.hasNext()) {
                        arrayList.add(TraitDto.INSTANCE.fromProto((Decorator.Modifiers.AccessibilityModifier.Trait) it.next()));
                    }
                    return new AccessibilityModifierDto(new Surrogate(label, arrayList), (DefaultConstructorMarker) null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AccessibilityModifierDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.AccessibilityModifierDto.binaryBase64Serializer_delegate$lambda$1();
                    }
                });
                zeroValue = new AccessibilityModifierDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRAIT_UNSPECIFIED", "TRAIT_HEADER", "TRAIT_UPDATES_FREQUENTLY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class TraitDto implements Dto2<Decorator.Modifiers.AccessibilityModifier.Trait>, Parcelable {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ TraitDto[] $VALUES;

                @JvmField
                public static final Parcelable.Creator<TraitDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<TraitDto, Decorator.Modifiers.AccessibilityModifier.Trait>> binaryBase64Serializer$delegate;
                public static final TraitDto TRAIT_UNSPECIFIED = new TRAIT_UNSPECIFIED("TRAIT_UNSPECIFIED", 0);
                public static final TraitDto TRAIT_HEADER = new TRAIT_HEADER("TRAIT_HEADER", 1);
                public static final TraitDto TRAIT_UPDATES_FREQUENTLY = new TRAIT_UPDATES_FREQUENTLY("TRAIT_UPDATES_FREQUENTLY", 2);

                private static final /* synthetic */ TraitDto[] $values() {
                    return new TraitDto[]{TRAIT_UNSPECIFIED, TRAIT_HEADER, TRAIT_UPDATES_FREQUENTLY};
                }

                public /* synthetic */ TraitDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i);
                }

                public static EnumEntries<TraitDto> getEntries() {
                    return $ENTRIES;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private TraitDto(String str, int i) {
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.AccessibilityModifierDto.TraitDto.TRAIT_UNSPECIFIED", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class TRAIT_UNSPECIFIED extends TraitDto {
                    TRAIT_UNSPECIFIED(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.AccessibilityModifier.Trait toProto() {
                        return Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_UNSPECIFIED;
                    }
                }

                static {
                    TraitDto[] traitDtoArr$values = $values();
                    $VALUES = traitDtoArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(traitDtoArr$values);
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DecoratorDto.ModifiersDto.AccessibilityModifierDto.TraitDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.AccessibilityModifierDto.TraitDto.TRAIT_HEADER", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class TRAIT_HEADER extends TraitDto {
                    TRAIT_HEADER(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.AccessibilityModifier.Trait toProto() {
                        return Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_HEADER;
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.AccessibilityModifierDto.TraitDto.TRAIT_UPDATES_FREQUENTLY", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class TRAIT_UPDATES_FREQUENTLY extends TraitDto {
                    TRAIT_UPDATES_FREQUENTLY(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.AccessibilityModifier.Trait toProto() {
                        return Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_UPDATES_FREQUENTLY;
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$AccessibilityModifier$Trait;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto2.Creator<TraitDto, Decorator.Modifiers.AccessibilityModifier.Trait> {

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* loaded from: classes25.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Decorator.Modifiers.AccessibilityModifier.Trait.values().length];
                            try {
                                iArr[Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_UNSPECIFIED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_HEADER.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Decorator.Modifiers.AccessibilityModifier.Trait.TRAIT_UPDATES_FREQUENTLY.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<TraitDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<TraitDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<TraitDto> getBinaryBase64Serializer() {
                        return (KSerializer) TraitDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<Decorator.Modifiers.AccessibilityModifier.Trait> getProtoAdapter() {
                        return Decorator.Modifiers.AccessibilityModifier.Trait.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TraitDto getZeroValue() {
                        return TraitDto.TRAIT_UNSPECIFIED;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TraitDto fromProto(Decorator.Modifiers.AccessibilityModifier.Trait proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                        if (i == 1) {
                            return TraitDto.TRAIT_UNSPECIFIED;
                        }
                        if (i == 2) {
                            return TraitDto.TRAIT_HEADER;
                        }
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return TraitDto.TRAIT_UPDATES_FREQUENTLY;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$TraitDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<TraitDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private final /* synthetic */ EnumDtoSerializer<TraitDto, Decorator.Modifiers.AccessibilityModifier.Trait> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.AccessibilityModifier.Trait", TraitDto.getEntries(), TraitDto.INSTANCE.getZeroValue());

                    @Override // kotlinx.serialization.KSerializer2
                    public TraitDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return (TraitDto) this.$$delegate_0.deserialize(decoder);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return this.$$delegate_0.getDescriptor();
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, TraitDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.$$delegate_0.serialize(encoder, (Enum) value);
                    }

                    private Serializer() {
                    }
                }

                public static TraitDto valueOf(String str) {
                    return (TraitDto) Enum.valueOf(TraitDto.class, str);
                }

                public static TraitDto[] values() {
                    return (TraitDto[]) $VALUES.clone();
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<AccessibilityModifierDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.AccessibilityModifier", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, AccessibilityModifierDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public AccessibilityModifierDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new AccessibilityModifierDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$AccessibilityModifierDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$AccessibilityModifierDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&%'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;)V", "Lrh_server_driven_ui/v1/MarkdownTextDto;", "text", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "position", "", "dismiss_timeout", "Lrh_server_driven_ui/v1/ActionDto;", "on_dismiss", "(Lrh_server_driven_ui/v1/MarkdownTextDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;Ljava/lang/Integer;Lrh_server_driven_ui/v1/ActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;", "Companion", "Surrogate", "PositionDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TooltipDto implements Dto3<Decorator.Modifiers.Tooltip>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TooltipDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TooltipDto, Decorator.Modifiers.Tooltip>> binaryBase64Serializer$delegate;
            private static final TooltipDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TooltipDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TooltipDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ TooltipDto(MarkdownTextDto markdownTextDto, PositionDto positionDto, Integer num, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : markdownTextDto, (i & 2) != 0 ? null : positionDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : actionDto);
            }

            public TooltipDto(MarkdownTextDto markdownTextDto, PositionDto positionDto, Integer num, ActionDto actionDto) {
                this(new Surrogate(markdownTextDto, positionDto, num, actionDto));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.Tooltip toProto() {
                MarkdownTextDto text = this.surrogate.getText();
                MarkdownText proto = text != null ? text.toProto() : null;
                PositionDto position = this.surrogate.getPosition();
                Decorator.Modifiers.Tooltip.Position position2 = position != null ? (Decorator.Modifiers.Tooltip.Position) position.toProto() : null;
                Integer dismiss_timeout = this.surrogate.getDismiss_timeout();
                ActionDto on_dismiss = this.surrogate.getOn_dismiss();
                return new Decorator.Modifiers.Tooltip(proto, position2, dismiss_timeout, on_dismiss != null ? on_dismiss.toProto() : null, null, 16, null);
            }

            public String toString() {
                return "[TooltipDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TooltipDto) && Intrinsics.areEqual(((TooltipDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BF\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R1\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;", "", "Lrh_server_driven_ui/v1/MarkdownTextDto;", "text", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "position", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "dismiss_timeout", "Lrh_server_driven_ui/v1/ActionDto;", "on_dismiss", "<init>", "(Lrh_server_driven_ui/v1/MarkdownTextDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;Ljava/lang/Integer;Lrh_server_driven_ui/v1/ActionDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/MarkdownTextDto;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;Ljava/lang/Integer;Lrh_server_driven_ui/v1/ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/MarkdownTextDto;", "getText", "()Lrh_server_driven_ui/v1/MarkdownTextDto;", "getText$annotations", "()V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "getPosition", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "getPosition$annotations", "Ljava/lang/Integer;", "getDismiss_timeout", "()Ljava/lang/Integer;", "getDismiss_timeout$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getOn_dismiss", "()Lrh_server_driven_ui/v1/ActionDto;", "getOn_dismiss$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Integer dismiss_timeout;
                private final ActionDto on_dismiss;
                private final PositionDto position;
                private final MarkdownTextDto text;

                public Surrogate() {
                    this((MarkdownTextDto) null, (PositionDto) null, (Integer) null, (ActionDto) null, 15, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.text, surrogate.text) && this.position == surrogate.position && Intrinsics.areEqual(this.dismiss_timeout, surrogate.dismiss_timeout) && Intrinsics.areEqual(this.on_dismiss, surrogate.on_dismiss);
                }

                public int hashCode() {
                    MarkdownTextDto markdownTextDto = this.text;
                    int iHashCode = (markdownTextDto == null ? 0 : markdownTextDto.hashCode()) * 31;
                    PositionDto positionDto = this.position;
                    int iHashCode2 = (iHashCode + (positionDto == null ? 0 : positionDto.hashCode())) * 31;
                    Integer num = this.dismiss_timeout;
                    int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                    ActionDto actionDto = this.on_dismiss;
                    return iHashCode3 + (actionDto != null ? actionDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(text=" + this.text + ", position=" + this.position + ", dismiss_timeout=" + this.dismiss_timeout + ", on_dismiss=" + this.on_dismiss + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return DecoratorDto$ModifiersDto$TooltipDto$Surrogate$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, MarkdownTextDto markdownTextDto, PositionDto positionDto, Integer num, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.text = null;
                    } else {
                        this.text = markdownTextDto;
                    }
                    if ((i & 2) == 0) {
                        this.position = null;
                    } else {
                        this.position = positionDto;
                    }
                    if ((i & 4) == 0) {
                        this.dismiss_timeout = null;
                    } else {
                        this.dismiss_timeout = num;
                    }
                    if ((i & 8) == 0) {
                        this.on_dismiss = null;
                    } else {
                        this.on_dismiss = actionDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    MarkdownTextDto markdownTextDto = self.text;
                    if (markdownTextDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, MarkdownTextDto.Serializer.INSTANCE, markdownTextDto);
                    }
                    PositionDto positionDto = self.position;
                    if (positionDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, PositionDto.Serializer.INSTANCE, positionDto);
                    }
                    Integer num = self.dismiss_timeout;
                    if (num != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, num);
                    }
                    ActionDto actionDto = self.on_dismiss;
                    if (actionDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 3, ActionDto.Serializer.INSTANCE, actionDto);
                    }
                }

                public Surrogate(MarkdownTextDto markdownTextDto, PositionDto positionDto, Integer num, ActionDto actionDto) {
                    this.text = markdownTextDto;
                    this.position = positionDto;
                    this.dismiss_timeout = num;
                    this.on_dismiss = actionDto;
                }

                public /* synthetic */ Surrogate(MarkdownTextDto markdownTextDto, PositionDto positionDto, Integer num, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : markdownTextDto, (i & 2) != 0 ? null : positionDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : actionDto);
                }

                public final MarkdownTextDto getText() {
                    return this.text;
                }

                public final PositionDto getPosition() {
                    return this.position;
                }

                public final Integer getDismiss_timeout() {
                    return this.dismiss_timeout;
                }

                public final ActionDto getOn_dismiss() {
                    return this.on_dismiss;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<TooltipDto, Decorator.Modifiers.Tooltip> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TooltipDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TooltipDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TooltipDto> getBinaryBase64Serializer() {
                    return (KSerializer) TooltipDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.Tooltip> getProtoAdapter() {
                    return Decorator.Modifiers.Tooltip.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TooltipDto getZeroValue() {
                    return TooltipDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TooltipDto fromProto(Decorator.Modifiers.Tooltip proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    MarkdownText text = proto.getText();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    MarkdownTextDto markdownTextDtoFromProto = text != null ? MarkdownTextDto.INSTANCE.fromProto(text) : null;
                    Decorator.Modifiers.Tooltip.Position position = proto.getPosition();
                    PositionDto positionDtoFromProto = position != null ? PositionDto.INSTANCE.fromProto(position) : null;
                    Integer dismiss_timeout = proto.getDismiss_timeout();
                    Action on_dismiss = proto.getOn_dismiss();
                    return new TooltipDto(new Surrogate(markdownTextDtoFromProto, positionDtoFromProto, dismiss_timeout, on_dismiss != null ? ActionDto.INSTANCE.fromProto(on_dismiss) : null), defaultConstructorMarker);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$TooltipDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.TooltipDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TooltipDto(null, null, null, null, 15, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_UNSPECIFIED", "POSITION_TOP", "POSITION_BOTTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class PositionDto implements Dto2<Decorator.Modifiers.Tooltip.Position>, Parcelable {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ PositionDto[] $VALUES;

                @JvmField
                public static final Parcelable.Creator<PositionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<PositionDto, Decorator.Modifiers.Tooltip.Position>> binaryBase64Serializer$delegate;
                public static final PositionDto POSITION_UNSPECIFIED = new POSITION_UNSPECIFIED("POSITION_UNSPECIFIED", 0);
                public static final PositionDto POSITION_TOP = new POSITION_TOP("POSITION_TOP", 1);
                public static final PositionDto POSITION_BOTTOM = new POSITION_BOTTOM("POSITION_BOTTOM", 2);

                private static final /* synthetic */ PositionDto[] $values() {
                    return new PositionDto[]{POSITION_UNSPECIFIED, POSITION_TOP, POSITION_BOTTOM};
                }

                public /* synthetic */ PositionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i);
                }

                public static EnumEntries<PositionDto> getEntries() {
                    return $ENTRIES;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.TooltipDto.PositionDto.POSITION_UNSPECIFIED", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                static final class POSITION_UNSPECIFIED extends PositionDto {
                    POSITION_UNSPECIFIED(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.Tooltip.Position toProto() {
                        return Decorator.Modifiers.Tooltip.Position.POSITION_UNSPECIFIED;
                    }
                }

                private PositionDto(String str, int i) {
                }

                static {
                    PositionDto[] positionDtoArr$values = $values();
                    $VALUES = positionDtoArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(positionDtoArr$values);
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$TooltipDto$PositionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DecoratorDto.ModifiersDto.TooltipDto.PositionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.TooltipDto.PositionDto.POSITION_TOP", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                static final class POSITION_TOP extends PositionDto {
                    POSITION_TOP(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.Tooltip.Position toProto() {
                        return Decorator.Modifiers.Tooltip.Position.POSITION_TOP;
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.TooltipDto.PositionDto.POSITION_BOTTOM", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                static final class POSITION_BOTTOM extends PositionDto {
                    POSITION_BOTTOM(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.Tooltip.Position toProto() {
                        return Decorator.Modifiers.Tooltip.Position.POSITION_BOTTOM;
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$Tooltip$Position;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                public static final class Companion implements Dto2.Creator<PositionDto, Decorator.Modifiers.Tooltip.Position> {

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Decorator.Modifiers.Tooltip.Position.values().length];
                            try {
                                iArr[Decorator.Modifiers.Tooltip.Position.POSITION_UNSPECIFIED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Decorator.Modifiers.Tooltip.Position.POSITION_TOP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Decorator.Modifiers.Tooltip.Position.POSITION_BOTTOM.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<PositionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<PositionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<PositionDto> getBinaryBase64Serializer() {
                        return (KSerializer) PositionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<Decorator.Modifiers.Tooltip.Position> getProtoAdapter() {
                        return Decorator.Modifiers.Tooltip.Position.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public PositionDto getZeroValue() {
                        return PositionDto.POSITION_UNSPECIFIED;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public PositionDto fromProto(Decorator.Modifiers.Tooltip.Position proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                        if (i == 1) {
                            return PositionDto.POSITION_UNSPECIFIED;
                        }
                        if (i == 2) {
                            return PositionDto.POSITION_TOP;
                        }
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return PositionDto.POSITION_BOTTOM;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$PositionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes25.dex */
                public static final class Serializer implements KSerializer<PositionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private final /* synthetic */ EnumDtoSerializer<PositionDto, Decorator.Modifiers.Tooltip.Position> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.Tooltip.Position", PositionDto.getEntries(), PositionDto.INSTANCE.getZeroValue());

                    @Override // kotlinx.serialization.KSerializer2
                    public PositionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return (PositionDto) this.$$delegate_0.deserialize(decoder);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return this.$$delegate_0.getDescriptor();
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, PositionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.$$delegate_0.serialize(encoder, (Enum) value);
                    }

                    private Serializer() {
                    }
                }

                public static PositionDto valueOf(String str) {
                    return (PositionDto) Enum.valueOf(PositionDto.class, str);
                }

                public static PositionDto[] values() {
                    return (PositionDto[]) $VALUES.clone();
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public static final class Serializer implements KSerializer<TooltipDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.Tooltip", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TooltipDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TooltipDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TooltipDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$TooltipDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$TooltipDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Serializable(with = Serializer.class)
        @RhGenerated
        @SourceDebugExtension
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006(')*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;)V", "", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "stops", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "direction", "(Ljava/util/List;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;", "getStops", "()Ljava/util/List;", "getDirection", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "Companion", "Surrogate", "GradientStopDto", "GradientDirectionDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class BackgroundGradientDto implements Dto3<Decorator.Modifiers.BackgroundGradient>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<BackgroundGradientDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<BackgroundGradientDto, Decorator.Modifiers.BackgroundGradient>> binaryBase64Serializer$delegate;
            private static final BackgroundGradientDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ BackgroundGradientDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private BackgroundGradientDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final List<GradientStopDto> getStops() {
                return this.surrogate.getStops();
            }

            public final GradientDirectionDto getDirection() {
                return this.surrogate.getDirection();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public BackgroundGradientDto(List<GradientStopDto> stops, GradientDirectionDto direction) {
                this(new Surrogate(stops, direction));
                Intrinsics.checkNotNullParameter(stops, "stops");
                Intrinsics.checkNotNullParameter(direction, "direction");
            }

            public /* synthetic */ BackgroundGradientDto(List list, GradientDirectionDto gradientDirectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((List<GradientStopDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list), (i & 2) != 0 ? GradientDirectionDto.INSTANCE.getZeroValue() : gradientDirectionDto);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public Decorator.Modifiers.BackgroundGradient toProto() {
                List<GradientStopDto> stops = this.surrogate.getStops();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stops, 10));
                Iterator<T> it = stops.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GradientStopDto) it.next()).toProto());
                }
                return new Decorator.Modifiers.BackgroundGradient(arrayList, (Decorator.Modifiers.BackgroundGradient.GradientDirection) this.surrogate.getDirection().toProto(), null, 4, null);
            }

            public String toString() {
                return "[BackgroundGradientDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof BackgroundGradientDto) && Intrinsics.areEqual(((BackgroundGradientDto) other).surrogate, this.surrogate);
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
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "stops", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "direction", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStops", "()Ljava/util/List;", "getStops$annotations", "()V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "getDirection", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "getDirection$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                private final GradientDirectionDto direction;
                private final List<GradientStopDto> stops;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                @JvmField
                private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.BackgroundGradientDto.Surrogate._childSerializers$_anonymous_();
                    }
                }), null};

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((List) null, (GradientDirectionDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                    return new ArrayListSerializer(GradientStopDto.Serializer.INSTANCE);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.stops, surrogate.stops) && this.direction == surrogate.direction;
                }

                public int hashCode() {
                    return (this.stops.hashCode() * 31) + this.direction.hashCode();
                }

                public String toString() {
                    return "Surrogate(stops=" + this.stops + ", direction=" + this.direction + ")";
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C48119x1cdd7c66.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, List list, GradientDirectionDto gradientDirectionDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.stops = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
                    if ((i & 2) == 0) {
                        this.direction = GradientDirectionDto.INSTANCE.getZeroValue();
                    } else {
                        this.direction = gradientDirectionDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    if (!Intrinsics.areEqual(self.stops, CollectionsKt.emptyList())) {
                        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.stops);
                    }
                    if (self.direction != GradientDirectionDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 1, GradientDirectionDto.Serializer.INSTANCE, self.direction);
                    }
                }

                public Surrogate(List<GradientStopDto> stops, GradientDirectionDto direction) {
                    Intrinsics.checkNotNullParameter(stops, "stops");
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    this.stops = stops;
                    this.direction = direction;
                }

                public final List<GradientStopDto> getStops() {
                    return this.stops;
                }

                public /* synthetic */ Surrogate(List list, GradientDirectionDto gradientDirectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? GradientDirectionDto.INSTANCE.getZeroValue() : gradientDirectionDto);
                }

                public final GradientDirectionDto getDirection() {
                    return this.direction;
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<BackgroundGradientDto, Decorator.Modifiers.BackgroundGradient> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BackgroundGradientDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BackgroundGradientDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BackgroundGradientDto> getBinaryBase64Serializer() {
                    return (KSerializer) BackgroundGradientDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<Decorator.Modifiers.BackgroundGradient> getProtoAdapter() {
                    return Decorator.Modifiers.BackgroundGradient.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BackgroundGradientDto getZeroValue() {
                    return BackgroundGradientDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BackgroundGradientDto fromProto(Decorator.Modifiers.BackgroundGradient proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    List<Decorator.Modifiers.BackgroundGradient.GradientStop> stops = proto.getStops();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stops, 10));
                    Iterator<T> it = stops.iterator();
                    while (it.hasNext()) {
                        arrayList.add(GradientStopDto.INSTANCE.fromProto((Decorator.Modifiers.BackgroundGradient.GradientStop) it.next()));
                    }
                    return new BackgroundGradientDto(new Surrogate(arrayList, GradientDirectionDto.INSTANCE.fromProto(proto.getDirection())), (DefaultConstructorMarker) null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DecoratorDto.ModifiersDto.BackgroundGradientDto.binaryBase64Serializer_delegate$lambda$1();
                    }
                });
                zeroValue = new BackgroundGradientDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010&¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientStop;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", "opacity", "position", "(Lrh_server_driven_ui/v1/ThemedColorDto;FF)V", "toProto", "()Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientStop;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getOpacity", "()F", "getPosition", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class GradientStopDto implements Dto3<Decorator.Modifiers.BackgroundGradient.GradientStop>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<GradientStopDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<GradientStopDto, Decorator.Modifiers.BackgroundGradient.GradientStop>> binaryBase64Serializer$delegate;
                private static final GradientStopDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ GradientStopDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private GradientStopDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final ThemedColorDto getColor() {
                    return this.surrogate.getColor();
                }

                public final float getOpacity() {
                    return this.surrogate.getOpacity();
                }

                public final float getPosition() {
                    return this.surrogate.getPosition();
                }

                public /* synthetic */ GradientStopDto(ThemedColorDto themedColorDto, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
                }

                public GradientStopDto(ThemedColorDto themedColorDto, float f, float f2) {
                    this(new Surrogate(themedColorDto, f, f2));
                }

                @Override // com.robinhood.idl.Dto
                public Decorator.Modifiers.BackgroundGradient.GradientStop toProto() {
                    ThemedColorDto color = this.surrogate.getColor();
                    return new Decorator.Modifiers.BackgroundGradient.GradientStop(color != null ? color.toProto() : null, this.surrogate.getOpacity(), this.surrogate.getPosition(), null, 8, null);
                }

                public String toString() {
                    return "[GradientStopDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof GradientStopDto) && Intrinsics.areEqual(((GradientStopDto) other).surrogate, this.surrogate);
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
                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007¢\u0006\u0004\b\n\u0010\u000bB5\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010*¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "opacity", "position", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;FF)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;FFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "()V", "F", "getOpacity", "()F", "getOpacity$annotations", "getPosition", "getPosition$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final ThemedColorDto color;
                    private final float opacity;
                    private final float position;

                    public Surrogate() {
                        this((ThemedColorDto) null, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.color, surrogate.color) && Float.compare(this.opacity, surrogate.opacity) == 0 && Float.compare(this.position, surrogate.position) == 0;
                    }

                    public int hashCode() {
                        ThemedColorDto themedColorDto = this.color;
                        return ((((themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31) + Float.hashCode(this.opacity)) * 31) + Float.hashCode(this.position);
                    }

                    public String toString() {
                        return "Surrogate(color=" + this.color + ", opacity=" + this.opacity + ", position=" + this.position + ")";
                    }

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C48117xdff9dc0f.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, float f, float f2, SerializationConstructorMarker serializationConstructorMarker) {
                        this.color = (i & 1) == 0 ? null : themedColorDto;
                        if ((i & 2) == 0) {
                            this.opacity = 0.0f;
                        } else {
                            this.opacity = f;
                        }
                        if ((i & 4) == 0) {
                            this.position = 0.0f;
                        } else {
                            this.position = f2;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        ThemedColorDto themedColorDto = self.color;
                        if (themedColorDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
                        }
                        if (Float.compare(self.opacity, 0.0f) != 0) {
                            output.encodeSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.opacity));
                        }
                        if (Float.compare(self.position, 0.0f) != 0) {
                            output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.position));
                        }
                    }

                    public Surrogate(ThemedColorDto themedColorDto, float f, float f2) {
                        this.color = themedColorDto;
                        this.opacity = f;
                        this.position = f2;
                    }

                    public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
                    }

                    public final ThemedColorDto getColor() {
                        return this.color;
                    }

                    public final float getOpacity() {
                        return this.opacity;
                    }

                    public final float getPosition() {
                        return this.position;
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientStop;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<GradientStopDto, Decorator.Modifiers.BackgroundGradient.GradientStop> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<GradientStopDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GradientStopDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GradientStopDto> getBinaryBase64Serializer() {
                        return (KSerializer) GradientStopDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<Decorator.Modifiers.BackgroundGradient.GradientStop> getProtoAdapter() {
                        return Decorator.Modifiers.BackgroundGradient.GradientStop.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GradientStopDto getZeroValue() {
                        return GradientStopDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GradientStopDto fromProto(Decorator.Modifiers.BackgroundGradient.GradientStop proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        ThemedColor color = proto.getColor();
                        return new GradientStopDto(new Surrogate(color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null, proto.getOpacity(), proto.getPosition()), null);
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientStopDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new GradientStopDto(null, 0.0f, 0.0f, 7, null);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<GradientStopDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.BackgroundGradient.GradientStop", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, GradientStopDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public GradientStopDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new GradientStopDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                    public final String provideIntoMap() {
                        return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientStopDto";
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_UNSPECIFIED", "DIRECTION_HORIZONTAL", "DIRECTION_VERTICAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class GradientDirectionDto implements Dto2<Decorator.Modifiers.BackgroundGradient.GradientDirection>, Parcelable {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ GradientDirectionDto[] $VALUES;

                @JvmField
                public static final Parcelable.Creator<GradientDirectionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<GradientDirectionDto, Decorator.Modifiers.BackgroundGradient.GradientDirection>> binaryBase64Serializer$delegate;
                public static final GradientDirectionDto DIRECTION_UNSPECIFIED = new DIRECTION_UNSPECIFIED("DIRECTION_UNSPECIFIED", 0);
                public static final GradientDirectionDto DIRECTION_HORIZONTAL = new DIRECTION_HORIZONTAL("DIRECTION_HORIZONTAL", 1);
                public static final GradientDirectionDto DIRECTION_VERTICAL = new DIRECTION_VERTICAL("DIRECTION_VERTICAL", 2);

                private static final /* synthetic */ GradientDirectionDto[] $values() {
                    return new GradientDirectionDto[]{DIRECTION_UNSPECIFIED, DIRECTION_HORIZONTAL, DIRECTION_VERTICAL};
                }

                public /* synthetic */ GradientDirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i);
                }

                public static EnumEntries<GradientDirectionDto> getEntries() {
                    return $ENTRIES;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private GradientDirectionDto(String str, int i) {
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_UNSPECIFIED", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class DIRECTION_UNSPECIFIED extends GradientDirectionDto {
                    DIRECTION_UNSPECIFIED(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.BackgroundGradient.GradientDirection toProto() {
                        return Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED;
                    }
                }

                static {
                    GradientDirectionDto[] gradientDirectionDtoArr$values = $values();
                    $VALUES = gradientDirectionDtoArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(gradientDirectionDtoArr$values);
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_HORIZONTAL", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class DIRECTION_HORIZONTAL extends GradientDirectionDto {
                    DIRECTION_HORIZONTAL(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.BackgroundGradient.GradientDirection toProto() {
                        return Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_HORIZONTAL;
                    }
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_VERTICAL", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "toProto", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class DIRECTION_VERTICAL extends GradientDirectionDto {
                    DIRECTION_VERTICAL(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public Decorator.Modifiers.BackgroundGradient.GradientDirection toProto() {
                        return Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_VERTICAL;
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "Lrh_server_driven_ui/v1/Decorator$Modifiers$BackgroundGradient$GradientDirection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto2.Creator<GradientDirectionDto, Decorator.Modifiers.BackgroundGradient.GradientDirection> {

                    /* compiled from: DecoratorDto.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Decorator.Modifiers.BackgroundGradient.GradientDirection.values().length];
                            try {
                                iArr[Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_UNSPECIFIED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_HORIZONTAL.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Decorator.Modifiers.BackgroundGradient.GradientDirection.DIRECTION_VERTICAL.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<GradientDirectionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GradientDirectionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GradientDirectionDto> getBinaryBase64Serializer() {
                        return (KSerializer) GradientDirectionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<Decorator.Modifiers.BackgroundGradient.GradientDirection> getProtoAdapter() {
                        return Decorator.Modifiers.BackgroundGradient.GradientDirection.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GradientDirectionDto getZeroValue() {
                        return GradientDirectionDto.DIRECTION_UNSPECIFIED;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GradientDirectionDto fromProto(Decorator.Modifiers.BackgroundGradient.GradientDirection proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                        if (i == 1) {
                            return GradientDirectionDto.DIRECTION_UNSPECIFIED;
                        }
                        if (i == 2) {
                            return GradientDirectionDto.DIRECTION_HORIZONTAL;
                        }
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return GradientDirectionDto.DIRECTION_VERTICAL;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: DecoratorDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$GradientDirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<GradientDirectionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private final /* synthetic */ EnumDtoSerializer<GradientDirectionDto, Decorator.Modifiers.BackgroundGradient.GradientDirection> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.BackgroundGradient.GradientDirection", GradientDirectionDto.getEntries(), GradientDirectionDto.INSTANCE.getZeroValue());

                    @Override // kotlinx.serialization.KSerializer2
                    public GradientDirectionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return (GradientDirectionDto) this.$$delegate_0.deserialize(decoder);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return this.$$delegate_0.getDescriptor();
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, GradientDirectionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.$$delegate_0.serialize(encoder, (Enum) value);
                    }

                    private Serializer() {
                    }
                }

                public static GradientDirectionDto valueOf(String str) {
                    return (GradientDirectionDto) Enum.valueOf(GradientDirectionDto.class, str);
                }

                public static GradientDirectionDto[] values() {
                    return (GradientDirectionDto[]) $VALUES.clone();
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<BackgroundGradientDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers.BackgroundGradient", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, BackgroundGradientDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public BackgroundGradientDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new BackgroundGradientDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: DecoratorDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$BackgroundGradientDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                public final String provideIntoMap() {
                    return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto$BackgroundGradientDto";
                }
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<ModifiersDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator.Modifiers", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ModifiersDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ModifiersDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ModifiersDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DecoratorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.DecoratorDto$ModifiersDto";
            }
        }
    }

    /* compiled from: DecoratorDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DecoratorDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DecoratorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<DecoratorDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Decorator", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DecoratorDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DecoratorDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DecoratorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: DecoratorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DecoratorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.DecoratorDto";
        }
    }
}
