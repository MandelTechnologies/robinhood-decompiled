package com.robinhood.shared.education.p377ui.lessons.standard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: EducationLessonStandardHeaderAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "<init>", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "DiffCallback", "HeaderViewType", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationLessonStandardHeaderAdapter extends ListAdapter<EducationLessonStandardHeaderData2, SimpleViewHolder> {
    public static final int $stable = 8;
    private final ImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardHeaderAdapter(ImageLoader imageLoader) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.imageLoader = imageLoader;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        HeaderViewType headerViewType;
        EducationLessonStandardHeaderData2 item = getItem(position);
        if (item instanceof EducationLessonStandardHeaderData2.Image) {
            headerViewType = HeaderViewType.IMAGE;
        } else {
            if (!(item instanceof EducationLessonStandardHeaderData2.Animation)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
                throw new ExceptionsH();
            }
            headerViewType = HeaderViewType.ANIMATION;
        }
        return headerViewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate$default;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == HeaderViewType.IMAGE.ordinal()) {
            viewInflate$default = ViewGroups.inflate$default(parent, C38790R.layout.include_education_lesson_standard_header_section_image, false, 2, null);
        } else if (viewType == HeaderViewType.ANIMATION.ordinal()) {
            viewInflate$default = ViewGroups.inflate$default(parent, C38790R.layout.include_education_lesson_standard_header_section_animation, false, 2, null);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        return new SimpleViewHolder(viewInflate$default);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        EducationLessonStandardHeaderData2 item = getItem(position);
        if (item instanceof EducationLessonStandardHeaderData2.Image) {
            ImageLoader.ImageRequest.DefaultImpls.into$default(this.imageLoader.load(HttpUrl.INSTANCE.get(((EducationLessonStandardHeaderData2.Image) item).getAssetUrl())).fit().centerInside(), (ImageView) itemView, null, null, 6, null);
        } else {
            if (!(item instanceof EducationLessonStandardHeaderData2.Animation)) {
                throw new NoWhenBranchMatchedException();
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) itemView;
            lottieAnimationView.setAnimationFromUrl(((EducationLessonStandardHeaderData2.Animation) item).getAssetUrl());
            lottieAnimationView.playAnimation();
        }
    }

    /* compiled from: EducationLessonStandardHeaderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<EducationLessonStandardHeaderData2> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(EducationLessonStandardHeaderData2 oldItem, EducationLessonStandardHeaderData2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(EducationLessonStandardHeaderData2 oldItem, EducationLessonStandardHeaderData2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof EducationLessonStandardHeaderData2.Animation) && (newItem instanceof EducationLessonStandardHeaderData2.Animation)) {
                return Intrinsics.areEqual(((EducationLessonStandardHeaderData2.Animation) oldItem).getAssetUrl(), ((EducationLessonStandardHeaderData2.Animation) newItem).getAssetUrl());
            }
            if ((oldItem instanceof EducationLessonStandardHeaderData2.Image) && (newItem instanceof EducationLessonStandardHeaderData2.Image)) {
                return Intrinsics.areEqual(((EducationLessonStandardHeaderData2.Image) oldItem).getAssetUrl(), ((EducationLessonStandardHeaderData2.Image) newItem).getAssetUrl());
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationLessonStandardHeaderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderAdapter$HeaderViewType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "ANIMATION", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HeaderViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HeaderViewType[] $VALUES;
        public static final HeaderViewType IMAGE = new HeaderViewType("IMAGE", 0);
        public static final HeaderViewType ANIMATION = new HeaderViewType("ANIMATION", 1);

        private static final /* synthetic */ HeaderViewType[] $values() {
            return new HeaderViewType[]{IMAGE, ANIMATION};
        }

        public static EnumEntries<HeaderViewType> getEntries() {
            return $ENTRIES;
        }

        private HeaderViewType(String str, int i) {
        }

        static {
            HeaderViewType[] headerViewTypeArr$values = $values();
            $VALUES = headerViewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(headerViewTypeArr$values);
        }

        public static HeaderViewType valueOf(String str) {
            return (HeaderViewType) Enum.valueOf(HeaderViewType.class, str);
        }

        public static HeaderViewType[] values() {
            return (HeaderViewType[]) $VALUES.clone();
        }
    }
}
