package com.robinhood.shared.education.p377ui.overview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationOverviewItemBinding;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationOverviewItemView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewItemView;", "Landroidx/cardview/widget/CardView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "state", "bindings", "Lcom/robinhood/shared/education/databinding/MergeEducationOverviewItemBinding;", "getBindings", "()Lcom/robinhood/shared/education/databinding/MergeEducationOverviewItemBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "onAttachedToWindow", "", "bind", "refreshColors", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationOverviewItemView extends Hammer_EducationOverviewItemView implements Bindable<EducationLessonPreview> {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private DayNightOverlay dayNightOverlay;
    public ImageLoader imageLoader;
    private EducationLessonPreview state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationOverviewItemView.class, "bindings", "getBindings()Lcom/robinhood/shared/education/databinding/MergeEducationOverviewItemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EducationOverviewItemView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationOverviewItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_overview_item, true);
        this.bindings = ViewBinding5.viewBinding(this, EducationOverviewItemView2.INSTANCE);
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
        DayNightOverlay dayNightOverlay = DayNightOverlay.NIGHT;
        this.dayNightOverlay = scarletManager.contains(dayNightOverlay) ? dayNightOverlay : DayNightOverlay.DAY;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final MergeEducationOverviewItemBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationOverviewItemBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewItemView.onAttachedToWindow$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(EducationOverviewItemView educationOverviewItemView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        educationOverviewItemView.dayNightOverlay = it;
        educationOverviewItemView.refreshColors();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(EducationLessonPreview state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        getBindings().educationOverviewListItemTitle.setText(state.getTitle());
        getBindings().educationOverviewListItemSubtitle.setText(state.getSubtitle());
        refreshColors();
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(state.getPreviewLargeImageUrl());
        ImageView educationOverviewListItemImage = getBindings().educationOverviewListItemImage;
        Intrinsics.checkNotNullExpressionValue(educationOverviewListItemImage, "educationOverviewListItemImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, educationOverviewListItemImage, null, null, 6, null);
    }

    private final void refreshColors() {
        int dayBackgroundColor;
        int dayForegroundColor;
        DayNightOverlay dayNightOverlay = this.dayNightOverlay;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[dayNightOverlay.ordinal()];
        Drawable drawableMutate = null;
        if (i == 1) {
            EducationLessonPreview educationLessonPreview = this.state;
            if (educationLessonPreview == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                educationLessonPreview = null;
            }
            dayBackgroundColor = educationLessonPreview.getDayBackgroundColor();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EducationLessonPreview educationLessonPreview2 = this.state;
            if (educationLessonPreview2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                educationLessonPreview2 = null;
            }
            dayBackgroundColor = educationLessonPreview2.getNightBackgroundColor();
        }
        setCardBackgroundColor(dayBackgroundColor);
        int i2 = iArr[this.dayNightOverlay.ordinal()];
        if (i2 == 1) {
            EducationLessonPreview educationLessonPreview3 = this.state;
            if (educationLessonPreview3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                educationLessonPreview3 = null;
            }
            dayForegroundColor = educationLessonPreview3.getDayForegroundColor();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EducationLessonPreview educationLessonPreview4 = this.state;
            if (educationLessonPreview4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                educationLessonPreview4 = null;
            }
            dayForegroundColor = educationLessonPreview4.getNightForegroundColor();
        }
        RhTextView rhTextView = getBindings().educationOverviewListItemTitle;
        rhTextView.setTextColor(dayForegroundColor);
        EducationLessonPreview educationLessonPreview5 = this.state;
        if (educationLessonPreview5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            educationLessonPreview5 = null;
        }
        if (educationLessonPreview5.isChecked()) {
            Intrinsics.checkNotNull(rhTextView);
            drawableMutate = ViewsKt.getDrawable(rhTextView, C20690R.drawable.ic_rds_bubble_checked_16dp).mutate();
        }
        Drawable drawable = drawableMutate;
        if (drawable != null) {
            drawable.setTint(dayForegroundColor);
        }
        Intrinsics.checkNotNull(rhTextView);
        TextViewsKt.setDrawables$default((TextView) rhTextView, (Drawable) null, (Drawable) null, drawable, (Drawable) null, true, 11, (Object) null);
        getBindings().educationOverviewListItemSubtitle.setTextColor(dayForegroundColor);
        getBindings().educationOverviewListItemArrow.setImageTintList(ColorStateList.valueOf(dayForegroundColor));
    }

    /* compiled from: EducationOverviewItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationOverviewItemView> {
        private final /* synthetic */ Inflater<EducationOverviewItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationOverviewItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationOverviewItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C38790R.layout.include_education_overview_item);
        }
    }
}
