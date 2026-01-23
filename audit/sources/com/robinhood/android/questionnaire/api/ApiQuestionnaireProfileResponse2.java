package com.robinhood.android.questionnaire.api;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireProfileResponse.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", "", "StringAnswer", "IntegerAnswer", "MultipleChoiceAnswer", "MultipleResponseAnswer", "UnknownAnswer", "AdapterModule", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$IntegerAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$MultipleChoiceAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$MultipleResponseAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$StringAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$UnknownAnswer;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent, reason: use source file name */
/* loaded from: classes11.dex */
public interface ApiQuestionnaireProfileResponse2 {

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$StringAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/QuestionnaireStringAnswerSummary;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionnaireStringAnswerSummary;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/QuestionnaireStringAnswerSummary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$StringAnswer, reason: from toString */
    public static final /* data */ class StringAnswer implements ApiQuestionnaireProfileResponse2 {
        private final QuestionnaireStringAnswerSummary data;

        public static /* synthetic */ StringAnswer copy$default(StringAnswer stringAnswer, QuestionnaireStringAnswerSummary questionnaireStringAnswerSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                questionnaireStringAnswerSummary = stringAnswer.data;
            }
            return stringAnswer.copy(questionnaireStringAnswerSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionnaireStringAnswerSummary getData() {
            return this.data;
        }

        public final StringAnswer copy(QuestionnaireStringAnswerSummary data) {
            return new StringAnswer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringAnswer) && Intrinsics.areEqual(this.data, ((StringAnswer) other).data);
        }

        public int hashCode() {
            QuestionnaireStringAnswerSummary questionnaireStringAnswerSummary = this.data;
            if (questionnaireStringAnswerSummary == null) {
                return 0;
            }
            return questionnaireStringAnswerSummary.hashCode();
        }

        public String toString() {
            return "StringAnswer(data=" + this.data + ")";
        }

        public StringAnswer(QuestionnaireStringAnswerSummary questionnaireStringAnswerSummary) {
            this.data = questionnaireStringAnswerSummary;
        }

        public final QuestionnaireStringAnswerSummary getData() {
            return this.data;
        }
    }

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$IntegerAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/QuestionnaireIntegerAnswerSummary;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionnaireIntegerAnswerSummary;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/QuestionnaireIntegerAnswerSummary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$IntegerAnswer, reason: from toString */
    public static final /* data */ class IntegerAnswer implements ApiQuestionnaireProfileResponse2 {
        private final QuestionnaireIntegerAnswerSummary data;

        public static /* synthetic */ IntegerAnswer copy$default(IntegerAnswer integerAnswer, QuestionnaireIntegerAnswerSummary questionnaireIntegerAnswerSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                questionnaireIntegerAnswerSummary = integerAnswer.data;
            }
            return integerAnswer.copy(questionnaireIntegerAnswerSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionnaireIntegerAnswerSummary getData() {
            return this.data;
        }

        public final IntegerAnswer copy(QuestionnaireIntegerAnswerSummary data) {
            return new IntegerAnswer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegerAnswer) && Intrinsics.areEqual(this.data, ((IntegerAnswer) other).data);
        }

        public int hashCode() {
            QuestionnaireIntegerAnswerSummary questionnaireIntegerAnswerSummary = this.data;
            if (questionnaireIntegerAnswerSummary == null) {
                return 0;
            }
            return questionnaireIntegerAnswerSummary.hashCode();
        }

        public String toString() {
            return "IntegerAnswer(data=" + this.data + ")";
        }

        public IntegerAnswer(QuestionnaireIntegerAnswerSummary questionnaireIntegerAnswerSummary) {
            this.data = questionnaireIntegerAnswerSummary;
        }

        public final QuestionnaireIntegerAnswerSummary getData() {
            return this.data;
        }
    }

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$MultipleChoiceAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleChoiceAnswerSummary;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleChoiceAnswerSummary;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleChoiceAnswerSummary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$MultipleChoiceAnswer, reason: from toString */
    public static final /* data */ class MultipleChoiceAnswer implements ApiQuestionnaireProfileResponse2 {
        private final QuestionnaireMultipleChoiceAnswerSummary data;

        public static /* synthetic */ MultipleChoiceAnswer copy$default(MultipleChoiceAnswer multipleChoiceAnswer, QuestionnaireMultipleChoiceAnswerSummary questionnaireMultipleChoiceAnswerSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                questionnaireMultipleChoiceAnswerSummary = multipleChoiceAnswer.data;
            }
            return multipleChoiceAnswer.copy(questionnaireMultipleChoiceAnswerSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionnaireMultipleChoiceAnswerSummary getData() {
            return this.data;
        }

        public final MultipleChoiceAnswer copy(QuestionnaireMultipleChoiceAnswerSummary data) {
            return new MultipleChoiceAnswer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleChoiceAnswer) && Intrinsics.areEqual(this.data, ((MultipleChoiceAnswer) other).data);
        }

        public int hashCode() {
            QuestionnaireMultipleChoiceAnswerSummary questionnaireMultipleChoiceAnswerSummary = this.data;
            if (questionnaireMultipleChoiceAnswerSummary == null) {
                return 0;
            }
            return questionnaireMultipleChoiceAnswerSummary.hashCode();
        }

        public String toString() {
            return "MultipleChoiceAnswer(data=" + this.data + ")";
        }

        public MultipleChoiceAnswer(QuestionnaireMultipleChoiceAnswerSummary questionnaireMultipleChoiceAnswerSummary) {
            this.data = questionnaireMultipleChoiceAnswerSummary;
        }

        public final QuestionnaireMultipleChoiceAnswerSummary getData() {
            return this.data;
        }
    }

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$MultipleResponseAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleResponseAnswerSummary;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleResponseAnswerSummary;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/QuestionnaireMultipleResponseAnswerSummary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$MultipleResponseAnswer, reason: from toString */
    public static final /* data */ class MultipleResponseAnswer implements ApiQuestionnaireProfileResponse2 {
        private final QuestionnaireMultipleResponseAnswerSummary data;

        public static /* synthetic */ MultipleResponseAnswer copy$default(MultipleResponseAnswer multipleResponseAnswer, QuestionnaireMultipleResponseAnswerSummary questionnaireMultipleResponseAnswerSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                questionnaireMultipleResponseAnswerSummary = multipleResponseAnswer.data;
            }
            return multipleResponseAnswer.copy(questionnaireMultipleResponseAnswerSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionnaireMultipleResponseAnswerSummary getData() {
            return this.data;
        }

        public final MultipleResponseAnswer copy(QuestionnaireMultipleResponseAnswerSummary data) {
            return new MultipleResponseAnswer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleResponseAnswer) && Intrinsics.areEqual(this.data, ((MultipleResponseAnswer) other).data);
        }

        public int hashCode() {
            QuestionnaireMultipleResponseAnswerSummary questionnaireMultipleResponseAnswerSummary = this.data;
            if (questionnaireMultipleResponseAnswerSummary == null) {
                return 0;
            }
            return questionnaireMultipleResponseAnswerSummary.hashCode();
        }

        public String toString() {
            return "MultipleResponseAnswer(data=" + this.data + ")";
        }

        public MultipleResponseAnswer(QuestionnaireMultipleResponseAnswerSummary questionnaireMultipleResponseAnswerSummary) {
            this.data = questionnaireMultipleResponseAnswerSummary;
        }

        public final QuestionnaireMultipleResponseAnswerSummary getData() {
            return this.data;
        }
    }

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$UnknownAnswer;", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$UnknownAnswer, reason: from toString */
    public static final /* data */ class UnknownAnswer implements ApiQuestionnaireProfileResponse2 {
        private final String data;

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownAnswer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UnknownAnswer copy$default(UnknownAnswer unknownAnswer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownAnswer.data;
            }
            return unknownAnswer.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public final UnknownAnswer copy(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new UnknownAnswer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownAnswer) && Intrinsics.areEqual(this.data, ((UnknownAnswer) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UnknownAnswer(data=" + this.data + ")";
        }

        public UnknownAnswer(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public /* synthetic */ UnknownAnswer(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "unknown" : str);
        }

        public final String getData() {
            return this.data;
        }
    }

    /* compiled from: ApiQuestionnaireProfileResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiAnswerContent$AdapterModule;", "", "<init>", "()V", "KEY_TYPE", "", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiAnswerContent$AdapterModule */
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();
        private static final String KEY_TYPE = "type";

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ApiQuestionnaireProfileResponse2.class, "type").withSubtype(StringAnswer.class, "string_question").withSubtype(IntegerAnswer.class, "integer_question").withSubtype(MultipleChoiceAnswer.class, "multiple_choice").withSubtype(MultipleResponseAnswer.class, "multiple_response").withSubtype(UnknownAnswer.class, "unknown");
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
