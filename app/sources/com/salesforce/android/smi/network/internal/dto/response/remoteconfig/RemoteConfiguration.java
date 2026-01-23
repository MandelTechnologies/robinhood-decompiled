package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListConfiguration;
import com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditions;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteConfiguration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003Jm\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00069"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/RemoteConfiguration;", "", "name", "", "deploymentType", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/DeploymentType;", "forms", "", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/PreChatConfiguration;", "choiceListConfiguration", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;", "termsAndConditions", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "attachments", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/AttachmentConfiguration;", "transcript", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/TranscriptConfiguration;", "fallbackMessage", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FallbackMessageConfiguration;", "timestamp", "", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/DeploymentType;Ljava/util/List;Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/AttachmentConfiguration;Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/TranscriptConfiguration;Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FallbackMessageConfiguration;J)V", "getName", "()Ljava/lang/String;", "getDeploymentType", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/DeploymentType;", "getForms", "()Ljava/util/List;", "getChoiceListConfiguration", "()Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;", "getTermsAndConditions", "()Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "getAttachments", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/AttachmentConfiguration;", "getTranscript", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/TranscriptConfiguration;", "getFallbackMessage", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FallbackMessageConfiguration;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RemoteConfiguration {
    private final AttachmentConfiguration attachments;
    private final ChoiceListConfiguration choiceListConfiguration;
    private final DeploymentType deploymentType;
    private final FallbackMessageConfiguration fallbackMessage;
    private final List<PreChatConfiguration> forms;
    private final String name;
    private final TermsAndConditions termsAndConditions;
    private final long timestamp;
    private final TranscriptConfiguration transcript;

    public static /* synthetic */ RemoteConfiguration copy$default(RemoteConfiguration remoteConfiguration, String str, DeploymentType deploymentType, List list, ChoiceListConfiguration choiceListConfiguration, TermsAndConditions termsAndConditions, AttachmentConfiguration attachmentConfiguration, TranscriptConfiguration transcriptConfiguration, FallbackMessageConfiguration fallbackMessageConfiguration, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteConfiguration.name;
        }
        if ((i & 2) != 0) {
            deploymentType = remoteConfiguration.deploymentType;
        }
        if ((i & 4) != 0) {
            list = remoteConfiguration.forms;
        }
        if ((i & 8) != 0) {
            choiceListConfiguration = remoteConfiguration.choiceListConfiguration;
        }
        if ((i & 16) != 0) {
            termsAndConditions = remoteConfiguration.termsAndConditions;
        }
        if ((i & 32) != 0) {
            attachmentConfiguration = remoteConfiguration.attachments;
        }
        if ((i & 64) != 0) {
            transcriptConfiguration = remoteConfiguration.transcript;
        }
        if ((i & 128) != 0) {
            fallbackMessageConfiguration = remoteConfiguration.fallbackMessage;
        }
        if ((i & 256) != 0) {
            j = remoteConfiguration.timestamp;
        }
        long j2 = j;
        TranscriptConfiguration transcriptConfiguration2 = transcriptConfiguration;
        FallbackMessageConfiguration fallbackMessageConfiguration2 = fallbackMessageConfiguration;
        TermsAndConditions termsAndConditions2 = termsAndConditions;
        AttachmentConfiguration attachmentConfiguration2 = attachmentConfiguration;
        return remoteConfiguration.copy(str, deploymentType, list, choiceListConfiguration, termsAndConditions2, attachmentConfiguration2, transcriptConfiguration2, fallbackMessageConfiguration2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final DeploymentType getDeploymentType() {
        return this.deploymentType;
    }

    public final List<PreChatConfiguration> component3() {
        return this.forms;
    }

    /* renamed from: component4, reason: from getter */
    public final ChoiceListConfiguration getChoiceListConfiguration() {
        return this.choiceListConfiguration;
    }

    /* renamed from: component5, reason: from getter */
    public final TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: component6, reason: from getter */
    public final AttachmentConfiguration getAttachments() {
        return this.attachments;
    }

    /* renamed from: component7, reason: from getter */
    public final TranscriptConfiguration getTranscript() {
        return this.transcript;
    }

    /* renamed from: component8, reason: from getter */
    public final FallbackMessageConfiguration getFallbackMessage() {
        return this.fallbackMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final RemoteConfiguration copy(String name, DeploymentType deploymentType, List<PreChatConfiguration> forms, @Json(name = "choiceListConfig") ChoiceListConfiguration choiceListConfiguration, TermsAndConditions termsAndConditions, AttachmentConfiguration attachments, TranscriptConfiguration transcript, FallbackMessageConfiguration fallbackMessage, long timestamp) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deploymentType, "deploymentType");
        Intrinsics.checkNotNullParameter(forms, "forms");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        Intrinsics.checkNotNullParameter(fallbackMessage, "fallbackMessage");
        return new RemoteConfiguration(name, deploymentType, forms, choiceListConfiguration, termsAndConditions, attachments, transcript, fallbackMessage, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfiguration)) {
            return false;
        }
        RemoteConfiguration remoteConfiguration = (RemoteConfiguration) other;
        return Intrinsics.areEqual(this.name, remoteConfiguration.name) && this.deploymentType == remoteConfiguration.deploymentType && Intrinsics.areEqual(this.forms, remoteConfiguration.forms) && Intrinsics.areEqual(this.choiceListConfiguration, remoteConfiguration.choiceListConfiguration) && Intrinsics.areEqual(this.termsAndConditions, remoteConfiguration.termsAndConditions) && Intrinsics.areEqual(this.attachments, remoteConfiguration.attachments) && Intrinsics.areEqual(this.transcript, remoteConfiguration.transcript) && Intrinsics.areEqual(this.fallbackMessage, remoteConfiguration.fallbackMessage) && this.timestamp == remoteConfiguration.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.deploymentType.hashCode()) * 31) + this.forms.hashCode()) * 31;
        ChoiceListConfiguration choiceListConfiguration = this.choiceListConfiguration;
        int iHashCode2 = (iHashCode + (choiceListConfiguration == null ? 0 : choiceListConfiguration.hashCode())) * 31;
        TermsAndConditions termsAndConditions = this.termsAndConditions;
        return ((((((((iHashCode2 + (termsAndConditions != null ? termsAndConditions.hashCode() : 0)) * 31) + this.attachments.hashCode()) * 31) + this.transcript.hashCode()) * 31) + this.fallbackMessage.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "RemoteConfiguration(name=" + this.name + ", deploymentType=" + this.deploymentType + ", forms=" + this.forms + ", choiceListConfiguration=" + this.choiceListConfiguration + ", termsAndConditions=" + this.termsAndConditions + ", attachments=" + this.attachments + ", transcript=" + this.transcript + ", fallbackMessage=" + this.fallbackMessage + ", timestamp=" + this.timestamp + ")";
    }

    public RemoteConfiguration(String name, DeploymentType deploymentType, List<PreChatConfiguration> forms, @Json(name = "choiceListConfig") ChoiceListConfiguration choiceListConfiguration, TermsAndConditions termsAndConditions, AttachmentConfiguration attachments, TranscriptConfiguration transcript, FallbackMessageConfiguration fallbackMessage, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deploymentType, "deploymentType");
        Intrinsics.checkNotNullParameter(forms, "forms");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        Intrinsics.checkNotNullParameter(fallbackMessage, "fallbackMessage");
        this.name = name;
        this.deploymentType = deploymentType;
        this.forms = forms;
        this.choiceListConfiguration = choiceListConfiguration;
        this.termsAndConditions = termsAndConditions;
        this.attachments = attachments;
        this.transcript = transcript;
        this.fallbackMessage = fallbackMessage;
        this.timestamp = j;
    }

    public final String getName() {
        return this.name;
    }

    public final DeploymentType getDeploymentType() {
        return this.deploymentType;
    }

    public final List<PreChatConfiguration> getForms() {
        return this.forms;
    }

    public final ChoiceListConfiguration getChoiceListConfiguration() {
        return this.choiceListConfiguration;
    }

    public final TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public /* synthetic */ RemoteConfiguration(String str, DeploymentType deploymentType, List list, ChoiceListConfiguration choiceListConfiguration, TermsAndConditions termsAndConditions, AttachmentConfiguration attachmentConfiguration, TranscriptConfiguration transcriptConfiguration, FallbackMessageConfiguration fallbackMessageConfiguration, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, deploymentType, list, choiceListConfiguration, termsAndConditions, (i & 32) != 0 ? new AttachmentConfiguration(false, 1, null) : attachmentConfiguration, (i & 64) != 0 ? new TranscriptConfiguration(false, 1, null) : transcriptConfiguration, (i & 128) != 0 ? new FallbackMessageConfiguration(false, null, 3, null) : fallbackMessageConfiguration, (i & 256) != 0 ? new Date().getTime() : j);
    }

    public final AttachmentConfiguration getAttachments() {
        return this.attachments;
    }

    public final TranscriptConfiguration getTranscript() {
        return this.transcript;
    }

    public final FallbackMessageConfiguration getFallbackMessage() {
        return this.fallbackMessage;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
