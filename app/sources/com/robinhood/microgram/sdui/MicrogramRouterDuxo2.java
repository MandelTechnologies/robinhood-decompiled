package com.robinhood.microgram.sdui;

import android.net.Uri;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.NavigationTypeDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: MicrogramRouterDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent;", "", "<init>", "()V", "DismissAll", "DismissBottomSheet", "DismissScreen", "PresentAlert", "PresentBottomSheet", "PushScreen", "ShowRouter", "OpenDeeplink", "PresentSystemDefaultShareLink", "PresentToast", "Lcom/robinhood/microgram/sdui/RouterEvent$DismissAll;", "Lcom/robinhood/microgram/sdui/RouterEvent$DismissBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterEvent$DismissScreen;", "Lcom/robinhood/microgram/sdui/RouterEvent$OpenDeeplink;", "Lcom/robinhood/microgram/sdui/RouterEvent$PresentAlert;", "Lcom/robinhood/microgram/sdui/RouterEvent$PresentBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterEvent$PresentSystemDefaultShareLink;", "Lcom/robinhood/microgram/sdui/RouterEvent$PresentToast;", "Lcom/robinhood/microgram/sdui/RouterEvent$PushScreen;", "Lcom/robinhood/microgram/sdui/RouterEvent$ShowRouter;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.RouterEvent, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class MicrogramRouterDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ MicrogramRouterDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MicrogramRouterDuxo2() {
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$DismissAll;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$DismissAll */
    public static final /* data */ class DismissAll extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        public static final DismissAll INSTANCE = new DismissAll();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissAll);
        }

        public int hashCode() {
            return 1656338101;
        }

        public String toString() {
            return "DismissAll";
        }

        private DismissAll() {
            super(null);
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$DismissBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$DismissBottomSheet */
    public static final /* data */ class DismissBottomSheet extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        public static final DismissBottomSheet INSTANCE = new DismissBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissBottomSheet);
        }

        public int hashCode() {
            return -376873208;
        }

        public String toString() {
            return "DismissBottomSheet";
        }

        private DismissBottomSheet() {
            super(null);
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$DismissScreen;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$DismissScreen */
    public static final /* data */ class DismissScreen extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        public static final DismissScreen INSTANCE = new DismissScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissScreen);
        }

        public int hashCode() {
            return -403604776;
        }

        public String toString() {
            return "DismissScreen";
        }

        private DismissScreen() {
            super(null);
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007HÆ\u0003J/\u0010\r\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R-\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$PresentAlert;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "alertContent", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lrh_server_driven_ui/v1/AlertDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyAlertContent;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getAlertContent", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$PresentAlert, reason: from toString */
    public static final /* data */ class PresentAlert extends MicrogramRouterDuxo2 {
        public static final int $stable = 8;
        private final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alertContent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentAlert copy$default(PresentAlert presentAlert, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = presentAlert.alertContent;
            }
            return presentAlert.copy(uiObject);
        }

        public final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> component1() {
            return this.alertContent;
        }

        public final PresentAlert copy(UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alertContent) {
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            return new PresentAlert(alertContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentAlert) && Intrinsics.areEqual(this.alertContent, ((PresentAlert) other).alertContent);
        }

        public int hashCode() {
            return this.alertContent.hashCode();
        }

        public String toString() {
            return "PresentAlert(alertContent=" + this.alertContent + ")";
        }

        public final UiObject<GenericAlertContent<MicrogramAction>, AlertDto> getAlertContent() {
            return this.alertContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentAlert(UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alertContent) {
            super(null);
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            this.alertContent = alertContent;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$PresentBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$PresentBottomSheet, reason: from toString */
    public static final /* data */ class PresentBottomSheet extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        private final String identifier;

        public static /* synthetic */ PresentBottomSheet copy$default(PresentBottomSheet presentBottomSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentBottomSheet.identifier;
            }
            return presentBottomSheet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final PresentBottomSheet copy(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new PresentBottomSheet(identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentBottomSheet) && Intrinsics.areEqual(this.identifier, ((PresentBottomSheet) other).identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode();
        }

        public String toString() {
            return "PresentBottomSheet(identifier=" + this.identifier + ")";
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentBottomSheet(String identifier) {
            super(null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$PushScreen;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "identifier", "", "encodedInitialContent", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/microgram/sdui/ScreenType;Lcom/robinhood/microgram/sdui/Theme;)V", "getIdentifier", "()Ljava/lang/String;", "getEncodedInitialContent", "getScreenType", "()Lcom/robinhood/microgram/sdui/ScreenType;", "getTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$PushScreen, reason: from toString */
    public static final /* data */ class PushScreen extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        private final String encodedInitialContent;
        private final String identifier;
        private final RouterMessage5 screenType;
        private final StandardScreen5 theme;

        public static /* synthetic */ PushScreen copy$default(PushScreen pushScreen, String str, String str2, RouterMessage5 routerMessage5, StandardScreen5 standardScreen5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pushScreen.identifier;
            }
            if ((i & 2) != 0) {
                str2 = pushScreen.encodedInitialContent;
            }
            if ((i & 4) != 0) {
                routerMessage5 = pushScreen.screenType;
            }
            if ((i & 8) != 0) {
                standardScreen5 = pushScreen.theme;
            }
            return pushScreen.copy(str, str2, routerMessage5, standardScreen5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        /* renamed from: component3, reason: from getter */
        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        /* renamed from: component4, reason: from getter */
        public final StandardScreen5 getTheme() {
            return this.theme;
        }

        public final PushScreen copy(String identifier, String encodedInitialContent, RouterMessage5 screenType, StandardScreen5 theme) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new PushScreen(identifier, encodedInitialContent, screenType, theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushScreen)) {
                return false;
            }
            PushScreen pushScreen = (PushScreen) other;
            return Intrinsics.areEqual(this.identifier, pushScreen.identifier) && Intrinsics.areEqual(this.encodedInitialContent, pushScreen.encodedInitialContent) && this.screenType == pushScreen.screenType && this.theme == pushScreen.theme;
        }

        public int hashCode() {
            return (((((this.identifier.hashCode() * 31) + this.encodedInitialContent.hashCode()) * 31) + this.screenType.hashCode()) * 31) + this.theme.hashCode();
        }

        public String toString() {
            return "PushScreen(identifier=" + this.identifier + ", encodedInitialContent=" + this.encodedInitialContent + ", screenType=" + this.screenType + ", theme=" + this.theme + ")";
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        public final StandardScreen5 getTheme() {
            return this.theme;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushScreen(String identifier, String encodedInitialContent, RouterMessage5 screenType, StandardScreen5 theme) {
            super(null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.identifier = identifier;
            this.encodedInitialContent = encodedInitialContent;
            this.screenType = screenType;
            this.theme = theme;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$ShowRouter;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "initialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getInitialScreenData", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$ShowRouter, reason: from toString */
    public static final /* data */ class ShowRouter extends MicrogramRouterDuxo2 {
        public static final int $stable = 8;
        private final UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowRouter copy$default(ShowRouter showRouter, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = showRouter.initialScreenData;
            }
            return showRouter.copy(uiObject);
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> component1() {
            return this.initialScreenData;
        }

        public final ShowRouter copy(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData) {
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            return new ShowRouter(initialScreenData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowRouter) && Intrinsics.areEqual(this.initialScreenData, ((ShowRouter) other).initialScreenData);
        }

        public int hashCode() {
            return this.initialScreenData.hashCode();
        }

        public String toString() {
            return "ShowRouter(initialScreenData=" + this.initialScreenData + ")";
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> getInitialScreenData() {
            return this.initialScreenData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRouter(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData) {
            super(null);
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            this.initialScreenData = initialScreenData;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$OpenDeeplink;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "url", "Landroid/net/Uri;", "navigationType", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/NavigationType;", "Lmicrogram/ui/v1/NavigationTypeDto;", "Lcom/robinhood/microgram/sdui/AnyNavigationType;", "<init>", "(Landroid/net/Uri;Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getUrl", "()Landroid/net/Uri;", "getNavigationType", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$OpenDeeplink, reason: from toString */
    public static final /* data */ class OpenDeeplink extends MicrogramRouterDuxo2 {
        public static final int $stable = 8;
        private final UiObject<RouterMessage3, NavigationTypeDto> navigationType;
        private final Uri url;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, Uri uri, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = openDeeplink.url;
            }
            if ((i & 2) != 0) {
                uiObject = openDeeplink.navigationType;
            }
            return openDeeplink.copy(uri, uiObject);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUrl() {
            return this.url;
        }

        public final UiObject<RouterMessage3, NavigationTypeDto> component2() {
            return this.navigationType;
        }

        public final OpenDeeplink copy(Uri url, UiObject<? extends RouterMessage3, ? extends NavigationTypeDto> navigationType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            return new OpenDeeplink(url, navigationType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) other;
            return Intrinsics.areEqual(this.url, openDeeplink.url) && Intrinsics.areEqual(this.navigationType, openDeeplink.navigationType);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.navigationType.hashCode();
        }

        public String toString() {
            return "OpenDeeplink(url=" + this.url + ", navigationType=" + this.navigationType + ")";
        }

        public final Uri getUrl() {
            return this.url;
        }

        public final UiObject<RouterMessage3, NavigationTypeDto> getNavigationType() {
            return this.navigationType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OpenDeeplink(Uri url, UiObject<? extends RouterMessage3, ? extends NavigationTypeDto> navigationType) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            this.url = url;
            this.navigationType = navigationType;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$PresentSystemDefaultShareLink;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$PresentSystemDefaultShareLink, reason: from toString */
    public static final /* data */ class PresentSystemDefaultShareLink extends MicrogramRouterDuxo2 {
        public static final int $stable = 0;
        private final String link;

        public static /* synthetic */ PresentSystemDefaultShareLink copy$default(PresentSystemDefaultShareLink presentSystemDefaultShareLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentSystemDefaultShareLink.link;
            }
            return presentSystemDefaultShareLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final PresentSystemDefaultShareLink copy(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new PresentSystemDefaultShareLink(link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentSystemDefaultShareLink) && Intrinsics.areEqual(this.link, ((PresentSystemDefaultShareLink) other).link);
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        public String toString() {
            return "PresentSystemDefaultShareLink(link=" + this.link + ")";
        }

        public final String getLink() {
            return this.link;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentSystemDefaultShareLink(String link) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterEvent$PresentToast;", "Lcom/robinhood/microgram/sdui/RouterEvent;", "toast", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ToastData;", "Lmicrogram/ui/v1/ToastDto;", "Lcom/robinhood/microgram/sdui/AnyToast;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getToast", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.RouterEvent$PresentToast, reason: from toString */
    public static final /* data */ class PresentToast extends MicrogramRouterDuxo2 {
        public static final int $stable = 8;
        private final UiObject<ToastData, ToastDto> toast;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentToast copy$default(PresentToast presentToast, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = presentToast.toast;
            }
            return presentToast.copy(uiObject);
        }

        public final UiObject<ToastData, ToastDto> component1() {
            return this.toast;
        }

        public final PresentToast copy(UiObject<ToastData, ToastDto> toast) {
            Intrinsics.checkNotNullParameter(toast, "toast");
            return new PresentToast(toast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentToast) && Intrinsics.areEqual(this.toast, ((PresentToast) other).toast);
        }

        public int hashCode() {
            return this.toast.hashCode();
        }

        public String toString() {
            return "PresentToast(toast=" + this.toast + ")";
        }

        public final UiObject<ToastData, ToastDto> getToast() {
            return this.toast;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentToast(UiObject<ToastData, ToastDto> toast) {
            super(null);
            Intrinsics.checkNotNullParameter(toast, "toast");
            this.toast = toast;
        }
    }
}
