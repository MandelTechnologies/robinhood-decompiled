package com.robinhood.shared.education.p377ui.timeline;

import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationTimelineRow2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationTimelineRow3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTimelineRows.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toViewState", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/State;", "toViewPosition", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/Position;", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.timeline.EducationTimelineRowsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationTimelineRows {

    /* compiled from: EducationTimelineRows.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.timeline.EducationTimelineRowsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EducationTimelineRow3.values().length];
            try {
                iArr[EducationTimelineRow3.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationTimelineRow3.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EducationTimelineRow2.values().length];
            try {
                iArr2[EducationTimelineRow2.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EducationTimelineRow2.BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EducationTimelineRow2.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final RdsTimelineRowView.State toViewState(EducationTimelineRow3 educationTimelineRow3) {
        Intrinsics.checkNotNullParameter(educationTimelineRow3, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[educationTimelineRow3.ordinal()];
        if (i == 1) {
            return RdsTimelineRowView.State.COMPLETE;
        }
        if (i != 2) {
            return null;
        }
        return RdsTimelineRowView.State.INCOMPLETE;
    }

    public static final RdsTimelineRowView.Position toViewPosition(EducationTimelineRow2 educationTimelineRow2) {
        Intrinsics.checkNotNullParameter(educationTimelineRow2, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[educationTimelineRow2.ordinal()];
        if (i == 1) {
            return RdsTimelineRowView.Position.TOP;
        }
        if (i == 2) {
            return RdsTimelineRowView.Position.BETWEEN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return RdsTimelineRowView.Position.BOTTOM;
    }
}
