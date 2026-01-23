package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.DappBrowserContext;
import com.robinhood.rosetta.eventlogging.DappBrowserContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: DappBrowserContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate;)V", "dapp_name", "", "dapp_url", "dapp_browser_state", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "time_elapsed_ms", "", "custom_action", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;DLcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;)V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url", "getDapp_browser_state", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "getTime_elapsed_ms", "()D", "getCustom_action", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DappBrowserStateDto", "CustomActionDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DappBrowserContextDto implements Dto3<DappBrowserContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DappBrowserContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DappBrowserContextDto, DappBrowserContext>> binaryBase64Serializer$delegate;
    private static final DappBrowserContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DappBrowserContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DappBrowserContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDapp_name() {
        return this.surrogate.getDapp_name();
    }

    public final String getDapp_url() {
        return this.surrogate.getDapp_url();
    }

    public final DappBrowserStateDto getDapp_browser_state() {
        return this.surrogate.getDapp_browser_state();
    }

    public final double getTime_elapsed_ms() {
        return this.surrogate.getTime_elapsed_ms();
    }

    public final CustomActionDto getCustom_action() {
        return this.surrogate.getCustom_action();
    }

    public /* synthetic */ DappBrowserContextDto(String str, String str2, DappBrowserStateDto dappBrowserStateDto, double d, CustomActionDto customActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DappBrowserStateDto.INSTANCE.getZeroValue() : dappBrowserStateDto, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? CustomActionDto.INSTANCE.getZeroValue() : customActionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappBrowserContextDto(String dapp_name, String dapp_url, DappBrowserStateDto dapp_browser_state, double d, CustomActionDto custom_action) {
        this(new Surrogate(dapp_name, dapp_url, dapp_browser_state, d, custom_action));
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
        Intrinsics.checkNotNullParameter(custom_action, "custom_action");
    }

    public static /* synthetic */ DappBrowserContextDto copy$default(DappBrowserContextDto dappBrowserContextDto, String str, String str2, DappBrowserStateDto dappBrowserStateDto, double d, CustomActionDto customActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappBrowserContextDto.surrogate.getDapp_name();
        }
        if ((i & 2) != 0) {
            str2 = dappBrowserContextDto.surrogate.getDapp_url();
        }
        if ((i & 4) != 0) {
            dappBrowserStateDto = dappBrowserContextDto.surrogate.getDapp_browser_state();
        }
        if ((i & 8) != 0) {
            d = dappBrowserContextDto.surrogate.getTime_elapsed_ms();
        }
        if ((i & 16) != 0) {
            customActionDto = dappBrowserContextDto.surrogate.getCustom_action();
        }
        CustomActionDto customActionDto2 = customActionDto;
        DappBrowserStateDto dappBrowserStateDto2 = dappBrowserStateDto;
        return dappBrowserContextDto.copy(str, str2, dappBrowserStateDto2, d, customActionDto2);
    }

    public final DappBrowserContextDto copy(String dapp_name, String dapp_url, DappBrowserStateDto dapp_browser_state, double time_elapsed_ms, CustomActionDto custom_action) {
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
        Intrinsics.checkNotNullParameter(custom_action, "custom_action");
        return new DappBrowserContextDto(new Surrogate(dapp_name, dapp_url, dapp_browser_state, time_elapsed_ms, custom_action));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DappBrowserContext toProto() {
        return new DappBrowserContext(this.surrogate.getDapp_name(), this.surrogate.getDapp_url(), (DappBrowserContext.DappBrowserState) this.surrogate.getDapp_browser_state().toProto(), this.surrogate.getTime_elapsed_ms(), (DappBrowserContext.CustomAction) this.surrogate.getCustom_action().toProto(), null, 32, null);
    }

    public String toString() {
        return "[DappBrowserContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DappBrowserContextDto) && Intrinsics.areEqual(((DappBrowserContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278BH\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u0018\u0010'\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003JJ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate;", "", "dapp_name", "", "dapp_url", "dapp_browser_state", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "time_elapsed_ms", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "custom_action", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;DLcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;DLcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDapp_name$annotations", "()V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url$annotations", "getDapp_url", "getDapp_browser_state$annotations", "getDapp_browser_state", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "getTime_elapsed_ms$annotations", "getTime_elapsed_ms", "()D", "getCustom_action$annotations", "getCustom_action", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CustomActionDto custom_action;
        private final DappBrowserStateDto dapp_browser_state;
        private final String dapp_name;
        private final String dapp_url;
        private final double time_elapsed_ms;

        public Surrogate() {
            this((String) null, (String) null, (DappBrowserStateDto) null, 0.0d, (CustomActionDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, DappBrowserStateDto dappBrowserStateDto, double d, CustomActionDto customActionDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.dapp_name;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.dapp_url;
            }
            if ((i & 4) != 0) {
                dappBrowserStateDto = surrogate.dapp_browser_state;
            }
            if ((i & 8) != 0) {
                d = surrogate.time_elapsed_ms;
            }
            if ((i & 16) != 0) {
                customActionDto = surrogate.custom_action;
            }
            CustomActionDto customActionDto2 = customActionDto;
            DappBrowserStateDto dappBrowserStateDto2 = dappBrowserStateDto;
            return surrogate.copy(str, str2, dappBrowserStateDto2, d, customActionDto2);
        }

        @SerialName("customAction")
        @JsonAnnotations2(names = {"custom_action"})
        public static /* synthetic */ void getCustom_action$annotations() {
        }

        @SerialName("dappBrowserState")
        @JsonAnnotations2(names = {"dapp_browser_state"})
        public static /* synthetic */ void getDapp_browser_state$annotations() {
        }

        @SerialName("dappName")
        @JsonAnnotations2(names = {"dapp_name"})
        public static /* synthetic */ void getDapp_name$annotations() {
        }

        @SerialName("dappUrl")
        @JsonAnnotations2(names = {"dapp_url"})
        public static /* synthetic */ void getDapp_url$annotations() {
        }

        @SerialName("timeElapsedMs")
        @JsonAnnotations2(names = {"time_elapsed_ms"})
        public static /* synthetic */ void getTime_elapsed_ms$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDapp_name() {
            return this.dapp_name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDapp_url() {
            return this.dapp_url;
        }

        /* renamed from: component3, reason: from getter */
        public final DappBrowserStateDto getDapp_browser_state() {
            return this.dapp_browser_state;
        }

        /* renamed from: component4, reason: from getter */
        public final double getTime_elapsed_ms() {
            return this.time_elapsed_ms;
        }

        /* renamed from: component5, reason: from getter */
        public final CustomActionDto getCustom_action() {
            return this.custom_action;
        }

        public final Surrogate copy(String dapp_name, String dapp_url, DappBrowserStateDto dapp_browser_state, double time_elapsed_ms, CustomActionDto custom_action) {
            Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
            Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
            Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
            Intrinsics.checkNotNullParameter(custom_action, "custom_action");
            return new Surrogate(dapp_name, dapp_url, dapp_browser_state, time_elapsed_ms, custom_action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.dapp_name, surrogate.dapp_name) && Intrinsics.areEqual(this.dapp_url, surrogate.dapp_url) && this.dapp_browser_state == surrogate.dapp_browser_state && Double.compare(this.time_elapsed_ms, surrogate.time_elapsed_ms) == 0 && this.custom_action == surrogate.custom_action;
        }

        public int hashCode() {
            return (((((((this.dapp_name.hashCode() * 31) + this.dapp_url.hashCode()) * 31) + this.dapp_browser_state.hashCode()) * 31) + Double.hashCode(this.time_elapsed_ms)) * 31) + this.custom_action.hashCode();
        }

        public String toString() {
            return "Surrogate(dapp_name=" + this.dapp_name + ", dapp_url=" + this.dapp_url + ", dapp_browser_state=" + this.dapp_browser_state + ", time_elapsed_ms=" + this.time_elapsed_ms + ", custom_action=" + this.custom_action + ")";
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DappBrowserContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, DappBrowserStateDto dappBrowserStateDto, double d, CustomActionDto customActionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.dapp_name = "";
            } else {
                this.dapp_name = str;
            }
            if ((i & 2) == 0) {
                this.dapp_url = "";
            } else {
                this.dapp_url = str2;
            }
            if ((i & 4) == 0) {
                this.dapp_browser_state = DappBrowserStateDto.INSTANCE.getZeroValue();
            } else {
                this.dapp_browser_state = dappBrowserStateDto;
            }
            if ((i & 8) == 0) {
                this.time_elapsed_ms = 0.0d;
            } else {
                this.time_elapsed_ms = d;
            }
            if ((i & 16) == 0) {
                this.custom_action = CustomActionDto.INSTANCE.getZeroValue();
            } else {
                this.custom_action = customActionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.dapp_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.dapp_name);
            }
            if (!Intrinsics.areEqual(self.dapp_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.dapp_url);
            }
            if (self.dapp_browser_state != DappBrowserStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DappBrowserStateDto.Serializer.INSTANCE, self.dapp_browser_state);
            }
            if (Double.compare(self.time_elapsed_ms, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.time_elapsed_ms));
            }
            if (self.custom_action != CustomActionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CustomActionDto.Serializer.INSTANCE, self.custom_action);
            }
        }

        public Surrogate(String dapp_name, String dapp_url, DappBrowserStateDto dapp_browser_state, double d, CustomActionDto custom_action) {
            Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
            Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
            Intrinsics.checkNotNullParameter(dapp_browser_state, "dapp_browser_state");
            Intrinsics.checkNotNullParameter(custom_action, "custom_action");
            this.dapp_name = dapp_name;
            this.dapp_url = dapp_url;
            this.dapp_browser_state = dapp_browser_state;
            this.time_elapsed_ms = d;
            this.custom_action = custom_action;
        }

        public /* synthetic */ Surrogate(String str, String str2, DappBrowserStateDto dappBrowserStateDto, double d, CustomActionDto customActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DappBrowserStateDto.INSTANCE.getZeroValue() : dappBrowserStateDto, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? CustomActionDto.INSTANCE.getZeroValue() : customActionDto);
        }

        public final String getDapp_name() {
            return this.dapp_name;
        }

        public final String getDapp_url() {
            return this.dapp_url;
        }

        public final DappBrowserStateDto getDapp_browser_state() {
            return this.dapp_browser_state;
        }

        public final double getTime_elapsed_ms() {
            return this.time_elapsed_ms;
        }

        public final CustomActionDto getCustom_action() {
            return this.custom_action;
        }
    }

    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DappBrowserContextDto, DappBrowserContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DappBrowserContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DappBrowserContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DappBrowserContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DappBrowserContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DappBrowserContext> getProtoAdapter() {
            return DappBrowserContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DappBrowserContextDto getZeroValue() {
            return DappBrowserContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DappBrowserContextDto fromProto(DappBrowserContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DappBrowserContextDto(new Surrogate(proto.getDapp_name(), proto.getDapp_url(), DappBrowserStateDto.INSTANCE.fromProto(proto.getDapp_browser_state()), proto.getTime_elapsed_ms(), CustomActionDto.INSTANCE.fromProto(proto.getCustom_action())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DappBrowserContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DappBrowserContextDto(null, null, null, 0.0d, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "DAPP_BROWSER_CONNECTING", "DAPP_BROWSER_CONNECTED", "DAPP_BROWSER_DROPPED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DappBrowserStateDto implements Dto2<DappBrowserContext.DappBrowserState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DappBrowserStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DappBrowserStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DappBrowserStateDto, DappBrowserContext.DappBrowserState>> binaryBase64Serializer$delegate;
        public static final DappBrowserStateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final DappBrowserStateDto DAPP_BROWSER_CONNECTING = new DAPP_BROWSER_CONNECTING("DAPP_BROWSER_CONNECTING", 1);
        public static final DappBrowserStateDto DAPP_BROWSER_CONNECTED = new DAPP_BROWSER_CONNECTED("DAPP_BROWSER_CONNECTED", 2);
        public static final DappBrowserStateDto DAPP_BROWSER_DROPPED = new DAPP_BROWSER_DROPPED("DAPP_BROWSER_DROPPED", 3);

        private static final /* synthetic */ DappBrowserStateDto[] $values() {
            return new DappBrowserStateDto[]{STATE_UNSPECIFIED, DAPP_BROWSER_CONNECTING, DAPP_BROWSER_CONNECTED, DAPP_BROWSER_DROPPED};
        }

        public /* synthetic */ DappBrowserStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DappBrowserStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DappBrowserStateDto(String str, int i) {
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappBrowserContextDto.DappBrowserStateDto.STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends DappBrowserStateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappBrowserContext.DappBrowserState toProto() {
                return DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED;
            }
        }

        static {
            DappBrowserStateDto[] dappBrowserStateDtoArr$values = $values();
            $VALUES = dappBrowserStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dappBrowserStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContextDto$DappBrowserStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DappBrowserContextDto.DappBrowserStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappBrowserContextDto.DappBrowserStateDto.DAPP_BROWSER_CONNECTING", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAPP_BROWSER_CONNECTING extends DappBrowserStateDto {
            DAPP_BROWSER_CONNECTING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappBrowserContext.DappBrowserState toProto() {
                return DappBrowserContext.DappBrowserState.DAPP_BROWSER_CONNECTING;
            }
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappBrowserContextDto.DappBrowserStateDto.DAPP_BROWSER_CONNECTED", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAPP_BROWSER_CONNECTED extends DappBrowserStateDto {
            DAPP_BROWSER_CONNECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappBrowserContext.DappBrowserState toProto() {
                return DappBrowserContext.DappBrowserState.DAPP_BROWSER_CONNECTED;
            }
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappBrowserContextDto.DappBrowserStateDto.DAPP_BROWSER_DROPPED", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAPP_BROWSER_DROPPED extends DappBrowserStateDto {
            DAPP_BROWSER_DROPPED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappBrowserContext.DappBrowserState toProto() {
                return DappBrowserContext.DappBrowserState.DAPP_BROWSER_DROPPED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$DappBrowserState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DappBrowserStateDto, DappBrowserContext.DappBrowserState> {

            /* compiled from: DappBrowserContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DappBrowserContext.DappBrowserState.values().length];
                    try {
                        iArr[DappBrowserContext.DappBrowserState.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DappBrowserContext.DappBrowserState.DAPP_BROWSER_CONNECTING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DappBrowserContext.DappBrowserState.DAPP_BROWSER_CONNECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DappBrowserContext.DappBrowserState.DAPP_BROWSER_DROPPED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DappBrowserStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DappBrowserStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DappBrowserStateDto> getBinaryBase64Serializer() {
                return (KSerializer) DappBrowserStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DappBrowserContext.DappBrowserState> getProtoAdapter() {
                return DappBrowserContext.DappBrowserState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DappBrowserStateDto getZeroValue() {
                return DappBrowserStateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DappBrowserStateDto fromProto(DappBrowserContext.DappBrowserState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DappBrowserStateDto.STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DappBrowserStateDto.DAPP_BROWSER_CONNECTING;
                }
                if (i == 3) {
                    return DappBrowserStateDto.DAPP_BROWSER_CONNECTED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DappBrowserStateDto.DAPP_BROWSER_DROPPED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$DappBrowserStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DappBrowserStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DappBrowserStateDto, DappBrowserContext.DappBrowserState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DappBrowserContext.DappBrowserState", DappBrowserStateDto.getEntries(), DappBrowserStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DappBrowserStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DappBrowserStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DappBrowserStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DappBrowserStateDto valueOf(String str) {
            return (DappBrowserStateDto) Enum.valueOf(DappBrowserStateDto.class, str);
        }

        public static DappBrowserStateDto[] values() {
            return (DappBrowserStateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016j\u0002\b\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_LAUNCHPAD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CustomActionDto implements Dto2<DappBrowserContext.CustomAction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomActionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CustomActionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CustomActionDto OPEN_LAUNCHPAD = new OPEN_LAUNCHPAD("OPEN_LAUNCHPAD", 0);
        private static final Lazy<BinaryBase64DtoSerializer<CustomActionDto, DappBrowserContext.CustomAction>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ CustomActionDto[] $values() {
            return new CustomActionDto[]{OPEN_LAUNCHPAD};
        }

        public /* synthetic */ CustomActionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CustomActionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappBrowserContextDto.CustomActionDto.OPEN_LAUNCHPAD", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPEN_LAUNCHPAD extends CustomActionDto {
            OPEN_LAUNCHPAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappBrowserContext.CustomAction toProto() {
                return DappBrowserContext.CustomAction.OPEN_LAUNCHPAD;
            }
        }

        private CustomActionDto(String str, int i) {
        }

        static {
            CustomActionDto[] customActionDtoArr$values = $values();
            $VALUES = customActionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(customActionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappBrowserContextDto$CustomActionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DappBrowserContextDto.CustomActionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContext$CustomAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CustomActionDto, DappBrowserContext.CustomAction> {

            /* compiled from: DappBrowserContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DappBrowserContext.CustomAction.values().length];
                    try {
                        iArr[DappBrowserContext.CustomAction.OPEN_LAUNCHPAD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CustomActionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomActionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomActionDto> getBinaryBase64Serializer() {
                return (KSerializer) CustomActionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DappBrowserContext.CustomAction> getProtoAdapter() {
                return DappBrowserContext.CustomAction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomActionDto getZeroValue() {
                return CustomActionDto.OPEN_LAUNCHPAD;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomActionDto fromProto(DappBrowserContext.CustomAction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return CustomActionDto.OPEN_LAUNCHPAD;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DappBrowserContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$CustomActionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CustomActionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CustomActionDto, DappBrowserContext.CustomAction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DappBrowserContext.CustomAction", CustomActionDto.getEntries(), CustomActionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CustomActionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CustomActionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CustomActionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CustomActionDto valueOf(String str) {
            return (CustomActionDto) Enum.valueOf(CustomActionDto.class, str);
        }

        public static CustomActionDto[] values() {
            return (CustomActionDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DappBrowserContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DappBrowserContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DappBrowserContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DappBrowserContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DappBrowserContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DappBrowserContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappBrowserContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DappBrowserContextDto";
        }
    }
}
