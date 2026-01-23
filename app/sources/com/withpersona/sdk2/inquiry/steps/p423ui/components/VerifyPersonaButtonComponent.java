package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyPersonaButtonComponent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b#\u0010\u001aR&\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R(\u0010-\u001a\u00020,8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010+\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "url", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getAutoSubmitCountdownText", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "getUrl", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "", "wasTapped", "Z", "getWasTapped", "()Z", "setWasTapped", "(Z)V", "getWasTapped$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class VerifyPersonaButtonComponent implements UiComponent2 {
    public static final Parcelable.Creator<VerifyPersonaButtonComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final String autoSubmitCountdownText;
    private final Integer autoSubmitIntervalSeconds;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String name;
    private final String url;
    private boolean wasTapped;

    /* compiled from: VerifyPersonaButtonComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyPersonaButtonComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyPersonaButtonComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyPersonaButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(VerifyPersonaButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(VerifyPersonaButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyPersonaButtonComponent[] newArray(int i) {
            return new VerifyPersonaButtonComponent[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.url);
    }

    public VerifyPersonaButtonComponent(String name, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.url = str2;
        this.associatedViews = new ArrayList();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2, com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerifyPersonaButtonComponent(VerifyPersonaButton config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        VerifyPersonaButton.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        VerifyPersonaButton.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean disabled = attributes2 != null ? attributes2.getDisabled() : null;
        VerifyPersonaButton.Attributes attributes3 = config.getAttributes();
        String autoSubmitCountdownText = attributes3 != null ? attributes3.getAutoSubmitCountdownText() : null;
        VerifyPersonaButton.Attributes attributes4 = config.getAttributes();
        Integer autoSubmitIntervalSeconds = attributes4 != null ? attributes4.getAutoSubmitIntervalSeconds() : null;
        VerifyPersonaButton.Attributes attributes5 = config.getAttributes();
        this(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, attributes5 != null ? attributes5.getUrl() : null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2, com.withpersona.sdk2.inquiry.steps.p423ui.components.LoadingIndicatorComponent
    public void setWasTapped(boolean z) {
        this.wasTapped = z;
    }
}
