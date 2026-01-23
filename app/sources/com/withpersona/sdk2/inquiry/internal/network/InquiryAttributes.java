package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryAttributes.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b$\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b&\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b'\u0010\u0014R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b+\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "", "", "templateId", "templateVersion", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "environment", "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateId", "getTemplateVersion", "getInquiryId", "getSessionToken", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironment", "()Lcom/withpersona/sdk2/inquiry/internal/Environment;", "getEnvironmentId", "getAccountId", "getReferenceId", "getNote", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "getThemeSetId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InquiryAttributes {
    private final String accountId;
    private final Environment environment;
    private final String environmentId;
    private final Map<String, InquiryField> fields;
    private final String inquiryId;
    private final String note;
    private final String referenceId;
    private final String sessionToken;
    private final String templateId;
    private final String templateVersion;
    private final String themeSetId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryAttributes)) {
            return false;
        }
        InquiryAttributes inquiryAttributes = (InquiryAttributes) other;
        return Intrinsics.areEqual(this.templateId, inquiryAttributes.templateId) && Intrinsics.areEqual(this.templateVersion, inquiryAttributes.templateVersion) && Intrinsics.areEqual(this.inquiryId, inquiryAttributes.inquiryId) && Intrinsics.areEqual(this.sessionToken, inquiryAttributes.sessionToken) && this.environment == inquiryAttributes.environment && Intrinsics.areEqual(this.environmentId, inquiryAttributes.environmentId) && Intrinsics.areEqual(this.accountId, inquiryAttributes.accountId) && Intrinsics.areEqual(this.referenceId, inquiryAttributes.referenceId) && Intrinsics.areEqual(this.note, inquiryAttributes.note) && Intrinsics.areEqual(this.fields, inquiryAttributes.fields) && Intrinsics.areEqual(this.themeSetId, inquiryAttributes.themeSetId);
    }

    public int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inquiryId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionToken;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.environment.hashCode()) * 31;
        String str5 = this.environmentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accountId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.note;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, InquiryField> map = this.fields;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.themeSetId;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "InquiryAttributes(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", note=" + this.note + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryAttributes(String str, String str2, String str3, String str4, Environment environment, String str5, String str6, String str7, String str8, Map<String, ? extends InquiryField> map, String str9) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.environment = environment;
        this.environmentId = str5;
        this.accountId = str6;
        this.referenceId = str7;
        this.note = str8;
        this.fields = map;
        this.themeSetId = str9;
    }

    public /* synthetic */ InquiryAttributes(String str, String str2, String str3, String str4, Environment environment, String str5, String str6, String str7, String str8, Map map, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, environment, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? null : str9);
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    public final String getInquiryId() {
        return this.inquiryId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final String getAccountId() {
        return this.accountId;
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
}
