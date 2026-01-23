package com.robinhood.android.safetylabels.p247ui;

import com.robinhood.android.safetylabels.p247ui.SafetyLabelsLessonDataState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLesson;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SafetyLabelsLessonStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonViewState;", "<init>", "()V", "reduce", "dataState", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SafetyLabelsLessonStateProvider implements StateProvider<SafetyLabelsLessonDataState, SafetyLabelsLessonViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SafetyLabelsLessonViewState reduce(SafetyLabelsLessonDataState dataState) {
        List<SafetyLabelsLessonSection> listEmptyList;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SafetyLabelsLessonDataState.Status status = dataState.getStatus();
        boolean z = status instanceof SafetyLabelsLessonDataState.Status.Loading;
        boolean z2 = status instanceof SafetyLabelsLessonDataState.Status.Failure;
        boolean z3 = status instanceof SafetyLabelsLessonDataState.Status.Success;
        SafetyLabelsLessonDataState.Status.Success success = z3 ? (SafetyLabelsLessonDataState.Status.Success) status : null;
        SafetyLabelsLesson lesson = success != null ? success.getLesson() : null;
        String delimiter = lesson != null ? lesson.getDelimiter() : null;
        if (lesson == null || (listEmptyList = lesson.getSections()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<SafetyLabelsLessonSection> list = listEmptyList;
        String identifier = lesson != null ? lesson.getIdentifier() : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SafetyLabelsLessonSection.Header) {
                arrayList.add(obj);
            }
        }
        SafetyLabelsLessonSection.Header header = (SafetyLabelsLessonSection.Header) CollectionsKt.firstOrNull((List) arrayList);
        String title = header != null ? header.getTitle() : null;
        MarkdownContent expandedDisclosure = lesson != null ? lesson.getExpandedDisclosure() : null;
        MarkdownContent collapsedDisclosure = lesson != null ? lesson.getCollapsedDisclosure() : null;
        boolean z4 = false;
        boolean z5 = (expandedDisclosure == null && collapsedDisclosure == null) ? false : true;
        if (expandedDisclosure != null && collapsedDisclosure != null) {
            z4 = true;
        }
        return new SafetyLabelsLessonViewState(dataState.getExpandDisclosure(), z, z2, z3, delimiter, list, identifier, title, z4, (!z5 || z4 ? !dataState.getExpandDisclosure() : expandedDisclosure == null) ? collapsedDisclosure : expandedDisclosure);
    }
}
