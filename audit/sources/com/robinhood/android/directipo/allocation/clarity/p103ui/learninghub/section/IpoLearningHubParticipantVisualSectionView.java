package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoLearningHubParticipantVisualSectionViewBinding;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: IpoLearningHubParticipantVisualSectionView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubParticipantVisualSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubParticipantVisualSectionViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubParticipantVisualSectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData$ParticipantGraphVisual;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class IpoLearningHubParticipantVisualSectionView extends Hammer_IpoLearningHubParticipantVisualSectionView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoLearningHubParticipantVisualSectionView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubParticipantVisualSectionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IpoLearningHubParticipantVisualSectionView.kt */
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
    public IpoLearningHubParticipantVisualSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, IpoLearningHubParticipantVisualSectionView2.INSTANCE);
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_learning_hub_participant_visual_section_view, true);
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

    private final MergeIpoLearningHubParticipantVisualSectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoLearningHubParticipantVisualSectionViewBinding) value;
    }

    public final void bind(IpoAccessLearningHubSectionData.ParticipantGraphVisual state, DayNightOverlay dayNightOverlay) {
        HttpUrl imageUrl;
        HttpUrl imageUrl2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        getBinding().sectionParticipantKeyTitle.setText(state.getKeyTitle());
        getBinding().sectionParticipantDescription.setText(state.getDescription());
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[dayNightOverlay.ordinal()];
        if (i == 1) {
            ImageSource light = state.getKeyImgSource().getLight();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageUrl = light.toImageUrl(context);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ImageSource dark = state.getKeyImgSource().getDark();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageUrl = dark.toImageUrl(context2);
        }
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(imageUrl);
        ImageView sectionParticipantKeyImage = getBinding().sectionParticipantKeyImage;
        Intrinsics.checkNotNullExpressionValue(sectionParticipantKeyImage, "sectionParticipantKeyImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, sectionParticipantKeyImage, null, null, 6, null);
        ThemedImageSource staticGraphImgSource = state.getStaticGraphImgSource();
        if (staticGraphImgSource != null) {
            int i2 = iArr[dayNightOverlay.ordinal()];
            if (i2 == 1) {
                ImageSource light2 = staticGraphImgSource.getLight();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                imageUrl2 = light2.toImageUrl(context3);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ImageSource dark2 = staticGraphImgSource.getDark();
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                imageUrl2 = dark2.toImageUrl(context4);
            }
            ImageLoader.ImageRequest imageRequestLoad2 = getImageLoader().load(imageUrl2);
            ImageView sectionParticipantImage = getBinding().sectionParticipantImage;
            Intrinsics.checkNotNullExpressionValue(sectionParticipantImage, "sectionParticipantImage");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad2, sectionParticipantImage, null, null, 6, null);
        }
        Double staticGraphImgAspectRatioApprox = state.getStaticGraphImgAspectRatioApprox();
        if (staticGraphImgAspectRatioApprox == null || staticGraphImgAspectRatioApprox.doubleValue() <= 0.0d) {
            return;
        }
        String heightDimensionRatioStr = IpoLearningHubLottieSectionView3.toHeightDimensionRatioStr(staticGraphImgAspectRatioApprox.doubleValue());
        ViewGroup.LayoutParams layoutParams = getBinding().sectionParticipantImage.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio = heightDimensionRatioStr;
    }

    /* compiled from: IpoLearningHubParticipantVisualSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubParticipantVisualSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubParticipantVisualSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoLearningHubParticipantVisualSectionView> {
        private final /* synthetic */ Inflater<IpoLearningHubParticipantVisualSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoLearningHubParticipantVisualSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoLearningHubParticipantVisualSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_learning_hub_participant_visual_section_view);
        }
    }
}
