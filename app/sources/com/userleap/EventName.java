package com.userleap;

import androidx.annotation.Keep;
import com.singular.sdk.internal.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Keep
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/userleap/EventName;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;I)V", "Companion", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "QUESTION_ANSWERED", "SDK_READY", "VISITOR_ID_UPDATED", "SURVEY_DIMENSIONS", "SURVEY_HEIGHT", "SURVEY_WILL_PRESENT", "SURVEY_PRESENTED", "SURVEY_APPEARED", "SURVEY_WILL_CLOSE", "SURVEY_CLOSED", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* loaded from: classes21.dex */
public enum EventName {
    QUESTION_ANSWERED { // from class: com.userleap.EventName.b

        /* renamed from: a, reason: from kotlin metadata */
        private final String value = "question.answered";

        @Override // com.userleap.EventName
        public String getValue() {
            return this.value;
        }
    },
    SDK_READY,
    VISITOR_ID_UPDATED,
    SURVEY_DIMENSIONS,
    SURVEY_HEIGHT,
    SURVEY_WILL_PRESENT,
    SURVEY_PRESENTED,
    SURVEY_APPEARED,
    SURVEY_WILL_CLOSE,
    SURVEY_CLOSED;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m3636d2 = {"Lcom/userleap/EventName$a;", "", "", "name", "Lcom/userleap/EventName;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: com.userleap.EventName$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EventName m3204a(String name) {
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                Result.Companion companion = Result.INSTANCE;
                String upperCase = StringsKt.replace$default(name, '.', '_', false, 4, (Object) null).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objM28550constructorimpl = Result.m28550constructorimpl(EventName.valueOf(upperCase));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            return (EventName) objM28550constructorimpl;
        }
    }

    EventName() {
        this.value = "Sprig.UPDATES." + name();
    }

    /* synthetic */ EventName(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String getValue() {
        return this.value;
    }
}
