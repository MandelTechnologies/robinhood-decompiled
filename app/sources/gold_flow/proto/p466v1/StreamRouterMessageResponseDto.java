package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.DismissAllDto;
import gold_flow.proto.p466v1.DismissScreenDto;
import gold_flow.proto.p466v1.OnCompleteDto;
import gold_flow.proto.p466v1.OnSubscribeDto;
import gold_flow.proto.p466v1.OpenDeeplinkDto;
import gold_flow.proto.p466v1.PushScreenDto;
import gold_flow.proto.p466v1.ResultDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StreamRouterMessageResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamRouterMessageResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;)V", "Lgold_flow/proto/v1/ResultDto;", "result", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "router_message", "(Lgold_flow/proto/v1/ResultDto;Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamRouterMessageResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;", "getRouter_message", "()Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Companion", "Surrogate", "RouterMessageDto", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class StreamRouterMessageResponseDto implements Dto3<StreamRouterMessageResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamRouterMessageResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamRouterMessageResponseDto, StreamRouterMessageResponse>> binaryBase64Serializer$delegate;
    private static final StreamRouterMessageResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamRouterMessageResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamRouterMessageResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final RouterMessageDto getRouter_message() {
        if (this.surrogate.getPush_screen() != null) {
            return new RouterMessageDto.PushScreen(this.surrogate.getPush_screen());
        }
        if (this.surrogate.getDismiss_screen() != null) {
            return new RouterMessageDto.DismissScreen(this.surrogate.getDismiss_screen());
        }
        if (this.surrogate.getDismiss_all() != null) {
            return new RouterMessageDto.DismissAll(this.surrogate.getDismiss_all());
        }
        if (this.surrogate.getOpen_deeplink() != null) {
            return new RouterMessageDto.OpenDeeplink(this.surrogate.getOpen_deeplink());
        }
        if (this.surrogate.getOn_subscribe() != null) {
            return new RouterMessageDto.OnSubscribe(this.surrogate.getOn_subscribe());
        }
        if (this.surrogate.getOn_complete() != null) {
            return new RouterMessageDto.OnComplete(this.surrogate.getOn_complete());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamRouterMessageResponseDto(ResultDto resultDto, RouterMessageDto routerMessageDto) {
        RouterMessageDto.PushScreen pushScreen = routerMessageDto instanceof RouterMessageDto.PushScreen ? (RouterMessageDto.PushScreen) routerMessageDto : null;
        PushScreenDto value = pushScreen != null ? pushScreen.getValue() : null;
        RouterMessageDto.DismissScreen dismissScreen = routerMessageDto instanceof RouterMessageDto.DismissScreen ? (RouterMessageDto.DismissScreen) routerMessageDto : null;
        DismissScreenDto value2 = dismissScreen != null ? dismissScreen.getValue() : null;
        RouterMessageDto.DismissAll dismissAll = routerMessageDto instanceof RouterMessageDto.DismissAll ? (RouterMessageDto.DismissAll) routerMessageDto : null;
        DismissAllDto value3 = dismissAll != null ? dismissAll.getValue() : null;
        RouterMessageDto.OpenDeeplink openDeeplink = routerMessageDto instanceof RouterMessageDto.OpenDeeplink ? (RouterMessageDto.OpenDeeplink) routerMessageDto : null;
        OpenDeeplinkDto value4 = openDeeplink != null ? openDeeplink.getValue() : null;
        RouterMessageDto.OnSubscribe onSubscribe = routerMessageDto instanceof RouterMessageDto.OnSubscribe ? (RouterMessageDto.OnSubscribe) routerMessageDto : null;
        OnSubscribeDto value5 = onSubscribe != null ? onSubscribe.getValue() : null;
        RouterMessageDto.OnComplete onComplete = routerMessageDto instanceof RouterMessageDto.OnComplete ? (RouterMessageDto.OnComplete) routerMessageDto : null;
        this(new Surrogate(resultDto, value, value2, value3, value4, value5, onComplete != null ? onComplete.getValue() : null));
    }

    public /* synthetic */ StreamRouterMessageResponseDto(ResultDto resultDto, RouterMessageDto routerMessageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resultDto, (i & 2) != 0 ? null : routerMessageDto);
    }

    @Override // com.robinhood.idl.Dto
    public StreamRouterMessageResponse toProto() {
        ResultDto result = this.surrogate.getResult();
        Result proto = result != null ? result.toProto() : null;
        PushScreenDto push_screen = this.surrogate.getPush_screen();
        PushScreen proto2 = push_screen != null ? push_screen.toProto() : null;
        DismissScreenDto dismiss_screen = this.surrogate.getDismiss_screen();
        DismissScreen proto3 = dismiss_screen != null ? dismiss_screen.toProto() : null;
        DismissAllDto dismiss_all = this.surrogate.getDismiss_all();
        DismissAll proto4 = dismiss_all != null ? dismiss_all.toProto() : null;
        OpenDeeplinkDto open_deeplink = this.surrogate.getOpen_deeplink();
        OpenDeeplink proto5 = open_deeplink != null ? open_deeplink.toProto() : null;
        OnSubscribeDto on_subscribe = this.surrogate.getOn_subscribe();
        OnSubscribe proto6 = on_subscribe != null ? on_subscribe.toProto() : null;
        OnCompleteDto on_complete = this.surrogate.getOn_complete();
        return new StreamRouterMessageResponse(proto, proto2, proto3, proto4, proto5, proto6, on_complete != null ? on_complete.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[StreamRouterMessageResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamRouterMessageResponseDto) && Intrinsics.areEqual(((StreamRouterMessageResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamRouterMessageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Ba\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;", "", "Lgold_flow/proto/v1/ResultDto;", "result", "Lgold_flow/proto/v1/PushScreenDto;", "push_screen", "Lgold_flow/proto/v1/DismissScreenDto;", "dismiss_screen", "Lgold_flow/proto/v1/DismissAllDto;", "dismiss_all", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "open_deeplink", "Lgold_flow/proto/v1/OnSubscribeDto;", "on_subscribe", "Lgold_flow/proto/v1/OnCompleteDto;", "on_complete", "<init>", "(Lgold_flow/proto/v1/ResultDto;Lgold_flow/proto/v1/PushScreenDto;Lgold_flow/proto/v1/DismissScreenDto;Lgold_flow/proto/v1/DismissAllDto;Lgold_flow/proto/v1/OpenDeeplinkDto;Lgold_flow/proto/v1/OnSubscribeDto;Lgold_flow/proto/v1/OnCompleteDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgold_flow/proto/v1/ResultDto;Lgold_flow/proto/v1/PushScreenDto;Lgold_flow/proto/v1/DismissScreenDto;Lgold_flow/proto/v1/DismissAllDto;Lgold_flow/proto/v1/OpenDeeplinkDto;Lgold_flow/proto/v1/OnSubscribeDto;Lgold_flow/proto/v1/OnCompleteDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/ResultDto;", "getResult", "()Lgold_flow/proto/v1/ResultDto;", "getResult$annotations", "()V", "Lgold_flow/proto/v1/PushScreenDto;", "getPush_screen", "()Lgold_flow/proto/v1/PushScreenDto;", "getPush_screen$annotations", "Lgold_flow/proto/v1/DismissScreenDto;", "getDismiss_screen", "()Lgold_flow/proto/v1/DismissScreenDto;", "getDismiss_screen$annotations", "Lgold_flow/proto/v1/DismissAllDto;", "getDismiss_all", "()Lgold_flow/proto/v1/DismissAllDto;", "getDismiss_all$annotations", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "getOpen_deeplink", "()Lgold_flow/proto/v1/OpenDeeplinkDto;", "getOpen_deeplink$annotations", "Lgold_flow/proto/v1/OnSubscribeDto;", "getOn_subscribe", "()Lgold_flow/proto/v1/OnSubscribeDto;", "getOn_subscribe$annotations", "Lgold_flow/proto/v1/OnCompleteDto;", "getOn_complete", "()Lgold_flow/proto/v1/OnCompleteDto;", "getOn_complete$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DismissAllDto dismiss_all;
        private final DismissScreenDto dismiss_screen;
        private final OnCompleteDto on_complete;
        private final OnSubscribeDto on_subscribe;
        private final OpenDeeplinkDto open_deeplink;
        private final PushScreenDto push_screen;
        private final ResultDto result;

        public Surrogate() {
            this((ResultDto) null, (PushScreenDto) null, (DismissScreenDto) null, (DismissAllDto) null, (OpenDeeplinkDto) null, (OnSubscribeDto) null, (OnCompleteDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.result, surrogate.result) && Intrinsics.areEqual(this.push_screen, surrogate.push_screen) && Intrinsics.areEqual(this.dismiss_screen, surrogate.dismiss_screen) && Intrinsics.areEqual(this.dismiss_all, surrogate.dismiss_all) && Intrinsics.areEqual(this.open_deeplink, surrogate.open_deeplink) && Intrinsics.areEqual(this.on_subscribe, surrogate.on_subscribe) && Intrinsics.areEqual(this.on_complete, surrogate.on_complete);
        }

        public int hashCode() {
            ResultDto resultDto = this.result;
            int iHashCode = (resultDto == null ? 0 : resultDto.hashCode()) * 31;
            PushScreenDto pushScreenDto = this.push_screen;
            int iHashCode2 = (iHashCode + (pushScreenDto == null ? 0 : pushScreenDto.hashCode())) * 31;
            DismissScreenDto dismissScreenDto = this.dismiss_screen;
            int iHashCode3 = (iHashCode2 + (dismissScreenDto == null ? 0 : dismissScreenDto.hashCode())) * 31;
            DismissAllDto dismissAllDto = this.dismiss_all;
            int iHashCode4 = (iHashCode3 + (dismissAllDto == null ? 0 : dismissAllDto.hashCode())) * 31;
            OpenDeeplinkDto openDeeplinkDto = this.open_deeplink;
            int iHashCode5 = (iHashCode4 + (openDeeplinkDto == null ? 0 : openDeeplinkDto.hashCode())) * 31;
            OnSubscribeDto onSubscribeDto = this.on_subscribe;
            int iHashCode6 = (iHashCode5 + (onSubscribeDto == null ? 0 : onSubscribeDto.hashCode())) * 31;
            OnCompleteDto onCompleteDto = this.on_complete;
            return iHashCode6 + (onCompleteDto != null ? onCompleteDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(result=" + this.result + ", push_screen=" + this.push_screen + ", dismiss_screen=" + this.dismiss_screen + ", dismiss_all=" + this.dismiss_all + ", open_deeplink=" + this.open_deeplink + ", on_subscribe=" + this.on_subscribe + ", on_complete=" + this.on_complete + ")";
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamRouterMessageResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ResultDto resultDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, OpenDeeplinkDto openDeeplinkDto, OnSubscribeDto onSubscribeDto, OnCompleteDto onCompleteDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.result = null;
            } else {
                this.result = resultDto;
            }
            if ((i & 2) == 0) {
                this.push_screen = null;
            } else {
                this.push_screen = pushScreenDto;
            }
            if ((i & 4) == 0) {
                this.dismiss_screen = null;
            } else {
                this.dismiss_screen = dismissScreenDto;
            }
            if ((i & 8) == 0) {
                this.dismiss_all = null;
            } else {
                this.dismiss_all = dismissAllDto;
            }
            if ((i & 16) == 0) {
                this.open_deeplink = null;
            } else {
                this.open_deeplink = openDeeplinkDto;
            }
            if ((i & 32) == 0) {
                this.on_subscribe = null;
            } else {
                this.on_subscribe = onSubscribeDto;
            }
            if ((i & 64) == 0) {
                this.on_complete = null;
            } else {
                this.on_complete = onCompleteDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ResultDto resultDto = self.result;
            if (resultDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ResultDto.Serializer.INSTANCE, resultDto);
            }
            PushScreenDto pushScreenDto = self.push_screen;
            if (pushScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PushScreenDto.Serializer.INSTANCE, pushScreenDto);
            }
            DismissScreenDto dismissScreenDto = self.dismiss_screen;
            if (dismissScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DismissScreenDto.Serializer.INSTANCE, dismissScreenDto);
            }
            DismissAllDto dismissAllDto = self.dismiss_all;
            if (dismissAllDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DismissAllDto.Serializer.INSTANCE, dismissAllDto);
            }
            OpenDeeplinkDto openDeeplinkDto = self.open_deeplink;
            if (openDeeplinkDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, OpenDeeplinkDto.Serializer.INSTANCE, openDeeplinkDto);
            }
            OnSubscribeDto onSubscribeDto = self.on_subscribe;
            if (onSubscribeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, OnSubscribeDto.Serializer.INSTANCE, onSubscribeDto);
            }
            OnCompleteDto onCompleteDto = self.on_complete;
            if (onCompleteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, OnCompleteDto.Serializer.INSTANCE, onCompleteDto);
            }
        }

        public Surrogate(ResultDto resultDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, OpenDeeplinkDto openDeeplinkDto, OnSubscribeDto onSubscribeDto, OnCompleteDto onCompleteDto) {
            this.result = resultDto;
            this.push_screen = pushScreenDto;
            this.dismiss_screen = dismissScreenDto;
            this.dismiss_all = dismissAllDto;
            this.open_deeplink = openDeeplinkDto;
            this.on_subscribe = onSubscribeDto;
            this.on_complete = onCompleteDto;
        }

        public /* synthetic */ Surrogate(ResultDto resultDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, OpenDeeplinkDto openDeeplinkDto, OnSubscribeDto onSubscribeDto, OnCompleteDto onCompleteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : resultDto, (i & 2) != 0 ? null : pushScreenDto, (i & 4) != 0 ? null : dismissScreenDto, (i & 8) != 0 ? null : dismissAllDto, (i & 16) != 0 ? null : openDeeplinkDto, (i & 32) != 0 ? null : onSubscribeDto, (i & 64) != 0 ? null : onCompleteDto);
        }

        public final ResultDto getResult() {
            return this.result;
        }

        public final PushScreenDto getPush_screen() {
            return this.push_screen;
        }

        public final DismissScreenDto getDismiss_screen() {
            return this.dismiss_screen;
        }

        public final DismissAllDto getDismiss_all() {
            return this.dismiss_all;
        }

        public final OpenDeeplinkDto getOpen_deeplink() {
            return this.open_deeplink;
        }

        public final OnSubscribeDto getOn_subscribe() {
            return this.on_subscribe;
        }

        public final OnCompleteDto getOn_complete() {
            return this.on_complete;
        }
    }

    /* compiled from: StreamRouterMessageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "Lgold_flow/proto/v1/StreamRouterMessageResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamRouterMessageResponseDto, StreamRouterMessageResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamRouterMessageResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamRouterMessageResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamRouterMessageResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamRouterMessageResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamRouterMessageResponse> getProtoAdapter() {
            return StreamRouterMessageResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamRouterMessageResponseDto getZeroValue() {
            return StreamRouterMessageResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamRouterMessageResponseDto fromProto(StreamRouterMessageResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Result result = proto.getResult();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ResultDto resultDtoFromProto = result != null ? ResultDto.INSTANCE.fromProto(result) : null;
            PushScreen push_screen = proto.getPush_screen();
            PushScreenDto pushScreenDtoFromProto = push_screen != null ? PushScreenDto.INSTANCE.fromProto(push_screen) : null;
            DismissScreen dismiss_screen = proto.getDismiss_screen();
            DismissScreenDto dismissScreenDtoFromProto = dismiss_screen != null ? DismissScreenDto.INSTANCE.fromProto(dismiss_screen) : null;
            DismissAll dismiss_all = proto.getDismiss_all();
            DismissAllDto dismissAllDtoFromProto = dismiss_all != null ? DismissAllDto.INSTANCE.fromProto(dismiss_all) : null;
            OpenDeeplink open_deeplink = proto.getOpen_deeplink();
            OpenDeeplinkDto openDeeplinkDtoFromProto = open_deeplink != null ? OpenDeeplinkDto.INSTANCE.fromProto(open_deeplink) : null;
            OnSubscribe on_subscribe = proto.getOn_subscribe();
            OnSubscribeDto onSubscribeDtoFromProto = on_subscribe != null ? OnSubscribeDto.INSTANCE.fromProto(on_subscribe) : null;
            OnComplete on_complete = proto.getOn_complete();
            return new StreamRouterMessageResponseDto(new Surrogate(resultDtoFromProto, pushScreenDtoFromProto, dismissScreenDtoFromProto, dismissAllDtoFromProto, openDeeplinkDtoFromProto, onSubscribeDtoFromProto, on_complete != null ? OnCompleteDto.INSTANCE.fromProto(on_complete) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamRouterMessageResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamRouterMessageResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamRouterMessageResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamRouterMessageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PushScreen", "DismissScreen", "DismissAll", "OpenDeeplink", "OnSubscribe", "OnComplete", "Companion", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$DismissAll;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$DismissScreen;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OnComplete;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OnSubscribe;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OpenDeeplink;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$PushScreen;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class RouterMessageDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ RouterMessageDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RouterMessageDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$PushScreen;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/PushScreenDto;", "value", "<init>", "(Lgold_flow/proto/v1/PushScreenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/PushScreenDto;", "getValue", "()Lgold_flow/proto/v1/PushScreenDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PushScreen extends RouterMessageDto {
            private final PushScreenDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PushScreen) && Intrinsics.areEqual(this.value, ((PushScreen) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PushScreen(value=" + this.value + ")";
            }

            public final PushScreenDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PushScreen(PushScreenDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$DismissScreen;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/DismissScreenDto;", "value", "<init>", "(Lgold_flow/proto/v1/DismissScreenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/DismissScreenDto;", "getValue", "()Lgold_flow/proto/v1/DismissScreenDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DismissScreen extends RouterMessageDto {
            private final DismissScreenDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DismissScreen) && Intrinsics.areEqual(this.value, ((DismissScreen) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DismissScreen(value=" + this.value + ")";
            }

            public final DismissScreenDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DismissScreen(DismissScreenDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$DismissAll;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/DismissAllDto;", "value", "<init>", "(Lgold_flow/proto/v1/DismissAllDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/DismissAllDto;", "getValue", "()Lgold_flow/proto/v1/DismissAllDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DismissAll extends RouterMessageDto {
            private final DismissAllDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DismissAll) && Intrinsics.areEqual(this.value, ((DismissAll) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DismissAll(value=" + this.value + ")";
            }

            public final DismissAllDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DismissAll(DismissAllDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OpenDeeplink;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "value", "<init>", "(Lgold_flow/proto/v1/OpenDeeplinkDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "getValue", "()Lgold_flow/proto/v1/OpenDeeplinkDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpenDeeplink extends RouterMessageDto {
            private final OpenDeeplinkDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenDeeplink) && Intrinsics.areEqual(this.value, ((OpenDeeplink) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenDeeplink(value=" + this.value + ")";
            }

            public final OpenDeeplinkDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDeeplink(OpenDeeplinkDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OnSubscribe;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/OnSubscribeDto;", "value", "<init>", "(Lgold_flow/proto/v1/OnSubscribeDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/OnSubscribeDto;", "getValue", "()Lgold_flow/proto/v1/OnSubscribeDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final /* data */ class OnSubscribe extends RouterMessageDto {
            private final OnSubscribeDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnSubscribe) && Intrinsics.areEqual(this.value, ((OnSubscribe) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OnSubscribe(value=" + this.value + ")";
            }

            public final OnSubscribeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSubscribe(OnSubscribeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$OnComplete;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/OnCompleteDto;", "value", "<init>", "(Lgold_flow/proto/v1/OnCompleteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold_flow/proto/v1/OnCompleteDto;", "getValue", "()Lgold_flow/proto/v1/OnCompleteDto;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final /* data */ class OnComplete extends RouterMessageDto {
            private final OnCompleteDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnComplete) && Intrinsics.areEqual(this.value, ((OnComplete) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OnComplete(value=" + this.value + ")";
            }

            public final OnCompleteDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnComplete(OnCompleteDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamRouterMessageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$RouterMessageDto;", "Lgold_flow/proto/v1/StreamRouterMessageResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Companion implements Dto4.Creator<RouterMessageDto, StreamRouterMessageResponse> {
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
            public ProtoAdapter<StreamRouterMessageResponse> getProtoAdapter() {
                return StreamRouterMessageResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RouterMessageDto fromProto(StreamRouterMessageResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPush_screen() != null) {
                    return new PushScreen(PushScreenDto.INSTANCE.fromProto(proto.getPush_screen()));
                }
                if (proto.getDismiss_screen() != null) {
                    return new DismissScreen(DismissScreenDto.INSTANCE.fromProto(proto.getDismiss_screen()));
                }
                if (proto.getDismiss_all() != null) {
                    return new DismissAll(DismissAllDto.INSTANCE.fromProto(proto.getDismiss_all()));
                }
                if (proto.getOpen_deeplink() != null) {
                    return new OpenDeeplink(OpenDeeplinkDto.INSTANCE.fromProto(proto.getOpen_deeplink()));
                }
                if (proto.getOn_subscribe() != null) {
                    return new OnSubscribe(OnSubscribeDto.INSTANCE.fromProto(proto.getOn_subscribe()));
                }
                if (proto.getOn_complete() != null) {
                    return new OnComplete(OnCompleteDto.INSTANCE.fromProto(proto.getOn_complete()));
                }
                return null;
            }
        }
    }

    /* compiled from: StreamRouterMessageResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamRouterMessageResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamRouterMessageResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamRouterMessageResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamRouterMessageResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamRouterMessageResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: StreamRouterMessageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamRouterMessageResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamRouterMessageResponseDto";
        }
    }
}
