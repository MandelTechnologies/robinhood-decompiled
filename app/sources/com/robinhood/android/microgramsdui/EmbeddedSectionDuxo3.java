package com.robinhood.android.microgramsdui;

import android.net.Uri;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.InitialScreenData;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.RouterMessage3;
import com.robinhood.microgram.sdui.ToastData;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.NavigationTypeDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: EmbeddedSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "", "<init>", "()V", "PresentAlert", "PresentBottomSheet", "PresentRouter", "OpenDeeplink", "PresentSystemDefaultShareLink", "PresentToast", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$OpenDeeplink;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentAlert;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentBottomSheet;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentRouter;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentSystemDefaultShareLink;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentToast;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class EmbeddedSectionDuxo3 {
    public static final int $stable = 0;

    public /* synthetic */ EmbeddedSectionDuxo3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmbeddedSectionDuxo3() {
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007HÆ\u0003J/\u0010\r\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R-\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\b\u0012\u0004\u0012\u00020\u0005`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentAlert;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "alertContent", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lrh_server_driven_ui/v1/AlertDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyAlertContent;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getAlertContent", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$PresentAlert, reason: from toString */
    public static final /* data */ class PresentAlert extends EmbeddedSectionDuxo3 {
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

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentBottomSheet;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$PresentBottomSheet, reason: from toString */
    public static final /* data */ class PresentBottomSheet extends EmbeddedSectionDuxo3 {
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

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentRouter;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "initialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getInitialScreenData", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$PresentRouter, reason: from toString */
    public static final /* data */ class PresentRouter extends EmbeddedSectionDuxo3 {
        public static final int $stable = 8;
        private final UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentRouter copy$default(PresentRouter presentRouter, UiObject uiObject, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = presentRouter.initialScreenData;
            }
            return presentRouter.copy(uiObject);
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> component1() {
            return this.initialScreenData;
        }

        public final PresentRouter copy(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData) {
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            return new PresentRouter(initialScreenData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentRouter) && Intrinsics.areEqual(this.initialScreenData, ((PresentRouter) other).initialScreenData);
        }

        public int hashCode() {
            return this.initialScreenData.hashCode();
        }

        public String toString() {
            return "PresentRouter(initialScreenData=" + this.initialScreenData + ")";
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> getInitialScreenData() {
            return this.initialScreenData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentRouter(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData) {
            super(null);
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            this.initialScreenData = initialScreenData;
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$OpenDeeplink;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "url", "Landroid/net/Uri;", "navigationType", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/NavigationType;", "Lmicrogram/ui/v1/NavigationTypeDto;", "Lcom/robinhood/microgram/sdui/AnyNavigationType;", "<init>", "(Landroid/net/Uri;Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getUrl", "()Landroid/net/Uri;", "getNavigationType", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$OpenDeeplink, reason: from toString */
    public static final /* data */ class OpenDeeplink extends EmbeddedSectionDuxo3 {
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

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentSystemDefaultShareLink;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$PresentSystemDefaultShareLink, reason: from toString */
    public static final /* data */ class PresentSystemDefaultShareLink extends EmbeddedSectionDuxo3 {
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

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent$PresentToast;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "toast", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ToastData;", "Lmicrogram/ui/v1/ToastDto;", "Lcom/robinhood/microgram/sdui/AnyToast;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getToast", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionEvent$PresentToast, reason: from toString */
    public static final /* data */ class PresentToast extends EmbeddedSectionDuxo3 {
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
