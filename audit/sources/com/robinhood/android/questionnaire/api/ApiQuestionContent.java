package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.p220ui.UiGraphRedirect;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiQuestionContent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", "", "<init>", "()V", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "MultipleChoiceContent", "MultipleResponseContent", "HybridContent", "IntegerContent", "StringContent", "OptionalIntegerContent", "Unsupported", "AdapterModule", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$Unsupported;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class ApiQuestionContent {
    public /* synthetic */ ApiQuestionContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UiQuestionContent toUiModel();

    private ApiQuestionContent() {
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultipleChoiceContent extends ApiQuestionContent {
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

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Data;", "", "answer_choices", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Answer;", "<init>", "(Ljava/util/List;)V", "getAnswer_choices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final List<Answer> answer_choices;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = data.answer_choices;
                }
                return data.copy(list);
            }

            public final List<Answer> component1() {
                return this.answer_choices;
            }

            public final Data copy(List<Answer> answer_choices) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                return new Data(answer_choices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && Intrinsics.areEqual(this.answer_choices, ((Data) other).answer_choices);
            }

            public int hashCode() {
                return this.answer_choices.hashCode();
            }

            public String toString() {
                return "Data(answer_choices=" + this.answer_choices + ")";
            }

            public Data(List<Answer> answer_choices) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                this.answer_choices = answer_choices;
            }

            public final List<Answer> getAnswer_choices() {
                return this.answer_choices;
            }
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleChoiceContent$Answer;", "", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graph_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraph_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Answer {
            private final ApiGraphRedirect graph_redirect;
            private final UUID id;
            private final String key;
            private final String subtitle;
            private final String title;

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, ApiGraphRedirect apiGraphRedirect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    apiGraphRedirect = answer.graph_redirect;
                }
                ApiGraphRedirect apiGraphRedirect2 = apiGraphRedirect;
                String str4 = str2;
                return answer.copy(uuid, str, str4, str3, apiGraphRedirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, ApiGraphRedirect graph_redirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graph_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graph_redirect, answer.graph_redirect);
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_redirect;
                return iHashCode + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graph_redirect=" + this.graph_redirect + ")";
            }

            public Answer(UUID id, String title, String subtitle, String key, ApiGraphRedirect apiGraphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graph_redirect = apiGraphRedirect;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.MultipleChoiceContent toUiModel() {
            List<Answer> answer_choices = this.data.getAnswer_choices();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(answer_choices, 10));
            for (Answer answer : answer_choices) {
                UUID id = answer.getId();
                String title = answer.getTitle();
                String subtitle = answer.getSubtitle();
                String key = answer.getKey();
                ApiGraphRedirect graph_redirect = answer.getGraph_redirect();
                arrayList.add(new UiQuestionContent.MultipleChoiceContent.Answer(id, title, subtitle, key, graph_redirect != null ? graph_redirect.toUiModel() : null));
            }
            return new UiQuestionContent.MultipleChoiceContent(arrayList);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultipleResponseContent extends ApiQuestionContent {
        private final Data data;

        public static /* synthetic */ MultipleResponseContent copy$default(MultipleResponseContent multipleResponseContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = multipleResponseContent.data;
            }
            return multipleResponseContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final MultipleResponseContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new MultipleResponseContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleResponseContent) && Intrinsics.areEqual(this.data, ((MultipleResponseContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "MultipleResponseContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleResponseContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Data;", "", "answer_choices", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Answer;", "<init>", "(Ljava/util/List;)V", "getAnswer_choices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final List<Answer> answer_choices;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = data.answer_choices;
                }
                return data.copy(list);
            }

            public final List<Answer> component1() {
                return this.answer_choices;
            }

            public final Data copy(List<Answer> answer_choices) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                return new Data(answer_choices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && Intrinsics.areEqual(this.answer_choices, ((Data) other).answer_choices);
            }

            public int hashCode() {
                return this.answer_choices.hashCode();
            }

            public String toString() {
                return "Data(answer_choices=" + this.answer_choices + ")";
            }

            public Data(List<Answer> answer_choices) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                this.answer_choices = answer_choices;
            }

            public final List<Answer> getAnswer_choices() {
                return this.answer_choices;
            }
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$MultipleResponseContent$Answer;", "", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graph_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraph_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Answer {
            private final ApiGraphRedirect graph_redirect;
            private final UUID id;
            private final String key;
            private final String subtitle;
            private final String title;

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, ApiGraphRedirect apiGraphRedirect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    apiGraphRedirect = answer.graph_redirect;
                }
                ApiGraphRedirect apiGraphRedirect2 = apiGraphRedirect;
                String str4 = str2;
                return answer.copy(uuid, str, str4, str3, apiGraphRedirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, ApiGraphRedirect graph_redirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graph_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graph_redirect, answer.graph_redirect);
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_redirect;
                return iHashCode + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graph_redirect=" + this.graph_redirect + ")";
            }

            public Answer(UUID id, String title, String subtitle, String key, ApiGraphRedirect apiGraphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graph_redirect = apiGraphRedirect;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.MultipleResponseContent toUiModel() {
            List<Answer> answer_choices = this.data.getAnswer_choices();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(answer_choices, 10));
            for (Answer answer : answer_choices) {
                UUID id = answer.getId();
                String title = answer.getTitle();
                String subtitle = answer.getSubtitle();
                String key = answer.getKey();
                ApiGraphRedirect graph_redirect = answer.getGraph_redirect();
                arrayList.add(new UiQuestionContent.MultipleResponseContent.Answer(id, title, subtitle, key, graph_redirect != null ? graph_redirect.toUiModel() : null));
            }
            return new UiQuestionContent.MultipleResponseContent(arrayList);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes11.dex */
    public static final /* data */ class HybridContent extends ApiQuestionContent {
        private final Data data;

        public static /* synthetic */ HybridContent copy$default(HybridContent hybridContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = hybridContent.data;
            }
            return hybridContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final HybridContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new HybridContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HybridContent) && Intrinsics.areEqual(this.data, ((HybridContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "HybridContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HybridContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Data;", "", "answer_choices", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Answer;", "max_length", "", "placeholder", "", "graph_default_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "<init>", "(Ljava/util/List;ILjava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getAnswer_choices", "()Ljava/util/List;", "getMax_length", "()I", "getPlaceholder", "()Ljava/lang/String;", "getGraph_default_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Data {
            private final List<Answer> answer_choices;
            private final ApiGraphRedirect graph_default_redirect;
            private final int max_length;
            private final String placeholder;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, int i, String str, ApiGraphRedirect apiGraphRedirect, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    list = data.answer_choices;
                }
                if ((i2 & 2) != 0) {
                    i = data.max_length;
                }
                if ((i2 & 4) != 0) {
                    str = data.placeholder;
                }
                if ((i2 & 8) != 0) {
                    apiGraphRedirect = data.graph_default_redirect;
                }
                return data.copy(list, i, str, apiGraphRedirect);
            }

            public final List<Answer> component1() {
                return this.answer_choices;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMax_length() {
                return this.max_length;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component4, reason: from getter */
            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }

            public final Data copy(List<Answer> answer_choices, int max_length, String placeholder, ApiGraphRedirect graph_default_redirect) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                return new Data(answer_choices, max_length, placeholder, graph_default_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return Intrinsics.areEqual(this.answer_choices, data.answer_choices) && this.max_length == data.max_length && Intrinsics.areEqual(this.placeholder, data.placeholder) && Intrinsics.areEqual(this.graph_default_redirect, data.graph_default_redirect);
            }

            public int hashCode() {
                int iHashCode = ((((this.answer_choices.hashCode() * 31) + Integer.hashCode(this.max_length)) * 31) + this.placeholder.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_default_redirect;
                return iHashCode + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Data(answer_choices=" + this.answer_choices + ", max_length=" + this.max_length + ", placeholder=" + this.placeholder + ", graph_default_redirect=" + this.graph_default_redirect + ")";
            }

            public Data(List<Answer> answer_choices, int i, String placeholder, ApiGraphRedirect apiGraphRedirect) {
                Intrinsics.checkNotNullParameter(answer_choices, "answer_choices");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.answer_choices = answer_choices;
                this.max_length = i;
                this.placeholder = placeholder;
                this.graph_default_redirect = apiGraphRedirect;
            }

            public final List<Answer> getAnswer_choices() {
                return this.answer_choices;
            }

            public final int getMax_length() {
                return this.max_length;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$HybridContent$Answer;", "", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graph_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "is_hybrid_response", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;Z)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraph_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Answer {
            private final ApiGraphRedirect graph_redirect;
            private final UUID id;
            private final boolean is_hybrid_response;
            private final String key;
            private final String subtitle;
            private final String title;

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, ApiGraphRedirect apiGraphRedirect, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    apiGraphRedirect = answer.graph_redirect;
                }
                if ((i & 32) != 0) {
                    z = answer.is_hybrid_response;
                }
                ApiGraphRedirect apiGraphRedirect2 = apiGraphRedirect;
                boolean z2 = z;
                return answer.copy(uuid, str, str2, str3, apiGraphRedirect2, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getIs_hybrid_response() {
                return this.is_hybrid_response;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, ApiGraphRedirect graph_redirect, boolean is_hybrid_response) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graph_redirect, is_hybrid_response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graph_redirect, answer.graph_redirect) && this.is_hybrid_response == answer.is_hybrid_response;
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_redirect;
                return ((iHashCode + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode())) * 31) + Boolean.hashCode(this.is_hybrid_response);
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graph_redirect=" + this.graph_redirect + ", is_hybrid_response=" + this.is_hybrid_response + ")";
            }

            public Answer(UUID id, String title, String subtitle, String key, ApiGraphRedirect apiGraphRedirect, boolean z) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graph_redirect = apiGraphRedirect;
                this.is_hybrid_response = z;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final ApiGraphRedirect getGraph_redirect() {
                return this.graph_redirect;
            }

            public final boolean is_hybrid_response() {
                return this.is_hybrid_response;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.HybridContent toUiModel() {
            List<Answer> answer_choices = this.data.getAnswer_choices();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(answer_choices, 10));
            Iterator<T> it = answer_choices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Answer answer = (Answer) it.next();
                UUID id = answer.getId();
                String title = answer.getTitle();
                String subtitle = answer.getSubtitle();
                String key = answer.getKey();
                ApiGraphRedirect graph_redirect = answer.getGraph_redirect();
                if (graph_redirect != null) {
                    uiModel = graph_redirect.toUiModel();
                }
                arrayList.add(new UiQuestionContent.HybridContent.Answer(id, title, subtitle, key, uiModel, answer.is_hybrid_response()));
            }
            int max_length = this.data.getMax_length();
            String placeholder = this.data.getPlaceholder();
            ApiGraphRedirect graph_default_redirect = this.data.getGraph_default_redirect();
            return new UiQuestionContent.HybridContent(arrayList, max_length, placeholder, graph_default_redirect != null ? graph_default_redirect.toUiModel() : null);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntegerContent extends ApiQuestionContent {
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

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent$Data;", "", "min_value", "", "max_value", "placeholder", "", "default_value", "below_min_value_alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "above_max_value_alert", "graph_default_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getMin_value", "()I", "getMax_value", "getPlaceholder", "()Ljava/lang/String;", "getDefault_value", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBelow_min_value_alert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAbove_max_value_alert", "getGraph_default_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$IntegerContent$Data;", "equals", "", "other", "hashCode", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final GenericAlertContent<GenericAction> above_max_value_alert;
            private final GenericAlertContent<GenericAction> below_min_value_alert;
            private final Integer default_value;
            private final ApiGraphRedirect graph_default_redirect;
            private final int max_value;
            private final int min_value;
            private final String placeholder;

            public static /* synthetic */ Data copy$default(Data data, int i, int i2, String str, Integer num, GenericAlertContent genericAlertContent, GenericAlertContent genericAlertContent2, ApiGraphRedirect apiGraphRedirect, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = data.min_value;
                }
                if ((i3 & 2) != 0) {
                    i2 = data.max_value;
                }
                if ((i3 & 4) != 0) {
                    str = data.placeholder;
                }
                if ((i3 & 8) != 0) {
                    num = data.default_value;
                }
                if ((i3 & 16) != 0) {
                    genericAlertContent = data.below_min_value_alert;
                }
                if ((i3 & 32) != 0) {
                    genericAlertContent2 = data.above_max_value_alert;
                }
                if ((i3 & 64) != 0) {
                    apiGraphRedirect = data.graph_default_redirect;
                }
                GenericAlertContent genericAlertContent3 = genericAlertContent2;
                ApiGraphRedirect apiGraphRedirect2 = apiGraphRedirect;
                GenericAlertContent genericAlertContent4 = genericAlertContent;
                String str2 = str;
                return data.copy(i, i2, str2, num, genericAlertContent4, genericAlertContent3, apiGraphRedirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMin_value() {
                return this.min_value;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMax_value() {
                return this.max_value;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getDefault_value() {
                return this.default_value;
            }

            public final GenericAlertContent<GenericAction> component5() {
                return this.below_min_value_alert;
            }

            public final GenericAlertContent<GenericAction> component6() {
                return this.above_max_value_alert;
            }

            /* renamed from: component7, reason: from getter */
            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }

            public final Data copy(int min_value, int max_value, String placeholder, Integer default_value, GenericAlertContent<? extends GenericAction> below_min_value_alert, GenericAlertContent<? extends GenericAction> above_max_value_alert, ApiGraphRedirect graph_default_redirect) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(below_min_value_alert, "below_min_value_alert");
                Intrinsics.checkNotNullParameter(above_max_value_alert, "above_max_value_alert");
                return new Data(min_value, max_value, placeholder, default_value, below_min_value_alert, above_max_value_alert, graph_default_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return this.min_value == data.min_value && this.max_value == data.max_value && Intrinsics.areEqual(this.placeholder, data.placeholder) && Intrinsics.areEqual(this.default_value, data.default_value) && Intrinsics.areEqual(this.below_min_value_alert, data.below_min_value_alert) && Intrinsics.areEqual(this.above_max_value_alert, data.above_max_value_alert) && Intrinsics.areEqual(this.graph_default_redirect, data.graph_default_redirect);
            }

            public int hashCode() {
                int iHashCode = ((((Integer.hashCode(this.min_value) * 31) + Integer.hashCode(this.max_value)) * 31) + this.placeholder.hashCode()) * 31;
                Integer num = this.default_value;
                int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.below_min_value_alert.hashCode()) * 31) + this.above_max_value_alert.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_default_redirect;
                return iHashCode2 + (apiGraphRedirect != null ? apiGraphRedirect.hashCode() : 0);
            }

            public String toString() {
                return "Data(min_value=" + this.min_value + ", max_value=" + this.max_value + ", placeholder=" + this.placeholder + ", default_value=" + this.default_value + ", below_min_value_alert=" + this.below_min_value_alert + ", above_max_value_alert=" + this.above_max_value_alert + ", graph_default_redirect=" + this.graph_default_redirect + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data(int i, int i2, String placeholder, Integer num, GenericAlertContent<? extends GenericAction> below_min_value_alert, GenericAlertContent<? extends GenericAction> above_max_value_alert, ApiGraphRedirect apiGraphRedirect) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(below_min_value_alert, "below_min_value_alert");
                Intrinsics.checkNotNullParameter(above_max_value_alert, "above_max_value_alert");
                this.min_value = i;
                this.max_value = i2;
                this.placeholder = placeholder;
                this.default_value = num;
                this.below_min_value_alert = below_min_value_alert;
                this.above_max_value_alert = above_max_value_alert;
                this.graph_default_redirect = apiGraphRedirect;
            }

            public final int getMin_value() {
                return this.min_value;
            }

            public final int getMax_value() {
                return this.max_value;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Integer getDefault_value() {
                return this.default_value;
            }

            public final GenericAlertContent<GenericAction> getBelow_min_value_alert() {
                return this.below_min_value_alert;
            }

            public final GenericAlertContent<GenericAction> getAbove_max_value_alert() {
                return this.above_max_value_alert;
            }

            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.IntegerContent toUiModel() {
            int min_value = this.data.getMin_value();
            int max_value = this.data.getMax_value();
            String placeholder = this.data.getPlaceholder();
            Integer default_value = this.data.getDefault_value();
            GenericAlertContent<GenericAction> below_min_value_alert = this.data.getBelow_min_value_alert();
            GenericAlertContent<GenericAction> above_max_value_alert = this.data.getAbove_max_value_alert();
            ApiGraphRedirect graph_default_redirect = this.data.getGraph_default_redirect();
            return new UiQuestionContent.IntegerContent(min_value, max_value, placeholder, default_value, below_min_value_alert, above_max_value_alert, graph_default_redirect != null ? graph_default_redirect.toUiModel() : null);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StringContent extends ApiQuestionContent {
        private final Data data;

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$StringContent$Data;", "", "max_length", "", "placeholder", "", "graph_default_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "<init>", "(ILjava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getMax_length", "()I", "getPlaceholder", "()Ljava/lang/String;", "getGraph_default_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final ApiGraphRedirect graph_default_redirect;
            private final int max_length;
            private final String placeholder;

            public static /* synthetic */ Data copy$default(Data data, int i, String str, ApiGraphRedirect apiGraphRedirect, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = data.max_length;
                }
                if ((i2 & 2) != 0) {
                    str = data.placeholder;
                }
                if ((i2 & 4) != 0) {
                    apiGraphRedirect = data.graph_default_redirect;
                }
                return data.copy(i, str, apiGraphRedirect);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMax_length() {
                return this.max_length;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component3, reason: from getter */
            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }

            public final Data copy(int max_length, String placeholder, ApiGraphRedirect graph_default_redirect) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                return new Data(max_length, placeholder, graph_default_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return this.max_length == data.max_length && Intrinsics.areEqual(this.placeholder, data.placeholder) && Intrinsics.areEqual(this.graph_default_redirect, data.graph_default_redirect);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.max_length) * 31) + this.placeholder.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_default_redirect;
                return iHashCode + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Data(max_length=" + this.max_length + ", placeholder=" + this.placeholder + ", graph_default_redirect=" + this.graph_default_redirect + ")";
            }

            public Data(int i, String placeholder, ApiGraphRedirect apiGraphRedirect) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.max_length = i;
                this.placeholder = placeholder;
                this.graph_default_redirect = apiGraphRedirect;
            }

            public final int getMax_length() {
                return this.max_length;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final ApiGraphRedirect getGraph_default_redirect() {
                return this.graph_default_redirect;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.StringContent toUiModel() {
            int max_length = this.data.getMax_length();
            String placeholder = this.data.getPlaceholder();
            ApiGraphRedirect graph_default_redirect = this.data.getGraph_default_redirect();
            return new UiQuestionContent.StringContent(max_length, placeholder, graph_default_redirect != null ? graph_default_redirect.toUiModel() : null);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;)V", "getData", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionalIntegerContent extends ApiQuestionContent {
        private final Data data;

        public static /* synthetic */ OptionalIntegerContent copy$default(OptionalIntegerContent optionalIntegerContent, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = optionalIntegerContent.data;
            }
            return optionalIntegerContent.copy(data);
        }

        /* renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final OptionalIntegerContent copy(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new OptionalIntegerContent(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionalIntegerContent) && Intrinsics.areEqual(this.data, ((OptionalIntegerContent) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "OptionalIntegerContent(data=" + this.data + ")";
        }

        public final Data getData() {
            return this.data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionalIntegerContent(Data data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        /* compiled from: ApiQuestionContent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u008e\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;", "", "min_value", "", "max_value", "placeholder", "", "default_value", "below_min_value_alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "above_max_value_alert", "checkbox_label", "none_render_value", "checkbox_logging_identifier", "graph_checked_redirect", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "graph_unchecked_redirect", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)V", "getMin_value", "()I", "getMax_value", "getPlaceholder", "()Ljava/lang/String;", "getDefault_value", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBelow_min_value_alert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAbove_max_value_alert", "getCheckbox_label", "getNone_render_value", "getCheckbox_logging_identifier", "getGraph_checked_redirect", "()Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "getGraph_unchecked_redirect", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;)Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;", "equals", "", "other", "hashCode", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Data {
            private final GenericAlertContent<GenericAction> above_max_value_alert;
            private final GenericAlertContent<GenericAction> below_min_value_alert;
            private final String checkbox_label;
            private final String checkbox_logging_identifier;
            private final Integer default_value;
            private final ApiGraphRedirect graph_checked_redirect;
            private final ApiGraphRedirect graph_unchecked_redirect;
            private final int max_value;
            private final int min_value;
            private final String none_render_value;
            private final String placeholder;

            public static /* synthetic */ Data copy$default(Data data, int i, int i2, String str, Integer num, GenericAlertContent genericAlertContent, GenericAlertContent genericAlertContent2, String str2, String str3, String str4, ApiGraphRedirect apiGraphRedirect, ApiGraphRedirect apiGraphRedirect2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = data.min_value;
                }
                if ((i3 & 2) != 0) {
                    i2 = data.max_value;
                }
                if ((i3 & 4) != 0) {
                    str = data.placeholder;
                }
                if ((i3 & 8) != 0) {
                    num = data.default_value;
                }
                if ((i3 & 16) != 0) {
                    genericAlertContent = data.below_min_value_alert;
                }
                if ((i3 & 32) != 0) {
                    genericAlertContent2 = data.above_max_value_alert;
                }
                if ((i3 & 64) != 0) {
                    str2 = data.checkbox_label;
                }
                if ((i3 & 128) != 0) {
                    str3 = data.none_render_value;
                }
                if ((i3 & 256) != 0) {
                    str4 = data.checkbox_logging_identifier;
                }
                if ((i3 & 512) != 0) {
                    apiGraphRedirect = data.graph_checked_redirect;
                }
                if ((i3 & 1024) != 0) {
                    apiGraphRedirect2 = data.graph_unchecked_redirect;
                }
                ApiGraphRedirect apiGraphRedirect3 = apiGraphRedirect;
                ApiGraphRedirect apiGraphRedirect4 = apiGraphRedirect2;
                String str5 = str3;
                String str6 = str4;
                GenericAlertContent genericAlertContent3 = genericAlertContent2;
                String str7 = str2;
                GenericAlertContent genericAlertContent4 = genericAlertContent;
                String str8 = str;
                return data.copy(i, i2, str8, num, genericAlertContent4, genericAlertContent3, str7, str5, str6, apiGraphRedirect3, apiGraphRedirect4);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMin_value() {
                return this.min_value;
            }

            /* renamed from: component10, reason: from getter */
            public final ApiGraphRedirect getGraph_checked_redirect() {
                return this.graph_checked_redirect;
            }

            /* renamed from: component11, reason: from getter */
            public final ApiGraphRedirect getGraph_unchecked_redirect() {
                return this.graph_unchecked_redirect;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMax_value() {
                return this.max_value;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getDefault_value() {
                return this.default_value;
            }

            public final GenericAlertContent<GenericAction> component5() {
                return this.below_min_value_alert;
            }

            public final GenericAlertContent<GenericAction> component6() {
                return this.above_max_value_alert;
            }

            /* renamed from: component7, reason: from getter */
            public final String getCheckbox_label() {
                return this.checkbox_label;
            }

            /* renamed from: component8, reason: from getter */
            public final String getNone_render_value() {
                return this.none_render_value;
            }

            /* renamed from: component9, reason: from getter */
            public final String getCheckbox_logging_identifier() {
                return this.checkbox_logging_identifier;
            }

            public final Data copy(int min_value, int max_value, String placeholder, Integer default_value, GenericAlertContent<? extends GenericAction> below_min_value_alert, GenericAlertContent<? extends GenericAction> above_max_value_alert, String checkbox_label, String none_render_value, String checkbox_logging_identifier, ApiGraphRedirect graph_checked_redirect, ApiGraphRedirect graph_unchecked_redirect) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(below_min_value_alert, "below_min_value_alert");
                Intrinsics.checkNotNullParameter(above_max_value_alert, "above_max_value_alert");
                Intrinsics.checkNotNullParameter(checkbox_label, "checkbox_label");
                Intrinsics.checkNotNullParameter(none_render_value, "none_render_value");
                Intrinsics.checkNotNullParameter(checkbox_logging_identifier, "checkbox_logging_identifier");
                return new Data(min_value, max_value, placeholder, default_value, below_min_value_alert, above_max_value_alert, checkbox_label, none_render_value, checkbox_logging_identifier, graph_checked_redirect, graph_unchecked_redirect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return this.min_value == data.min_value && this.max_value == data.max_value && Intrinsics.areEqual(this.placeholder, data.placeholder) && Intrinsics.areEqual(this.default_value, data.default_value) && Intrinsics.areEqual(this.below_min_value_alert, data.below_min_value_alert) && Intrinsics.areEqual(this.above_max_value_alert, data.above_max_value_alert) && Intrinsics.areEqual(this.checkbox_label, data.checkbox_label) && Intrinsics.areEqual(this.none_render_value, data.none_render_value) && Intrinsics.areEqual(this.checkbox_logging_identifier, data.checkbox_logging_identifier) && Intrinsics.areEqual(this.graph_checked_redirect, data.graph_checked_redirect) && Intrinsics.areEqual(this.graph_unchecked_redirect, data.graph_unchecked_redirect);
            }

            public int hashCode() {
                int iHashCode = ((((Integer.hashCode(this.min_value) * 31) + Integer.hashCode(this.max_value)) * 31) + this.placeholder.hashCode()) * 31;
                Integer num = this.default_value;
                int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.below_min_value_alert.hashCode()) * 31) + this.above_max_value_alert.hashCode()) * 31) + this.checkbox_label.hashCode()) * 31) + this.none_render_value.hashCode()) * 31) + this.checkbox_logging_identifier.hashCode()) * 31;
                ApiGraphRedirect apiGraphRedirect = this.graph_checked_redirect;
                int iHashCode3 = (iHashCode2 + (apiGraphRedirect == null ? 0 : apiGraphRedirect.hashCode())) * 31;
                ApiGraphRedirect apiGraphRedirect2 = this.graph_unchecked_redirect;
                return iHashCode3 + (apiGraphRedirect2 != null ? apiGraphRedirect2.hashCode() : 0);
            }

            public String toString() {
                return "Data(min_value=" + this.min_value + ", max_value=" + this.max_value + ", placeholder=" + this.placeholder + ", default_value=" + this.default_value + ", below_min_value_alert=" + this.below_min_value_alert + ", above_max_value_alert=" + this.above_max_value_alert + ", checkbox_label=" + this.checkbox_label + ", none_render_value=" + this.none_render_value + ", checkbox_logging_identifier=" + this.checkbox_logging_identifier + ", graph_checked_redirect=" + this.graph_checked_redirect + ", graph_unchecked_redirect=" + this.graph_unchecked_redirect + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data(int i, int i2, String placeholder, Integer num, GenericAlertContent<? extends GenericAction> below_min_value_alert, GenericAlertContent<? extends GenericAction> above_max_value_alert, String checkbox_label, String none_render_value, String checkbox_logging_identifier, ApiGraphRedirect apiGraphRedirect, ApiGraphRedirect apiGraphRedirect2) {
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(below_min_value_alert, "below_min_value_alert");
                Intrinsics.checkNotNullParameter(above_max_value_alert, "above_max_value_alert");
                Intrinsics.checkNotNullParameter(checkbox_label, "checkbox_label");
                Intrinsics.checkNotNullParameter(none_render_value, "none_render_value");
                Intrinsics.checkNotNullParameter(checkbox_logging_identifier, "checkbox_logging_identifier");
                this.min_value = i;
                this.max_value = i2;
                this.placeholder = placeholder;
                this.default_value = num;
                this.below_min_value_alert = below_min_value_alert;
                this.above_max_value_alert = above_max_value_alert;
                this.checkbox_label = checkbox_label;
                this.none_render_value = none_render_value;
                this.checkbox_logging_identifier = checkbox_logging_identifier;
                this.graph_checked_redirect = apiGraphRedirect;
                this.graph_unchecked_redirect = apiGraphRedirect2;
            }

            public final int getMin_value() {
                return this.min_value;
            }

            public final int getMax_value() {
                return this.max_value;
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Integer getDefault_value() {
                return this.default_value;
            }

            public final GenericAlertContent<GenericAction> getBelow_min_value_alert() {
                return this.below_min_value_alert;
            }

            public final GenericAlertContent<GenericAction> getAbove_max_value_alert() {
                return this.above_max_value_alert;
            }

            public final String getCheckbox_label() {
                return this.checkbox_label;
            }

            public final String getNone_render_value() {
                return this.none_render_value;
            }

            public final String getCheckbox_logging_identifier() {
                return this.checkbox_logging_identifier;
            }

            public final ApiGraphRedirect getGraph_checked_redirect() {
                return this.graph_checked_redirect;
            }

            public final ApiGraphRedirect getGraph_unchecked_redirect() {
                return this.graph_unchecked_redirect;
            }
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent toUiModel() {
            Data data = this.data;
            int min_value = data.getMin_value();
            int max_value = data.getMax_value();
            String placeholder = data.getPlaceholder();
            Integer default_value = data.getDefault_value();
            GenericAlertContent<GenericAction> below_min_value_alert = data.getBelow_min_value_alert();
            GenericAlertContent<GenericAction> above_max_value_alert = data.getAbove_max_value_alert();
            String checkbox_label = data.getCheckbox_label();
            String none_render_value = data.getNone_render_value();
            String checkbox_logging_identifier = data.getCheckbox_logging_identifier();
            ApiGraphRedirect graph_checked_redirect = this.data.getGraph_checked_redirect();
            UiGraphRedirect uiModel = graph_checked_redirect != null ? graph_checked_redirect.toUiModel() : null;
            ApiGraphRedirect graph_unchecked_redirect = this.data.getGraph_unchecked_redirect();
            return new UiQuestionContent.OptionalIntegerContent(min_value, max_value, placeholder, default_value, below_min_value_alert, above_max_value_alert, checkbox_label, none_render_value, checkbox_logging_identifier, uiModel, graph_unchecked_redirect != null ? graph_unchecked_redirect.toUiModel() : null);
        }
    }

    /* compiled from: ApiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$Unsupported;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent;", "<init>", "()V", "toUiModel", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$Unsupported;", "equals", "", "other", "", "hashCode", "", "toString", "", "AdapterModule", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unsupported extends ApiQuestionContent {
        public static final Unsupported INSTANCE = new Unsupported();

        public boolean equals(Object other) {
            return this == other || (other instanceof Unsupported);
        }

        public int hashCode() {
            return -2810157;
        }

        public String toString() {
            return "Unsupported";
        }

        private Unsupported() {
            super(null);
        }

        @Override // com.robinhood.android.questionnaire.api.ApiQuestionContent
        public UiQuestionContent.Unsupported toUiModel() {
            return UiQuestionContent.Unsupported.INSTANCE;
        }

        /* compiled from: ApiQuestionContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$Unsupported$AdapterModule;", "", "<init>", "()V", "provideAdapter", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: ApiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithDefaultValue = PolymorphicJsonAdapterFactory.m3154of(ApiQuestionContent.class, "type").withSubtype(MultipleChoiceContent.class, QuestionType.MULTIPLE_CHOICE.getServerValue()).withSubtype(MultipleResponseContent.class, QuestionType.MULTIPLE_RESPONSE.getServerValue()).withSubtype(IntegerContent.class, QuestionType.INTEGER_QUESTION.getServerValue()).withSubtype(StringContent.class, QuestionType.STRING_QUESTION.getServerValue()).withSubtype(OptionalIntegerContent.class, QuestionType.OPTIONAL_INTEGER.getServerValue()).withSubtype(HybridContent.class, QuestionType.HYBRID_STRING_RESPONSE.getServerValue()).withDefaultValue(Unsupported.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithDefaultValue, "withDefaultValue(...)");
            return polymorphicJsonAdapterFactoryWithDefaultValue;
        }
    }
}
