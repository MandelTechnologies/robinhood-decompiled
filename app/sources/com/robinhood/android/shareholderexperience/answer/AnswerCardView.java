package com.robinhood.android.shareholderexperience.answer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.answer.AnswerListItem;
import com.robinhood.android.shareholderexperience.databinding.MergeAnswerCardViewBinding;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: AnswerCardView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Answer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/MergeAnswerCardViewBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/MergeAnswerCardViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "toggleAnswerImageViews", "show", "", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AnswerCardView extends Hammer_AnswerCardView implements Bindable<AnswerListItem.Answer> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnswerCardView.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/MergeAnswerCardViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AnswerCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28477R.layout.merge_answer_card_view, true);
        this.binding = ViewBinding5.viewBinding(this, AnswerCardView2.INSTANCE);
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

    private final MergeAnswerCardViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAnswerCardViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(AnswerListItem.Answer state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeAnswerCardViewBinding binding = getBinding();
        binding.answerCardAnswererName.setText(state.getAnswer().getName());
        binding.answerCardAnswererPosition.setText(state.getAnswer().getPosition());
        RhTextView rhTextView = binding.answerCardAnswerText;
        RichText text = state.getAnswer().getText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rhTextView.setText(IconExtensions.toSpannableString$default(text, context, Integer.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorForeground1)), false, null, 12, null));
        binding.answerCardContainer.setBackgroundResource(state.getPosition().getBgDrawableRes());
        if (state.getAnswer().getImage() == null) {
            toggleAnswerImageViews(false);
            return;
        }
        ImageLoader imageLoader = getImageLoader();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String image = state.getAnswer().getImage();
        Intrinsics.checkNotNull(image);
        ImageLoader.ImageRequest imageRequestCircle = imageLoader.load(companion.get(image)).circle();
        ImageView answerCardAnswererImage = binding.answerCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(answerCardAnswererImage, "answerCardAnswererImage");
        imageRequestCircle.into(answerCardAnswererImage, new Function0() { // from class: com.robinhood.android.shareholderexperience.answer.AnswerCardView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerCardView.bind$lambda$2$lambda$0(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.shareholderexperience.answer.AnswerCardView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerCardView.bind$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$0(AnswerCardView answerCardView) {
        answerCardView.toggleAnswerImageViews(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(AnswerCardView answerCardView) {
        answerCardView.toggleAnswerImageViews(false);
        return Unit.INSTANCE;
    }

    private final void toggleAnswerImageViews(boolean show) {
        MergeAnswerCardViewBinding binding = getBinding();
        ImageView answerCardAnswererImage = binding.answerCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(answerCardAnswererImage, "answerCardAnswererImage");
        answerCardAnswererImage.setVisibility(show ? 0 : 8);
        View answerCardAnswererImageBorder = binding.answerCardAnswererImageBorder;
        Intrinsics.checkNotNullExpressionValue(answerCardAnswererImageBorder, "answerCardAnswererImageBorder");
        answerCardAnswererImageBorder.setVisibility(show ? 0 : 8);
    }

    /* compiled from: AnswerCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AnswerCardView> {
        private final /* synthetic */ Inflater<AnswerCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AnswerCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AnswerCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28477R.layout.include_answer_card_view);
        }
    }
}
