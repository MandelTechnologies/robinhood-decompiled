package com.robinhood.android.resumeapplication;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResumeApplicationTimelineRowView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \n*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationTimelineRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dashView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "pogView", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "titleTextView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "subtitleTextView", "value", "Landroid/graphics/drawable/Drawable;", "pictogram", "getPictogram", "()Landroid/graphics/drawable/Drawable;", "setPictogram", "(Landroid/graphics/drawable/Drawable;)V", "", "titleText", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "subtitleText", "getSubtitleText", "setSubtitleText", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ResumeApplicationTimelineRowView extends ConstraintLayout {
    public static final int $stable = 8;
    private final View dashView;
    private boolean isCompleted;
    private final RdsPogView pogView;
    private final RhTextView subtitleTextView;
    private final RhTextView titleTextView;

    public /* synthetic */ ResumeApplicationTimelineRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResumeApplicationTimelineRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C26935R.layout.merge_resume_application_timeline_row, this);
        this.dashView = findViewById(C26935R.id.dash);
        this.pogView = (RdsPogView) findViewById(C26935R.id.main_pog);
        this.titleTextView = (RhTextView) findViewById(C26935R.id.title_text);
        this.subtitleTextView = (RhTextView) findViewById(C26935R.id.subtitle_text);
        this.isCompleted = true;
        int[] ResumeApplicationTimelineRowView = C26935R.styleable.ResumeApplicationTimelineRowView;
        Intrinsics.checkNotNullExpressionValue(ResumeApplicationTimelineRowView, "ResumeApplicationTimelineRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ResumeApplicationTimelineRowView, 0, 0);
        setPictogram(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C26935R.styleable.ResumeApplicationTimelineRowView_pictogram));
        setTitleText(typedArrayObtainStyledAttributes.getString(C26935R.styleable.ResumeApplicationTimelineRowView_titleText));
        setSubtitleText(typedArrayObtainStyledAttributes.getString(C26935R.styleable.ResumeApplicationTimelineRowView_subtitleText));
        setCompleted(typedArrayObtainStyledAttributes.getBoolean(C26935R.styleable.ResumeApplicationTimelineRowView_isCompleted, this.isCompleted));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Drawable getPictogram() {
        return this.pogView.getPictogram();
    }

    public final void setPictogram(Drawable drawable) {
        this.pogView.setPictogram(drawable);
    }

    public final CharSequence getTitleText() {
        return this.titleTextView.getText();
    }

    public final void setTitleText(CharSequence charSequence) {
        this.titleTextView.setText(charSequence);
    }

    public final CharSequence getSubtitleText() {
        return this.subtitleTextView.getText();
    }

    public final void setSubtitleText(CharSequence charSequence) {
        this.subtitleTextView.setText(charSequence);
        RhTextView subtitleTextView = this.subtitleTextView;
        Intrinsics.checkNotNullExpressionValue(subtitleTextView, "subtitleTextView");
        subtitleTextView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final void setCompleted(boolean z) {
        if (!z) {
            View view = this.dashView;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3Inverse));
            OneShotPreDrawListener.add(this, new Runnable() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationTimelineRowView$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    RdsPogView rdsPogView = this.pogView;
                    Context context2 = this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    rdsPogView.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorForeground3Inverse)));
                }
            });
        }
        this.isCompleted = z;
    }
}
