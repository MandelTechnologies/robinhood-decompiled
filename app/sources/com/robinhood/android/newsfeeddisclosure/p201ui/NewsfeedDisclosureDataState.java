package com.robinhood.android.newsfeeddisclosure.p201ui;

import com.robinhood.models.p355ui.UiExpandableContent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState;", "", "result", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState$Result;", "content", "Lcom/robinhood/models/ui/UiExpandableContent;", "<init>", "(Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState$Result;Lcom/robinhood/models/ui/UiExpandableContent;)V", "getResult", "()Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState$Result;", "getContent", "()Lcom/robinhood/models/ui/UiExpandableContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Result", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewsfeedDisclosureDataState {
    public static final int $stable = 8;
    private final UiExpandableContent content;
    private final Result result;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedDisclosureDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewsfeedDisclosureDataState copy$default(NewsfeedDisclosureDataState newsfeedDisclosureDataState, Result result, UiExpandableContent uiExpandableContent, int i, Object obj) {
        if ((i & 1) != 0) {
            result = newsfeedDisclosureDataState.result;
        }
        if ((i & 2) != 0) {
            uiExpandableContent = newsfeedDisclosureDataState.content;
        }
        return newsfeedDisclosureDataState.copy(result, uiExpandableContent);
    }

    /* renamed from: component1, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final UiExpandableContent getContent() {
        return this.content;
    }

    public final NewsfeedDisclosureDataState copy(Result result, UiExpandableContent content) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new NewsfeedDisclosureDataState(result, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsfeedDisclosureDataState)) {
            return false;
        }
        NewsfeedDisclosureDataState newsfeedDisclosureDataState = (NewsfeedDisclosureDataState) other;
        return this.result == newsfeedDisclosureDataState.result && Intrinsics.areEqual(this.content, newsfeedDisclosureDataState.content);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        UiExpandableContent uiExpandableContent = this.content;
        return iHashCode + (uiExpandableContent == null ? 0 : uiExpandableContent.hashCode());
    }

    public String toString() {
        return "NewsfeedDisclosureDataState(result=" + this.result + ", content=" + this.content + ")";
    }

    public NewsfeedDisclosureDataState(Result result, UiExpandableContent uiExpandableContent) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.content = uiExpandableContent;
    }

    public /* synthetic */ NewsfeedDisclosureDataState(Result result, UiExpandableContent uiExpandableContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Result.LOADING : result, (i & 2) != 0 ? null : uiExpandableContent);
    }

    public final Result getResult() {
        return this.result;
    }

    public final UiExpandableContent getContent() {
        return this.content;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedDisclosureDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDataState$Result;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "SUCCESS", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result LOADING = new Result("LOADING", 0);
        public static final Result ERROR = new Result("ERROR", 1);
        public static final Result SUCCESS = new Result("SUCCESS", 2);

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{LOADING, ERROR, SUCCESS};
        }

        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i) {
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }
}
