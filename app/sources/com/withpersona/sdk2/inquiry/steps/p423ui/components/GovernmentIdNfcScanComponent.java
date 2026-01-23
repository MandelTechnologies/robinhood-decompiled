package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.DateController;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.GovernmentIdNfcDataController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdNfcScanComponent.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B[\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b6\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b7\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b8\u0010*R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b9\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b=\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R&\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR(\u0010I\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010H\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010H\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010X\u001a\u00020P8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u0010R\u0012\u0004\b[\u0010H\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR(\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b]\u0010^\u0012\u0004\bc\u0010H\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR(\u0010d\u001a\u00020\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010^\u0012\u0004\bg\u0010H\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR(\u0010i\u001a\u00020h8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010H\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006p"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LoadingIndicatorComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "documentNumber", "dateOfBirth", "expirationDate", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "governmentIdNfcData", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;)V", "newValue", "updateCardAccessNumber", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "updateDocumentNumber", "newDate", "updateDateOfBirth", "updateExpirationDate", "updateNfcData", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "getDocumentNumber", "getDateOfBirth", "getExpirationDate", "getCardAccessNumber", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "getGovernmentIdNfcData", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "wasTapped", "Z", "getWasTapped", "()Z", "setWasTapped", "(Z)V", "getWasTapped$annotations", "Lcom/squareup/workflow1/ui/TextController;", "cardAccessNumberController", "Lcom/squareup/workflow1/ui/TextController;", "getCardAccessNumberController", "()Lcom/squareup/workflow1/ui/TextController;", "setCardAccessNumberController", "(Lcom/squareup/workflow1/ui/TextController;)V", "getCardAccessNumberController$annotations", "documentNumberController", "getDocumentNumberController", "setDocumentNumberController", "getDocumentNumberController$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "dateOfBirthController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "getDateOfBirthController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "setDateOfBirthController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;)V", "getDateOfBirthController$annotations", "expirationDateController", "getExpirationDateController", "setExpirationDateController", "getExpirationDateController$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcDataController;", "nfcDataController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcDataController;", "getNfcDataController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcDataController;", "setNfcDataController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcDataController;)V", "getNfcDataController$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class GovernmentIdNfcScanComponent implements UiComponent, UiComponentAttributes2, UiComponentAttributes3, LoadingIndicatorComponent {
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final String cardAccessNumber;
    private TextController cardAccessNumberController;
    private final GovernmentIdNfcScan config;
    private final String dateOfBirth;
    private DateController dateOfBirthController;
    private final JsonLogicBoolean disabled;
    private final String documentNumber;
    private TextController documentNumberController;
    private final String expirationDate;
    private DateController expirationDateController;
    private final GovernmentIdNfcData governmentIdNfcData;
    private final JsonLogicBoolean hidden;
    private final String name;
    private GovernmentIdNfcDataController nfcDataController;
    private boolean wasTapped;

    /* compiled from: GovernmentIdNfcScanComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScanComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcScanComponent(parcel.readString(), (GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdNfcData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScanComponent[] newArray(int i) {
            return new GovernmentIdNfcScanComponent[i];
        }
    }

    public static /* synthetic */ GovernmentIdNfcScanComponent copy$default(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = governmentIdNfcScanComponent.name;
        }
        if ((i & 2) != 0) {
            governmentIdNfcScan = governmentIdNfcScanComponent.config;
        }
        if ((i & 4) != 0) {
            str2 = governmentIdNfcScanComponent.documentNumber;
        }
        if ((i & 8) != 0) {
            str3 = governmentIdNfcScanComponent.dateOfBirth;
        }
        if ((i & 16) != 0) {
            str4 = governmentIdNfcScanComponent.expirationDate;
        }
        if ((i & 32) != 0) {
            str5 = governmentIdNfcScanComponent.cardAccessNumber;
        }
        if ((i & 64) != 0) {
            jsonLogicBoolean = governmentIdNfcScanComponent.hidden;
        }
        if ((i & 128) != 0) {
            jsonLogicBoolean2 = governmentIdNfcScanComponent.disabled;
        }
        if ((i & 256) != 0) {
            governmentIdNfcData = governmentIdNfcScanComponent.governmentIdNfcData;
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        GovernmentIdNfcData governmentIdNfcData2 = governmentIdNfcData;
        String str6 = str5;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
        String str7 = str4;
        String str8 = str2;
        return governmentIdNfcScanComponent.copy(str, governmentIdNfcScan, str8, str3, str7, str6, jsonLogicBoolean4, jsonLogicBoolean3, governmentIdNfcData2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getCardAccessNumberController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getDateOfBirthController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getDocumentNumberController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getExpirationDateController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getNfcDataController$annotations() {
    }

    public final GovernmentIdNfcScanComponent copy(String name, GovernmentIdNfcScan config, String documentNumber, String dateOfBirth, String expirationDate, String cardAccessNumber, JsonLogicBoolean hidden, JsonLogicBoolean disabled, GovernmentIdNfcData governmentIdNfcData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        return new GovernmentIdNfcScanComponent(name, config, documentNumber, dateOfBirth, expirationDate, cardAccessNumber, hidden, disabled, governmentIdNfcData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) other;
        return Intrinsics.areEqual(this.name, governmentIdNfcScanComponent.name) && Intrinsics.areEqual(this.config, governmentIdNfcScanComponent.config) && Intrinsics.areEqual(this.documentNumber, governmentIdNfcScanComponent.documentNumber) && Intrinsics.areEqual(this.dateOfBirth, governmentIdNfcScanComponent.dateOfBirth) && Intrinsics.areEqual(this.expirationDate, governmentIdNfcScanComponent.expirationDate) && Intrinsics.areEqual(this.cardAccessNumber, governmentIdNfcScanComponent.cardAccessNumber) && Intrinsics.areEqual(this.hidden, governmentIdNfcScanComponent.hidden) && Intrinsics.areEqual(this.disabled, governmentIdNfcScanComponent.disabled) && Intrinsics.areEqual(this.governmentIdNfcData, governmentIdNfcScanComponent.governmentIdNfcData);
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.config.hashCode()) * 31) + this.documentNumber.hashCode()) * 31;
        String str = this.dateOfBirth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cardAccessNumber.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        return iHashCode5 + (governmentIdNfcData != null ? governmentIdNfcData.hashCode() : 0);
    }

    public String toString() {
        return "GovernmentIdNfcScanComponent(name=" + this.name + ", config=" + this.config + ", documentNumber=" + this.documentNumber + ", dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ", cardAccessNumber=" + this.cardAccessNumber + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", governmentIdNfcData=" + this.governmentIdNfcData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeString(this.documentNumber);
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.expirationDate);
        dest.writeString(this.cardAccessNumber);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        if (governmentIdNfcData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            governmentIdNfcData.writeToParcel(dest, flags);
        }
    }

    public GovernmentIdNfcScanComponent(String name, GovernmentIdNfcScan config, String documentNumber, String str, String str2, String cardAccessNumber, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        this.name = name;
        this.config = config;
        this.documentNumber = documentNumber;
        this.dateOfBirth = str;
        this.expirationDate = str2;
        this.cardAccessNumber = cardAccessNumber;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.governmentIdNfcData = governmentIdNfcData;
        this.associatedViews = new ArrayList();
        this.cardAccessNumberController = TextController3.TextController(cardAccessNumber);
        this.documentNumberController = TextController3.TextController(documentNumber);
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        this.dateOfBirthController = new DateController(str, null, companion.generateTextMonths());
        this.expirationDateController = new DateController(str2, null, companion.generateTextMonths());
        this.nfcDataController = new GovernmentIdNfcDataController(governmentIdNfcData);
    }

    public /* synthetic */ GovernmentIdNfcScanComponent(String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, governmentIdNfcScan, str2, str3, str4, str5, jsonLogicBoolean, jsonLogicBoolean2, (i & 256) != 0 ? null : governmentIdNfcData);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final GovernmentIdNfcScan getConfig() {
        return this.config;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.LoadingIndicatorComponent
    public void setWasTapped(boolean z) {
        this.wasTapped = z;
    }

    public final TextController getCardAccessNumberController() {
        return this.cardAccessNumberController;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GovernmentIdNfcScanComponent(GovernmentIdNfcScan config) {
        String prefillCardAccessNumber;
        String prefillDocumentNumber;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        GovernmentIdNfcScan.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefillDocumentNumber = attributes.getPrefillDocumentNumber()) == null) ? "" : prefillDocumentNumber;
        GovernmentIdNfcScan.Attributes attributes2 = config.getAttributes();
        String prefillDateOfBirth = attributes2 != null ? attributes2.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Attributes attributes3 = config.getAttributes();
        String prefillExpirationDate = attributes3 != null ? attributes3.getPrefillExpirationDate() : null;
        GovernmentIdNfcScan.Attributes attributes4 = config.getAttributes();
        String str2 = (attributes4 == null || (prefillCardAccessNumber = attributes4.getPrefillCardAccessNumber()) == null) ? "" : prefillCardAccessNumber;
        GovernmentIdNfcScan.Attributes attributes5 = config.getAttributes();
        JsonLogicBoolean hidden = attributes5 != null ? attributes5.getHidden() : null;
        GovernmentIdNfcScan.Attributes attributes6 = config.getAttributes();
        this(name, config, str, prefillDateOfBirth, prefillExpirationDate, str2, hidden, attributes6 != null ? attributes6.getDisabled() : null, null, 256, null);
    }

    public final GovernmentIdNfcScanComponent updateCardAccessNumber(String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentCopy$default = copy$default(this, null, null, null, null, null, newValue, null, null, null, 479, null);
        governmentIdNfcScanComponentCopy$default.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentCopy$default.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentCopy$default.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentCopy$default.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentCopy$default.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentCopy$default;
    }

    public final TextController getDocumentNumberController() {
        return this.documentNumberController;
    }

    public final GovernmentIdNfcScanComponent updateDocumentNumber(String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentCopy$default = copy$default(this, null, null, newValue, null, null, null, null, null, null, 507, null);
        governmentIdNfcScanComponentCopy$default.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentCopy$default.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentCopy$default.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentCopy$default.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentCopy$default.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentCopy$default;
    }

    public final DateController getDateOfBirthController() {
        return this.dateOfBirthController;
    }

    public final GovernmentIdNfcScanComponent updateDateOfBirth(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentCopy$default = copy$default(this, null, null, null, newDate, null, null, null, null, null, 503, null);
        governmentIdNfcScanComponentCopy$default.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentCopy$default.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentCopy$default.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentCopy$default.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentCopy$default.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentCopy$default;
    }

    public final DateController getExpirationDateController() {
        return this.expirationDateController;
    }

    public final GovernmentIdNfcScanComponent updateExpirationDate(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentCopy$default = copy$default(this, null, null, null, null, newDate, null, null, null, null, 495, null);
        governmentIdNfcScanComponentCopy$default.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentCopy$default.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentCopy$default.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentCopy$default.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentCopy$default.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentCopy$default;
    }

    public final GovernmentIdNfcDataController getNfcDataController() {
        return this.nfcDataController;
    }

    public final GovernmentIdNfcScanComponent updateNfcData(GovernmentIdNfcData newValue) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentCopy$default = copy$default(this, null, null, null, null, null, null, null, null, newValue, 255, null);
        governmentIdNfcScanComponentCopy$default.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentCopy$default.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentCopy$default.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentCopy$default.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentCopy$default.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentCopy$default;
    }
}
