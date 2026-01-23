package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRCodeComponent.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015R&\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006-"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "", "width", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "I", "getWidth", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class QRCodeComponent implements UiComponent, UiComponentAttributes3 {
    public static final Parcelable.Creator<QRCodeComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final JsonLogicBoolean hidden;
    private final String name;
    private final int width;

    /* compiled from: QRCodeComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QRCodeComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QRCodeComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(QRCodeComponent.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeComponent[] newArray(int i) {
            return new QRCodeComponent[i];
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
        if (!(other instanceof QRCodeComponent)) {
            return false;
        }
        QRCodeComponent qRCodeComponent = (QRCodeComponent) other;
        return Intrinsics.areEqual(this.name, qRCodeComponent.name) && Intrinsics.areEqual(this.hidden, qRCodeComponent.hidden) && this.width == qRCodeComponent.width;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return ((iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "QRCodeComponent(name=" + this.name + ", hidden=" + this.hidden + ", width=" + this.width + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeInt(this.width);
    }

    public QRCodeComponent(String name, JsonLogicBoolean jsonLogicBoolean, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.width = i;
        this.associatedViews = new ArrayList();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QRCodeComponent(QRCode config) {
        Double dp;
        AttributeStyles.QRCodeWidthStyle width;
        StyleElements.Measurement base;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        QRCode.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        QRCode.QRCodeComponentStyle styles = config.getStyles();
        StyleElements.Size base2 = (styles == null || (width = styles.getWidth()) == null || (base = width.getBase()) == null) ? null : base.getBase();
        StyleElements.DPSize dPSize = base2 instanceof StyleElements.DPSize ? (StyleElements.DPSize) base2 : null;
        this(name, hidden, (int) ((dPSize == null || (dp = dPSize.getDp()) == null) ? ExtensionsKt.getDpToPx(128.0d) : ExtensionsKt.getDpToPx(dp.doubleValue())));
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }
}
