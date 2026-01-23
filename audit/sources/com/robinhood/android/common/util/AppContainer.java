package com.robinhood.android.common.util;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppContainer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/util/AppContainer;", "", "setRoot", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "contentLayoutId", "", "findContentFrame", "Landroid/widget/FrameLayout;", "findRoot", "Landroid/view/View;", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AppContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    FrameLayout findContentFrame(BaseActivity activity);

    View findRoot(BaseActivity activity);

    void setRoot(BaseActivity activity, int contentLayoutId);

    /* compiled from: AppContainer.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/util/AppContainer$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/robinhood/android/common/util/AppContainer;", "getDEFAULT", "()Lcom/robinhood/android/common/util/AppContainer;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AppContainer DEFAULT = new AppContainer() { // from class: com.robinhood.android.common.util.AppContainer$Companion$DEFAULT$1
            @Override // com.robinhood.android.common.util.AppContainer
            public void setRoot(BaseActivity activity, int contentLayoutId) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.setContentViewFromAppContainer(C11048R.layout.app_container_frame_with_banner);
                LayoutInflater.from(activity).inflate(contentLayoutId, findContentFrame(activity));
            }

            @Override // com.robinhood.android.common.util.AppContainer
            public FrameLayout findContentFrame(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                View viewFindViewById = activity.findViewById(C11048R.id.app_content_frame);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                return (FrameLayout) viewFindViewById;
            }

            @Override // com.robinhood.android.common.util.AppContainer
            public View findRoot(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                View childAt = findContentFrame(activity).getChildAt(0);
                if (childAt != null) {
                    return childAt;
                }
                throw new IllegalStateException("Content view not set!");
            }
        };

        private Companion() {
        }

        public final AppContainer getDEFAULT() {
            return DEFAULT;
        }
    }
}
