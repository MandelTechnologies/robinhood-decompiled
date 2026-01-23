package com.robinhood.android.welcome.p276gb;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.api.swipeycontent.SwipeyContent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.android.welcome.databinding.FragmentWelcomeFeatureGbBinding;
import com.robinhood.android.welcome.databinding.IncludeMaxWelcomeBottomSheetBinding;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WelcomeFeatureFragmentGb.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFeatureFragmentGb;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureGbBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureGbBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WelcomeFeatureFragmentGb extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeFeatureFragmentGb.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureGbBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    private final String screenTag;
    private final boolean toolbarVisible;

    public WelcomeFeatureFragmentGb() {
        super(C31456R.layout.fragment_welcome_feature_gb);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
        this.binding = ViewBinding5.viewBinding(this, WelcomeFeatureFragmentGb2.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return this.screenTag;
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

    private final FragmentWelcomeFeatureGbBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeFeatureGbBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        SwipeyContent swipeyContent = ((Args) companion.getArgs((Fragment) this)).getSwipeyContent();
        if (swipeyContent == null) {
            getBinding().welcomeFeatureImage.setImageResource(((Args) companion.getArgs((Fragment) this)).getPage().getImageRes());
        } else {
            ImageSource sweepRateAssetUrl = swipeyContent.getSweepRateAssetUrl();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(UtilKt.toImageUrl(sweepRateAssetUrl, context));
            ImageView welcomeFeatureImage = getBinding().welcomeFeatureImage;
            Intrinsics.checkNotNullExpressionValue(welcomeFeatureImage, "welcomeFeatureImage");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, welcomeFeatureImage, null, null, 6, null);
        }
        getBinding().welcomeFeatureTopHalf.setBackgroundColor(ContextCompat.getColor(view.getContext(), ((Args) companion.getArgs((Fragment) this)).getPage().getBackgroundColorRes()));
        IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding = getBinding().welcomeFeatureBottomSheet;
        if (swipeyContent == null) {
            includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureTitle.setText(((Args) companion.getArgs((Fragment) this)).getPage().getTitleRes());
            includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureSubtitle.setText(((Args) companion.getArgs((Fragment) this)).getPage().getSubtitleRes());
        } else {
            RhTextView rhTextView = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureTitle;
            RichText sweepRateTitle = swipeyContent.getSweepRateTitle();
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            rhTextView.setText(IconExtensions.toSpannableString$default(sweepRateTitle, context2, null, true, null, 10, null));
            RhTextView rhTextView2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureSubtitle;
            RichText sweepRateSubtitle = swipeyContent.getSweepRateSubtitle();
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            rhTextView2.setText(IconExtensions.toSpannableString$default(sweepRateSubtitle, context3, null, true, null, 10, null));
        }
        RhTextView maxWelcomeFeatureDisclosure = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure, "maxWelcomeFeatureDisclosure");
        maxWelcomeFeatureDisclosure.setVisibility(((Args) companion.getArgs((Fragment) this)).getPage().getDisclosureRes() != null ? 0 : 8);
        RhTextView maxWelcomeFeatureDisclosure2 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure2, "maxWelcomeFeatureDisclosure");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(maxWelcomeFeatureDisclosure2, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Integer disclosureRes = ((Args) companion.getArgs((Fragment) this)).getPage().getDisclosureRes();
        if (disclosureRes != null) {
            int iIntValue = disclosureRes.intValue();
            RhTextView rhTextView3 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView3.setText(HtmlCompat2.fromHtml$default(resources, iIntValue, 0, 2, null));
            RhTextView maxWelcomeFeatureDisclosure3 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
            Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure3, "maxWelcomeFeatureDisclosure");
            TextViewsKt.setTextAppearanceAttr(maxWelcomeFeatureDisclosure3, C20690R.attr.textAppearanceRegularMedium);
        }
    }

    /* compiled from: WelcomeFeatureFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFeatureFragmentGb$Args;", "Landroid/os/Parcelable;", "page", "Lcom/robinhood/android/welcome/gb/WelcomePageGb;", "swipeyContent", "Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "<init>", "(Lcom/robinhood/android/welcome/gb/WelcomePageGb;Lcom/robinhood/android/api/swipeycontent/SwipeyContent;)V", "getPage", "()Lcom/robinhood/android/welcome/gb/WelcomePageGb;", "getSwipeyContent", "()Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final WelcomePageGb page;
        private final SwipeyContent swipeyContent;

        /* compiled from: WelcomeFeatureFragmentGb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(WelcomePageGb.CREATOR.createFromParcel(parcel), (SwipeyContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, WelcomePageGb welcomePageGb, SwipeyContent swipeyContent, int i, Object obj) {
            if ((i & 1) != 0) {
                welcomePageGb = args.page;
            }
            if ((i & 2) != 0) {
                swipeyContent = args.swipeyContent;
            }
            return args.copy(welcomePageGb, swipeyContent);
        }

        /* renamed from: component1, reason: from getter */
        public final WelcomePageGb getPage() {
            return this.page;
        }

        /* renamed from: component2, reason: from getter */
        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }

        public final Args copy(WelcomePageGb page, SwipeyContent swipeyContent) {
            Intrinsics.checkNotNullParameter(page, "page");
            return new Args(page, swipeyContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.page == args.page && Intrinsics.areEqual(this.swipeyContent, args.swipeyContent);
        }

        public int hashCode() {
            int iHashCode = this.page.hashCode() * 31;
            SwipeyContent swipeyContent = this.swipeyContent;
            return iHashCode + (swipeyContent == null ? 0 : swipeyContent.hashCode());
        }

        public String toString() {
            return "Args(page=" + this.page + ", swipeyContent=" + this.swipeyContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.page.writeToParcel(dest, flags);
            dest.writeParcelable(this.swipeyContent, flags);
        }

        public Args(WelcomePageGb page, SwipeyContent swipeyContent) {
            Intrinsics.checkNotNullParameter(page, "page");
            this.page = page;
            this.swipeyContent = swipeyContent;
        }

        public final WelcomePageGb getPage() {
            return this.page;
        }

        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }
    }

    /* compiled from: WelcomeFeatureFragmentGb.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFeatureFragmentGb$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/welcome/gb/WelcomeFeatureFragmentGb;", "Lcom/robinhood/android/welcome/gb/WelcomeFeatureFragmentGb$Args;", "<init>", "()V", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeFeatureFragmentGb, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WelcomeFeatureFragmentGb welcomeFeatureFragmentGb) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeFeatureFragmentGb);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeFeatureFragmentGb newInstance(Args args) {
            return (WelcomeFeatureFragmentGb) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeFeatureFragmentGb welcomeFeatureFragmentGb, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeFeatureFragmentGb, args);
        }
    }
}
