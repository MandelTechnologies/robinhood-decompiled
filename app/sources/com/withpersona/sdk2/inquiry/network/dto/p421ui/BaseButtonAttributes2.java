package com.withpersona.sdk2.inquiry.network.dto.p421ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseButtonAttributes.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\bJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "text", "", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getText", "()Ljava/lang/String;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes, reason: use source file name */
/* loaded from: classes18.dex */
public final class BaseButtonAttributes2 implements BaseButtonAttributes {
    public static final Parcelable.Creator<BaseButtonAttributes2> CREATOR = new Creator();
    private final String autoSubmitCountdownText;
    private final Integer autoSubmitIntervalSeconds;
    private final Button.ButtonType buttonType;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String text;

    /* compiled from: BaseButtonAttributes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes$Creator */
    public static final class Creator implements Parcelable.Creator<BaseButtonAttributes2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseButtonAttributes2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BaseButtonAttributes2(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseButtonAttributes2[] newArray(int i) {
            return new BaseButtonAttributes2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        Button.ButtonType buttonType = this.buttonType;
        if (buttonType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(buttonType.name());
        }
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        if (jsonLogicBoolean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jsonLogicBoolean.writeToParcel(dest, flags);
        }
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        if (jsonLogicBoolean2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jsonLogicBoolean2.writeToParcel(dest, flags);
        }
    }

    public BaseButtonAttributes2(String text, Button.ButtonType buttonType, String str, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.buttonType = buttonType;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
    }

    public /* synthetic */ BaseButtonAttributes2(String str, Button.ButtonType buttonType, String str2, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : jsonLogicBoolean, (i & 32) != 0 ? null : jsonLogicBoolean2);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public String getText() {
        return this.text;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public Button.ButtonType getButtonType() {
        return this.buttonType;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }
}
