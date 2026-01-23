package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling4;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentPages.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BW\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "components", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "selectDocumentButton", "", "selectPhotoButton", "takePhotoButton", "cancelButton", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponents", "()Ljava/util/List;", "getComponentConfigs", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getSelectDocumentButton", "()Ljava/lang/String;", "getSelectPhotoButton", "getTakePhotoButton", "getCancelButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.document.UploadOptionsDialog, reason: use source file name */
/* loaded from: classes18.dex */
public final class DocumentPages3 implements NestedUiStep {
    private final String cancelButton;
    private final List<UiComponentConfig> componentConfigs;
    private final List<UiComponent> components;
    private final String selectDocumentButton;
    private final String selectPhotoButton;
    private final StepStyles.UiStepStyle styles;
    private final String takePhotoButton;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DocumentPages3> CREATOR = new Creator();

    /* compiled from: DocumentPages.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.document.UploadOptionsDialog$Creator */
    public static final class Creator implements Parcelable.Creator<DocumentPages3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentPages3 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(DocumentPages3.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(parcel.readParcelable(DocumentPages3.class.getClassLoader()));
            }
            return new DocumentPages3(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(DocumentPages3.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentPages3[] newArray(int i) {
            return new DocumentPages3[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UiComponent> list = this.components;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<UiComponentConfig> list2 = this.componentConfigs;
        dest.writeInt(list2.size());
        Iterator<UiComponentConfig> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.styles, flags);
        dest.writeString(this.selectDocumentButton);
        dest.writeString(this.selectPhotoButton);
        dest.writeString(this.takePhotoButton);
        dest.writeString(this.cancelButton);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentPages3(List<? extends UiComponent> list, List<? extends UiComponentConfig> componentConfigs, StepStyles.UiStepStyle uiStepStyle, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        this.components = list;
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
        this.selectDocumentButton = str;
        this.selectPhotoButton = str2;
        this.takePhotoButton = str3;
        this.cancelButton = str4;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep
    public List<UiComponent> getComponents() {
        return this.components;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep
    public List<UiComponentConfig> getComponentConfigs() {
        return this.componentConfigs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep
    public StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    public final String getSelectDocumentButton() {
        return this.selectDocumentButton;
    }

    public final String getSelectPhotoButton() {
        return this.selectPhotoButton;
    }

    public final String getTakePhotoButton() {
        return this.takePhotoButton;
    }

    public final String getCancelButton() {
        return this.cancelButton;
    }

    /* compiled from: DocumentPages.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog$Companion;", "", "<init>", "()V", "makeDefault", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "titleText", "", "takePhotoButtonText", "selectDocumentButtonText", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.document.UploadOptionsDialog$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DocumentPages3 makeDefault(String titleText, String takePhotoButtonText, String selectDocumentButtonText, StepStyles.DocumentStepStyle styles) {
            ButtonComponentStyling3 buttonSecondaryStyleValue;
            ButtonComponentStyling8 buttonPrimaryStyleValue;
            ButtonComponentStyling4 buttonComponentStyling4M3212to = null;
            Title title = new Title("title", new Title.Attributes(titleText == null ? "" : titleText, null, null, 6, null), styles != null ? styles.getTitleStyleValue() : null);
            CombinedStepButton combinedStepButton = new CombinedStepButton("take_photo", new BaseButtonAttributes2(takePhotoButtonText == null ? "" : takePhotoButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) ? null : Conversions2.m3213to(buttonPrimaryStyleValue));
            BaseButtonAttributes2 baseButtonAttributes2 = new BaseButtonAttributes2(selectDocumentButtonText == null ? "" : selectDocumentButtonText, Button.ButtonType.SECONDARY, null, null, null, null, 60, null);
            if (styles != null && (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) != null) {
                buttonComponentStyling4M3212to = Conversions2.m3212to(buttonSecondaryStyleValue);
            }
            List listListOf = CollectionsKt.listOf((Object[]) new UiComponentConfig[]{title, combinedStepButton, new CombinedStepButton("select_file", baseButtonAttributes2, buttonComponentStyling4M3212to)});
            return new DocumentPages3(UiComponent3.m3260to(listListOf), listListOf, null, "select_file", null, "take_photo", null);
        }
    }
}
