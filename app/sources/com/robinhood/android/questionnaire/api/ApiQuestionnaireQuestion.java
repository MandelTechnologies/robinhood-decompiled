package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.enums.RhEnum;
import com.robinhood.referral.SingularAttributionManager;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireQuestion.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J[\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "is_optional", "", "disclosure_markdown", "question_content", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "getDisclosure_markdown", "getQuestion_content", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Context", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireQuestion {
    private final Context context;
    private final String disclosure_markdown;
    private final UUID id;
    private final boolean is_optional;
    private final String key;
    private final ApiQuestionContent question_content;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ ApiQuestionnaireQuestion copy$default(ApiQuestionnaireQuestion apiQuestionnaireQuestion, UUID uuid, String str, String str2, String str3, boolean z, String str4, ApiQuestionContent apiQuestionContent, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiQuestionnaireQuestion.id;
        }
        if ((i & 2) != 0) {
            str = apiQuestionnaireQuestion.key;
        }
        if ((i & 4) != 0) {
            str2 = apiQuestionnaireQuestion.title;
        }
        if ((i & 8) != 0) {
            str3 = apiQuestionnaireQuestion.subtitle;
        }
        if ((i & 16) != 0) {
            z = apiQuestionnaireQuestion.is_optional;
        }
        if ((i & 32) != 0) {
            str4 = apiQuestionnaireQuestion.disclosure_markdown;
        }
        if ((i & 64) != 0) {
            apiQuestionContent = apiQuestionnaireQuestion.question_content;
        }
        if ((i & 128) != 0) {
            context = apiQuestionnaireQuestion.context;
        }
        ApiQuestionContent apiQuestionContent2 = apiQuestionContent;
        Context context2 = context;
        boolean z2 = z;
        String str5 = str4;
        return apiQuestionnaireQuestion.copy(uuid, str, str2, str3, z2, str5, apiQuestionContent2, context2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIs_optional() {
        return this.is_optional;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiQuestionContent getQuestion_content() {
        return this.question_content;
    }

    /* renamed from: component8, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final ApiQuestionnaireQuestion copy(UUID id, String key, String title, String subtitle, boolean is_optional, String disclosure_markdown, ApiQuestionContent question_content, Context context) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(question_content, "question_content");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ApiQuestionnaireQuestion(id, key, title, subtitle, is_optional, disclosure_markdown, question_content, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireQuestion)) {
            return false;
        }
        ApiQuestionnaireQuestion apiQuestionnaireQuestion = (ApiQuestionnaireQuestion) other;
        return Intrinsics.areEqual(this.id, apiQuestionnaireQuestion.id) && Intrinsics.areEqual(this.key, apiQuestionnaireQuestion.key) && Intrinsics.areEqual(this.title, apiQuestionnaireQuestion.title) && Intrinsics.areEqual(this.subtitle, apiQuestionnaireQuestion.subtitle) && this.is_optional == apiQuestionnaireQuestion.is_optional && Intrinsics.areEqual(this.disclosure_markdown, apiQuestionnaireQuestion.disclosure_markdown) && Intrinsics.areEqual(this.question_content, apiQuestionnaireQuestion.question_content) && this.context == apiQuestionnaireQuestion.context;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.is_optional)) * 31;
        String str = this.disclosure_markdown;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.question_content.hashCode()) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "ApiQuestionnaireQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", is_optional=" + this.is_optional + ", disclosure_markdown=" + this.disclosure_markdown + ", question_content=" + this.question_content + ", context=" + this.context + ")";
    }

    public ApiQuestionnaireQuestion(UUID id, String key, String title, String subtitle, boolean z, String str, ApiQuestionContent question_content, Context context) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(question_content, "question_content");
        Intrinsics.checkNotNullParameter(context, "context");
        this.id = id;
        this.key = key;
        this.title = title;
        this.subtitle = subtitle;
        this.is_optional = z;
        this.disclosure_markdown = str;
        this.question_content = question_content;
        this.context = context;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean is_optional() {
        return this.is_optional;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final ApiQuestionContent getQuestion_content() {
        return this.question_content;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "ACCOUNT", "USER", "PRODUCT", "UNKNOWN", "Companion", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Context implements RhEnum<Context> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Context[] $VALUES;
        private final String serverValue;
        public static final Context ACCOUNT = new Context("ACCOUNT", 0, "account");
        public static final Context USER = new Context("USER", 1, "user");
        public static final Context PRODUCT = new Context("PRODUCT", 2, SingularAttributionManager.PRODUCT_PARAM_KEY);
        public static final Context UNKNOWN = new Context("UNKNOWN", 3, "unknown");

        private static final /* synthetic */ Context[] $values() {
            return new Context[]{ACCOUNT, USER, PRODUCT, UNKNOWN};
        }

        public static EnumEntries<Context> getEntries() {
            return $ENTRIES;
        }

        private Context(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Context[] contextArr$values = $values();
            $VALUES = contextArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contextArr$values);
            INSTANCE = new Companion(null);
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }
    }

    public final UiQuestionnaireQuestion toUiModel() {
        UiQuestionContent uiModel = this.question_content.toUiModel();
        if (uiModel instanceof UiQuestionContent.IntegerContent) {
            return new UiQuestionnaireQuestion.IntegerQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.IntegerContent) uiModel, this.context);
        }
        if (uiModel instanceof UiQuestionContent.MultipleChoiceContent) {
            return new UiQuestionnaireQuestion.MultipleChoiceQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.MultipleChoiceContent) uiModel, this.context);
        }
        if (uiModel instanceof UiQuestionContent.MultipleResponseContent) {
            return new UiQuestionnaireQuestion.MultipleResponseQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.MultipleResponseContent) uiModel, this.context);
        }
        if (uiModel instanceof UiQuestionContent.StringContent) {
            return new UiQuestionnaireQuestion.StringQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.StringContent) uiModel, this.context, this.is_optional);
        }
        if (uiModel instanceof UiQuestionContent.HybridContent) {
            return new UiQuestionnaireQuestion.HybridQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.HybridContent) uiModel, this.context);
        }
        if (uiModel instanceof UiQuestionContent.OptionalIntegerContent) {
            return new UiQuestionnaireQuestion.OptionalIntegerQuestion(this.id, this.key, this.title, this.subtitle, this.disclosure_markdown, (UiQuestionContent.OptionalIntegerContent) uiModel, this.context);
        }
        if (uiModel instanceof UiQuestionContent.Unsupported) {
            return UiQuestionnaireQuestion.Unsupported.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
