package com.robinhood.android.matcha.p177ui.profile;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "", "<init>", "()V", "showOverflowMenu", "", "getShowOverflowMenu", "()Z", "Loading", "Error", "Loaded", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Error;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Loading;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class MatchaProfileViewState {
    public static final int $stable = 0;

    public /* synthetic */ MatchaProfileViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getShowOverflowMenu();

    private MatchaProfileViewState() {
    }

    /* compiled from: MatchaProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Loading;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "<init>", "()V", "showOverflowMenu", "", "getShowOverflowMenu", "()Z", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends MatchaProfileViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static final boolean showOverflowMenu = false;

        private Loading() {
            super(null);
        }

        @Override // com.robinhood.android.matcha.p177ui.profile.MatchaProfileViewState
        public boolean getShowOverflowMenu() {
            return showOverflowMenu;
        }
    }

    /* compiled from: MatchaProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Error;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "title", "", CarResultComposable2.BODY, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "alertPrimaryButtonText", "<init>", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "getAlertPrimaryButtonText", "showOverflowMenu", "", "getShowOverflowMenu", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends MatchaProfileViewState {
        public static final int $stable = BentoAlertDialog2.Body.$stable;
        private final String alertPrimaryButtonText;
        private final BentoAlertDialog2.Body body;
        private final boolean showOverflowMenu;
        private final String title;

        public static /* synthetic */ Error copy$default(Error error, String str, BentoAlertDialog2.Body body, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.title;
            }
            if ((i & 2) != 0) {
                body = error.body;
            }
            if ((i & 4) != 0) {
                str2 = error.alertPrimaryButtonText;
            }
            return error.copy(str, body, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoAlertDialog2.Body getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAlertPrimaryButtonText() {
            return this.alertPrimaryButtonText;
        }

        public final Error copy(String title, BentoAlertDialog2.Body body, String alertPrimaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(alertPrimaryButtonText, "alertPrimaryButtonText");
            return new Error(title, body, alertPrimaryButtonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.body, error.body) && Intrinsics.areEqual(this.alertPrimaryButtonText, error.alertPrimaryButtonText);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.alertPrimaryButtonText.hashCode();
        }

        public String toString() {
            return "Error(title=" + this.title + ", body=" + this.body + ", alertPrimaryButtonText=" + this.alertPrimaryButtonText + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final BentoAlertDialog2.Body getBody() {
            return this.body;
        }

        public final String getAlertPrimaryButtonText() {
            return this.alertPrimaryButtonText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String title, BentoAlertDialog2.Body body, String alertPrimaryButtonText) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(alertPrimaryButtonText, "alertPrimaryButtonText");
            this.title = title;
            this.body = body;
            this.alertPrimaryButtonText = alertPrimaryButtonText;
        }

        @Override // com.robinhood.android.matcha.p177ui.profile.MatchaProfileViewState
        public boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }
    }

    /* compiled from: MatchaProfileViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003Je\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "sduiComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "userFullName", "", "isUserBlocked", "", "canReportUser", "isPayButtonVisible", "isRequestButtonVisible", "showBlockConfirmationDialog", "showOverflowMenu", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZZZZ)V", "getSduiComponents", "()Ljava/util/List;", "getUserFullName", "()Ljava/lang/String;", "()Z", "getCanReportUser", "getShowBlockConfirmationDialog", "getShowOverflowMenu", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends MatchaProfileViewState {
        public static final int $stable = 8;
        private final boolean canReportUser;
        private final boolean isPayButtonVisible;
        private final boolean isRequestButtonVisible;
        private final boolean isUserBlocked;
        private final List<UIComponent<GenericAction>> sduiComponents;
        private final boolean showBlockConfirmationDialog;
        private final boolean showOverflowMenu;
        private final String userFullName;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.sduiComponents;
            }
            if ((i & 2) != 0) {
                str = loaded.userFullName;
            }
            if ((i & 4) != 0) {
                z = loaded.isUserBlocked;
            }
            if ((i & 8) != 0) {
                z2 = loaded.canReportUser;
            }
            if ((i & 16) != 0) {
                z3 = loaded.isPayButtonVisible;
            }
            if ((i & 32) != 0) {
                z4 = loaded.isRequestButtonVisible;
            }
            if ((i & 64) != 0) {
                z5 = loaded.showBlockConfirmationDialog;
            }
            if ((i & 128) != 0) {
                z6 = loaded.showOverflowMenu;
            }
            boolean z7 = z5;
            boolean z8 = z6;
            boolean z9 = z3;
            boolean z10 = z4;
            return loaded.copy(list, str, z, z2, z9, z10, z7, z8);
        }

        public final List<UIComponent<GenericAction>> component1() {
            return this.sduiComponents;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserFullName() {
            return this.userFullName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsUserBlocked() {
            return this.isUserBlocked;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCanReportUser() {
            return this.canReportUser;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPayButtonVisible() {
            return this.isPayButtonVisible;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsRequestButtonVisible() {
            return this.isRequestButtonVisible;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowBlockConfirmationDialog() {
            return this.showBlockConfirmationDialog;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }

        public final Loaded copy(List<? extends UIComponent<? extends GenericAction>> sduiComponents, String userFullName, boolean isUserBlocked, boolean canReportUser, boolean isPayButtonVisible, boolean isRequestButtonVisible, boolean showBlockConfirmationDialog, boolean showOverflowMenu) {
            Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
            Intrinsics.checkNotNullParameter(userFullName, "userFullName");
            return new Loaded(sduiComponents, userFullName, isUserBlocked, canReportUser, isPayButtonVisible, isRequestButtonVisible, showBlockConfirmationDialog, showOverflowMenu);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.sduiComponents, loaded.sduiComponents) && Intrinsics.areEqual(this.userFullName, loaded.userFullName) && this.isUserBlocked == loaded.isUserBlocked && this.canReportUser == loaded.canReportUser && this.isPayButtonVisible == loaded.isPayButtonVisible && this.isRequestButtonVisible == loaded.isRequestButtonVisible && this.showBlockConfirmationDialog == loaded.showBlockConfirmationDialog && this.showOverflowMenu == loaded.showOverflowMenu;
        }

        public int hashCode() {
            return (((((((((((((this.sduiComponents.hashCode() * 31) + this.userFullName.hashCode()) * 31) + Boolean.hashCode(this.isUserBlocked)) * 31) + Boolean.hashCode(this.canReportUser)) * 31) + Boolean.hashCode(this.isPayButtonVisible)) * 31) + Boolean.hashCode(this.isRequestButtonVisible)) * 31) + Boolean.hashCode(this.showBlockConfirmationDialog)) * 31) + Boolean.hashCode(this.showOverflowMenu);
        }

        public String toString() {
            return "Loaded(sduiComponents=" + this.sduiComponents + ", userFullName=" + this.userFullName + ", isUserBlocked=" + this.isUserBlocked + ", canReportUser=" + this.canReportUser + ", isPayButtonVisible=" + this.isPayButtonVisible + ", isRequestButtonVisible=" + this.isRequestButtonVisible + ", showBlockConfirmationDialog=" + this.showBlockConfirmationDialog + ", showOverflowMenu=" + this.showOverflowMenu + ")";
        }

        public final List<UIComponent<GenericAction>> getSduiComponents() {
            return this.sduiComponents;
        }

        public final String getUserFullName() {
            return this.userFullName;
        }

        public final boolean isUserBlocked() {
            return this.isUserBlocked;
        }

        public final boolean getCanReportUser() {
            return this.canReportUser;
        }

        public final boolean isPayButtonVisible() {
            return this.isPayButtonVisible;
        }

        public final boolean isRequestButtonVisible() {
            return this.isRequestButtonVisible;
        }

        public final boolean getShowBlockConfirmationDialog() {
            return this.showBlockConfirmationDialog;
        }

        @Override // com.robinhood.android.matcha.p177ui.profile.MatchaProfileViewState
        public boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(List<? extends UIComponent<? extends GenericAction>> sduiComponents, String userFullName, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            super(null);
            Intrinsics.checkNotNullParameter(sduiComponents, "sduiComponents");
            Intrinsics.checkNotNullParameter(userFullName, "userFullName");
            this.sduiComponents = sduiComponents;
            this.userFullName = userFullName;
            this.isUserBlocked = z;
            this.canReportUser = z2;
            this.isPayButtonVisible = z3;
            this.isRequestButtonVisible = z4;
            this.showBlockConfirmationDialog = z5;
            this.showOverflowMenu = z6;
        }
    }
}
