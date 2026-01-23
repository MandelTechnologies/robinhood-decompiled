package com.withpersona.sdk2.inquiry.p424ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.VerifyPersonaButtonComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Landroid/os/Parcelable;", "<init>", "()V", "Displaying", "PendingAction", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class UiState implements Parcelable {
    public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiState() {
    }

    /* compiled from: UiState.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u0002KLB©\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J¸\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b3\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b7\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\b\u0014\u0010CR%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\bJ\u0010(¨\u0006M"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "stepName", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "autoSubmit", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "pendingAction", "", "hasRequestedGpsPermissions", "isRequestingGpsPermissions", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "triggeringComponent", "requestPermissionKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Ljava/lang/String;", "getStepName", "getComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getError", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "getNfcScan", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "getAutoSubmit", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "getPendingAction", "()Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Z", "getHasRequestedGpsPermissions", "()Z", "Ljava/util/Map;", "getComponentParams", "()Ljava/util/Map;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getTriggeringComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getRequestPermissionKey", "NfcScan", "AutoSubmit", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Displaying extends UiState {
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();
        private final AutoSubmit autoSubmit;
        private final List<UiComponentError> componentErrors;
        private final Map<String, ComponentParam> componentParams;
        private final List<UiComponent> components;
        private final String error;
        private final boolean hasRequestedGpsPermissions;
        private final boolean isRequestingGpsPermissions;
        private final NfcScan nfcScan;
        private final PendingAction pendingAction;
        private final String requestPermissionKey;
        private final String stepName;
        private final StepStyles.UiStepStyle styles;
        private final UiComponent triggeringComponent;

        /* compiled from: UiState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Displaying createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                AutoSubmit autoSubmit;
                PendingAction pendingAction;
                boolean z;
                LinkedHashMap linkedHashMap2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                for (int i3 = 0; i3 != i; i3++) {
                    arrayList.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                String string2 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Displaying.class.getClassLoader());
                String string3 = parcel.readString();
                NfcScan nfcScanCreateFromParcel = parcel.readInt() == 0 ? null : NfcScan.CREATOR.createFromParcel(parcel);
                AutoSubmit autoSubmitCreateFromParcel = parcel.readInt() == 0 ? null : AutoSubmit.CREATOR.createFromParcel(parcel);
                PendingAction pendingAction2 = (PendingAction) parcel.readParcelable(Displaying.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    linkedHashMap = null;
                    autoSubmit = autoSubmitCreateFromParcel;
                    pendingAction = pendingAction2;
                    z = true;
                } else {
                    linkedHashMap = null;
                    autoSubmit = autoSubmitCreateFromParcel;
                    pendingAction = pendingAction2;
                    z = false;
                }
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = linkedHashMap;
                } else {
                    int i6 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(i6);
                    while (i2 != i6) {
                        linkedHashMap2.put(parcel.readString(), parcel.readParcelable(Displaying.class.getClassLoader()));
                        i2++;
                        uiStepStyle = uiStepStyle;
                    }
                }
                return new Displaying(arrayList, string2, arrayList2, uiStepStyle, string3, nfcScanCreateFromParcel, autoSubmit, pendingAction, z, z2, linkedHashMap2, (UiComponent) parcel.readParcelable(Displaying.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Displaying[] newArray(int i) {
                return new Displaying[i];
            }
        }

        public static /* synthetic */ Displaying copy$default(Displaying displaying, List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map map, UiComponent uiComponent, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = displaying.components;
            }
            return displaying.copy(list, (i & 2) != 0 ? displaying.stepName : str, (i & 4) != 0 ? displaying.componentErrors : list2, (i & 8) != 0 ? displaying.styles : uiStepStyle, (i & 16) != 0 ? displaying.error : str2, (i & 32) != 0 ? displaying.nfcScan : nfcScan, (i & 64) != 0 ? displaying.autoSubmit : autoSubmit, (i & 128) != 0 ? displaying.pendingAction : pendingAction, (i & 256) != 0 ? displaying.hasRequestedGpsPermissions : z, (i & 512) != 0 ? displaying.isRequestingGpsPermissions : z2, (i & 1024) != 0 ? displaying.componentParams : map, (i & 2048) != 0 ? displaying.triggeringComponent : uiComponent, (i & 4096) != 0 ? displaying.requestPermissionKey : str3);
        }

        public final Displaying copy(List<? extends UiComponent> components, String stepName, List<? extends UiComponentError> componentErrors, StepStyles.UiStepStyle styles, String error, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean hasRequestedGpsPermissions, boolean isRequestingGpsPermissions, Map<String, ? extends ComponentParam> componentParams, UiComponent triggeringComponent, String requestPermissionKey) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
            Intrinsics.checkNotNullParameter(requestPermissionKey, "requestPermissionKey");
            return new Displaying(components, stepName, componentErrors, styles, error, nfcScan, autoSubmit, pendingAction, hasRequestedGpsPermissions, isRequestingGpsPermissions, componentParams, triggeringComponent, requestPermissionKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return Intrinsics.areEqual(this.components, displaying.components) && Intrinsics.areEqual(this.stepName, displaying.stepName) && Intrinsics.areEqual(this.componentErrors, displaying.componentErrors) && Intrinsics.areEqual(this.styles, displaying.styles) && Intrinsics.areEqual(this.error, displaying.error) && Intrinsics.areEqual(this.nfcScan, displaying.nfcScan) && Intrinsics.areEqual(this.autoSubmit, displaying.autoSubmit) && Intrinsics.areEqual(this.pendingAction, displaying.pendingAction) && this.hasRequestedGpsPermissions == displaying.hasRequestedGpsPermissions && this.isRequestingGpsPermissions == displaying.isRequestingGpsPermissions && Intrinsics.areEqual(this.componentParams, displaying.componentParams) && Intrinsics.areEqual(this.triggeringComponent, displaying.triggeringComponent) && Intrinsics.areEqual(this.requestPermissionKey, displaying.requestPermissionKey);
        }

        public int hashCode() {
            int iHashCode = ((((this.components.hashCode() * 31) + this.stepName.hashCode()) * 31) + this.componentErrors.hashCode()) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            String str = this.error;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NfcScan nfcScan = this.nfcScan;
            int iHashCode4 = (iHashCode3 + (nfcScan == null ? 0 : nfcScan.hashCode())) * 31;
            AutoSubmit autoSubmit = this.autoSubmit;
            int iHashCode5 = (iHashCode4 + (autoSubmit == null ? 0 : autoSubmit.hashCode())) * 31;
            PendingAction pendingAction = this.pendingAction;
            int iHashCode6 = (((((iHashCode5 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31) + Boolean.hashCode(this.hasRequestedGpsPermissions)) * 31) + Boolean.hashCode(this.isRequestingGpsPermissions)) * 31;
            Map<String, ComponentParam> map = this.componentParams;
            int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            UiComponent uiComponent = this.triggeringComponent;
            return ((iHashCode7 + (uiComponent != null ? uiComponent.hashCode() : 0)) * 31) + this.requestPermissionKey.hashCode();
        }

        public String toString() {
            return "Displaying(components=" + this.components + ", stepName=" + this.stepName + ", componentErrors=" + this.componentErrors + ", styles=" + this.styles + ", error=" + this.error + ", nfcScan=" + this.nfcScan + ", autoSubmit=" + this.autoSubmit + ", pendingAction=" + this.pendingAction + ", hasRequestedGpsPermissions=" + this.hasRequestedGpsPermissions + ", isRequestingGpsPermissions=" + this.isRequestingGpsPermissions + ", componentParams=" + this.componentParams + ", triggeringComponent=" + this.triggeringComponent + ", requestPermissionKey=" + this.requestPermissionKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiComponent> list = this.components;
            dest.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.stepName);
            List<UiComponentError> list2 = this.componentErrors;
            dest.writeInt(list2.size());
            Iterator<UiComponentError> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.styles, flags);
            dest.writeString(this.error);
            NfcScan nfcScan = this.nfcScan;
            if (nfcScan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                nfcScan.writeToParcel(dest, flags);
            }
            AutoSubmit autoSubmit = this.autoSubmit;
            if (autoSubmit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoSubmit.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.pendingAction, flags);
            dest.writeInt(this.hasRequestedGpsPermissions ? 1 : 0);
            dest.writeInt(this.isRequestingGpsPermissions ? 1 : 0);
            Map<String, ComponentParam> map = this.componentParams;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeParcelable(this.triggeringComponent, flags);
            dest.writeString(this.requestPermissionKey);
        }

        public final List<UiComponent> getComponents() {
            return this.components;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public /* synthetic */ Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map map, UiComponent uiComponent, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, uiStepStyle, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : nfcScan, (i & 64) != 0 ? null : autoSubmit, (i & 128) != 0 ? null : pendingAction, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : map, (i & 2048) != 0 ? null : uiComponent, (i & 4096) != 0 ? "0" : str3);
        }

        public final List<UiComponentError> getComponentErrors() {
            return this.componentErrors;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public final String getError() {
            return this.error;
        }

        public final NfcScan getNfcScan() {
            return this.nfcScan;
        }

        public final AutoSubmit getAutoSubmit() {
            return this.autoSubmit;
        }

        public final PendingAction getPendingAction() {
            return this.pendingAction;
        }

        public final boolean getHasRequestedGpsPermissions() {
            return this.hasRequestedGpsPermissions;
        }

        /* renamed from: isRequestingGpsPermissions, reason: from getter */
        public final boolean getIsRequestingGpsPermissions() {
            return this.isRequestingGpsPermissions;
        }

        public final Map<String, ComponentParam> getComponentParams() {
            return this.componentParams;
        }

        public final UiComponent getTriggeringComponent() {
            return this.triggeringComponent;
        }

        public final String getRequestPermissionKey() {
            return this.requestPermissionKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Displaying(List<? extends UiComponent> components, String stepName, List<? extends UiComponentError> componentErrors, StepStyles.UiStepStyle uiStepStyle, String str, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map<String, ? extends ComponentParam> map, UiComponent uiComponent, String requestPermissionKey) {
            super(null);
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
            Intrinsics.checkNotNullParameter(requestPermissionKey, "requestPermissionKey");
            this.components = components;
            this.stepName = stepName;
            this.componentErrors = componentErrors;
            this.styles = uiStepStyle;
            this.error = str;
            this.nfcScan = nfcScan;
            this.autoSubmit = autoSubmit;
            this.pendingAction = pendingAction;
            this.hasRequestedGpsPermissions = z;
            this.isRequestingGpsPermissions = z2;
            this.componentParams = map;
            this.triggeringComponent = uiComponent;
            this.requestPermissionKey = requestPermissionKey;
        }

        /* compiled from: UiState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "getComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class NfcScan implements Parcelable {
            public static final Parcelable.Creator<NfcScan> CREATOR = new Creator();
            private final GovernmentIdNfcScanComponent component;

            /* compiled from: UiState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<NfcScan> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NfcScan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NfcScan((GovernmentIdNfcScanComponent) parcel.readParcelable(NfcScan.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NfcScan[] newArray(int i) {
                    return new NfcScan[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NfcScan) && Intrinsics.areEqual(this.component, ((NfcScan) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            public String toString() {
                return "NfcScan(component=" + this.component + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.component, flags);
            }

            public NfcScan(GovernmentIdNfcScanComponent component) {
                Intrinsics.checkNotNullParameter(component, "component");
                this.component = component;
            }

            public final GovernmentIdNfcScanComponent getComponent() {
                return this.component;
            }
        }

        /* compiled from: UiState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "component", "", "countdown", "", "countdownText", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "getComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "I", "getCountdown", "Ljava/lang/String;", "getCountdownText", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class AutoSubmit implements Parcelable {
            public static final Parcelable.Creator<AutoSubmit> CREATOR = new Creator();
            private final UiComponent2 component;
            private final int countdown;
            private final String countdownText;

            /* compiled from: UiState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AutoSubmit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoSubmit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoSubmit((UiComponent2) parcel.readParcelable(AutoSubmit.class.getClassLoader()), parcel.readInt(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoSubmit[] newArray(int i) {
                    return new AutoSubmit[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSubmit)) {
                    return false;
                }
                AutoSubmit autoSubmit = (AutoSubmit) other;
                return Intrinsics.areEqual(this.component, autoSubmit.component) && this.countdown == autoSubmit.countdown && Intrinsics.areEqual(this.countdownText, autoSubmit.countdownText);
            }

            public int hashCode() {
                int iHashCode = ((this.component.hashCode() * 31) + Integer.hashCode(this.countdown)) * 31;
                String str = this.countdownText;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "AutoSubmit(component=" + this.component + ", countdown=" + this.countdown + ", countdownText=" + this.countdownText + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.component, flags);
                dest.writeInt(this.countdown);
                dest.writeString(this.countdownText);
            }

            public AutoSubmit(UiComponent2 component, int i, String str) {
                Intrinsics.checkNotNullParameter(component, "component");
                this.component = component;
                this.countdown = i;
                this.countdownText = str;
            }

            public final UiComponent2 getComponent() {
                return this.component;
            }

            public final int getCountdown() {
                return this.countdown;
            }

            public final String getCountdownText() {
                return this.countdownText;
            }
        }
    }

    /* compiled from: UiState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Landroid/os/Parcelable;", "CreateReusablePersona", "VerifyReusablePersona", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface PendingAction extends Parcelable {

        /* compiled from: UiState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$CreateReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "createPersonaSheetComponent", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "getCreatePersonaSheetComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CreateReusablePersona implements PendingAction {
            public static final Parcelable.Creator<CreateReusablePersona> CREATOR = new Creator();
            private final CreatePersonaSheetComponent createPersonaSheetComponent;

            /* compiled from: UiState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CreateReusablePersona> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CreateReusablePersona createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreateReusablePersona((CreatePersonaSheetComponent) parcel.readParcelable(CreateReusablePersona.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CreateReusablePersona[] newArray(int i) {
                    return new CreateReusablePersona[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateReusablePersona) && Intrinsics.areEqual(this.createPersonaSheetComponent, ((CreateReusablePersona) other).createPersonaSheetComponent);
            }

            public int hashCode() {
                return this.createPersonaSheetComponent.hashCode();
            }

            public String toString() {
                return "CreateReusablePersona(createPersonaSheetComponent=" + this.createPersonaSheetComponent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.createPersonaSheetComponent, flags);
            }

            public CreateReusablePersona(CreatePersonaSheetComponent createPersonaSheetComponent) {
                Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "createPersonaSheetComponent");
                this.createPersonaSheetComponent = createPersonaSheetComponent;
            }

            public final CreatePersonaSheetComponent getCreatePersonaSheetComponent() {
                return this.createPersonaSheetComponent;
            }
        }

        /* compiled from: UiState.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction$VerifyReusablePersona;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "verifyPersonaButtonComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "getVerifyPersonaButtonComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "Ljava/util/Map;", "getComponentParams", "()Ljava/util/Map;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class VerifyReusablePersona implements PendingAction {
            public static final Parcelable.Creator<VerifyReusablePersona> CREATOR = new Creator();
            private final Map<String, ComponentParam> componentParams;
            private final VerifyPersonaButtonComponent verifyPersonaButtonComponent;

            /* compiled from: UiState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<VerifyReusablePersona> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyReusablePersona createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) parcel.readParcelable(VerifyReusablePersona.class.getClassLoader());
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(VerifyReusablePersona.class.getClassLoader()));
                    }
                    return new VerifyReusablePersona(verifyPersonaButtonComponent, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VerifyReusablePersona[] newArray(int i) {
                    return new VerifyReusablePersona[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerifyReusablePersona)) {
                    return false;
                }
                VerifyReusablePersona verifyReusablePersona = (VerifyReusablePersona) other;
                return Intrinsics.areEqual(this.verifyPersonaButtonComponent, verifyReusablePersona.verifyPersonaButtonComponent) && Intrinsics.areEqual(this.componentParams, verifyReusablePersona.componentParams);
            }

            public int hashCode() {
                return (this.verifyPersonaButtonComponent.hashCode() * 31) + this.componentParams.hashCode();
            }

            public String toString() {
                return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.verifyPersonaButtonComponent + ", componentParams=" + this.componentParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.verifyPersonaButtonComponent, flags);
                Map<String, ComponentParam> map = this.componentParams;
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public VerifyReusablePersona(VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map<String, ? extends ComponentParam> componentParams) {
                Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "verifyPersonaButtonComponent");
                Intrinsics.checkNotNullParameter(componentParams, "componentParams");
                this.verifyPersonaButtonComponent = verifyPersonaButtonComponent;
                this.componentParams = componentParams;
            }

            public final VerifyPersonaButtonComponent getVerifyPersonaButtonComponent() {
                return this.verifyPersonaButtonComponent;
            }

            public final Map<String, ComponentParam> getComponentParams() {
                return this.componentParams;
            }
        }
    }
}
