package com.robinhood.shared.education.p377ui.onboarding;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLearnAndEarnUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnUtils;", "", "<init>", "()V", "isCryptoLearnAndEarn", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "CRYPTO_KEYWORD", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoLearnAndEarnUtils {
    public static final int $stable = 0;
    private static final String CRYPTO_KEYWORD = "crypto";
    public static final CryptoLearnAndEarnUtils INSTANCE = new CryptoLearnAndEarnUtils();

    private CryptoLearnAndEarnUtils() {
    }

    public final boolean isCryptoLearnAndEarn(EducationLesson educationLesson) {
        Intrinsics.checkNotNullParameter(educationLesson, "<this>");
        return educationLesson.getKeywords().contains("crypto");
    }
}
