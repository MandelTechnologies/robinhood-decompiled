package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.internal.InquiryState3;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.DesignVersion;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\n,-./012345B[\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R(\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0001\n6789:;<=>?¨\u0006@"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "updateTransitionStatus", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "getInquiryId", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getFromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "", "didGoBack", "Z", "getDidGoBack", "()Z", "setDidGoBack", "(Z)V", "getDidGoBack$annotations", "()V", "CreateInquiryFromTemplate", "ResumeFallbackInquiry", "ExchangeOneTimeCode", "CreateInquirySession", "ShowLoadingSpinner", "UiStepRunning", "GovernmentIdStepRunning", "SelfieStepRunning", "DocumentStepRunning", "Complete", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class InquiryState implements Parcelable {
    private final NextStep.CancelDialog cancelDialog;
    private boolean didGoBack;
    private final String fromStep;
    private final String inquiryId;
    private final InquirySessionConfig inquirySessionConfig;
    private final String sessionToken;
    private final StepStyles2 styles;
    private final InquiryState3 transitionStatus;

    public /* synthetic */ InquiryState(String str, String str2, InquiryState3 inquiryState3, StepStyles2 stepStyles2, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, inquiryState3, stepStyles2, cancelDialog, str3, inquirySessionConfig);
    }

    private InquiryState(String str, String str2, InquiryState3 inquiryState3, StepStyles2 stepStyles2, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig) {
        this.sessionToken = str;
        this.inquiryId = str2;
        this.transitionStatus = inquiryState3;
        this.styles = stepStyles2;
        this.cancelDialog = cancelDialog;
        this.fromStep = str3;
        this.inquirySessionConfig = inquirySessionConfig;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    public String getInquiryId() {
        return this.inquiryId;
    }

    public InquiryState3 getTransitionStatus() {
        return this.transitionStatus;
    }

    public StepStyles2 getStyles() {
        return this.styles;
    }

    public NextStep.CancelDialog getCancelDialog() {
        return this.cancelDialog;
    }

    public String getFromStep() {
        return this.fromStep;
    }

    public /* synthetic */ InquiryState(String str, String str2, InquiryState3 inquiryState3, StepStyles2 stepStyles2, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : inquiryState3, (i & 8) != 0 ? null : stepStyles2, (i & 16) != 0 ? null : cancelDialog, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? InquirySessionConfig.INSTANCE.getDefault() : inquirySessionConfig, null);
    }

    public InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    public final void setDidGoBack(boolean z) {
        this.didGoBack = z;
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u001aR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b*\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "templateId", "templateVersion", "accountId", "environmentId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateId", "getTemplateVersion", "getAccountId", "getEnvironmentId", "getReferenceId", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "getThemeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CreateInquiryFromTemplate extends InquiryState {
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new Creator();
        private final String accountId;
        private final String environmentId;
        private final Map<String, InquiryField> fields;
        private final String referenceId;
        private final StaticInquiryTemplate staticInquiryTemplate;
        private final String templateId;
        private final String templateVersion;
        private final String themeSetId;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateInquiryFromTemplate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateInquiryFromTemplate createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
                    }
                }
                return new CreateInquiryFromTemplate(string2, string3, string4, string5, string6, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateInquiryFromTemplate[] newArray(int i) {
                return new CreateInquiryFromTemplate[i];
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
            if (!(other instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) other;
            return Intrinsics.areEqual(this.templateId, createInquiryFromTemplate.templateId) && Intrinsics.areEqual(this.templateVersion, createInquiryFromTemplate.templateVersion) && Intrinsics.areEqual(this.accountId, createInquiryFromTemplate.accountId) && Intrinsics.areEqual(this.environmentId, createInquiryFromTemplate.environmentId) && Intrinsics.areEqual(this.referenceId, createInquiryFromTemplate.referenceId) && Intrinsics.areEqual(this.fields, createInquiryFromTemplate.fields) && Intrinsics.areEqual(this.themeSetId, createInquiryFromTemplate.themeSetId) && Intrinsics.areEqual(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate);
        }

        public int hashCode() {
            String str = this.templateId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            return iHashCode7 + (staticInquiryTemplate != null ? staticInquiryTemplate.hashCode() : 0);
        }

        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", environmentId=" + this.environmentId + ", referenceId=" + this.referenceId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.templateId);
            dest.writeString(this.templateVersion);
            dest.writeString(this.accountId);
            dest.writeString(this.environmentId);
            dest.writeString(this.referenceId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeString(this.themeSetId);
            dest.writeParcelable(this.staticInquiryTemplate, flags);
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "fallbackInquiryId", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFallbackInquiryId", "getFallbackSessionToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ResumeFallbackInquiry extends InquiryState {
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new Creator();
        private final String fallbackInquiryId;
        private final String fallbackSessionToken;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ResumeFallbackInquiry> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResumeFallbackInquiry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResumeFallbackInquiry(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResumeFallbackInquiry[] newArray(int i) {
                return new ResumeFallbackInquiry[i];
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
            if (!(other instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) other;
            return Intrinsics.areEqual(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && Intrinsics.areEqual(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken);
        }

        public int hashCode() {
            return (this.fallbackInquiryId.hashCode() * 31) + this.fallbackSessionToken.hashCode();
        }

        public String toString() {
            return "ResumeFallbackInquiry(fallbackInquiryId=" + this.fallbackInquiryId + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fallbackInquiryId);
            dest.writeString(this.fallbackSessionToken);
        }

        public final String getFallbackInquiryId() {
            return this.fallbackInquiryId;
        }

        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeFallbackInquiry(String fallbackInquiryId, String fallbackSessionToken) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(fallbackInquiryId, "fallbackInquiryId");
            Intrinsics.checkNotNullParameter(fallbackSessionToken, "fallbackSessionToken");
            this.fallbackInquiryId = fallbackInquiryId;
            this.fallbackSessionToken = fallbackSessionToken;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "oneTimeLinkCode", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOneTimeLinkCode", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ExchangeOneTimeCode extends InquiryState {
        public static final Parcelable.Creator<ExchangeOneTimeCode> CREATOR = new Creator();
        private final String oneTimeLinkCode;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ExchangeOneTimeCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExchangeOneTimeCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeOneTimeCode(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExchangeOneTimeCode[] newArray(int i) {
                return new ExchangeOneTimeCode[i];
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
            return (other instanceof ExchangeOneTimeCode) && Intrinsics.areEqual(this.oneTimeLinkCode, ((ExchangeOneTimeCode) other).oneTimeLinkCode);
        }

        public int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        public String toString() {
            return "ExchangeOneTimeCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.oneTimeLinkCode);
        }

        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExchangeOneTimeCode(String oneTimeLinkCode) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            this.oneTimeLinkCode = oneTimeLinkCode;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CreateInquirySession extends InquiryState {
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new Creator();
        private final String inquiryId;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateInquirySession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateInquirySession(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateInquirySession[] newArray(int i) {
                return new CreateInquirySession[i];
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
            return (other instanceof CreateInquirySession) && Intrinsics.areEqual(this.inquiryId, ((CreateInquirySession) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateInquirySession(String inquiryId) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getInquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "getUseBasicSpinner", "()Z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ShowLoadingSpinner extends InquiryState {
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new Creator();
        private final String inquiryId;
        private final InquirySessionConfig inquirySessionConfig;
        private final String sessionToken;
        private final StepStyles2 styles;
        private final InquiryState3 transitionStatus;
        private final boolean useBasicSpinner;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowLoadingSpinner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowLoadingSpinner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLoadingSpinner(parcel.readString(), (InquiryState3) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyles2) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowLoadingSpinner[] newArray(int i) {
                return new ShowLoadingSpinner[i];
            }
        }

        public static /* synthetic */ ShowLoadingSpinner copy$default(ShowLoadingSpinner showLoadingSpinner, String str, InquiryState3 inquiryState3, String str2, StepStyles2 stepStyles2, boolean z, InquirySessionConfig inquirySessionConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showLoadingSpinner.sessionToken;
            }
            if ((i & 2) != 0) {
                inquiryState3 = showLoadingSpinner.transitionStatus;
            }
            if ((i & 4) != 0) {
                str2 = showLoadingSpinner.inquiryId;
            }
            if ((i & 8) != 0) {
                stepStyles2 = showLoadingSpinner.styles;
            }
            if ((i & 16) != 0) {
                z = showLoadingSpinner.useBasicSpinner;
            }
            if ((i & 32) != 0) {
                inquirySessionConfig = showLoadingSpinner.inquirySessionConfig;
            }
            boolean z2 = z;
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            return showLoadingSpinner.copy(str, inquiryState3, str2, stepStyles2, z2, inquirySessionConfig2);
        }

        public final ShowLoadingSpinner copy(String sessionToken, InquiryState3 transitionStatus, String inquiryId, StepStyles2 styles, boolean useBasicSpinner, InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new ShowLoadingSpinner(sessionToken, transitionStatus, inquiryId, styles, useBasicSpinner, inquirySessionConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) other;
            return Intrinsics.areEqual(this.sessionToken, showLoadingSpinner.sessionToken) && Intrinsics.areEqual(this.transitionStatus, showLoadingSpinner.transitionStatus) && Intrinsics.areEqual(this.inquiryId, showLoadingSpinner.inquiryId) && Intrinsics.areEqual(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && Intrinsics.areEqual(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        public int hashCode() {
            int iHashCode = this.sessionToken.hashCode() * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            int iHashCode2 = (((iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31) + this.inquiryId.hashCode()) * 31;
            StepStyles2 stepStyles2 = this.styles;
            return ((((iHashCode2 + (stepStyles2 != null ? stepStyles2.hashCode() : 0)) * 31) + Boolean.hashCode(this.useBasicSpinner)) * 31) + this.inquirySessionConfig.hashCode();
        }

        public String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.styles, flags);
            dest.writeInt(this.useBasicSpinner ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ShowLoadingSpinner(String str, InquiryState3 inquiryState3, String str2, StepStyles2 stepStyles2, boolean z, InquirySessionConfig inquirySessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new InquiryState3.CheckingForNextState(null, 1, 0 == true ? 1 : 0) : inquiryState3, str2, stepStyles2, z, (i & 32) != 0 ? InquirySessionConfig.INSTANCE.getDefault() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.InquiryState2
        public StepStyles2 getStyles() {
            return this.styles;
        }

        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLoadingSpinner(String sessionToken, InquiryState3 inquiryState3, String inquiryId, StepStyles2 stepStyles2, boolean z, InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.inquiryId = inquiryId;
            this.styles = stepStyles2;
            this.useBasicSpinner = z;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÃ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,Jê\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b1\u0010,J\u001a\u00104\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00100R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bE\u00100R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bF\u00100R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bM\u0010LR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bN\u0010LR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\bR\u00100R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bS\u0010IR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010W\u001a\u0004\bX\u0010YR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b!\u0010J\u001a\u0004\b!\u0010LR\u0014\u0010[\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u00100¨\u0006\\"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/StepState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "inquiryStatus", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "isRestoringState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getInquiryStatus", "getStepName", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getFinalStep", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "getClientSideKey", "getServerComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getFromStep", "fromStep", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class UiStepRunning extends InquiryState implements InquiryState2 {
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new Creator();
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final NextStep.CancelDialog cancelDialog;
        private final String clientSideKey;
        private final List<UiComponentConfig> components;
        private final Map<String, InquiryField> fields;
        private final boolean finalStep;
        private final String inquiryId;
        private final InquirySessionConfig inquirySessionConfig;
        private final String inquiryStatus;
        private final boolean isRestoringState;
        private final NextStep.C43686Ui.Localizations localizations;
        private final List<UiComponentError> serverComponentErrors;
        private final String sessionToken;
        private final String stepName;
        private final StepStyles.UiStepStyle styles;
        private final InternalErrorInfo transitionError;
        private final InquiryState3 transitionStatus;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepRunning> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z;
                ArrayList arrayList2;
                ArrayList arrayList3;
                boolean z2;
                boolean z3;
                String str;
                ArrayList arrayList4;
                String str2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                InquiryState3 inquiryState3 = (InquiryState3) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.C43686Ui.Localizations localizations = (NextStep.C43686Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                }
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    arrayList2 = null;
                    arrayList3 = arrayList;
                    z2 = true;
                } else {
                    arrayList2 = null;
                    arrayList3 = arrayList;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z5 = z;
                }
                int i3 = parcel.readInt();
                ArrayList arrayList5 = arrayList2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i4++;
                    i3 = i3;
                }
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str = string6;
                    arrayList4 = arrayList5;
                    str2 = string2;
                } else {
                    int i5 = parcel.readInt();
                    str = string6;
                    arrayList4 = new ArrayList(i5);
                    str2 = string2;
                    int i6 = 0;
                    while (i6 != i5) {
                        arrayList4.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                        i6++;
                        i5 = i5;
                    }
                }
                InternalErrorInfo internalErrorInfo = (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new UiStepRunning(str2, string3, inquiryState3, uiStepStyle, cancelDialog, localizations, string4, string5, arrayList3, z4, z2, z5, linkedHashMap, str, arrayList4, internalErrorInfo, inquirySessionConfig, z3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepRunning[] newArray(int i) {
                return new UiStepRunning[i];
            }
        }

        public static /* synthetic */ UiStepRunning copy$default(UiStepRunning uiStepRunning, String str, String str2, InquiryState3 inquiryState3, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C43686Ui.Localizations localizations, String str3, String str4, List list, boolean z, boolean z2, boolean z3, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z4, int i, Object obj) {
            boolean z5;
            InquirySessionConfig inquirySessionConfig2;
            String str6 = (i & 1) != 0 ? uiStepRunning.inquiryId : str;
            String str7 = (i & 2) != 0 ? uiStepRunning.sessionToken : str2;
            InquiryState3 inquiryState32 = (i & 4) != 0 ? uiStepRunning.transitionStatus : inquiryState3;
            StepStyles.UiStepStyle uiStepStyle2 = (i & 8) != 0 ? uiStepRunning.styles : uiStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i & 16) != 0 ? uiStepRunning.cancelDialog : cancelDialog;
            NextStep.C43686Ui.Localizations localizations2 = (i & 32) != 0 ? uiStepRunning.localizations : localizations;
            String str8 = (i & 64) != 0 ? uiStepRunning.inquiryStatus : str3;
            String str9 = (i & 128) != 0 ? uiStepRunning.stepName : str4;
            List list3 = (i & 256) != 0 ? uiStepRunning.components : list;
            boolean z6 = (i & 512) != 0 ? uiStepRunning.backStepEnabled : z;
            boolean z7 = (i & 1024) != 0 ? uiStepRunning.cancelButtonEnabled : z2;
            boolean z8 = (i & 2048) != 0 ? uiStepRunning.finalStep : z3;
            Map map2 = (i & 4096) != 0 ? uiStepRunning.fields : map;
            String str10 = (i & 8192) != 0 ? uiStepRunning.clientSideKey : str5;
            String str11 = str6;
            List list4 = (i & 16384) != 0 ? uiStepRunning.serverComponentErrors : list2;
            InternalErrorInfo internalErrorInfo2 = (i & 32768) != 0 ? uiStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig3 = (i & 65536) != 0 ? uiStepRunning.inquirySessionConfig : inquirySessionConfig;
            if ((i & 131072) != 0) {
                inquirySessionConfig2 = inquirySessionConfig3;
                z5 = uiStepRunning.isRestoringState;
            } else {
                z5 = z4;
                inquirySessionConfig2 = inquirySessionConfig3;
            }
            return uiStepRunning.copy(str11, str7, inquiryState32, uiStepStyle2, cancelDialog2, localizations2, str8, str9, list3, z6, z7, z8, map2, str10, list4, internalErrorInfo2, inquirySessionConfig2, z5);
        }

        public final UiStepRunning copy(String inquiryId, String sessionToken, InquiryState3 transitionStatus, StepStyles.UiStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.C43686Ui.Localizations localizations, String inquiryStatus, String stepName, List<? extends UiComponentConfig> components, boolean backStepEnabled, boolean cancelButtonEnabled, boolean finalStep, Map<String, ? extends InquiryField> fields, String clientSideKey, List<? extends UiComponentError> serverComponentErrors, InternalErrorInfo transitionError, InquirySessionConfig inquirySessionConfig, boolean isRestoringState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new UiStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, localizations, inquiryStatus, stepName, components, backStepEnabled, cancelButtonEnabled, finalStep, fields, clientSideKey, serverComponentErrors, transitionError, inquirySessionConfig, isRestoringState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) other;
            return Intrinsics.areEqual(this.inquiryId, uiStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, uiStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, uiStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, uiStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, uiStepRunning.cancelDialog) && Intrinsics.areEqual(this.localizations, uiStepRunning.localizations) && Intrinsics.areEqual(this.inquiryStatus, uiStepRunning.inquiryStatus) && Intrinsics.areEqual(this.stepName, uiStepRunning.stepName) && Intrinsics.areEqual(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && Intrinsics.areEqual(this.fields, uiStepRunning.fields) && Intrinsics.areEqual(this.clientSideKey, uiStepRunning.clientSideKey) && Intrinsics.areEqual(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && Intrinsics.areEqual(this.transitionError, uiStepRunning.transitionError) && Intrinsics.areEqual(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig) && this.isRestoringState == uiStepRunning.isRestoringState;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            int iHashCode2 = (iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.C43686Ui.Localizations localizations = this.localizations;
            int iHashCode5 = (((((iHashCode4 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int iHashCode6 = (((((((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.fields.hashCode()) * 31) + this.clientSideKey.hashCode()) * 31;
            List<UiComponentError> list2 = this.serverComponentErrors;
            int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return ((((iHashCode7 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31) + this.inquirySessionConfig.hashCode()) * 31) + Boolean.hashCode(this.isRestoringState);
        }

        public String toString() {
            return "UiStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", components=" + this.components + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", fields=" + this.fields + ", clientSideKey=" + this.clientSideKey + ", serverComponentErrors=" + this.serverComponentErrors + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", isRestoringState=" + this.isRestoringState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.components;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.clientSideKey);
            List<UiComponentError> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentError> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.InquiryState2
        public StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        public final NextStep.C43686Ui.Localizations getLocalizations() {
            return this.localizations;
        }

        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final boolean getFinalStep() {
            return this.finalStep;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final String getClientSideKey() {
            return this.clientSideKey;
        }

        public final List<UiComponentError> getServerComponentErrors() {
            return this.serverComponentErrors;
        }

        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        public /* synthetic */ UiStepRunning(String str, String str2, InquiryState3 inquiryState3, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C43686Ui.Localizations localizations, String str3, String str4, List list, boolean z, boolean z2, boolean z3, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : inquiryState3, uiStepStyle, cancelDialog, localizations, str3, str4, list, z, z2, z3, map, str5, list2, (i & 32768) != 0 ? null : internalErrorInfo, (i & 65536) != 0 ? InquirySessionConfig.INSTANCE.getDefault() : inquirySessionConfig, z4);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        /* renamed from: isRestoringState, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UiStepRunning(String inquiryId, String sessionToken, InquiryState3 inquiryState3, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C43686Ui.Localizations localizations, String inquiryStatus, String stepName, List<? extends UiComponentConfig> list, boolean z, boolean z2, boolean z3, Map<String, ? extends InquiryField> fields, String clientSideKey, List<? extends UiComponentError> list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z4) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.components = list;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.fields = fields;
            this.clientSideKey = clientSideKey;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.isRestoringState = z4;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getFromStep() {
            return this.stepName;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0012\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u001b¢\u0006\u0004\b:\u0010;JÖ\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00122\n\b\u0002\u00101\u001a\u0004\u0018\u000100HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b@\u0010;J\u001a\u0010C\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010?R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010?R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bQ\u0010?R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bU\u0010?R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bV\u0010?R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bZ\u0010YR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010]R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010R\u001a\u0004\b^\u0010TR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010R\u001a\u0004\b_\u0010TR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010`\u001a\u0004\ba\u0010;R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010E\u001a\u0004\be\u0010?R\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010E\u001a\u0004\bf\u0010?R\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b!\u0010W\u001a\u0004\bg\u0010YR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0006¢\u0006\f\n\u0004\b#\u0010R\u001a\u0004\bh\u0010TR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0006¢\u0006\f\n\u0004\b%\u0010R\u001a\u0004\bi\u0010TR\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b&\u0010E\u001a\u0004\bj\u0010?R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010q\u001a\u0004\br\u0010sR\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010/\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b/\u0010W\u001a\u0004\bw\u0010YR\u0019\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u0010x\u001a\u0004\by\u0010z¨\u0006{"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/StepState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "enabledIdClasses", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "", "imageCaptureCount", "", "manualCaptureButtonDelayMs", "fieldKeyDocument", "fieldKeyIdClass", "shouldSkipReviewScreen", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoCaptureMethods", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCountryCode", "Ljava/util/List;", "getEnabledIdClasses", "()Ljava/util/List;", "getFromComponent", "getFromStep", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "getLocalizationOverrides", "getEnabledCaptureOptionsNativeMobile", "I", "getImageCaptureCount", "J", "getManualCaptureButtonDelayMs", "()J", "getFieldKeyDocument", "getFieldKeyIdClass", "getShouldSkipReviewScreen", "getEnabledCaptureFileTypes", "getVideoCaptureMethods", "getWebRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "getAutoClassificationConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getDigitalIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class GovernmentIdStepRunning extends InquiryState implements InquiryState2 {
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new Creator();
        private final NextStep.GovernmentId.AssetConfig assetConfig;
        private final boolean audioEnabled;
        private final AutoClassificationConfig autoClassificationConfig;
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final NextStep.CancelDialog cancelDialog;
        private final String countryCode;
        private final DigitalIdConfig digitalIdConfig;
        private final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;
        private final List<Id> enabledIdClasses;
        private final String fieldKeyDocument;
        private final String fieldKeyIdClass;
        private final String fromComponent;
        private final String fromStep;
        private final int imageCaptureCount;
        private final String inquiryId;
        private final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;
        private final NextStep.GovernmentId.Localizations localizations;
        private final long manualCaptureButtonDelayMs;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final StyleElements.Axis reviewCaptureButtonsAxis;
        private final String sessionToken;
        private final boolean shouldSkipReviewScreen;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final InquiryState3 transitionStatus;
        private final List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods;
        private final String webRtcJwt;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepRunning> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Class cls;
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                InquiryState3 inquiryState3 = (InquiryState3) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String string4 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    cls = GovernmentIdStepRunning.class;
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList = new ArrayList(i4);
                    cls = GovernmentIdStepRunning.class;
                    for (int i5 = 0; i5 != i4; i5++) {
                        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                    }
                }
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int i7 = 0;
                while (i7 != i6) {
                    arrayList3.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                    i7++;
                    i6 = i6;
                }
                int i8 = parcel.readInt();
                Class cls2 = cls;
                long j = parcel.readLong();
                String string7 = parcel.readString();
                boolean z3 = false;
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    i = 0;
                    z3 = true;
                } else {
                    i = 0;
                }
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                int i10 = i;
                while (i10 != i9) {
                    arrayList4.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i10++;
                    i9 = i9;
                }
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                int i12 = i;
                while (i12 != i11) {
                    arrayList5.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(parcel.readString()));
                    i12++;
                    i11 = i11;
                }
                return new GovernmentIdStepRunning(string2, string3, inquiryState3, governmentIdStepStyle, cancelDialog, string4, arrayList2, string5, string6, z2, z, localizations, arrayList, arrayList3, i8, j, string7, string8, z3, arrayList4, arrayList5, parcel.readString(), (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls2.getClassLoader()), (AutoClassificationConfig) parcel.readParcelable(cls2.getClassLoader()), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0 ? 1 : i, (DigitalIdConfig) parcel.readParcelable(cls2.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRunning[] newArray(int i) {
                return new GovernmentIdStepRunning[i];
            }
        }

        public static /* synthetic */ GovernmentIdStepRunning copy$default(GovernmentIdStepRunning governmentIdStepRunning, String str, String str2, InquiryState3 inquiryState3, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i, long j, String str6, String str7, boolean z3, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig, int i2, Object obj) {
            DigitalIdConfig digitalIdConfig2;
            boolean z5;
            String str9 = (i2 & 1) != 0 ? governmentIdStepRunning.inquiryId : str;
            String str10 = (i2 & 2) != 0 ? governmentIdStepRunning.sessionToken : str2;
            InquiryState3 inquiryState32 = (i2 & 4) != 0 ? governmentIdStepRunning.transitionStatus : inquiryState3;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = (i2 & 8) != 0 ? governmentIdStepRunning.styles : governmentIdStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i2 & 16) != 0 ? governmentIdStepRunning.cancelDialog : cancelDialog;
            String str11 = (i2 & 32) != 0 ? governmentIdStepRunning.countryCode : str3;
            List list6 = (i2 & 64) != 0 ? governmentIdStepRunning.enabledIdClasses : list;
            String str12 = (i2 & 128) != 0 ? governmentIdStepRunning.fromComponent : str4;
            String str13 = (i2 & 256) != 0 ? governmentIdStepRunning.fromStep : str5;
            boolean z6 = (i2 & 512) != 0 ? governmentIdStepRunning.backStepEnabled : z;
            boolean z7 = (i2 & 1024) != 0 ? governmentIdStepRunning.cancelButtonEnabled : z2;
            NextStep.GovernmentId.Localizations localizations2 = (i2 & 2048) != 0 ? governmentIdStepRunning.localizations : localizations;
            List list7 = (i2 & 4096) != 0 ? governmentIdStepRunning.localizationOverrides : list2;
            List list8 = (i2 & 8192) != 0 ? governmentIdStepRunning.enabledCaptureOptionsNativeMobile : list3;
            String str14 = str9;
            int i3 = (i2 & 16384) != 0 ? governmentIdStepRunning.imageCaptureCount : i;
            long j2 = (i2 & 32768) != 0 ? governmentIdStepRunning.manualCaptureButtonDelayMs : j;
            String str15 = (i2 & 65536) != 0 ? governmentIdStepRunning.fieldKeyDocument : str6;
            String str16 = (i2 & 131072) != 0 ? governmentIdStepRunning.fieldKeyIdClass : str7;
            String str17 = str15;
            boolean z8 = (i2 & 262144) != 0 ? governmentIdStepRunning.shouldSkipReviewScreen : z3;
            List list9 = (i2 & 524288) != 0 ? governmentIdStepRunning.enabledCaptureFileTypes : list4;
            List list10 = (i2 & 1048576) != 0 ? governmentIdStepRunning.videoCaptureMethods : list5;
            String str18 = (i2 & 2097152) != 0 ? governmentIdStepRunning.webRtcJwt : str8;
            NextStep.GovernmentId.AssetConfig assetConfig2 = (i2 & 4194304) != 0 ? governmentIdStepRunning.assetConfig : assetConfig;
            AutoClassificationConfig autoClassificationConfig2 = (i2 & 8388608) != 0 ? governmentIdStepRunning.autoClassificationConfig : autoClassificationConfig;
            StyleElements.Axis axis2 = (i2 & 16777216) != 0 ? governmentIdStepRunning.reviewCaptureButtonsAxis : axis;
            PendingPageTextPosition pendingPageTextPosition2 = (i2 & 33554432) != 0 ? governmentIdStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z9 = (i2 & 67108864) != 0 ? governmentIdStepRunning.audioEnabled : z4;
            if ((i2 & 134217728) != 0) {
                z5 = z9;
                digitalIdConfig2 = governmentIdStepRunning.digitalIdConfig;
            } else {
                digitalIdConfig2 = digitalIdConfig;
                z5 = z9;
            }
            return governmentIdStepRunning.copy(str14, str10, inquiryState32, governmentIdStepStyle2, cancelDialog2, str11, list6, str12, str13, z6, z7, localizations2, list7, list8, i3, j2, str17, str16, z8, list9, list10, str18, assetConfig2, autoClassificationConfig2, axis2, pendingPageTextPosition2, z5, digitalIdConfig2);
        }

        public final GovernmentIdStepRunning copy(String inquiryId, String sessionToken, InquiryState3 transitionStatus, StepStyles.GovernmentIdStepStyle styles, NextStep.CancelDialog cancelDialog, String countryCode, List<Id> enabledIdClasses, String fromComponent, String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int imageCaptureCount, long manualCaptureButtonDelayMs, String fieldKeyDocument, String fieldKeyIdClass, boolean shouldSkipReviewScreen, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, String webRtcJwt, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, DigitalIdConfig digitalIdConfig) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            return new GovernmentIdStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, localizations, localizationOverrides, enabledCaptureOptionsNativeMobile, imageCaptureCount, manualCaptureButtonDelayMs, fieldKeyDocument, fieldKeyIdClass, shouldSkipReviewScreen, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, audioEnabled, digitalIdConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) other;
            return Intrinsics.areEqual(this.inquiryId, governmentIdStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, governmentIdStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, governmentIdStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, governmentIdStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, governmentIdStepRunning.cancelDialog) && Intrinsics.areEqual(this.countryCode, governmentIdStepRunning.countryCode) && Intrinsics.areEqual(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && Intrinsics.areEqual(this.fromComponent, governmentIdStepRunning.fromComponent) && Intrinsics.areEqual(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && Intrinsics.areEqual(this.localizations, governmentIdStepRunning.localizations) && Intrinsics.areEqual(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && Intrinsics.areEqual(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && Intrinsics.areEqual(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && Intrinsics.areEqual(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && Intrinsics.areEqual(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && Intrinsics.areEqual(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && Intrinsics.areEqual(this.assetConfig, governmentIdStepRunning.assetConfig) && Intrinsics.areEqual(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && Intrinsics.areEqual(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            int iHashCode2 = (iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode5 = (((((((((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.enabledIdClasses.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.localizations.hashCode()) * 31;
            List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
            int iHashCode6 = (((((((((((((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.enabledCaptureOptionsNativeMobile.hashCode()) * 31) + Integer.hashCode(this.imageCaptureCount)) * 31) + Long.hashCode(this.manualCaptureButtonDelayMs)) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode()) * 31) + Boolean.hashCode(this.shouldSkipReviewScreen)) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            String str2 = this.webRtcJwt;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int iHashCode8 = (((((((((iHashCode7 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.autoClassificationConfig.hashCode()) * 31) + this.reviewCaptureButtonsAxis.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31;
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            return iHashCode8 + (digitalIdConfig != null ? digitalIdConfig.hashCode() : 0);
        }

        public String toString() {
            return "GovernmentIdStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", countryCode=" + this.countryCode + ", enabledIdClasses=" + this.enabledIdClasses + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", localizations=" + this.localizations + ", localizationOverrides=" + this.localizationOverrides + ", enabledCaptureOptionsNativeMobile=" + this.enabledCaptureOptionsNativeMobile + ", imageCaptureCount=" + this.imageCaptureCount + ", manualCaptureButtonDelayMs=" + this.manualCaptureButtonDelayMs + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ", shouldSkipReviewScreen=" + this.shouldSkipReviewScreen + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", assetConfig=" + this.assetConfig + ", autoClassificationConfig=" + this.autoClassificationConfig + ", reviewCaptureButtonsAxis=" + this.reviewCaptureButtonsAxis + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", digitalIdConfig=" + this.digitalIdConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.countryCode);
            List<Id> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.GovernmentId.LocalizationOverride> list2 = this.localizationOverrides;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            List<CaptureOptionNativeMobile> list3 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list3.size());
            Iterator<CaptureOptionNativeMobile> it3 = list3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next().name());
            }
            dest.writeInt(this.imageCaptureCount);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            List<NextStep.GovernmentId.CaptureFileType> list4 = this.enabledCaptureFileTypes;
            dest.writeInt(list4.size());
            Iterator<NextStep.GovernmentId.CaptureFileType> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeString(it4.next().name());
            }
            List<NextStep.GovernmentId.VideoCaptureMethod> list5 = this.videoCaptureMethods;
            dest.writeInt(list5.size());
            Iterator<NextStep.GovernmentId.VideoCaptureMethod> it5 = list5.iterator();
            while (it5.hasNext()) {
                dest.writeString(it5.next().name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeParcelable(this.autoClassificationConfig, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.digitalIdConfig, flags);
        }

        public /* synthetic */ GovernmentIdStepRunning(String str, String str2, InquiryState3 inquiryState3, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i, long j, String str6, String str7, boolean z3, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : inquiryState3, governmentIdStepStyle, cancelDialog, str3, list, str4, str5, z, z2, localizations, list2, list3, i, j, str6, str7, z3, list4, list5, str8, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, z4, digitalIdConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.InquiryState2
        public StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final List<Id> getEnabledIdClasses() {
            return this.enabledIdClasses;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getFromStep() {
            return this.fromStep;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final NextStep.GovernmentId.Localizations getLocalizations() {
            return this.localizations;
        }

        public final List<NextStep.GovernmentId.LocalizationOverride> getLocalizationOverrides() {
            return this.localizationOverrides;
        }

        public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        public final List<NextStep.GovernmentId.CaptureFileType> getEnabledCaptureFileTypes() {
            return this.enabledCaptureFileTypes;
        }

        public final List<NextStep.GovernmentId.VideoCaptureMethod> getVideoCaptureMethods() {
            return this.videoCaptureMethods;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        public final DigitalIdConfig getDigitalIdConfig() {
            return this.digitalIdConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GovernmentIdStepRunning(String inquiryId, String sessionToken, InquiryState3 inquiryState3, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str, List<Id> enabledIdClasses, String fromComponent, String fromStep, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> list, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int i, long j, String fieldKeyDocument, String fieldKeyIdClass, boolean z3, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, String str2, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z4, DigitalIdConfig digitalIdConfig) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.localizations = localizations;
            this.localizationOverrides = list;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.imageCaptureCount = i;
            this.manualCaptureButtonDelayMs = j;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.shouldSkipReviewScreen = z3;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.webRtcJwt = str2;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z4;
            this.digitalIdConfig = digitalIdConfig;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bß\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0018\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020-¢\u0006\u0004\b2\u00103J\u0094\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00182\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020-HÖ\u0001¢\u0006\u0004\b8\u00103J\u001a\u0010;\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u00107R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bL\u00107R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bM\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bQ\u0010PR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\bR\u00107R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bS\u0010PR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bT\u0010PR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bV\u0010WR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010X\u001a\u0004\b[\u0010ZR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b_\u00107R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b!\u0010X\u001a\u0004\b`\u0010ZR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b$\u0010N\u001a\u0004\bd\u0010PR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010h\u001a\u0004\bi\u0010j¨\u0006k"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/StepState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfieType", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizations", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "designVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "getSelfieType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "getFromComponent", "getFromStep", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getFieldKeySelfie", "getRequireStrictSelfieCapture", "getSkipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getVideoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getWebRtcJwt", "getOrderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getAudioEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "getDesignVersion", "()Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class SelfieStepRunning extends InquiryState implements InquiryState2 {
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new Creator();
        private final NextStep.Selfie.AssetConfig assetConfig;
        private final boolean audioEnabled;
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final NextStep.CancelDialog cancelDialog;
        private final DesignVersion designVersion;
        private final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;
        private final String fieldKeySelfie;
        private final String fromComponent;
        private final String fromStep;
        private final String inquiryId;
        private final NextStep.Selfie.Localizations localizations;
        private final List<NextStep.Selfie.SelfiePose> orderedPoses;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final PoseConfigs poseConfigs;
        private final boolean requireStrictSelfieCapture;
        private final NextStep.Selfie.CaptureMethod selfieType;
        private final String sessionToken;
        private final boolean skipPromptPage;
        private final StepStyles.SelfieStepStyle styles;
        private final InquiryState3 transitionStatus;
        private final List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods;
        private final String webRtcJwt;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepRunning> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepRunning createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                String str;
                boolean z4;
                boolean z5;
                NextStep.Selfie.AssetConfig assetConfig;
                Class cls;
                ArrayList arrayList;
                String str2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                InquiryState3 inquiryState3 = (InquiryState3) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod captureMethodValueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = z2;
                    str = string6;
                    z4 = z3;
                } else {
                    z3 = z2;
                    str = string6;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z3;
                } else {
                    z5 = z3;
                    z3 = z;
                }
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                    i2++;
                    i = i;
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList3.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                    i4++;
                    i3 = i3;
                }
                NextStep.Selfie.AssetConfig assetConfig2 = (NextStep.Selfie.AssetConfig) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    cls = SelfieStepRunning.class;
                    str2 = string2;
                    arrayList = null;
                    assetConfig = assetConfig2;
                } else {
                    assetConfig = assetConfig2;
                    int i5 = parcel.readInt();
                    cls = SelfieStepRunning.class;
                    arrayList = new ArrayList(i5);
                    str2 = string2;
                    int i6 = 0;
                    while (i6 != i5) {
                        arrayList.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i6++;
                        i5 = i5;
                    }
                }
                PendingPageTextPosition pendingPageTextPositionValueOf = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new SelfieStepRunning(str2, string3, inquiryState3, selfieStepStyle, cancelDialog, captureMethodValueOf, string4, string5, z6, z7, str, z4, z3, localizations, arrayList2, arrayList3, assetConfig, string7, arrayList, pendingPageTextPositionValueOf, z5, (PoseConfigs) parcel.readParcelable(cls.getClassLoader()), DesignVersion.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepRunning[] newArray(int i) {
                return new SelfieStepRunning[i];
            }
        }

        public static /* synthetic */ SelfieStepRunning copy$default(SelfieStepRunning selfieStepRunning, String str, String str2, InquiryState3 inquiryState3, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z5, PoseConfigs poseConfigs, DesignVersion designVersion, int i, Object obj) {
            DesignVersion designVersion2;
            PoseConfigs poseConfigs2;
            String str7 = (i & 1) != 0 ? selfieStepRunning.inquiryId : str;
            String str8 = (i & 2) != 0 ? selfieStepRunning.sessionToken : str2;
            InquiryState3 inquiryState32 = (i & 4) != 0 ? selfieStepRunning.transitionStatus : inquiryState3;
            StepStyles.SelfieStepStyle selfieStepStyle2 = (i & 8) != 0 ? selfieStepRunning.styles : selfieStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i & 16) != 0 ? selfieStepRunning.cancelDialog : cancelDialog;
            NextStep.Selfie.CaptureMethod captureMethod2 = (i & 32) != 0 ? selfieStepRunning.selfieType : captureMethod;
            String str9 = (i & 64) != 0 ? selfieStepRunning.fromComponent : str3;
            String str10 = (i & 128) != 0 ? selfieStepRunning.fromStep : str4;
            boolean z6 = (i & 256) != 0 ? selfieStepRunning.backStepEnabled : z;
            boolean z7 = (i & 512) != 0 ? selfieStepRunning.cancelButtonEnabled : z2;
            String str11 = (i & 1024) != 0 ? selfieStepRunning.fieldKeySelfie : str5;
            boolean z8 = (i & 2048) != 0 ? selfieStepRunning.requireStrictSelfieCapture : z3;
            boolean z9 = (i & 4096) != 0 ? selfieStepRunning.skipPromptPage : z4;
            NextStep.Selfie.Localizations localizations2 = (i & 8192) != 0 ? selfieStepRunning.localizations : localizations;
            String str12 = str7;
            List list4 = (i & 16384) != 0 ? selfieStepRunning.enabledCaptureFileTypes : list;
            List list5 = (i & 32768) != 0 ? selfieStepRunning.videoCaptureMethods : list2;
            NextStep.Selfie.AssetConfig assetConfig2 = (i & 65536) != 0 ? selfieStepRunning.assetConfig : assetConfig;
            String str13 = (i & 131072) != 0 ? selfieStepRunning.webRtcJwt : str6;
            List list6 = (i & 262144) != 0 ? selfieStepRunning.orderedPoses : list3;
            PendingPageTextPosition pendingPageTextPosition2 = (i & 524288) != 0 ? selfieStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z10 = (i & 1048576) != 0 ? selfieStepRunning.audioEnabled : z5;
            PoseConfigs poseConfigs3 = (i & 2097152) != 0 ? selfieStepRunning.poseConfigs : poseConfigs;
            if ((i & 4194304) != 0) {
                poseConfigs2 = poseConfigs3;
                designVersion2 = selfieStepRunning.designVersion;
            } else {
                designVersion2 = designVersion;
                poseConfigs2 = poseConfigs3;
            }
            return selfieStepRunning.copy(str12, str8, inquiryState32, selfieStepStyle2, cancelDialog2, captureMethod2, str9, str10, z6, z7, str11, z8, z9, localizations2, list4, list5, assetConfig2, str13, list6, pendingPageTextPosition2, z10, poseConfigs2, designVersion2);
        }

        public final SelfieStepRunning copy(String inquiryId, String sessionToken, InquiryState3 transitionStatus, StepStyles.SelfieStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod selfieType, String fromComponent, String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, String fieldKeySelfie, boolean requireStrictSelfieCapture, boolean skipPromptPage, NextStep.Selfie.Localizations localizations, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, NextStep.Selfie.AssetConfig assetConfig, String webRtcJwt, List<? extends NextStep.Selfie.SelfiePose> orderedPoses, PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, PoseConfigs poseConfigs, DesignVersion designVersion) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            return new SelfieStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, selfieType, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, webRtcJwt, orderedPoses, pendingPageTextVerticalPosition, audioEnabled, poseConfigs, designVersion);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) other;
            return Intrinsics.areEqual(this.inquiryId, selfieStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, selfieStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, selfieStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, selfieStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && Intrinsics.areEqual(this.fromComponent, selfieStepRunning.fromComponent) && Intrinsics.areEqual(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && Intrinsics.areEqual(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && Intrinsics.areEqual(this.localizations, selfieStepRunning.localizations) && Intrinsics.areEqual(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && Intrinsics.areEqual(this.assetConfig, selfieStepRunning.assetConfig) && Intrinsics.areEqual(this.webRtcJwt, selfieStepRunning.webRtcJwt) && Intrinsics.areEqual(this.orderedPoses, selfieStepRunning.orderedPoses) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && Intrinsics.areEqual(this.poseConfigs, selfieStepRunning.poseConfigs) && this.designVersion == selfieStepRunning.designVersion;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            int iHashCode2 = (iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((((((((((((((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.selfieType.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.localizations.hashCode()) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int iHashCode5 = (iHashCode4 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            List<NextStep.Selfie.SelfiePose> list = this.orderedPoses;
            return ((((((((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode();
        }

        public String toString() {
            return "SelfieStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", selfieType=" + this.selfieType + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", localizations=" + this.localizations + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", assetConfig=" + this.assetConfig + ", webRtcJwt=" + this.webRtcJwt + ", orderedPoses=" + this.orderedPoses + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.selfieType.name());
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
            dest.writeInt(list.size());
            Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<NextStep.Selfie.VideoCaptureMethod> list2 = this.videoCaptureMethods;
            dest.writeInt(list2.size());
            Iterator<NextStep.Selfie.VideoCaptureMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.webRtcJwt);
            List<NextStep.Selfie.SelfiePose> list3 = this.orderedPoses;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list3.size());
                Iterator<NextStep.Selfie.SelfiePose> it3 = list3.iterator();
                while (it3.hasNext()) {
                    dest.writeString(it3.next().name());
                }
            }
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.poseConfigs, flags);
            dest.writeString(this.designVersion.name());
        }

        public /* synthetic */ SelfieStepRunning(String str, String str2, InquiryState3 inquiryState3, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z5, PoseConfigs poseConfigs, DesignVersion designVersion, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : inquiryState3, selfieStepStyle, cancelDialog, captureMethod, str3, str4, z, z2, str5, z3, z4, localizations, list, list2, assetConfig, str6, list3, pendingPageTextPosition, z5, poseConfigs, designVersion);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.InquiryState2
        public StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        public final NextStep.Selfie.CaptureMethod getSelfieType() {
            return this.selfieType;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getFromStep() {
            return this.fromStep;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        public final NextStep.Selfie.Localizations getLocalizations() {
            return this.localizations;
        }

        public final List<NextStep.Selfie.CaptureFileType> getEnabledCaptureFileTypes() {
            return this.enabledCaptureFileTypes;
        }

        public final List<NextStep.Selfie.VideoCaptureMethod> getVideoCaptureMethods() {
            return this.videoCaptureMethods;
        }

        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public final List<NextStep.Selfie.SelfiePose> getOrderedPoses() {
            return this.orderedPoses;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public final DesignVersion getDesignVersion() {
            return this.designVersion;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelfieStepRunning(String inquiryId, String sessionToken, InquiryState3 inquiryState3, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod selfieType, String fromComponent, String fromStep, boolean z, boolean z2, String fieldKeySelfie, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, NextStep.Selfie.AssetConfig assetConfig, String str, List<? extends NextStep.Selfie.SelfiePose> list, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z5, PoseConfigs poseConfigs, DesignVersion designVersion) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = selfieType;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str;
            this.orderedPoses = list;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z5;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ|\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b8\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b?\u0010\"¨\u0006@"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/StepState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "documentStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "getDocumentStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "getFromComponent", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "getPages", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getFromStep", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class DocumentStepRunning extends InquiryState implements InquiryState2 {
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new Creator();
        private final NextStep.Document.AssetConfig assetConfig;
        private final NextStep.CancelDialog cancelDialog;
        private final NextStep.Document documentStep;
        private final String fromComponent;
        private final String fromStep;
        private final String inquiryId;
        private final DocumentPages pages;
        private final String sessionToken;
        private final StepStyles.DocumentStepStyle styles;
        private final InquiryState3 transitionStatus;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepRunning> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepRunning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), (InquiryState3) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (DocumentPages) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepRunning[] newArray(int i) {
                return new DocumentStepRunning[i];
            }
        }

        public static /* synthetic */ DocumentStepRunning copy$default(DocumentStepRunning documentStepRunning, String str, String str2, InquiryState3 inquiryState3, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = documentStepRunning.inquiryId;
            }
            if ((i & 2) != 0) {
                str2 = documentStepRunning.sessionToken;
            }
            if ((i & 4) != 0) {
                inquiryState3 = documentStepRunning.transitionStatus;
            }
            if ((i & 8) != 0) {
                documentStepStyle = documentStepRunning.styles;
            }
            if ((i & 16) != 0) {
                cancelDialog = documentStepRunning.cancelDialog;
            }
            if ((i & 32) != 0) {
                document = documentStepRunning.documentStep;
            }
            if ((i & 64) != 0) {
                str3 = documentStepRunning.fromComponent;
            }
            if ((i & 128) != 0) {
                documentPages = documentStepRunning.pages;
            }
            if ((i & 256) != 0) {
                assetConfig = documentStepRunning.assetConfig;
            }
            if ((i & 512) != 0) {
                str4 = documentStepRunning.fromStep;
            }
            NextStep.Document.AssetConfig assetConfig2 = assetConfig;
            String str5 = str4;
            String str6 = str3;
            DocumentPages documentPages2 = documentPages;
            NextStep.CancelDialog cancelDialog2 = cancelDialog;
            NextStep.Document document2 = document;
            return documentStepRunning.copy(str, str2, inquiryState3, documentStepStyle, cancelDialog2, document2, str6, documentPages2, assetConfig2, str5);
        }

        public final DocumentStepRunning copy(String inquiryId, String sessionToken, InquiryState3 transitionStatus, StepStyles.DocumentStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Document documentStep, String fromComponent, DocumentPages pages, NextStep.Document.AssetConfig assetConfig, String fromStep) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new DocumentStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) other;
            return Intrinsics.areEqual(this.inquiryId, documentStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, documentStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, documentStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, documentStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, documentStepRunning.cancelDialog) && Intrinsics.areEqual(this.documentStep, documentStepRunning.documentStep) && Intrinsics.areEqual(this.fromComponent, documentStepRunning.fromComponent) && Intrinsics.areEqual(this.pages, documentStepRunning.pages) && Intrinsics.areEqual(this.assetConfig, documentStepRunning.assetConfig) && Intrinsics.areEqual(this.fromStep, documentStepRunning.fromStep);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            int iHashCode2 = (iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.documentStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.pages.hashCode()) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            return ((iHashCode4 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31) + this.fromStep.hashCode();
        }

        public String toString() {
            return "DocumentStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", documentStep=" + this.documentStep + ", fromComponent=" + this.fromComponent + ", pages=" + this.pages + ", assetConfig=" + this.assetConfig + ", fromStep=" + this.fromStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.documentStep, flags);
            dest.writeString(this.fromComponent);
            dest.writeParcelable(this.pages, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.fromStep);
        }

        public /* synthetic */ DocumentStepRunning(String str, String str2, InquiryState3 inquiryState3, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : inquiryState3, documentStepStyle, cancelDialog, document, str3, documentPages, assetConfig, str4);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.InquiryState2
        public StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        public final NextStep.Document getDocumentStep() {
            return this.documentStep;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        public final DocumentPages getPages() {
            return this.pages;
        }

        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getFromStep() {
            return this.fromStep;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepRunning(String inquiryId, String sessionToken, InquiryState3 inquiryState3, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document documentStep, String fromComponent, DocumentPages pages, NextStep.Document.AssetConfig assetConfig, String fromStep) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = documentStep;
            this.fromComponent = fromComponent;
            this.pages = pages;
            this.assetConfig = assetConfig;
            this.fromStep = fromStep;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b&\u0010\u0019R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getTransitionStatus", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "getInquiryStatus", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Complete extends InquiryState {
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();
        private final Map<String, InquiryField> fields;
        private final String inquiryId;
        private final String inquiryStatus;
        private final String sessionToken;
        private final InquiryState3 transitionStatus;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                InquiryState3 inquiryState3 = (InquiryState3) parcel.readParcelable(Complete.class.getClassLoader());
                String string4 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                }
                return new Complete(string2, string3, inquiryState3, string4, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }

        public static /* synthetic */ Complete copy$default(Complete complete, String str, String str2, InquiryState3 inquiryState3, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = complete.inquiryId;
            }
            if ((i & 2) != 0) {
                str2 = complete.sessionToken;
            }
            if ((i & 4) != 0) {
                inquiryState3 = complete.transitionStatus;
            }
            if ((i & 8) != 0) {
                str3 = complete.inquiryStatus;
            }
            if ((i & 16) != 0) {
                map = complete.fields;
            }
            Map map2 = map;
            InquiryState3 inquiryState32 = inquiryState3;
            return complete.copy(str, str2, inquiryState32, str3, map2);
        }

        public final Complete copy(String inquiryId, String sessionToken, InquiryState3 transitionStatus, String inquiryStatus, Map<String, ? extends InquiryField> fields) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new Complete(inquiryId, sessionToken, transitionStatus, inquiryStatus, fields);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.inquiryId, complete.inquiryId) && Intrinsics.areEqual(this.sessionToken, complete.sessionToken) && Intrinsics.areEqual(this.transitionStatus, complete.transitionStatus) && Intrinsics.areEqual(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.areEqual(this.fields, complete.fields);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            InquiryState3 inquiryState3 = this.transitionStatus;
            return ((((iHashCode + (inquiryState3 == null ? 0 : inquiryState3.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode();
        }

        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        }

        public /* synthetic */ Complete(String str, String str2, InquiryState3 inquiryState3, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : inquiryState3, str3, map);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public InquiryState3 getTransitionStatus() {
            return this.transitionStatus;
        }

        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(String inquiryId, String sessionToken, InquiryState3 inquiryState3, String inquiryStatus, Map<String, ? extends InquiryField> fields) {
            super(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = inquiryState3;
            this.inquiryStatus = inquiryStatus;
            this.fields = fields;
        }
    }

    public final InquiryState updateTransitionStatus(InquiryState3 transitionStatus) {
        if (this instanceof Complete) {
            return Complete.copy$default((Complete) this, null, null, transitionStatus, null, null, 27, null);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession) || (this instanceof ExchangeOneTimeCode)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.copy$default((DocumentStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, null, 1019, null);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.copy$default((GovernmentIdStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.copy$default((SelfieStepRunning) this, null, null, transitionStatus, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 8388603, null);
        }
        if (this instanceof ShowLoadingSpinner) {
            return ShowLoadingSpinner.copy$default((ShowLoadingSpinner) this, null, transitionStatus, null, null, false, null, 61, null);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.copy$default((UiStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
