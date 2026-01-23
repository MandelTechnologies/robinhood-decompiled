package com.robinhood.staticcontent.model.safetylabelslesson;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiSafetyLabelsLessonSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/safetylabelslesson/ContentType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "TEXT_CONTENT", "SLIDES", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.staticcontent.model.safetylabelslesson.ContentType, reason: use source file name */
/* loaded from: classes12.dex */
public final class ApiSafetyLabelsLessonSection2 implements RhEnum<ApiSafetyLabelsLessonSection2> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApiSafetyLabelsLessonSection2[] $VALUES;
    private final String serverValue;
    public static final ApiSafetyLabelsLessonSection2 TEXT_CONTENT = new ApiSafetyLabelsLessonSection2("TEXT_CONTENT", 0, "textContent");
    public static final ApiSafetyLabelsLessonSection2 SLIDES = new ApiSafetyLabelsLessonSection2("SLIDES", 1, "slides");

    private static final /* synthetic */ ApiSafetyLabelsLessonSection2[] $values() {
        return new ApiSafetyLabelsLessonSection2[]{TEXT_CONTENT, SLIDES};
    }

    public static EnumEntries<ApiSafetyLabelsLessonSection2> getEntries() {
        return $ENTRIES;
    }

    private ApiSafetyLabelsLessonSection2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ApiSafetyLabelsLessonSection2[] apiSafetyLabelsLessonSection2Arr$values = $values();
        $VALUES = apiSafetyLabelsLessonSection2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(apiSafetyLabelsLessonSection2Arr$values);
        INSTANCE = new Companion(null);
    }

    public static ApiSafetyLabelsLessonSection2 valueOf(String str) {
        return (ApiSafetyLabelsLessonSection2) Enum.valueOf(ApiSafetyLabelsLessonSection2.class, str);
    }

    public static ApiSafetyLabelsLessonSection2[] values() {
        return (ApiSafetyLabelsLessonSection2[]) $VALUES.clone();
    }
}
