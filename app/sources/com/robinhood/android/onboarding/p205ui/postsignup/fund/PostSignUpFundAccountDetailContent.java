package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountDetailState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;", "", "title", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "subtitle", "subtitleMarkdown", "", "valueProps", "", "Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithIcon;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "disclosureText", "buttonText", "exitButtonText", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getSubtitle", "getSubtitleMarkdown", "()Ljava/lang/String;", "getValueProps", "()Ljava/util/List;", "getDisclosureText", "getButtonText", "getExitButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpFundAccountDetailContent {
    public static final int $stable = 8;
    private final String buttonText;
    private final RichText disclosureText;
    private final String exitButtonText;
    private final RichText subtitle;
    private final String subtitleMarkdown;
    private final RichText title;
    private final List<ValuePropWithIcon<GenericAction>> valueProps;

    public PostSignUpFundAccountDetailContent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ PostSignUpFundAccountDetailContent copy$default(PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent, RichText richText, RichText richText2, String str, List list, RichText richText3, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = postSignUpFundAccountDetailContent.title;
        }
        if ((i & 2) != 0) {
            richText2 = postSignUpFundAccountDetailContent.subtitle;
        }
        if ((i & 4) != 0) {
            str = postSignUpFundAccountDetailContent.subtitleMarkdown;
        }
        if ((i & 8) != 0) {
            list = postSignUpFundAccountDetailContent.valueProps;
        }
        if ((i & 16) != 0) {
            richText3 = postSignUpFundAccountDetailContent.disclosureText;
        }
        if ((i & 32) != 0) {
            str2 = postSignUpFundAccountDetailContent.buttonText;
        }
        if ((i & 64) != 0) {
            str3 = postSignUpFundAccountDetailContent.exitButtonText;
        }
        String str4 = str2;
        String str5 = str3;
        RichText richText4 = richText3;
        String str6 = str;
        return postSignUpFundAccountDetailContent.copy(richText, richText2, str6, list, richText4, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final RichText getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<ValuePropWithIcon<GenericAction>> component4() {
        return this.valueProps;
    }

    /* renamed from: component5, reason: from getter */
    public final RichText getDisclosureText() {
        return this.disclosureText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExitButtonText() {
        return this.exitButtonText;
    }

    public final PostSignUpFundAccountDetailContent copy(RichText title, RichText subtitle, String subtitleMarkdown, List<? extends ValuePropWithIcon<? extends GenericAction>> valueProps, RichText disclosureText, String buttonText, String exitButtonText) {
        return new PostSignUpFundAccountDetailContent(title, subtitle, subtitleMarkdown, valueProps, disclosureText, buttonText, exitButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpFundAccountDetailContent)) {
            return false;
        }
        PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent = (PostSignUpFundAccountDetailContent) other;
        return Intrinsics.areEqual(this.title, postSignUpFundAccountDetailContent.title) && Intrinsics.areEqual(this.subtitle, postSignUpFundAccountDetailContent.subtitle) && Intrinsics.areEqual(this.subtitleMarkdown, postSignUpFundAccountDetailContent.subtitleMarkdown) && Intrinsics.areEqual(this.valueProps, postSignUpFundAccountDetailContent.valueProps) && Intrinsics.areEqual(this.disclosureText, postSignUpFundAccountDetailContent.disclosureText) && Intrinsics.areEqual(this.buttonText, postSignUpFundAccountDetailContent.buttonText) && Intrinsics.areEqual(this.exitButtonText, postSignUpFundAccountDetailContent.exitButtonText);
    }

    public int hashCode() {
        RichText richText = this.title;
        int iHashCode = (richText == null ? 0 : richText.hashCode()) * 31;
        RichText richText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (richText2 == null ? 0 : richText2.hashCode())) * 31;
        String str = this.subtitleMarkdown;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<ValuePropWithIcon<GenericAction>> list = this.valueProps;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        RichText richText3 = this.disclosureText;
        int iHashCode5 = (iHashCode4 + (richText3 == null ? 0 : richText3.hashCode())) * 31;
        String str2 = this.buttonText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.exitButtonText;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PostSignUpFundAccountDetailContent(title=" + this.title + ", subtitle=" + this.subtitle + ", subtitleMarkdown=" + this.subtitleMarkdown + ", valueProps=" + this.valueProps + ", disclosureText=" + this.disclosureText + ", buttonText=" + this.buttonText + ", exitButtonText=" + this.exitButtonText + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpFundAccountDetailContent(RichText richText, RichText richText2, String str, List<? extends ValuePropWithIcon<? extends GenericAction>> list, RichText richText3, String str2, String str3) {
        this.title = richText;
        this.subtitle = richText2;
        this.subtitleMarkdown = str;
        this.valueProps = list;
        this.disclosureText = richText3;
        this.buttonText = str2;
        this.exitButtonText = str3;
    }

    public /* synthetic */ PostSignUpFundAccountDetailContent(RichText richText, RichText richText2, String str, List list, RichText richText3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : richText, (i & 2) != 0 ? null : richText2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : richText3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }

    public final RichText getTitle() {
        return this.title;
    }

    public final RichText getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<ValuePropWithIcon<GenericAction>> getValueProps() {
        return this.valueProps;
    }

    public final RichText getDisclosureText() {
        return this.disclosureText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getExitButtonText() {
        return this.exitButtonText;
    }
}
