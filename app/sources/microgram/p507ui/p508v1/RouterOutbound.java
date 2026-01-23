package microgram.p507ui.p508v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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
import microgram.p507ui.p508v1.RouterOutbound;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Alert;

/* compiled from: RouterOutbound.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000b9:;<=>?@ABCB\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J\u0088\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound;", "Lcom/squareup/wire/Message;", "", "present_alert", "Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "present_bottom_sheet", "Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "push_screen", "Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "dismiss_screen", "Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "dismiss_all", "Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "show_router", "Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "open_deeplink", "Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "present_system_default_share_link", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "present_system_default_share_contents", "Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "present_toast", "Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/RouterOutbound$PresentAlert;Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;Lmicrogram/ui/v1/RouterOutbound$PushScreen;Lmicrogram/ui/v1/RouterOutbound$DismissScreen;Lmicrogram/ui/v1/RouterOutbound$DismissAll;Lmicrogram/ui/v1/RouterOutbound$ShowRouter;Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;Lmicrogram/ui/v1/RouterOutbound$PresentToast;Lokio/ByteString;)V", "getPresent_alert", "()Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "getPresent_bottom_sheet", "()Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "getPush_screen", "()Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "getDismiss_screen", "()Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "getDismiss_all", "()Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "getShow_router", "()Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "getOpen_deeplink", "()Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "getPresent_system_default_share_link", "()Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "getPresent_system_default_share_contents", "()Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "getPresent_toast", "()Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "PresentAlert", "PresentBottomSheet", "PushScreen", "DismissScreen", "DismissAll", "ShowRouter", "OpenDeeplink", "PresentSystemDefaultShareLink", "PresentSystemDefaultShareContents", "PresentToast", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RouterOutbound extends Message {

    @JvmField
    public static final ProtoAdapter<RouterOutbound> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$DismissAll#ADAPTER", jsonName = "dismissAll", oneofName = "concrete", schemaIndex = 4, tag = 5)
    private final DismissAll dismiss_all;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$DismissScreen#ADAPTER", jsonName = "dismissScreen", oneofName = "concrete", schemaIndex = 3, tag = 4)
    private final DismissScreen dismiss_screen;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$OpenDeeplink#ADAPTER", jsonName = "openDeeplink", oneofName = "concrete", schemaIndex = 6, tag = 7)
    private final OpenDeeplink open_deeplink;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PresentAlert#ADAPTER", jsonName = "presentAlert", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final PresentAlert present_alert;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PresentBottomSheet#ADAPTER", jsonName = "presentBottomSheet", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final PresentBottomSheet present_bottom_sheet;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PresentSystemDefaultShareContents#ADAPTER", jsonName = "presentSystemDefaultShareContents", oneofName = "concrete", schemaIndex = 8, tag = 9)
    private final PresentSystemDefaultShareContents present_system_default_share_contents;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PresentSystemDefaultShareLink#ADAPTER", jsonName = "presentSystemDefaultShareLink", oneofName = "concrete", schemaIndex = 7, tag = 8)
    private final PresentSystemDefaultShareLink present_system_default_share_link;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PresentToast#ADAPTER", jsonName = "presentToast", oneofName = "concrete", schemaIndex = 9, tag = 10)
    private final PresentToast present_toast;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$PushScreen#ADAPTER", jsonName = "pushScreen", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final PushScreen push_screen;

    @WireField(adapter = "microgram.ui.v1.RouterOutbound$ShowRouter#ADAPTER", jsonName = "showRouter", oneofName = "concrete", schemaIndex = 5, tag = 6)
    private final ShowRouter show_router;

    public RouterOutbound() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29275newBuilder();
    }

    public final PresentAlert getPresent_alert() {
        return this.present_alert;
    }

    public final PresentBottomSheet getPresent_bottom_sheet() {
        return this.present_bottom_sheet;
    }

    public final PushScreen getPush_screen() {
        return this.push_screen;
    }

    public final DismissScreen getDismiss_screen() {
        return this.dismiss_screen;
    }

    public final DismissAll getDismiss_all() {
        return this.dismiss_all;
    }

    public final ShowRouter getShow_router() {
        return this.show_router;
    }

    public final OpenDeeplink getOpen_deeplink() {
        return this.open_deeplink;
    }

    public final PresentSystemDefaultShareLink getPresent_system_default_share_link() {
        return this.present_system_default_share_link;
    }

    public final PresentSystemDefaultShareContents getPresent_system_default_share_contents() {
        return this.present_system_default_share_contents;
    }

    public final PresentToast getPresent_toast() {
        return this.present_toast;
    }

    public /* synthetic */ RouterOutbound(PresentAlert presentAlert, PresentBottomSheet presentBottomSheet, PushScreen pushScreen, DismissScreen dismissScreen, DismissAll dismissAll, ShowRouter showRouter, OpenDeeplink openDeeplink, PresentSystemDefaultShareLink presentSystemDefaultShareLink, PresentSystemDefaultShareContents presentSystemDefaultShareContents, PresentToast presentToast, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : presentAlert, (i & 2) != 0 ? null : presentBottomSheet, (i & 4) != 0 ? null : pushScreen, (i & 8) != 0 ? null : dismissScreen, (i & 16) != 0 ? null : dismissAll, (i & 32) != 0 ? null : showRouter, (i & 64) != 0 ? null : openDeeplink, (i & 128) != 0 ? null : presentSystemDefaultShareLink, (i & 256) != 0 ? null : presentSystemDefaultShareContents, (i & 512) != 0 ? null : presentToast, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterOutbound(PresentAlert presentAlert, PresentBottomSheet presentBottomSheet, PushScreen pushScreen, DismissScreen dismissScreen, DismissAll dismissAll, ShowRouter showRouter, OpenDeeplink openDeeplink, PresentSystemDefaultShareLink presentSystemDefaultShareLink, PresentSystemDefaultShareContents presentSystemDefaultShareContents, PresentToast presentToast, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.present_alert = presentAlert;
        this.present_bottom_sheet = presentBottomSheet;
        this.push_screen = pushScreen;
        this.dismiss_screen = dismissScreen;
        this.dismiss_all = dismissAll;
        this.show_router = showRouter;
        this.open_deeplink = openDeeplink;
        this.present_system_default_share_link = presentSystemDefaultShareLink;
        this.present_system_default_share_contents = presentSystemDefaultShareContents;
        this.present_toast = presentToast;
        if (Internal.countNonNull(presentAlert, presentBottomSheet, pushScreen, dismissScreen, dismissAll, showRouter, openDeeplink, presentSystemDefaultShareLink, presentSystemDefaultShareContents, presentToast) > 1) {
            throw new IllegalArgumentException("At most one of present_alert, present_bottom_sheet, push_screen, dismiss_screen, dismiss_all, show_router, open_deeplink, present_system_default_share_link, present_system_default_share_contents, present_toast may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29275newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RouterOutbound)) {
            return false;
        }
        RouterOutbound routerOutbound = (RouterOutbound) other;
        return Intrinsics.areEqual(unknownFields(), routerOutbound.unknownFields()) && Intrinsics.areEqual(this.present_alert, routerOutbound.present_alert) && Intrinsics.areEqual(this.present_bottom_sheet, routerOutbound.present_bottom_sheet) && Intrinsics.areEqual(this.push_screen, routerOutbound.push_screen) && Intrinsics.areEqual(this.dismiss_screen, routerOutbound.dismiss_screen) && Intrinsics.areEqual(this.dismiss_all, routerOutbound.dismiss_all) && Intrinsics.areEqual(this.show_router, routerOutbound.show_router) && Intrinsics.areEqual(this.open_deeplink, routerOutbound.open_deeplink) && Intrinsics.areEqual(this.present_system_default_share_link, routerOutbound.present_system_default_share_link) && Intrinsics.areEqual(this.present_system_default_share_contents, routerOutbound.present_system_default_share_contents) && Intrinsics.areEqual(this.present_toast, routerOutbound.present_toast);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PresentAlert presentAlert = this.present_alert;
        int iHashCode2 = (iHashCode + (presentAlert != null ? presentAlert.hashCode() : 0)) * 37;
        PresentBottomSheet presentBottomSheet = this.present_bottom_sheet;
        int iHashCode3 = (iHashCode2 + (presentBottomSheet != null ? presentBottomSheet.hashCode() : 0)) * 37;
        PushScreen pushScreen = this.push_screen;
        int iHashCode4 = (iHashCode3 + (pushScreen != null ? pushScreen.hashCode() : 0)) * 37;
        DismissScreen dismissScreen = this.dismiss_screen;
        int iHashCode5 = (iHashCode4 + (dismissScreen != null ? dismissScreen.hashCode() : 0)) * 37;
        DismissAll dismissAll = this.dismiss_all;
        int iHashCode6 = (iHashCode5 + (dismissAll != null ? dismissAll.hashCode() : 0)) * 37;
        ShowRouter showRouter = this.show_router;
        int iHashCode7 = (iHashCode6 + (showRouter != null ? showRouter.hashCode() : 0)) * 37;
        OpenDeeplink openDeeplink = this.open_deeplink;
        int iHashCode8 = (iHashCode7 + (openDeeplink != null ? openDeeplink.hashCode() : 0)) * 37;
        PresentSystemDefaultShareLink presentSystemDefaultShareLink = this.present_system_default_share_link;
        int iHashCode9 = (iHashCode8 + (presentSystemDefaultShareLink != null ? presentSystemDefaultShareLink.hashCode() : 0)) * 37;
        PresentSystemDefaultShareContents presentSystemDefaultShareContents = this.present_system_default_share_contents;
        int iHashCode10 = (iHashCode9 + (presentSystemDefaultShareContents != null ? presentSystemDefaultShareContents.hashCode() : 0)) * 37;
        PresentToast presentToast = this.present_toast;
        int iHashCode11 = iHashCode10 + (presentToast != null ? presentToast.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PresentAlert presentAlert = this.present_alert;
        if (presentAlert != null) {
            arrayList.add("present_alert=" + presentAlert);
        }
        PresentBottomSheet presentBottomSheet = this.present_bottom_sheet;
        if (presentBottomSheet != null) {
            arrayList.add("present_bottom_sheet=" + presentBottomSheet);
        }
        PushScreen pushScreen = this.push_screen;
        if (pushScreen != null) {
            arrayList.add("push_screen=" + pushScreen);
        }
        DismissScreen dismissScreen = this.dismiss_screen;
        if (dismissScreen != null) {
            arrayList.add("dismiss_screen=" + dismissScreen);
        }
        DismissAll dismissAll = this.dismiss_all;
        if (dismissAll != null) {
            arrayList.add("dismiss_all=" + dismissAll);
        }
        ShowRouter showRouter = this.show_router;
        if (showRouter != null) {
            arrayList.add("show_router=" + showRouter);
        }
        OpenDeeplink openDeeplink = this.open_deeplink;
        if (openDeeplink != null) {
            arrayList.add("open_deeplink=" + openDeeplink);
        }
        PresentSystemDefaultShareLink presentSystemDefaultShareLink = this.present_system_default_share_link;
        if (presentSystemDefaultShareLink != null) {
            arrayList.add("present_system_default_share_link=" + presentSystemDefaultShareLink);
        }
        PresentSystemDefaultShareContents presentSystemDefaultShareContents = this.present_system_default_share_contents;
        if (presentSystemDefaultShareContents != null) {
            arrayList.add("present_system_default_share_contents=" + presentSystemDefaultShareContents);
        }
        PresentToast presentToast = this.present_toast;
        if (presentToast != null) {
            arrayList.add("present_toast=" + presentToast);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RouterOutbound{", "}", 0, null, null, 56, null);
    }

    public final RouterOutbound copy(PresentAlert present_alert, PresentBottomSheet present_bottom_sheet, PushScreen push_screen, DismissScreen dismiss_screen, DismissAll dismiss_all, ShowRouter show_router, OpenDeeplink open_deeplink, PresentSystemDefaultShareLink present_system_default_share_link, PresentSystemDefaultShareContents present_system_default_share_contents, PresentToast present_toast, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RouterOutbound(present_alert, present_bottom_sheet, push_screen, dismiss_screen, dismiss_all, show_router, open_deeplink, present_system_default_share_link, present_system_default_share_contents, present_toast, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RouterOutbound.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RouterOutbound>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RouterOutbound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RouterOutbound.PresentAlert.ADAPTER.encodedSizeWithTag(1, value.getPresent_alert()) + RouterOutbound.PresentBottomSheet.ADAPTER.encodedSizeWithTag(2, value.getPresent_bottom_sheet()) + RouterOutbound.PushScreen.ADAPTER.encodedSizeWithTag(3, value.getPush_screen()) + RouterOutbound.DismissScreen.ADAPTER.encodedSizeWithTag(4, value.getDismiss_screen()) + RouterOutbound.DismissAll.ADAPTER.encodedSizeWithTag(5, value.getDismiss_all()) + RouterOutbound.ShowRouter.ADAPTER.encodedSizeWithTag(6, value.getShow_router()) + RouterOutbound.OpenDeeplink.ADAPTER.encodedSizeWithTag(7, value.getOpen_deeplink()) + RouterOutbound.PresentSystemDefaultShareLink.ADAPTER.encodedSizeWithTag(8, value.getPresent_system_default_share_link()) + RouterOutbound.PresentSystemDefaultShareContents.ADAPTER.encodedSizeWithTag(9, value.getPresent_system_default_share_contents()) + RouterOutbound.PresentToast.ADAPTER.encodedSizeWithTag(10, value.getPresent_toast());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RouterOutbound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RouterOutbound.PresentAlert.ADAPTER.encodeWithTag(writer, 1, (int) value.getPresent_alert());
                RouterOutbound.PresentBottomSheet.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresent_bottom_sheet());
                RouterOutbound.PushScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getPush_screen());
                RouterOutbound.DismissScreen.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_screen());
                RouterOutbound.DismissAll.ADAPTER.encodeWithTag(writer, 5, (int) value.getDismiss_all());
                RouterOutbound.ShowRouter.ADAPTER.encodeWithTag(writer, 6, (int) value.getShow_router());
                RouterOutbound.OpenDeeplink.ADAPTER.encodeWithTag(writer, 7, (int) value.getOpen_deeplink());
                RouterOutbound.PresentSystemDefaultShareLink.ADAPTER.encodeWithTag(writer, 8, (int) value.getPresent_system_default_share_link());
                RouterOutbound.PresentSystemDefaultShareContents.ADAPTER.encodeWithTag(writer, 9, (int) value.getPresent_system_default_share_contents());
                RouterOutbound.PresentToast.ADAPTER.encodeWithTag(writer, 10, (int) value.getPresent_toast());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RouterOutbound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RouterOutbound.PresentToast.ADAPTER.encodeWithTag(writer, 10, (int) value.getPresent_toast());
                RouterOutbound.PresentSystemDefaultShareContents.ADAPTER.encodeWithTag(writer, 9, (int) value.getPresent_system_default_share_contents());
                RouterOutbound.PresentSystemDefaultShareLink.ADAPTER.encodeWithTag(writer, 8, (int) value.getPresent_system_default_share_link());
                RouterOutbound.OpenDeeplink.ADAPTER.encodeWithTag(writer, 7, (int) value.getOpen_deeplink());
                RouterOutbound.ShowRouter.ADAPTER.encodeWithTag(writer, 6, (int) value.getShow_router());
                RouterOutbound.DismissAll.ADAPTER.encodeWithTag(writer, 5, (int) value.getDismiss_all());
                RouterOutbound.DismissScreen.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_screen());
                RouterOutbound.PushScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getPush_screen());
                RouterOutbound.PresentBottomSheet.ADAPTER.encodeWithTag(writer, 2, (int) value.getPresent_bottom_sheet());
                RouterOutbound.PresentAlert.ADAPTER.encodeWithTag(writer, 1, (int) value.getPresent_alert());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RouterOutbound redact(RouterOutbound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RouterOutbound.PresentAlert present_alert = value.getPresent_alert();
                RouterOutbound.PresentAlert presentAlertRedact = present_alert != null ? RouterOutbound.PresentAlert.ADAPTER.redact(present_alert) : null;
                RouterOutbound.PresentBottomSheet present_bottom_sheet = value.getPresent_bottom_sheet();
                RouterOutbound.PresentBottomSheet presentBottomSheetRedact = present_bottom_sheet != null ? RouterOutbound.PresentBottomSheet.ADAPTER.redact(present_bottom_sheet) : null;
                RouterOutbound.PushScreen push_screen = value.getPush_screen();
                RouterOutbound.PushScreen pushScreenRedact = push_screen != null ? RouterOutbound.PushScreen.ADAPTER.redact(push_screen) : null;
                RouterOutbound.DismissScreen dismiss_screen = value.getDismiss_screen();
                RouterOutbound.DismissScreen dismissScreenRedact = dismiss_screen != null ? RouterOutbound.DismissScreen.ADAPTER.redact(dismiss_screen) : null;
                RouterOutbound.DismissAll dismiss_all = value.getDismiss_all();
                RouterOutbound.DismissAll dismissAllRedact = dismiss_all != null ? RouterOutbound.DismissAll.ADAPTER.redact(dismiss_all) : null;
                RouterOutbound.ShowRouter show_router = value.getShow_router();
                RouterOutbound.ShowRouter showRouterRedact = show_router != null ? RouterOutbound.ShowRouter.ADAPTER.redact(show_router) : null;
                RouterOutbound.OpenDeeplink open_deeplink = value.getOpen_deeplink();
                RouterOutbound.OpenDeeplink openDeeplinkRedact = open_deeplink != null ? RouterOutbound.OpenDeeplink.ADAPTER.redact(open_deeplink) : null;
                RouterOutbound.PresentSystemDefaultShareLink present_system_default_share_link = value.getPresent_system_default_share_link();
                RouterOutbound.PresentSystemDefaultShareLink presentSystemDefaultShareLinkRedact = present_system_default_share_link != null ? RouterOutbound.PresentSystemDefaultShareLink.ADAPTER.redact(present_system_default_share_link) : null;
                RouterOutbound.PresentSystemDefaultShareContents present_system_default_share_contents = value.getPresent_system_default_share_contents();
                RouterOutbound.PresentSystemDefaultShareContents presentSystemDefaultShareContentsRedact = present_system_default_share_contents != null ? RouterOutbound.PresentSystemDefaultShareContents.ADAPTER.redact(present_system_default_share_contents) : null;
                RouterOutbound.PresentToast present_toast = value.getPresent_toast();
                return value.copy(presentAlertRedact, presentBottomSheetRedact, pushScreenRedact, dismissScreenRedact, dismissAllRedact, showRouterRedact, openDeeplinkRedact, presentSystemDefaultShareLinkRedact, presentSystemDefaultShareContentsRedact, present_toast != null ? RouterOutbound.PresentToast.ADAPTER.redact(present_toast) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RouterOutbound decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RouterOutbound.PresentAlert presentAlertDecode = null;
                RouterOutbound.PresentBottomSheet presentBottomSheetDecode = null;
                RouterOutbound.PushScreen pushScreenDecode = null;
                RouterOutbound.DismissScreen dismissScreenDecode = null;
                RouterOutbound.DismissAll dismissAllDecode = null;
                RouterOutbound.ShowRouter showRouterDecode = null;
                RouterOutbound.OpenDeeplink openDeeplinkDecode = null;
                RouterOutbound.PresentSystemDefaultShareLink presentSystemDefaultShareLinkDecode = null;
                RouterOutbound.PresentSystemDefaultShareContents presentSystemDefaultShareContentsDecode = null;
                RouterOutbound.PresentToast presentToastDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                presentAlertDecode = RouterOutbound.PresentAlert.ADAPTER.decode(reader);
                                break;
                            case 2:
                                presentBottomSheetDecode = RouterOutbound.PresentBottomSheet.ADAPTER.decode(reader);
                                break;
                            case 3:
                                pushScreenDecode = RouterOutbound.PushScreen.ADAPTER.decode(reader);
                                break;
                            case 4:
                                dismissScreenDecode = RouterOutbound.DismissScreen.ADAPTER.decode(reader);
                                break;
                            case 5:
                                dismissAllDecode = RouterOutbound.DismissAll.ADAPTER.decode(reader);
                                break;
                            case 6:
                                showRouterDecode = RouterOutbound.ShowRouter.ADAPTER.decode(reader);
                                break;
                            case 7:
                                openDeeplinkDecode = RouterOutbound.OpenDeeplink.ADAPTER.decode(reader);
                                break;
                            case 8:
                                presentSystemDefaultShareLinkDecode = RouterOutbound.PresentSystemDefaultShareLink.ADAPTER.decode(reader);
                                break;
                            case 9:
                                presentSystemDefaultShareContentsDecode = RouterOutbound.PresentSystemDefaultShareContents.ADAPTER.decode(reader);
                                break;
                            case 10:
                                presentToastDecode = RouterOutbound.PresentToast.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new RouterOutbound(presentAlertDecode, presentBottomSheetDecode, pushScreenDecode, dismissScreenDecode, dismissAllDecode, showRouterDecode, openDeeplinkDecode, presentSystemDefaultShareLinkDecode, presentSystemDefaultShareContentsDecode, presentToastDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PresentAlert;", "Lcom/squareup/wire/Message;", "", "alert", "Lrh_server_driven_ui/v1/Alert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Alert;Lokio/ByteString;)V", "getAlert", "()Lrh_server_driven_ui/v1/Alert;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentAlert extends Message {

        @JvmField
        public static final ProtoAdapter<PresentAlert> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Alert#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Alert alert;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentAlert() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29279newBuilder();
        }

        public final Alert getAlert() {
            return this.alert;
        }

        public /* synthetic */ PresentAlert(Alert alert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : alert, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentAlert(Alert alert, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.alert = alert;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29279newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PresentAlert)) {
                return false;
            }
            PresentAlert presentAlert = (PresentAlert) other;
            return Intrinsics.areEqual(unknownFields(), presentAlert.unknownFields()) && Intrinsics.areEqual(this.alert, presentAlert.alert);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Alert alert = this.alert;
            int iHashCode2 = iHashCode + (alert != null ? alert.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Alert alert = this.alert;
            if (alert != null) {
                arrayList.add("alert=" + alert);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PresentAlert{", "}", 0, null, null, 56, null);
        }

        public final PresentAlert copy(Alert alert, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PresentAlert(alert, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentAlert.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PresentAlert>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PresentAlert$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PresentAlert value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getAlert() != null ? size + Alert.ADAPTER.encodedSizeWithTag(1, value.getAlert()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PresentAlert value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getAlert() != null) {
                        Alert.ADAPTER.encodeWithTag(writer, 1, (int) value.getAlert());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PresentAlert value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getAlert() != null) {
                        Alert.ADAPTER.encodeWithTag(writer, 1, (int) value.getAlert());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentAlert redact(RouterOutbound.PresentAlert value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Alert alert = value.getAlert();
                    return value.copy(alert != null ? Alert.ADAPTER.redact(alert) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentAlert decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Alert alertDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PresentAlert(alertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            alertDecode = Alert.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PresentBottomSheet;", "Lcom/squareup/wire/Message;", "", "identifier", "", "encoded_initial_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getEncoded_initial_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentBottomSheet extends Message {

        @JvmField
        public static final ProtoAdapter<PresentBottomSheet> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "encodedInitialContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String encoded_initial_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String identifier;

        public PresentBottomSheet() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ PresentBottomSheet(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29280newBuilder();
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getEncoded_initial_content() {
            return this.encoded_initial_content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentBottomSheet(String identifier, String encoded_initial_content, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.identifier = identifier;
            this.encoded_initial_content = encoded_initial_content;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29280newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PresentBottomSheet)) {
                return false;
            }
            PresentBottomSheet presentBottomSheet = (PresentBottomSheet) other;
            return Intrinsics.areEqual(unknownFields(), presentBottomSheet.unknownFields()) && Intrinsics.areEqual(this.identifier, presentBottomSheet.identifier) && Intrinsics.areEqual(this.encoded_initial_content, presentBottomSheet.encoded_initial_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.identifier.hashCode()) * 37) + this.encoded_initial_content.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("identifier=" + Internal.sanitize(this.identifier));
            arrayList.add("encoded_initial_content=" + Internal.sanitize(this.encoded_initial_content));
            return CollectionsKt.joinToString$default(arrayList, ", ", "PresentBottomSheet{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PresentBottomSheet copy$default(PresentBottomSheet presentBottomSheet, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentBottomSheet.identifier;
            }
            if ((i & 2) != 0) {
                str2 = presentBottomSheet.encoded_initial_content;
            }
            if ((i & 4) != 0) {
                byteString = presentBottomSheet.unknownFields();
            }
            return presentBottomSheet.copy(str, str2, byteString);
        }

        public final PresentBottomSheet copy(String identifier, String encoded_initial_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PresentBottomSheet(identifier, encoded_initial_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentBottomSheet.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PresentBottomSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PresentBottomSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentBottomSheet decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PresentBottomSheet(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PresentBottomSheet value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
                    }
                    return !Intrinsics.areEqual(value.getEncoded_initial_content(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEncoded_initial_content()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PresentBottomSheet value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                    }
                    if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEncoded_initial_content());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PresentBottomSheet value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEncoded_initial_content());
                    }
                    if (Intrinsics.areEqual(value.getIdentifier(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentBottomSheet redact(RouterOutbound.PresentBottomSheet value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.PresentBottomSheet.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PushScreen;", "Lcom/squareup/wire/Message;", "", "screen_type", "", "identifier", "encoded_initial_content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getScreen_type", "()Ljava/lang/String;", "getIdentifier", "getEncoded_initial_content", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PushScreen extends Message {

        @JvmField
        public static final ProtoAdapter<PushScreen> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "encodedInitialContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String encoded_initial_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String screen_type;

        public PushScreen() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ PushScreen(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29284newBuilder();
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushScreen(String screen_type, String identifier, String encoded_initial_content, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(screen_type, "screen_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.screen_type = screen_type;
            this.identifier = identifier;
            this.encoded_initial_content = encoded_initial_content;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29284newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PushScreen)) {
                return false;
            }
            PushScreen pushScreen = (PushScreen) other;
            return Intrinsics.areEqual(unknownFields(), pushScreen.unknownFields()) && Intrinsics.areEqual(this.screen_type, pushScreen.screen_type) && Intrinsics.areEqual(this.identifier, pushScreen.identifier) && Intrinsics.areEqual(this.encoded_initial_content, pushScreen.encoded_initial_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.screen_type.hashCode()) * 37) + this.identifier.hashCode()) * 37) + this.encoded_initial_content.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("screen_type=" + Internal.sanitize(this.screen_type));
            arrayList.add("identifier=" + Internal.sanitize(this.identifier));
            arrayList.add("encoded_initial_content=" + Internal.sanitize(this.encoded_initial_content));
            return CollectionsKt.joinToString$default(arrayList, ", ", "PushScreen{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PushScreen copy$default(PushScreen pushScreen, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pushScreen.screen_type;
            }
            if ((i & 2) != 0) {
                str2 = pushScreen.identifier;
            }
            if ((i & 4) != 0) {
                str3 = pushScreen.encoded_initial_content;
            }
            if ((i & 8) != 0) {
                byteString = pushScreen.unknownFields();
            }
            return pushScreen.copy(str, str2, str3, byteString);
        }

        public final PushScreen copy(String screen_type, String identifier, String encoded_initial_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(screen_type, "screen_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encoded_initial_content, "encoded_initial_content");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PushScreen(screen_type, identifier, encoded_initial_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PushScreen.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PushScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PushScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PushScreen decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PushScreen(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PushScreen value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen_type());
                    }
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIdentifier());
                    }
                    return !Intrinsics.areEqual(value.getEncoded_initial_content(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEncoded_initial_content()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PushScreen value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getScreen_type(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_type());
                    }
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                    }
                    if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEncoded_initial_content());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PushScreen value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getEncoded_initial_content(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEncoded_initial_content());
                    }
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIdentifier());
                    }
                    if (Intrinsics.areEqual(value.getScreen_type(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_type());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PushScreen redact(RouterOutbound.PushScreen value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.PushScreen.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$DismissScreen;", "Lcom/squareup/wire/Message;", "", "identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissScreen extends Message {

        @JvmField
        public static final ProtoAdapter<DismissScreen> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public DismissScreen() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29277newBuilder();
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public /* synthetic */ DismissScreen(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissScreen(String identifier, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.identifier = identifier;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29277newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DismissScreen)) {
                return false;
            }
            DismissScreen dismissScreen = (DismissScreen) other;
            return Intrinsics.areEqual(unknownFields(), dismissScreen.unknownFields()) && Intrinsics.areEqual(this.identifier, dismissScreen.identifier);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.identifier.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("identifier=" + Internal.sanitize(this.identifier));
            return CollectionsKt.joinToString$default(arrayList, ", ", "DismissScreen{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ DismissScreen copy$default(DismissScreen dismissScreen, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dismissScreen.identifier;
            }
            if ((i & 2) != 0) {
                byteString = dismissScreen.unknownFields();
            }
            return dismissScreen.copy(str, byteString);
        }

        public final DismissScreen copy(String identifier, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new DismissScreen(identifier, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DismissScreen.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<DismissScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$DismissScreen$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.DismissScreen decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.DismissScreen(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.DismissScreen value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getIdentifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.DismissScreen value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.DismissScreen value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getIdentifier(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.DismissScreen redact(RouterOutbound.DismissScreen value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.DismissScreen.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$DismissAll;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissAll extends Message {

        @JvmField
        public static final ProtoAdapter<DismissAll> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public DismissAll() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29276newBuilder();
        }

        public /* synthetic */ DismissAll(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissAll(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29276newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof DismissAll) && Intrinsics.areEqual(unknownFields(), ((DismissAll) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "DismissAll{}";
        }

        public final DismissAll copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new DismissAll(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DismissAll.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<DismissAll>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$DismissAll$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.DismissAll decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new RouterOutbound.DismissAll(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.DismissAll value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.DismissAll value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.DismissAll value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.DismissAll redact(RouterOutbound.DismissAll value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$ShowRouter;", "Lcom/squareup/wire/Message;", "", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/ui/v1/InitialScreenData;", "navigation_type", "Lmicrogram/ui/v1/NavigationType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/InitialScreenData;Lmicrogram/ui/v1/NavigationType;Lokio/ByteString;)V", "getData", "()Lmicrogram/ui/v1/InitialScreenData;", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowRouter extends Message {

        @JvmField
        public static final ProtoAdapter<ShowRouter> ADAPTER;

        @WireField(adapter = "microgram.ui.v1.InitialScreenData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final InitialScreenData data;

        @WireField(adapter = "microgram.ui.v1.NavigationType#ADAPTER", jsonName = "navigationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final NavigationType navigation_type;

        public ShowRouter() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29285newBuilder();
        }

        public final InitialScreenData getData() {
            return this.data;
        }

        public final NavigationType getNavigation_type() {
            return this.navigation_type;
        }

        public /* synthetic */ ShowRouter(InitialScreenData initialScreenData, NavigationType navigationType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : initialScreenData, (i & 2) != 0 ? NavigationType.NAVIGATION_TYPE_UNSPECIFIED : navigationType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRouter(InitialScreenData initialScreenData, NavigationType navigation_type, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.data = initialScreenData;
            this.navigation_type = navigation_type;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29285newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShowRouter)) {
                return false;
            }
            ShowRouter showRouter = (ShowRouter) other;
            return Intrinsics.areEqual(unknownFields(), showRouter.unknownFields()) && Intrinsics.areEqual(this.data, showRouter.data) && this.navigation_type == showRouter.navigation_type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            InitialScreenData initialScreenData = this.data;
            int iHashCode2 = ((iHashCode + (initialScreenData != null ? initialScreenData.hashCode() : 0)) * 37) + this.navigation_type.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            InitialScreenData initialScreenData = this.data;
            if (initialScreenData != null) {
                arrayList.add("data=" + initialScreenData);
            }
            arrayList.add("navigation_type=" + this.navigation_type);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShowRouter{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ShowRouter copy$default(ShowRouter showRouter, InitialScreenData initialScreenData, NavigationType navigationType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                initialScreenData = showRouter.data;
            }
            if ((i & 2) != 0) {
                navigationType = showRouter.navigation_type;
            }
            if ((i & 4) != 0) {
                byteString = showRouter.unknownFields();
            }
            return showRouter.copy(initialScreenData, navigationType, byteString);
        }

        public final ShowRouter copy(InitialScreenData data, NavigationType navigation_type, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ShowRouter(data, navigation_type, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShowRouter.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ShowRouter>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$ShowRouter$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.ShowRouter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getData() != null) {
                        size += InitialScreenData.ADAPTER.encodedSizeWithTag(1, value.getData());
                    }
                    return value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED ? size + NavigationType.ADAPTER.encodedSizeWithTag(2, value.getNavigation_type()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.ShowRouter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getData() != null) {
                        InitialScreenData.ADAPTER.encodeWithTag(writer, 1, (int) value.getData());
                    }
                    if (value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                        NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.ShowRouter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                        NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                    }
                    if (value.getData() != null) {
                        InitialScreenData.ADAPTER.encodeWithTag(writer, 1, (int) value.getData());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.ShowRouter decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    NavigationType navigationTypeDecode = NavigationType.NAVIGATION_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    InitialScreenData initialScreenDataDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.ShowRouter(initialScreenDataDecode, navigationTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            initialScreenDataDecode = InitialScreenData.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                navigationTypeDecode = NavigationType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.ShowRouter redact(RouterOutbound.ShowRouter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    InitialScreenData data = value.getData();
                    return RouterOutbound.ShowRouter.copy$default(value, data != null ? InitialScreenData.ADAPTER.redact(data) : null, null, ByteString.EMPTY, 2, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$OpenDeeplink;", "Lcom/squareup/wire/Message;", "", "link", "", "navigation_type", "Lmicrogram/ui/v1/NavigationType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/NavigationType;Lokio/ByteString;)V", "getLink", "()Ljava/lang/String;", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OpenDeeplink extends Message {

        @JvmField
        public static final ProtoAdapter<OpenDeeplink> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String link;

        @WireField(adapter = "microgram.ui.v1.NavigationType#ADAPTER", jsonName = "navigationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final NavigationType navigation_type;

        public OpenDeeplink() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29278newBuilder();
        }

        public final String getLink() {
            return this.link;
        }

        public /* synthetic */ OpenDeeplink(String str, NavigationType navigationType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? NavigationType.NAVIGATION_TYPE_UNSPECIFIED : navigationType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final NavigationType getNavigation_type() {
            return this.navigation_type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDeeplink(String link, NavigationType navigation_type, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.link = link;
            this.navigation_type = navigation_type;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29278newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) other;
            return Intrinsics.areEqual(unknownFields(), openDeeplink.unknownFields()) && Intrinsics.areEqual(this.link, openDeeplink.link) && this.navigation_type == openDeeplink.navigation_type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.link.hashCode()) * 37) + this.navigation_type.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("link=" + Internal.sanitize(this.link));
            arrayList.add("navigation_type=" + this.navigation_type);
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenDeeplink{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, String str, NavigationType navigationType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openDeeplink.link;
            }
            if ((i & 2) != 0) {
                navigationType = openDeeplink.navigation_type;
            }
            if ((i & 4) != 0) {
                byteString = openDeeplink.unknownFields();
            }
            return openDeeplink.copy(str, navigationType, byteString);
        }

        public final OpenDeeplink copy(String link, NavigationType navigation_type, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OpenDeeplink(link, navigation_type, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OpenDeeplink.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OpenDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$OpenDeeplink$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.OpenDeeplink value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getLink(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLink());
                    }
                    return value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED ? size + NavigationType.ADAPTER.encodedSizeWithTag(2, value.getNavigation_type()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.OpenDeeplink value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getLink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
                    }
                    if (value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                        NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.OpenDeeplink value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getNavigation_type() != NavigationType.NAVIGATION_TYPE_UNSPECIFIED) {
                        NavigationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigation_type());
                    }
                    if (Intrinsics.areEqual(value.getLink(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.OpenDeeplink decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    NavigationType navigationTypeDecode = NavigationType.NAVIGATION_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.OpenDeeplink(strDecode, navigationTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                navigationTypeDecode = NavigationType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.OpenDeeplink redact(RouterOutbound.OpenDeeplink value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.OpenDeeplink.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareLink;", "Lcom/squareup/wire/Message;", "", "link", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getLink", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentSystemDefaultShareLink extends Message {

        @JvmField
        public static final ProtoAdapter<PresentSystemDefaultShareLink> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String link;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentSystemDefaultShareLink() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29282newBuilder();
        }

        public final String getLink() {
            return this.link;
        }

        public /* synthetic */ PresentSystemDefaultShareLink(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentSystemDefaultShareLink(String link, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.link = link;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29282newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PresentSystemDefaultShareLink)) {
                return false;
            }
            PresentSystemDefaultShareLink presentSystemDefaultShareLink = (PresentSystemDefaultShareLink) other;
            return Intrinsics.areEqual(unknownFields(), presentSystemDefaultShareLink.unknownFields()) && Intrinsics.areEqual(this.link, presentSystemDefaultShareLink.link);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.link.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("link=" + Internal.sanitize(this.link));
            return CollectionsKt.joinToString$default(arrayList, ", ", "PresentSystemDefaultShareLink{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PresentSystemDefaultShareLink copy$default(PresentSystemDefaultShareLink presentSystemDefaultShareLink, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentSystemDefaultShareLink.link;
            }
            if ((i & 2) != 0) {
                byteString = presentSystemDefaultShareLink.unknownFields();
            }
            return presentSystemDefaultShareLink.copy(str, byteString);
        }

        public final PresentSystemDefaultShareLink copy(String link, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PresentSystemDefaultShareLink(link, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentSystemDefaultShareLink.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PresentSystemDefaultShareLink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PresentSystemDefaultShareLink$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentSystemDefaultShareLink decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PresentSystemDefaultShareLink(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PresentSystemDefaultShareLink value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getLink(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLink()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PresentSystemDefaultShareLink value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getLink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PresentSystemDefaultShareLink value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getLink(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentSystemDefaultShareLink redact(RouterOutbound.PresentSystemDefaultShareLink value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.PresentSystemDefaultShareLink.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J \u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PresentSystemDefaultShareContents;", "Lcom/squareup/wire/Message;", "", "contents", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getContents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentSystemDefaultShareContents extends Message {

        @JvmField
        public static final ProtoAdapter<PresentSystemDefaultShareContents> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<String> contents;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentSystemDefaultShareContents() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29281newBuilder();
        }

        public /* synthetic */ PresentSystemDefaultShareContents(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentSystemDefaultShareContents(List<String> contents, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(contents, "contents");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.contents = Internal.immutableCopyOf("contents", contents);
        }

        public final List<String> getContents() {
            return this.contents;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29281newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PresentSystemDefaultShareContents)) {
                return false;
            }
            PresentSystemDefaultShareContents presentSystemDefaultShareContents = (PresentSystemDefaultShareContents) other;
            return Intrinsics.areEqual(unknownFields(), presentSystemDefaultShareContents.unknownFields()) && Intrinsics.areEqual(this.contents, presentSystemDefaultShareContents.contents);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.contents.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.contents.isEmpty()) {
                arrayList.add("contents=" + Internal.sanitize(this.contents));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PresentSystemDefaultShareContents{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentSystemDefaultShareContents copy$default(PresentSystemDefaultShareContents presentSystemDefaultShareContents, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = presentSystemDefaultShareContents.contents;
            }
            if ((i & 2) != 0) {
                byteString = presentSystemDefaultShareContents.unknownFields();
            }
            return presentSystemDefaultShareContents.copy(list, byteString);
        }

        public final PresentSystemDefaultShareContents copy(List<String> contents, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(contents, "contents");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PresentSystemDefaultShareContents(contents, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentSystemDefaultShareContents.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PresentSystemDefaultShareContents>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PresentSystemDefaultShareContents$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PresentSystemDefaultShareContents value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getContents());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PresentSystemDefaultShareContents value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getContents());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PresentSystemDefaultShareContents value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getContents());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentSystemDefaultShareContents decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PresentSystemDefaultShareContents(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentSystemDefaultShareContents redact(RouterOutbound.PresentSystemDefaultShareContents value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterOutbound.PresentSystemDefaultShareContents.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: RouterOutbound.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/RouterOutbound$PresentToast;", "Lcom/squareup/wire/Message;", "", "toast", "Lmicrogram/ui/v1/Toast;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/Toast;Lokio/ByteString;)V", "getToast", "()Lmicrogram/ui/v1/Toast;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentToast extends Message {

        @JvmField
        public static final ProtoAdapter<PresentToast> ADAPTER;

        @WireField(adapter = "microgram.ui.v1.Toast#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Toast toast;

        /* JADX WARN: Multi-variable type inference failed */
        public PresentToast() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29283newBuilder();
        }

        public final Toast getToast() {
            return this.toast;
        }

        public /* synthetic */ PresentToast(Toast toast, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : toast, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentToast(Toast toast, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.toast = toast;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29283newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PresentToast)) {
                return false;
            }
            PresentToast presentToast = (PresentToast) other;
            return Intrinsics.areEqual(unknownFields(), presentToast.unknownFields()) && Intrinsics.areEqual(this.toast, presentToast.toast);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Toast toast = this.toast;
            int iHashCode2 = iHashCode + (toast != null ? toast.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Toast toast = this.toast;
            if (toast != null) {
                arrayList.add("toast=" + toast);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PresentToast{", "}", 0, null, null, 56, null);
        }

        public final PresentToast copy(Toast toast, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PresentToast(toast, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PresentToast.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PresentToast>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterOutbound$PresentToast$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentToast decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Toast toastDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterOutbound.PresentToast(toastDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            toastDecode = Toast.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterOutbound.PresentToast value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getToast() != null ? size + Toast.ADAPTER.encodedSizeWithTag(1, value.getToast()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterOutbound.PresentToast value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getToast() != null) {
                        Toast.ADAPTER.encodeWithTag(writer, 1, (int) value.getToast());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterOutbound.PresentToast value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getToast() != null) {
                        Toast.ADAPTER.encodeWithTag(writer, 1, (int) value.getToast());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterOutbound.PresentToast redact(RouterOutbound.PresentToast value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Toast toast = value.getToast();
                    return value.copy(toast != null ? Toast.ADAPTER.redact(toast) : null, ByteString.EMPTY);
                }
            };
        }
    }
}
