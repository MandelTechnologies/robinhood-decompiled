package com.robinhood.shared.education.targets;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: LearningLessonDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/targets/LearningLessonDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LearningLessonDeeplinkTarget extends DeeplinkTarget4 {
    public static final LearningLessonDeeplinkTarget INSTANCE = new LearningLessonDeeplinkTarget();
    public static final int $stable = 8;

    private LearningLessonDeeplinkTarget() {
        super("micro_learning_lesson", false, false, false, true, false, null, 102, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        FragmentKey educationLessonFragmentKeys2;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("contentId");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("version");
        Integer num = null;
        Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter3 == null) {
            queryParameter3 = "unknown";
        }
        if (queryParameter == null || intOrNull == null) {
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        if (intOrNull.intValue() != 3) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Education lesson version " + intOrNull + " is not supported"), false, null, 4, null);
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        EducationLesson.LessonTemplateType[] lessonTemplateTypeArrValues = EducationLesson.LessonTemplateType.values();
        ArrayList arrayList = new ArrayList(lessonTemplateTypeArrValues.length);
        for (EducationLesson.LessonTemplateType lessonTemplateType : lessonTemplateTypeArrValues) {
            arrayList.add(Integer.valueOf(lessonTemplateType.getServerValue()));
        }
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("templates");
        if (queryParameter4 != null && (listSplit$default = StringsKt.split$default((CharSequence) queryParameter4, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((String) it.next()).toString());
                if (intOrNull2 != null) {
                    arrayList2.add(intOrNull2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (arrayList.contains(Integer.valueOf(((Number) next).intValue()))) {
                    num = next;
                    break;
                }
            }
            num = num;
        }
        int serverValue = EducationLesson.LessonTemplateType.CARD_STACK.getServerValue();
        if (num != null && num.intValue() == serverValue) {
            educationLessonFragmentKeys2 = new EducationLessonFragmentKeys(queryParameter, queryParameter3);
        } else {
            educationLessonFragmentKeys2 = new EducationLessonFragmentKeys2(queryParameter, queryParameter3);
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(educationLessonFragmentKeys2, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }
}
