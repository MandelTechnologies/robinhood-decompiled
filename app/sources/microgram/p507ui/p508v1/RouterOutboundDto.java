package microgram.p507ui.p508v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.NavigationTypeDto;
import microgram.p507ui.p508v1.RouterOutbound;
import microgram.p507ui.p508v1.RouterOutboundDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.Alert;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: RouterOutboundDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000f#\"$%&'()*+,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00061"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;)V", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "concrete", "(Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;", "getConcrete", "()Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "PresentAlertDto", "PresentBottomSheetDto", "PushScreenDto", "DismissScreenDto", "DismissAllDto", "ShowRouterDto", "OpenDeeplinkDto", "PresentSystemDefaultShareLinkDto", "PresentSystemDefaultShareContentsDto", "PresentToastDto", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class RouterOutboundDto implements Dto3<RouterOutbound>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RouterOutboundDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RouterOutboundDto, RouterOutbound>> binaryBase64Serializer$delegate;
    private static final RouterOutboundDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RouterOutboundDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RouterOutboundDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ConcreteDto getConcrete() {
        if (this.surrogate.getPresent_alert() != null) {
            return new ConcreteDto.PresentAlert(this.surrogate.getPresent_alert());
        }
        if (this.surrogate.getPresent_bottom_sheet() != null) {
            return new ConcreteDto.PresentBottomSheet(this.surrogate.getPresent_bottom_sheet());
        }
        if (this.surrogate.getPush_screen() != null) {
            return new ConcreteDto.PushScreen(this.surrogate.getPush_screen());
        }
        if (this.surrogate.getDismiss_screen() != null) {
            return new ConcreteDto.DismissScreen(this.surrogate.getDismiss_screen());
        }
        if (this.surrogate.getDismiss_all() != null) {
            return new ConcreteDto.DismissAll(this.surrogate.getDismiss_all());
        }
        if (this.surrogate.getShow_router() != null) {
            return new ConcreteDto.ShowRouter(this.surrogate.getShow_router());
        }
        if (this.surrogate.getOpen_deeplink() != null) {
            return new ConcreteDto.OpenDeeplink(this.surrogate.getOpen_deeplink());
        }
        if (this.surrogate.getPresent_system_default_share_link() != null) {
            return new ConcreteDto.PresentSystemDefaultShareLink(this.surrogate.getPresent_system_default_share_link());
        }
        if (this.surrogate.getPresent_system_default_share_contents() != null) {
            return new ConcreteDto.PresentSystemDefaultShareContents(this.surrogate.getPresent_system_default_share_contents());
        }
        if (this.surrogate.getPresent_toast() != null) {
            return new ConcreteDto.PresentToast(this.surrogate.getPresent_toast());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RouterOutboundDto(ConcreteDto concreteDto) {
        ConcreteDto.PresentAlert presentAlert = concreteDto instanceof ConcreteDto.PresentAlert ? (ConcreteDto.PresentAlert) concreteDto : null;
        PresentAlertDto value = presentAlert != null ? presentAlert.getValue() : null;
        ConcreteDto.PresentBottomSheet presentBottomSheet = concreteDto instanceof ConcreteDto.PresentBottomSheet ? (ConcreteDto.PresentBottomSheet) concreteDto : null;
        PresentBottomSheetDto value2 = presentBottomSheet != null ? presentBottomSheet.getValue() : null;
        ConcreteDto.PushScreen pushScreen = concreteDto instanceof ConcreteDto.PushScreen ? (ConcreteDto.PushScreen) concreteDto : null;
        PushScreenDto value3 = pushScreen != null ? pushScreen.getValue() : null;
        ConcreteDto.DismissScreen dismissScreen = concreteDto instanceof ConcreteDto.DismissScreen ? (ConcreteDto.DismissScreen) concreteDto : null;
        DismissScreenDto value4 = dismissScreen != null ? dismissScreen.getValue() : null;
        ConcreteDto.DismissAll dismissAll = concreteDto instanceof ConcreteDto.DismissAll ? (ConcreteDto.DismissAll) concreteDto : null;
        DismissAllDto value5 = dismissAll != null ? dismissAll.getValue() : null;
        ConcreteDto.ShowRouter showRouter = concreteDto instanceof ConcreteDto.ShowRouter ? (ConcreteDto.ShowRouter) concreteDto : null;
        ShowRouterDto value6 = showRouter != null ? showRouter.getValue() : null;
        ConcreteDto.OpenDeeplink openDeeplink = concreteDto instanceof ConcreteDto.OpenDeeplink ? (ConcreteDto.OpenDeeplink) concreteDto : null;
        OpenDeeplinkDto value7 = openDeeplink != null ? openDeeplink.getValue() : null;
        ConcreteDto.PresentSystemDefaultShareLink presentSystemDefaultShareLink = concreteDto instanceof ConcreteDto.PresentSystemDefaultShareLink ? (ConcreteDto.PresentSystemDefaultShareLink) concreteDto : null;
        PresentSystemDefaultShareLinkDto value8 = presentSystemDefaultShareLink != null ? presentSystemDefaultShareLink.getValue() : null;
        ConcreteDto.PresentSystemDefaultShareContents presentSystemDefaultShareContents = concreteDto instanceof ConcreteDto.PresentSystemDefaultShareContents ? (ConcreteDto.PresentSystemDefaultShareContents) concreteDto : null;
        PresentSystemDefaultShareContentsDto value9 = presentSystemDefaultShareContents != null ? presentSystemDefaultShareContents.getValue() : null;
        ConcreteDto.PresentToast presentToast = concreteDto instanceof ConcreteDto.PresentToast ? (ConcreteDto.PresentToast) concreteDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, value6, value7, value8, value9, presentToast != null ? presentToast.getValue() : null));
    }

    public /* synthetic */ RouterOutboundDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : concreteDto);
    }

    @Override // com.robinhood.idl.Dto
    public RouterOutbound toProto() {
        PresentAlertDto present_alert = this.surrogate.getPresent_alert();
        RouterOutbound.PresentAlert proto = present_alert != null ? present_alert.toProto() : null;
        PresentBottomSheetDto present_bottom_sheet = this.surrogate.getPresent_bottom_sheet();
        RouterOutbound.PresentBottomSheet proto2 = present_bottom_sheet != null ? present_bottom_sheet.toProto() : null;
        PushScreenDto push_screen = this.surrogate.getPush_screen();
        RouterOutbound.PushScreen proto3 = push_screen != null ? push_screen.toProto() : null;
        DismissScreenDto dismiss_screen = this.surrogate.getDismiss_screen();
        RouterOutbound.DismissScreen proto4 = dismiss_screen != null ? dismiss_screen.toProto() : null;
        DismissAllDto dismiss_all = this.surrogate.getDismiss_all();
        RouterOutbound.DismissAll proto5 = dismiss_all != null ? dismiss_all.toProto() : null;
        ShowRouterDto show_router = this.surrogate.getShow_router();
        RouterOutbound.ShowRouter proto6 = show_router != null ? show_router.toProto() : null;
        OpenDeeplinkDto open_deeplink = this.surrogate.getOpen_deeplink();
        RouterOutbound.OpenDeeplink proto7 = open_deeplink != null ? open_deeplink.toProto() : null;
        PresentSystemDefaultShareLinkDto present_system_default_share_link = this.surrogate.getPresent_system_default_share_link();
        RouterOutbound.PresentSystemDefaultShareLink proto8 = present_system_default_share_link != null ? present_system_default_share_link.toProto() : null;
        PresentSystemDefaultShareContentsDto present_system_default_share_contents = this.surrogate.getPresent_system_default_share_contents();
        RouterOutbound.PresentSystemDefaultShareContents proto9 = present_system_default_share_contents != null ? present_system_default_share_contents.toProto() : null;
        PresentToastDto present_toast = this.surrogate.getPresent_toast();
        return new RouterOutbound(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, present_toast != null ? present_toast.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[RouterOutboundDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RouterOutboundDto) && Intrinsics.areEqual(((RouterOutboundDto) other).surrogate, this.surrogate);
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
    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b.\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u007f\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00103\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u00103\u001a\u0004\bM\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bS\u00103\u001a\u0004\bQ\u0010RR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010T\u0012\u0004\bW\u00103\u001a\u0004\bU\u0010V¨\u0006Z"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;", "", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "present_alert", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "present_bottom_sheet", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "push_screen", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "dismiss_screen", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "dismiss_all", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "show_router", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "open_deeplink", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "present_system_default_share_link", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "present_system_default_share_contents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "present_toast", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "getPresent_alert", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "getPresent_alert$annotations", "()V", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "getPresent_bottom_sheet", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "getPresent_bottom_sheet$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "getPush_screen", "()Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "getPush_screen$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "getDismiss_screen", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "getDismiss_screen$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "getDismiss_all", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "getDismiss_all$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "getShow_router", "()Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "getShow_router$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "getOpen_deeplink", "()Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "getOpen_deeplink$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "getPresent_system_default_share_link", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "getPresent_system_default_share_link$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "getPresent_system_default_share_contents", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "getPresent_system_default_share_contents$annotations", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "getPresent_toast", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "getPresent_toast$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DismissAllDto dismiss_all;
        private final DismissScreenDto dismiss_screen;
        private final OpenDeeplinkDto open_deeplink;
        private final PresentAlertDto present_alert;
        private final PresentBottomSheetDto present_bottom_sheet;
        private final PresentSystemDefaultShareContentsDto present_system_default_share_contents;
        private final PresentSystemDefaultShareLinkDto present_system_default_share_link;
        private final PresentToastDto present_toast;
        private final PushScreenDto push_screen;
        private final ShowRouterDto show_router;

        public Surrogate() {
            this((PresentAlertDto) null, (PresentBottomSheetDto) null, (PushScreenDto) null, (DismissScreenDto) null, (DismissAllDto) null, (ShowRouterDto) null, (OpenDeeplinkDto) null, (PresentSystemDefaultShareLinkDto) null, (PresentSystemDefaultShareContentsDto) null, (PresentToastDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.present_alert, surrogate.present_alert) && Intrinsics.areEqual(this.present_bottom_sheet, surrogate.present_bottom_sheet) && Intrinsics.areEqual(this.push_screen, surrogate.push_screen) && Intrinsics.areEqual(this.dismiss_screen, surrogate.dismiss_screen) && Intrinsics.areEqual(this.dismiss_all, surrogate.dismiss_all) && Intrinsics.areEqual(this.show_router, surrogate.show_router) && Intrinsics.areEqual(this.open_deeplink, surrogate.open_deeplink) && Intrinsics.areEqual(this.present_system_default_share_link, surrogate.present_system_default_share_link) && Intrinsics.areEqual(this.present_system_default_share_contents, surrogate.present_system_default_share_contents) && Intrinsics.areEqual(this.present_toast, surrogate.present_toast);
        }

        public int hashCode() {
            PresentAlertDto presentAlertDto = this.present_alert;
            int iHashCode = (presentAlertDto == null ? 0 : presentAlertDto.hashCode()) * 31;
            PresentBottomSheetDto presentBottomSheetDto = this.present_bottom_sheet;
            int iHashCode2 = (iHashCode + (presentBottomSheetDto == null ? 0 : presentBottomSheetDto.hashCode())) * 31;
            PushScreenDto pushScreenDto = this.push_screen;
            int iHashCode3 = (iHashCode2 + (pushScreenDto == null ? 0 : pushScreenDto.hashCode())) * 31;
            DismissScreenDto dismissScreenDto = this.dismiss_screen;
            int iHashCode4 = (iHashCode3 + (dismissScreenDto == null ? 0 : dismissScreenDto.hashCode())) * 31;
            DismissAllDto dismissAllDto = this.dismiss_all;
            int iHashCode5 = (iHashCode4 + (dismissAllDto == null ? 0 : dismissAllDto.hashCode())) * 31;
            ShowRouterDto showRouterDto = this.show_router;
            int iHashCode6 = (iHashCode5 + (showRouterDto == null ? 0 : showRouterDto.hashCode())) * 31;
            OpenDeeplinkDto openDeeplinkDto = this.open_deeplink;
            int iHashCode7 = (iHashCode6 + (openDeeplinkDto == null ? 0 : openDeeplinkDto.hashCode())) * 31;
            PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDto = this.present_system_default_share_link;
            int iHashCode8 = (iHashCode7 + (presentSystemDefaultShareLinkDto == null ? 0 : presentSystemDefaultShareLinkDto.hashCode())) * 31;
            PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDto = this.present_system_default_share_contents;
            int iHashCode9 = (iHashCode8 + (presentSystemDefaultShareContentsDto == null ? 0 : presentSystemDefaultShareContentsDto.hashCode())) * 31;
            PresentToastDto presentToastDto = this.present_toast;
            return iHashCode9 + (presentToastDto != null ? presentToastDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(present_alert=" + this.present_alert + ", present_bottom_sheet=" + this.present_bottom_sheet + ", push_screen=" + this.push_screen + ", dismiss_screen=" + this.dismiss_screen + ", dismiss_all=" + this.dismiss_all + ", show_router=" + this.show_router + ", open_deeplink=" + this.open_deeplink + ", present_system_default_share_link=" + this.present_system_default_share_link + ", present_system_default_share_contents=" + this.present_system_default_share_contents + ", present_toast=" + this.present_toast + ")";
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RouterOutboundDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PresentAlertDto presentAlertDto, PresentBottomSheetDto presentBottomSheetDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, ShowRouterDto showRouterDto, OpenDeeplinkDto openDeeplinkDto, PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDto, PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDto, PresentToastDto presentToastDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.present_alert = null;
            } else {
                this.present_alert = presentAlertDto;
            }
            if ((i & 2) == 0) {
                this.present_bottom_sheet = null;
            } else {
                this.present_bottom_sheet = presentBottomSheetDto;
            }
            if ((i & 4) == 0) {
                this.push_screen = null;
            } else {
                this.push_screen = pushScreenDto;
            }
            if ((i & 8) == 0) {
                this.dismiss_screen = null;
            } else {
                this.dismiss_screen = dismissScreenDto;
            }
            if ((i & 16) == 0) {
                this.dismiss_all = null;
            } else {
                this.dismiss_all = dismissAllDto;
            }
            if ((i & 32) == 0) {
                this.show_router = null;
            } else {
                this.show_router = showRouterDto;
            }
            if ((i & 64) == 0) {
                this.open_deeplink = null;
            } else {
                this.open_deeplink = openDeeplinkDto;
            }
            if ((i & 128) == 0) {
                this.present_system_default_share_link = null;
            } else {
                this.present_system_default_share_link = presentSystemDefaultShareLinkDto;
            }
            if ((i & 256) == 0) {
                this.present_system_default_share_contents = null;
            } else {
                this.present_system_default_share_contents = presentSystemDefaultShareContentsDto;
            }
            if ((i & 512) == 0) {
                this.present_toast = null;
            } else {
                this.present_toast = presentToastDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PresentAlertDto presentAlertDto = self.present_alert;
            if (presentAlertDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PresentAlertDto.Serializer.INSTANCE, presentAlertDto);
            }
            PresentBottomSheetDto presentBottomSheetDto = self.present_bottom_sheet;
            if (presentBottomSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PresentBottomSheetDto.Serializer.INSTANCE, presentBottomSheetDto);
            }
            PushScreenDto pushScreenDto = self.push_screen;
            if (pushScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PushScreenDto.Serializer.INSTANCE, pushScreenDto);
            }
            DismissScreenDto dismissScreenDto = self.dismiss_screen;
            if (dismissScreenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DismissScreenDto.Serializer.INSTANCE, dismissScreenDto);
            }
            DismissAllDto dismissAllDto = self.dismiss_all;
            if (dismissAllDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DismissAllDto.Serializer.INSTANCE, dismissAllDto);
            }
            ShowRouterDto showRouterDto = self.show_router;
            if (showRouterDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ShowRouterDto.Serializer.INSTANCE, showRouterDto);
            }
            OpenDeeplinkDto openDeeplinkDto = self.open_deeplink;
            if (openDeeplinkDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, OpenDeeplinkDto.Serializer.INSTANCE, openDeeplinkDto);
            }
            PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDto = self.present_system_default_share_link;
            if (presentSystemDefaultShareLinkDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PresentSystemDefaultShareLinkDto.Serializer.INSTANCE, presentSystemDefaultShareLinkDto);
            }
            PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDto = self.present_system_default_share_contents;
            if (presentSystemDefaultShareContentsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, PresentSystemDefaultShareContentsDto.Serializer.INSTANCE, presentSystemDefaultShareContentsDto);
            }
            PresentToastDto presentToastDto = self.present_toast;
            if (presentToastDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, PresentToastDto.Serializer.INSTANCE, presentToastDto);
            }
        }

        public Surrogate(PresentAlertDto presentAlertDto, PresentBottomSheetDto presentBottomSheetDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, ShowRouterDto showRouterDto, OpenDeeplinkDto openDeeplinkDto, PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDto, PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDto, PresentToastDto presentToastDto) {
            this.present_alert = presentAlertDto;
            this.present_bottom_sheet = presentBottomSheetDto;
            this.push_screen = pushScreenDto;
            this.dismiss_screen = dismissScreenDto;
            this.dismiss_all = dismissAllDto;
            this.show_router = showRouterDto;
            this.open_deeplink = openDeeplinkDto;
            this.present_system_default_share_link = presentSystemDefaultShareLinkDto;
            this.present_system_default_share_contents = presentSystemDefaultShareContentsDto;
            this.present_toast = presentToastDto;
        }

        public /* synthetic */ Surrogate(PresentAlertDto presentAlertDto, PresentBottomSheetDto presentBottomSheetDto, PushScreenDto pushScreenDto, DismissScreenDto dismissScreenDto, DismissAllDto dismissAllDto, ShowRouterDto showRouterDto, OpenDeeplinkDto openDeeplinkDto, PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDto, PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDto, PresentToastDto presentToastDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : presentAlertDto, (i & 2) != 0 ? null : presentBottomSheetDto, (i & 4) != 0 ? null : pushScreenDto, (i & 8) != 0 ? null : dismissScreenDto, (i & 16) != 0 ? null : dismissAllDto, (i & 32) != 0 ? null : showRouterDto, (i & 64) != 0 ? null : openDeeplinkDto, (i & 128) != 0 ? null : presentSystemDefaultShareLinkDto, (i & 256) != 0 ? null : presentSystemDefaultShareContentsDto, (i & 512) != 0 ? null : presentToastDto);
        }

        public final PresentAlertDto getPresent_alert() {
            return this.present_alert;
        }

        public final PresentBottomSheetDto getPresent_bottom_sheet() {
            return this.present_bottom_sheet;
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

        public final ShowRouterDto getShow_router() {
            return this.show_router;
        }

        public final OpenDeeplinkDto getOpen_deeplink() {
            return this.open_deeplink;
        }

        public final PresentSystemDefaultShareLinkDto getPresent_system_default_share_link() {
            return this.present_system_default_share_link;
        }

        public final PresentSystemDefaultShareContentsDto getPresent_system_default_share_contents() {
            return this.present_system_default_share_contents;
        }

        public final PresentToastDto getPresent_toast() {
            return this.present_toast;
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto;", "Lmicrogram/ui/v1/RouterOutbound;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RouterOutboundDto, RouterOutbound> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RouterOutboundDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RouterOutboundDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RouterOutboundDto> getBinaryBase64Serializer() {
            return (KSerializer) RouterOutboundDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RouterOutbound> getProtoAdapter() {
            return RouterOutbound.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RouterOutboundDto getZeroValue() {
            return RouterOutboundDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RouterOutboundDto fromProto(RouterOutbound proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            RouterOutbound.PresentAlert present_alert = proto.getPresent_alert();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PresentAlertDto presentAlertDtoFromProto = present_alert != null ? PresentAlertDto.INSTANCE.fromProto(present_alert) : null;
            RouterOutbound.PresentBottomSheet present_bottom_sheet = proto.getPresent_bottom_sheet();
            PresentBottomSheetDto presentBottomSheetDtoFromProto = present_bottom_sheet != null ? PresentBottomSheetDto.INSTANCE.fromProto(present_bottom_sheet) : null;
            RouterOutbound.PushScreen push_screen = proto.getPush_screen();
            PushScreenDto pushScreenDtoFromProto = push_screen != null ? PushScreenDto.INSTANCE.fromProto(push_screen) : null;
            RouterOutbound.DismissScreen dismiss_screen = proto.getDismiss_screen();
            DismissScreenDto dismissScreenDtoFromProto = dismiss_screen != null ? DismissScreenDto.INSTANCE.fromProto(dismiss_screen) : null;
            RouterOutbound.DismissAll dismiss_all = proto.getDismiss_all();
            DismissAllDto dismissAllDtoFromProto = dismiss_all != null ? DismissAllDto.INSTANCE.fromProto(dismiss_all) : null;
            RouterOutbound.ShowRouter show_router = proto.getShow_router();
            ShowRouterDto showRouterDtoFromProto = show_router != null ? ShowRouterDto.INSTANCE.fromProto(show_router) : null;
            RouterOutbound.OpenDeeplink open_deeplink = proto.getOpen_deeplink();
            OpenDeeplinkDto openDeeplinkDtoFromProto = open_deeplink != null ? OpenDeeplinkDto.INSTANCE.fromProto(open_deeplink) : null;
            RouterOutbound.PresentSystemDefaultShareLink present_system_default_share_link = proto.getPresent_system_default_share_link();
            PresentSystemDefaultShareLinkDto presentSystemDefaultShareLinkDtoFromProto = present_system_default_share_link != null ? PresentSystemDefaultShareLinkDto.INSTANCE.fromProto(present_system_default_share_link) : null;
            RouterOutbound.PresentSystemDefaultShareContents present_system_default_share_contents = proto.getPresent_system_default_share_contents();
            PresentSystemDefaultShareContentsDto presentSystemDefaultShareContentsDtoFromProto = present_system_default_share_contents != null ? PresentSystemDefaultShareContentsDto.INSTANCE.fromProto(present_system_default_share_contents) : null;
            RouterOutbound.PresentToast present_toast = proto.getPresent_toast();
            return new RouterOutboundDto(new Surrogate(presentAlertDtoFromProto, presentBottomSheetDtoFromProto, pushScreenDtoFromProto, dismissScreenDtoFromProto, dismissAllDtoFromProto, showRouterDtoFromProto, openDeeplinkDtoFromProto, presentSystemDefaultShareLinkDtoFromProto, presentSystemDefaultShareContentsDtoFromProto, present_toast != null ? PresentToastDto.INSTANCE.fromProto(present_toast) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouterOutboundDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RouterOutboundDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PresentAlert", "PresentBottomSheet", "PushScreen", "DismissScreen", "DismissAll", "ShowRouter", "OpenDeeplink", "PresentSystemDefaultShareLink", "PresentSystemDefaultShareContents", "PresentToast", "Companion", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$DismissAll;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$DismissScreen;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$OpenDeeplink;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentAlert;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentBottomSheet;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentSystemDefaultShareContents;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentSystemDefaultShareLink;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentToast;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PushScreen;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$ShowRouter;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentAlert;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PresentAlert extends ConcreteDto {
            private final PresentAlertDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PresentAlert) && Intrinsics.areEqual(this.value, ((PresentAlert) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PresentAlert(value=" + this.value + ")";
            }

            public final PresentAlertDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentAlert(PresentAlertDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentBottomSheet;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PresentBottomSheet extends ConcreteDto {
            private final PresentBottomSheetDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PresentBottomSheet) && Intrinsics.areEqual(this.value, ((PresentBottomSheet) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PresentBottomSheet(value=" + this.value + ")";
            }

            public final PresentBottomSheetDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentBottomSheet(PresentBottomSheetDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PushScreen;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PushScreen extends ConcreteDto {
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$DismissScreen;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DismissScreen extends ConcreteDto {
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$DismissAll;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DismissAll extends ConcreteDto {
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$ShowRouter;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowRouter extends ConcreteDto {
            private final ShowRouterDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRouter) && Intrinsics.areEqual(this.value, ((ShowRouter) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowRouter(value=" + this.value + ")";
            }

            public final ShowRouterDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowRouter(ShowRouterDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$OpenDeeplink;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpenDeeplink extends ConcreteDto {
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentSystemDefaultShareLink;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PresentSystemDefaultShareLink extends ConcreteDto {
            private final PresentSystemDefaultShareLinkDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PresentSystemDefaultShareLink) && Intrinsics.areEqual(this.value, ((PresentSystemDefaultShareLink) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PresentSystemDefaultShareLink(value=" + this.value + ")";
            }

            public final PresentSystemDefaultShareLinkDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentSystemDefaultShareLink(PresentSystemDefaultShareLinkDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentSystemDefaultShareContents;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PresentSystemDefaultShareContents extends ConcreteDto {
            private final PresentSystemDefaultShareContentsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PresentSystemDefaultShareContents) && Intrinsics.areEqual(this.value, ((PresentSystemDefaultShareContents) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PresentSystemDefaultShareContents(value=" + this.value + ")";
            }

            public final PresentSystemDefaultShareContentsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentSystemDefaultShareContents(PresentSystemDefaultShareContentsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$PresentToast;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "value", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "getValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PresentToast extends ConcreteDto {
            private final PresentToastDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PresentToast) && Intrinsics.areEqual(this.value, ((PresentToast) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PresentToast(value=" + this.value + ")";
            }

            public final PresentToastDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentToast(PresentToastDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$ConcreteDto;", "Lmicrogram/ui/v1/RouterOutbound;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<ConcreteDto, RouterOutbound> {
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
            public ProtoAdapter<RouterOutbound> getProtoAdapter() {
                return RouterOutbound.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConcreteDto fromProto(RouterOutbound proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPresent_alert() != null) {
                    return new PresentAlert(PresentAlertDto.INSTANCE.fromProto(proto.getPresent_alert()));
                }
                if (proto.getPresent_bottom_sheet() != null) {
                    return new PresentBottomSheet(PresentBottomSheetDto.INSTANCE.fromProto(proto.getPresent_bottom_sheet()));
                }
                if (proto.getPush_screen() != null) {
                    return new PushScreen(PushScreenDto.INSTANCE.fromProto(proto.getPush_screen()));
                }
                if (proto.getDismiss_screen() != null) {
                    return new DismissScreen(DismissScreenDto.INSTANCE.fromProto(proto.getDismiss_screen()));
                }
                if (proto.getDismiss_all() != null) {
                    return new DismissAll(DismissAllDto.INSTANCE.fromProto(proto.getDismiss_all()));
                }
                if (proto.getShow_router() != null) {
                    return new ShowRouter(ShowRouterDto.INSTANCE.fromProto(proto.getShow_router()));
                }
                if (proto.getOpen_deeplink() != null) {
                    return new OpenDeeplink(OpenDeeplinkDto.INSTANCE.fromProto(proto.getOpen_deeplink()));
                }
                if (proto.getPresent_system_default_share_link() != null) {
                    return new PresentSystemDefaultShareLink(PresentSystemDefaultShareLinkDto.INSTANCE.fromProto(proto.getPresent_system_default_share_link()));
                }
                if (proto.getPresent_system_default_share_contents() != null) {
                    return new PresentSystemDefaultShareContents(PresentSystemDefaultShareContentsDto.INSTANCE.fromProto(proto.getPresent_system_default_share_contents()));
                }
                if (proto.getPresent_toast() != null) {
                    return new PresentToast(PresentToastDto.INSTANCE.fromProto(proto.getPresent_toast()));
                }
                return null;
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;)V", "Lrh_server_driven_ui/v1/AlertDto;", "alert", "(Lrh_server_driven_ui/v1/AlertDto;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PresentAlertDto implements Dto3<RouterOutbound.PresentAlert>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PresentAlertDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PresentAlertDto, RouterOutbound.PresentAlert>> binaryBase64Serializer$delegate;
        private static final PresentAlertDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PresentAlertDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PresentAlertDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final AlertDto getAlert() {
            return this.surrogate.getAlert();
        }

        public PresentAlertDto(AlertDto alertDto) {
            this(new Surrogate(alertDto));
        }

        public /* synthetic */ PresentAlertDto(AlertDto alertDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : alertDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PresentAlert toProto() {
            AlertDto alert = this.surrogate.getAlert();
            return new RouterOutbound.PresentAlert(alert != null ? alert.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[PresentAlertDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PresentAlertDto) && Intrinsics.areEqual(((PresentAlertDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;", "", "Lrh_server_driven_ui/v1/AlertDto;", "alert", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/AlertDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/AlertDto;", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "getAlert$annotations", "()V", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AlertDto alert;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((AlertDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.alert, ((Surrogate) other).alert);
            }

            public int hashCode() {
                AlertDto alertDto = this.alert;
                if (alertDto == null) {
                    return 0;
                }
                return alertDto.hashCode();
            }

            public String toString() {
                return "Surrogate(alert=" + this.alert + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$PresentAlertDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, AlertDto alertDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.alert = null;
                } else {
                    this.alert = alertDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                AlertDto alertDto = self.alert;
                if (alertDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, AlertDto.Serializer.INSTANCE, alertDto);
                }
            }

            public Surrogate(AlertDto alertDto) {
                this.alert = alertDto;
            }

            public /* synthetic */ Surrogate(AlertDto alertDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : alertDto);
            }

            public final AlertDto getAlert() {
                return this.alert;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<PresentAlertDto, RouterOutbound.PresentAlert> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PresentAlertDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentAlertDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentAlertDto> getBinaryBase64Serializer() {
                return (KSerializer) PresentAlertDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.PresentAlert> getProtoAdapter() {
                return RouterOutbound.PresentAlert.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentAlertDto getZeroValue() {
                return PresentAlertDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentAlertDto fromProto(RouterOutbound.PresentAlert proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Alert alert = proto.getAlert();
                return new PresentAlertDto(new Surrogate(alert != null ? AlertDto.INSTANCE.fromProto(alert) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentAlertDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentAlertDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PresentAlertDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PresentAlertDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PresentAlert", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PresentAlertDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PresentAlertDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PresentAlertDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentAlertDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PresentAlertDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u000f¨\u0006%"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;)V", "", "identifier", "encoded_initial_content", "(Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;", "getIdentifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PresentBottomSheetDto implements Dto3<RouterOutbound.PresentBottomSheet>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PresentBottomSheetDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PresentBottomSheetDto, RouterOutbound.PresentBottomSheet>> binaryBase64Serializer$delegate;
        private static final PresentBottomSheetDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PresentBottomSheetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PresentBottomSheetDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getIdentifier() {
            return this.surrogate.getIdentifier();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PresentBottomSheetDto(String identifier, String encoded_initial_content) {
            this(new Surrogate(identifier, encoded_initial_content));
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        }

        public /* synthetic */ PresentBottomSheetDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PresentBottomSheet toProto() {
            return new RouterOutbound.PresentBottomSheet(this.surrogate.getIdentifier(), this.surrogate.getEncoded_initial_content(), null, 4, null);
        }

        public String toString() {
            return "[PresentBottomSheetDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PresentBottomSheetDto) && Intrinsics.areEqual(((PresentBottomSheetDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006%"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;", "", "", "identifier", "encoded_initial_content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "()V", "getEncoded_initial_content", "getEncoded_initial_content$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String encoded_initial_content;
            private final String identifier;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.encoded_initial_content, surrogate.encoded_initial_content);
            }

            public int hashCode() {
                return (this.identifier.hashCode() * 31) + this.encoded_initial_content.hashCode();
            }

            public String toString() {
                return "Surrogate(identifier=" + this.identifier + ", encoded_initial_content=" + this.encoded_initial_content + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$PresentBottomSheetDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.identifier = "";
                } else {
                    this.identifier = str;
                }
                if ((i & 2) == 0) {
                    this.encoded_initial_content = "";
                } else {
                    this.encoded_initial_content = str2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.identifier, "")) {
                    output.encodeStringElement(serialDesc, 0, self.identifier);
                }
                if (Intrinsics.areEqual(self.encoded_initial_content, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.encoded_initial_content);
            }

            public Surrogate(String identifier, String encoded_initial_content) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
                this.identifier = identifier;
                this.encoded_initial_content = encoded_initial_content;
            }

            public /* synthetic */ Surrogate(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public final String getEncoded_initial_content() {
                return this.encoded_initial_content;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PresentBottomSheetDto, RouterOutbound.PresentBottomSheet> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PresentBottomSheetDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentBottomSheetDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentBottomSheetDto> getBinaryBase64Serializer() {
                return (KSerializer) PresentBottomSheetDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.PresentBottomSheet> getProtoAdapter() {
                return RouterOutbound.PresentBottomSheet.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentBottomSheetDto getZeroValue() {
                return PresentBottomSheetDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentBottomSheetDto fromProto(RouterOutbound.PresentBottomSheet proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PresentBottomSheetDto(new Surrogate(proto.getIdentifier(), proto.getEncoded_initial_content()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentBottomSheetDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentBottomSheetDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PresentBottomSheetDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PresentBottomSheetDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PresentBottomSheet", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PresentBottomSheetDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PresentBottomSheetDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PresentBottomSheetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentBottomSheetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PresentBottomSheetDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;)V", "", "screen_type", "identifier", "encoded_initial_content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;", "getScreen_type", "getIdentifier", "getEncoded_initial_content", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PushScreenDto implements Dto3<RouterOutbound.PushScreen>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PushScreenDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PushScreenDto, RouterOutbound.PushScreen>> binaryBase64Serializer$delegate;
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

        public final String getScreen_type() {
            return this.surrogate.getScreen_type();
        }

        public final String getIdentifier() {
            return this.surrogate.getIdentifier();
        }

        public final String getEncoded_initial_content() {
            return this.surrogate.getEncoded_initial_content();
        }

        public /* synthetic */ PushScreenDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PushScreenDto(String screen_type, String identifier, String encoded_initial_content) {
            this(new Surrogate(screen_type, identifier, encoded_initial_content));
            Intrinsics.checkNotNullParameter(screen_type, "screen_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
        }

        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PushScreen toProto() {
            return new RouterOutbound.PushScreen(this.surrogate.getScreen_type(), this.surrogate.getIdentifier(), this.surrogate.getEncoded_initial_content(), null, 8, null);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;", "", "", "screen_type", "identifier", "encoded_initial_content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen_type", "getScreen_type$annotations", "()V", "getIdentifier", "getIdentifier$annotations", "getEncoded_initial_content", "getEncoded_initial_content$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String encoded_initial_content;
            private final String identifier;
            private final String screen_type;

            public Surrogate() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.screen_type, surrogate.screen_type) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.encoded_initial_content, surrogate.encoded_initial_content);
            }

            public int hashCode() {
                return (((this.screen_type.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.encoded_initial_content.hashCode();
            }

            public String toString() {
                return "Surrogate(screen_type=" + this.screen_type + ", identifier=" + this.identifier + ", encoded_initial_content=" + this.encoded_initial_content + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$PushScreenDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.screen_type = "";
                } else {
                    this.screen_type = str;
                }
                if ((i & 2) == 0) {
                    this.identifier = "";
                } else {
                    this.identifier = str2;
                }
                if ((i & 4) == 0) {
                    this.encoded_initial_content = "";
                } else {
                    this.encoded_initial_content = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.screen_type, "")) {
                    output.encodeStringElement(serialDesc, 0, self.screen_type);
                }
                if (!Intrinsics.areEqual(self.identifier, "")) {
                    output.encodeStringElement(serialDesc, 1, self.identifier);
                }
                if (Intrinsics.areEqual(self.encoded_initial_content, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.encoded_initial_content);
            }

            public Surrogate(String screen_type, String identifier, String encoded_initial_content) {
                Intrinsics.checkNotNullParameter(screen_type, "screen_type");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
                this.screen_type = screen_type;
                this.identifier = identifier;
                this.encoded_initial_content = encoded_initial_content;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
            }

            public final String getScreen_type() {
                return this.screen_type;
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public final String getEncoded_initial_content() {
                return this.encoded_initial_content;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PushScreenDto, RouterOutbound.PushScreen> {
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
            public ProtoAdapter<RouterOutbound.PushScreen> getProtoAdapter() {
                return RouterOutbound.PushScreen.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PushScreenDto getZeroValue() {
                return PushScreenDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PushScreenDto fromProto(RouterOutbound.PushScreen proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PushScreenDto(new Surrogate(proto.getScreen_type(), proto.getIdentifier(), proto.getEncoded_initial_content()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PushScreenDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PushScreenDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PushScreenDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PushScreenDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PushScreen", kSerializerSerializer.getDescriptor());
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

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PushScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PushScreenDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;)V", "", "identifier", "(Ljava/lang/String;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DismissScreenDto implements Dto3<RouterOutbound.DismissScreen>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<DismissScreenDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DismissScreenDto, RouterOutbound.DismissScreen>> binaryBase64Serializer$delegate;
        private static final DismissScreenDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ DismissScreenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DismissScreenDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DismissScreenDto(String identifier) {
            this(new Surrogate(identifier));
            Intrinsics.checkNotNullParameter(identifier, "identifier");
        }

        public /* synthetic */ DismissScreenDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.DismissScreen toProto() {
            return new RouterOutbound.DismissScreen(this.surrogate.getIdentifier(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[DismissScreenDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof DismissScreenDto) && Intrinsics.areEqual(((DismissScreenDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;", "", "", "identifier", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "()V", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String identifier;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.identifier, ((Surrogate) other).identifier);
            }

            public int hashCode() {
                return this.identifier.hashCode();
            }

            public String toString() {
                return "Surrogate(identifier=" + this.identifier + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$DismissScreenDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.identifier = "";
                } else {
                    this.identifier = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.identifier, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.identifier);
            }

            public Surrogate(String identifier) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                this.identifier = identifier;
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<DismissScreenDto, RouterOutbound.DismissScreen> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DismissScreenDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DismissScreenDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DismissScreenDto> getBinaryBase64Serializer() {
                return (KSerializer) DismissScreenDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.DismissScreen> getProtoAdapter() {
                return RouterOutbound.DismissScreen.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DismissScreenDto getZeroValue() {
                return DismissScreenDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DismissScreenDto fromProto(RouterOutbound.DismissScreen proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new DismissScreenDto(new Surrogate(proto.getIdentifier()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$DismissScreenDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.DismissScreenDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new DismissScreenDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<DismissScreenDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.DismissScreen", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DismissScreenDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public DismissScreenDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new DismissScreenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$DismissScreenDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Surrogate;)V", "()V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DismissAllDto implements Dto3<RouterOutbound.DismissAll>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<DismissAllDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DismissAllDto, RouterOutbound.DismissAll>> binaryBase64Serializer$delegate;
        private static final DismissAllDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ DismissAllDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DismissAllDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public DismissAllDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.DismissAll toProto() {
            return new RouterOutbound.DismissAll(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[DismissAllDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof DismissAllDto) && Intrinsics.areEqual(((DismissAllDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$DismissAllDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.DismissAllDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -313826274;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("microgram.ui.v1.RouterOutboundDto.DismissAllDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<DismissAllDto, RouterOutbound.DismissAll> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DismissAllDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DismissAllDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DismissAllDto> getBinaryBase64Serializer() {
                return (KSerializer) DismissAllDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.DismissAll> getProtoAdapter() {
                return RouterOutbound.DismissAll.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DismissAllDto getZeroValue() {
                return DismissAllDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DismissAllDto fromProto(RouterOutbound.DismissAll proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new DismissAllDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$DismissAllDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.DismissAllDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new DismissAllDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<DismissAllDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.DismissAll", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DismissAllDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public DismissAllDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new DismissAllDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$DismissAllDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$DismissAllDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;)V", "Lmicrogram/ui/v1/InitialScreenDataDto;", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "(Lmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;", "getData", "()Lmicrogram/ui/v1/InitialScreenDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ShowRouterDto implements Dto3<RouterOutbound.ShowRouter>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ShowRouterDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ShowRouterDto, RouterOutbound.ShowRouter>> binaryBase64Serializer$delegate;
        private static final ShowRouterDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ShowRouterDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ShowRouterDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final InitialScreenDataDto getData() {
            return this.surrogate.getData();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ShowRouterDto(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigation_type) {
            this(new Surrogate(initialScreenDataDto, navigation_type));
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        }

        public /* synthetic */ ShowRouterDto(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : initialScreenDataDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.ShowRouter toProto() {
            InitialScreenDataDto data = this.surrogate.getData();
            return new RouterOutbound.ShowRouter(data != null ? data.toProto() : null, (NavigationType) this.surrogate.getNavigation_type().toProto(), null, 4, null);
        }

        public String toString() {
            return "[ShowRouterDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ShowRouterDto) && Intrinsics.areEqual(((ShowRouterDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;", "", "Lmicrogram/ui/v1/InitialScreenDataDto;", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "<init>", "(Lmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/InitialScreenDataDto;", "getData", "()Lmicrogram/ui/v1/InitialScreenDataDto;", "getData$annotations", "()V", "Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final InitialScreenDataDto data;
            private final NavigationTypeDto navigation_type;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((InitialScreenDataDto) null, (NavigationTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.data, surrogate.data) && this.navigation_type == surrogate.navigation_type;
            }

            public int hashCode() {
                InitialScreenDataDto initialScreenDataDto = this.data;
                return ((initialScreenDataDto == null ? 0 : initialScreenDataDto.hashCode()) * 31) + this.navigation_type.hashCode();
            }

            public String toString() {
                return "Surrogate(data=" + this.data + ", navigation_type=" + this.navigation_type + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$ShowRouterDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.data = (i & 1) == 0 ? null : initialScreenDataDto;
                if ((i & 2) == 0) {
                    this.navigation_type = NavigationTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.navigation_type = navigationTypeDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                InitialScreenDataDto initialScreenDataDto = self.data;
                if (initialScreenDataDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, InitialScreenDataDto.Serializer.INSTANCE, initialScreenDataDto);
                }
                if (self.navigation_type != NavigationTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, NavigationTypeDto.Serializer.INSTANCE, self.navigation_type);
                }
            }

            public Surrogate(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigation_type) {
                Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
                this.data = initialScreenDataDto;
                this.navigation_type = navigation_type;
            }

            public final InitialScreenDataDto getData() {
                return this.data;
            }

            public final NavigationTypeDto getNavigation_type() {
                return this.navigation_type;
            }

            public /* synthetic */ Surrogate(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : initialScreenDataDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ShowRouterDto, RouterOutbound.ShowRouter> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ShowRouterDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ShowRouterDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ShowRouterDto> getBinaryBase64Serializer() {
                return (KSerializer) ShowRouterDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.ShowRouter> getProtoAdapter() {
                return RouterOutbound.ShowRouter.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ShowRouterDto getZeroValue() {
                return ShowRouterDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ShowRouterDto fromProto(RouterOutbound.ShowRouter proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                InitialScreenData data = proto.getData();
                return new ShowRouterDto(new Surrogate(data != null ? InitialScreenDataDto.INSTANCE.fromProto(data) : null, NavigationTypeDto.INSTANCE.fromProto(proto.getNavigation_type())), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$ShowRouterDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.ShowRouterDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ShowRouterDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<ShowRouterDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.ShowRouter", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ShowRouterDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ShowRouterDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ShowRouterDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$ShowRouterDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$ShowRouterDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;)V", "", "link", "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "(Ljava/lang/String;Lmicrogram/ui/v1/NavigationTypeDto;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;", "getLink", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OpenDeeplinkDto implements Dto3<RouterOutbound.OpenDeeplink>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OpenDeeplinkDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OpenDeeplinkDto, RouterOutbound.OpenDeeplink>> binaryBase64Serializer$delegate;
        private static final OpenDeeplinkDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OpenDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OpenDeeplinkDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getLink() {
            return this.surrogate.getLink();
        }

        public final NavigationTypeDto getNavigation_type() {
            return this.surrogate.getNavigation_type();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OpenDeeplinkDto(String link, NavigationTypeDto navigation_type) {
            this(new Surrogate(link, navigation_type));
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        }

        public /* synthetic */ OpenDeeplinkDto(String str, NavigationTypeDto navigationTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.OpenDeeplink toProto() {
            return new RouterOutbound.OpenDeeplink(this.surrogate.getLink(), (NavigationType) this.surrogate.getNavigation_type().toProto(), null, 4, null);
        }

        public String toString() {
            return "[OpenDeeplinkDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OpenDeeplinkDto) && Intrinsics.areEqual(((OpenDeeplinkDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;", "", "", "link", "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/NavigationTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/ui/v1/NavigationTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getLink$annotations", "()V", "Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String link;
            private final NavigationTypeDto navigation_type;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (NavigationTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.link, surrogate.link) && this.navigation_type == surrogate.navigation_type;
            }

            public int hashCode() {
                return (this.link.hashCode() * 31) + this.navigation_type.hashCode();
            }

            public String toString() {
                return "Surrogate(link=" + this.link + ", navigation_type=" + this.navigation_type + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$OpenDeeplinkDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, NavigationTypeDto navigationTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.link = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.navigation_type = NavigationTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.navigation_type = navigationTypeDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.link, "")) {
                    output.encodeStringElement(serialDesc, 0, self.link);
                }
                if (self.navigation_type != NavigationTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, NavigationTypeDto.Serializer.INSTANCE, self.navigation_type);
                }
            }

            public Surrogate(String link, NavigationTypeDto navigation_type) {
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
                this.link = link;
                this.navigation_type = navigation_type;
            }

            public final String getLink() {
                return this.link;
            }

            public /* synthetic */ Surrogate(String str, NavigationTypeDto navigationTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto);
            }

            public final NavigationTypeDto getNavigation_type() {
                return this.navigation_type;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<OpenDeeplinkDto, RouterOutbound.OpenDeeplink> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OpenDeeplinkDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OpenDeeplinkDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OpenDeeplinkDto> getBinaryBase64Serializer() {
                return (KSerializer) OpenDeeplinkDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.OpenDeeplink> getProtoAdapter() {
                return RouterOutbound.OpenDeeplink.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OpenDeeplinkDto getZeroValue() {
                return OpenDeeplinkDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OpenDeeplinkDto fromProto(RouterOutbound.OpenDeeplink proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new OpenDeeplinkDto(new Surrogate(proto.getLink(), NavigationTypeDto.INSTANCE.fromProto(proto.getNavigation_type())), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$OpenDeeplinkDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.OpenDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OpenDeeplinkDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<OpenDeeplinkDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.OpenDeeplink", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OpenDeeplinkDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OpenDeeplinkDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OpenDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$OpenDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$OpenDeeplinkDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;)V", "", "link", "(Ljava/lang/String;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;", "getLink", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PresentSystemDefaultShareLinkDto implements Dto3<RouterOutbound.PresentSystemDefaultShareLink>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PresentSystemDefaultShareLinkDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PresentSystemDefaultShareLinkDto, RouterOutbound.PresentSystemDefaultShareLink>> binaryBase64Serializer$delegate;
        private static final PresentSystemDefaultShareLinkDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PresentSystemDefaultShareLinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PresentSystemDefaultShareLinkDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getLink() {
            return this.surrogate.getLink();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PresentSystemDefaultShareLinkDto(String link) {
            this(new Surrogate(link));
            Intrinsics.checkNotNullParameter(link, "link");
        }

        public /* synthetic */ PresentSystemDefaultShareLinkDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PresentSystemDefaultShareLink toProto() {
            return new RouterOutbound.PresentSystemDefaultShareLink(this.surrogate.getLink(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[PresentSystemDefaultShareLinkDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PresentSystemDefaultShareLinkDto) && Intrinsics.areEqual(((PresentSystemDefaultShareLinkDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;", "", "", "link", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getLink$annotations", "()V", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String link;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.link, ((Surrogate) other).link);
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            public String toString() {
                return "Surrogate(link=" + this.link + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C46938xbf0a7ca1.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.link = "";
                } else {
                    this.link = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.link, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.link);
            }

            public Surrogate(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public final String getLink() {
                return this.link;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PresentSystemDefaultShareLinkDto, RouterOutbound.PresentSystemDefaultShareLink> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PresentSystemDefaultShareLinkDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentSystemDefaultShareLinkDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentSystemDefaultShareLinkDto> getBinaryBase64Serializer() {
                return (KSerializer) PresentSystemDefaultShareLinkDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.PresentSystemDefaultShareLink> getProtoAdapter() {
                return RouterOutbound.PresentSystemDefaultShareLink.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentSystemDefaultShareLinkDto getZeroValue() {
                return PresentSystemDefaultShareLinkDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentSystemDefaultShareLinkDto fromProto(RouterOutbound.PresentSystemDefaultShareLink proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PresentSystemDefaultShareLinkDto(new Surrogate(proto.getLink()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentSystemDefaultShareLinkDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentSystemDefaultShareLinkDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PresentSystemDefaultShareLinkDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PresentSystemDefaultShareLinkDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PresentSystemDefaultShareLink", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PresentSystemDefaultShareLinkDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PresentSystemDefaultShareLinkDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PresentSystemDefaultShareLinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareLinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PresentSystemDefaultShareLinkDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;)V", "", "", "contents", "(Ljava/util/List;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;", "getContents", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentSystemDefaultShareContentsDto implements Dto3<RouterOutbound.PresentSystemDefaultShareContents>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PresentSystemDefaultShareContentsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PresentSystemDefaultShareContentsDto, RouterOutbound.PresentSystemDefaultShareContents>> binaryBase64Serializer$delegate;
        private static final PresentSystemDefaultShareContentsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PresentSystemDefaultShareContentsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PresentSystemDefaultShareContentsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final List<String> getContents() {
            return this.surrogate.getContents();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PresentSystemDefaultShareContentsDto(List<String> contents) {
            this(new Surrogate(contents));
            Intrinsics.checkNotNullParameter(contents, "contents");
        }

        public /* synthetic */ PresentSystemDefaultShareContentsDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((List<String>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PresentSystemDefaultShareContents toProto() {
            List<String> contents = this.surrogate.getContents();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contents, 10));
            Iterator<T> it = contents.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new RouterOutbound.PresentSystemDefaultShareContents(arrayList, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[PresentSystemDefaultShareContentsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PresentSystemDefaultShareContentsDto) && Intrinsics.areEqual(((PresentSystemDefaultShareContentsDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;", "", "", "", "contents", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContents", "()Ljava/util/List;", "getContents$annotations", "()V", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<String> contents;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentSystemDefaultShareContentsDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.contents, ((Surrogate) other).contents);
            }

            public int hashCode() {
                return this.contents.hashCode();
            }

            public String toString() {
                return "Surrogate(contents=" + this.contents + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C46936x403bca81.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.contents = CollectionsKt.emptyList();
                } else {
                    this.contents = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (Intrinsics.areEqual(self.contents, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.contents);
            }

            public Surrogate(List<String> contents) {
                Intrinsics.checkNotNullParameter(contents, "contents");
                this.contents = contents;
            }

            public final List<String> getContents() {
                return this.contents;
            }

            public /* synthetic */ Surrogate(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<PresentSystemDefaultShareContentsDto, RouterOutbound.PresentSystemDefaultShareContents> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PresentSystemDefaultShareContentsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentSystemDefaultShareContentsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentSystemDefaultShareContentsDto> getBinaryBase64Serializer() {
                return (KSerializer) PresentSystemDefaultShareContentsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.PresentSystemDefaultShareContents> getProtoAdapter() {
                return RouterOutbound.PresentSystemDefaultShareContents.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentSystemDefaultShareContentsDto getZeroValue() {
                return PresentSystemDefaultShareContentsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentSystemDefaultShareContentsDto fromProto(RouterOutbound.PresentSystemDefaultShareContents proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                List<String> contents = proto.getContents();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contents, 10));
                Iterator<T> it = contents.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return new PresentSystemDefaultShareContentsDto(new Surrogate(arrayList), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentSystemDefaultShareContentsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentSystemDefaultShareContentsDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new PresentSystemDefaultShareContentsDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PresentSystemDefaultShareContentsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PresentSystemDefaultShareContents", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PresentSystemDefaultShareContentsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PresentSystemDefaultShareContentsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PresentSystemDefaultShareContentsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentSystemDefaultShareContentsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PresentSystemDefaultShareContentsDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;)V", "Lmicrogram/ui/v1/ToastDto;", "toast", "(Lmicrogram/ui/v1/ToastDto;)V", "toProto", "()Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;", "getToast", "()Lmicrogram/ui/v1/ToastDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PresentToastDto implements Dto3<RouterOutbound.PresentToast>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PresentToastDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PresentToastDto, RouterOutbound.PresentToast>> binaryBase64Serializer$delegate;
        private static final PresentToastDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PresentToastDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PresentToastDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ToastDto getToast() {
            return this.surrogate.getToast();
        }

        public PresentToastDto(ToastDto toastDto) {
            this(new Surrogate(toastDto));
        }

        public /* synthetic */ PresentToastDto(ToastDto toastDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : toastDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public RouterOutbound.PresentToast toProto() {
            ToastDto toast = this.surrogate.getToast();
            return new RouterOutbound.PresentToast(toast != null ? toast.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[PresentToastDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PresentToastDto) && Intrinsics.areEqual(((PresentToastDto) other).surrogate, this.surrogate);
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
        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;", "", "Lmicrogram/ui/v1/ToastDto;", "toast", "<init>", "(Lmicrogram/ui/v1/ToastDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/ToastDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/ToastDto;", "getToast", "()Lmicrogram/ui/v1/ToastDto;", "getToast$annotations", "()V", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ToastDto toast;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((ToastDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.toast, ((Surrogate) other).toast);
            }

            public int hashCode() {
                ToastDto toastDto = this.toast;
                if (toastDto == null) {
                    return 0;
                }
                return toastDto.hashCode();
            }

            public String toString() {
                return "Surrogate(toast=" + this.toast + ")";
            }

            /* compiled from: RouterOutboundDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return RouterOutboundDto$PresentToastDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ToastDto toastDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.toast = null;
                } else {
                    this.toast = toastDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                ToastDto toastDto = self.toast;
                if (toastDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, ToastDto.Serializer.INSTANCE, toastDto);
                }
            }

            public Surrogate(ToastDto toastDto) {
                this.toast = toastDto;
            }

            public /* synthetic */ Surrogate(ToastDto toastDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : toastDto);
            }

            public final ToastDto getToast() {
                return this.toast;
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<PresentToastDto, RouterOutbound.PresentToast> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PresentToastDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentToastDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PresentToastDto> getBinaryBase64Serializer() {
                return (KSerializer) PresentToastDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RouterOutbound.PresentToast> getProtoAdapter() {
                return RouterOutbound.PresentToast.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentToastDto getZeroValue() {
                return PresentToastDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PresentToastDto fromProto(RouterOutbound.PresentToast proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Toast toast = proto.getToast();
                return new PresentToastDto(new Surrogate(toast != null ? ToastDto.INSTANCE.fromProto(toast) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.RouterOutboundDto$PresentToastDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RouterOutboundDto.PresentToastDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PresentToastDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<PresentToastDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound.PresentToast", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PresentToastDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PresentToastDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PresentToastDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: RouterOutboundDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$PresentToastDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "microgram.ui.v1.RouterOutboundDto$PresentToastDto";
            }
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/RouterOutboundDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/RouterOutboundDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<RouterOutboundDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.RouterOutbound", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RouterOutboundDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RouterOutboundDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RouterOutboundDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RouterOutboundDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutboundDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "microgram.ui.v1.RouterOutboundDto";
        }
    }
}
