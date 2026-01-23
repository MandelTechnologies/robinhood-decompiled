package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileInsightItemView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001 B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileInsightItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/accountcenter/views/InsightItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "onCardClick", "Lkotlin/Function0;", "", "getOnCardClick", "()Lkotlin/jvm/functions/Function0;", "setOnCardClick", "(Lkotlin/jvm/functions/Function0;)V", "cardView", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "iconImg", "Landroid/widget/ImageView;", "headerTxt", "Landroid/widget/TextView;", "descriptionTxt", "bind", "state", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ProfileInsightItemView extends Hammer_ProfileInsightItemView implements Bindable<InsightItem> {
    private final RdsCardView cardView;
    private final TextView descriptionTxt;
    private final TextView headerTxt;
    private final ImageView iconImg;
    public ImageLoader imageLoader;
    private Function0<Unit> onCardClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileInsightItemView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C8293R.layout.merge_profile_insight_item_view, true);
        View viewFindViewById = findViewById(C8293R.id.profile_insight_card_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RdsCardView rdsCardView = (RdsCardView) viewFindViewById;
        this.cardView = rdsCardView;
        View viewFindViewById2 = findViewById(C8293R.id.profile_insight_icon_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.iconImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C8293R.id.profile_insight_header_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.headerTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C8293R.id.profile_insight_description_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById4;
        OnClickListeners.onClick(rdsCardView, new Function0() { // from class: com.robinhood.android.accountcenter.views.ProfileInsightItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileInsightItemView._init_$lambda$0(this.f$0);
            }
        });
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

    public final Function0<Unit> getOnCardClick() {
        return this.onCardClick;
    }

    public final void setOnCardClick(Function0<Unit> function0) {
        this.onCardClick = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(ProfileInsightItemView profileInsightItemView) {
        Function0<Unit> function0 = profileInsightItemView.onCardClick;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(InsightItem state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        ImageLoader imageLoader = getImageLoader();
        SizedUrlHolder imageUrls = state.getImageUrls();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageLoader.load(imageUrls.getSizedUrl(context)).fit().error(C11222R.drawable.curated_list_error_circle_64dp).circle(), this.iconImg, null, null, 6, null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int themeColor = ThemeColors.getThemeColor(context2, C20690R.attr.colorPrimary);
        TextView textView = this.headerTxt;
        RichText title = state.getTitle();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView.setText(RichTexts.toSpannableString$default(title, context3, null, false, null, 14, null));
        TextView textView2 = this.descriptionTxt;
        RichText description = state.getDescription();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textView2.setText(RichTexts.toSpannableString$default(description, context4, Integer.valueOf(themeColor), false, null, 12, null));
    }

    /* compiled from: ProfileInsightItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileInsightItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/ProfileInsightItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProfileInsightItemView> {
        private final /* synthetic */ Inflater<ProfileInsightItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProfileInsightItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProfileInsightItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_profile_insight_item_view);
        }
    }
}
