package com.robinhood.microgram.sdui;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouterMessage.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage;", "Landroid/os/Parcelable;", "PresentAlert", "PresentBottomSheet", "DismissBottomSheet", "PushScreen", "DismissScreen", "DismissAll", "ShowRouter", "OpenDeeplink", "PresentSystemDefaultShareLink", "PresentSystemDefaultShareContents", "PresentToast", "AdapterModule", "Lcom/robinhood/microgram/sdui/RouterMessage$DismissAll;", "Lcom/robinhood/microgram/sdui/RouterMessage$DismissBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterMessage$DismissScreen;", "Lcom/robinhood/microgram/sdui/RouterMessage$OpenDeeplink;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentAlert;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareContents;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareLink;", "Lcom/robinhood/microgram/sdui/RouterMessage$PresentToast;", "Lcom/robinhood/microgram/sdui/RouterMessage$PushScreen;", "Lcom/robinhood/microgram/sdui/RouterMessage$ShowRouter;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RouterMessage extends Parcelable {

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PresentAlert;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentAlert implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<PresentAlert> CREATOR = new Creator();
        private final GenericAlertContent<MicrogramAction> alertContent;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PresentAlert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentAlert createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PresentAlert((GenericAlertContent) parcel.readParcelable(PresentAlert.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentAlert[] newArray(int i) {
                return new PresentAlert[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentAlert copy$default(PresentAlert presentAlert, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = presentAlert.alertContent;
            }
            return presentAlert.copy(genericAlertContent);
        }

        public final GenericAlertContent<MicrogramAction> component1() {
            return this.alertContent;
        }

        public final PresentAlert copy(GenericAlertContent<MicrogramAction> alertContent) {
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            return new PresentAlert(alertContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alertContent, flags);
        }

        public PresentAlert(GenericAlertContent<MicrogramAction> alertContent) {
            Intrinsics.checkNotNullParameter(alertContent, "alertContent");
            this.alertContent = alertContent;
        }

        public final GenericAlertContent<MicrogramAction> getAlertContent() {
            return this.alertContent;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PresentBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "identifier", "", "encodedInitialContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getEncodedInitialContent", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentBottomSheet implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<PresentBottomSheet> CREATOR = new Creator();
        private final String encodedInitialContent;
        private final String identifier;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PresentBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentBottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PresentBottomSheet(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentBottomSheet[] newArray(int i) {
                return new PresentBottomSheet[i];
            }
        }

        public static /* synthetic */ PresentBottomSheet copy$default(PresentBottomSheet presentBottomSheet, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentBottomSheet.identifier;
            }
            if ((i & 2) != 0) {
                str2 = presentBottomSheet.encodedInitialContent;
            }
            return presentBottomSheet.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        public final PresentBottomSheet copy(String identifier, String encodedInitialContent) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            return new PresentBottomSheet(identifier, encodedInitialContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentBottomSheet)) {
                return false;
            }
            PresentBottomSheet presentBottomSheet = (PresentBottomSheet) other;
            return Intrinsics.areEqual(this.identifier, presentBottomSheet.identifier) && Intrinsics.areEqual(this.encodedInitialContent, presentBottomSheet.encodedInitialContent);
        }

        public int hashCode() {
            return (this.identifier.hashCode() * 31) + this.encodedInitialContent.hashCode();
        }

        public String toString() {
            return "PresentBottomSheet(identifier=" + this.identifier + ", encodedInitialContent=" + this.encodedInitialContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
            dest.writeString(this.encodedInitialContent);
        }

        public PresentBottomSheet(String identifier, String encodedInitialContent) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            this.identifier = identifier;
            this.encodedInitialContent = encodedInitialContent;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$DismissBottomSheet;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissBottomSheet implements RouterMessage {
        public static final Parcelable.Creator<DismissBottomSheet> CREATOR = new Creator();
        private final String identifier;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<DismissBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissBottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DismissBottomSheet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissBottomSheet[] newArray(int i) {
                return new DismissBottomSheet[i];
            }
        }

        public static /* synthetic */ DismissBottomSheet copy$default(DismissBottomSheet dismissBottomSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dismissBottomSheet.identifier;
            }
            return dismissBottomSheet.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final DismissBottomSheet copy(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new DismissBottomSheet(identifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissBottomSheet) && Intrinsics.areEqual(this.identifier, ((DismissBottomSheet) other).identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode();
        }

        public String toString() {
            return "DismissBottomSheet(identifier=" + this.identifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
        }

        public DismissBottomSheet(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PushScreen;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "encodedInitialContent", "", "identifier", "<init>", "(Lcom/robinhood/microgram/sdui/ScreenType;Ljava/lang/String;Ljava/lang/String;)V", "getScreenType", "()Lcom/robinhood/microgram/sdui/ScreenType;", "getEncodedInitialContent", "()Ljava/lang/String;", "getIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushScreen implements RouterMessage {
        public static final Parcelable.Creator<PushScreen> CREATOR = new Creator();
        private final String encodedInitialContent;
        private final String identifier;
        private final RouterMessage5 screenType;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PushScreen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushScreen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PushScreen(RouterMessage5.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushScreen[] newArray(int i) {
                return new PushScreen[i];
            }
        }

        public static /* synthetic */ PushScreen copy$default(PushScreen pushScreen, RouterMessage5 routerMessage5, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                routerMessage5 = pushScreen.screenType;
            }
            if ((i & 2) != 0) {
                str = pushScreen.encodedInitialContent;
            }
            if ((i & 4) != 0) {
                str2 = pushScreen.identifier;
            }
            return pushScreen.copy(routerMessage5, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final PushScreen copy(RouterMessage5 screenType, String encodedInitialContent, String identifier) {
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new PushScreen(screenType, encodedInitialContent, identifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushScreen)) {
                return false;
            }
            PushScreen pushScreen = (PushScreen) other;
            return this.screenType == pushScreen.screenType && Intrinsics.areEqual(this.encodedInitialContent, pushScreen.encodedInitialContent) && Intrinsics.areEqual(this.identifier, pushScreen.identifier);
        }

        public int hashCode() {
            return (((this.screenType.hashCode() * 31) + this.encodedInitialContent.hashCode()) * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "PushScreen(screenType=" + this.screenType + ", encodedInitialContent=" + this.encodedInitialContent + ", identifier=" + this.identifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenType.name());
            dest.writeString(this.encodedInitialContent);
            dest.writeString(this.identifier);
        }

        public PushScreen(RouterMessage5 screenType, String encodedInitialContent, String identifier) {
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.screenType = screenType;
            this.encodedInitialContent = encodedInitialContent;
            this.identifier = identifier;
        }

        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$DismissScreen;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissScreen implements RouterMessage {
        public static final Parcelable.Creator<DismissScreen> CREATOR = new Creator();
        private final String identifier;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<DismissScreen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissScreen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DismissScreen(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissScreen[] newArray(int i) {
                return new DismissScreen[i];
            }
        }

        public static /* synthetic */ DismissScreen copy$default(DismissScreen dismissScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dismissScreen.identifier;
            }
            return dismissScreen.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final DismissScreen copy(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new DismissScreen(identifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissScreen) && Intrinsics.areEqual(this.identifier, ((DismissScreen) other).identifier);
        }

        public int hashCode() {
            return this.identifier.hashCode();
        }

        public String toString() {
            return "DismissScreen(identifier=" + this.identifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
        }

        public DismissScreen(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$DismissAll;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissAll implements RouterMessage {
        public static final Parcelable.Creator<DismissAll> CREATOR = new Creator();

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<DismissAll> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissAll createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new DismissAll();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DismissAll[] newArray(int i) {
                return new DismissAll[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        public boolean equals(Object other) {
            return other instanceof DismissAll;
        }

        public int hashCode() {
            return DismissAll.class.hashCode();
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$ShowRouter;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/microgram/sdui/InitialScreenData;", "<init>", "(Lcom/robinhood/microgram/sdui/InitialScreenData;)V", "getData", "()Lcom/robinhood/microgram/sdui/InitialScreenData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowRouter implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<ShowRouter> CREATOR = new Creator();
        private final InitialScreenData data;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<ShowRouter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowRouter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowRouter(InitialScreenData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowRouter[] newArray(int i) {
                return new ShowRouter[i];
            }
        }

        public static /* synthetic */ ShowRouter copy$default(ShowRouter showRouter, InitialScreenData initialScreenData, int i, Object obj) {
            if ((i & 1) != 0) {
                initialScreenData = showRouter.data;
            }
            return showRouter.copy(initialScreenData);
        }

        /* renamed from: component1, reason: from getter */
        public final InitialScreenData getData() {
            return this.data;
        }

        public final ShowRouter copy(InitialScreenData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ShowRouter(data);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowRouter) && Intrinsics.areEqual(this.data, ((ShowRouter) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ShowRouter(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.data.writeToParcel(dest, flags);
        }

        public ShowRouter(InitialScreenData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final InitialScreenData getData() {
            return this.data;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$OpenDeeplink;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "link", "Landroid/net/Uri;", "navigationType", "Lcom/robinhood/microgram/sdui/NavigationType;", "<init>", "(Landroid/net/Uri;Lcom/robinhood/microgram/sdui/NavigationType;)V", "getLink", "()Landroid/net/Uri;", "getNavigationType", "()Lcom/robinhood/microgram/sdui/NavigationType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenDeeplink implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<OpenDeeplink> CREATOR = new Creator();
        private final Uri link;
        private final RouterMessage3 navigationType;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<OpenDeeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenDeeplink((Uri) parcel.readParcelable(OpenDeeplink.class.getClassLoader()), RouterMessage3.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink[] newArray(int i) {
                return new OpenDeeplink[i];
            }
        }

        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, Uri uri, RouterMessage3 routerMessage3, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = openDeeplink.link;
            }
            if ((i & 2) != 0) {
                routerMessage3 = openDeeplink.navigationType;
            }
            return openDeeplink.copy(uri, routerMessage3);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final RouterMessage3 getNavigationType() {
            return this.navigationType;
        }

        public final OpenDeeplink copy(Uri link, RouterMessage3 navigationType) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            return new OpenDeeplink(link, navigationType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) other;
            return Intrinsics.areEqual(this.link, openDeeplink.link) && this.navigationType == openDeeplink.navigationType;
        }

        public int hashCode() {
            return (this.link.hashCode() * 31) + this.navigationType.hashCode();
        }

        public String toString() {
            return "OpenDeeplink(link=" + this.link + ", navigationType=" + this.navigationType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.link, flags);
            this.navigationType.writeToParcel(dest, flags);
        }

        public OpenDeeplink(Uri link, RouterMessage3 navigationType) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            this.link = link;
            this.navigationType = navigationType;
        }

        public final Uri getLink() {
            return this.link;
        }

        public final RouterMessage3 getNavigationType() {
            return this.navigationType;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareLink;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentSystemDefaultShareLink implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<PresentSystemDefaultShareLink> CREATOR = new Creator();
        private final String link;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PresentSystemDefaultShareLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentSystemDefaultShareLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PresentSystemDefaultShareLink(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentSystemDefaultShareLink[] newArray(int i) {
                return new PresentSystemDefaultShareLink[i];
            }
        }

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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.link);
        }

        public PresentSystemDefaultShareLink(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public final String getLink() {
            return this.link;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PresentSystemDefaultShareContents;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "contents", "", "", "<init>", "(Ljava/util/List;)V", "getContents", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentSystemDefaultShareContents implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<PresentSystemDefaultShareContents> CREATOR = new Creator();
        private final List<String> contents;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PresentSystemDefaultShareContents> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentSystemDefaultShareContents createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PresentSystemDefaultShareContents(parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentSystemDefaultShareContents[] newArray(int i) {
                return new PresentSystemDefaultShareContents[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PresentSystemDefaultShareContents copy$default(PresentSystemDefaultShareContents presentSystemDefaultShareContents, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = presentSystemDefaultShareContents.contents;
            }
            return presentSystemDefaultShareContents.copy(list);
        }

        public final List<String> component1() {
            return this.contents;
        }

        public final PresentSystemDefaultShareContents copy(List<String> contents) {
            Intrinsics.checkNotNullParameter(contents, "contents");
            return new PresentSystemDefaultShareContents(contents);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentSystemDefaultShareContents) && Intrinsics.areEqual(this.contents, ((PresentSystemDefaultShareContents) other).contents);
        }

        public int hashCode() {
            return this.contents.hashCode();
        }

        public String toString() {
            return "PresentSystemDefaultShareContents(contents=" + this.contents + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.contents);
        }

        public PresentSystemDefaultShareContents(List<String> contents) {
            Intrinsics.checkNotNullParameter(contents, "contents");
            this.contents = contents;
        }

        public final List<String> getContents() {
            return this.contents;
        }
    }

    /* compiled from: RouterMessage.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$PresentToast;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionMessage;", "toastData", "Lcom/robinhood/microgram/sdui/ToastData;", "<init>", "(Lcom/robinhood/microgram/sdui/ToastData;)V", "getToastData", "()Lcom/robinhood/microgram/sdui/ToastData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PresentToast implements RouterMessage, RouterMessage2 {
        public static final Parcelable.Creator<PresentToast> CREATOR = new Creator();
        private final ToastData toastData;

        /* compiled from: RouterMessage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<PresentToast> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentToast createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PresentToast(ToastData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PresentToast[] newArray(int i) {
                return new PresentToast[i];
            }
        }

        public static /* synthetic */ PresentToast copy$default(PresentToast presentToast, ToastData toastData, int i, Object obj) {
            if ((i & 1) != 0) {
                toastData = presentToast.toastData;
            }
            return presentToast.copy(toastData);
        }

        /* renamed from: component1, reason: from getter */
        public final ToastData getToastData() {
            return this.toastData;
        }

        public final PresentToast copy(ToastData toastData) {
            Intrinsics.checkNotNullParameter(toastData, "toastData");
            return new PresentToast(toastData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentToast) && Intrinsics.areEqual(this.toastData, ((PresentToast) other).toastData);
        }

        public int hashCode() {
            return this.toastData.hashCode();
        }

        public String toString() {
            return "PresentToast(toastData=" + this.toastData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.toastData.writeToParcel(dest, flags);
        }

        public PresentToast(ToastData toastData) {
            Intrinsics.checkNotNullParameter(toastData, "toastData");
            this.toastData = toastData;
        }

        public final ToastData getToastData() {
            return this.toastData;
        }
    }

    /* compiled from: RouterMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/RouterMessage$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(RouterMessage.class, "message_type").withSubtype(PresentAlert.class, "PRESENT_ALERT").withSubtype(PresentBottomSheet.class, "PRESENT_BOTTOM_SHEET").withSubtype(DismissBottomSheet.class, "DISMISS_BOTTOM_SHEET").withSubtype(PushScreen.class, "PUSH_SCREEN").withSubtype(DismissScreen.class, "DISMISS_SCREEN").withSubtype(DismissAll.class, "DISMISS_ALL").withSubtype(ShowRouter.class, "SHOW_ROUTER").withSubtype(OpenDeeplink.class, "OPEN_DEEPLINK").withSubtype(PresentToast.class, "PRESENT_TOAST").withSubtype(PresentSystemDefaultShareLink.class, "PRESENT_SYSTEM_DEFAULT_SHARE_LINK").withSubtype(PresentSystemDefaultShareContents.class, "PRESENT_SYSTEM_DEFAULT_SHARE_CONTENTS");
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
