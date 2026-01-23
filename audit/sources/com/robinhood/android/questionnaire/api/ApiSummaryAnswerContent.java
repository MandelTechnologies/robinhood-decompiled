package com.robinhood.android.questionnaire.api;

import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiSummaryAnswerContent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent;", "", "<init>", "()V", "MultipleChoiceContent", "IntegerContent", "StringContent", "Unsupported", "AdapterModule", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$Unsupported;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class ApiSummaryAnswerContent {
    public /* synthetic */ ApiSummaryAnswerContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiSummaryAnswerContent() {
    }

    /* compiled from: ApiSummaryAnswerContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleChoiceContent extends ApiSummaryAnswerContent {
        private final Data data;

        public static /* synthetic */ MultipleChoiceContent copy$default(MultipleChoiceContent multipleChoiceContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = multipleChoiceContent.data;
            }
            return multipleChoiceContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final MultipleChoiceContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new MultipleChoiceContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleChoiceContent) && Intrinsics.areEqual(this.data, ((MultipleChoiceContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "MultipleChoiceContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleChoiceContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiSummaryAnswerContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$MultipleChoiceContent$Data;", "", "answer_choice_key", "", "answer_choice_short_name", "answer_choice_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnswer_choice_key", "()Ljava/lang/String;", "getAnswer_choice_short_name", "getAnswer_choice_id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final String answer_choice_id;
            private final String answer_choice_key;
            private final String answer_choice_short_name;

            public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = data.answer_choice_key;
                }
                if ((i & 2) != 0) {
                    str2 = data.answer_choice_short_name;
                }
                if ((i & 4) != 0) {
                    str3 = data.answer_choice_id;
                }
                return data.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAnswer_choice_key() {
                return this.answer_choice_key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnswer_choice_short_name() {
                return this.answer_choice_short_name;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAnswer_choice_id() {
                return this.answer_choice_id;
            }

            public final Data copy(String answer_choice_key, String answer_choice_short_name, String answer_choice_id) {
                Intrinsics.checkNotNullParameter(answer_choice_key, "answer_choice_key");
                Intrinsics.checkNotNullParameter(answer_choice_short_name, "answer_choice_short_name");
                Intrinsics.checkNotNullParameter(answer_choice_id, "answer_choice_id");
                return new Data(answer_choice_key, answer_choice_short_name, answer_choice_id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return Intrinsics.areEqual(this.answer_choice_key, data.answer_choice_key) && Intrinsics.areEqual(this.answer_choice_short_name, data.answer_choice_short_name) && Intrinsics.areEqual(this.answer_choice_id, data.answer_choice_id);
            }

            public int hashCode() {
                return (((this.answer_choice_key.hashCode() * 31) + this.answer_choice_short_name.hashCode()) * 31) + this.answer_choice_id.hashCode();
            }

            public String toString() {
                return "Data(answer_choice_key=" + this.answer_choice_key + ", answer_choice_short_name=" + this.answer_choice_short_name + ", answer_choice_id=" + this.answer_choice_id + ")";
            }

            public Data(String answer_choice_key, String answer_choice_short_name, String answer_choice_id) {
                Intrinsics.checkNotNullParameter(answer_choice_key, "answer_choice_key");
                Intrinsics.checkNotNullParameter(answer_choice_short_name, "answer_choice_short_name");
                Intrinsics.checkNotNullParameter(answer_choice_id, "answer_choice_id");
                this.answer_choice_key = answer_choice_key;
                this.answer_choice_short_name = answer_choice_short_name;
                this.answer_choice_id = answer_choice_id;
            }

            public final String getAnswer_choice_key() {
                return this.answer_choice_key;
            }

            public final String getAnswer_choice_short_name() {
                return this.answer_choice_short_name;
            }

            public final String getAnswer_choice_id() {
                return this.answer_choice_id;
            }
        }
    }

    /* compiled from: ApiSummaryAnswerContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntegerContent extends ApiSummaryAnswerContent {
        private final Data data;

        public static /* synthetic */ IntegerContent copy$default(IntegerContent integerContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = integerContent.data;
            }
            return integerContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final IntegerContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new IntegerContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegerContent) && Intrinsics.areEqual(this.data, ((IntegerContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IntegerContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiSummaryAnswerContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$IntegerContent$Data;", "", "answer", "", "<init>", "(I)V", "getAnswer", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final int answer;

            public static /* synthetic */ Data copy$default(Data data, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = data.answer;
                }
                return data.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getAnswer() {
                return this.answer;
            }

            public final Data copy(int answer) {
                return new Data(answer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && this.answer == ((Data) other).answer;
            }

            public int hashCode() {
                return Integer.hashCode(this.answer);
            }

            public String toString() {
                return "Data(answer=" + this.answer + ")";
            }

            public Data(int i) {
                this.answer = i;
            }

            public final int getAnswer() {
                return this.answer;
            }
        }
    }

    /* compiled from: ApiSummaryAnswerContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StringContent extends ApiSummaryAnswerContent {
        private final Data data;

        public static /* synthetic */ StringContent copy$default(StringContent stringContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = stringContent.data;
            }
            return stringContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final StringContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new StringContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringContent) && Intrinsics.areEqual(this.data, ((StringContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "StringContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiSummaryAnswerContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$StringContent$Data;", "", "answer_text", "", "<init>", "(Ljava/lang/String;)V", "getAnswer_text", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final String answer_text;

            public static /* synthetic */ Data copy$default(Data data, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = data.answer_text;
                }
                return data.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAnswer_text() {
                return this.answer_text;
            }

            public final Data copy(String answer_text) {
                Intrinsics.checkNotNullParameter(answer_text, "answer_text");
                return new Data(answer_text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && Intrinsics.areEqual(this.answer_text, ((Data) other).answer_text);
            }

            public int hashCode() {
                return this.answer_text.hashCode();
            }

            public String toString() {
                return "Data(answer_text=" + this.answer_text + ")";
            }

            public Data(String answer_text) {
                Intrinsics.checkNotNullParameter(answer_text, "answer_text");
                this.answer_text = answer_text;
            }

            public final String getAnswer_text() {
                return this.answer_text;
            }
        }
    }

    /* compiled from: ApiSummaryAnswerContent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$Unsupported;", "Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AdapterModule", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unsupported extends ApiSummaryAnswerContent {
        public static final Unsupported INSTANCE = new Unsupported();

        public boolean equals(Object other) {
            return this == other || (other instanceof Unsupported);
        }

        public int hashCode() {
            return -575480413;
        }

        public String toString() {
            return "Unsupported";
        }

        private Unsupported() {
            super(null);
        }

        /* compiled from: ApiSummaryAnswerContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$Unsupported$AdapterModule;", "", "<init>", "()V", "provideAdapter", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class AdapterModule {
            public static final AdapterModule INSTANCE = new AdapterModule();

            private AdapterModule() {
            }

            public final JsonAdapterBinding provideAdapter() {
                JsonAdapterBinding.Companion companion = JsonAdapterBinding.INSTANCE;
                return new JsonAdapterBinding(Unsupported.class, new ObjectJsonAdapter(Unsupported.INSTANCE));
            }
        }
    }

    /* compiled from: ApiSummaryAnswerContent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithDefaultValue = PolymorphicJsonAdapterFactory.m3154of(ApiSummaryAnswerContent.class, "type").withSubtype(MultipleChoiceContent.class, QuestionType.MULTIPLE_CHOICE.getServerValue()).withSubtype(IntegerContent.class, QuestionType.INTEGER_QUESTION.getServerValue()).withSubtype(StringContent.class, QuestionType.STRING_QUESTION.getServerValue()).withDefaultValue(Unsupported.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithDefaultValue, "withDefaultValue(...)");
            return polymorphicJsonAdapterFactoryWithDefaultValue;
        }
    }
}
